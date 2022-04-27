package td03;



import java.util.Scanner;



// 3ª) Escreva um trecho Java que leia 10 valores double do teclado e armazene-os num array d.
public class Q03 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        double vetor[] = new double[10];

        

        for (int i = 0; i < vetor.length; i++) {
            System.out.print("Digite o " + (i + 1) + "º valor: ");
            vetor[i] = teclado.nextDouble();
        }
    


        teclado.close();
    }
}
