package com.hospital;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class HospitalDBUtil {
	
	private static boolean isSuccess;
	private static Connection con = null;
	private static Statement stmt = null;
	private static ResultSet rs = null;
		
	//create/insert hospital
	public static boolean insertHospitals(String hName, String hAddress, String hContactNumber, String hEmail, String hLicenseNumber, String hWorkinghours) {
    	
    boolean isSuccess = false;
    	
    	try {
    		
    		con = DBConnect.getConnection();
    		stmt = con.createStatement();
    	    String sql = "insert into hospital values ('"+hName+"','"+hAddress+"','"+hContactNumber+"','"+hEmail+"','"+hLicenseNumber+"','"+hWorkinghours+"')";
    		int rs = stmt.executeUpdate(sql);
    		
    		if(rs > 0) {
    			isSuccess = true;
    		} else {
    			isSuccess = false;
    		}
    		
    	}
    	catch (Exception e) {
    		e.printStackTrace();
    	}
 	
    	return isSuccess;
    }
	
	//Read hospital data
	public static List<Hospital> validate(String licenseNumber) {
		
		ArrayList<Hospital> hospital = new ArrayList<>();
		
		try {
			
			con = DBConnect.getConnection();
			stmt = con.createStatement();
			String sql = "select * from hospital where hLicenseNumber='"+licenseNumber+"'";
			rs = stmt.executeQuery(sql);
			
			while (rs.next()) {
				String hName = rs.getString(1);
				String hAddress = rs.getString(2);
				String hContactNumber = rs.getString(3);
				String hEmail = rs.getString(4);
				String hLisenceNumber = rs.getString(5);
				String hWorkingHours = rs.getString(6);
				
				Hospital h = new Hospital(hName,hAddress,hContactNumber,hEmail,hLisenceNumber,hWorkingHours);
				hospital.add(h);
			}
			
		} catch (Exception e) {
			
		}
		
		return hospital;	
	}

	//update hospital
	public static boolean updateHospitals(String name, String address, String phone, String email, String lno, String whour) {
    	
    	try {
    		
    		con = DBConnect.getConnection();
    		stmt = con.createStatement();
    		String sql = "update hospital set hName='"+name+"',hAddress='"+address+"',hContactNumber='"+phone+"',hEmail='"+email+"',hWorkinghours='"+whour+"' where hLicenseNumber='"+lno+"'";
    		int rs = stmt.executeUpdate(sql);
    		
    		if(rs > 0) {
    			isSuccess = true;
    		}
    		else {
    			isSuccess = false;
    		}
    		
    	}
    	catch(Exception e) {
    		e.printStackTrace();
    	}
    	
    	return isSuccess;
    }
	
	//retrieve hospital details
	public static List<Hospital> getHospitalDetails(String licenseNumber) {
    	
    	ArrayList<Hospital> hospital = new ArrayList<>();
    	
    	try {
    		
    		con = DBConnect.getConnection();
    		stmt = con.createStatement();
    		String sql = "select * from hospital where hLicenseNumber='"+licenseNumber+"'";
    		rs = stmt.executeQuery(sql);
    		
    		while(rs.next()) {
    			String hName = rs.getString(1);
				String hAddress = rs.getString(2);
				String hContactNumber = rs.getString(3);
				String hEmail = rs.getString(4);
				String hLisenceNumber = rs.getString(5);
				String hWorkingHours = rs.getString(6);
				
				Hospital h = new Hospital(hName,hAddress,hContactNumber,hEmail,hLisenceNumber,hWorkingHours);
				hospital.add(h);
    		}
    		
    	}
    	catch(Exception e) {
    		e.printStackTrace();
    	}	
    	return hospital;	
    }
    
	
	//delete hospital
	public static boolean deleteHospital(String licenseNumber) {
    
    	try {
    		
    		con = DBConnect.getConnection();
    		stmt = con.createStatement();
    		String sql = "delete from hospital where hLicenseNumber='"+licenseNumber+"'";
    		int r = stmt.executeUpdate(sql);
    		
    		if (r > 0) {
    			isSuccess = true;
    		}
    		else {
    			isSuccess = false;
    		}
    		
    	}
    	catch (Exception e) {
    		e.printStackTrace();
    	}
    	
    	return isSuccess;
    }
	
	// Retrieve all hospitals
	public static List<Hospital> getAllHospitals() {
	    ArrayList<Hospital> hospitals = new ArrayList<>();

	    try {
	        con = DBConnect.getConnection();
	        stmt = con.createStatement();
	        String sql = "select * from hospital";
	        rs = stmt.executeQuery(sql);

	        while (rs.next()) {
	            String hName = rs.getString(1);
	            String hAddress = rs.getString(2);
	            String hContactNumber = rs.getString(3);
	            String hEmail = rs.getString(4);
	            String hLicenseNumber = rs.getString(5);
	            String hWorkingHours = rs.getString(6);

	            Hospital h = new Hospital(hName, hAddress, hContactNumber, hEmail, hLicenseNumber, hWorkingHours);
	            hospitals.add(h);
	        }
	    } catch (Exception e) {
	        e.printStackTrace();
	    }

	    return hospitals;
	}
	
	
}
