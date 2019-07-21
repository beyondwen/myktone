package com.wenhao.mykt.myktone.strategy.impl;

import com.wenhao.mykt.myktone.strategy.PayStrategy;
import org.springframework.stereotype.Component;

/**
 * 微信支付策略实现类
 */
@Component
public class MiPayStrategy implements PayStrategy {
    public String toPay() {
        return "调用小米支付";
    }
}
