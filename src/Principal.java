public class Principal
{
    public static void main(String[] args)
    {
        Filme filme = new Filme();
        filme.nome = "Top Gun: Maverick";
        filme.anoDeLancamento = 2022;
        filme.duracaoEmMinutos = 189;

        filme.exibeFichaTecnica();
        filme.avalia(8);
        filme.avalia(5);
        filme.avalia(10);
        System.out.println(filme.somaDasAvaliacoes);
        System.out.println(filme.totalDeAvaliacoes);
        System.out.printf("%.2f", filme.pegaMediaDasAvaliacoes());
    }
}
