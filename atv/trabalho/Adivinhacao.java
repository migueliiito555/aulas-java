package trabalho;

import java.util.Scanner;

public class Adivinhacao
{
    private int tentativas = 5, tema = 0;
    private String[][] perguntas =
    {
        { // História
            "Por que os nativos da América do Sul se chamam \"índios\"?",
            "Quem foi Américo Vespúcio?",
            "O que foi o movimento Iluminista?",
            "P. Álvares Cabral morreu com a opinião de que:",
            "O que seria os Déspotas Esclarecidos?"
        }
    };
    private String[][][] respostas =
    {
        { // História
            {
                "P. Álvares Cabral pensou estar na Índia, por isso \"índios\".",
            }
        }
    };

    // Construtor
    public Adivinhacao()
    {
        Scanner teclado = new Scanner(System.in);

        // Array "temas" com os temas para facilitar print :v
        String[] temas = {"Ciência", "Geografia", "História", "Matemática", "Português"};

        // Print pra deixar bonito.
        System.out.println("""
        JOGO DE ADIVINHAÇÃO

        Escolha um tema:

        [ 1 ] - Ciência
        [ 2 ] - Geografia
        [ 3 ] - História
        [ 4 ] - Matemática
        [ 5 ] - Português

        """);
        System.out.print("-> ");

        // Pega o valor que o usuário digitar e subtrai um, pois o array só vai até 4.
        int tema = teclado.nextInt() - 1;

        // Verifica o valor de "tema".
        if (tema < 1 || tema > 5)
        System.out.println("\nTema escolhido: História");

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

    private String[][][] getRespostas()
    { return respostas; }

    private int getTentativas()
    { return tentativas; }

    private int getTema()
    { return tema; }

    // Setters
    private void setRespostas(int pos1, int pos2, int pos3, String valor)
    { this.respostas[pos1][pos2][pos3] = valor; }

    private void setPerguntas(int pos1, int pos2, String valor)
    { this.perguntas[pos1][pos2] = valor; }

    private void setTentativas(int tentativas)
    { this.tentativas = tentativas; }

    private void setTema(int tema)
    { this.tema = tema; }

    // Métodos
    public void jogar()
    {

    }
}
