public class armazem extends usuario {
    // atributos adicionais
    private int quantSal;
    private int quantArroz;
    private int quantFeijao;
    private int quantMacarrao;
    private int quantFarinha;
    private int quantCafe;
    private int quantOleo;
    private int quantAcucar;
    private int quantBiscoito;
    private int quantDinheiro;
    
    // getters e setters adicionais
    public int getQuantSal() {
        return quantSal;
    }
    
    public void setQuantSal(int quantSal) {
        this.quantSal = quantSal;
    }
    
    public int getQuantArroz() {
        return quantArroz;
    }
    
    public void setQuantArroz(int quantArroz) {
        this.quantArroz = quantArroz;
    }
    
    public int getQuantFeijao() {
        return quantFeijao;
    }
    
    public void setQuantFeijao(int quantFeijao) {
        this.quantFeijao = quantFeijao;
    }
    
    public int getQuantMacarrao() {
        return quantMacarrao;
    }
    
    public void setQuantMacarrao(int quantMacarrao) {
        this.quantMacarrao = quantMacarrao;
    }
    
    public int getQuantFarinha() {
        return quantFarinha;
    }
    
    public void setQuantFarinha(int quantFarinha) {
        this.quantFarinha = quantFarinha;
    }
    
    public int getQuantCafe() {
        return quantCafe;
    }
    
    public void setQuantCafe(int quantCafe) {
        this.quantCafe = quantCafe;
    }
    
    public int getQuantOleo() {
        return quantOleo;
    }
    
    public void setQuantOleo(int quantOleo) {
        this.quantOleo = quantOleo;
    }
    
    public int getQuantAcucar() {
        return quantAcucar;
    }
    
    public void setQuantAcucar(int quantAcucar) {
        this.quantAcucar = quantAcucar;
    }
    
    public int getQuantBiscoito() {
        return quantBiscoito;
    }
    
    public void setQuantBiscoito(int quantBiscoito) {
        this.quantBiscoito = quantBiscoito;
    }
    
    public int getQuantDinheiro() {
        return quantDinheiro;
    }
    
    public void setQuantDinheiro(int quantDinheiro) {
        this.quantDinheiro = quantDinheiro;
    }
    
    // métodos específicos
    public void formarCesta() {
        // implementação do método formarCesta
        // forma uma cesta básica com os itens disponíveis no armazém
    }
    
    public void aumentarQuanto(int quant) {
        // implementação do método aumentarQuanto
        // aumenta a quantidade de um item no armazém em uma certa quantidade
    }
    
    public void diminuirQuanto(int quant) {
        // implementação do método diminuirQuanto
        // diminui a quantidade de um item no armazém em uma certa quantidade
    }
    
    public int calcularQuantCesta() {
    int totalItens = (quantSal + quantArroz + quantFeijao + quantMacarrao + quantFarinha + quantCafe + quantOleo +  quantAcucar + quantBiscoito);
    return totalItens;
    // implementação do método calcularQuantCesta
    // calcula a quantidade total de itens que podem ser incluídos em uma cesta básica, com base nas quantidades disponíveis de cada item no armazém
    }
}