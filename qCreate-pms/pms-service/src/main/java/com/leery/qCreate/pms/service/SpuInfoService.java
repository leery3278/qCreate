package com.leery.qCreate.pms.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.java.core.bean.PageVo;
import com.java.core.bean.QueryCondition;
import com.leery.qCreate.pms.entity.SpuInfo;
import com.leery.qCreate.pms.vo.SpuInfoVO;


/**
 * spu信息
 *
 * @author jiangli
 * @since  2020-01-10 04:05:29
 */
public interface SpuInfoService extends IService<SpuInfo> {

    PageVo<SpuInfo> queryPage(QueryCondition params);

	PageVo<SpuInfo> querySpuInfo(QueryCondition condition, Long catId);

	void saveSpuInfoVO(SpuInfoVO spuInfoVO);

	void updateSpuInfo(SpuInfo spuInfo);
}

