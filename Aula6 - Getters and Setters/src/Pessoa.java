public class Pessoa {
    //ATRIBUTOS DE CLASSE METEMOS SEMPRE PRIVATE. NÃO OS CONSEGUIMOS ACEDER FORA DESTA CLASSE
    private String nome;
    private int idade;
    private double altura;

    public String getNome(){
        return nome;
    }

    public void setNome(String nome){
        this.nome = nome;   //this.nome é o próprio atributo original do atributo
    }

    public int getIdade(){
        return idade;
    }

    public void setIdade(int idade){
        this.idade = idade;   //this.nome é o próprio atributo original do atributo
    }

    public double getAltura(){
        return altura;
    }

    public void setAltura(double altura){
        this.altura = altura;   //this.nome é o próprio atributo original do atributo
    }
}

//metodos get e set tem que ser publicos