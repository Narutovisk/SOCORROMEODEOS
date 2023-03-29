import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class Baralho {
    private final List<Carta> cartas;

    public Baralho() {
        this.cartas = new ArrayList<>();
        for (Naipe naipe : Naipe.values()) {
            for (Valor valor : Valor.values()) {
                this.cartas.add(new Carta(naipe, valor));
            }
        }
    }

    public void embaralhar() {
        Collections.shuffle(this.cartas);
    }

    public void mostrarCartas() {
        for (Carta carta : this.cartas) {
            System.out.println(carta);
        }
    }
}

enum Valor {
    AS, DOIS, TRES, QUATRO, CINCO, SEIS, SETE, OITO, NOVE, DEZ, VALETE, DAMA, REI
}

enum Naipe {
    ESPADAS, COPAS, OUROS, PAUS
}
