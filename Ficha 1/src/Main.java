import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        int a,b;
        Scanner ler = new Scanner(System.in);
        System.out.println("Indique dois inteiros: ");
        a = ler.nextInt();
        b = ler.nextInt();
        Exemplo1.dizMaior(a,b);
        ler.close();
    }


}


