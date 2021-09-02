package aplicação;
import java.util.Locale;
import java.util.Scanner;
import funcionarioCalc.dfunci;

public class aplicação {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		dfunci funci = new dfunci();
		
		//entrada de dados 
		System.out.print("Nome: ");
		funci.name=sc.nextLine();
		System.out.print("Salário: ");
		funci.salariob=sc.nextDouble();
		System.out.print("Imposto: ");
		funci.imposto=sc.nextDouble();
		
		//Saida de dados 
		System.out.println(funci.toString());
		System.out.println("qual a porcentagem de acrecimo? ");
		double procentagem = sc.nextDouble();
		funci.salarioTotal(procentagem);
		System.out.println();
		System.out.println(funci.toString());
		
		
		
		
		sc.close();
		
		

	}

}
