package td01;



import java.util.Scanner;



/* 5ª) Faça um programa para a leitura de duas notas parciais de um aluno.

       - A mensagem “Aprovado”, se a média alcançada for maior ou igual a sete;
       - A mensagem “Aprovado com Distinção”, se a média for igual a dez;
       - A mensagem “Reprovado” se a média for menor de do que sete;
 */
public class Q05 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);



        System.out.print("Digita a 1ª nota: ");
        var n1 = teclado.nextFloat();
        
        System.out.print("Digita a 2ª nota: ");
        var n2 = teclado.nextFloat();



        var media = (n1 + n2) / 2;



        System.out.print("\nMédia igual à " + media + "! ");
        if (media < 0) {
            System.out.print("VOLTA UM ANO!");
        }

        else if (media < 7) {
            System.out.print("REPROVADO!");
        }

        else if (media < 10) {
            System.out.print("APROVADO!");
        }

        else {
            System.out.print("APROVADO COM DISTINÇÃO!");
        }
    }
}
