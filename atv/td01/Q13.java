package td01;



import java.util.Scanner;



// 13ª) Faça um Programa que leia um número e exiba o dia correspondente da semana. (1- Domingo , 2- Segunda, etc). Se digitar outro valor deve aparecer “valor inválido".
public class Q13 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);



        System.out.print("Insira um número: ");
        byte dia = teclado.nextByte();



        teclado.close();



        // Dizer dia da semana;
        switch (dia) {
            case 1:
                System.out.println("\nDomingo!");
                break;

            case 2:
                System.out.println("\nSegunda!");
                break;

            case 3:
                System.out.println("\nTerça!");
                break;

            case 4:
                System.out.println("\nQuarta!");
                break;

            case 5:
                System.out.println("\nQuinta!");
                break;

            case 6:
                System.out.println("\nSexta!");
                break;

            case 7:
                System.out.println("\nSábado!");
                break;

            default:
                System.out.println("\n[ERRO] \"" + dia + "\" não existe!");
        }
    }
}
