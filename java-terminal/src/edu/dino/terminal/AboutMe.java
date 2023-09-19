package edu.dino.terminal;

import java.util.Locale;
import java.util.Scanner;

public class AboutMe {
  public static void main(String[] args) {
    // Criando o objeto scanner
    Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

    System.out.println("Digite o neu nome");
    String name = scanner.next();

    System.out.println("Digite o seu sobrenome");
    String lastName = scanner.next();

    System.out.println("Digite a sua idade");
    int age = scanner.nextInt();

    System.out.println("Digite a sua altura");
    double height = scanner.nextDouble();

    // Imprimindo os dados obtidos pelo usuário
    System.out.println("Olá, me chamo " + name + " " + lastName);
    System.out.println("Tenho " + age + " anos");
    System.out.println("Minha altura é " + height + "cm");
  }
}
