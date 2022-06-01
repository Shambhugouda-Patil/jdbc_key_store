package com.ty.key.store.controller;


	import com.ty.key.store.service.UserService;
	import com.ty.key.store.dto.User;

	public class TestUser
	{
		public static void main(String[] args) 
		{
			User user = new User();
			user.setUid(1);
			user.setName("vikas");
			user.setEmail("vikas@gmail.com");
			user.setPassword("vikas123");
			UserService userService = new UserService();
			int res = userService.saveUserService(user);
			if(res>0)
			{
				System.out.println("Addedd successfully");
			}
			else
				System.out.println("No data is Exist");
		}
	}



