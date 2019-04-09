package com.demo.action.strategy;

/**
 * @Description:
 * @Author: jww
 * @CreateDate: 2019/4/9 13:32
 */
public class OperationMultiply implements Istrategy {
    @Override
    public int doOperation(int num1, int num2) {
        return num1 * num2;
    }
}
