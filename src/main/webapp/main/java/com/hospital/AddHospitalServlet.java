package com.hospital;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/AddHospitalServlet")
public class AddHospitalServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String hName = request.getParameter("hospitalName");
		String hAddress = request.getParameter("hospitalAddress");
		String hContactNumber = request.getParameter("contactNumber");
		String hEmail = request.getParameter("hospitalEmail");
		String hLicenseNumber = request.getParameter("licenseNumber");
		String hWorkinghours = request.getParameter("workingHours");
		
		boolean isTrue;
		
		isTrue = HospitalDBUtil.insertHospitals(hName, hAddress, hContactNumber, hEmail, hLicenseNumber, hWorkinghours);
		if(isTrue == true) {
			RequestDispatcher dis = request.getRequestDispatcher("HospitalProfile.jsp");
			dis.forward(request, response);
		} else {
			RequestDispatcher dis2 = request.getRequestDispatcher("unsuccess.jsp");
			dis2.forward(request, response);
		}
		
		
	}

}
