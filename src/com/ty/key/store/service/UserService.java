package com.ty.key.store.service;



	import com.ty.key.store.dao.UserDao;
	import com.ty.key.store.dto.User;

	public class UserService
	{
		UserDao dao = new UserDao();
		
		public int saveUserService(User user)
		{
			return dao.saveUser(user);
		}
	}



