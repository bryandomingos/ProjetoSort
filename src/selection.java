import java.util.Arrays;

public class selection{
    public static void sort(int[] vetor){

        int troca;
        int passos = 0;

        System.out.println("\n" + Arrays.toString(vetor) + " - Selection Sort: \n");

        for (int i = 0; i < vetor.length; i++){
            int menor = vetor[i];
            int alvo = i;

            for (int j = i + 1; j < vetor.length; j++){
                if (vetor[j] < menor){
                    menor = vetor[j];
                    alvo = j;
                }
            }

            if (alvo != i){ // nao troca indice por si alvo

                troca = vetor[i];
                vetor[i] = vetor[alvo];
                vetor[alvo] = troca;
                passos++;
                System.out.println("Passo " + passos + ": " + Arrays.toString(vetor) + " - trocou " + vetor[alvo] + " por " + vetor[i]);
            }
        }
    }
}
