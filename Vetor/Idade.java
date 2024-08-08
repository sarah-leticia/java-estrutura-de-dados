package Vetor;

public class Idade {
    public static void main(String[] args) {
        int [] idade = {5,45,21,75,32,20,63,25,36};
        int id=0, cont;

        for (cont =0; cont < idade.length; cont++){
            if (idade[cont] > 35){
                id++;
            }
            //System.out.println(idade[cont]);
        }
        System.out.println("Quantidade de pessoas que são maiores de 35 anos de idade: "+id);

    }
}
