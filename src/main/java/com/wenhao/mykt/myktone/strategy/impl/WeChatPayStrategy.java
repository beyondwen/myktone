package com.wenhao.mykt.myktone.strategy.impl;

import com.wenhao.mykt.myktone.strategy.PayStrategy;
import org.springframework.stereotype.Component;

/**
 * 微信支付策略实现类
 */
@Component
public class WeChatPayStrategy implements PayStrategy {
    public String toPay() {
        return "调用微信接口";
    }
}
