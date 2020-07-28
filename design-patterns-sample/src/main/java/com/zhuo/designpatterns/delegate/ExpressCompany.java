package com.zhuo.designpatterns.delegate;

import java.util.Map;
import java.util.HashMap;

/**
 * 快递公司
 * @author zhuo
 * @date 2018/5/29
 */
public class ExpressCompany implements Courier {
    private static Map<String, Courier> courierMap = new HashMap<String, Courier>();

    static {
        courierMap.put("朝阳",new CourierA());
        courierMap.put("海淀",new CourierB());
    }

    @Override
    public void sendExpress(String sendTo, ExpressDelivery expressDelivery) {
        Courier courier = courierMap.get(sendTo);
        if (courier == null){
            return;
        }
        courier.sendExpress(sendTo, expressDelivery);
    }
}
