package com.hospital;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/DeleteHospitalServlet")
public class DeleteHospitalServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String licNo = request.getParameter("licenseNumber");
		
		boolean isTrue;
		
		isTrue = HospitalDBUtil.deleteHospital(licNo);
		
		if (isTrue == true) {
			RequestDispatcher dispatcher = request.getRequestDispatcher("AddHospital.jsp");
			dispatcher.forward(request, response);
		}
		else {
			
			List<Hospital> hosDetails = HospitalDBUtil.getHospitalDetails(licNo);
			request.setAttribute("hosDetails", hosDetails);
			
			RequestDispatcher dispatcher = request.getRequestDispatcher("unsuccess.jsp");
			dispatcher.forward(request, response);
		}
		
		
		
	}

}
