package nl.spikesoftware.weather_station.model;

public class DAOFactory {
	public static PersonDAO getPersonDAO() {
		return new PersonDAO();
	}
	
	public static LogDAO getLogDAO() {
		return new LogDAO();
	}
}
