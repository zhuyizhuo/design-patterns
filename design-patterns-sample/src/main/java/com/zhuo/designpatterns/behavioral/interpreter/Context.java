package com.zhuo.designpatterns.behavioral.interpreter;

import java.util.HashMap;
import java.util.Map;

/**
 * 上下文（环境）角色，使用HashMap来存储变量对应的数值
 * @author zhuo
 */
public class Context {
    private Map<Variable,Integer> valueMap = new HashMap();

    public void addValue(Variable x, Integer y) {
        valueMap.put(x, y);
    }

    public int LookupValue(Variable x) {
        return valueMap.get(x).intValue();
    }
}
