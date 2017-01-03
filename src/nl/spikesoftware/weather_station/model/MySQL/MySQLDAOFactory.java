package nl.spikesoftware.weather_station.model.MySQL;


import nl.spikesoftware.weather_station.model.DAOFactory;
import nl.spikesoftware.weather_station.model.LogDAO;
import nl.spikesoftware.weather_station.model.PersonDAO;

public class MySQLDAOFactory extends DAOFactory {
	@Override
	public PersonDAO getPersonDAO() {
		return new MySQLPersonDAO();
	}

	@Override
	public LogDAO getLogDAO() {
		return new MySQLLogDAO();
	}
}
