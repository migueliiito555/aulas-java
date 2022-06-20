package td01;



import java.util.Scanner;



// 4ª) Faça um programa que verifique (usando if e else) se uma letra digitada é vogal ou consoante.
public class Q04 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);



        System.out.print("Digite uma letra: ");
        String letra = teclado.nextLine().toUpperCase();



        teclado.close();



        switch (letra) {
            case "A":
            case "E":
            case "I":
            case "O":
            case "U":
                System.out.println("Vogal!");
                break;

            case "B":
            case "C":
            case "D":
            case "F":
            case "G":
            case "H":
            case "J":
            case "K":
            case "L":
            case "M":
            case "N":
            case "P":
            case "Q":
            case "R":
            case "S":
            case "T":
            case "V":
            case "W":
            case "Y":
            case "X":
            case "Z":
                System.out.println("Consoante!");
                break;

            default:
                System.out.println("[ERRO] Mais de uma letra digitada ou símbolo/número digitado!");
        }
    }
}
