import java.time.LocalDate;
import java.time.LocalDateTime;

public class GerenciarControlePonto {
    public static void main(String[] args) throws InterruptedException {


        Gerente funcio1 = new Gerente(1, "Joao", "jaozinho@pvp.com", "CPF", "Joaobonitao", "senhainvalida");
        Secretaria funcio2 = new Secretaria(2, "Eric", "erique@doceu.com", "RG/CPF", "3865-7070", "1234-4321" );
        Operador funcio3 = new Operador(3,"Naruto","naruto@uzumaki.com","RG",25.0);

        RegistroPonto rp1 = new RegistroPonto();
        RegistroPonto rp2 = new RegistroPonto();
        RegistroPonto rp3 = new RegistroPonto();


        rp1.setFunc(funcio1);
        rp1.setDataRegistro(LocalDate.now());
        rp1.setHoraEntrada(LocalDateTime.now());

        rp2.setFunc(funcio2);
        rp2.setDataRegistro(LocalDate.now());
        rp2.setHoraEntrada(LocalDateTime.now());

        rp3.setFunc(funcio3);
        rp3.setDataRegistro(LocalDate.now());
        rp3.setHoraEntrada(LocalDateTime.now());


        rp1.apresentarRegistroPonto();
        rp3.apresentarRegistroPonto();
        rp2.apresentarRegistroPonto();
        Thread.sleep(10000);
        rp1.setHoraSaida(LocalDateTime.now());
        Thread.sleep(10000);
        rp2.setHoraSaida(LocalDateTime.now());
        Thread.sleep(10000);
        rp3.setHoraSaida(LocalDateTime.now());

        rp1.apresentarRegistroPonto();
        rp3.apresentarRegistroPonto();
        rp2.apresentarRegistroPonto();



    }

}