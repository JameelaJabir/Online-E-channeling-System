package com.hospital;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/ViewAllHospitalsServlet")
public class ViewAllHospitalsServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
 
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// Retrieve all hospital data from the database
        List<Hospital> allHospitals = HospitalDBUtil.getAllHospitals();

        // Set the retrieved data as an attribute in the request
        request.setAttribute("allHospitals", allHospitals);

        // Forward the request to the JSP page for displaying data
        request.getRequestDispatcher("HospitalProfile.jsp").forward(request, response);
  }

}
