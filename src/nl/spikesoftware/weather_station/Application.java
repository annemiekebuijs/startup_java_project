package nl.spikesoftware.weather_station;

import javax.swing.SwingUtilities;

import nl.spikesoftware.weather_station.controller.Controller;
import nl.spikesoftware.weather_station.model.Model;
import nl.spikesoftware.weather_station.view.View;

public class Application {

	public static void main(String[] args) {

		/*
		 * This is the recommended way to create a Swing
		 * event dispatch thread -- i.e. to run a Swing
		 * program.
		 */
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

		view.setCreateUserListener(controller);
		view.setSaveListener(controller);
		view.setAppListener(controller);
		model.setPeopleChangedListener(view);
	}
}
