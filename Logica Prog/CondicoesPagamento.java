package logica;

public class CondicoesPagamento {
    public static void main(String[] args) {
        double valorProduto, valorProdutoFinal;
        String formaPagamento;

        valorProduto= 25.00;
        formaPagamento = "dinheiro";

         if (formaPagamento == "dinheiro" || formaPagamento == "pix") {
             valorProdutoFinal = valorProduto - (valorProduto*0.15);
             System.out.println("Valor do produto: "+valorProduto + ", Valor do produto com desconto de 15%: "+valorProdutoFinal);
         }

         if (formaPagamento == "credito"){
             System.out.println("Voce escolheu pagar com cartão de credito!");
             System.out.println("Escolha uma opção: 1- credito a vista / 2- credito 2x / " +
                     "3- credito 3x ou mais");

             int escolhaCredito;
             escolhaCredito=2;
             System.out.println("Voce escolheu a opcão: " +escolhaCredito);

             if (escolhaCredito == 1) {
                 valorProdutoFinal = valorProduto - (valorProduto*0.10);
                 System.out.println("Valor do produto: "+valorProduto + ", Valor do produto com desconto desconto de 10%: "+valorProdutoFinal);
             }

             if (escolhaCredito == 2) {
                 System.out.println("Valor do produto sem juros: "+valorProduto);
             }

             if (escolhaCredito == 3) {
                 valorProdutoFinal = valorProduto + (valorProduto*0.10);
                 System.out.println("Valor do produto: "+valorProduto + ", Valor do produto com juros de 10%: "+valorProdutoFinal);
             }
         }


    }
}
