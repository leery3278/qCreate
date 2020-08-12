package com.leery.qCreate.ums.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.leery.qCreate.ums.entity.IntegrationChangeHistory;
import org.apache.ibatis.annotations.Mapper;

/**
 * 积分变化历史记录
 * @author jiangli
 * @since  2020-01-27 19:50:04
 */
@Mapper
public interface IntegrationChangeHistoryDao extends BaseMapper<IntegrationChangeHistory> {
	
}
