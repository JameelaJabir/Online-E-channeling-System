package com.hospital;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/ViewAllHospitalsServlet")
public class ViewAllHospitalsServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		try {

			List<Hospital> allHospitals = HospitalDBUtil.getAllHospitals();
			request.setAttribute("allHospitals", allHospitals);
		}

		catch (Exception e) {
			e.printStackTrace();
		}

		RequestDispatcher dis = request.getRequestDispatcher("HospitalProfile.jsp");
		dis.forward(request, response);

	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		try {

			List<Hospital> allHospitals = HospitalDBUtil.getAllHospitals();
			request.setAttribute("allHospitals", allHospitals);
		}

		catch (Exception e) {
			e.printStackTrace();
		}

		RequestDispatcher dis = request.getRequestDispatcher("HospitalProfile.jsp");
		dis.forward(request, response);
		
  }

}






		