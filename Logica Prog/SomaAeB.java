package logica;

public class SomaAeB {
    public static void main(String[] args) {
     double A, B, C;
     double soma;

     A = 30;
     B = 50;
     C = 40;
     soma = A + B;

     if (soma < C){
         System.out.println("A soma é menor que C");
     } else {
         System.out.println("A soma é maior que C");
     }

    }
}
