package td01;



import java.util.Scanner;



// 17ª) Faça um programa que peça um número correspondente a um determinado ano e em seguida informe se este ano é ou não bissexto.
public class Q17 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);


        System.out.print("Insira um ano qualquer: ");
        int ano = teclado.nextInt();



        teclado.close();



        // Não divisível por 100 e divisível por 4 ou 400;
        System.out.print("\n\n\nO ano de " + ano);
        if (ano % 100 != 0 && (ano % 4 == 0 || ano % 400 == 0)) {
            System.out.print(" é bissexto!");
        }

        else {
            System.out.print(" não é bissexto!");
        }
    }
}
