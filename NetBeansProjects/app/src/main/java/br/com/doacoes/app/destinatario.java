package br.com.doacoes.app;

public class destinatario extends usuario {
     // Declaração dos atributos adicionais da classe
    private int quantPessoas;
    private int cnpj;

    // Construtor da classe
    public destinatario(char nome, int telefone, char senha, char email, char cep, char rua, char numero, char complemento, int quantPessoas, int cnpj) {
        // Inicialização dos atributos adicionais
        this.quantPessoas = quantPessoas;
        this.cnpj = cnpj;
    }

    public void recebe() {
        // implementação do método para receber a doação
    }

    // getters e setters
    public int getQuantPessoas() {
        return quantPessoas;
    }

    public void setQuantPessoas(int quantPessoas) {
        this.quantPessoas = quantPessoas;
    }

    public int getCnpj() {
        return cnpj;
    }

    public void setCnpj(int cnpj) {
        this.cnpj = cnpj;
    }
}