import java.util.Scanner;

public class Ex2 {
    Ficha2 f2 = new Ficha2();
    public void escolheEx2(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Escolha um exercício: \nEx1.a - 1; \n  Ex1.b - 2; \n  Ex1.c - 3; \n");
        int exercicio = scanner.nextInt();

        switch (exercicio){
            case 1:
                System.out.println("Adicione uma data");

        }
    }
}
