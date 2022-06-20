package td01;



import java.util.Scanner;



// 10ª) Faça um programa que pergunte em que turno você estuda. Peça para digitar M-matutino ou V-vespertino ou N-noturno. Imprima a mensagem “Bom dia!”, “Boa tarde!” ou  “Boa Noite” ou “Valor inválido”, conforme o caso.
public class Q10 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);



        System.out.print("Em que turno estudas (M/V/N)? ");
        String turno = teclado.nextLine().toUpperCase();



        teclado.close();



        // Checa qual o turno e diz bom dia/boa tarde/boa noite;
        switch (turno) {
            case "M":
                System.out.println("\nBom dia então!");
                break;

            case "V":
                System.out.println("\nBoa tarde então!");
                break;

            case "N":
                System.out.println("\nBoa noite então!");
                break;

            default:
                System.out.println("[ERRO] \"" + turno + "\" é inválido!");
        }
    }
}
