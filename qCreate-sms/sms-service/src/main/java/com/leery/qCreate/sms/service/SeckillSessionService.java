package com.leery.qCreate.sms.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.java.core.bean.PageVo;
import com.java.core.bean.QueryCondition;
import com.leery.qCreate.sms.entity.SeckillSession;

/**
 * 秒杀活动场次
 *
 * @author jiangli
 * @since  2020-01-11 18:31:30
 */
public interface SeckillSessionService extends IService<SeckillSession> {

    PageVo queryPage(QueryCondition params);
}

