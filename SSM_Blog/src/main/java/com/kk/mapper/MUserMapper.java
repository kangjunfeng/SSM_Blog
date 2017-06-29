package com.kk.mapper;

import org.apache.ibatis.annotations.Param;

import com.kk.entity.MUser;

public interface MUserMapper {
	MUser searchUserByUserName(@Param("username") String userName, @Param("password") String password);
}
