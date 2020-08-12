package com.leery.qCreate.pms.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.java.core.bean.PageVo;
import com.java.core.bean.QueryCondition;
import com.leery.qCreate.pms.entity.AttrGroup;
import com.leery.qCreate.pms.vo.GroupVO;

import java.util.List;


/**
 * 属性分组
 *
 * @author jiangli
 * @since  2020-01-10 04:05:29
 */
public interface AttrGroupService extends IService<AttrGroup> {

    PageVo queryPage(QueryCondition params);

	PageVo queryGroupByPage(QueryCondition queryCondition, Long catId);

	GroupVO queryGroupByGid(Long gid);

	List<GroupVO> queryByCatId(Long catId);

}

