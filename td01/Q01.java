package td01;



import java.util.Scanner;



// 1ª) Faça um programa que peça dois números e verifique (usando if e else) e imprima o maior deles.
public class Q01 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);



        System.out.print("Digite um número: ");
        float n1 = teclado.nextFloat();

        System.out.print("Digite outro: ");
        float n2 = teclado.nextFloat();



        teclado.close();



        System.out.print("\n" + n1);
        if (n1 > n2) {
            System.out.print(" é maior que ");
        }

        else if (n1 < n2) {
            System.out.print(" é menor que ");
        }

        else {
            System.out.print(" é igual à ");
        }
        System.out.print(n2 + "!");
    }
}
