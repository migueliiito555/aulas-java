package td01;



import java.util.Scanner;



// 7ª) Faça um programa que leia três números, verifique (usando if e else), e mostre o maior e o menor deles.
public class Q07 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);



        System.out.print("Digite um número: ");
        float n1 = teclado.nextFloat();

        System.out.print("Digite outro: ");
        float n2 = teclado.nextFloat();

        System.out.print("Só mais um: ");
        float n3 = teclado.nextFloat();



        teclado.close();



        /**
         *
         *** Método eficiente:
         *
         *    float maior = Math.max(Math.max(n1, n2), n3);
         *    float menor = Math.min(Math.min(n1, n2), n3);
         *
         *
         *** Faltaria somente checar se todos são iguais:
         *
         *   if (n1 == n2 && n1 == n3) {
         *       System.out.println("Todos os números são " + n1);
         *   }
         *
        **/

        // Checando maior número:
        float maior = 0, menor = 0;
        if (n1 > n2 && n1 > n3) {
            maior = n1;
        }

        else if (n2 > n1 && n2 > n3) {
            maior = n2;
        }

        else if (n3 > n1 && n3 > n2) {
            maior = n3;
        }



        // Checando se há dois iguais:
        if (n2 == n3 && n1 > n3) {
            maior = n1;
            menor = n2;
        }
        
        else if (n1 == n3 && n2 > n1) {
            maior = n2;
            menor = n1;
        }

        else if (n1 == n2 && n3 > n2) {
            maior = n3;
            menor = n2;
        }

        else if (n2 == n3 && n1 < n3) {
            maior = n2;
            menor = n1;
        }
        
        else if (n1 == n3 && n2 < n1) {
            maior = n1;
            menor = n2;
        }

        else if (n1 == n2 && n3 < n2) {
            maior = n1;
            menor = n3;
        }



        // Checando pelo menor:
        if (n1 < n2 && n1 < n3) {
            menor = n1;
        }

        else if (n2 < n1 && n2 < n3) {
            menor = n2;
        }

        else if (n3 < n1 && n3 < n2) {
            menor = n3;
        }



        // Caso todos sejam iguais:
        if (maior == menor) {
            System.out.println("\nOs três números são " + n1);
        }

        else {
            System.out.println("\nO maior número é " + maior + " e o menor é " + menor + "!");
        }
    }
}
