package com.ty.key.store.dao;


	import java.sql.Connection;
	import java.sql.PreparedStatement;
	import java.sql.SQLException;

	import com.ty.key.store.dto.User;
	import com.ty.key.store.util.ConnectionObject;


	public class UserDao {
		public int saveUser(User user)
		{
			Connection connection = ConnectionObject.getConnection()	;		
			try {
				PreparedStatement preparedStatement = connection.prepareStatement("insert into user values(?,?,?,?)");
				preparedStatement.setInt(1, user.getUid());
				preparedStatement.setString(2, user.getName());
				preparedStatement.setString(3,user.getEmail());
				preparedStatement.setString(4,user.getPassword());
				
				return preparedStatement.executeUpdate();
				
			} catch (SQLException e) {
				e.printStackTrace();
			}
			finally
			{
				try
				{
					connection.close();
				}
				catch (SQLException e)
				{
					e.printStackTrace();
				}
			}
			return 0;
		}
	}



