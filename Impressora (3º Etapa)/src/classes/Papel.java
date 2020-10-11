package classes;

import java.util.Scanner;

public class Papel extends Bandeja{
	private int tipo;
	private String dimensao;
	private boolean definido;
	
	//GET_SET
	public int getPapel_Tipo() {
		return this.tipo;
	}
	
	public void setPapel_Tipo(int Ptipo) {
		this.tipo = Ptipo;
		
	}
	
	public String getPapel_Dimensao() {
		return this.dimensao;
	}
	
	public void setPapel_Dimensao(String Pdimensao) {
		this.dimensao = Pdimensao;
		
	}
	
	public boolean getPapel_Definido() {
		return this.definido;
	}
	
	public void setPapel_Definido(boolean Pdefinido) {
		this.definido = Pdefinido;
	}
	
	//CONSTRUTOR
	public Papel () {
		this.tipo = 0;
		this.dimensao = "A4";
		this.definido = false;
	}
	
	//CONSTRUTOR SOBRECARGA
	public Papel (int tipo, String dimensao, boolean definido) {
		this.tipo = tipo;
		this.dimensao = dimensao;
		this.definido = definido;
	}
	
	public void especPapel() {
		Scanner input = new Scanner(System.in);
		while (definido == false) {
			System.out.println("Tipo de Papel");
			System.out.println("[1] Sulfite");
			System.out.println("[2] Reciclado");
			tipo = input.nextInt();
			if(tipo == 1) {
				System.out.println("Sulfite selecionado");
				definido = true;
			}
			if(tipo == 2) {
				System.out.println("Reclicado selecionado");
				definido = true;
			}
		}
		definido = false;
		
		while (definido == false) {
			System.out.println("Dimensão do Papel");
			System.out.println("[1] A4");
			System.out.println("[2] A3");
			tipo = input.nextInt();
			if(tipo == 1) {
				System.out.println("A4 selecionado");
				definido = true;
				dimensao = "A4";
			}
			if(tipo == 2) {
				System.out.println("A3 selecionado");
				definido = true;
				dimensao = "A3";
			}

		}

	}

	@Override
	public void verificarImpressao() {
		if(definido == true) {
			System.out.println("Definido");
		}
		
	}
	
}
