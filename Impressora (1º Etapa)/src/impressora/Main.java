package impressora;
import classes.Bandeja;
import classes.Cartucho;
import classes.Conexão;
import classes.Impressão;
import classes.Papel;


public class Main {
	
	public static void main(String[] args) {
		Conexão conexao = new Conexão();
		conexao.conectar();
		System.out.println();
		Bandeja bandeja = new Bandeja();
		bandeja.usarBandeja();
		System.out.println();
		Cartucho cartucho = new Cartucho();
		cartucho.usarCartucho();
		System.out.println();
		Papel papel = new Papel();
		papel.especPapel();
		System.out.println();
		Impressão impressao = new Impressão();
		impressao.obterValores();
	}

}
