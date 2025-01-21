package com.hlxllo.interpreter;

/**
 * @author hlxllo
 * @description
 * @date 2025/1/21
 */
public class Client {
    public static void main(String[] args) {
        Context context = new Context();
        Variable a = new Variable("a");
        Variable b = new Variable("b");
        Variable c = new Variable("c");
        Variable d = new Variable("d");
        context.assign(a, 1);
        context.assign(b, 2);
        context.assign(c, 3);
        context.assign(d, 4);
        // 获取抽象语法树 a + b - c + d
        AbstractExpression expression = new Plus(new Minus(new Plus(a, b), c), d);
        int result = expression.interpret(context);
        System.out.println(expression + " = " + result);
    }
}
