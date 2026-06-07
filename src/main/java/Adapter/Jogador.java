package Adapter;

public class Jogador {

    IRank rank;
    RankAdapter persistencia;

    public Jogador() {
        rank = new Rank();
        persistencia = new RankAdapter(rank);
    }

    public void setRank(String rank) {
        this.rank.setRank(rank);
        persistencia.salvarRank();
    }

    public String getRank() {
        return persistencia.recuperarRank();
    }

    public int getPontos() {
        return persistencia.getPontos();
    }
}