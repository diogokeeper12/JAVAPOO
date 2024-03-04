public class Sensor {

    private double pressao;

    /**
     * Construtores da classe Sensor
     * Declaração dos controres por omissão(vazio), parametrizado e de cópia.
     */

    /**
     * Construtor por omissão de Sensor
     */
    public Sensor(){
        this.pressao = 0;
    }

    //CONSTRUTOR PARAMETRIZADO
    public Sensor(double valor) {
        if(valor >=0){
            this.pressao = valor;// se for maior ou igual a 0 colocar o valor, senão 0
        }
        else{
            this.pressao = 0;
        }
    }


    //CONSTRUTOR COPIA DE SENSOR
    public Sensor(Sensor umSensor){
        this.pressao = umSensor.getPressao();
    }


    // Método para atualizar o valor da pressão
    public boolean setPressao(double valor) {
        if (valor >= 0) {
            this.pressao = valor;
            return true;
        }
        return false;
    }

    // Método para obter o valor da pressão
    public double getPressao() {

        return this.pressao;
    }

    public boolean equals(Object o){
        if(this == o){
            return true;
        }
        if((o==null) || (this.getClass() != o.getClass())){
            return false;
        }
        Sensor s = (Sensor) o;
        return (this.pressao == s.getPressao());
    }

    public String toString(){
        return "Pressão: " + this.pressao;
    }

    public Sensor clone(){
        return new Sensor(this);
    }

}
