import java.util.Scanner;

public class SomaNumeros{

    public static void main(String[] args){

        Scanner entrada = new Scanner(System.in);
        
        int soma = 0;
        int numero;

        System.out.println("Digite o número (0 para parar):");
        numero = entrada.nextInt();

        while (numero != 0) {
            soma += numero;
            System.out.println("Digite outro número (0 para parar):");
            numero = entrada.nextInt();
        }

        System.out.println("A soma total é " + soma);
        entrada.close();

    }
}