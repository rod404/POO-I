package classes;

import java.util.Scanner;

public class Impressão {
	private String dimensao;
	private int formato;
	private	String orientacao;
	private boolean economico;
	private int quantidade;
	
	//GET_SET
	public String getImpressao_Dimensao() {
		return this.dimensao;
	}
	
	public void setImpressao_Dimensao(String Idimensao) {
		this.dimensao = Idimensao;
	}
	
	public int getImpressao_Formato() {
		return this.formato;
	}
	
	public void setImpressao_Formato(int Iformato) {
		this.formato = Iformato;
	}
	
	public String getImpressao_Orientacao() {
		return this.orientacao;
	}
	
	public void setImpressao_Orientacao(String Iorientacao) {
		this.orientacao = Iorientacao; 
	}
	
	public boolean getImpressao_economico() {
		return this.economico;
	}
	
	public void setImpressao_economico(boolean Ieconomico) {
		this.economico = Ieconomico;
	}
	
	public int getImpressao_quantidade() {
		return this.quantidade;
	}
	
	public void setImpressao_quantidade(int Iquantidade) {
		this.quantidade = Iquantidade;
	}
	
	//CONSTRUTOR
	public Impressão() {
		this.dimensao = "A4";
		this.formato = 1;
		this.orientacao = "Retrato";
		this.economico = false;
		this.quantidade = 1;
	}
	
	//CONSTRUTOR SOBRECARGA
	public Impressão(String dimensao, int formato, String orientacao, boolean economico, int quantidade) {
		this.dimensao = dimensao;
		this.formato = formato;
		this.orientacao = orientacao;
		this.economico = economico;
		this.quantidade = quantidade;
	}
	
	public void obterValores() {
		Papel papel = new Papel();
		dimensao = papel.getPapel_Dimensao();
		Scanner input = new Scanner(System.in);
		while (economico == false) {
			System.out.println("Formato");
			System.out.println("[1] PDF");
			System.out.println("[2] JPEG");
			formato = input.nextInt();
			if(formato == 1) {
				System.out.println("PDF selecionado");
				economico = true;
			}
			if (formato == 2) {	
				System.out.println("JPEG selecionado");
				economico = true;
			}
		}
		System.out.println();
		economico = false;
		while (economico == false) {
			System.out.println("Orientação");
			System.out.println("[1] Retrato");
			System.out.println("[2] Paisagem");
			formato = input.nextInt();
			if(formato == 1) {
				System.out.println("Retrato selecionado");
				economico = true;
			}
			if (formato == 2) {	
				System.out.println("Paisagem selecionado");
				economico = true;
			}
		}
		System.out.println();
		economico = false;
		System.out.println("Quantidade de Paginas?");
		quantidade = input.nextInt();
		System.out.print("Paginas:");
		System.out.println(quantidade);
		System.out.println("Config realizada");
	}

}
