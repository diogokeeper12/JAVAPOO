import java.util.Arrays;
import java.util.Scanner;

public class Ex1 {
    Ficha2 f2 = new Ficha2();
    vetores vect;

    public void escolheEx1(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Escolha um exercício: \nEx1.a - 1; \n  Ex1.b - 2; \n  Ex1.c - 3; \n");
        int exercicio = scanner.nextInt();
        switch (exercicio){
            case 1:
                System.out.println("Numero de inteiros a ler?: ");
                int n = scanner.nextInt();
                int valor = 0;
                int[] valores = new int[n];
                for(int i = 0;i<n;i++){
                    valor = scanner.nextInt();
                    valores[i] = valor;
                }
                vect = new vetores(valores);
                System.out.println("O menor é " + vect.minArray());
                break;
            case 2:
                System.out.println("Introduza dois números: ");
                int num1 = scanner.nextInt();
                int num2 = scanner.nextInt();
                System.out.println("\n------ARRAY GERADO------");
                f2.criaArrayIntervalo(num1,num2);
                break;
            case 3:
                System.out.println("Introduza um tamanho para os dois arrays: \n");
                int tam = scanner.nextInt();
                System.out.println("Introduza os elementos do primeiro array: ");
                int[] array1 = new int[tam];
                for(int i = 0;i<tam;i++){
                    int valorelem = scanner.nextInt();
                    array1[i] = valorelem;
                }

                System.out.println("Introduza os elementos do segundo array: \n");
                int[] array2 = new int[tam];
                for(int i = 0;i<tam;i++){
                    int valorelem = scanner.nextInt();
                    array2[i] = valorelem;
                }

                System.out.format("Array com valores comuns: %s",Arrays.toString(f2.calculaIguais(array1,array2)));


                break;

            default:
                System.out.println("Introduza um valor válido!");
                break;
        }

    }

}
