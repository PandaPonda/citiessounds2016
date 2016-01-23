package com.servlet;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.basis.City;
import com.service.CityService;

public class MapServlet extends HttpServlet {
	public void doGet(HttpServletRequest req, HttpServletResponse resp)
			throws IOException, ServletException {
		CityService service = new CityService();
		
		List<City> cities = service.getAllCities();
		
		req.setAttribute("cities", cities);
		
		RequestDispatcher dispatcher =
				req.getRequestDispatcher("map.jsp");
		
		if (dispatcher != null) {
			dispatcher.forward(req, resp);
		}
	}

}
