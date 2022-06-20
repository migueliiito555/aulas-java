package td01;



import java.util.Scanner;



/* 20ª) Faça um programa que faça 5 perguntas para uma pessoa sobre um crime. As perguntas são:

- “Telefonou para a vítima?”
- “Esteve no local do crime?”
- “Mora perto da vítima?”
- “Devia para a vítima?”
- “Já trabalhou com a vítima?”

O programa deve no final emitir uma classificação sobre a participação da pessoa no crime. Se a pessoa responder positivamente a 2 questões ela deve ser classificada como “Suspeita”, entre 3 e 4 como “Cúmplice” e 5 como “Assassino”. Caso contrário, ele será classificado como “Inocente”.
*/
public class Q20 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int q = 0;



        // Instruções
        System.out.println("INVESTIGAÇÃO CRIMINAL");
        System.out.println("Responda com 's/n', qualquer outra coisa será considerado 's'.");



        // Interrogatório;
        System.out.print("\n\n\nTelefonou para a vítima?\n-> ");
        if (!teclado.next().toLowerCase().equals("n")) {
            q++;
        }

        System.out.print("\nEsteve no local do crime?\n-> ");
        if (!teclado.next().toLowerCase().equals("n")) {
            q++;
        }

        System.out.print("\nMora perto da vítima?\n-> ");
        if (!teclado.next().toLowerCase().equals("n")) {
            q++;
        }

        System.out.print("\nDevia para a vítima?\n-> ");
        if (!teclado.next().toLowerCase().equals("n")) {
            q++;
        }

        System.out.print("\nJá trabalhou com a vítima?\n-> ");
        if (!teclado.next().toLowerCase().equals("n")) {
            q++;
        }



        teclado.close();



        // Julgamento;
        String veredito = "INOCENTE";
        switch (q) {
            case 2:
                veredito = "SUSPEITO";
                break;

            case 3:
            case 4:
                veredito = "CÚMPLICE";
                break;

            case 5:
                veredito = "ASSASSINO";
                break;
        }



        System.out.println("\n\n\nO sujeito está classificado como " + veredito + "!");
    }
}
