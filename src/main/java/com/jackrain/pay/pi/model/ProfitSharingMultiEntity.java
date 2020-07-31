package com.jackrain.pay.pi.model;

import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import lombok.Data;

import java.util.HashMap;
import java.util.Map;

/**
 *
 *
 *
 * @author: z.c
 * @since: 2019/11/25
 * create at : 2019/11/25 11:12 AM
 *
 */
@Data
public class ProfitSharingMultiEntity extends PiPayEntity {

    private String customerId;
    private String payChannel;

    private String tradeNo;
    private String outTradeNo;

    private String outOrderNo;

    /**
     * 分账接收方对象，json格式
     */
    private JSONArray receivers;

    public Map<String,String> toMap(){
        Map<String,String> map = new HashMap<>();
        map.put("customer_id",getCustomerId());
        map.put("pay_channel",getPayChannel());
        map.put("pay_way",getPayWay());
        map.put("trade_no",getTradeNo());
        map.put("out_trade_no",getOutTradeNo());
        map.put("out_order_no",getOutOrderNo());
        map.put("receivers",getReceivers().toJSONString());

        return map;
    }

    public JSONObject toJSONObject(){

        JSONObject paramObject = new JSONObject();
        paramObject.put("customer_id",getCustomerId());
        paramObject.put("pay_channel",getPayChannel());
        paramObject.put("pay_way",getPayWay());
        paramObject.put("trade_no",getTradeNo());
        paramObject.put("out_trade_no",getOutTradeNo());
        paramObject.put("out_order_no",getOutOrderNo());
        paramObject.put("receivers",getReceivers());

        //
        JSONObject jsonObject = new JSONObject();
        jsonObject.put("developer_id",getDeveloperId());
        jsonObject.put("timestamp",getTimestamp());
        jsonObject.put("sign",getSign());
        //
        jsonObject.put("param",paramObject);

        return jsonObject;
    }
}
