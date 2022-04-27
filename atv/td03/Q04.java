package td03;



// 4ª) Crie um método que recebe um array de inteiros e retorna a quantidade de elementos do array que são números negativos.
public class Q04 {
    public static void main(String[] args) {
        int vetor[] = {55, -29, 382, -23};
        int neg = 0;



        for (int i = 0; i < vetor.length; i++) {
            if (vetor[i] < 0) {
                neg++;
            }
        }



        System.out.println("O vetor possui " + neg + " número(s) negativo(s).");
    }
}
