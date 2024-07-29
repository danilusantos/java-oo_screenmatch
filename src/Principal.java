import br.com.alura.screenmatch.modelos.Filme;

public class Principal
{
    public static void main(String[] args)
    {
        Filme filme = new Filme();
        filme.setNome("Top Gun: Maverick");
        filme.setAnoDeLancamento(2022);
        filme.setDuracaoEmMinutos(189);

        filme.exibeFichaTecnica();
        filme.avalia(8);
        filme.avalia(5);
        filme.avalia(10);
        System.out.println(filme.getTotalDeAvaliacoes());
        System.out.printf("%.2f", filme.pegaMediaDasAvaliacoes());
    }
}
