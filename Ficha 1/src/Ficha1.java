import java.time.Duration;
import java.time.LocalDateTime;
import java.util.Timer;
import java.util.TimerTask;

public class Ficha1 {

    //Exercício 1
    public double celsiusParaFarenheit(double graus){
        return (graus - 32) / 1.79999999;
    }

    //Exercício 2
    public int maximoNumeros(int a, int b){
        if(a>b){return a;}
        else{return b;}
    }

    public int menorNumeros(int a,int b){
        if(a<b){return a;}
        else{
            return b;
        }
    }
    //Exercicio 3

    //Exercicio 4
    public double eurosParaLibras(double valor, double taxaConversao){
        return valor*taxaConversao;
    }

    //Exercicio 5
    public double media(double num1,double num2){
        return (num1+num2)/2;
    }

    //Exercicio 6
    public double factorial(int num){
        int i,fact=1;
        for(i=1;i<=num;i++){
            fact=fact*i;
        }
        return fact;
    }

    //Exercicio 7
    public long tempoGasto() {
        LocalDateTime inicio = LocalDateTime.now();
        System.out.println("Data Atual: " + inicio + "\n");
        factorial(5000);
        LocalDateTime fim = LocalDateTime.now();
        System.out.println("Data Fim: " + fim + "\n");
        Duration duracao = Duration.between(inicio, fim);
        return duracao.toMillis();
    }
}
