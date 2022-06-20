package td01;



import java.util.Scanner;



/* 19ª) Faça um programa que leia 2 números e em seguida pergunte ao usuário qual operação ele deseja realizar. O resultado da operação deve ser acompanhado de uma frase que diga se o número e:

- Par ou ímpar;
- Positivo ou negativo.
*/
public class Q19 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);



        System.out.print("Digite um valor: ");
        double n1 = teclado.nextDouble();

        System.out.print("Agora outro: ");
        double n2 = teclado.nextDouble();



        System.out.print("\n\n\nAgora a operação:\n\n[ 1 ] - Soma\n[ 2 ] - Divisão\n[ 3 ] - Subtração\n[ 4 ] - Multiplicação\n\n-> ");
        int op = teclado.nextInt();



        teclado.close();



        double res = 0;
        switch (op) {
            case 1:
                res = n1 + n2;
                break;

            case 2:
                res = n1 / n2;
                break;

            case 3:
                res = n1 - n2;
                break;

            case 4:
                res = n1 * n2;
                break;
        }



        if (op >= 1 && op <= 4) {
            System.out.print("\n\n\nO resultado da operação é de " + res + " e deu num número ");



            // Verifica o sinal do número;
            if (res > 0) {
                System.out.print("positivo e ");
            }

            else if (res < 0) {
                System.out.print("negativo e ");
            }

            else {
                System.out.print("nulo e ");
            }



            // Verifica se o número é par ou ímpar;
            if (res % 2 == 0) {
                System.out.print("par!");
            }

            else {
                System.out.print("ímpar!");
            }
        }

        else {
            System.out.println("\n[ERRO] Operação Inválida!");
        }
    }
}
