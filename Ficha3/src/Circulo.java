
public class Circulo {
    private double x;
    private double y;
    private double raio;

    /**
     * Construtores da classe Circulo
     * Declaração dos controres por omissão(vazio), parametrizado e de cópia.
     */

    /**
     * Construtor por omissão de Ponto
     */
    public Circulo(){
        this.x = 0;
        this.y = 0;
        this.raio = 0;
    }

    /**
     * Construtor parametrizado de Circulo.
     * Aceita como parametros os valores para cada coordenada
     * @param x
     * @param y
     * @param raio
     */
    public Circulo(double x,double y,double raio){
        this.x = x;
        this.y = y;
        this.raio = raio;
    }

    /**
     * TODO: PERGUNTAR SE umCirculo é do tipo Circulo
     * Construtor de cópia de Circulo.
     * Aceita como parametro outro Circulo e utiliza os metodos de acesso aos valores das variaveis de instância.
     * @param umCirculo
     */
    public Circulo(Circulo umCirculo){
        this.x = umCirculo.getX();
        this.y = umCirculo.getY();
        this.raio = umCirculo.getRaio();
    }

    /**
     * a) Devolve o valor da coordenada em x.
     *
     * @return valor da coordenada x.
     */
    public double getX(){
        return this.x;
    }

    /**
     * b) Devolve o valor da coordenada em y.
     *
     * @return valor da coordenada y.
     */
    public double getY(){
        return this.y;
    }

    /**
     * c) Devolve o valor da coordenada em raio.
     *
     * @return valor da coordenada raio.
     */
    public double getRaio(){
        return this.raio;
    }

    /**
     * d)
     * Atualiza o valor da variavel em x
     * @param newX
     */
    public void setX(double newX){
        this.x = newX;
    }

    /**
     * d)
     * Atualiza o valor da variavel em y
     * @param newY
     */
    public void setY(double newY){
        this.y = newY;
    }

    /**
     * d)
     * Atualiza o valor da variavel em raio
     * @param newRaio
     */
    public void setRaio(double newRaio){
        this.raio = newRaio;
    }

    /**
     * e)
     * Altera o posicionamento do círculo
     */
    public void alteraPos(int newX,int newY){
        this.setX(newX);
        this.setY(newY);
    }

    /**
     * f) Calcula a área do circulo
     * @return area
     */
    public double calculaArea(){
        return Math.PI *(2*this.raio);
    }

    /**
     * g)Calcula o perimetro do circulo
     * @return
     */
    public double calculaPerimetro(){
        return 2*Math.PI*this.raio;
    }

    /**
     * Método Equals TODO: PERGUNTAR AO PROF O QUE FAZ ESTE METODO
     *
     */

//    public boolean equals(Object o){
//        if(this== o){
//            return true;
//        }
//        if((o==null) || (this.getClass() != o.getClass())){
//            return false;
//        }
//        Circulo c = (Circulo) o;
//        return (this.x == c.getX() && this.y == c.getY() && this.raio == c.getRaio());
//    }


    /**
     * TODO PORQUE NAO DA ?
     */
//    public String toString(){
//        return "Cx = " + this.x + " -  Cy = " + this.y + " -  Craio = " + this.raio;
//    }


    public Circulo clone(){
        return new Circulo(this);
    }
}
