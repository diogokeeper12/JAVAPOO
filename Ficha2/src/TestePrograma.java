import java.util.Scanner;
public class TestePrograma {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Ex1 ex1 = new Ex1();
        Ex2 ex2 = new Ex2();
        Ex3 ex3 = new Ex3();
        Ex4 ex4 = new Ex4();

        System.out.println("Numero Ex: 1, 2, 3, 4, 5\n");
        int exercicio = scanner.nextInt();
        switch (exercicio) {
            case 1:
                ex1.escolheEx1();
            case 2:   //TODO 2.
                ex2.escolheEx2();
            case 3:
                ex3.escolheEx3();
            case 4:
                ex4.execEx4();
//TODO 5,6,7
        }
    }
}





