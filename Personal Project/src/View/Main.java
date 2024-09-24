package View;

import java.util.ArrayList;
import java.util.List;

import Entidade.Jogador;
import Entidade.Partida;
import Entidade.TimeBasquete;
import Entidade.TimeFutebol;

// Classe principal
public class Main {
    public static void main(String[] args) {
        // Criando jogadores de futebol
        Jogador jogador1 = new Jogador("João", 25, "Atacante");
        Jogador jogador2 = new Jogador("Carlos", 28, "Defensor");

        // Criando lista de jogadores de futebol
        List<Jogador> jogadoresFutebol = new ArrayList<>();
        jogadoresFutebol.add(jogador1);
        jogadoresFutebol.add(jogador2);

        // Criando time de futebol
        TimeFutebol timeFutebol = new TimeFutebol("Tigres FC", jogadoresFutebol, "Mário");

        // Criando jogadores de basquete
        Jogador jogador3 = new Jogador("Pedro", 22, "Ala");
        Jogador jogador4 = new Jogador("Lucas", 30, "Pivô");

        // Criando lista de jogadores de basquete
        List<Jogador> jogadoresBasquete = new ArrayList<>();
        jogadoresBasquete.add(jogador3);
        jogadoresBasquete.add(jogador4);

        // Criando time de basquete
        TimeBasquete timeBasquete = new TimeBasquete("Águias BC", jogadoresBasquete, "José");

        // Exibindo detalhes dos times
        timeFutebol.exibirDetalhes();
        System.out.println();
        timeBasquete.exibirDetalhes();

        // Criando uma partida
        Partida partida = new Partida(timeFutebol, timeBasquete, 3, 2);

        // Exibindo detalhes da partida
        System.out.println("\nPartida:");
        System.out.println("Time da Casa: " + partida.getTimeCasa().getNome());
        System.out.println("Time Visitante: " + partida.getTimeVisitante().getNome());
        System.out.println("Pontuação da Casa: " + partida.getPontuacaoCasa());
        System.out.println("Pontuação Visitante: " + partida.getPontuacaoVisitante());
    }
}