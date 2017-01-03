package nl.spikesoftware.weather_station.model.MySQL;


import nl.spikesoftware.weather_station.model.Log;
import nl.spikesoftware.weather_station.model.LogDAO;

import java.util.List;

public class MySQLLogDAO implements LogDAO {
	
	@Override
	public void addEntry(String message) {
		// Not implemented.
	}

	@Override
	public List<Log> getEntries(int number) {
		
		// Not implemented. Get latest "number" log messages.
		return null;
	}
	
	// Maybe no need for update or delete in this case.
}
