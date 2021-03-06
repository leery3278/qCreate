package com.leery.qCreate.sms.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.java.core.bean.PageVo;
import com.java.core.bean.QueryCondition;
import com.leery.qCreate.sms.entity.CouponHistory;

/**
 * 优惠券领取历史记录
 *
 * @author jiangli
 * @since  2020-01-11 18:31:30
 */
public interface CouponHistoryService extends IService<CouponHistory> {

    PageVo queryPage(QueryCondition params);
}

