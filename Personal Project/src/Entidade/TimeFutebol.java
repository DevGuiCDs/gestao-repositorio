package Entidade;
import java.util.List;

public class TimeFutebol extends Time {
    private String treinador;

    public TimeFutebol(String nome, List<Jogador> jogadores, String treinador) {
        super(nome, jogadores);
        this.treinador = treinador;
    }

    public String getTreinador() {
        return treinador;
    }

    public void setTreinador(String treinador) {
        this.treinador = treinador;
    }

    @Override
    public void exibirDetalhes() {
        System.out.println("Time de Futebol: " + getNome());
        System.out.println("Treinador: " + treinador);
        System.out.println("Jogadores: ");
        for (Jogador jogador : getJogadores()) {
            System.out.println("- " + jogador.getNome());
        }
    }
}
