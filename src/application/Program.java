package application;

import java.util.Locale;
import java.util.Scanner;

import model.services.Employee;
import model.services.Outsourced;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("name: ");
		String name = sc.nextLine();
		System.out.print("meses trabalhados: ");
		int meses = sc.nextInt();
		System.out.print("salário fixo mensal: ");
		Double salario = sc.nextDouble();
		System.out.println();
		System.out.println("----------------------");
		System.out.println();
		System.out.println("É funcionário tercerizado? (S/N)");
		char resp = sc.next().charAt(0);
		if (resp == 'S') {
			System.out.print("Digite a Tax adicional: ");
			Double tax = sc.nextDouble();
			
			Outsourced os = new Outsourced(name, meses, salario, tax);
			System.out.println(os.salaryCalc(salario, meses, tax));
		}
		if (resp == 'N') {
			System.out.println("Salário total: ");
			Employee emp = new Employee(name, meses, salario);
			System.out.println(emp.salaryCalc(salario, meses, null));
		}

	}

}
