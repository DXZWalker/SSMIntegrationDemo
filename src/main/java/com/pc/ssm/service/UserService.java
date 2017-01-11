package com.pc.ssm.service;

import java.util.List;

import com.pc.ssm.pojo.User;

/**
 * 用户Service层接口
 * 
 * @author Switch
 * @data 2017年1月11日
 * @version V1.0
 */
public interface UserService {
	/**
	 * 获取所有用户信息
	 * 
	 * @return
	 */
	List<User> findAllUser();

	/**
	 * 通过ID获取用户
	 * 
	 * @param id
	 * @return
	 */
	User findById(Integer id);

	/**
	 * 更新用户
	 * 
	 * @param user
	 */
	void update(User user);
}
