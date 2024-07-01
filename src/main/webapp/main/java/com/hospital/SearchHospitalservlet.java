package com.hospital;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/SearchHospitalservlet")
public class SearchHospitalservlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String hLisenceNumber = request.getParameter("licenseNumber");

	try {
		List <Hospital> hospitalDetails = HospitalDBUtil.validate(hLisenceNumber);
		request.setAttribute("hospitalDetails", hospitalDetails);
	}catch(Exception e){	
		e.printStackTrace();
	}
	
	RequestDispatcher dis = request.getRequestDispatcher("ViewSearchHospital.jsp");
	dis.forward(request, response);
	
	}

}
