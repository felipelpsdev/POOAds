package livraria.cn;

public class Autor {
    private String nomeAutor;
    private String emailAutor;
    private String cpfAutor;


    public String getNomeAutor() {
        return this.nomeAutor;
    }
    public void setNomeAutor(String nomeAutor) {
        this.nomeAutor = nomeAutor;
    }

    public String getEmailAutor() {
        return this.emailAutor;
    }
    public void setEmailAutor(String emailAutor) {
        this.emailAutor = emailAutor;

    }

    public String getCpfAutor() {
        return this.cpfAutor;
    }
    public void setCpfAutor(String cpfAutor) {
        this.cpfAutor = cpfAutor;
    }

    public void mostrarDetalhes(){
        System.out.println("Autor: " + nomeAutor);
        System.out.println("Email: " + emailAutor);
        System.out.println("CPF AUTOR: " + cpfAutor);
        System.out.println("==========================");
    }
}
