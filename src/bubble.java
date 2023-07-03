import java.util.Arrays;

public class bubble{
    public static void sort(int[] vetor){

        int troca;
        int passos = 0;
        boolean trocou = true;

        System.out.println("\n" + Arrays.toString(vetor) + " - Bubble Sort: \n");

        while (trocou){
            trocou = false;

            for (int i = 0; i < vetor.length - 1; i++){
                int j = i + 1;
                if (vetor[j] < vetor[i]){
                    troca = vetor[i];
                    vetor[i] = vetor[j];
                    vetor[j] = troca;
                    passos++;
                    trocou = true;
                    System.out.println("Passo " + passos + ": " + Arrays.toString(vetor) + " - trocou " + vetor[j] + " por " + vetor[i]);
                }
            }
        }
    }
}
