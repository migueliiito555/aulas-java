package td03;



// 2ª Escreva um trecho Java que exiba os valores de um array a double numa mesma linha.
public class Q02 {
    public static void main(String[] args) {
        double vetor[] = {5, 6, 12, 27, 238, 2, 756, 342};



        for (int i = 0; i < vetor.length; i++) {
            System.out.print(vetor[i] + "      ");
        }
    }
}