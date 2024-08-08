package Vetor;

public class Multiplos {
    public static void main(String[] args) {
        int [] valorA = {1,15,3,4,5,6,7,8,4,10,20,25,30,35,40,45,8,9,6};

        System.out.println("valores multiplos de 5:");
        for (int cont = 0; cont < valorA.length; cont ++){
            if (valorA[cont] % 5 == 0){
                System.out.println(valorA[cont]);
            }

        }

    }
}
