package exerciciosJava;

public class ex8Operadores {
    public static void main(String[] args) {
        int vitoria, derrota, empate;
        int nmroVitorias, nmroEmpates, nmroDerrotas;
        vitoria = 3;
        empate = 1;
        derrota = 0;
        nmroVitorias= 12;
        nmroEmpates = 6;
        nmroDerrotas = 2;

        int totalVitoria = nmroVitorias * vitoria;
        int totalEmpate = nmroEmpates * empate;
        int totalDerrota = nmroDerrotas * derrota;
        int totalPontos = totalVitoria + totalEmpate + totalDerrota;
        int totalPartidas = nmroVitorias + nmroEmpates + nmroDerrotas;

        System.out.println("O time Tabajara F.C acumulou " + totalPontos + " após jogar " + totalPartidas + " partidas" );

    }
}
