package com.leery.qCreate.oms.api;

import com.leery.qCreate.oms.entity.Order;
import com.leery.qCreate.oms.vo.OrderSubmitVO;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

/**
 * @author jiangli
 * @since 2020/1/30 11:44
 */
public interface OmsApi {

	@PostMapping("oms/order")
	Order saveOrder(@RequestBody OrderSubmitVO orderSubmitVO);
}
