package td03;



public class Q01d {
    public static void main(String[] args) {
        int vetor[] = new int[10];

        vetor[0] = 3;
        vetor[9] = 1;

        for (int i = 1; i < vetor.length; i++) {
            vetor[i] = vetor[i - 1] + vetor[9];
            vetor[9] += 2;
        }

        vetor[9] -= 2;

        for (int i = 0; i < vetor.length; i++) {
            System.out.println(vetor[i]);
        }
    }
}
