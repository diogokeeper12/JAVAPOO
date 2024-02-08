import classes.Pessoa;

public class Main {
    public static void main(String[] args) {
        Pessoa pessoa = new Pessoa(); //-> ele executa o metodo construtor
        pessoa.setNome("Diogo");
        pessoa.setIdade(22);
        pessoa.setAltura(1.9f);

        System.out.format("Nome: %s, Idade: %d, Altura: %.1f", pessoa.getNome(),pessoa.getIdade(),pessoa.getAltura());

    }
}


//Constructor's constroi um objeto. Vai ser executado quando instanciamos um objeto, mal fizermos new Pessoa()