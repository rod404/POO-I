package impressora;
import classes.Bandeja;
import classes.Cartucho;
import classes.Conex�o;
import classes.Impress�o;
import classes.Papel;


public class Main {
	
	public static void main(String[] args) {
		Conex�o conexao = new Conex�o();
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
		Impress�o impressao = new Impress�o();
		impressao.obterValores();
	}

}
