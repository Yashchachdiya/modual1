package com.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.model.RegistrationModel;
import com.util.DBUtil;

public class RegistrationDao 
{
Connection cn=null;
	
	public int Registration(RegistrationModel rmodel)
	{
		int x=0;
		cn=new DBUtil().getConnectionData();
		String qry="insert into registration(firstname,lastname,mobnumber,email,password)values(?,?,?,?,?)";
		
		try 
		{
			PreparedStatement st=cn.prepareStatement(qry);
			st.setString(1, rmodel.getFirstname());
			st.setString(2, rmodel.getLastname());
			st.setString(3, rmodel.getMobnumber());
			st.setString(4, rmodel.getEmail());
			st.setString(5, rmodel.getPassword());
		
			x=st.executeUpdate();
			cn.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return x;
	}

}
