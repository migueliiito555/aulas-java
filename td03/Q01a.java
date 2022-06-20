package td03;



// 1A
public class Q01a {
    public static void main(String[] args) {
        int vetor[] = new int[10];



        for (int i = vetor.length - 1; i >= 0; i--) {
            vetor[i] = i + 1;
            System.out.println(vetor[i]);
        }
    }
}
