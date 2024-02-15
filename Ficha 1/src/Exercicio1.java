import java.sql.SQLOutput;
import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoField;
import java.time.temporal.ChronoUnit;
import java.util.Scanner;

public class Exercicio1 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Numero Ex: 1,2,3,4,5,6,7: \n");
        int exercicio = scanner.nextInt();

        switch (exercicio){
            case 1:
                //exercicio1
                String data1 = "2024-02-14T11:01:43";
                String data2 = "2024-02-15T12:02:44";
                System.out.println("Exercício 1: \n");
                System.out.println(somaDatas(data1, data2));
                break;

            case 2:
                System.out.println("Indisponivel");
                break;

            case 3:
                //Exercício3
                /*Criamos um array com tamanho n, dado pelo user, para recolher as classificações
                 *que pretendemos avaliar.
                 * Depois percorremos essas classificações dadas, e adicionamos as mesmas para um array
                 * classificacoes que é dado como parametro ao metodo contaClassificacoes()
                 * */

                Scanner input = new Scanner(System.in);
                System.out.println("Insira o número de classificacoes a introduzir: \n");
                int n = input.nextInt();
                double[] classificoes = new double[n];
                System.out.println("Insira as classificações: ");
                for(int i = 0; i<n;i++){
                    classificoes[i] = input.nextDouble();
                }

                System.out.println("Exercício 3: \n");
                contaClassificacoes(classificoes);
                break;

            case 4:
                System.out.println("Exercicio 4: \n");
                System.out.println("Insira o número de dias: ");
                int n1 = scanner.nextInt();
                int[] temperaturas = new int[n1];

                System.out.println("Insira as temperaturas: ");
                for (int i = 0; i < n1; i++) {
                    temperaturas[i] = scanner.nextInt();
                }
                calculaTemperaturas(temperaturas);
                break;

//ex5: Escrever um programa que leia sucessivas vezes a base e altura
            case 5:
                double base, altura,area,perimetro;
                while(true){
                    System.out.println("Insira a base do triângulo: ");
                    base = scanner.nextDouble();
                    if(base ==0.0){
                        break;
                    }
                    System.out.println("Insira a altura do triângulo: ");
                    altura = scanner.nextDouble();

                    area = (base*altura) / 2;
                    perimetro = base + altura + Math.sqrt(Math.pow(base,2) + Math.pow(altura,2));

                    System.out.format("Area: %.5f\n",area);
                    System.out.format("Perimetro: %.5f\n",perimetro);
                }
                scanner.close();
                break;

            case 6:
                boolean continuar = true;
                while(continuar) {
                    System.out.println("Introduza um número: ");
                    int num = scanner.nextInt();
                    System.out.println("Lista de todos os números primos inferiores ao número introduzido: ");
                    for (int i = 0; i < num; i++) {
                        if (isPrime(i) == true) {
                            System.out.format("%d \n", i);
                        }
                    }
                    System.out.println("Deseja continuar? 1-Sim 0-Não");
                    int choice = scanner.nextInt();
                    if(choice == 1){
                        continuar = true;
                    }
                    else{
                        break;
                    }
                }
               break;

            case 7:
                LocalDateTime dataAgora = LocalDateTime.now();
                DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");
                String dataFormatada = dataAgora.format(formatter);


                System.out.println("Introduza o seu ano de nascimento: \n");
                int ano = scanner.nextInt();
                System.out.println("Introduza o seu mes de nascimento: \n");
                int mes = scanner.nextInt();
                System.out.println("Introduza o seu dia de nascimento: \n");
                int dia = scanner.nextInt();

                LocalDate dataNascimento = LocalDate.of(ano, mes, dia);

                long horasVida = ChronoUnit.HOURS.between(dataNascimento.atStartOfDay(),dataAgora);
                System.out.format("A sua idade em horas é: %d. \n", horasVida);
                System.out.format("Este cálculo foi realizado às: %s\n",dataFormatada);
                scanner.close();
                break;

            default:
                System.out.println("Numero Invalido:");
                break;
        }
    }

    //Exercicio1
    public static String somaDatas(String data1, String data2) {
        DateTimeFormatter formato = DateTimeFormatter.ofPattern("yyyy-MM-dd'T'HH:mm:ss");
        LocalDateTime d1 = LocalDateTime.parse(data1, formato);
        LocalDateTime d2 = LocalDateTime.parse(data2, formato);

        Duration duracao = Duration.between(d1, d2).abs();

        long dias = duracao.toDays();
        duracao = duracao.minusDays(dias);

        long horas = duracao.toHours();
        duracao = duracao.minusHours(horas);

        long minutos = duracao.toMinutes();
        duracao = duracao.minusMinutes(minutos);

        long segundos = duracao.getSeconds();

        return String.format("%dD %dH %dM %dS", dias, horas, minutos, segundos);
    }

    //Ex3
    private static void contaClassificacoes(double classificacoes[]){
        int[] contagem = new int[4];  //isto implementa tipo um dicionário
        for (double classificacao : classificacoes) {
            if (classificacao >=0 && classificacao <5) {
                contagem[0]++;
            }
            else if (classificacao >=5 && classificacao <10){
                contagem[1]++;
            }
            else if (classificacao >=10 && classificacao <15){
                contagem[2]++;
            }
            else if (classificacao >=15 && classificacao <20){
                contagem[3]++;
            }
        }
        System.out.format("Notas no intervalo [0,5[: %d\n ",contagem[0]);
        System.out.format("Notas no intervalo [5,10[: %d\n ",contagem[1]);
        System.out.format("Notas no intervalo [10,15[: %d\n ",contagem[2]);
        System.out.format("Notas no intervalo [15,20[: %d\n ",contagem[3]);
    }


    //Exercicio 4
    private static void calculaTemperaturas(int[] temperaturas){
        int soma = 0;
        int maiorVariacao = 0;
        int diaMaiorVariacao = 0;

        for (int i = 0; i < temperaturas.length; i++) {
            soma +=temperaturas[i];
            if(i>0) {
                int variacao = Math.abs(temperaturas[i] - temperaturas[i - 1]);
                if (variacao > maiorVariacao) {
                    maiorVariacao = variacao;
                    diaMaiorVariacao = i + 1;
                }
            }
        }
        double media = (double) soma / temperaturas.length;
        System.out.format("A média das %d temperaturas foi de &d graus.\n",temperaturas.length,media);
        System.out.println("A maior variação registou-se entre os dias " + (diaMaiorVariacao - 1) + " e " + diaMaiorVariacao + ", tendo a temperatura " + (temperaturas[diaMaiorVariacao - 1] < temperaturas[diaMaiorVariacao - 2] ? "subido" : "descido") + " " + maiorVariacao + " graus.");    }


    //Exercicio 5

    //Exercicio 6

    private static boolean isPrime(int n){
        if(n <= 1){
            return false;
        }
        for (int i = 2; i * i <= n; i++){
            if(n % i == 0){return false;}
        }
        return true;
    }


    //Exercicio 7


}



