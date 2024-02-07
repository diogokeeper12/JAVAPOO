import java.sql.SQLOutput;

public class Main {
    public static void main(String[] args) {
        Personagem heroi = new Personagem(); //Criar um objeto do tipo Personagem;
        heroi.nome = "Hercules";
        heroi.nivel = 2;
        heroi.forca = 16;

        //estamos a executar um método para um objeto
        heroi.mostrarStatus();
        // chamei o método atacar e passei como argumento uma string "Hydra"
        heroi.atacar("Hydra","Golpe Duplo");
    }
}