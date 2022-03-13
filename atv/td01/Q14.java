package td01;



import java.util.Scanner;



/** 14ª) Faça um programa que lê as duas notas parciais obtidas por um aluno numa disciplina ao longo de um semestre, e calcule a sua média. A atribuição de conceitos obedece à tabela abaixo:
 *
 * Média de aproveitamento        Conceito
 * Entre 9.0 e 10.0                   A
 * Entre 7.5 e 9.0                    B
 * Entre 6.0 e 7.5                    C
 * Entre 4.0 e 6.0                    D
 * Entre 4.0 e 0.0                    E
 * 
 * O algoritmo deve mostrar na tela as notas, a média, o conceito correspondente e a mensagem “APROVADO” se o conceito for A, B ou C “REPROVADO” se o conceito for D ou E
 */
public class Q14 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);



        System.out.print("Digite a primeira nota: ");
        double n1 = teclado.nextDouble();

        System.out.print("Agora a segunda: ");
        double n2 = teclado.nextDouble();



        teclado.close();



        double media = (n1 + n2) / 2;
        String conceito = "";



        // Define o conceito do aluno;
        if (media < 4) {
            conceito = "E";
        }

        else if (media < 6) {
            conceito = "D";
        }

        else if (media < 7.5) {
            conceito = "C";
        }

        else if (media < 9) {
            conceito = "B";
        }

        else {
            conceito = "A";
        }



        // Notas e conceito;
        System.out.println("\n1ª nota:     " + n1);
        System.out.println("2ª nota:     " + n2);
        System.out.println("Média:       " + media);
        System.out.println("Conceito:    " + conceito);



        // Aprovado ou Reprovado;
        switch (conceito) {
            case "A":
            case "B":
            case "C":
                System.out.println("\nALUNO APROVADO!");
                break;

            default:
                System.out.println("\nALUNO REPROVADO!");
        }
    }
}
