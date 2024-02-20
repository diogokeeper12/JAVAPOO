import java.util.Scanner;

public class Ex3 {
    Ficha2 f2 = new Ficha2();
    public void escolheEx3(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Escolha um exercício: \nEx3.a - 1; \n  Ex3.b - 2; \n");
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
                System.out.println("\n");
                f2.sortArray(valores);
                break;
            case 2:
                System.out.println("Numero a encontrar?: ");
                int num = scanner.nextInt();
                int valor1 = 0;
                System.out.println("Numero de inteiros a ler?: ");
                int n1 = scanner.nextInt();
                int[] valores1 = new int[n1];
                for(int i = 0;i<n1;i++){
                    valor = scanner.nextInt();
                    valores1[i] = valor;
                }
                f2.procuraValor(valores1,num);

        }
    }

}
