package com.leery.qCreate.sms.api;

import com.java.core.bean.Resp;
import com.leery.qCreate.sms.dto.SkuSaleDTO;
import com.leery.qCreate.sms.vo.SaleVO;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;

public interface GmallSmsApi {

    @PostMapping("/sms/skubounds/skusale/save")
    Resp<Object> saveSkuSaleInfo(@RequestBody SkuSaleDTO skuSaleDTO);

	/**
	 * 根据skuId查询营销信息
	 */
	@GetMapping("sms/skubounds/{skuId}")
	List<SaleVO> querySaleBySkuId(@PathVariable("skuId") Long skuId);

}