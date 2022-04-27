package td01;



import java.util.Scanner;



/* 16ª) Faça um programa que calcule as raízes de uma equação do segundo grau, na forma ax2 + bx + c. O programa deverá pedir os valores de a, b e c e fazer as consistências, informando ao usuário nas seguintes situações:

- Se o usuário informar o valor de A igual a zero, a equação não é do segundo grau e o programa não deve fazer pedir os demais valores, sendo encerrado;
- Se o delta calculado for negativo, a equação não possui raízes reais. Informe ao usuário e encerre o programa;
- Se o delta calculado for igual a zero a equação possui apenas uma raiz real; informe ao usuário;
- Se o delta for positivo, a equação possui duas raízes reais, informe-as ao usuário;
*/
public class Q16 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);



        System.out.print("Qual o valor de 'a'? ");
        double a = teclado.nextDouble();



        if (a == 0) {
            System.out.println("\n\n\n[ERRO] 'a' não pode ser 0!");
        }

        else {
            System.out.print("E de 'b'? ");
            double b = teclado.nextDouble();

            System.out.print("Agora de 'c': ");
            double c = teclado.nextDouble();



            teclado.close();



            double delta = b * b - 4 * a * c;
            double x1 = (- b + Math.sqrt(delta)) / (2 * a);
            double x2 = (- b - Math.sqrt(delta)) / (2 * a);



            if (delta < 0) {
                System.out.println("\n\n\nRaízes não reais!");
            }

            else if (delta > 0) {
                System.out.println("\n\n\nDuas raízes reais!\nX' = " + x1 + "\nX'' = " + x2);
            }

            else {
                System.out.println("\n\n\nSomente uma raíz real!\nX = " + x1);
            }
        }
    }
}
