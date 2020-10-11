package classes;

import java.util.Scanner;

public class Conexão {
	private int tipo;
	private int intensidade;
	private boolean conectado;
	
	//GET_SET
	public int getConexao_Tipo() {
		return this.tipo;
	}
	
	public void setConexao_Tipo(int Ctipo) {
		this.tipo = Ctipo;
	}
	
	public int getConexao_Intensidade() {
		return this.intensidade;
	}
	
	public void setConexao_Intensidade(int Cintensidade) {
		this.intensidade = Cintensidade;
	}
	
	public boolean getConexao_Conectado() {
		return this.conectado;
	}
	
	public void setConexao_Conectado(boolean Cconectado) {
		this.conectado = Cconectado;
	}
	
	//CONSTRUTOR
	public Conexão (){
		this.tipo = 0;
		this.intensidade = 0;
		this.conectado = false;
	}
	
	public void conectar() {
		Scanner input = new Scanner(System.in);
		while(conectado!=true) {
			System.out.println("Conexão");
			System.out.println("[1] Ethernet");
			System.out.println("[2] Wi-Fi");
			tipo=input.nextInt();
			if (tipo==1||tipo==2) {
				conectado=true;
				System.out.println("Conectado");
				if(tipo==1) {
					intensidade = 100;
					System.out.print("Intensidade do sinal:");
					System.out.println(intensidade);
				}
				if(tipo==2) {
					intensidade = 50;
					System.out.print("Intensidade do sinal:");
					System.out.println(intensidade);
				}
			}
		}
	}
}
	


		
