package main;

import java.util.Scanner;
import suporte.Printer;
import suporte.Cor;

public class Adivinhacao extends Perguntas
{
    private boolean revelado = false, multiplayer = false, turno = false, errado = false, correto = false;
    private final Jogador[] j = {new Jogador(), new Jogador()};
    private int tema = 0, pergAtual = 0;

    // Construtor
    public Adivinhacao()
    {
        Scanner teclado = new Scanner(System.in);

        // Array com os temas para facilitar print :v
        String[] temas = {Cor.nvd + "Biologia" + Cor.r, Cor.nam + "Geografia" + Cor.r, Cor.nvr + "Historia" + Cor.r, Cor.nro + "Ingles" + Cor.r, Cor.az + "Matematica" + Cor.r, Cor.nci + "Portugues" + Cor.r, Cor.br + "Quimica" + Cor.r};

        // Print pra deixar bonito.
        System.out.println(Cor.colorir("JOGO DE ADIVINHACAO") + Cor.r +
        "\n- Dica: A resposta so pode ser" + Cor.ci + " 1 palavra" + Cor.r + "." +
        "\n- Digite \"revelar\" para revelar metade da resposta." +
        "\n- Digite \"pular\" para ir para a próxima pergunta." +
        "\n- Note que no modo de 2 jogadores não há como pular!");
        
        Printer.print("*", 60, true, true);
        
        // Verifica se será multiplayer.
        System.out.println("\n2 jogadores (s/n)?");
        
        System.out.print("\n-> ");
        
        // Decide através da variável.
        if (teclado.next().toLowerCase().equals("s")) setMultiplayer(true);
        
        System.out.println();
        Printer.print("*", 60, true, true);
        
        if (isMultiplayer())
        {
            for (int i = 0; i < 2; i++)
            {
                System.out.print("\nInsira o nome do jogador #" + (i + 1) + ": ");
                j[i].setNome(teclado.next().toUpperCase().strip());
            }
            
            Printer.print("*", 60, true, true);
        }
        
        System.out.println("\nEscolha um numero para escolher um tema: \n");
        
        // Printa os valores do vetor "temas".
        for (int i = 0; i < temas.length; i++)
        System.out.println("[ " + (i + 1) + " ] " + temas[i]);
        
        // Entrada para receber resposta.
        System.out.print("\n-> ");

        // Pega o valor que o usuario digitar e subtrai um, pois o array só vai ate 4.
        int t = teclado.nextInt() - 1;

        // Verifica o valor de "tema".
        if (t < 0 || t > 7)
        System.out.println("\nTema escolhido: Biologia");

        else
        {
            setTema(t);
            System.out.println("\nTema escolhido: " + temas[getTema()]);
        }
    }

    // Getters
    private String[][] getPerguntas()
    { return perguntas; }

    private String[][] getRespostas()
    { return respostas; }

    private boolean isRevelado()
    { return revelado; }
    
    private boolean isMultiplayer()
    { return multiplayer; }
    
    private boolean isTurno()
    { return turno; }
    
    private boolean isErrado()
    { return errado; }
    
    private boolean isCorreto()
    { return correto; }

    private int getTema()
    { return tema; }
    
    private int getPergAtual()
    { return pergAtual; }

    // Setters
    private void setRevelado(boolean revelado)
    { this.revelado = revelado; }
    
    private void setMultiplayer(boolean multiplayer)
    { this.multiplayer = multiplayer; }
    
    private void setTurno(boolean turno)
    { this.turno = turno; }
    
    private void setErrado(boolean errado)
    { this.errado = errado; }
    
    private void setCorreto(boolean correto)
    { this.correto = correto; }

    private void setTema(int tema)
    { this.tema = tema; }
    
    private void setPergAtual(int pergAtual)
    { this.pergAtual = pergAtual; }

    // Metodos
    private boolean checarResposta(String resposta)
    {
        String[][] resp = getRespostas();
        
        // Verifica a resposta no banco de dados e do usuario e retorna V/F.
        return resp[getTema()][getPergAtual()].equals(resposta);
    }
    
