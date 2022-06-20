package td01;



import java.util.Scanner;



/* 21ª) Um posto está vendendo combustíveis com a seguinte tabela de descontos:

* Álcool:
    - Até 20 litros: desconto de 3% por litro
    - Acima de 20 litros: Desconto de 5% por litro 99.

* Gasolina:
    - Até 20 litros: desconto de 4% por litro
    - Acima de 20 litros, desconto de 6% por litro

Escreva um algoritmo que leia o número de litros vendidos, o tipo de combustível (codificado da seguinte forma: A-álcool. G-gasolina), calcule e imprima o valor a ser pago pelo cliente. 
 */
public class Q21 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);



        System.out.print("Quantos litros de combustível? ");
        double litros = teclado.nextDouble();



        if (litros > 0) {
            System.out.print("Qual o tipo (A - álcool/G - gasolina)? ");
            String comb = teclado.next().toLowerCase();



            teclado.close();



            switch (comb) {
                case "a":
                    if (litros <= 20) {
                        litros *= 0.97;
                    }

                    else {
                        litros *= 0.95;
                    }

                    break;



                case "g":
                    if (litros <= 20) {
                        litros *= 0.96;
                    }

                    else {
                        litros *= 0.94;
                    }

                    break;



                default:
                    litros = -999;
            }



            if (litros != -999) {
                System.out.println("\n\n\nO cliente deve pagar R$" + litros + " reais!");
            }

            else {
                System.out.println("\n\n\n[ERRO] Tipo Inválido!");
            }
        }

        else {
            System.out.println("\n\n\n[ERRO] Quantidade inserida inválida!");
        }
    }
}
