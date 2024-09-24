package Repositorios;

import java.util.ArrayList;

import Entidade.Jogador;

public class JogadorRepositorio {
    public ArrayList<Jogador> jogadores = new ArrayList<>();

    public void addJogador(Jogador jogador) {
        jogadores.add(jogador);
    }

    public void removeJogador(int id) {
        jogadores.remove(id);
    }

    public void changeJogador(int id) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'addLease'");
    }

    public ArrayList<Jogador> listJogador() {
        return jogadores;
    }

    public Jogador searchJogador(int id) {
        if (id >= 0 && id < jogadores.size()) {
            return jogadores.get(id);
        }
        return null;
    }
}
