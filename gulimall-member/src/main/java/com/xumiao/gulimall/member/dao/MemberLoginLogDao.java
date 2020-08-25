package com.xumiao.gulimall.member.dao;

import com.xumiao.gulimall.member.entity.MemberLoginLogEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 会员登录记录
 * 
 * @author xumiao
 * @email xuyongjun96@gmail.com
 * @date 2020-08-25 22:45:23
 */
@Mapper
public interface MemberLoginLogDao extends BaseMapper<MemberLoginLogEntity> {
	
}
