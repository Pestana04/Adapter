package Adapter;

public class Rank implements IRank {

    private String rank;

    @Override
    public String getRank() {
        return rank;
    }

    @Override
    public void setRank(String rank) {
        this.rank = rank;
    }
}