package com.leery.qCreate.oms.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.java.core.bean.PageVo;
import com.java.core.bean.QueryCondition;
import com.leery.qCreate.oms.entity.RefundInfo;

/**
 * 退款信息
 *
 * @author jiangli
 * @since  2020-01-30 10:17:57
 */
public interface RefundInfoService extends IService<RefundInfo> {

    PageVo queryPage(QueryCondition params);
}

