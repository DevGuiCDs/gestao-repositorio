package Entidade;
import java.util.List;

public abstract class Time {
    private String nome;
    private List<Jogador> jogadores;

    // Construtor, getters e setters
    public Time(String nome, List<Jogador> jogadores) {
        this.nome = nome;
        this.jogadores = jogadores;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public List<Jogador> getJogadores() {
        return jogadores;
    }

    public void setJogadores(List<Jogador> jogadores) {
        this.jogadores = jogadores;
    }

    // Método abstrato para ser implementado pelas subclasses
    public abstract void exibirDetalhes();
}
