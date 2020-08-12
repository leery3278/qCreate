package com.leery.qCreate.ums.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.java.core.bean.PageVo;
import com.java.core.bean.QueryCondition;
import com.leery.qCreate.ums.entity.Member;

/**
 * 会员
 *
 * @author jiangli
 * @since  2020-01-27 19:50:04
 */
public interface MemberService extends IService<Member> {

    PageVo queryPage(QueryCondition params);

	Boolean checkData(String data, Integer type);

	void register(Member memberEntity, String code);

	Member queryUser(String username, String password);
}

