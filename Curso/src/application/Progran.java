package application;

import java.util.Scanner;

public class Progran {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("Entre com valor para impress�o: ");
		int x = sc.nextInt();
		System.out.printf("Teste de programa %d",x);
		sc.close();
	}

}