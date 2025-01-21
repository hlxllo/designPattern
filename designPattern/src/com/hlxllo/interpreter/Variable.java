package com.hlxllo.interpreter;

import java.util.Objects;

/**
 * @author hlxllo
 * @description 封装变量的类
 * @date 2025/1/21
 */
public class Variable extends AbstractExpression{

    // 变量名
    private final String name;

    public Variable(String name) {
        this.name = name;
    }

    @Override
    public int interpret(Context context) {
        return context.getValue(this);
    }

    @Override
    public String toString() {
        return name;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Variable variable = (Variable) o;
        return Objects.equals(name, variable.name);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(name);
    }
}
