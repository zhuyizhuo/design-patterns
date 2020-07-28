package com.yizhuo.learning.patterns.delegate;

import java.util.Map;
import java.util.HashMap;

/**
 *
 * @author yizhuo
 * @date 2018/5/29
 */
public class ExpressCompany implements ExpressDelivery {
    private static Map<String,ExpressDelivery> m = new HashMap<String,ExpressDelivery>();

    static {
        m.put("朝阳",new CourierA());
        m.put("海淀",new CourierB());
    }

    public void sendExpress(String sendTo) {
        ExpressDelivery expressDelivery = m.get(sendTo);
        if (expressDelivery == null){
            return;
        }
        expressDelivery.sendExpress(sendTo);
    }
}
