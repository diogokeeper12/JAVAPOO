import java.util.Arrays;

public class vetores {
    private int[] vetor;

    public vetores(int[] array){
        vetor = Arrays.copyOf(array,array.length);
    }

    public int minArray(){
        int min = vetor[0];
        int pos = 0;
        for(int i = 1;i<vetor.length;i++){
            if(vetor[i]<min){
                min = vetor[i];
                pos = i;
            }
        }
        return min;
    }
}
