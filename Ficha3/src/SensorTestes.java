public class SensorTestes {

    public static void main(String[] args) {
        Sensor sensor = new Sensor(10.5);

        // Teste do construtor parametrizado
        System.out.println("Pressão inicial: " + sensor.getPressao()); // Deve imprimir 10.5

        // Teste do método setPressao
        boolean sucesso = sensor.setPressao(-5.0);
        System.out.println("Pressão após leitura inválida: " + sensor.getPressao()); // Deve imprimir 10.5
        System.out.println("Sucesso na atualização (inválida): " + sucesso); // Deve imprimir false

        sucesso = sensor.setPressao(15.0);
        System.out.println("Pressão após leitura válida: " + sensor.getPressao()); // Deve imprimir 15.0
        System.out.println("Sucesso na atualização (válida): " + sucesso); // Deve imprimir true

        // Teste do método getPressao
        double pressaoAtual = sensor.getPressao();
        System.out.println("Pressão atual: " + pressaoAtual); // Deve imprimir 15.0
    }
}