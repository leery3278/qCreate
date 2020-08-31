package com.leery.qCreate.pms.vo;

import com.leery.qCreate.pms.entity.Category;
import lombok.Data;

import java.util.List;

/**
 * @author leery
 * @since 2020/8/31 08:57
 */
@Data
public class CategoryVO extends Category {

	private List<Category> subs;

}
