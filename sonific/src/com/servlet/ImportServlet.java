package com.servlet;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URL;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.jdo.PersistenceManager;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.basis.City;
import com.opencsv.CSVReader;
import com.service.CityService;
import com.service.PMF;


public class ImportServlet extends HttpServlet {
	public void doGet(HttpServletRequest req, HttpServletResponse resp)
			throws IOException {
		resp.setContentType("text/html");
		resp.setCharacterEncoding("UTF-8");
		//String opendataUrl = "http://localhost:8888/csv/Citycsv.csv";
		String opendataUrl = "http://citiessounds2016.appspot.com/csv/Citycsv.csv";
		ArrayList<City> cityFromCsv = new ArrayList<City>();
		int i = 0;
		try {
			URL url = new URL(opendataUrl);
			BufferedReader reader = new BufferedReader(new InputStreamReader(
					url.openStream(), "UTF-8"));

			@SuppressWarnings("resource")
			CSVReader csv = new CSVReader(reader);
			List<String[]> rows = csv.readAll();

			for (String[] row : rows) {
				if (i > 0) {
					City city = new City();
					city.setName(row[0]);
					city.setFoodBasket(Double.parseDouble(row[1]));
					city.setApartmentsCost(Double.parseDouble(row[2]));
					city.setPopulation(Double.parseDouble(row[3]));
					city.setArea(Double.parseDouble(row[4]));
					city.setPopulation(Double.parseDouble(row[5]));
					city.setBudgetForCitizen(Double.parseDouble(row[6]));
					city.setNumberOfOffenders(Double.parseDouble(row[7]));
					city.setNumberOfCrimes(Double.parseDouble(row[8]));
					city.setWhoLeft(Double.parseDouble(row[9]));
					city.setWhoArrived(Double.parseDouble(row[10]));
					city.setTransport(Double.parseDouble(row[11]));
					city.setQueueInKindergartens(Double.parseDouble(row[12]));
					city.setNumberOfSchools(Double.parseDouble(row[13]));
					city.setProfitOrganizations(Double.parseDouble(row[14]));
					city.setAverageSalary(Double.parseDouble(row[15]));
					city.setNumberOfMarriages(Double.parseDouble(row[16]));
					city.setNumberOfDivorces(Double.parseDouble(row[17]));
					city.setPeopleInSport(Double.parseDouble(row[18]));
					city.setSportsSchools(Double.parseDouble(row[19]));
					city.setNumberOfMuseums(Double.parseDouble(row[20]));
					city.setSoundcloud(row[21]);
					city.setKoord1(Double.parseDouble(row[22]));
					city.setKoord2(Double.parseDouble(row[23]));
					cityFromCsv.add(city);
				}
				i++;
			}
			reader.close();
		}
		catch (IOException e) {
			resp.getWriter().println("Не могу прочитать CSV файл");
		}
		
		CityService service = new CityService();
		
		for (City city : cityFromCsv) {
			
			Long id = service.create(city);

		}
	}
}