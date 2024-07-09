public class Principal {
    public static void main(String[] args) {
        Filme filme = new Filme();
        filme.nome = "Top Gun: Maverick";
        filme.anoDeLancamento = 2022;
        filme.avaliacao = 8.6;
        filme.incluidoNoPlano = true;
        filme.totalDeAvaliacoes = 30;
        filme.duracaoEmMinutos = 189;

        System.out.println(filme.nome);
        System.out.printf("%s minutos.", filme.duracaoEmMinutos);
    }
}
