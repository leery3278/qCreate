package com.leery.qCreate.order.feign;

import com.leery.qCreate.pms.api.QCreatePmsApi;
import org.springframework.cloud.openfeign.FeignClient;

/**
 * @author leery
 * @since 2020/1/26 15:01
 */
@FeignClient("sms-server")
public interface SmsFeign extends QCreatePmsApi {
}
