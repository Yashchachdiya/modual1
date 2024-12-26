package com.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.model.StudentModel;
import com.util.DBUtil;

public class StudentDao 
{
Connection cn=null;

	
	public int Student(StudentModel smodel)
	{
		int x=0;
		cn=new DBUtil().getConnectionData();
		String qry="insert into student(firstname,lastname,mobnumber,gender,email,password)values(?,?,?,?,?,?)";
		
		try 
		{
			PreparedStatement st=cn.prepareStatement(qry);
			
			st.setString(1, smodel.getFirstname());
			st.setString(2, smodel.getLastname());
			st.setString(3, smodel.getMobnumber());
			st.setString(4, smodel.getGender());
			st.setString(5, smodel.getEmail());
			st.setString(6, smodel.getPassword());
		
			x=st.executeUpdate();
			cn.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return x;
	}
	public StudentModel verifyLogin(int studentid)
	{
		StudentModel model=null;
		cn=new DBUtil().getConnectionData();
		String qry="select * from student where studentid=?";
		
		try {
			PreparedStatement st=cn.prepareStatement(qry);
			st.setInt(1, studentid);
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
	public int updateStudent(StudentModel emodel)
	{
		int x=0;
		cn=new DBUtil().getConnectionData();
		String qry="update student set firstname=?,lastname=?,mobnumber=?,gender=?,email=?,password=? where studentid=?";
		
		try {
			PreparedStatement st=cn.prepareStatement(qry);
			st.setString(1, emodel.getFirstname());
			st.setString(2, emodel.getLastname());;
			st.setString(3, emodel.getMobnumber());;
			st.setString(4, emodel.getGender());
			st.setString(5, emodel.getEmail());
			st.setString(6, emodel.getPassword());
			st.setInt(7, emodel.getStudentid());
			
			x=st.executeUpdate();
			cn.close();
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return x;
		
	}
	public int delete(int studentid)
	{
		int x=0;
		cn=new DBUtil().getConnectionData();
		String qry="delete from student where studentid=?";
		
		try {
			PreparedStatement st=cn.prepareStatement(qry);
			st.setInt(1,studentid);
			x=st.executeUpdate();
			cn.close();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		return x;
	}
	public List<StudentModel> allUser()
	{
		ArrayList<StudentModel> lists=new ArrayList<StudentModel>();
		StudentModel model=null;
		cn=new DBUtil().getConnectionData();
		String qry="select * from student";
		
		try {
			PreparedStatement st=cn.prepareStatement(qry);
			ResultSet rs=st.executeQuery();
			while(rs.next())
			{
				model=new StudentModel();
				model.setStudentid(rs.getInt(1));
				model.setFirstname(rs.getString(2));
				model.setLastname(rs.getString(3));
				model.setMobnumber(rs.getString(4));
				model.setGender(rs.getString(5));
				model.setEmail(rs.getString(6));
				model.setPassword(rs.getString(7));
				lists.add(model);
			}
			cn.close();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return lists;
		
	}
}