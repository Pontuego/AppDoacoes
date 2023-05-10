import java.util.Date;

public class envioCesta extends usuario {
    // Declaração dos atributos adicionais da classe
    private int quantCesta;
    private int cnpjDestinatario;
    private Date dataEnvio;

    // Construtor da classe
    public envioCesta(char nome, int telefone, char senha, char email, char cep, char rua, char numero, char complemento, int quantCesta, int cnpjDestinatario, Date dataEnvio) {
        // Inicialização dos atributos adicionais
        this.quantCesta = quantCesta;
        this.cnpjDestinatario = cnpjDestinatario;
        this.dataEnvio = dataEnvio;
    }

    // Getters e Setters dos atributos adicionais
    public int getQuantCesta() {
        return quantCesta;
    }

    public void setQuantCesta(int quantCesta) {
        this.quantCesta = quantCesta;
    }

    public int getCnpjDestinatario() {
        return cnpjDestinatario;
    }

    public void setCnpjDestinatario(int cnpjDestinatario) {
        this.cnpjDestinatario = cnpjDestinatario;
    }

    public Date getDataEnvio() {
        return dataEnvio;
    }

    public void setDataEnvio(Date dataEnvio) {
        this.dataEnvio = dataEnvio;
    }
}