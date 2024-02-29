public class CirculoTestes {
    public static void main(String[] args) {
        // Teste do construtor padrão
        Circulo circulo = new Circulo();
        System.out.println("Construtor padrão: X = " + circulo.getX() + ", Y = " + circulo.getY() + ", Raio = " + circulo.getRaio());

        // Teste do construtor parametrizado
        circulo = new Circulo(1.5, 2.5, 3.5);
        System.out.println("Construtor parametrizado: X = " + circulo.getX() + ", Y = " + circulo.getY() + ", Raio = " + circulo.getRaio());

        // Teste do construtor de cópia
        Circulo circulo2 = new Circulo(circulo);
        System.out.println("Construtor de cópia: X = " + circulo2.getX() + ", Y = " + circulo2.getY() + ", Raio = " + circulo2.getRaio());

        // Teste do método alteraPos
        circulo.alteraPos(5, 10);
        System.out.println("alteraPos: X = " + circulo.getX() + ", Y = " + circulo.getY());

        // Teste do método calculaArea
        double area = circulo.calculaArea();
        System.out.println("calculaArea: " + area);

        // Teste do método calculaPerimetro
        double perimetro = circulo.calculaPerimetro();
        System.out.println("calculaPerimetro: " + perimetro);

        // Teste do método clone
        Circulo circulo3 = circulo.clone();
        System.out.println("clone: X = " + circulo3.getX() + ", Y = " + circulo3.getY() + ", Raio = " + circulo3.getRaio());

        // Teste do método equals
        boolean iguais = circulo.equals(circulo2);
        System.out.println("equals: " + iguais);

        // Teste do método toString
        String str = circulo.toString();
        System.out.println("toString: " + str);
    }
}
