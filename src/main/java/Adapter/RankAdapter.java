package Adapter;

public class RankAdapter extends Pontuacao {

    private IRank rank;

    public RankAdapter(IRank rank) {
        this.rank = rank;
    }

    public String recuperarRank() {

        if (this.getPontos() >= 5000)
            rank.setRank("Diamante");
        else if (this.getPontos() >= 4000)
            rank.setRank("Platina");
        else if (this.getPontos() >= 3000)
            rank.setRank("Ouro");
        else if (this.getPontos() >= 2000)
            rank.setRank("Prata");
        else
            rank.setRank("Bronze");

        return rank.getRank();
    }

    public void salvarRank() {

        if (rank.getRank().equals("Diamante"))
            this.setPontos(5000);
        else if (rank.getRank().equals("Platina"))
            this.setPontos(4000);
        else if (rank.getRank().equals("Ouro"))
            this.setPontos(3000);
        else if (rank.getRank().equals("Prata"))
            this.setPontos(2000);
        else
            this.setPontos(1000);
    }
}