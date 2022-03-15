package td02;



// 2. Faça um programa que mostre as tabuadas dos números de 1 a 10 usando os 3 laços de repetição.
public class Q02 {
    public static void main(String[] args) {
        System.out.println("LAÇO FOR:");

        for (int j = 1; j <= 10; j++) {
            for (int i = 0; i <= 10; i++) {
                System.out.println(j + " x " + i + " = " + (j * i));
            }

            System.out.println("\n");
        }



        System.out.println("LAÇO WHILE:");
        int j = 1, i = 0;
        while (j <= 10) {
            while (i <= 10) {
                System.out.println(j + " x " + i + " = " + (j * i));

                i++;
            }



            System.out.println("\n");



            i = 0;
            j++;
        }



        System.out.println("LAÇO DO-WHILE:");
        i = 0;
        j = 1;
        do {
            do {
                System.out.println(j + " x " + i + " = " + (j * i));



                i++;
            } while (i <= 10);



            System.out.println("\n");



            i = 0;
            j++;
        } while (j <= 10);
    }
}
