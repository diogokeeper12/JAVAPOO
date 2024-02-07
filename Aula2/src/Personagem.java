import java.util.Random;
public class Personagem {
    String nome;
    Integer nivel;
    Integer forca;

    //criar um método para mostrar o status de uma personagem
    //isto evita a termos que fazer 1000 println
    //void -> significa que não retorna nada
    void mostrarStatus(){
        System.out.format("Personagem: %s (lvl %d) com %d de força.\n", nome, nivel, forca);

    }

    //metodo para calcular o Dano Causado
    int calcularDano(){
        Random gerador = new Random();
        //1..20
        //nextInt(): 0..19
        int dado20Faces = 1 + gerador.nextInt(19);
        int dano = forca + dado20Faces;
        return dano;
    }



    //método que não retorna nada e recebe um parametro uma string "Hydra"
    // criar um método para o heroi poder atacar
    //podemos passar argumentos dentro dos métodos
    void atacar(String alvo, String habilidade){
        int danoCausado = calcularDano();
        if (habilidade.length() == 0){
            System.out.format("%s atacou %s e causou %d de dano.\n", nome, alvo, danoCausado);
        }else{
            System.out.format("%s usou '%s' contra %s e causou %d de dano.\n", nome,habilidade, alvo, danoCausado);
        }
    }
}
