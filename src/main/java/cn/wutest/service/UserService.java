package cn.wutest.service;

import cn.wutest.domain.User;

public interface UserService {
	//登陆方法
	User	getUserByCodePassword(User u);
	//注册用户
	void saveUser(User u);
}
