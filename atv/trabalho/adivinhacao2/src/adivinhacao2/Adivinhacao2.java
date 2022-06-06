package adivinhacao2;

import java.util.Scanner;
import extra.Printer;
import extra.Cor;

public class Adivinhacao2 extends Perguntas
{
    private int tentativas = 5, tent_j1 = 5, tent_j2 = 5, tema = 0, pontos = 0, pnt_j1 = 0, pnt_j2 = 0, pulos = 3, pergAtual = 0;
    private boolean revelado = false, multiplayer = false, turno = false;

    // Construtor
    public Adivinhacao2()
    {
        Scanner teclado = new Scanner(System.in);

        // Array com os temas para facilitar print :v
        String[] temas = {Cor.nvd + "Biologia" + Cor.r, Cor.nam + "Geografia" + Cor.r, Cor.nvr + "Historia" + Cor.r, Cor.nro + "Ingles" + Cor.r, Cor.az + "Matematica" + Cor.r, Cor.nci + "Portugues" + Cor.r, Cor.br + "Quimica" + Cor.r};

        // Print pra deixar bonito.
        System.out.println(Cor.colorir("JOGO DE ADIVINHACAO") + Cor.r +
        "\n- Dica: A resposta so pode ser" + Cor.ci + " 1 palavra" + Cor.r + "." +
        "\n- Digite \"revelar\" para revelar metade da resposta." +
        "\n- Digite \"pular\" para ir para a próxima pergunta.");
        
        Printer.print("*", 60, true, true);
        
        // Verifica se será multiplayer.
        System.out.println("\n2 jogadores (S/N)?");
        
        System.out.print("\n\n-> ");
        
        // Decide através da variável.
        if(teclado.next().toLowerCase().equals("s"))
        setMultiplayer(true);
        
        else
        setMultiplayer(false);
        
        // Printa os valores do vetor "temas".
        for (int i = 0; i < temas.length; i++)
        System.out.println("[ " + (i + 1) + " ] " + temas[i]);
        
        // Entrada para receber resposta.
        System.out.print("\n-> ");

        // Pega o valor que o usuario digitar e subtrai um, pois o array só vai ate 4.
        int tema = teclado.nextInt() - 1;

        // Verifica o valor de "tema".
        if (tema < 0 || tema > 7)
        System.out.println("\nTema escolhido: Biologia");

        else
        {
            setTema(tema);
            System.out.println("\nTema escolhido: " + temas[getTema()]);
        }
    }

    // Getters
    private String[][] getPerguntas()
    { return perguntas; }

    private String[][] getRespostas()
    { return respostas; }

    private boolean getRevelado()
    { return revelado; }
    
    private boolean getMultiplayer()
    { return multiplayer; }
    
    private boolean getTurno()
    { return turno; }
    
    private int getTentativas()
    { return tentativas; }
    
    private int getTentJ1()
    { return tent_j1; }
    
    private int getTentJ2()
    { return tent_j2; }
    
    private int getPntJ1()
    { return pnt_j1; }
    
    private int getPntJ2()
    { return pnt_j2; }

    private int getTema()
    { return tema; }
    
    private int getPontos()
    { return pontos; }
    
    private int getPulos()
    { return pulos; }
    
    private int getPergAtual()
    { return pergAtual; }

    // Setters
    private void setRespostas(int pos1, int pos2, String valor)
    { this.respostas[pos1][pos2] = valor; }

    private void setPerguntas(int pos1, int pos2, String valor)
    { this.perguntas[pos1][pos2] = valor; }

    private void setRevelado(boolean revelado)
    { this.revelado = revelado; }
    
    private void setMultiplayer(boolean multiplayer)
    { this.multiplayer = multiplayer; }
    
    private void setTurno(boolean turno)
    { this.turno = turno; }
    
    private void setTentativas(int tentativas)
    { this.tentativas = tentativas; }
    
    private void setTentJ1(int tent_j1)
    { this.tent_j1 = tent_j1; }
    
    private void setTentJ2(int tent_j2)
    { this.tent_j2 = tent_j2; }
    
    private void setPntJ1(int pnt_j1)
    { this.pnt_j1 = pnt_j1; }
    
    private void setPntJ2(int pnt_j2)
    { this.pnt_j2 = pnt_j2; }

    private void setTema(int tema)
    { this.tema = tema; }
    
    private void setPontos(int pontos)
    { this.pontos = pontos; }
    
    private void setPulos(int pulos)
    { this.pulos = pulos; }
    
    private void setPergAtual(int pergAtual)
    { this.pergAtual = pergAtual; }

