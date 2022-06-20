package td01;



import java.util.Scanner;



// 15º) Faça um programa que peça os 3 lados de um triângulo. O programa deverá informar se os valores podem ser um triângulo. Indique, caso os lados formem um triângulo, se o mesmo é: equilátero, isósceles ou escaleno.
public class Q15 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);



        teclado.close();



        System.out.print("Digite o valor do 1º lado: ");
        double l1 = teclado.nextDouble();

        System.out.print("Digite o valor do 2º lado: ");
        double l2 = teclado.nextDouble();

        System.out.print("Digite o valor do 3º lado: ");
        double l3 = teclado.nextDouble();



        if (l2 + l3 > l1 && l1 + l3 > l2 && l1 + l2 > l3) {
            if (l1 == l2 && l2 == l3) {
                System.out.println("\n\n\nO triângulo é equilátero!");
            }

            else if (l1 == l2 || l2 == l3 || l3 == l1) {
                System.out.println("\n\n\nO triângulo é isósceles!");
            }

            else {
                System.out.println("\n\n\nO triângulo é escaleno!");
            }
        }

        else {
            System.out.println("\n\n\n[ERRO] Não existe um triângulo com tais medidas!");
        }
    }
}
