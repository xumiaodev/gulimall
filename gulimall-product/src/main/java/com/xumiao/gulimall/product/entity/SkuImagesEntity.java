package com.xumiao.gulimall.product.entity;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;

import java.io.Serializable;
import java.util.Date;
import lombok.Data;

/**
 * sku图片
 * 
 * @author xumiao
 * @email xuyongjun96@gmail.com
 * @date 2020-08-25 01:19:28
 */
@Data
@TableName("pms_sku_images")
public class SkuImagesEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	/**
	 * $column.comments
	 */
	@TableId
	private Long id;
	/**
	 * $column.comments
	 */
	private Long skuId;
	/**
	 * $column.comments
	 */
	private String imgUrl;
	/**
	 * $column.comments
	 */
	private Integer imgSort;
	/**
	 * $column.comments
	 */
	private Integer defaultImg;

}
