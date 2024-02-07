public class Main {

    public static void main(String[] args) {
        // Definição dos objetos que queremos criar
        // Iphone 12, ecra de 6.1", 256gb
        // Galaxy Note 20 Ultra, ecra de 6.9", 256gb
        // Xiaomi 11 Pro, ecra de 6.81", 128gb

        // Criar variavel em JAVA
        // <TipoVariavel> nomeVariavel = valor;

        Smartphone SmartphoneA = new Smartphone();  // Smartphone SmartphoneA -> declarar uma variavel do tipo Smartphone
                                                    // new Smartphone() -> Instanciar um novo objeto (Criar)
        SmartphoneA.nome = "Iphone 12";
        SmartphoneA.tamanhoEcra = 6.1f;
        SmartphoneA.sistemaOperativo = "iOS";
        SmartphoneA.espacoArmazenamento = 256;

        Smartphone SmartphoneB = new Smartphone();
        SmartphoneB.nome = "Galaxy Note 20 Ultra";
        SmartphoneB.tamanhoEcra = 6.9f;
        SmartphoneB.sistemaOperativo = "Android";
        SmartphoneB.espacoArmazenamento = 256;

        System.out.format("Smartphone %s com tela de %.1f, com %dgb e SO %s\n", SmartphoneA.nome, SmartphoneA.tamanhoEcra, SmartphoneA.espacoArmazenamento, SmartphoneA.sistemaOperativo);
        System.out.format("Smartphone %s com tela de %.1f, com %dgb e SO %s", SmartphoneB.nome, SmartphoneB.tamanhoEcra, SmartphoneB.espacoArmazenamento, SmartphoneB.sistemaOperativo);

    }
}