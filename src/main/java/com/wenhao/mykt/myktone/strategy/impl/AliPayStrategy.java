package com.wenhao.mykt.myktone.strategy.impl;

import com.wenhao.mykt.myktone.strategy.PayStrategy;
import org.springframework.stereotype.Component;

/**
 * 支付宝策略实现类
 */
@Component
public class AliPayStrategy implements PayStrategy {
    public String toPay() {
        return "调用支付宝接口";
    }
}
