import java.util.Scanner;

public class ContadorCrescente{

    public static void main(String[] args){

        Scanner entrada = new Scanner(System.in);

        System.out.print("Por favor digite um Número:");
        int numeroDigitado = entrada.nextInt();

        for (int i = 1; i <=numeroDigitado; i++) {
            System.out.println(i);
        }
        entrada.close();
    }
}