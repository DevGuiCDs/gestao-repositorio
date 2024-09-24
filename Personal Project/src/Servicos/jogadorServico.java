package Servicos;

import Entidade.Jogador;
import Repositorios.JogadorRepositorio;

public class jogadorServico {
    private JogadorRepositorio jogadorRepositorio = new JogadorRepositorio();

    // CONSTRUTOR
    public jogadorServico(JogadorRepositorio jogadorRepositorio) {
        this.jogadorRepositorio = jogadorRepositorio;
    }

    // METODOS PERSONALIZADOS

    // ADICIONA
    public void addJogador(String nome, int idade, String posicao){
        if (nome == null || posicao == null ) {
            System.out.println("Erro: Falta informações para o jogador.");
        }
        Jogador jogador = new Jogador(nome, idade, posicao);
        jogadorRepositorio.addJogador(jogador);
    }

    public void removerJogador(int id){
        if (jogadorRepositorio.jogadores.isEmpty()) {
            System.out.println(("Erro: "));
        } else {
            jogadorRepositorio.jogadores.remove(id);
            System.out.println("\nRemovido com sucesso!");
        }
    }

    public void listaJogador(){
        
    }

    public void alterarJogador(){
        
    }
}
