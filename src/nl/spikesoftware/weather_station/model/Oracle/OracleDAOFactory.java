package nl.spikesoftware.weather_station.model.Oracle;


import nl.spikesoftware.weather_station.model.DAOFactory;
import nl.spikesoftware.weather_station.model.LogDAO;
import nl.spikesoftware.weather_station.model.PersonDAO;

public class OracleDAOFactory extends DAOFactory {

	@Override
	public PersonDAO getPersonDAO() {
		return new OraclePersonDAO();
	}

	@Override
	public LogDAO getLogDAO() {
		return new OracleLogDAO();
	}

}
