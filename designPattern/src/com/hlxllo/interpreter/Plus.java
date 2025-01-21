package com.hlxllo.interpreter;

/**
 * @author hlxllo
 * @description 加法表达式类
 * @date 2025/1/21
 */
public class Plus extends AbstractExpression{
    // +号两边的表达式
    private final AbstractExpression left;
    private final AbstractExpression right;

    public Plus(AbstractExpression left, AbstractExpression right) {
        this.left = left;
        this.right = right;
    }

    @Override
    public int interpret(Context context) {
        // 将左右两边相加后返回
        return left.interpret(context) + right.interpret(context);
    }

    @Override
    public String toString() {
        return "(" + left.toString() + "+" + right.toString() + ")";
    }
}
