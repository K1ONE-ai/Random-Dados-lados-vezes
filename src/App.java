import java.util.Random;
import java.util.Scanner;


public class App {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        Random random = new Random();


        System.out.println("Digite a quantidade de lados: ");
        int lados = ler.nextInt();
        System.out.println("Digite a quantidade de vezes: ");
        int vezes = ler.nextInt();

        int soma = 0;
        for(int i = 0; i <= vezes; i++) {
           int numero = random.nextInt(lados) + 1;

            soma += numero;
            System.out.println(numero);
        }
        System.out.println("Asoma é: " + soma);
    }
}
