package com.dao;

import com.model.StudentModel;
import java.sql.PreparedStatement;
import com.util.DBUtil;

import java.sql.Connection;
import java.sql.ResultSet;
public class LoginDao 
{
Connection cn=null;
	
	public StudentModel getLogin(StudentModel lModel)
	{
		
		StudentModel model=null;
		cn=new DBUtil().getConnectionData();
		String qry="select * from student where email=? and password=?";
		
		try {
			PreparedStatement st=cn.prepareStatement(qry);
			st.setString(1, lModel.getEmail());
			st.setString(2, lModel.getPassword());
			
			ResultSet rs=st.executeQuery();
			if(rs.next())
			{
				model=new StudentModel();
				model.setStudentid(rs.getInt(1));
				model.setFirstname(rs.getString(2));
				model.setLastname(rs.getString(3));
				model.setMobnumber(rs.getString(4));
				model.setGender(rs.getString(5));
				model.setEmail(rs.getString(6));
				model.setPassword(rs.getString(7));
			}
			cn.close();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
		return model;
		
	}
	
}
