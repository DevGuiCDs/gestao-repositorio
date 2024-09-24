package Entidade;
public class Partida {
    private Time timeCasa;
    private Time timeVisitante;
    private int pontuacaoCasa;
    private int pontuacaoVisitante;

    // Construtor, getters e setters
    public Partida(Time timeCasa, Time timeVisitante, int pontuacaoCasa, int pontuacaoVisitante) {
        this.timeCasa = timeCasa;
        this.timeVisitante = timeVisitante;
        this.pontuacaoCasa = pontuacaoCasa;
        this.pontuacaoVisitante = pontuacaoVisitante;
    }

    public Time getTimeCasa() {
        return timeCasa;
    }

    public void setTimeCasa(Time timeCasa) {
        this.timeCasa = timeCasa;
    }

    public Time getTimeVisitante() {
        return timeVisitante;
    }

    public void setTimeVisitante(Time timeVisitante) {
        this.timeVisitante = timeVisitante;
    }

    public int getPontuacaoCasa() {
        return pontuacaoCasa;
    }

    public void setPontuacaoCasa(int pontuacaoCasa) {
        this.pontuacaoCasa = pontuacaoCasa;
    }

    public int getPontuacaoVisitante() {
        return pontuacaoVisitante;
    }

    public void setPontuacaoVisitante(int pontuacaoVisitante) {
        this.pontuacaoVisitante = pontuacaoVisitante;
    }
}
