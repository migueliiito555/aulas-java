package td01;



import java.util.Scanner;



// 22ª) Faça um programa que peça dois números ao usuário e mostre qual o maior e qual o menor;
public class Q22 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);



        System.out.print("Digite um número: ");
        double n1 = teclado.nextDouble();

        System.out.print("Mais um: ");
        double n2 = teclado.nextDouble();



        teclado.close();



        System.out.println("\nMaior: " + Math.max(n1, n2) + "\nMenor: " + Math.min(n1, n2));
    }
}
