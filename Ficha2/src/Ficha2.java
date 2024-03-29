import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;

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

        /**
         * ou entao
         * int min = Integer.MAX.VALUE     array[0]
         * for(int v:array){
         *      if(v<min)
         *      min = v;
         * }
         *
         */
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
    public int[] calculaIguais(int[] a1,int[] a2){
        Arrays.sort(a1);
        Arrays.sort(a2);
        int res[] = new int[Math.min(a1.length, a2.length)];
        int pos = 0;
        for(int i = 0;i< a1.length;i++){
            if(i==0 || a1[i] != a1[i-1]) {
                boolean found = false;
                for (int j = 0; j < a2.length & !found; j++) {
                    if (a1[i] == a2[j]) {
                        res[pos++] = a1[i];
                        found = true;
                    }
                }
            }
        }
        if (pos < res.length) {
            res = Arrays.copyOfRange(res, 0, pos);
        }
        return res;
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
    //ESTA NA CLASSE EX5.JAVA

    //EXERCICIO 7

    public void geraValores(){
        ArrayList<Integer> chaves = new ArrayList<>();
        ArrayList<Integer> estrelas = new ArrayList<>();
        Random rand = new Random();
        for(int i = 0; i<5; i++){
            int num = rand.nextInt(50);
            chaves.add(num);
        }
        System.out.format("Chaves: %s \n" , chaves.toString());
        for(int i = 0;i<2;i++){
            int num = rand.nextInt(9);
            estrelas.add(num);
        }
        System.out.format("Estrelas: %s \n", estrelas.toString());

        ArrayList<Integer> resultado = new ArrayList<>();
        resultado.addAll(chaves);
        resultado.addAll(estrelas);
        System.out.format("Resultado: %s \n", resultado.toString());
    }


}
