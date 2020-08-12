package com.leery.qCreate.ums.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.leery.qCreate.ums.entity.MemberLevel;
import org.apache.ibatis.annotations.Mapper;

/**
 * 会员等级
 * @author jiangli
 * @since  2020-01-27 19:50:04
 */
@Mapper
public interface MemberLevelDao extends BaseMapper<MemberLevel> {
	
}
