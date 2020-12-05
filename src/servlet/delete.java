package servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import service.*;


@WebServlet("/delete")
public class delete extends HttpServlet {
	private static final long serialVersionUID = 1L;

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String id =request.getParameter("id");
		String ID=request.getParameter("SupID");
		
		String stID=request.getParameter("StockID");
		
		String ApPtID=request.getParameter("ApPtID");
		
		try {
			costservice cs1= new costserviceImpl();
			supplier_service sp1=new supplier_service_impl();
			stock_manage st1=new stock_manage_imp();
			AppPatient_service apts1=new AppPatient_service_Impl();
			if(id!=null) {
				if(cs1.deletecost(Integer.parseInt(id))) {
					response.sendRedirect("costs.jsp");
				}
			}
			else if(ID!=null) {
				if(sp1.deletesupplier(Integer.parseInt(ID))) {
					response.sendRedirect("SupplierManagement.jsp");
				}
			}else if(stID!=null) {
				if(st1.deleteItem(Integer.parseInt(stID))) {
					response.sendRedirect("PharmacyMng.jsp");
				}
			}else if(ApPtID!=null) {
				if(apts1.deleteAppointment(Integer.parseInt(ApPtID))) {
					response.sendRedirect("ChannelingList.jsp");
				}
			}
			
			
		} catch (Exception e) {
			System.out.println(e);
		}
	}

}
