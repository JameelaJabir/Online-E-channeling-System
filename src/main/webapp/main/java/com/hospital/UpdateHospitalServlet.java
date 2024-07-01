package com.hospital;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/UpdateHospitalServlet")
public class UpdateHospitalServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
  
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String name = request.getParameter("hospitalName");
		String address = request.getParameter("hospitalAddress");
		String phone = request.getParameter("contactNumber");
		String email = request.getParameter("hospitalEmail");
		String lno = request.getParameter("licenseNumber");
		String whour = request.getParameter("workingHours");
		
		boolean isTrue;;
		
		isTrue = HospitalDBUtil.updateHospitals(name, address, phone, email, lno, whour);
		
		if(isTrue == true) {
			
			List<Hospital> hosDetails = HospitalDBUtil.getHospitalDetails(lno);
			request.setAttribute("hospitalDetails", hosDetails);
			
			RequestDispatcher dis = request.getRequestDispatcher("ViewSearchHospital.jsp");
			dis.forward(request, response);
		}
		else {
			
			List<Hospital> hosDetails = HospitalDBUtil.getHospitalDetails(lno);
			request.setAttribute("hosDetails", hosDetails);
	
			RequestDispatcher dis1 = request.getRequestDispatcher("unsuccess.jsp");
			dis1.forward(request, response);
		}
	}

}
