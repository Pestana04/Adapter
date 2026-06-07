package Adapter;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class JogadorTest {

    @Test
    void deveConverterRankParaPontuacao() {

        Jogador jogador = new Jogador();

        jogador.setRank("Ouro");

        assertEquals(3000, jogador.getPontos());
    }

    @Test
    void deveConverterDiamanteParaPontuacao() {

        Jogador jogador = new Jogador();

        jogador.setRank("Diamante");

        assertEquals(5000, jogador.getPontos());
    }

    @Test
    void deveRecuperarRankAPartirDaPontuacao() {

        Rank rank = new Rank();
        RankAdapter adapter = new RankAdapter(rank);

        adapter.setPontos(4000);

        assertEquals("Platina", adapter.recuperarRank());
    }
}