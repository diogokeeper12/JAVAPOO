package classes;

public class Circulo {
    //Construtor
    public Circulo(int raio){
        this.raio = raio;
    }

    // Atributos
    private int raio;

    //Metodos da classe
    public double calculaArea(){
        double area = Math.PI * Math.pow(raio,2);
        return area;
    }

    //Metodos getters e setters
    public int getRaio() {
        return raio;
    }
    public void setRaio(int raio) {
        this.raio = raio;
    }

}
