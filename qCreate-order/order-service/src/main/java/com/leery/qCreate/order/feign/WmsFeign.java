package com.leery.qCreate.order.feign;

import com.leery.qCreate.wms.api.WmsApi;
import org.springframework.cloud.openfeign.FeignClient;

/**
 * @author leery
 * @since 2020/1/31 11:28
 */
@FeignClient("wms-server")
public interface WmsFeign extends WmsApi {
}
