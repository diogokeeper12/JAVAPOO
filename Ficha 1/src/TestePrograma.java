import java.util.Scanner;

public class TestePrograma {

    public static void main(String[] args){
        //Init de um scanner de leitura
        Scanner scanner = new Scanner(System.in);

        Ficha1 f1 = new Ficha1(); //cria um objeto da classe ficha1 que tem os métodos necessários

        //Exercicio 1
        System.out.println("Introduza um o valor da temperatura em Celsius: ");
        int grausCelsius = scanner.nextInt();
        System.out.format("O respetivo valor em graus Farenheit é: %.2f°F\n",f1.celsiusParaFarenheit(grausCelsius));
    }

        //Exercício 2
}
