package com.pc.ssm.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.pc.ssm.dao.UserMapper;
import com.pc.ssm.pojo.User;
import com.pc.ssm.service.UserService;

/**
 * 用户Service层接口实现类
 * 
 * @author Switch
 * @data 2017年1月11日
 * @version V1.0
 */
@Service
public class UserServiceImpl implements UserService {
	
	// 注入用户Mapper
	@Autowired
	private UserMapper userMapper;

	@Override
	public List<User> findAllUser() {
		return userMapper.selectByExample(null);
	}

}
