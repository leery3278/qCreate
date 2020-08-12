package com.leery.qCreate.sms.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.java.core.bean.PageVo;
import com.java.core.bean.QueryCondition;
import com.leery.qCreate.sms.dto.SkuSaleDTO;
import com.leery.qCreate.sms.entity.SkuBounds;
import com.leery.qCreate.sms.vo.SaleVO;

import java.util.List;

/**
 * 商品sku积分设置
 *
 * @author jiangli
 * @since  2020-01-11 18:31:30
 */
public interface SkuBoundsService extends IService<SkuBounds> {

    PageVo queryPage(QueryCondition params);

	void saveSkuSaleInfo(SkuSaleDTO skuSaleDTO);

	List<SaleVO> querySaleBySkuId(Long skuId);
}

