import java.util.Scanner;

public class CaculadoraDesconhecida{
    public static void main(String[] args){

        Scanner entrada = new Scanner(System.in);

        double soma = 0;
        int quantidade = 0;

        System.out.print("Digite as notas (valor negativo para parar):");
        double nota = entrada.nextDouble();

        while (nota >=0){
            soma += nota;
            quantidade++;

            nota = entrada.nextDouble();
        }

        if (quantidade > 0) {
            double media = soma / quantidade;
            System.out.println("Media geral: " + media);
        } else {
            System.out.println("Nenhuma nota válida foi digitada.");
        }

        entrada.close();


    }
    
}
