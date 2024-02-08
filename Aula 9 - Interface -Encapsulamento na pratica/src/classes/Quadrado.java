package classes;

public class Quadrado {
    //Atributo
    int lado;
    //Construtor
    public Quadrado(int lado){
        this.lado = lado;
    }
    //Metodo Especifico
    public int geraArea(){
        return lado*lado;
    }
    //Getter e Setter

    public int getLado() {
        return lado;
    }

    public void setLado(int lado) {
        this.lado = lado;
    }
}
