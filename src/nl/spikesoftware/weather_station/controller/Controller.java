package nl.spikesoftware.weather_station.controller;

import java.sql.SQLException;

import nl.spikesoftware.weather_station.view.*;
import nl.spikesoftware.weather_station.model.*;

public class Controller implements CreateUserListener {
	private View view;
	private Model model;
	
	private PersonDAO personDAO = DAOFactory.getPersonDAO();
	
	public Controller(View view, Model model) {
		this.view = view;
		this.model = model;
	}

	@Override
	public void userCreated(CreateUserEvent event) {
		System.out.println("Login event received: " + event.getName() + "; " + event.getPassword());
		
		try {
			personDAO.addPerson(new Person(event.getName(), event.getPassword()));
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	
}
