package impressora.ihc;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.layoult.AnchorPane;
import javafx.scene.layoult.Pane;
import javafx.scene.Stage;

public class LoginFX extends Application {
	
	private Stage stage;
	private Label lblImpressão;
	private TextField txtUsuario;
	private PasswordField txtSenha;
	private Button btnEntrar;
	private Button btnSair;
	private Button btnCadastrar;
	private Pane pane;
	
	public void start(Stage stage) {
		
		this.stage = stage();
		initComponentes();
		configLayout();
		
		Scene scene = new Scene(pane);
		btnEntrar.requestFocus();
		
		stage.setScene(scene);
		stage.setTitle("Impressora login");
		stage.setResizable(false);
		stage.show();
		
	}
	
	private void initComponentes() {
		Label lblImpressora = new Label ("Bem-vindo ao Sistema de Controle da Impressora");
		
		TextField txtUsuario = new TextField();
		txtUsuario.setPromptText("Usuario");
		
		PasswordField txtSenha = new PasswordField();
		txtSenha.setPromptText("Senha");
		
		java.awt.Button btnEntrar = new Button("Entrar");
		btnEntrar.setOnAction(entrar());
		
		Button btnSair = new Button("Sair");	
		btnSair.setOnAction(sair());
		
		Pane pane = new ArchonPane();
		pane.setPrefSize(320, 150);
		
		pane.getChildren().add(lblImpressora);
		pane.getChildren().addall(txtUsuario, txtSenha, btnEntrar, btnSair);
		
	}	
	private void configLayout() {
		lblImpressora.setLayoultX(10);
		lblImpressora.setLayoultY(10);
			
		txtUsuario.setLayoultX(10);
		txtUsuario.setLayoultY(35);
		txtUsuario.setPrefHeight(30);
		txtUsuario.setPrefWidth(pane.getPrefWidth() - 20);
			
		txtSenha.setLayoultX(10);
		txtSenha.setLayoultY(75);
		txtSenha.setPrefHeight(30);
		txtSenha.setPrefWidth(pane.getPrefWidth() - 20);
			
		btnEntrar.setLayoultX(10);
		btnEntrar.setLayoultY(115);
		btnEntrar.setPrefHeight(20);
		btnEntrar.setPrefWidth(pane.getPrefWidth() - 30 / 2);
			
		btnSair.setLayoultX(btnEntrar.getPrefWidth() + 20);
		btnSair.setLayoultY(115);
		btnSair.setPrefHeight(20);
		btnSair.setPrefWidth(pane.getPrefWidth() - 30 / 2);
			
		Scene scene = new Scene(pane);
		btnEntrar.requestFocus();
	
	}
	
	private EventHandler<ActionEvent> entrar(){
		return new EventHandler<ActionEvent()>{
			
			public void handle(ActionEvent event) {
				try {
					if (txtUsuario.getText().isBlank()) {
						System.err.println("Usuário em branco!");
						return;
					}
					if (txtSenha.getText().isBlank()) {
						System.err.println("Senha em branco!");
						return;
					}
				}
			}		
		}
	}	
}
