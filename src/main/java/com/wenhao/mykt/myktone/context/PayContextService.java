package com.wenhao.mykt.myktone.context;


import com.wenhao.mykt.myktone.mapper.PaymentChannelMapper;
import com.wenhao.mykt.myktone.mapper.enity.PaymentChannelEntity;
import com.wenhao.mykt.myktone.strategy.PayStrategy;
import com.wenhao.mykt.myktone.utils.SpringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PayContextService {

    @Autowired
    private PaymentChannelMapper paymentChannelMapper;
    @Autowired
    private SpringUtils springUtils;

    @GetMapping("/toPay")
    public String toPay(String payCode) {
        if (StringUtils.isEmpty(payCode)) {
            return "支付渠道不能为空";
        }
        PaymentChannelEntity paymentChannel = paymentChannelMapper.getPaymentChannel(payCode);
        if (paymentChannel == null) {
            return "未找到支付渠道";
        }
        //获取beanId
        String beanId = paymentChannel.getStrategyBeanId();
        //生产对应的对象
        PayStrategy payStrategy = springUtils.getBean(beanId, PayStrategy.class);
        //调用方法
        return payStrategy.toPay();
    }

}
