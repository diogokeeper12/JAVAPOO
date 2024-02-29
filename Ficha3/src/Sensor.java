public class Sensor {

    private double pressao;

    // Construtor parametrizado
    public Sensor(double valor) {
        if(valor >=0){
            this.pressao = valor;// se for maior ou igual a 0 colocar o valor, senão 0
        }
        else{
            this.pressao = 0;
        }
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

}
