package servlet;

import model.*;
import service.*;
import java.io.IOException;


import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/Add")
public class Add extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
			
		
		try {
			
			costservice csService=new costserviceImpl();
			patient_service psService=new  patient_service_implement();
			customer_service custService=new customer_service_impl();
			supplier_service supService=new supplier_service_impl();
			stock_manage stm=new stock_manage_imp();
			EmpService empS=new EmpServiceImpl();
			doctor_service docS=new doctor_service_impl();
			AppPatient_service APPts=new AppPatient_service_Impl();
			
			String description=request.getParameter("description");
			
			String pname=request.getParameter("pname");
			
			String email=request.getParameter("email");
			String password=request.getParameter("passw");
			
			String supname=request.getParameter("spname");
			
			String itemname=request.getParameter("ItemName");
			
			String empname=request.getParameter("empname");
			
			String docname=request.getParameter("dcname");
			
			String ApPtname=request.getParameter("APTname");
			
			if(description!=null) {
				String cost=request.getParameter("cost");
				String date=request.getParameter("date");
				cost c=new cost(description,Integer.parseInt(cost),date);
				
				if(csService.addcost(c)) 
					response.sendRedirect("costs.jsp");
				
			}else if(pname!=null) {
				String pAge=request.getParameter("age");
				String weight=request.getParameter("weight");
				String height=request.getParameter("height");
				String address=request.getParameter("address");
				String diagnose=request.getParameter("diagnose");
				String drugs=request.getParameter("drugs");
				
				patients p=new patients(pname, pAge, weight, height, address, diagnose, drugs);
				
				if(psService.addPatient(p)) {
					response.sendRedirect("OPDm.jsp");
				}
				
			}else if(email!=null & password!=null) {
				String custname=request.getParameter("Cname");
				String cAge=request.getParameter("Cage");
				String mobile=request.getParameter("Cmobno");
				String address=request.getParameter("address");
				
				customer cust=new customer(custname, cAge, mobile, email, address, password);
				
				if(custService.addcustomer(cust)) {
					response.sendRedirect("index.jsp");
				}
				
			}else if(supname!=null) {
				String address=request.getParameter("address");
				String mobno=request.getParameter("mobno");
				String mail=request.getParameter("mail");
				String joindate=request.getParameter("joindate");
				String itemCategory=request.getParameter("itemCategory");
				
				suppliers sp1=new suppliers(supname, address, mobno, mail, joindate,itemCategory);
				
				if(supService.addsupplier(sp1)) {
					response.sendRedirect("SupplierManagment.jsp");
				}
			}
			else if(itemname!=null) {
				String BrandName =request.getParameter("BrandName");
				String type=request.getParameter("type");
				String suplID =request.getParameter("supID");
				String suplName=request.getParameter("suplName");
				String price= request.getParameter("price");
				String quantity=request.getParameter("quantity");
				String level = request.getParameter("level");
				String perTablet=request.getParameter("perTablet");
				String perCard=request.getParameter("perCard");
				
				stock st1=new stock(itemname, type, BrandName, suplID, suplName, price, quantity, level, perTablet, perCard);
				if(stm.addItem(st1)) {
					response.sendRedirect("PharmacyMng.jsp");
				}
				
			}else if(empname!=null) {
				String empaddress=request.getParameter("empaddress");
				String empmobno=request.getParameter("empmobno");
				String empNIC=request.getParameter("empNIC");
				String designation=request.getParameter("designation");
				
				Employee emp= new Employee(empname, designation, empmobno,empNIC, empaddress);
				if(empS.addEmployee(emp)) {
					response.sendRedirect("EmployeeManagement.jsp");
				}
			}
			else if(docname!=null) {
				String Dage=request.getParameter("Dage");
				String specialization=request.getParameter("specialization");
				String dcontactno=request.getParameter("dcontactno");
				String dpassword=request.getParameter("dpassword");
				String dmail=request.getParameter("dmail");
				String days=request.getParameter("days");
				
				doctor dc=new doctor(docname,Dage, specialization, dcontactno, dpassword, days, dmail);
				if(docS.addDoc(dc)) {
					response.sendRedirect("DoctorList.jsp");
				}
			}else if(ApPtname!=null) {
				String DOCID=request.getParameter("DOCID");
				String APTage=request.getParameter("APTage");
				String APTgender=request.getParameter("APTgender");
				String APTcontactno=request.getParameter("APTcontactno");
				String APTmail=request.getParameter("APTmail");
				String APTaddress=request.getParameter("APTaddress");
				int did=Integer.parseInt(DOCID);
				
				Appointment_patient APts=new Appointment_patient();
				APts.setD_id(did);
				APts.setP_name(ApPtname);
				APts.setP_age(APTage);
				APts.setP_address(APTaddress);
				APts.setP_email(APTmail);
				APts.setP_phone(APTcontactno);
				APts.setP_gender(APTgender);
				if(APPts.addappointpatient(APts)) {
					response.sendRedirect("EditAppointmentPatient.jsp");
				}
			}
			
		} catch (Exception e) {
			System.out.println(e);
			}
		
		
		
		
		
	}

}
