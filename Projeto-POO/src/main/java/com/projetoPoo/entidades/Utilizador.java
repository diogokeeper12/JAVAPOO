package com.projetoPoo.entidades;

import java.util.ArrayList;

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
          return switch (tipoUser) {
              case PROFISSIONAL -> 0.8;
              case AMADOR -> 0.6;
              case OCASIONAL -> 0.4;
              default -> throw new IllegalArgumentException("Invalid TipoUser: " + tipoUser);
          };
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
            this.atividadesRealizadas = new ArrayList<Atividade>();
       }

    /**
     * Construtor de cópia de Utilizador
     * Aceita como parametro outro utilizador e utiliza os métodos
     * de acesso aos valores das variáveis de instância.
     */





}
