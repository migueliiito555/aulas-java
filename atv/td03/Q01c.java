package td03;



public class Q01c {
    public static void main(String[] args) {
        int vetor[] = new int[10];

        for (int i = 1; i <= 5; i++) {
            vetor[i - 1] = i;
        }
        
        for (int i = 1; i <= 5; i++) {
            vetor[i + 4] = i * 10;
        }
        
        for (int i = 0; i < vetor.length; i++) {
            System.out.println(vetor[i]);
        }
    }
}
