package com.leery.qCreate.wms.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.leery.qCreate.wms.entity.WareOrderTask;
import org.apache.ibatis.annotations.Mapper;

/**
 * 库存工作单
 * @author jiangli
 * @since  2020-01-11 15:49:45
 */
@Mapper
public interface WareOrderTaskDao extends BaseMapper<WareOrderTask> {
	
}
