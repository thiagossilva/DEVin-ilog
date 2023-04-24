package org.devinhouse.superherois.models;

public enum Operacao {
    ADICIONAR_HEROI,
    ADICIONAR_VILAO,
    LISTAR,
    SAIR;



    public static Operacao obterCodigo(int codigo) {
        Operacao[] operacoes = Operacao.values();
        /* enum começa em 0 e opções de menu em 1
        então a operação precisa retornar a opção digitada -1
        para retornar o valor da enum
         */
        return operacoes[codigo-1];
    }
}
