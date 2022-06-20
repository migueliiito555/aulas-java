package td01;


import java.util.Scanner;


// 9ª) Faça um programa que leia três números e mostre-os em ordem decrescente.
public class Q09 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);



        System.out.print("Digite um número: ");
        float n1 = teclado.nextFloat();

        System.out.print("Agora outro: ");
        float n2 = teclado.nextFloat();

        System.out.print("Mais um: ");
        float n3 = teclado.nextFloat();



        teclado.close();



        // Atribuindo o maior valor e o menor valor para as variáveis "maior" e "menor";
        float maior = Math.max(Math.max(n1, n2), n3);
        float menor = Math.min(Math.min(n1, n2), n3);
        float medio = 0;



        // Checa o valor mediano dos números;
        if (n1 < maior && n1 > menor) {
            medio = n1;
        }

        else if (n2 < maior && n2 > menor) {
            medio = n2;
        }

        else if (n3 < maior && n3 > menor) {
            medio = n3;
        }

        // Checa se há 2 números iguais e inferiores ao maior.
        else if (n1 == n2 && n1 <= maior) {
            medio = n1;
        }

        else if (n2 == n3 && n2 <= maior) {
            medio = n2;
        }

        else if (n3 == n1 && n3 <= maior) {
            medio = n3;
        }



        if (n1 == n2 && n2 == n3) {
            System.out.println("\nOs números são iguais!");
        }

        else {
            System.out.println("\n1º) " + maior + "\n2º) " + medio + "\n3º) " + menor);
        }
    }
}
