package logica;

public class SomaValores {
    public static void main(String[] args) {
        int numero1, numero2, soma, multiplicar;
        numero1 = 2;
        numero2 = 5;

        if(numero1 == numero2) {
            soma = numero1 + numero2;
            System.out.println("Os numeros são iguais e a soma deles é: " +soma);
        } else {
            multiplicar = numero1 * numero2;
            System.out.println("Os numeros são distintos e a multimplicação deles é " +multiplicar);
        }
    }


}
