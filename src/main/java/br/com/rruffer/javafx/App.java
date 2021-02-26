package br.com.rruffer.javafx;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;

public class App extends Application {
	
	private final Logger log = LogManager.getLogger(getClass());

	@Override
	public void start(Stage primaryStage) throws Exception {

		try {
			log.debug("Iniciando APP...");
			Parent root = (BorderPane) FXMLLoader.load(getClass().getResource("/views/MainApp.fxml"));
//			Scene scene = new Scene(root, 400, 400);
			Scene scene = new Scene(root);
			scene.getStylesheets().add(getClass().getResource("/css/application.css").toExternalForm());
			primaryStage.setScene(scene);
			primaryStage.show();
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	public static void main(String[] args) {
		launch(args);

	}
}
