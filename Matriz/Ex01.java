package Matriz;

public class exe01 {
    public static void main(String[] args) {
        /*{{2, 6, 9}, {1, 3, 5}};*/
        int[][] matriz = new int[][] {{1,2,2},{2,2,2},{3,2,5}} ;
        int linha=0, coluna=0;

        for (linha=0; linha < matriz.length; linha++) {
            for (coluna = 0; coluna < matriz.length; coluna++) {

                System.out.println(matriz[linha][coluna]);

            }
            System.out.println();
        }
    }
}
