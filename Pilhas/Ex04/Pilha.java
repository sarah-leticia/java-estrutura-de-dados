package EstruturaDeDados.Pilhas.ex04;

import java.util.Arrays;

public class Pilha {
    public String[] numeros;
    public int ponteiro;
    public String nome;
    public String isbn;
    public String data;
    public String autor;

    public Pilha() {
        this.numeros = new String [5];
        this.ponteiro = -1;
        this.isbn= isbn;
        this.nome= nome;
        this.data= data;
        this.autor= autor;

    }

    @Override
    public String toString() {
        return "Pilha{" +
                "numeros=" + Arrays.toString(numeros) +
                ", ponteiro=" + ponteiro +
                ", nome='" + nome + '\'' +
                ", isbn='" + isbn + '\'' +
                ", data='" + data + '\'' +
                ", autor='" + autor + '\'' +
                '}';
    }

    public String getNome() {
        return nome;
    }

    public String getIsbn() {
        return isbn;
    }

    public String getData() {
        return data;
    }

    public String getAutor() {
        return autor;
    }

    public void empilha(String valor){
        if(this.ponteiro < this.numeros.length -1){
            ponteiro++;
            this.numeros[ponteiro]= valor;

        }
    }

    public String desempilha(){
        if(this.ponteiro == -1){
            System.out.println("\n Pilha vazia!");
        }
        return this.numeros[ponteiro--];

    }

    public boolean pilhaVazia() {
        if (this.ponteiro == -1) {
            return true;
        }
        return false;
    }





}


