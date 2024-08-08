package logica;

public class ProdutoBarato {
    public static void main(String[] args) {
        double valor1=19.00, valor2=20.00, valor3=30.00;

        System.out.println("Os valores dos produtos são:\n-Opção 1: " +valor1+"\n-Opção 2: "+valor2+ "\n-Opção 3: "+valor3);

        if(valor1 < valor2 && valor1 < valor3){
            System.out.println("Este produto é o mais barato: "+valor1);
        }

        if(valor2 < valor1 && valor2 < valor3){
            System.out.println("Este produto é o mais barato: "+valor2);
        }

        if(valor3 < valor1 && valor3 < valor2){
            System.out.println("Este produto é o mais barato: "+valor3);
        }
    }
}
