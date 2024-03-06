public class LinhaEncomenda {
    /**
     * Declaraçao de variaveis
     */
    private String referenciaProduto;
    private String descricaoProduto;
    private double precoSemImpostos;
    private int quantidadeEncomendada;
    private double taxaImposto;
    private double descontoComercial;

    /**
     * Construtores da classe LinhaEncomenda
     * Declaraçao dos construtores por omissao, parametrizado e de copia
     */
    public LinhaEncomenda() {
        this.referenciaProduto = "";
        this.descricaoProduto = "";
        this.precoSemImpostos = 0.0;
        this.quantidadeEncomendada = 0;
        this.taxaImposto = 0.0;
        this.descontoComercial = 0.0;
    }

    public LinhaEncomenda(String referencia, String descricao, double precoSemImpostos, int quantidadeEncomendada, double taxaImposto, double descontoComercial){
        this.referenciaProduto = referencia;
        this.descricaoProduto = descricao;
        this.precoSemImpostos = precoSemImpostos;
        this.quantidadeEncomendada = quantidadeEncomendada;
        this.taxaImposto = taxaImposto;
        this.descontoComercial = descontoComercial;
    }

    public LinhaEncomenda(LinhaEncomenda encomenda){
        this.referenciaProduto = encomenda.getReferenciaProduto();
        this.descricaoProduto = encomenda.getDescricaoProduto();
        this.pre
    }


    // Methods Getters and Setters
    public String getReferenciaProduto() {
        return referenciaProduto;
    }

    public void setReferenciaProduto(String referencia) {
        this.referenciaProduto = referencia;
    }

    public String getDescricaoProduto() {
        return descricaoProduto;
    }

    public void setDescricaoProduto(String descricao) {
        this.descricaoProduto = descricao;
    }

    public double getPrecoSemImpostos() {
        return precoSemImpostos;
    }

    public void setPrecoSemImpostos(double preco) {
        this.precoSemImpostos = preco;
    }

    public int getQuantidadeEncomendada() {
        return quantidadeEncomendada;
    }

    public void setQuantidadeEncomendada(int quantidade) {
        this.quantidadeEncomendada = quantidade;
    }

    public double getTaxaImposto() {
        return taxaImposto;
    }

    public void setTaxaImposto(double taxa) {
        this.taxaImposto = taxa;
    }

    public double getDescontoComercial() {
        return descontoComercial;
    }

    public void setDescontoComercial(double desconto) {
        this.descontoComercial = desconto;
    }

    // Calcular valor da venda
    public double calculaValorLinhaEnc() {
        double valorBase = precoSemImpostos * quantidadeEncomendada;
        double valorImposto = valorBase * taxaImposto / 100;
        double valorDesconto = valorBase * descontoComercial / 100;
        return valorBase + valorImposto - valorDesconto;
    }

    // Calcular valor do desconto
    public double calculaValorDesconto() {
        return precoSemImpostos * quantidadeEncomendada * descontoComercial / 100;
    }
}
