import java.util.*;

public class Telemovel {
    private String marca;
    private String modelo;
    private String resolucao;
    private int armazenamentoMensagens;
    private int armazenamentoTotal;
    private int armazenamentoFotos;
    private int armazenamentoApps;
    private int espacoOcupado;
    private int numFotos;
    private int numApps;
    private List<String> appsInstaladas;

    // Construtor
    public Telemovel(String marca, String modelo, String resolucao, int armazenamentoMensagens, int armazenamentoTotal, int armazenamentoFotos, int armazenamentoApps) {
        this.marca = marca;
        this.modelo = modelo;
        this.resolucao = resolucao;
        this.armazenamentoMensagens = armazenamentoMensagens;
        this.armazenamentoTotal = armazenamentoTotal;
        this.armazenamentoFotos = armazenamentoFotos;
        this.armazenamentoApps = armazenamentoApps;
        this.espacoOcupado = 0;
        this.numFotos = 0;
        this.numApps = 0;
        this.appsInstaladas = new ArrayList<>();
    }

    // Métodos de acesso e alteração
    // ... IMPLEMENTAR GETS E SETTS

    // (a)
    public boolean existeEspaco(int numeroBytes) {
        return (armazenamentoTotal - espacoOcupado) >= numeroBytes;
    }

    // (b)
    public void instalaApp(String nome, int tamanho) {
        if (existeEspaco(tamanho)) {
            appsInstaladas.add(nome);
            espacoOcupado += tamanho;
            numApps++;
        } else {
            System.out.println("Não há espaço suficiente para instalar a aplicação.");
        }
    }

    // (c)
    public void recebeMsg(String msg) {
        // Implementação depende do design da classe
    }

    // (d)
    public double tamMedioApps() {
        return espacoOcupado / (double) numApps;
    }

    // (e)
    public String maiorMsg() {
        // Implementação depende do design da classe
    }

    // (f)
    public void removeApp(String nome, int tamanho) {
        if (appsInstaladas.remove(nome)) {
            espacoOcupado -= tamanho;
            numApps--;
        } else {
            System.out.println("A aplicação não está instalada.");
        }
    }
}