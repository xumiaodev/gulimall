package com.xumiao.gulimall.coupon.entity;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;

import java.math.BigDecimal;
import java.io.Serializable;
import java.util.Date;
import lombok.Data;

/**
 * 商品满减信息
 * 
 * @author xumiao
 * @email xuyongjun96@gmail.com
 * @date 2020-08-25 22:38:11
 */
@Data
@TableName("sms_sku_full_reduction")
public class SkuFullReductionEntity implements Serializable {
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
	private BigDecimal fullPrice;
	/**
	 * $column.comments
	 */
	private BigDecimal reducePrice;
	/**
	 * $column.comments
	 */
	private Integer addOther;

}
