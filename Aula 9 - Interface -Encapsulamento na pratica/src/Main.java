import classes.Circulo;

public class Main {
    public static void main(String[] args) {
            //Encapsulamento -> Interface
        Circulo circulo = new Circulo(2);
        double area = circulo.calculaArea();
        System.out.println(area);



    }
}