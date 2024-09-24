package Entidade;
import java.util.List;

public class TimeBasquete extends Time {
    private String tecnico;

    public TimeBasquete(String nome, List<Jogador> jogadores, String tecnico) {
        super(nome, jogadores);
        this.tecnico = tecnico;
    }

    public String getTecnico() {
        return tecnico;
    }

    public void setTecnico(String tecnico) {
        this.tecnico = tecnico;
    }

    @Override
    public void exibirDetalhes() {
        System.out.println("Time de Basquete: " + getNome());
        System.out.println("Técnico: " + tecnico);
        System.out.println("Jogadores: ");
        for (Jogador jogador : getJogadores()) {
            System.out.println("- " + jogador.getNome());
        }
    }
}
