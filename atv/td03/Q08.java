package td03;



import java.util.Scanner;



// 8ª) Faça um método que devolve um array de números lidos do teclado.
public class Q08 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        double vetor[] = new double[4];



        for (int i = 0; i < vetor.length; i++) {
            System.out.print("Digite um valor para a " + (i + 1) + "ª posição: ");
            vetor[i] = teclado.nextDouble();
        }



        teclado.close();



        System.out.println();
        for (int i = 0; i < vetor.length; i++) {
            System.out.println((i + 1) + " posição: " + vetor[i]);
        }
    }
}
