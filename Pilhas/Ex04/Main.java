package EstruturaDeDados.Pilhas.ex04;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Pilha livros = new Pilha();
        Pilha livro1 = new Pilha();

        Scanner scanner = new Scanner(System.in);
       //livros.numeros.length
        for (int cont =0; cont < 1; cont++){
            System.out.println("Digite o nome do livro: ");
            livro1.nome = scanner.nextLine();

            System.out.println("Digite o isbm: ");
            livro1.isbn = scanner.nextLine();

            System.out.println("Digite o ano de lançamento: ");
            livro1.data = scanner.nextLine();

            System.out.println("Digite o nome do autor: ");
            livro1.autor = scanner.nextLine();
        }
        
       // Pilha.empilha(livro1);

        System.out.println("\nElementos desempilhados: ");
        while (!livro1.pilhaVazia()) {
            System.out.println(livro1.desempilha());
        }

    }
}
