package com.leery.qCreate.pms.vo;

import com.leery.qCreate.pms.entity.Category;
import lombok.Data;

import java.util.List;

/**
 * @author jiangli
 * @since 2020/1/18 22:30
 */
@Data
public class CategoryVO extends Category {

	private List<Category> subs;

}
