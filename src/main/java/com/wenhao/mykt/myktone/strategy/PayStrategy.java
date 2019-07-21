package com.wenhao.mykt.myktone.strategy;

/**
 * 公共策略方法
 */
public interface PayStrategy {

    /**
     * 支付方式
     *
     * @return 支付调用逻辑
     */
    String toPay();
}
