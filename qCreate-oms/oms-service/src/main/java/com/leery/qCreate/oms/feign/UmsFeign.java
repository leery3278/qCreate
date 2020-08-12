package com.leery.qCreate.oms.feign;

import com.leery.qCreate.ums.api.UmsApi;
import org.springframework.cloud.openfeign.FeignClient;

/**
 * @author jiangli
 * @since 2020/1/31 14:46
 */
@FeignClient("ums-server")
public interface UmsFeign extends UmsApi {
}
