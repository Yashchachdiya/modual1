package com.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;

import java.sql.SQLException;


import com.model.UserModel;
import com.util.DBUtil;

public class UserRegistrationDao 
{
Connection cn=null;

	
	public int UserRegistration(UserModel umodel)
	{
		int x=0;
		cn=new DBUtil().getConnectionData();
		String qry="insert into userregistration(firstname,lastname,email,password)values(?,?,?,?)";
		
		try 
		{
			PreparedStatement st=cn.prepareStatement(qry);
			
			st.setString(1, umodel.getFirstname());
			st.setString(2, umodel.getLastname());
			st.setString(3, umodel.getEmail());
			st.setString(4, umodel.getPassword());
		
			x=st.executeUpdate();
			cn.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return x;
	}


}
