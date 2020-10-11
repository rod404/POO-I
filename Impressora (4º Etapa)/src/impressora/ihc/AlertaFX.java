package impressora.ihc;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.layoult.AnchorPane;
import javafx.scene.layoult.Pane;
import javafx.scene.Stage;

public class AlertaFX {
	
	public static void info(String mensagem) {
		Alert alerta = new Alert(AlertType.INFORMATION);
		alerta.setTitle("Informação");
		alerta.setHeaderText(null);
		alerta.setContentText(mensagem);
		alerta.showAndWait();
	}
	
	public static void alerta(String mensagem) {
		Alert alerta = new Alert(AlertType.WARNING);
		alerta.setTitle("Aviso");
		alerta.setHeaderText(null);
		alerta.setContentText(mensagem);
		alerta.showAndWait();	
	}
	
	public static void erro(String mensagem) {
		Alert alerta = new Alert(AlertType.ERROR);
		alerta.setTitle("Erro!");
		alerta.setHeaderText(null);
		alerta.setContentText(mensagem);
		alerta.showAndWait();	
	}
	
}
