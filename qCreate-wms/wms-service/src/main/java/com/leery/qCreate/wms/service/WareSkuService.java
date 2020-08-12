package com.leery.qCreate.wms.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.java.core.bean.PageVo;
import com.java.core.bean.QueryCondition;
import com.leery.qCreate.wms.entity.WareSku;
import com.leery.qCreate.wms.vo.SkuLockVO;

import java.util.List;

/**
 * 商品库存
 *
 * @author jiangli
 * @since  2020-01-11 15:49:45
 */
public interface WareSkuService extends IService<WareSku> {

    PageVo queryPage(QueryCondition params);

	String checkAndLockStore(List<SkuLockVO> skuLockVOS);
}