    // Inverte o valor de "turno".
    private void alternarVez()
    { if (isMultiplayer()) setTurno(!isTurno()); }
    
    private void avancarPergunta()
    {
        String[][] perg = getPerguntas();
        
        // Se a pergunta atual for de número menor que a quantidade, então avança...
        if (getPergAtual() < perg[getTema()].length - 1)
        {
            setPergAtual(getPergAtual() + 1);
            jogar();
        }
        
        // Senão significa que a pessoa ganhou!
        else ganhar();
    }
    
    private void pularPergunta()
    {
        // Se não está multijogador ou 
        if (!isMultiplayer() && j[0].getPulos() > 0 && getPergAtual() != 9)
        {
            j[0].alterarPulos(-1);
            avancarPergunta();
        }
    }
    
    public void revelarMeiaPalavra()
    {
        String[][] resp = getRespostas();
        String r = resp[getTema()][getPergAtual()];
        
        // Coloca a resposta em um vetor.
        char[] letras = r.toCharArray();
        String metade = "";
        
        // Revela metade da palavra.
        for (int i = 0; i < letras.length; i++)
        {
            if (i % 2 != 0)
            metade += letras[i];
            
            else
            metade += " _ ";
        }
        
        System.out.println(Cor.nci + "\nMetade da Resposta: " + Cor.r + Cor.colorir(metade));
    }
    
    private void ganhar()
    {
        System.out.println();
        Printer.print(">", 20, false, true);
        
        if (isMultiplayer())
        {
            if (j[0].getPontos() > j[1].getPontos())
            System.out.print(" " + j[0].getNome());
            
            else
            System.out.print(" " + j[1].getNome());
        }
        
        System.out.print(Cor.nvd + " VENCEU! " + Cor.r);
        
        Printer.print("<", 20, false, true);
        
        System.out.println("");
        
        if (isMultiplayer())
        {
            for (int i = 0; i < 2; i++)
            {
                System.out.println(Cor.br + j[i].getNome() + Cor.r + ":");
                System.out.println("Pontos: " + Cor.am + j[i].getPontos() + Cor.r);
                System.out.println("Vidas: " + Cor.ci + j[i].getVidas() + Cor.r);
            }
        }
        
        else
        {
            System.out.println("\nPontos: " + Cor.am + j[0].getPontos() + Cor.r);
            System.out.println("Vidas: " + Cor.ci + j[0].getVidas() + Cor.r);
            System.out.println("Pulos: " + Cor.vd + j[0].getPulos() + Cor.r);
        }
    }
    
    private void perder()
    {
        System.out.println();
        Printer.print(Cor.vr + ">" + Cor.r, 20, false, false);
        System.out.print(Cor.nvr + " PERDEU! " + Cor.r);
        Printer.print(Cor.vr + "<" + Cor.r, 20, false, false);
        
        System.out.println("\nPontos: " + Cor.am + j[0].getPontos() + Cor.r);
        System.out.println("Vidas: " + Cor.ci + j[0].getVidas() + Cor.r);
        System.out.println("Pulos: " + Cor.vd + j[0].getPulos() + Cor.r);
    }
    
    private void acertar()
    {
        if (isMultiplayer())
        {
            int vez = 1;
            if (isTurno()) vez = 0;
            
            if (j[vez].getVidas() < 5) j[vez].alterarVidas(1);
            
            j[vez].alterarPontos(10);
        }
        
        else
        {
            if (j[0].getVidas() < 5)j[0].alterarVidas(1);
            
            j[0].alterarPontos(10);
        }
        
        setCorreto(true);
        
        avancarPergunta();
    }
    
    private void errar()
    {
        if (isMultiplayer())
        {
            int vez = 1;
            
            if (isTurno()) vez = 0;
            
            if (j[vez].getVidas() > 1)
            {
                j[vez].alterarVidas(-1);
                j[vez].alterarPontos(-10);
                setErrado(true);
                jogar();
            }
            
            else
            ganhar();
        }
        
        else
        {
            if (j[0].getVidas() > 0)
            {
                j[0].alterarVidas(-1);
                j[0].alterarPontos(-10);
                setErrado(true);
                jogar();
            }

            else
            perder();
        }
    }
    