    // Metodos
    private void alterarPontos(int pontos)
    {
        if (getMultiplayer())
        {
            if (getTurno())
            setPntJ1(getPntJ1() + pontos);
            
            else
            setPntJ2(getPntJ2() + pontos);
        }
        
        else
        setPontos(getPontos() + pontos);
    }
    
    private void alterarTentativas(int tentativas)
    {
        if (getMultiplayer())
        {
            if (getTurno())
            setTentJ1(getTentJ1() + tentativas);
            
            else
            setTentJ2(getTentJ2() + tentativas);
        }
        
        else
        setTentativas(getTentativas() + tentativas);
    }
    
    private void alternarVez()
    {
        if (getMultiplayer())
        this.turno = !this.turno;
    }
    
    private void avancarPergunta()
    {
        String[][] perg = getPerguntas();
        
        if (getPergAtual() < perg[getTema()].length - 1)
        {
            setPergAtual(getPergAtual() + 1);
            jogar();
        }
        
        else
        ganhar();
    }
    
    private void pularPergunta()
    {
        if (getPulos() > 0)
        {
            setPulos(getPulos() - 1);
            avancarPergunta();
        }
    }
    
    private boolean checarResposta(String resposta)
    {
        String[][] resp = getRespostas();
        
        // Verifica a resposta no banco de dados e do usuario.
        return resp[getTema()][getPergAtual()].equals(resposta);
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
        System.out.print(Cor.nvd + " VENCEU! " + Cor.r);
        Printer.print("<", 20, false, true);
        System.out.println();
    }
    
    private void perder()
    {
        System.out.println();
        Printer.print(Cor.vr + ">" + Cor.r, 20, false, false);
        System.out.print(Cor.nvr + " PERDEU! " + Cor.r);
        Printer.print(Cor.vr + "<" + Cor.r, 20, false, false);
        System.out.println();
    }
    
    private void acertar()
    {
        System.out.println(Cor.nvd + "CORRETO!" + Cor.r);
        
        if (getTurno())
        {
            if (getTentJ1() < 5)
            {
                System.out.println("JG1 " + Cor.az + "+1" + Cor.r + " tentativa.");
                alterarTentativas(1);
            }
        }
        
        else
        {
            if (getTentJ2() < 5)
            {
                System.out.println("JG2 " + Cor.az + "+1" + Cor.r + " tentativa.");
                alterarTentativas(1);
            }
        }
        
        alterarPontos(50);
        avancarPergunta();
    }
    
    private void errar()
    {
        System.out.println(Cor.nvr + "\nERRADO!" + Cor.r);
        
        if (getTentativas() > 0)
        {
            System.out.println(Cor.az + "-1" + Cor.r + " tentativa.");
            alterarTentativas(-1);
            alterarPontos(-25);
            alternarVez();
            jogar();
        }
        
        else
        perder();
    }
    
    public void jogar()
    {
        String[][] perguntas = getPerguntas();
        char[] perg = Printer.desacentuar(perguntas[getTema()][getPergAtual()]).toCharArray();
        Scanner teclado = new Scanner(System.in);
        
        Printer.print("*", 60, true, true);

        if (!getMultiplayer())
        {
            System.out.println("Pontos: " + Cor.am + getPontos() + Cor.r);
            System.out.println("Pulos: " + Cor.vd + getPulos() + Cor.r);
            System.out.println("Vidas: " + Cor.ci + getTentativas() + Cor.r + "\n\n");
        }
        
        else
        {
            System.out.println("Pontos:");
            System.out.println("JG1: " + Cor.nvr + getPntJ1() + Cor.r);
            System.out.println("JG2: " + Cor.nam + getPntJ2() + Cor.r);
            
            System.out.println("\nVidas:");
            System.out.println("JG1: " + Cor.nvd + getTentJ1() + Cor.r);
            System.out.println("JG2: " + Cor.nci + getTentJ2() + Cor.r + "\n\n");
            
            System.out.print("Turno: ");
            if (getTurno())
            System.out.print(Cor.nvr + "JG1" + Cor.r);
            
            else
            System.out.print(Cor.nam + "JG2" + Cor.r);
        }

        // Faz a pergunta.
        for (int i = 0; i < perg.length; i++)
        {
            if (i == 0)
            System.out.print(Cor.colorir(Character.toString(perg[i]) + Character.toString(perg[i + 1])));

            else if (i != 1)
            System.out.print(perg[i]);

            
            if (i != 0 && i % 60 == 0)
            System.out.print("\n");
        }

        // Revela metade da resposta caso o usuario tenha digitado "revelar".
        if (getRevelado())
        {
            System.out.println();
            revelarMeiaPalavra();
            setRevelado(false);
        }

        // Usuario insere a resposta.
        System.out.print(Cor.nvd + "\n\n-> " + Cor.r);
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