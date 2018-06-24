package pl.wpe.swaggerApiTestServer.model;

import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class SlownikARepository {
    List<PozycjaSlownikaA> slownik;

    public SlownikARepository() {
        slownik =new ArrayList<>();

        PozycjaSlownikaA s1=new PozycjaSlownikaA();
        s1.setId(1);
        s1.setNazwa("A1");
        s1.setOpis("Pozycja A1");
        slownik.add(s1);

        PozycjaSlownikaA s2=new PozycjaSlownikaA();
        s2.setId(2);
        s2.setNazwa("A2");
        s2.setOpis("Pozycja A2");
        slownik.add(s2);
    }

    public List<PozycjaSlownikaA> getAll(){
        return slownik;
    }

    public PozycjaSlownikaA getPozycjaByNazwa(String nazwa){
        return getAll().stream().filter(s->s.getNazwa().equals(nazwa)).findFirst().get();
    }
}
