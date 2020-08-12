package com.leery.qCreate.ums.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.java.core.bean.PageVo;
import com.java.core.bean.QueryCondition;
import com.leery.qCreate.ums.entity.GrowthChangeHistory;

/**
 * 成长值变化历史记录
 *
 * @author jiangli
 * @since  2020-01-27 19:50:04
 */
public interface GrowthChangeHistoryService extends IService<GrowthChangeHistory> {

    PageVo queryPage(QueryCondition params);
}

