package logica;

import java.util.Scanner;

public class SalarioMinimo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o valor do salario minimo: ");
        Double salariominimo = scanner.nextDouble();

        System.out.print("Digite o seu salario atual: ");
        Double salario = scanner.nextDouble();

        double diferenca;
        diferenca = salario / salariominimo;

            System.out.format("este usuario ganha cerca de %.1f salarios minimos" , diferenca);
        scanner.close();
    }
}
