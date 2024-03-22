package com.projetoPoo.entidades;

import java.time.LocalDateTime;

public class Atividade {

    enum tipoAtividade {
        ALTIMETRIA,
        DISTANCIA,
        REPETICOES,
        PESOS
    }

    private LocalDateTime tempoAtividade;

    private int caloriasQueimadas;

    private double fatorMult(tipoAtividade tipoatividade) {
        return switch (tipoatividade) {
            case ALTIMETRIA -> 1;
            case DISTANCIA -> 0.8;
            case REPETICOES -> 0.6;
            case PESOS -> 0.4;
            default -> throw new IllegalArgumentException("Inválido-TipoAtividade: " + tipoatividadea);
        };
    }


}
