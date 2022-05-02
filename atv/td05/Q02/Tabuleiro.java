package td05.Q02;

// 2ª) Uma classe Tabuleiro possui alguns atributos privados, aos quais você como programador irá definir, são eles: pontos jogador 1, pontos jogador 2, número de jogadas (inicia com 0), próximo a jogar. Faça os métodos GETTERS e SETTERS dessa classe. Além disso, crie um método para alterar a ordem do jogador e outro para verificar o jogador que ganhou (quem tiver mais pontos ganha).
public class Tabuleiro {
    private int pnt1, pnt2, jogadas = 0;
    private String prox = "Jogador 1";

    // Getters
    public int getPnt1()
    {
        return pnt1;
    }

    public int getPnt2()
    {
        return pnt2;
    }

    public int getJogadas()
    {
        return jogadas;
    }

    public String getProx()
    {
        return prox;
    }

    // Setters
    public void setPnt1(int pnt1)
    {
        this.pnt1 = pnt1;
    }

    public void setPnt2(int pnt2)
    {
        this.pnt2 = pnt2;
    }

    public void setJogadas(int jogadas)
    {
        this.jogadas = jogadas;
    }

    public void setProx(String prox)
    {
        this.prox = prox;
    }

    // Métodos
    public void alterarOrdem()
    {
        switch (getProx())
        {
            case "Jogador 1":
                setProx("Jogador 2");
                break;

            case "Jogador 2":
                setProx("Jogador 1");
                break;
        }
    }

    public void quemGanhou()
    {
        if (getPnt1() > getPnt2())
        {
            System.out.println("Jogador 1 ganhou com " + getPnt1() + " pontos.");
        }

        else if (getPnt2() > getPnt1())
        {
            System.out.println("Jogador 2 ganhou com " + getPnt2() + " pontos.");
        }

        else
        {
            System.out.println("Houve um empate!");
        }
    }
}
