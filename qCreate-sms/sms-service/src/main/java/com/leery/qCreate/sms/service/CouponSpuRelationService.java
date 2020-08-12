package com.leery.qCreate.sms.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.java.core.bean.PageVo;
import com.java.core.bean.QueryCondition;
import com.leery.qCreate.sms.entity.CouponSpuRelation;

/**
 * 优惠券与产品关联
 *
 * @author jiangli
 * @since  2020-01-11 18:31:30
 */
public interface CouponSpuRelationService extends IService<CouponSpuRelation> {

    PageVo queryPage(QueryCondition params);
}

