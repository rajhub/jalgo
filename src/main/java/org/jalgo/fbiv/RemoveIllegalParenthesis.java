package org.jalgo.fbiv;

import java.util.Stack;

public class RemoveIllegalParenthesis {

    public static String remove(String str) {
        Stack<String> stack = new Stack<String>();
        int count = 0;

        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == '(' && stack.isEmpty()) {
                stack.push("(");
                continue;
            }

            if (str.charAt(i) == ')' && !stack.isEmpty()) {
                stack.pop();
                count++;
            }
        }

        StringBuffer sb = new StringBuffer();

        for (int j = 1; j <= count; j++)
            sb.append("()");

        return sb.toString();
    }

    public static void main(String[] args) {
        System.out.println(remove("()"));
        System.out.println(remove("(()"));
        System.out.println(remove(")))((("));
        System.out.println(remove("(())"));
        System.out.println(remove("()(()"));
    }
}
