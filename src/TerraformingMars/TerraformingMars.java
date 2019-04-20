package TerraformingMars;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import java.io.*;
import java.sql.*;
import java.util.*;
import java.net.*;
import javax.servlet.*;
import javax.servlet.http.*;

/**
 * Servlet implementation class TerraformingMars
 */
@WebServlet("/TerraformingMars")
public class TerraformingMars extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public TerraformingMars() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		HttpSession sesh = request.getSession();
		
		// The Different Types of Materials in the Game
		// Each Except have a value and a production value
		// except for the terraform rating and generation
		int generation = 1;
		int terraformRating = 20;
		
		int megaCredit = 0;
		int megaCreditProduction = 0;
		
		int steel = 0;
		int steelProduction = 0;
		
		int titanium = 0;
		int titaniumProduction = 0;
		
		int plants = 0;
		int plantsProduction = 0;
		
		int energy = 0;
		int energyProduction = 0;
		
		int heat = 0;
		int heatProduction = 0;
		
		// Set the Values to the Session
		sesh.setAttribute("Generation", generation);
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

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
