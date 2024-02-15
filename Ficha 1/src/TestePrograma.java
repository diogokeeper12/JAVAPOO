import java.util.Scanner;
import java.lang.String;

public class TestePrograma {

    public static void main(String[] args){
        //Init de um scanner de leitura
        Scanner scanner = new Scanner(System.in);

        Ficha1 f1 = new Ficha1(); //cria um objeto da classe ficha1 que tem os métodos necessários

        System.out.println("Numero Ex: 1,2,3,4,5,6,7: \n");
        int exercicio = scanner.nextInt();

        switch(exercicio){
            case 1:
                //Exercicio 1
                System.out.println("Introduza um o valor da temperatura em Celsius: ");
                int grausCelsius = scanner.nextInt();
                System.out.format("O respetivo valor em graus Farenheit é: %.2f°F\n",f1.celsiusParaFarenheit(grausCelsius));
                break;
            case 2:
                //Exericicio 2
                System.out.println("Introduza dois números: ");
                int num1 = scanner.nextInt();
                int num2 = scanner.nextInt();
                System.out.format("O maior número é: %d", f1.maximoNumeros(num1,num2));
                break;


            case 3:
                //Exercicio 3
                System.out.println("Introduza o seu nome: ");
                String nome = scanner.next();

                 System.out.println("Introduza o seu saldo bancário:");
                 double saldo = scanner.nextDouble();
                System.out.format("Olá %s, tem %f€ na conta.",nome, saldo);
                break;



            case 4:
                //Exercicio 4
                System.out.println("Introduza um valor em Euros: ");
                while (!scanner.hasNextInt()) {
                    System.out.println("Erro! Por favor, introduza um número inteiro.");
                    scanner.next();
                }
                int valor = scanner.nextInt();

                System.out.println("Introduza uma taxa de conversão: ");
                while (!scanner.hasNextDouble()) {
                    System.out.println("Erro! Por favor, introduza um número decimal.");
                    scanner.next();
                }
                double taxaConversao = scanner.nextDouble();
                System.out.format("O valor em libras é: %.2f£\n", f1.eurosParaLibras(valor,taxaConversao));
                System.out.println("Deseja continuar? 1-Sim 0-Não");
                while (!scanner.hasNextInt()) {
                    System.out.println("Erro! Por favor, introduza um valor válido.");
                    scanner.next();
                }
                int choice = scanner.nextInt();
                if(choice == 0){break;}


            case 5:
                //Exercicio 5
                System.out.println("Introduza dois números: ");
                int valor1 = scanner.nextInt();
                int valor2 = scanner.nextInt();
                System.out.format("%d %d, média: %.2f",f1.maximoNumeros(valor1, valor2),f1.menorNumeros(valor1,valor2),f1.media(valor1,valor2));
                break;

            case 6:
                System.out.println("Introduza um número: ");
                int nume = scanner.nextInt();
                System.out.format("O factorial de %d é: %f",nume,f1.factorial(nume));
                break;

            case 7:
                System.out.println("Tempo gasto: " + f1.tempoGasto() + " milissegundos");
                break;

            default:
                break;
        }
    }
}
