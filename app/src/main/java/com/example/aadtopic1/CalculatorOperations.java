package com.example.aadtopic1;

import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

public class CalculatorOperations {


    private static Stack<Character> operationStack = new Stack<>();
    private static Stack<Double> optStack = new Stack<>();
    private static Map<Character, Integer> operationMap = new HashMap<>();

    static {
        operationMap.put('-', 1);
        operationMap.put('+', 1);
        operationMap.put('*', 2);
        operationMap.put('/', 3);
        operationMap.put('%', 4);
    }

    public static String operationsCalc(String expression) {
        int nextChar = 0;
        double oldOpt = 0;
        while (nextChar < expression.length()) {
            char ch = expression.charAt(nextChar);
            if (operationMap.containsKey(ch)) {
                oldOpt = 0;
                if (operationStack.isEmpty()) {
                    operationStack.push(ch);
                    nextChar++;
                } else {
                    int optPrecedence;
                    try {
                        optPrecedence = operationMap.get(operationStack.peek());    // old
                    } catch (NullPointerException e) {
                        optPrecedence = 0;
                    }
                    int chPrecedence = operationMap.get(ch);  // current
                    if (chPrecedence > optPrecedence) {
                        operationStack.push(ch);
                        nextChar++;
                    } else {
                        popOperatePush();
                    }
                }
            } else if (ch == '(') {
                oldOpt = 0;
                operationStack.push(ch);
                nextChar++;
            } else if (ch == ')') {
                oldOpt = 0;
                while (operationStack.peek() != '(')
                    popOperatePush();

                operationStack.pop();
                nextChar++;
            } else {
                if (oldOpt != 0) {
                    optStack.push(optStack.pop() * 10 + Double.parseDouble(String.valueOf(ch)));
                } else {
                    optStack.push(Double.parseDouble(String.valueOf(ch)));
                }
                oldOpt = optStack.peek();
                nextChar++;
            }
        }

        while (operationStack.size() != 0)
            popOperatePush();

        return String.valueOf((int)Math.floor(optStack.peek()));
    }

    private static void popOperatePush() {
        double num2 = optStack.pop();
        char operator = operationStack.pop();
        double num1 = optStack.pop();
        double finalValue;

        switch (operator) {
            case '+':
                finalValue = num1 + num2;
                break;
            case '-':
                finalValue = num1 - num2;
                break;
            case '*':
                finalValue = num1 * num2;
                break;
            case '/':
                finalValue = num1 / num2;
                break;
            case '%':
                finalValue = num1 % num2;
                break;
            default:
                finalValue = 0;
                break;
        }

        optStack.push(finalValue);
    }

    public static void main(String[] args) {
        System.out.println(operationsCalc("1+2"));
    }
}
