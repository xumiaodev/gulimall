package com.xumiao.gulimall.order.dao;

import com.xumiao.gulimall.order.entity.OrderEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 订单
 * 
 * @author xumiao
 * @email xuyongjun96@gmail.com
 * @date 2020-08-25 22:47:02
 */
@Mapper
public interface OrderDao extends BaseMapper<OrderEntity> {
	
}
