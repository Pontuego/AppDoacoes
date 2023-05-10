import java.util.Date;

public class recebimento extends usuario {
    private int quantCestas;
    private Date dataEntrega;

    // Construtor da classe Recebimento
    public recebimento(char nome, int telefone, char senha, char email, char cep, char rua,
            char numero, char complemento, int quantCestas, Date dataEntrega) {
        // Inicialização dos atributos adicionais
        this.quantCestas = quantCestas;
        this.dataEntrega = dataEntrega;
    }

    // Método para obter o CNPJ do destinatário
    public void getCNPJ() {
        System.out.println("CNPJ do destinatário: " + this.getCnpj());
    }

    private String getCnpj() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}