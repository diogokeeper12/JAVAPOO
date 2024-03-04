import java.time.LocalDateTime;
import java.lang.System;
import java.time.temporal.ChronoUnit;

public class Lampada {

    private int estado = 0FF; //0-OFF, 1-ON , 2-ECO
    private double consumoPorMilissegundo;
    private double consumo;
    private double consumoParcial;
    private double total;

    //Precisamos de um timestamp



    /**
     * Construtor por omissão de Ponto
     */
    public Lampada() {
        this.estado = 0;
        this.consumo = 0;
        this.consumoParcial = 0;
        this.consumoPorMilissegundo = 0;
    }


    /**
     * Construtor copia
     *
     * @param umaLampada
     */
    public Lampada(Lampada umaLampada) {
        this.estado = umaLampada.getEstado();
        this.consumo = umaLampada.getConsumo();
        this.consumoParcial = umaLampada.getConsumoParcial();
        this.consumoPorMilissegundo = umaLampada.getConsumoPorMilissegundo();
    }

    /**
     * Metodo GetEstado
     */

    public int getEstado(){
        return this.estado;
    }

    public double getConsumo() {
        return this.consumo;
    }

    public double getConsumoParcial(){
        return this.consumoParcial;
    }

    public double getConsumoPorMilissegundo(){
        return this.consumoPorMilissegundo;
    }


    /**
     * Método que liga uma lampada
     */
    public void lampON(){
        this.estado = 1;
    }
    public void lampOFF(){
        this.estado = 0;
    }
    public void lampECO(){
        this.estado = 2;
    }


    public double atualiza consumo
    public double totalConsumo(){
        LocalDateTime now = LocalDateTime.now();
        long periodo = stamp.until(now, ChronoUnit.MILLIS);
        if(this.estado == Lampada.ON){
            //(...) TODO ->> 
        }
    }
}



