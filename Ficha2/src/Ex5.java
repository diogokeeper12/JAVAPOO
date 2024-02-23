public class Ex5 {

    private int[][] notasTurma = new int[5][5];

    public void atualizaNotas(int [][] notas){
        this.notasTurma = notas;
    }

    public int somaNotas(int uc){
        int soma = 0;
        for(int i=0;i<5;i++){
            soma += notasTurma[i][uc];
        }
        return soma;
    }

    public double calculaMediaAluno(int aluno){
        int soma = 0;
        for(int i=0;i<5;i++){
            soma += notasTurma[aluno][i];
        }
        return soma/5.0;
    }

    public double mediaUC(int uc) {
        return somaNotas(uc) / 5.0;
    }

    public int notaMaisAlta() {
        int max = notasTurma[0][0];
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                if (notasTurma[i][j] > max) {
                    max = notasTurma[i][j];
                }
            }
        }
        return max;
    }

    public int notaMaisBaixa() {
        int min = notasTurma[0][0];
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                if (notasTurma[i][j] < min) {
                    min = notasTurma[i][j];
                }
            }
        }
        return min;
    }

    public int[][] notasAcimaDe(int valor) {
        int[][] notasAcima = new int[5][5];
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                if (notasTurma[i][j] > valor) {
                    notasAcima[i][j] = notasTurma[i][j];
                } else {
                    notasAcima[i][j] = -1;
                }
            }
        }
        return notasAcima;
    }

}
