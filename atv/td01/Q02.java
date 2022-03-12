package td01;



import java.util.Scanner;



// 2ª) Faça um programa que peça um valor e mostre na tela se o valor é positivo ou negativo.
public class Q02 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);



        System.out.print("Digite um número: ");
        float n1 = teclado.nextFloat();



        System.out.print("\n" + n1);
        if (n1 > 0) {
            System.out.print(" é positivo!");
        }

        else if (n1 < 0) {
            System.out.println(" é negativo!");
        }

        else {
            System.out.println(" é igual à 0!");
        }
    }
}
