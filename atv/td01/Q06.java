package td01;



import java.util.Scanner;



// 6ª) Faça um programa que leia três números, verifique (usando if e else), e mostre o maior deles.
public class Q06 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);



        teclado.close();



        System.out.print("Digite um número: ");
        float n1 = teclado.nextFloat();

        System.out.print("Agora outro: ");
        float n2 = teclado.nextFloat();

        System.out.print("Mais um: ");
        float n3 = teclado.nextFloat();



        // Checando o maior número:
        float maior = n1;
        if (n1 > n2 && n1 > n3) {
            maior = n1;
        }

        else if (n2 > n1 && n2 > n3) {
            maior = n2;
        }

        else if (n3 > n1 && n3 > n2) {
            maior = n3;
        }

        // Checando maior número com dois iguais:
        else if (n3 == n2 && n1 > n3) {
            maior = n1;
        }

        else if (n1 == n3 && n2 > n1) {
            maior = n2;
        }

        else if (n2 == n1 && n3 > n2) {
            maior = n3;
        }

        // Agora procurando se há dois maiores iguais:
        else if (n1 == n3 && n2 < n1) {
            maior = n1;
        }

        else if (n2 == n1 && n3 < n2) {
            maior = n2;
        }

        else if (n3 == n2 && n1 < n3) {
            maior = n3;
        }



        // Todos são iguais:
        if (n1 == n2 && n1 == n3) {
            System.out.println("\nOs três números são " + n1);
        }

        else {
            System.out.println("\nO maior número é " + maior);
        }
    }
}
