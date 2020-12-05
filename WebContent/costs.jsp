<%@ page import="model.*" %>
<%@ page import="service.*" %>
<%@ page import="java.util.ArrayList" %>

<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html lang="en">
<head>
<title>Finance</title>
<meta charset="utf-8">
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<meta name="description" content="Health medical  project">
<meta name="viewport" content="width=device-width, initial-scale=1">
<link rel="stylesheet" type="text/css" href="styles/bootstrap4/bootstrap.min.css">
<link href="plugins/font-awesome-4.7.0/css/font-awesome.min.css" rel="stylesheet" type="text/css">
<link rel="stylesheet" type="text/css" href="plugins/OwlCarousel2-2.2.1/owl.carousel.css">
<link rel="stylesheet" type="text/css" href="plugins/OwlCarousel2-2.2.1/owl.theme.default.css">
<link rel="stylesheet" type="text/css" href="plugins/OwlCarousel2-2.2.1/animate.css">
<link rel="stylesheet" type="text/css" href="styles/cost.css">
<link rel="stylesheet" type="text/css" href="styles/about_responsive.css">
<link rel="stylesheet" type="text/css" href="cssFiles/costs.css" >
<style>

/* Button used to open the contact form - fixed at the bottom of the page */
.open-button {
  background-color: #555;
  color: white;
  border: none;
  cursor: pointer;
  opacity: 0.8;
  bottom: 23px;
  right: 28px;
  width: 40px;
}

/* The popup form - hidden by default */
.form-popup {
  display: none;
  position: fixed;
  bottom: 0;
  right: 15px;
  border: 3px solid #f1f1f1;
  z-index: 9;
}

/* Add styles to the form container */
.form-container {
  max-width: 285px;
  padding: 10px;
  background-color: white;
}

/* Full-width input fields */
.form-container input[type=text], .form-container input[type=password] {
  width: 100%;
  padding: 15px;
  margin: 5px 0 22px 0;
  border: none;
  background: #f1f1f1;
}

/* When the inputs get focus, do something */
.form-container input[type=text]:focus, .form-container input[type=password]:focus {
  background-color: #ddd;
  outline: none;
}

/* Set a style for the submit/login button */
.form-container .btn {
  background-color: #4CAF50;
  color: black;
  padding: 6px 10px;
  border: none;
  cursor: pointer;
  width: 100%;
  margin-bottom:10px;
  opacity: 0.8;
}

/* Add a red background color to the cancel button */
.form-container .cancel {
  background-color: #d0d6d6 ;
}

/* Add some hover effects to buttons */
.form-container .btn:hover, .open-button:hover {
  opacity: 1;
}
</style>
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
		

		patient_service pat=new  patient_service_implement();
		HttpSession hs3=request.getSession();
		hs3.setAttribute("allpatients", pat.getAllPatients());
		
		
	%>





<h2>Costs</h2>
	<button class="open-button" onclick="openForm()">Open Form</button>

			<div class="form-popup" id="myForm">
			  <form action="Add" class="form-container" method="post">
			    <h1>Cost Add</h1>
			
			    <label for="email"><b>Description</b></label>
			    <input type="text"  name="description" required>
			
			    <label for="psw"><b>Cost</b></label>
			    <input type="text"  name="cost" required>
				
				 <label for="psw"><b>Date</b></label>
			    <input type="date"  name="date" required>
			    				
				<input type="submit"  value="Insert">
			    <button type="button" class="btn cancel" onclick="closeForm()">Close</button>
			  </form>
			</div>
<table>
	<tr>
		<td width=100px>Description</td>	
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
		<td>
				<form action=delete method="post">
					<input type="hidden" value=<%=c.getCostid() %> >
					<input type="submit" value="Delete">
				</form>
		</td>
		<td>
			<a href="CostEdit.jsp?u=<%=c.getCostid()%>">Edit</a>
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
	
		
	</tr>
	<%
		}
	%>
</table>
</div>
<div class="opd">
<h2>OPD Payment</h2>
<table>
	<tr>
		<td width=100px>Patient ID</td>	
		<td width=100px>Doctor Charge</td>
	</tr>
		<%
		ArrayList<patients> apt1=(ArrayList<patients>) session.getAttribute("allpatients");
		for(patients a:apt1){
		%>
	<tr>
	
	
		<td
			 onclick="location.href='costs.jsp?id=<%=a.getPid()%>'">
			<%
			out.print(a.getPid());
			%>
			 
		</td>
		<td
			 onclick="location.href='costs.jsp?id=<%=a.getPid()%>'">
			 <%
			 out.print(a.getFee());
			 %>
			 
		</td>
	
		
	</tr>
	<%
		}
	%>
</table>
<a href="Report.jsp">Get Report</a>
</div>




<script>
	function openForm() {
	  document.getElementById("myForm").style.display = "block";
	}

	function closeForm() {
	  document.getElementById("myForm").style.display = "none";
	}
</script>

	

	

	

	

	<!-- Footer -->

	<footer class="footer">
		<div class="parallax_background parallax-window" data-parallax="scroll" data-image-src="images/footer.jpg" data-speed="0.8"></div>
		<div class="footer_content">
			<div class="container">
				<div class="row">

					<!-- Footer About -->
					
					
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
