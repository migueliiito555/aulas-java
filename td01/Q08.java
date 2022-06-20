package td01;



import java.util.Scanner;



// 8ª) Faça um programa que pergunte o preço de três produtos e informe qual produto você deve comprar, sabendo que a decisão é sempre o mais barato.
public class Q08 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);



        System.out.print("Digite o preço do primeiro produto: R$");
        float p1 = teclado.nextFloat();

        System.out.print("Agora do segundo: R$");
        float p2 = teclado.nextFloat();
        
        System.out.print("O último agora: R$");
        float p3 = teclado.nextFloat();



        teclado.close();



        if (p1 < p2 && p1 < p3) {
            System.out.println("Compre o de R$" + p1 + " reais.");
        }

        else if (p2 < p1 && p2 < p3) {
            System.out.println("Compre o de R$" + p2 + " reais.");
        }

        else if (p3 < p1 && p3 < p2) {
            System.out.println("Compre o de R$" + p3 + " reais");
        }

        else {
            System.out.println("Qualquer um serve, pois todos são R$" + p1 + " reais.");
        }
    }
}
