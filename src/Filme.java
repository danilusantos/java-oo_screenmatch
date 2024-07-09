public class Filme
{
    String nome;
    int anoDeLancamento;
    int totalDeAvaliacoes;
    int duracaoEmMinutos;
    boolean incluidoNoPlano;
    double somaDasAvaliacoes;

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
