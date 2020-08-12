package com.leery.qCreate.sms.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.java.core.bean.PageVo;
import com.java.core.bean.QueryCondition;
import com.leery.qCreate.sms.entity.SpuFullReduction;

/**
 * 商品满减信息
 *
 * @author jiangli
 * @since  2020-01-11 18:31:30
 */
public interface SpuFullReductionService extends IService<SpuFullReduction> {

    PageVo queryPage(QueryCondition params);
}
