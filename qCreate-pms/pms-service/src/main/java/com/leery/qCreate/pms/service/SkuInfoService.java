package com.leery.qCreate.pms.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.java.core.bean.PageVo;
import com.java.core.bean.QueryCondition;
import com.leery.qCreate.pms.entity.SkuInfo;

import java.util.List;


/**
 * sku信息
 *
 * @author jiangli
 * @since  2020-01-10 04:05:29
 */
public interface SkuInfoService extends IService<SkuInfo> {

    PageVo queryPage(QueryCondition params);

    List<SkuInfo> querySkuBySpuId(Long spuId);
}

