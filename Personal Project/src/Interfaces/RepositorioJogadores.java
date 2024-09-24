package Interfaces;

import java.util.List;

public interface RepositorioJogadores {
    void adicionarJogador(Jogador jogador);
    void removerJogador(Jogador jogador);
    List<Jogador> listarJogadores();
}
