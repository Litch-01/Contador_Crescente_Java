import java.util.Scanner;

public class TabuadaInteligente{
    
    public static void main(String[] args){

        Scanner entrada = new Scanner(System.in);
        int numero;

        do{
            System.out.print("Digite um número positivo:");
            numero = entrada.nextInt();
        } while (numero < 0);

        System.out.println("Tabuado do " + numero + ":");
        for (int i = 1; i <= 10; i++) {
            System.out.println(numero + "x" + i + "=" + (numero * i));
        }


    }
}