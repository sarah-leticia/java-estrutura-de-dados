package logica;

import java.util.Scanner;

public class ParImpar {
    public static void main(String[] args) {
        double divisao;
       // numero = 3;
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite sum numero: ");
        Double numero = scanner.nextDouble();

        divisao = numero % 2;

        if(divisao == 0) {
            System.out.println("Esse numero é par");
        } else{
            System.out.println("esse numero é impar");
        }

        if(numero > 0){
             System.out.println("esse numero é positivo");
         } else{
            System.out.println("Este numero é negativo");
        }
        scanner.close();
    }
}
