import java.time.LocalDateTime;
import java.lang.System;
import java.time.temporal.ChronoUnit;

public class Lampada {
    private enum Estado{
        ON,OFF,ECO
    }

    private Estado estado;
    private double consumoMaximo;
    private double consumoEco;
    private double totalConsumo;
    private double consumoPeriodo;
    private long tempoLigado;
    private long tempoInicioPeriodo;


    /**
     * Construtor por omissão de Ponto
     */
    public Lampada() {
        this.estado = Estado.OFF;
        this.consumoMaximo = consumoMaximo;
        this.consumoEco = consumoEco;
        this.totalConsumo = 0.0;
        this.consumoPeriodo = 0.0;
        this.tempoLigado = 0;
        this.tempoInicioPeriodo = System.currentTimeMillis();
    }

//
//    /**
//     * Construtor copia
//     *
//     * @param umaLampada
//     */
//    public Lampada(Lampada umaLampada) {
//        this.estado = umaLampada.getEstado();
//        this.consumo = umaLampada.getConsumo();
//        this.consumoParcial = umaLampada.getConsumoParcial();
//        this.consumoPorMilissegundo = umaLampada.getConsumoPorMilissegundo();
//    }

    /**
     * Metodos Getters
     */

    public Estado getEstado() {
        return estado;
    }

    public double getConsumoMaximo() {
        return consumoMaximo;
    }

    public double getConsumoEco() {
        return consumoEco;
    }

    public double getTotalConsumo() {
        return totalConsumo;
    }

    public double getConsumoPeriodo() {
        return consumoPeriodo;
    }



    /**
     * Método que liga uma lampada
     */
    public void lampON(){
        if (estado != Estado.ON) {
            estado = Estado.ON;
            tempoLigado += System.currentTimeMillis() - tempoInicioPeriodo;
            tempoInicioPeriodo = System.currentTimeMillis();
        }
    }

    public void lampOFF() {
        if (estado != Estado.OFF) {
            estado = Estado.OFF;
            atualizaConsumo();
        }
    }
    public void lampECO() {
        if (estado != Estado.ECO) {
            estado = Estado.ECO;
            tempoLigado += System.currentTimeMillis() - tempoInicioPeriodo;
            tempoInicioPeriodo = System.currentTimeMillis();
        }
    }

    public void resetConsumoPeriodo() {
        consumoPeriodo = 0.0;
        tempoInicioPeriodo = System.currentTimeMillis();
    }


    private void atualizaConsumo() {
        double consumoAtual = 0.0;
        long tempoDecorrido = System.currentTimeMillis() - tempoInicioPeriodo;

        switch (estado) {
            case ON:
                consumoAtual = tempoDecorrido * consumoMaximo / 1000.0;
                break;
            case ECO:
                consumoAtual = tempoDecorrido * consumoEco / 1000.0;
                break;
        }
        totalConsumo += consumoAtual;
        consumoPeriodo += consumoAtual;
    }


}