    public void jogar()
    {
        String[][] p = getPerguntas();
        char[] p_letras = Printer.desacentuar(p[getTema()][getPergAtual()]).toCharArray();
        Scanner teclado = new Scanner(System.in);
        
        alternarVez();
        
        Printer.print("*", 60, true, true);
        
        // Se multijogador, revela os pontos e as vidas.
        if (isMultiplayer())
        {
            System.out.println("Pontos:");
            System.out.println(Cor.nvr + j[0].getNome() + ": " + Cor.az + j[0].getPontos() + Cor.r);
            System.out.println(Cor.nam + j[1].getNome() + ": " + Cor.nro + j[1].getPontos() + Cor.r);
            
            System.out.println("\nVidas:");
            System.out.println(Cor.nvr + j[0].getNome() + ": " + Cor.nvd + j[0].getVidas() + Cor.r);
            System.out.println(Cor.nam + j[1].getNome() + ": " + Cor.nci + j[1].getVidas() + Cor.r);
            
            System.out.print("\nAgora e a vez de: ");
            
            
            if (isTurno())
            System.out.print(Cor.nvr + j[0].getNome() + "\n\n" + Cor.r);
            
            else
            System.out.print(Cor.nam + j[1].getNome() + "\n\n" + Cor.r);
        }
        
        else
        {
            System.out.println("Pontos: " + Cor.am + j[0].getPontos() + Cor.r);
            System.out.println("Pulos: " + Cor.vd + j[0].getPulos() + Cor.r);
            System.out.println("Vidas: " + Cor.ci + j[0].getVidas() + Cor.r + "\n\n");
        }

        // Faz a pergunta.
        for (int i = 0; i < p_letras.length; i++)
        {
            if (i == 0)
            System.out.print(Cor.colorir(Character.toString(p_letras[i]) + Character.toString(p_letras[i + 1])) + Cor.r);

            else if (i != 1)
            System.out.print(p_letras[i]);

            
            if (i != 0 && i % 60 == 0)
            System.out.print("\n");
        }

        // Revela metade da resposta caso o usuario tenha digitado "revelar".
        if (isRevelado())
        {
            System.out.println();
            revelarMeiaPalavra();
            setRevelado(false);
        }
        
        // Se a resposta está incorreta.
        if (isErrado())
        {
            // Se multiplayer.
            if (isMultiplayer())
            System.out.println(Cor.nvr + "\n\n-01" + Cor.r + " vida");

            // Ou solo.
            else System.out.println(Cor.nvr + "\n\n-01" + Cor.r + " vida");

            System.out.println(Cor.nvr + "-10" + Cor.r + " pontos");
            setErrado(false);
        }
        
        // Ou correta.
        else if (isCorreto())
        {
            System.out.println("\n");
            
            // Se multiplayer
            if (isMultiplayer())
            {
                int vez = 1;

                if (isTurno()) vez = 0;

                if (j[vez].getVidas() < 5)
                System.out.println(Cor.nvd + "\n+01" + Cor.r + " vida");
            }
            
            // Ou solo.
            else if (j[0].getVidas() < 5)
            System.out.println(Cor.nvd + "+01" + Cor.r + " vida");
            
            System.out.println(Cor.nvd + "+10" + Cor.r + " pontos");
            setCorreto(false);
        }

        // Usuario insere a resposta.
        System.out.print(Cor.nvd + "\n-> " + Cor.r);
        String r = Printer.desacentuar(teclado.next()).toLowerCase().strip();

        if (r.equals("revelar"))
        {
            setRevelado(true);
            jogar();
        }

        else if (r.equals("pular"))
        {
            pularPergunta();
            jogar();
        }

        else if (checarResposta(r))
        acertar();

        else
        errar();
    }
}