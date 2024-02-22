import java.util.Scanner;
public class TestePrograma {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Ex1 ex1 = new Ex1();
        Ex2 ex2 = new Ex2();
        Ex3 ex3 = new Ex3();
        Ex4 ex4 = new Ex4();
        Ex5 ex5 = new Ex5();
        Ficha2 f2 = new Ficha2();

        System.out.println("Numero Ex: 1, 2, 3, 4, 5\n");
        int exercicio = scanner.nextInt();
        switch (exercicio) {
            case 1:
                ex1.escolheEx1();
                break;
            case 2:   //TODO 2.
                ex2.escolheEx2();
                break;
            case 3:
                ex3.escolheEx3();
                break;
            case 4:
                ex4.execEx4();
                break;
            case 5:
                int[][] notas = new int[5][5];
                for (int i = 0; i < 5; i++) {
                    for (int j = 0; j < 5; j++) {
                        System.out.println("Insira a nota do aluno " + (i+1) + " na unidade curricular " + (j+1) + ":");
                        notas[i][j] = scanner.nextInt();
                    }
                }
                ex5.atualizaNotas(notas);

                // Calcular a soma das notas a uma determinada unidade curricular
                System.out.println("Insira o índice da unidade curricular para calcular a soma das notas:");
                int uc = scanner.nextInt();
                System.out.println("A soma das notas à unidade curricular " + uc + " é " + ex5.somaNotas(uc));

                // Calcular a média das notas de um aluno
                System.out.println("Insira o índice do aluno para calcular a média das notas:");
                int aluno = scanner.nextInt();
                System.out.println("A média das notas do aluno " + aluno + " é " + ex5.calculaMediaAluno(aluno));


                // Calcular a nota mais alta e mais baixa
                System.out.println("A nota mais alta é " + ex5.notaMaisAlta());
                System.out.println("A nota mais baixa é " + ex5.notaMaisBaixa());
                break;
            case 7:
                f2.geraValores();
                break;
//TODO 5,6,7
        }
    }
}





