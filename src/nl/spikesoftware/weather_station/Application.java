package nl.spikesoftware.weather_station;

import javax.swing.SwingUtilities;

import nl.spikesoftware.weather_station.controller.Controller;
import nl.spikesoftware.weather_station.model.Model;
import nl.spikesoftware.weather_station.view.View;

public class Application {

	public static void main(String[] args) {
		SwingUtilities.invokeLater(new Runnable() {

			@Override
			public void run() {
				runApp();
			}
			
		});
	}
	
	public static void runApp() {
		Model model = new Model();
		View view = new View(model);

		Controller controller = new Controller(view, model);
		
		view.setLoginListener(controller);
	}

}
