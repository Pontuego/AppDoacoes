package br.com.doacoes.app;

public class doador extends usuario {
    // atributos adicionais
    private boolean tipoDoador;
    private int cpfCnpj;
    
    // getters e setters adicionais
    public boolean isTipoDoador() {
        return tipoDoador;
    }
    
    public void setTipoDoador(boolean tipoDoador) {
        this.tipoDoador = tipoDoador;
    }
    
    public int getCpfCnpj() {
        return cpfCnpj;
    }
    
    public void setCpfCnpj(int cpfCnpj) {
        this.cpfCnpj = cpfCnpj;
    }
    
    // método específico
    public void fazDoacao() {
        // implementação do método fazDoacao
        // registra uma doação feita pelo doador
    }
}
