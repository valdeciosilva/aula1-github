package application;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.Instant;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

//import java.util.Locale;
//import java.util.Scanner;

//import entities.Triangle;

public class Programa {

	// private static final double PI = 3.14159;

	public static void main(String[] args) throws ParseException {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		/*
		 * Locale.setDefault(Locale.US); Scanner sc = new Scanner(System.in); //double
		 * xA, xB, xC, yA, yB, yC; Triangle x, y; x = new Triangle(); y = new
		 * Triangle();
		 * 
		 * System.out.println("Entre as medidas do triangulo X: "); x.a =
		 * sc.nextDouble(); x.b = sc.nextDouble(); x.c = sc.nextDouble();
		 * 
		 * System.out.println("Entre as medidas do triangulo Y: "); y.a =
		 * sc.nextDouble(); y.b = sc.nextDouble(); y.c = sc.nextDouble();
		 * 
		 * double p = (x.a + x.b + x.c) / 2.0; double areaX = Math.sqrt(p * (p - x.a) *
		 * (p - x.b) * (p - x.c));
		 * 
		 * double areaX = x.area();
		 * 
		 * p = (y.a + y.b + y.c) / 2.0; double areaY = Math.sqrt(p * (p - y.a) * (p -
		 * y.b) * (p - y.c));
		 * 
		 * double areaY = y.area();
		 * 
		 * System.out.printf("Triangle X area: %.4f%n ", areaX);
		 * System.out.printf("Triangle Y area: %.4f%n ", areaY);
		 * 
		 * if (areaX > areaY) { System.out.println("Larger area: X"); } else {
		 * System.out.println("Larger area: Y"); } sc.close();
		 */

		/**************
		 * Tringulo ****************** Locale.setDefault(Locale.US); Scanner sc = new
		 * Scanner(System.in);
		 * 
		 * Product product = new Product(); System.out.println("Entre com o produto: ");
		 * System.out.print("Nome: "); product.name = sc.nextLine();
		 * 
		 * System.out.println("Entre com o preço: "); System.out.print("Preço: ");
		 * product.price = sc.nextDouble();
		 * 
		 * System.out.println("Entre com a quantidade: "); System.out.print("Quantidade
		 * no Estoque: "); product.quantity = sc.nextInt();
		 * 
		 * //System.out.println(product.name + ", " + product.price + ", " +
		 * product.quantity); System.out.println(); System.out.println("Product data " +
		 * product);
		 * 
		 * System.out.println(); System.out.println("Entre a quantidade de produtos para
		 * adicionar ao Estoque: ");
		 * 
		 * int quantity = sc.nextInt(); product.addProducts(quantity);
		 * 
		 * System.out.println(); System.out.println("Update data " + product);
		 * 
		 * System.out.println(); System.out.println("Entre a quantidade de produtos para
		 * remover do Estoque: "); quantity = sc.nextInt();
		 * product.removeProducts(quantity);
		 * 
		 * System.out.println(); System.out.println("Update data " + product);
		 * 
		 * sc.close();
		 */
		/****************
		 * Rectangle ****************** Locale.setDefault(Locale.US); Scanner sc = new
		 * Scanner(System.in); Rectangle rect = new Rectangle();
		 * System.out.println("Enter rectangle width and height:"); rect.width =
		 * sc.nextDouble(); rect.height = sc.nextDouble(); System.out.printf("AREA =
		 * %.2f%n", rect.area()); System.out.printf("PERIMETER = %.2f%n",
		 * rect.perimeter()); System.out.printf("DIAGONAL = %.2f%n", rect.diagonal());
		 * sc.close();
		 */

		/***********
		 * Employee ******************* Locale.setDefault(Locale.US); Scanner sc = new
		 * Scanner(System.in); Employee emp = new Employee(); System.out.print("Name:
		 * "); emp.name = sc.nextLine(); System.out.print("Gross salary: ");
		 * emp.grossSalary = sc.nextDouble(); System.out.print("Tax: "); emp.tax =
		 * sc.nextDouble(); System.out.println(); System.out.println("Employee: " +
		 * emp); System.out.println(); System.out.print("Which percentage to increase
		 * salary? "); double percentage = sc.nextDouble();
		 * emp.increaseSalary(percentage); System.out.println();
		 * System.out.println("Updated data: " + emp); sc.close();
		 */

		/**************
		 * Student ************* Scanner sc = new Scanner(System.in); Student student =
		 * new Student(); student.name = sc.nextLine(); student.grade1 =
		 * sc.nextDouble(); student.grade2 = sc.nextDouble(); student.grade3 =
		 * sc.nextDouble(); System.out.printf("FINAL GRADE: %.2f%n",
		 * student.finalGrade()); if (student.finalGrade() < 60.0) {
		 * System.out.println("FAILED"); System.out.printf("MISSING %.2f POINTS%n",
		 * student.missingPoints()); } else { System.out.println("PASS"); } sc.close();
		 */

		/***************
		 * Versão 1 ***************** Com método estaticos Locale.setDefault(Locale.US);
		 * Scanner sc = new Scanner(System.in);
		 * 
		 * System.out.print("Entre o valor do raio"); double radius = sc.nextDouble();
		 * 
		 * double c = circunference(radius); double v = volume(radius);
		 * System.out.printf("Circunference: %.2f%n", c); System.out.printf("Volume:
		 * %.2f%n", v); System.out.printf("Valor PI: %.2f%n", PI);
		 * 
		 * sc.close();
		 */

		/***************
		 * Versão 2 ***************** //Com classe publica Locale.setDefault(Locale.US);
		 * Scanner sc = new Scanner(System.in); Calculator calc = new Calculator();
		 * 
		 * System.out.print("Entre o valor do raio"); double radius = sc.nextDouble();
		 * 
		 * double c = calc.circunference(radius); double v = calc.volume(radius);
		 * System.out.printf("Circunference: %.2f%n", c); System.out.printf("Volume:
		 * %.2f%n", v); System.out.printf("Valor PI: %.2f%n", calc.PI);
		 * 
		 * sc.close();
		 */

		/***************
		 * Versão 3 ***************** //Com metodo estatico
		 * Locale.setDefault(Locale.US); Scanner sc = new Scanner(System.in);
		 * //Calculator calc = new Calculator();
		 * 
		 * System.out.print("Entre o valor do raio"); double radius = sc.nextDouble();
		 * 
		 * double c = Calculator.circunference(radius); double v =
		 * Calculator.volume(radius); System.out.printf("Circunference: %.2f%n", c);
		 * System.out.printf("Volume: %.2f%n", v); System.out.printf("Valor PI: %.2f%n",
		 * Calculator.PI);
		 * 
		 * sc.close();
		 */

		/*
		 * Locale.setDefault(Locale.US); Scanner sc = new Scanner(System.in); Account
		 * account;
		 * 
		 * System.out.print("Enter account number: "); int number = sc.nextInt();
		 * 
		 * System.out.print("Enter account holder: "); sc.nextLine(); String holder =
		 * sc.nextLine(); System.out.print("Tem depósito inicial (Y/N)?: "); char
		 * response = sc.next().charAt(0);
		 * 
		 * if (response == 'y') { System.out.print("Entre com o valor inicial: ");
		 * double initialDeposit = sc.nextDouble(); account = new Account(number,
		 * holder, initialDeposit); }else { account = new Account(number, holder); }
		 * 
		 * System.out.println(); System.out.println("Dados da Conta: ");
		 * System.out.println(account);
		 * 
		 * System.out.println(); System.out.print("Entre um valor para depósito: ");
		 * double depositValue = sc.nextDouble(); account.deposit(depositValue);
		 * System.out.print("Dados da conta atualizado : ");
		 * System.out.println(account);
		 * 
		 * System.out.println(); System.out.print("Entre um valor para saque: "); double
		 * saqueValue = sc.nextDouble(); account.withdraw(saqueValue);
		 * System.out.print("Dados da conta atualizado : ");
		 * System.out.println(account);
		 * 
		 * sc.close();
		 */

		/*Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		 VETOR SIMPLES
		 * int n = sc.nextInt(); double[] vect = new double[n];
		 * 
		 * for (int i=0; i<n; i++) { vect[i] = sc.nextDouble(); }
		 * 
		 * double sum = 0.0; for (int i=0; i<n; i++) { sum += vect[i]; } double avg =
		 * sum/n;
		 * 
		 * System.out.printf("AVERAGE HEIGHT: %.2f%n", avg);
		 */
		
		/*VETOR COM CLASSE
		int n = sc.nextInt();
		Product[] vect = new Product[n];

		for (int i = 0; i < vect.length; i++) {
			sc.nextLine();
			String  name = sc.nextLine();
			double price = sc.nextDouble();
			vect[i] = new Product(name, price);			
		}

		double sum = 0.0;
		for (int i = 0; i < vect.length; i++) {
			sum += vect[i].getPrice();
		}
		double avg = sum / vect.length;

		System.out.printf("AVERAGE PRICE = %.2f%n", avg);
		sc.close();*/

/*		Rent[] vect = new Rent[10];
		System.out.print("Quantos quartos serão alugados? ");
		int n = sc.nextInt();
		
		for (int i = 1; i <= n; i++) {
			System.out.println();			
			System.out.println("Rent # " + i + ":"); 
			System.out.print("Nome: ");
			sc.nextLine();
			String name = sc.nextLine();
			System.out.print("Email: ");
			String email = sc.nextLine();
			System.out.print("Quarto: ");
			int qrt = sc.nextInt();
			vect[qrt] = new Rent(name, email);			
		}

		System.out.println();
		System.out.println("Quarto ocupado:");
		for (int i = 0; i < 10; i++) {
			if (vect[i] != null) {
				System.out.println(i + ": " + vect[i]);
			}
		}
		
		sc.close();*/		
		
		/*List<String> list = new ArrayList<>();
		
		list.add("Maria");
		list.add("Alex");
		list.add("Bob");
		list.add("Anna");
		//Adicionar um item
		list.add(2, "Marco");
		System.out.println(list.size());
		//list.remove(1);
		
		for (String x : list) {
			System.out.println(x);
		}	
		System.out.println("---------------------");
		//Removendo um item por predicado
		list.removeIf(x -> x.charAt(0) == 'M');
		for (String x : list) {
			System.out.println(x);
		}
		
		System.out.println("---------------------");
		System.out.println("Index of Bob: " + list.indexOf("Bob"));
		System.out.println("Index of Marco: " + list.indexOf("Marco"));
		System.out.println("---------------------");
		//Preenchendo uma lista somente com alguns dados 
		List<String> result = list.stream().filter(x -> x.charAt(0) == 'A').collect(Collectors.toList());
		for (String x : result) {
			System.out.println(x);
		}
		System.out.println("---------------------");
		//Encontra o primeiro registro especifico ou retorna nulo
		String name = list.stream().filter(x -> x.charAt(0) == 'A').findFirst().orElse(null);
		System.out.println(name);*/
		
/*		Trabalhando com Listas
 * 		List<EmployeeNew> list = new ArrayList<>();
		
		// PART 1 - READING DATA:
		
		System.out.print("How many employees will be registered? ");
		int n = sc.nextInt();
		
		for (int i=1; i<=n; i++) {
			System.out.println();
			System.out.println("Employee #" + i + ": ");
			System.out.print("Id: ");
			int id = sc.nextInt();
			System.out.print("Name: ");
			sc.nextLine();
			String name = sc.nextLine();
			System.out.print("Salary: ");
			double salary = sc.nextDouble();
			list.add(new EmployeeNew(id, name, salary));
		}

		// PART 2 - UPDATING SALARY OF GIVEN EMPLOYEE:
		
		System.out.println();
		System.out.print("Enter the employee id that will have salary increase: ");
		int id = sc.nextInt();
		EmployeeNew emp = list.stream().filter(x -> x.getId() == id).findFirst().orElse(null);
		if (emp == null) {
			System.out.println("This id does not exist!");
		}
		else {
			System.out.print("Enter the percentage: ");
			double percentage = sc.nextDouble();
			emp.increaseSalary(percentage);
		}
		
		// PART 3 - LISTING EMPLOYEES:
		
		System.out.println();
		System.out.println("List of employees:");
		for (EmployeeNew obj : list) {
			System.out.println(obj);
		}*/
		
		/*MATRIZES
		 * int n = sc.nextInt();
		int[][] mat =  new int[n][n];
		
		for (int i= 0; i < mat.length; i++) {
			for (int j= 0; j < mat[i].length; j++) {
				mat[i][j] = sc.nextInt();
			}
		}
		System.out.println("Main Diagonal: ");
		for (int i= 0; i < mat.length; i++) {
			System.out.print(mat[i][i] + " ");
		}
		System.out.println();
		
		int count =  0;
		for (int i= 0; i < mat.length; i++) {
			for (int j= 0; j < mat[i].length; j++) {
				if (mat[i][j] < 0) {
					count++;
				}
					
			}			
		}
		System.out.println("Negative Numbers = " + count);*/
		
		/*MATRIZES 2
		int l = sc.nextInt();
		int c = sc.nextInt();
		int[][] mat =  new int[l][c];
		
		for (int i= 0; i < mat.length; i++) {
			for (int j= 0; j < mat[i].length; j++) {
				mat[i][j] = sc.nextInt();
			}
		}
		
		
		System.out.println("Informe um número aleatório dos que foram informados: ");
		int x = sc.nextInt();
		System.out.println();
		
		for (int i= 0; i < mat.length; i++) {
			for (int j= 0; j < mat[i].length; j++) {
				if (mat[i][j] == x) {
					System.out.println("Position " + i + "," + j + ":");
					if (j > 0) {
						System.out.println("A Esquerda: " + mat[i][j-1]);						
					}
					if (i > 0) {
						System.out.println("Acima: " + mat[i-1][j]);						
					}
					if (j < mat[i].length -1) {
						System.out.println("A Direita: " + mat[i][j+1]);						
					}
					if (i < mat[i].length -1) {
						System.out.println("A Baixo: " + mat[i+1][j]);						
					}
				}
			}
			
		}*/
		
		//TRABALHADO DO DATAS
		/*SimpleDateFormat sdf1 = new SimpleDateFormat("dd/MM/yyyy");
		SimpleDateFormat sdf2 = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
		SimpleDateFormat sdf3 = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
		sdf3.setTimeZone(TimeZone.getTimeZone("GWT"));
		
		Date x1 = new Date();
		Date x2 = new Date(System.currentTimeMillis());
		Date x3 = new Date(0L);
		Date x4 = new Date(1000l * 60l * 60L * 5l);
		
		Date y1 = sdf1.parse("25/06/2018");
		Date y2 = sdf2.parse("25/06/2018 15:42:07");
		Date y3 = Date.from(Instant.parse("2018-06-25T15:42:07Z"));
		
		System.out.println("x1: " + sdf2);
		System.out.println("x2: " + sdf2);
		System.out.println("x3: " + sdf2);
		System.out.println("x4: " + sdf2);
		System.out.println("y5: " + sdf2);
		System.out.println("y6: " + sdf2);
		System.out.println("y7: " + sdf2);
		
		System.out.println("-------------------------------");
		System.out.println("x1: " + sdf2.format(x1));
		System.out.println("x2: " + sdf2.format(x2));
		System.out.println("x3: " + sdf2.format(x3));
		System.out.println("x4: " + sdf2.format(x4));
		System.out.println("y5: " + sdf2.format(y1));
		System.out.println("y6: " + sdf2.format(y1));
		System.out.println("y7: " + sdf2.format(y1));
		
		System.out.println("-------------------------------");
		System.out.println("x1: " + sdf3.format(x1));
		System.out.println("x2: " + sdf3.format(x2));
		System.out.println("x3: " + sdf3.format(x3));
		System.out.println("x4: " + sdf3.format(x4));
		System.out.println("y5: " + sdf3.format(y1));
		System.out.println("y6: " + sdf3.format(y1));
		System.out.println("y7: " + sdf3.format(y1));
*/		
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
		Date d = Date.from(Instant.parse("2018-06-25T15:42:07Z"));
		System.out.println(sdf.format(d));
		
		Calendar cal = Calendar.getInstance();
		cal.setTime(d);
		int minutes = cal.get(Calendar.MINUTE);
		int month = 1 + cal.get(Calendar.MONTH);
		
		cal.add(Calendar.HOUR_OF_DAY,4);
		d = cal.getTime();
		
		System.out.println(sdf.format(d));
		System.out.println("Minutes: " + minutes);
		System.out.println("Month: " + month);
		
		sc.close(); 
	}
}
