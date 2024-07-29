public class Filme
{
    String nome;
    int anoDeLancamento;
    int duracaoEmMinutos;
    boolean incluidoNoPlano;
    private int totalDeAvaliacoes;
    private double somaDasAvaliacoes;

    int getTotalDeAvaliacoes()
    {
        return totalDeAvaliacoes;
    }

    void exibeFichaTecnica ()
    {
        System.out.println("Filme: " + nome);
        System.out.println("Ano de lançamento: " + anoDeLancamento);
    }

    void avalia (double nota)
    {
        somaDasAvaliacoes += nota;
        totalDeAvaliacoes++;
    }

    double pegaMediaDasAvaliacoes ()
    {
        return somaDasAvaliacoes / totalDeAvaliacoes;
    }
}
