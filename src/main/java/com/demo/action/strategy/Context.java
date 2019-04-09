package com.demo.action.strategy;

/**
 * @Description: 策略模式调度
 * @Author: jww
 * @CreateDate: 2019/4/9 13:33
 */
public class Context {
    Istrategy istrategy;
    public Context(Istrategy istrategy)
    {
        this.istrategy = istrategy;
    }

    public int execStrategy(int num1,int num2)
    {
        return istrategy.doOperation(num1,num2);
    }
}
