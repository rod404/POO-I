package classes;

import java.util.Scanner;


public class Bandeja {
	private int quantidade;
	private boolean disponivel; 
	
	//GET_SET
	public int getBandeja_Quantidade() {
		return this.quantidade;
	}
	
	public void setBandeja_Quantidade(int Bquantidade) {
		this.quantidade = Bquantidade;
	}
	
	public boolean getBandeja_Disponivel() {
		return this.disponivel;
	}	
	
	public void setBandeja_Disponivel(boolean Bdisponivel) {
		this.disponivel = Bdisponivel;
	}
		
	//CONSTRUTOR
	public Bandeja() {
		this.disponivel = false;
		this.quantidade = 0;
	}
	
	public void usarBandeja() {
		if(quantidade>=1) {
			System.out.println("Papel Disponivel");
			disponivel = true;
		}else {
			System.out.println("Sem Papel");
			disponivel = false;
			colocarPapel();
		}
	}
	
	public void colocarPapel() {
		Scanner input = new Scanner(System.in);
		while(disponivel!=true) {
			if(disponivel == false) {
				System.out.println("Insira Papel");
				System.out.println("Quantidade");
				System.out.println("[1] 5");
				System.out.println("[2] 10");
				int escolha = input.nextInt();
				if(escolha == 1) {
					quantidade = 5;
					disponivel = true;
				}else if (escolha == 2){
					quantidade = 10;
					disponivel = true;
				}else {
				
				}
				System.out.println("Quantidade de Papel");
				System.out.println(quantidade);
			}
		}
	}
	

}
