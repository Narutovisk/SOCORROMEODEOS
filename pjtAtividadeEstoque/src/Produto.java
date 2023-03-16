public class Produto {
    private long codigo;
    private String nome;
    private String descricao;
    private double valorUnit;
    private int quantidadeEstoque;

    public long getCodigo() {
        return codigo;
    }


    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setCodigo(long codigo) {
        this.codigo = codigo;
    }


    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public double getValorUnit() {
        return valorUnit;
    }

    public void setValorUnit(double valorUnit) {
        this.valorUnit = valorUnit;
    }

    public int getQuantidadeEstoque() {
        return quantidadeEstoque;
    }

    public void setQuantidadeEstoque(int quantidadeEstoque) {
        this.quantidadeEstoque = quantidadeEstoque;
    }

    public void imprimir(){
        System.out.println("codigo = " + codigo);
        System.out.println("nome = " + nome);
        System.out.println("descricao  = " + descricao);
        System.out.println("valor unitario = " + valorUnit);
        System.out.println("quantidade em estoque = " + quantidadeEstoque);
    }
    public void darEntrada(int quantidade){
        quantidadeEstoque += quantidade;
    }

    public boolean darSaida(int quantidade){
        if(quantidade<=quantidadeEstoque){
            quantidadeEstoque -= quantidade;
            return true;
        }
        return false;
    }
    public void producao(double desconto){
        if(desconto < 0){
            throw new IllegalArgumentException(
                    "Aumento não pode ser negativo"
            );
        }
        valorUnit -= desconto;
    }

}
