package servlet;

import model.*;
import service.*;
import java.io.IOException;


import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/Addcost")
public class Addcost extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		try {
			
			
			
			String description=request.getParameter("description");
			if(description!=null) {
				String cost=request.getParameter("cost");
				String date=request.getParameter("date");
				cost c=new cost(description,cost,date);
				costservice csService=new costserviceImpl();
				if(csService.addcost(c)) 
					response.sendRedirect("costs.jsp");
				
			}
		} catch (Exception e) {
			System.out.println(e);
			// TODO: handle exception
		}
		
		
		
		
		
	}

}
