package adivinhacao2;

import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        Adivinhacao2 jogo = new Adivinhacao2();

        Scanner teclado = new Scanner(System.in);

        jogo.jogar();
    }
}
