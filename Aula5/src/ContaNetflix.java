public class ContaNetflix {
    String idiomaPreferencial;
    String resolucaoTela;

    void entrar(){
        procurarPreferenciasUser();
        identificarResolucao();
    }

    void procurarPreferenciasUser(){
        idiomaPreferencial = "PT-PT";
    }

    void identificarResolucao(){
        resolucaoTela = "FHD";
    }

    void assistirFilme(String nomeFilme){
        System.out.println("Iniciando o filme " + nomeFilme);
        System.out.println("Carregando o filme na resolução " + resolucaoTela);
        carregarAudioFilme();

    }

    void carregarAudioFilme(){
        if(idiomaPreferencial == "PT-PT" || idiomaPreferencial == "EN-US"){
            System.out.println("Carregando o auidio em " + idiomaPreferencial);
        }else{
            System.out.println("Carregando o audio em EN-US ");
        }
    }
}
