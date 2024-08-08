package logica;

import java.util.Scanner;
public class Reajuste {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Valor: ");
        double valor = scanner.nextDouble();

        double  reajuste, porcentagem, valorReajustado;

        porcentagem = 5./100; //o ponto pós o numero realiza o cast para double - arredonda pra baixo
        reajuste = valor*porcentagem;
        valorReajustado = valor+reajuste;

        System.out.println("Valor: "+valor+ ", reajuste 5%: " +reajuste+", valor total com reajuste: "+valorReajustado);
        scanner.close();
    }
}
