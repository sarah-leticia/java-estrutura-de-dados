package logica;

public class Idade {
    public static void main(String[] args) {
        String nome = "sarah";
        int idade = 26;

        if(idade >= 18){
            System.out.println(nome+ ", você é maior de idade e possui "+idade+" anos.");
        } else{
            System.out.println(nome+ " você é menor de idade e tem "+idade+" anos.");
        }
    }
}
