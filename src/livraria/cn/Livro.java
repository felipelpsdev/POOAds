package livraria.cn;

public class Livro {
    private String nome;
    private String descricao;
    private Double preco;
    private String isbn;
    private boolean disponibilidade;
    private Autor autor;

    public String getNome(){
        return this.nome;
    }

    public void setNome(String nome){
        this.nome = nome;
    }

    public String getDescricao() {
        return this.descricao;
    }
    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
    public Double getPreco() {
        return this.preco;
    }
    public void setPreco(Double preco) {
        this.preco = preco;
    }
    public String getIsbn() {
        return this.isbn;
    }
    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }
    public boolean isDisponibilidade() {
        return this.disponibilidade;
    }
    public void setDisponibilidade(boolean disponibilidade) {
        this.disponibilidade = disponibilidade;
    }

    public Autor getAutor() {
        return this.autor;
    }
    public void setAutor(Autor autor) {
        this.autor = autor;
    }

    public void mostrarDetalhes(){
        System.out.println("Nome: " + nome);
        System.out.println("Descricao: " + descricao);
        System.out.println("Preco: " + preco);
        System.out.println("ISBN: " + isbn);
        System.out.println("Disponibilidade: " + disponibilidade);
        System.out.println("======================================");

    }
}
