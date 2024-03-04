import java.util.*;

public class Telemovel {
    private String marca;
    private String modelo;
    private String resolucao;
    private int armazenamentoMensagens;
    private List<String> mensagensArmazenadas;
    private int armazenamentoTotal;
    private int armazenamentoFotos;
    private int armazenamentoApps;
    private int espacoOcupado;
    private int numFotos;
    private int numApps;
    private List<String> appsInstaladas;

    //CONSTRUTOR POR OMISSAO
    public Telemovel(){
        this.marca = null;
        this.modelo = null;
        this.resolucao = null;
        this.armazenamentoMensagens = 0;
        this.mensagensArmazenadas = null;
        this.armazenamentoTotal = 0;
        this.armazenamentoFotos = 0;
        this.armazenamentoApps = 0;
        this.espacoOcupado = 0;
        this.numFotos = 0;
        this.numApps = 0;
        this.appsInstaladas = null;
    }

    // Construtor
    public Telemovel(String marca, String modelo, String resolucao, int armazenamentoMensagens, int armazenamentoTotal, int armazenamentoFotos, int armazenamentoApps) {
        this.marca = marca;
        this.modelo = modelo;
        this.resolucao = resolucao;
        this.armazenamentoMensagens = armazenamentoMensagens;
        this.mensagensArmazenadas = new ArrayList<>();
        this.armazenamentoTotal = armazenamentoTotal;
        this.armazenamentoFotos = armazenamentoFotos;
        this.armazenamentoApps = armazenamentoApps;
        this.espacoOcupado = 0;
        this.numFotos = 0;
        this.numApps = 0;
        this.appsInstaladas = new ArrayList<>();
    }

    //CONSTRUTOR CÓPIA DE TELEMOVEL
//    public Telemovel(Telemovel umTelemovel){
//        this.marca = um.marca;
//        this.modelo = modelo;
//        this.resolucao = resolucao;
//        this.armazenamentoMensagens = armazenamentoMensagens;
//        this.armazenamentoTotal = armazenamentoTotal;
//        this.armazenamentoFotos = armazenamentoFotos;
//        this.armazenamentoApps = armazenamentoApps;
//        this.espacoOcupado = 0;
//        this.numFotos = 0;
//        this.numApps = 0;
//        this.appsInstaladas = new ArrayList<>();
//    }

    //METODOS GETTERS


    public String getMarca() {
        return this.marca;
    }

    public String getModelo() {
        return this.modelo;
    }

    public String getResolucao() {
        return this.resolucao;
    }

    public int getArmazenamentoMensagens() {
        return this.armazenamentoMensagens;
    }

    public List<String> getMensagensArmazenadas() {
        return this.mensagensArmazenadas;
    }

    public int getArmazenamentoTotal() {
        return this.armazenamentoTotal;
    }

    public int getArmazenamentoFotos() {
        return this.armazenamentoFotos;
    }

    public int getArmazenamentoApps() {
        return this.armazenamentoApps;
    }

    public int getEspacoOcupado() {
        return this.espacoOcupado;
    }

    public int getNumFotos() {
        return this.numFotos;
    }

    public int getNumApps() {
        return this.numApps;
    }

    public List<String> getAppsInstaladas() {
        return this.appsInstaladas;
    }


    //SETTERS
    public void setMarca(String marca) {
        this.marca = marca;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public void setResolucao(String resolucao) {
        this.resolucao = resolucao;
    }

    public void setArmazenamentoMensagens(int armazenamentoMensagens) {
        this.armazenamentoMensagens = armazenamentoMensagens;
    }

    public void setMensagensArmazenadas(List<String> mensagensArmazenadas) {
        this.mensagensArmazenadas = mensagensArmazenadas;
    }

    public void setArmazenamentoTotal(int armazenamentoTotal) {
        this.armazenamentoTotal = armazenamentoTotal;
    }

    public void setArmazenamentoFotos(int armazenamentoFotos) {
        this.armazenamentoFotos = armazenamentoFotos;
    }

    public void setArmazenamentoApps(int armazenamentoApps) {
        this.armazenamentoApps = armazenamentoApps;
    }

    public void setEspacoOcupado(int espacoOcupado) {
        this.espacoOcupado = espacoOcupado;
    }

    public void setNumFotos(int numFotos) {
        this.numFotos = numFotos;
    }

    public void setNumApps(int numApps) {
        this.numApps = numApps;
    }

    public void setAppsInstaladas(List<String> appsInstaladas) {
        this.appsInstaladas = appsInstaladas;
    }


    /**
     * Metodo Equals
     * @param o
     * @return
     */
    public boolean equals(Object o){
        if(this == o){
            return true;
        }
        if((o==null) || (this.getClass() != o.getClass())){
            return false;
        }
        Telemovel t = (Telemovel) o;
        return(this.marca == t.getMarca() && this.modelo == t.getModelo() && this.resolucao == t.getResolucao() && this.armazenamentoTotal == t.getArmazenamentoTotal());
    }

    public String toString(){
        return "Telemove da marca: " + this.marca + "do modelo: " + this.modelo + "e tem um ecra com resolução: " + this.resolucao;
    }

    public Telemovel clone(){
        return new Telemovel(this);
    }




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
//    public String maiorMsg() {
//        // Implementação depende do design da classe
//    }

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