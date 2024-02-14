import java.time.Duration;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
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

            case 5:
                System.out.println("Indisponivel");
                break;

            case 6:
                System.out.println("Indisponivel");
                break;

            case 7:
                System.out.println("Indisponivel");
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

    //Exercicio 7


}



