package impressora.ihc;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.layoult.AnchorPane;
import javafx.scene.layoult.Pane;
import javafx.scene.Stage;

public class CadastrarImpressãoFX extends Application {
	
	public void start(Stage stage) throws Exception {
		Pane pane = new AnchorPane();
		pane.setPrefSize(320, 240);
		
		Scene scene = new Scene(pane);
		stage.setScene(scene);
		stage.setTitle("Realizar nova Impressão");
		stage.setResizable(false);
		stage.show();
	}

}
