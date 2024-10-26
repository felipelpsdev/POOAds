package livraria.cn;

public class CadastroLivro {
    public static void main(String[] args) {
        Livro livro = new Livro();
        Autor autor = new Autor();

        //livro.nome = "Java como programar";// erro


        livro.setNome("Java como programar");
        livro.setDescricao("ultimo livro");
        livro.setPreco(10.80);
        livro.setDisponibilidade(true);
        livro.setIsbn("F34BOD");
        livro.mostrarDetalhes();

        autor.setNomeAutor("José Francisco Oliveira");
        autor.setEmailAutor("jose@gmail.com");
        autor.setCpfAutor("123.456.789-99");
        autor.mostrarDetalhes();

        Livro livro2 = new Livro();
        Autor autor2 = new Autor();

        livro2.setNome("Scott pilgrman contra o mundo");
        livro2.setDescricao("história em quadrinhos");
        livro.setPreco(15.99);
        livro2.setDisponibilidade(false);
        livro2.setIsbn("GHJ892M");
        livro2.mostrarDetalhes();

        autor2.setNomeAutor("Felipe");
        autor2.setEmailAutor("felipe@gmail.com");
        autor2.setCpfAutor("123.456.789-99");
        autor2.mostrarDetalhes();
    }
}
