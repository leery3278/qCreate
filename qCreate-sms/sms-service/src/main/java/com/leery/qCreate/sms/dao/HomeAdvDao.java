package com.leery.qCreate.sms.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.leery.qCreate.sms.entity.HomeAdv;
import org.apache.ibatis.annotations.Mapper;

/**
 * 首页轮播广告
 * @author jiangli
 * @since  2020-01-11 18:31:30
 */
@Mapper
public interface HomeAdvDao extends BaseMapper<HomeAdv> {
	
}
