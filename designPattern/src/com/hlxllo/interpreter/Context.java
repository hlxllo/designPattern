package com.hlxllo.interpreter;

import java.util.HashMap;
import java.util.Map;

/**
 * @author hlxllo
 * @description 环境角色类
 * @date 2025/1/21
 */
public class Context {

    private final Map<Variable, Integer> map = new HashMap<>();

    // 添加变量
    public void assign(Variable var, int value) {
        map.put(var, value);
    }

    // 获取变量的值
    public int getValue(Variable var) {
        return map.get(var);
    }
}
