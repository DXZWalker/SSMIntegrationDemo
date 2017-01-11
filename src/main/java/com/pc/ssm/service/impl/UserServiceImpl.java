package com.pc.ssm.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.IncorrectUpdateSemanticsDataAccessException;
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

	@Override
	public User findById(Integer id) {
		return userMapper.selectByPrimaryKey(id);
	}

	@Override
	public void update(User user) {
		if (userMapper.updateByPrimaryKeySelective(user) != 1) {
			throw new IncorrectUpdateSemanticsDataAccessException("更新异常");
		}
	}

}
