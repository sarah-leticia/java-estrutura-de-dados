package Vetor;

public class MultiplicaVetor {
    public static void main(String[] args) {
        int [] vetorA={5,2,4,3,1,7,6,8};
        int [] vetorB = new int[10];

        for (int cont=0; cont < vetorA.length; cont++){
            vetorB[cont]= vetorA[cont]*2;
            System.out.println(vetorA[cont]+" x 2: "+vetorB[cont]);
        }
    }
}
