package TerraformingMars;

import java.io.IOException;

import javax.servlet.annotation.WebServlet;

import java.io.*;
import java.sql.*;
import java.util.*;
import java.net.*;
import javax.servlet.*;
import javax.servlet.http.*;

/**
 * Servlet implementation class productionphase
 */
@WebServlet("/productionphase")
public class productionphase extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public productionphase() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		// Set Output Type
		response.setContentType("text/html");
		
		// Output stream to STDOUT
        PrintWriter out = response.getWriter();
		
		try{
			// Get the Current Http Session
			HttpSession sesh = request.getSession();
			
			//System.out.println("Terraform Rating");
			int terraformRating = Integer.parseInt(request.getParameter("TerraformRating")); 
			int generation = (int) sesh.getAttribute("Generation");
			
			//System.out.println("MegaCredit");
			int megaCredit = Integer.parseInt(request.getParameter("MegaCredit"));
			int megaCreditProduction = Integer.parseInt(request.getParameter("MegaCreditProduction"));
			megaCredit = megaCredit + megaCreditProduction + terraformRating;
			
			//System.out.println("Steel");
			int steel = Integer.parseInt(request.getParameter("Steel"));
			int steelProduction = Integer.parseInt(request.getParameter("SteelProduction"));
			steel = steel + steelProduction;
			
			//System.out.println("Titanium");
			int titanium = Integer.parseInt(request.getParameter("Titanium"));
			int titaniumProduction = Integer.parseInt(request.getParameter("TitaniumProduction"));
			titanium = titanium + titaniumProduction;
			
			//System.out.println("Plants");
			int plants = Integer.parseInt(request.getParameter("Plants"));
			int plantsProduction = Integer.parseInt(request.getParameter("PlantsProduction"));
			plants = plants + plantsProduction;
			
			//System.out.println("Energy");
			int energy = Integer.parseInt(request.getParameter("Energy"));
			
			//System.out.println("Heat");
			int heat = Integer.parseInt(request.getParameter("Heat"));
			int heatProduction = Integer.parseInt(request.getParameter("HeatProduction"));
			heat = heat + heatProduction + energy;
			
			int energyProduction = Integer.parseInt(request.getParameter("EnergyProduction"));
			energy = energyProduction;
			
			// Set the Values to the Session		
			sesh.setAttribute("Generation", ++generation);
			sesh.setAttribute("TerraformRating", terraformRating);
			sesh.setAttribute("MegaCredit", megaCredit);
			sesh.setAttribute("MegaCreditProduction", megaCreditProduction);
			sesh.setAttribute("Steel", steel);
			sesh.setAttribute("SteelProduction", steelProduction);
			sesh.setAttribute("Titanium", titanium);
			sesh.setAttribute("TitaniumProduction", titaniumProduction);
			sesh.setAttribute("Plants", plants);
			sesh.setAttribute("PlantsProduction", plantsProduction);
			sesh.setAttribute("Energy", energy);
			sesh.setAttribute("EnergyProduction", energyProduction);
			sesh.setAttribute("Heat", heat);
			sesh.setAttribute("HeatProduction", heatProduction);
			
			// Redirect To the Home Page if Success
			RequestDispatcher dispatch = request.getRequestDispatcher("TerraformingMars.jsp");
			dispatch.forward(request, response);
		}
		catch(Exception e){
			// Else Redirect to the New Game
			RequestDispatcher dispatch = request.getRequestDispatcher("TerraformingMars");
			dispatch.forward(request, response);
		}		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
