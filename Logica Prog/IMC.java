package logica;

public class IMC {
    public static void main(String[] args) {
        double peso, altura, imc, potencia;
        peso=66;
        altura=1.60;
        potencia = altura*altura; //formula: peso/altura elevado a 2
        imc= peso/potencia;

        if(imc <= 18.5){
            System.out.println("imc: "+imc+ " voce esta abaixo do peso");
        }
        if(imc >= 18.6 && imc <= 24.9) {
            System.out.println("imc: "+imc+ " Peso ideal");
        }

        if(imc >= 25.0 && imc <= 29.9) {
            System.out.println("imc: "+imc+ " levemente acima do peso");
        }
        if(imc >= 30.0 && imc <= 34.9) {
            System.out.println("imc: "+imc+ "Obesidade grau I");
        }

        if(imc >= 35.0 && imc <= 99.9) {
            System.out.println("imc: "+imc+ "Obesidade grau II");
        }

        if(imc >= 40.0) {
            System.out.println("imc: "+imc+ "Obesidade grau III");
        }

    }
}
