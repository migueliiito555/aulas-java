package td01;



import java.util.Scanner;



// 18ª) Faça um programa que peça um número inteiro e determine se ele é par ou ímpar.
public class Q18 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);



        System.out.print("Insira um número: ");
        int num = teclado.nextInt();



        teclado.close();



        System.out.print("\n\n\nO número " + num);
        if (num % 2 == 0) {
            System.out.print(" é par!");
        }

        else {
            System.out.print(" é ímpar!");
        }
    }
}
