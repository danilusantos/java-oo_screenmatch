package br.com.alura.screenmatch.modelos;

public class Filme
{
    private String nome;
    private int anoDeLancamento;
    private int duracaoEmMinutos;
    private boolean incluidoNoPlano;
    private int totalDeAvaliacoes;
    private double somaDasAvaliacoes;

    public int getTotalDeAvaliacoes()
    {
        return totalDeAvaliacoes;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setAnoDeLancamento(int anoDeLancamento) {
        this.anoDeLancamento = anoDeLancamento;
    }

    public void setDuracaoEmMinutos(int duracaoEmMinutos) {
        this.duracaoEmMinutos = duracaoEmMinutos;
    }

    public void setIncluidoNoPlano(boolean incluidoNoPlano) {
        this.incluidoNoPlano = incluidoNoPlano;
    }

    public int getAnoDeLancamento() {
        return anoDeLancamento;
    }

    public int getDuracaoEmMinutos() {
        return duracaoEmMinutos;
    }

    public boolean isIncluidoNoPlano() {
        return incluidoNoPlano;
    }

    public void exibeFichaTecnica ()
    {
        System.out.println("br.com.alura.screenmatch.modelos.Filme: " + nome);
        System.out.println("Ano de lançamento: " + anoDeLancamento);
    }

    public void avalia (double nota)
    {
        somaDasAvaliacoes += nota;
        totalDeAvaliacoes++;
    }

    public double pegaMediaDasAvaliacoes ()
    {
        return somaDasAvaliacoes / totalDeAvaliacoes;
    }
}
