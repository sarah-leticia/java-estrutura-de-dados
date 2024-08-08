package Vetor;

public class Exercicio16 {
    public static void main(String[] args) {
        int [] vetorA ={6,40,70,4,15,55,7,28,9,10};
        int soma=0, qtde=0, media=0, valor=0, cn=0;


        for (int cont=0; cont<=9;cont++){
            if(vetorA[cont] < 15){
                soma += vetorA[cont];
               // System.out.println(vetorA[cont]);
            }
            if(vetorA[cont] == 15){
                qtde++;
              //  System.out.println(vetorA[cont]);
            }

            if(vetorA[cont] > 15){
                valor += vetorA[cont];
                cn ++;
                media = valor / cn;
            }
        }
        System.out.println("\nsoma dos valores menores do que 15 no vetor: " + soma);
        System.out.println("\nQuantidade de valores iguais a 15 no vetor: " + qtde);
        System.out.println("\nMedia de valores maiores do que 15 no vetor: " + media);

    }
}
