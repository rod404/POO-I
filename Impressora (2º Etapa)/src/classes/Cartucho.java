package classes;

import java.util.Scanner;

public class Cartucho extends Bandeja{
	private int carga;
	private int cor;
	private boolean vazio; 
	
	//GET_SET
	public int getCartucho_Carga() {
		return this.carga;
	}
	
	public void setCartucho_Carga(int Ccarga) {
		this.carga = Ccarga;
	}
	
	public int getCartucho_Cor() {
		return this.cor;
	}
	
	public void setCartucho_Cor(int Ccor) {
		this.cor = Ccor;
	}
	
	public boolean getCartucho_Vazio() {
		return this.vazio;
	}
	
	public void setCartucho_Vazio(boolean Cvazio) {
		this.vazio = Cvazio;
	}
	
	//CONSTRUTOR
	public Cartucho() { 
		this.vazio = false;
		this.carga = 0;
		this.cor = 0; 
	}
	
	//CONSTRUTOR SOBRECARGA
	public Cartucho(boolean vazio, int carga, int cor) { 
		this.vazio = vazio;
		this.carga = carga;
		this.cor = cor; 
	}
	
	public void usarCartucho() {
		if (carga>20) {
			System.out.println("Tinta Disponivel");
			vazio = false;
		}else {
			System.out.println("Sem Tinta");
			vazio = true;
			colocarTinta();
		}
	}
	
	public void colocarTinta() {
        Scanner input = new Scanner(System.in);
        while (vazio != false) {
            System.out.println("Cor desejada:");
            System.out.println("[0] Preto");
            System.out.println("[1] Vermelho");
            System.out.println("[2] Verde");
            System.out.println("[3] Azul");
            int escolha = input.nextInt();
            if (escolha == 0) {
                carga = 100;
                vazio = false;
                System.out.println("Cor escolhida: Preto");
            }
            if (escolha == 1) {
                carga = 100;
                vazio = false;
                System.out.println("Cor escolhida: Vermelho");
            }
            if (escolha == 2) {
                carga = 100;
                vazio = false;
                System.out.println("Cor escolhida: Verde"); 
            }
            if (escolha == 3) {
                carga = 100;
                vazio = false;
                System.out.println("Cor escolhida: Azul");
            }   
        }   
    }

	@Override
	public void verificarImpressao() {
		if(vazio == true) {
			carga = 0;
			System.out.println("Vazio");
		}
	}	

}
