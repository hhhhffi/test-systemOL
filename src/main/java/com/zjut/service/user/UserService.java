package com.zjut.service.user;

import com.zjut.pojo.User;
import com.zjut.utils.PageData;

/**
*@author Mafiaboy E-mail:3040998845@qq.com
*@version 创建时间:2020年4月13日下午1:41:09
*类说明
*/
public interface UserService {
	/*
	 * 查看用户名是否重复
	 * */
	User findByUserName(PageData pd);
	/*
	 * 查看用户手机号是否重复
	 * */
	User findByPhone(PageData pd);
	/*
	 * 查看电子邮箱是否重复
	 * */
	User findByEmail(PageData pd);
	/*
	 * 新增用户
	 * */
	void insert(User user);
	/**
	 *@Description:根据用户名和密码查询用户
	 *@param pd
	 *@return User
	 *@throws
	 */
	User getUserByNameAndPwd(PageData pd);
	/**
	 *@Description:修改用户的上次登录时间
	 *@param pd
	 *@return void
	 *@throws
	 */
	void updateLastLogin(PageData pd);
}