<%@ page import="model.*" %>
<%@ page import="service.*" %>
<%@ page import="java.util.ArrayList" %>

<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html lang="en">
<head>
<title>About us</title>
<meta charset="utf-8">
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<meta name="description" content="Health medical template project">
<meta name="viewport" content="width=device-width, initial-scale=1">
<link rel="stylesheet" type="text/css" href="styles/bootstrap4/bootstrap.min.css">
<link href="plugins/font-awesome-4.7.0/css/font-awesome.min.css" rel="stylesheet" type="text/css">
<link rel="stylesheet" type="text/css" href="plugins/OwlCarousel2-2.2.1/owl.carousel.css">
<link rel="stylesheet" type="text/css" href="plugins/OwlCarousel2-2.2.1/owl.theme.default.css">
<link rel="stylesheet" type="text/css" href="plugins/OwlCarousel2-2.2.1/animate.css">
<link rel="stylesheet" type="text/css" href="styles/about.css">
<link rel="stylesheet" type="text/css" href="styles/about_responsive.css">
<link rel="stylesheet" type="text/css" href="cssFiles/costs.css" >

</head>
<body>

<div class="super_container">

	<!-- Menu -->

	<div class="menu trans_500">
		<div class="menu_content d-flex flex-column align-items-center justify-content-center text-center">
			<div class="menu_close_container"><div class="menu_close"></div></div>
			<form action="#" class="menu_search_form">
				<input type="text" class="menu_search_input" placeholder="Search" required="required">
				<button class="menu_search_button"><i class="fa fa-search" aria-hidden="true"></i></button>
			</form>
			<ul>
				<li class="menu_item"><a href="index.jsp">Home</a></li>
				<li class="menu_item"><a href="#">About us</a></li>
				<li class="menu_item"><a href="#">Services</a></li>
				<li class="menu_item"><a href="news.jsp">News</a></li>
				<li class="menu_item"><a href="contact.jsp">Contact</a></li>
			</ul>
		</div>
		
	</div>
	
	<!-- Home -->

	<div class="home">
		<!-- <div class="background_image" style="background-image:url(images/about.jpg)"></div> -->
		<div class="parallax_background parallax-window" data-parallax="scroll" data-image-src="images/about.jpg" data-speed="0.8"></div>

		<!-- Header -->

		<header class="header" id="header">
			<div>
				<div class="header_top">
					<div class="container">
						<div class="row">
							<div class="col">
								<div class="header_top_content d-flex flex-row align-items-center justify-content-start">
									<div class="logo">
										<a href="#">suwapiyasa<span>+</span></a>	
									</div>
									<div class="header_top_extra d-flex flex-row align-items-center justify-content-start ml-auto">
										<div class="header_top_nav">
											<ul class="d-flex flex-row align-items-center justify-content-start">
												
												<li><a href="#">Appointment</a></li>
											</ul>
										</div>
										<div class="header_top_phone">
											<i class="fa fa-phone" aria-hidden="true"></i>
											<span>0914113021</span>
										</div>
									</div>
									<div class="hamburger ml-auto"><i class="fa fa-bars" aria-hidden="true"></i></div>
								</div>
							</div>
						</div>
					</div>
				</div>
				<div class="header_nav" id="header_nav_pin">
					<div class="header_nav_inner">
						<div class="header_nav_container">
							<div class="container">
								<div class="row">
									<div class="col">
										<div class="header_nav_content d-flex flex-row align-items-center justify-content-start">
											<nav class="main_nav">
												<ul class="d-flex flex-row align-items-center justify-content-start">
													<li><a href="index.jsp">Home</a></li>
													<li class="active"><a href="about.jsp">About Us</a></li>
													<li><a href="services.jsp">Services</a></li>
													<li><a href="news.jsp">News</a></li>
													<li><a href="contact.jsp">Contact</a></li>
												</ul>
											</nav>
											
										</div>
									</div>
								</div>
							</div>
						</div>
					</div>
				</div>	
			</div>
		</header>

		<div class="home_container">
			<div class="container">
				<div class="row">
					<div class="col">
						<div class="home_content">
							<div class="home_title">Finance</div>
						</div>
					</div>
				</div>
			</div>
		</div>
	</div>

	<!-- Finance -->

	<%
		costservice cost=new costserviceImpl();
		HttpSession hs=request.getSession();
		hs.setAttribute("allcost", cost.getAllCost());
		
		App_pys_service pys=new App_pys_service_impl();
		HttpSession hs2=request.getSession();
		hs2.setAttribute("allApPys", pys.getAppPym());
		
		EmpService emp=new EmpServiceImp();
		HttpSession hs3=request.getSession();
		hs3.setAttribute("AllEmpSal", emp.getEmpSal());
	%>

