package com.xumiao.gulimall.order.dao;

import com.xumiao.gulimall.order.entity.OrderSettingEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 订单配置信息
 * 
 * @author xumiao
 * @email xuyongjun96@gmail.com
 * @date 2020-08-25 22:47:01
 */
@Mapper
public interface OrderSettingDao extends BaseMapper<OrderSettingEntity> {
	
}
