package funcionarioCalc;

public class dfunci {
	public String name;
	public double salariob;
	public double imposto;
	
	public double salariol(){return salariob - imposto;}
	
	public void  salarioTotal(double porcentagem) {salariob += salariob * porcentagem / 100.00;}
	
	

	public String toString() {return "Funcionário " + name + String.format(", $ %.2f",salariol());}

}
