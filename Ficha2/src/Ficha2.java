import java.util.Arrays;

public class Ficha2 {
    //EXERCICIO 1.A)
    public void minArray(int[] array){
        int min = array[0];
        int pos = 0;
        for(int i = 1;i<array.length;i++){
            if(array[i]<min){
                min = array[i];
                pos = i;
            }
        }
        System.out.format("Mínimo do array = %d, na posição %d",min,pos);
    }

    //EXERCICIO 1.B)
    public void criaArrayIntervalo(int n1,int n2){
        if(n2>n1){
            int arraySize = n2-n1+1;
            int[] array = new int[arraySize];
            for(int i = n1;i<=n2;i++){
                array[i-n1] = i; // preenche o array com os números de n1 a n2
                System.out.println(array[i-n1]); // imprime o elemento do array
            }
        }
        else{
            System.out.println("Erro!");
        }
    }

    //EXERCICIO 1.C)
    public void calculaIguais(int[] a1,int[] a2){
        System.out.println("Os valores repitos são:");
        for (int k : a1) {
            for (int i : a2) {
                if (k == i) {
                    System.out.println(k);
                }
            }
        }
    }

    //EXERCICIO 3.A)
    public void sortArray(int[] array){
        Arrays.sort(array);
        for (int elem:array){
            System.out.println(elem);
        }
    }

    //EXERCICIO 3.B)
    public void procuraValor(int[] array, int num){
        int pos = Arrays.binarySearch(array,num);
        System.out.format("Numero Encontrado na posicao %d do array",pos);
    }


    //EXERCICIO 5.A)
}
