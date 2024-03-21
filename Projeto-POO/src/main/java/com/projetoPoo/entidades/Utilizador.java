package com.projetoPoo.entidades;

/**
 * Classe que implementa um Utilizado
 * 
 * @author Grupo xx
 * @version v1.0
 */


public class Utilizador {
    //variáveis de instância
    private static int contadorCodigo = 0;  //espécie de auto_increment para o código de utilizador
    private int codigoUser;
    private String nome;
    private String morada;
    private String email;
    private TipoUser tipoUser;
    private double freqCardiacaMedia;
    private double fatorMultiplicativo;
    private List<Atividade> atividadesRealizadas;

    enum TipoUser{
        PROFISSIONAL,
        AMADOR,
        OCASIONAL
    }


    /**
     * Construtores da classe Utilizador
     * Declaração dos construtores por omissão,
     * parametrizado e de cópia
     */


     /**
      * Construtor por omissão de Utilizador
      */

      public Utilizador(){
        this.codigoUser = ++contadorCodigo;
        this.nome = "";
        this.morada = "";
        this.email = "";
        this.tipoUser = TipoUser.OCASIONAL;
        this.freqCardiacaMedia = 0.0;
        this.fatorMultiplicativo = defFatorMultiplicativo(tipoUser);
        this.atividadesRealizadas = new ArrayList<>();
      }

      /**
       * Método que determina o fator multiplicativo de um utilizador
       */
      private double defFatorMultiplicativo(TipoUser tipoUser){
        switch(tipoUser){
            case PROFISSIONAL:
                return 0.8;
            case AMADOR:
                return 0.6;
            case OCASIONAL:
                return 0.4;
            default:
                break;
        }
      }


      /**
       * Construtor parametrizado de Utilizador
       */

       public Utilizador(int codigoUser, String nome, String morada, String email,TipoUser tipoUser, int freqCardiacaMedia){
            this.codigoUser = ++contadorCodigo;
            this.nome = nome;
            this.morada = morada;
            this.email = email;
            this.tipoUser = tipoUser;
            this.freqCardiacaMedia = freqCardiacaMedia;
            this.fatorMultiplicativo = definirFatorMultiplicativo(tipoUtilizador);
            this.atividadesRealizadas = new ArrayList<>();
       }

}
