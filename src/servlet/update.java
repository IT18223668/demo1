package servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import service.costservice;
import service.costserviceImpl;
import service.patient_service;
import service.patient_service_implement;
import service.supplier_service;
import service.supplier_service_impl;
import model.*;

@WebServlet("/update")
public class update extends HttpServlet {
	private static final long serialVersionUID = 1L;
       

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		try {
			costservice cst=new  costserviceImpl();
			patient_service psService=new  patient_service_implement();
			supplier_service spservice=new supplier_service_impl();

			
			String id =request.getParameter("UpID");
			String pid=request.getParameter("ptid");
			String supid=request.getParameter("supID");
			
			
			
			if(id!=null) {
			
				String cost=request.getParameter("cost");
				String date=request.getParameter("date");
				String description=request.getParameter("description");
				
				cost c= new cost();
				
				c.setCostid(Integer.parseInt(id));
				c.setCost(Integer.parseInt(cost));
				c.setDate(date);
				c.setDescription(description);
				
				if(cst.updatecost(c) == true) {
					response.sendRedirect("costs.jsp");
				}
				
			}
			else if(pid!=null)  
			{
				
				
				
				int pid1=Integer.parseInt(pid);
				String name=request.getParameter("pname");
				String pAge=request.getParameter("age");
				String weight=request.getParameter("weight");
				String height=request.getParameter("height");
				String address=request.getParameter("address");
				String diagnose=request.getParameter("diagnose");
				String drugs=request.getParameter("drugs");
				
				patients p=new patients();
				
				p.setPid(pid1);
				p.setPname(name);
				p.setAge(pAge);
				p.setWeight(weight);
				p.setHeight(height);
				p.setAddress(address);
				p.setDiagnose(diagnose);
				p.setDrugs(drugs);
				
				if(psService.updatePatient(p) == true) {
					response.sendRedirect("OPDm.jsp");
				}
			}else if(supid!=null) {
				int supiD=Integer.parseInt(supid);
				String name=request.getParameter("SupName");
				String address=request.getParameter("supAddress");
				String contactNo=request.getParameter("supContact");
				String mail=request.getParameter("supMail");
				String date=request.getParameter("joinDate");
				String category=request.getParameter("category");
				
				suppliers sp=new suppliers();
				
				 
				sp.setSupplierID(supiD);
				sp.setName(name);
				sp.setAddress(address);
				sp.setContactNumber(contactNo);				
				sp.setEmail(mail);
				sp.setJoin_date(date);
				sp.setItem(category);
				
				if(spservice.updatesupplier(sp)) {
					response.sendRedirect("SupplierManagement.jsp");
				}
				
			}
			
		} catch (Exception e) {
			System.out.println(e);
		}
		
		
		
		

	}

}
