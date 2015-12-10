package com.atguigu.surveypark.service;

import com.atguigu.surveypark.model.User;

/**
 * UserService
 */
public interface UserService extends BaseService<User> {

	/**
	 *  判断email是否占用
	 */
	public boolean isRegisted(String email);

	/**
	 * 验证登陆信息
	 */
	public User validateLoginInfo(String email, String md5);
}
