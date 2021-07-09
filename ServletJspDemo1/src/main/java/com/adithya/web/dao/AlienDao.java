package com.adithya.web.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

import com.adithya.web.model.Alien;
import java.sql.*;
public class AlienDao {
	
	public Alien getAlien(int aid) {
		Alien a = new Alien();
		a.setAid(101);
		a.setAname("Adithya");
		a.setTech("Java");
		
		try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection con = DriverManager.getConnection("");
			Statement st = con.createStatement();
			ResultSet rs = st.executeQuery("select * from alien where aid="+aid);
			if(rs.next()) {
				a.setAid(rs.getInt("aid"));
				a.setAname(rs.getString("aname"));
				a.setTech(rs.getString("tech"));
			}
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
		
		return a;
	}

}
