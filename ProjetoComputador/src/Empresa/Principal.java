package Empresa;

public class Principal {

	public static void main(String[] args) {
		
		Desktop compA = new Desktop(8,4,600);
		Notebook compB = new Notebook(8,4,15);
		
		Computador comp;
		
		comp = compA;	
		System.out.println("Valor: " + comp.calculaValor());
		
		comp = compB;	
		System.out.println("--------------------------");
		System.out.println("Valor: " + comp.calculaValor());
	}
	}


