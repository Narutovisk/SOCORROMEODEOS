class Carta {
    private final Naipe naipe;
    private final Valor valor;

    public Carta(Naipe naipe, Valor valor) {
        this.naipe = naipe;
        this.valor = valor;
    }

    public Naipe getNaipe() {
        return this.naipe;
    }

    public Valor getValor() {
        return this.valor;
    }

    @Override
    public String toString() {
        return this.valor + " de " + this.naipe;
    }
}