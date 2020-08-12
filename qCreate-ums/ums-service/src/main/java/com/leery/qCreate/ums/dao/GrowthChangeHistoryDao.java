package com.leery.qCreate.ums.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.leery.qCreate.ums.entity.GrowthChangeHistory;
import org.apache.ibatis.annotations.Mapper;

/**
 * 成长值变化历史记录
 * @author jiangli
 * @since  2020-01-27 19:50:04
 */
@Mapper
public interface GrowthChangeHistoryDao extends BaseMapper<GrowthChangeHistory> {
	
}