<div class="tab">
  <button class="tablinks" onclick="openCity(event, 'Add')">Add Costs</button>
  <button class="tablinks" onclick="openCity(event, 'Trans')">View Transactions</button>
  <button class="tablinks" onclick="openCity(event, 'Reports')">Financial Reports</button>
</div>

<div id="Add" class="tabcontent">
 <form method="post" action=Addcost >
	<table>
		<tr><td>Description</td><td><input type="text" name="description" required></td></tr>
		<tr><td>Paid</td><td><input type="text" name="cost"required></td></tr>
		<tr><td>Date</td><td><input type="date" name="date"required></td></tr>
		<tr><td><input type="submit" value="ADD"></td></tr>
	</table>
	</form>
</div>

<div id="Trans" class="tabcontent">
<h2>Costs</h2>
<table>
	<tr>
		<td width=100px>CostID</td>
		<td width=100px>Cost Name</td>	
		<td width=100px>cost</td>
		<td width=100px>Date</td>
	</tr>
	<%
		ArrayList<cost> cst=(ArrayList<cost>) session.getAttribute("allcost");
		for(cost c:cst){
	%>
	
	<tr>
		<td
			 onclick="location.href='costs.jsp?id=<%=c.getCostid()%>'">
		<%
			out.print(c.getCostid());
		%>
		</td>
		<td
			onclick="location.href='costs.jsp?id=<%=c.getCostid()%>'">
			<%
				out.print(c.getDescription());
			%>
		</td>
		<td
			onclick="location.href='costs.jsp?id=<%=c.getCostid()%>'">
			<%
				out.print(c.getCost());
			%>	
			</td>
		<td
			onclick="location.href='costs.jsp?id=<%=c.getCostid()%>'">
			<%
				out.print(c.getDate());
			%>	
		</td>
			
	</tr>
	
	
	<%
		}
	%>
</table>
<div class="appointment">
<h2>Appointment Payment</h2>
<table>
	<tr>
		<td width=100px>AppointmentPayId</td>
		<td width=100px>Payment</td>	
		<td width=100px>Doctor Charge</td>
		<td width=100px>Institute Charge</td>
	</tr>
		<%
		ArrayList<appointment_payment> apt=(ArrayList<appointment_payment>) session.getAttribute("allApPys");
		for(appointment_payment a:apt){
		%>
	<tr>
	
		<td
			 onclick="location.href='costs.jsp?id=<%=a.getPayId()%>'">
			 <%
			 out.print(a.getPayId());
			 %>
			 
		</td>	
		<td
			 onclick="location.href='costs.jsp?id=<%=a.getPayId()%>'">
			<%
			out.print(a.getPayment());
			%>
			 
		</td>
		<td
			 onclick="location.href='costs.jsp?id=<%=a.getPayId()%>'">
			 <%
			 out.print(a.getDoctorPy());
			 %>
			 
		</td>
		<td
			 onclick="location.href='costs.jsp?id=<%=a.getPayId()%>'">
			 <%
			 out.print(a.getInstitutePy());
			 %>
			 
		</td> 
		
	</tr>
	<%
		}
	%>
</table>
</div>
<div class="appointment">
<h2>Employee Salaries</h2>
<table>
	<tr>
		<td width=100px>EmployeeId</td>
		<td width=100px>Basic Salaries</td>	
		<td width=100px>Bonus</td>
		<td width=100px>Total</td>
	</tr>
		<%
		ArrayList<employee> es=(ArrayList<employee>) session.getAttribute("AllEmpSal");
		for(employee e:es){
		%>
	<tr>
	
		<td
			 onclick="location.href='costs.jsp?id=<%=e.getEid()%>'">
			 <%
			 out.print(e.getEid());
			 %>
			 
		</td>	
		<td
			 onclick="location.href='costs.jsp?id=<%=e.getEid() %>'">
			<%
			out.print(e.getBasicS());
			%>
			 
		</td>
		<td
			 onclick="location.href='costs.jsp?id=<%=e.getEid()%>'">
			 <%
			 out.print(e.getBonus());
			 %>
			 
		</td>
		<td
			 onclick="location.href='costs.jsp?id=<%=e.getEid()%>'">
			 <%
			 out.print(e.getBonus()+e.getBasicS());
			 %>
			 
		</td>
		
	</tr>
	<%
		}
	%>
</table>
</div>
</div>

<div id="Reports" class="tabcontent">
 <div class="tab">
  <button class="tablinks" onclick="openCity(event, 'DailyR')">Daily Report</button>
  <button class="tablinks" onclick="openCity(event, 'MonthlyR')">Monthly Report</button>
  </div>
  <div id="DailyR" class="tabcontent">
	<h1>This is Daily Report</h1>
	
</div>
<div id="MonthlyR" class="tabcontent">
	<h1>This is Monthly Report</h1>
</div>
</div>

