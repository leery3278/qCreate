package com.leery.qCreate.ums.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.java.core.bean.PageVo;
import com.java.core.bean.QueryCondition;
import com.leery.qCreate.ums.entity.MemberLevel;

/**
 * 会员等级
 *
 * @author jiangli
 * @since  2020-01-27 19:50:04
 */
public interface MemberLevelService extends IService<MemberLevel> {

    PageVo queryPage(QueryCondition params);
}

