package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Quartos;

public class Program {
/*A dona de um pensionato possui dez quartos para alugar para estudantes,
sendo esses quartos identificados pelos n�meros 0 a 9.
Fazer um programa que inicie com todos os dez quartos vazios, e depois
leia uma quantidade N representando o n�mero de estudantes que v�o
alugar quartos (N pode ser de 1 a 10). Em seguida, registre o aluguel dos
N estudantes. Para cada registro de aluguel, informar o nome e email do
estudante, bem como qual dos quartos ele escolheu (de 0 a 9). Suponha
que seja escolhido um quarto vago. Ao final, seu programa deve imprimir
um relat�rio de todas ocupa��es do pensionato, por ordem de quarto,
conforme exemplo.
 */
	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		System.out.print("How many rooms will be rented?");
		int n = sc.nextInt();

		Quartos [] quartos = new Quartos[10];
		for(int i=0;i<n;i++) {
		sc.nextLine();
		System.out.printf("Rent #%d%n",i+1);
		System.out.print("Name: ");
		String name = sc.nextLine();
		System.out.print("Email: ");
		String email = sc.nextLine();
		System.out.print("Room: ");
		int room = sc.nextInt();
		quartos[room] = new Quartos(name,email);
		}

		System.out.println("Busy rooms:");
		for(int i=0;i<quartos.length;i++) {
			if(quartos[i] != null) {
				System.out.printf("%d: %s%n",i,quartos[i]);
			}
		}
		sc.close();

	}

}
