package com.leery.qCreate.order.feign;

import com.leery.qCreate.pms.api.QCreatePmsApi;
import org.springframework.cloud.openfeign.FeignClient;

/**
 * @author jiangli
 * @since 2020/1/26 13:56
 */
@FeignClient("pms-server")
public interface PmsFeign extends QCreatePmsApi {
}
