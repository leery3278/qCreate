package com.leery.qCreate.oms.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.leery.qCreate.oms.entity.RefundInfo;
import org.apache.ibatis.annotations.Mapper;

/**
 * 退款信息
 * @author jiangli
 * @since  2020-01-30 10:17:57
 */
@Mapper
public interface RefundInfoDao extends BaseMapper<RefundInfo> {
	
}
