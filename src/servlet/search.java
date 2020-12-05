package servlet;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import service.*;
import model.*;

/**
 * Servlet implementation class search
 */
@WebServlet("/search")
public class search extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		try {
			
			patient_service ps=new patient_service_implement();
			
			int pid=Integer.parseInt(request.getParameter("pid"));
			
			ArrayList<patients> patients;
			patients =ps.getPatient(pid);
			

			HttpSession hs = request.getSession();
			hs.setAttribute("result", patients );
			response.sendRedirect("patientResult.jsp");
			
			
			
		} catch (Exception e) {
			System.out.println(e);
		}
		
	}

}