<script>
function openCity(evt, cityName) {
  var i, tabcontent, tablinks;
  tabcontent = document.getElementsByClassName("tabcontent");
  for (i = 0; i < tabcontent.length; i++) {
    tabcontent[i].style.display = "none";
  }
  tablinks = document.getElementsByClassName("tablinks");
  for (i = 0; i < tablinks.length; i++) {
    tablinks[i].className = tablinks[i].className.replace(" active", "");
  }
  document.getElementById(cityName).style.display = "block";
  evt.currentTarget.className += " active";
}
</script>

	

	

	

	

	<!-- Footer -->

	<footer class="footer">
		<div class="parallax_background parallax-window" data-parallax="scroll" data-image-src="images/footer.jpg" data-speed="0.8"></div>
		<div class="footer_content">
			<div class="container">
				<div class="row">

					<!-- Footer About -->
					<div class="col-lg-3 footer_col">
						<div class="footer_about">
							<div class="logo">
								<a href="#">suwapiyasa<span>+</span></a>	
							</div>
							<div class="footer_about_text">Lorem ipsum dolor sit amet, lorem maximus consectetur adipiscing elit. Donec malesuada lorem maximus mauris.</div>
							
							
						</div>
					</div>
					
					<!-- Footer Contact -->
					<div class="col-lg-5 footer_col">
						<div class="footer_contact">
							<div class="footer_contact_title">Quick Contact</div>
							<div class="footer_contact_form_container">
								<form action="#" class="footer_contact_form" id="footer_contact_form">
									<div class="d-flex flex-xl-row flex-column align-items-center justify-content-between">
										<input type="text" class="footer_contact_input" placeholder="Name" required="required">
										<input type="email" class="footer_contact_input" placeholder="E-mail" required="required">
									</div>
									<textarea class="footer_contact_input footer_contact_textarea" placeholder="Message" required="required"></textarea>
									<button class="footer_contact_button">send message</button>
								</form>
							</div>
						</div>
					</div>

					<!-- Footer Hours -->
					<div class="col-lg-4 footer_col">
						<div class="footer_hours">
							<div class="footer_hours_title">Opening Hours</div>
							<ul class="hours_list">
								<li class="d-flex flex-row align-items-center justify-content-start">
									<div>Monday and Thursday</div>
									<div class="ml-auto">8.00 -19.00</div>
								</li>
								<li class="d-flex flex-row align-items-center justify-content-start">
									<div>Friday</div>
									<div class="ml-auto">8.00 - 18.30</div>
								</li>
								<li class="d-flex flex-row align-items-center justify-content-start">
									<div>Saturday</div>
									<div class="ml-auto">9.30 - 17.00</div>
								</li>
								<li class="d-flex flex-row align-items-center justify-content-start">
									<div>Sunday</div>
									<div class="ml-auto">9.30 - 15.00</div>
								</li>
							</ul>
						</div>
					</div>
				</div>
			</div>
		</div>
		<div class="footer_bar">
			<div class="container">
				<div class="row">
					<div class="col">
						<div class="footer_bar_content d-flex flex-sm-row flex-column align-items-lg-center align-items-start justify-content-start">
							<nav class="footer_nav">
								<ul class="d-flex flex-lg-row flex-column align-items-lg-center align-items-start justify-content-start">
									<li class="active"><a href="index.html">Home</a></li>
									<li><a href="about.html">About Us</a></li>
									<li><a href="services.html">Services</a></li>
									<li><a href="news.html">News</a></li>
									<li><a href="contact.html">Contact</a></li>
								</ul>
							</nav>
							<div class="footer_links">
								<ul class="d-flex flex-lg-row flex-column align-items-lg-center align-items-start justify-content-start">
									
									<li><a href="#">Appointment</a></li>
								</ul>
							</div>
							<div class="footer_phone ml-lg-auto">
								<i class="fa fa-phone" aria-hidden="true"></i>
								<span>0914113021</span>
							</div>
						</div>
					</div>
				</div>
			</div>
		</div>
	</footer>
</div>

<script src="js/jquery-3.3.1.min.js"></script>
<script src="styles/bootstrap4/popper.js"></script>
<script src="styles/bootstrap4/bootstrap.min.js"></script>
<script src="plugins/greensock/TweenMax.min.js"></script>
<script src="plugins/greensock/TimelineMax.min.js"></script>
<script src="plugins/scrollmagic/ScrollMagic.min.js"></script>
<script src="plugins/greensock/animation.gsap.min.js"></script>
<script src="plugins/greensock/ScrollToPlugin.min.js"></script>
<script src="plugins/OwlCarousel2-2.2.1/owl.carousel.js"></script>
<script src="plugins/easing/easing.js"></script>
<script src="plugins/parallax-js-master/parallax.min.js"></script>
<script src="js/about.js"></script>
</body>
</html>
