package trabalho;

import java.util.Scanner;

public class Adivinhacao
{
    private int tentativas = 5, tema = 0;
    private String[][] perguntas =
    {
        { // Biologia
            
        }
    };
    private String[][] respostas =
    {
        { // Biologia
        }
    };

    // Construtor
    public Adivinhacao()
    {
        Scanner teclado = new Scanner(System.in);

        // Array "temas" com os temas para facilitar print :v
        String[] temas = {"Biologia", "Geografia", "História", "Inglês", "Matemática", "Português", "Química"};

        // Print pra deixar bonito.
        System.out.println("JOGO DE ADIVINHAÇÃO\n"+
        "\nNão insira acentuação na resposta."+
        "\n\nEscolha um tema:\n"+
        "\n[ 1 ] - Biologia"+
        "\n[ 2 ] - Geografia"+
        "\n[ 3 ] - História"+
        "\n[ 4 ] - Inglês"+
        "\n[ 5 ] - Matemática"+
        "\n[ 6 ] - Português"+
        "\n[ 7 ] - Química");
        System.out.print("\n-> ");

        // Pega o valor que o usuário digitar e subtrai um, pois o array só vai até 4.
        int tema = teclado.nextInt() - 1;

        // Verifica o valor de "tema".
        if (tema < 0 || tema > 7)
        System.out.println("\nTema escolhido: Biologia");

        else
        {
            setTema(tema);
            System.out.println("\nTema escolhido: " + temas[getTema()]);
        }

        teclado.close();
    }

    // Getters
    private String[][] getPerguntas()
    { return perguntas; }

    private String[][] getRespostas()
    { return respostas; }

    private int getTentativas()
    { return tentativas; }

    private int getTema()
    { return tema; }

    // Setters
    private void setRespostas(int pos1, int pos2, String valor)
    { this.respostas[pos1][pos2] = valor; }

    private void setPerguntas(int pos1, int pos2, String valor)
    { this.perguntas[pos1][pos2] = valor; }

    private void setTentativas(int tentativas)
    { this.tentativas = tentativas; }

    private void setTema(int tema)
    { this.tema = tema; }

    // Métodos
    public void jogar()
    {
        System.out.println("==================================\n");

        int i = 0;
        String[][] p = getPerguntas();
        while (getTentativas() > 0)
        {
            Scanner teclado = new Scanner(System.in);

            System.out.println(p[i]);

            System.out.print("-> ");

            String r = teclado.next().toLowerCase();

            if (p[i].equals(r))
            {
                System.out.println("\n\nResposta Correta!\n");

                if ()
                System.out.println(getTentativas() + " tentativa(s) restante(s). +1 tentativa ganha.");
                setTentativas(getTentativas() + 1);
                i++;
            }

            else
            {
                System.out.println("\n\nResposta Incorreta!\n");
                setTentativas(getTentativas() - 1);
            }
        }
    }
}