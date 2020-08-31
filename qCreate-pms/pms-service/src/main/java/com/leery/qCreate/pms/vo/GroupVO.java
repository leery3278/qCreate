package com.leery.qCreate.pms.vo;

import com.leery.qCreate.pms.entity.Attr;
import com.leery.qCreate.pms.entity.AttrAttrgroupRelation;
import com.leery.qCreate.pms.entity.AttrGroup;
import lombok.Data;

import java.util.List;

/**
 * @author leery
 * @since 2020/08/31 13:27
 */
@Data
public class GroupVO extends AttrGroup {

	private List<Attr> attrEntities;

	private List<AttrAttrgroupRelation> relations;

}
