<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">

<html>
	<head>
		<meta name="viewport" content="width=device-width, height=device-height, initial-scale=1.0">
		<link rel="icon" type="image/png" href="images/favicon.jpegi ">
		<link rel="stylesheet" href="/boardgames/css/TerraformingMars.css" type="text/css">
		<title>Terraforming Mars - Player Card</title>
	</head>
	
	<body>
	<div class="container">
	<FORM ACTION="productionphase" METHOD="POST">
		<h1>Terraforming Mars</h1>
		
		<div class="generations">
		<a>Generation <% out.println(session.getAttribute("Generation")); %></a><br><br>
		</div>
		
		<%-- First Check if there is a session, redirect to different page if not --%>
		<%
			if (session.getAttribute("TerraformRating") == null){
				RequestDispatcher dispatch = request.getRequestDispatcher("TerraformingMars");
				dispatch.forward(request, response);
				
			}
		%>
		
		<%-- This will contain all the resources--%>
		
		<div class="resources">
			<a>Terraform Rating</a><br>
			<input type='button' name='subtract' onclick='javascript: document.getElementById("tr").value--;' value='-'/>
			<input type="text" id="tr" name="TerraformRating" value="<% out.print(session.getAttribute("TerraformRating")); %>">
			<input type='button' name='add' onclick='javascript: document.getElementById("tr").value++;' value='+'/>
					
			<br><a>MegaCredit</a><br>
			<input type='button' name='subtract' onclick='javascript: document.getElementById("mc").value--;' value='-'/>
			<input type="text" id="mc" name="MegaCredit" value="<% out.print(session.getAttribute("MegaCredit"));%>">
			<input type='button' name='add' onclick='javascript: document.getElementById("mc").value++;' value='+'/>		
			<br>
			<input type='button' name='subtract' onclick='javascript: document.getElementById("mcp").value--;' value='-'/>
			<input type="text" id="mcp" name="MegaCreditProduction" value="<% out.print(session.getAttribute("MegaCreditProduction"));%>">
			<input type='button' name='add' onclick='javascript: document.getElementById("mcp").value++;' value='+'/>	
			
			<br><a>Steel</a><br>
			<input type='button' name='subtract' onclick='javascript: document.getElementById("st").value--;' value='-'/>
			<input type="text" id="st" name="Steel" value="<% out.print(session.getAttribute("Steel")); %>">
			<input type='button' name='add' onclick='javascript: document.getElementById("st").value++;' value='+'/>		
			<br>
			<input type='button' name='subtract' onclick='javascript: document.getElementById("stp").value--;' value='-'/>
			<input type="text" id="stp" name="SteelProduction" value="<% out.print(session.getAttribute("SteelProduction")); %>">
			<input type='button' name='add' onclick='javascript: document.getElementById("stp").value++;' value='+'/>
			
			<br><a>Titanium</a><br>
			<input type='button' name='subtract' onclick='javascript: document.getElementById("ti").value--;' value='-'/>
			<input type="text" id="ti" name="Titanium" value="<% out.print(session.getAttribute("Titanium")); %>">
			<input type='button' name='add' onclick='javascript: document.getElementById("ti").value++;' value='+'/>		
			<br>
			<input type='button' name='subtract' onclick='javascript: document.getElementById("tip").value--;' value='-'/>
			<input type="text" id="tip" name="TitaniumProduction" value="<% out.print(session.getAttribute("TitaniumProduction")); %>">
			<input type='button' name='add' onclick='javascript: document.getElementById("tip").value++;' value='+'/>	
			
			<br><a>Plants</a><br>
			<input type='button' name='subtract' onclick='javascript: document.getElementById("pl").value--;' value='-'/>
			<input type="text" id="pl" name="Plants" value="<% out.print(session.getAttribute("Plants")); %>">
			<input type='button' name='add' onclick='javascript: document.getElementById("pl").value++;' value='+'/>		
			<br>
			<input type='button' name='subtract' onclick='javascript: document.getElementById("plp").value--;' value='-'/>
			<input type="text" id="plp" name="PlantsProduction" value="<% out.print(session.getAttribute("PlantsProduction")); %>">
			<input type='button' name='add' onclick='javascript: document.getElementById("plp").value++;' value='+'/>		
			
			<br><a>Energy</a><br>
			<input type='button' name='subtract' onclick='javascript: document.getElementById("en").value--;' value='-'/>
			<input type="text" id="en" name="Energy" value="<% out.print(session.getAttribute("Energy")); %>">
			<input type='button' name='add' onclick='javascript: document.getElementById("en").value++;' value='+'/>		
			<br>
			<input type='button' name='subtract' onclick='javascript: document.getElementById("enp").value--;' value='-'/>
			<input type="text" id="enp" name="EnergyProduction" value="<% out.print(session.getAttribute("EnergyProduction")); %>">
			<input type='button' name='add' onclick='javascript: document.getElementById("enp").value++;' value='+'/>		
			
			<br><a>Heat</a><br>
			<input type='button' name='subtract' onclick='javascript: document.getElementById("he").value--;' value='-'/>
			<input type="text" id="he" name="Heat" value="<% out.print(session.getAttribute("Heat")); %>">
			<input type='button' name='add' onclick='javascript: document.getElementById("he").value++;' value='+'/>		
			<br>
			<input type='button' name='subtract' onclick='javascript: document.getElementById("hep").value--;' value='-'/>
			<input type="text" id="hep" name="HeatProduction" value="<% out.print(session.getAttribute("HeatProduction")); %>">
			<input type='button' name='add' onclick='javascript: document.getElementById("hep").value++;' value='+'/>		
			<br>
		</div>
		
		<%-- Submit when it's time for production phase --%>
		<div class="production"><br><INPUT TYPE="SUBMIT" value="Production Phase"></div>
	</FORM>
	</div>
	</div>
	</body>
</html>