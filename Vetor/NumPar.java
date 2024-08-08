package Vetor;

public class NumPar {
    public static void main(String[] args) {
        int [] valorA = {1,2,3,4,5,6,7,8,4,10};
        int qtdePar=0;

        for (int cont = 0; cont <=9; cont ++){
            if (valorA[cont] % 2 == 0){
                 qtdePar ++;
                System.out.println(valorA[cont]);

            }
        }
        System.out.println("\nQtde de valores pares no vetor: "+qtdePar);
    }
}
