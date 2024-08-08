package logica;

public class Tabuada {
    public static void main(String[] args) {
        System.out.println("Escolha qual numero deseja ver a tabuada: ");
      //  System.out.println("1 - Multiplicação | 2 - Soma | 3 - Subtração | 4- Divisão ");
        int escolha, operacao;
        escolha = 5;
        //  operacao = 4;

        System.out.println("Voce escolheu a tabuada do numero: " + escolha);

        //    if (operacao == 1) {
        for (int contador = 0; contador <= 10; contador++) {
            int multiplica = escolha * contador;
            System.out.println("Tabuada de " + escolha + " x " + contador + " = " + multiplica);
        }
    }
}
     /*   }
        if (operacao == 2) {
            for (int contador = 0; contador <= 10; contador++) {
                int multiplica = escolha + contador;
                System.out.println("Tabuada de " + escolha + " + " + contador + " = " + multiplica);
            }
        }

        if (operacao == 3) {
            for (int contador = 0; contador <= 10; contador++) {
                int multiplica = escolha - contador;
                System.out.println("Tabuada de " + escolha + " - " + contador + " = " + multiplica);
            }
        }

        if (operacao == 4) {
            for (int contador = 0; contador <= 10; contador++) {
                int multiplica = escolha - contador;
                System.out.println("Tabuada de " + escolha + " / " + contador + " = " + multiplica);
            }
        }
    }
}
*/

