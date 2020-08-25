package com.xumiao.gulimall.member.dao;

import com.xumiao.gulimall.member.entity.MemberEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 会员
 * 
 * @author xumiao
 * @email xuyongjun96@gmail.com
 * @date 2020-08-25 22:45:24
 */
@Mapper
public interface MemberDao extends BaseMapper<MemberEntity> {
	
}
