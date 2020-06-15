package com.jackrain.pay.pi.model.pospay;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.annotation.JSONField;
import com.jackrain.pay.pi.model.PiPayResponseEntity;
import lombok.Data;

import java.util.List;

/**
 * @author: z.c
 * @since: 2019/11/27
 * create at : 2019/11/27 2:40 PM
 */
@Data
public class PosOrderQueryResponseEntity extends PiPayResponseEntity {

    @JSONField(name = "response")
    private ResponseEntity response;


    @Data
    public class ResponseEntity {

        /**
         * 结果编码
         */
        @JSONField(name = "result_code")
        private String resultCode;

        /**
         * 品牌编号
         */
        @JSONField(name = "brade_code")
        private String brandCode;

        /**
         * 商户门店编号
         */
        @JSONField(name = "store_code")
        private String storeCode;

        /**
         * 门店收银机编号
         */
        @JSONField(name = "cash_register_no")
        private String cashRegisterNo;

        /**
         * 收钱吧为该订单生成的订单序列号
         */
        @JSONField(name = "trade_no")
        private String tradeNo;
        /**
         * 商户订单号
         */
        @JSONField(name = "out_trade_no")
        private String outTradeNo;

        /**
         * 订单状态
         */
        @JSONField(name = "order_status")
        private String orderStatus;

        /**
         * 支付状态
         */
        @JSONField(name = "trade_state")
        private String tradeState;

        /**
         * 订单创建时间
         */
        @JSONField(name = "create_time")
        private String createTime;

        /**
         * 订单价格，精确到元
         */
        @JSONField(name = "total_amount")
        private String totalAmount;

        /**
         * 币种
         */
        @JSONField(name = "currency")
        private String currency;

        /**
         * 订单主题
         */
        @JSONField(name = "subject")
        private String subject;

        /**
         * 订单描述
         */
        @JSONField(name = "description")
        private String description;

        /**
         * 操作员
         */
        @JSONField(name = "operator_id")
        private String operatorId;

        /**
         * 客户信息
         */
        @JSONField(name = "customer")
        private String customer;

        /**
         * 拓展字段 1
         */
        @JSONField(name = "extension_1")
        private String extension1;

        /**
         * 拓展字段 2
         */
        @JSONField(name = "extension_2")
        private String extension2;

        /**
         * 行业代码
         * 0--RETAIL--零售
         * 1--HOTEL--酒店
         * 2--DINING--餐饮
         * 3--RECREATIONAL--文娱
         * 4--EDUCATION--教育
         */
        @JSONField(name = "industry_code")
        private String industryCode;

        /**
         * 对接的对端的信息
         */
        @JSONField(name = "deviceInfo")
        private String deviceInfo;

        /**
         * 通知接收地址
         */
        @JSONField(name = "notify_url")
        private String notifyUrl;

        /**
         * 扩展对象
         */
        @JSONField(name = "extended")
        private String extended;

        /**
         * 订单货物清单
         */
        @JSONField(name = "goods_detail")
        private List<PosGoodsDetailResponseEntity> goodsDetail;

        /**
         * 指定订单的各退款方式
         */
        @JSONField(name = "tenders")
        private List<PosTendersResponseEntity> tenders;

        /**
         * 业务错误编码
         */
        @JSONField(name = "err_code")
        private String errCode;

        /**
         * 业务错误信息
         */
        @JSONField(name = "err_msg")
        private String errMsg;

        /**
         * 是否存在退款
         */
        @JSONField(name = "is_refund_part")
        private String isRefundPart;

        /**
         * 退款金额 单位元
         */
        @JSONField(name = "refund_part_amount")
        private String refundPartAmount;
    }

    @Override
    public String toJSONString() {
        return JSON.toJSONString(this);
    }

}
