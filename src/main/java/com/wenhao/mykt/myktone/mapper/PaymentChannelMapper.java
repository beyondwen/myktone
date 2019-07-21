package com.wenhao.mykt.myktone.mapper;

import com.wenhao.mykt.myktone.mapper.enity.PaymentChannelEntity;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

/**
 * 通过数据库查询对应的class类
 */
@Repository
public interface PaymentChannelMapper {

    @Select("SELECT id as id,CHANNEL_NAME as CHANNELNAME,CHANNEL_ID as CHANNELID,strategy_bean_id AS strategybeanid FROM payment_channel where CHANNEL_ID=#{payCode}")
    PaymentChannelEntity getPaymentChannel(String payCode);
}
