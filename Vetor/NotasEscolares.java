package Vetor;

public class NotasEscolares {
    public static void main(String[] args) {
        double [] nota1 = {4.5,7.5,8.0,6.0,10,9.5,10.0,8.5,7.5};
        double [] nota2 = {5.5,5.5,9.0,4.0,2.0,3.5,10.0,8.5,7.5};
        double [] media = new double [10];
        int cont,cont2=0;

        System.out.println("media das notas:");
        for(cont =0; cont < nota1.length; cont++){
            media[cont] += (nota1[cont]+nota2[cont])/2;

            System.out.println(media[cont]);

        }

    }
}
