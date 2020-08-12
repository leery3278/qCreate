package com.leery.qCreate.pms.vo;

import com.leery.qCreate.pms.entity.ProductAttrValue;
import lombok.Data;

import java.util.List;

/**
 * 基本属性分组及组下的规格参数
 */
@Data
public class BaseGroupVO {

    private String name;//分组的名字
    private List<ProductAttrValue> attrs;
}