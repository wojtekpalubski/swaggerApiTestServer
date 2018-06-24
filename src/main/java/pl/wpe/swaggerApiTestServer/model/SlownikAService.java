package pl.wpe.swaggerApiTestServer.model;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Optional;

@Component
public class SlownikAService {
    @Autowired
    SlownikARepository slownikArepository;

    public void setSlownikArepository(SlownikARepository slownikArepository) {
        this.slownikArepository = slownikArepository;
    }

    public List<PozycjaSlownikaA> getAll() {
        return slownikArepository.getAll();
    }

    public PozycjaSlownikaA getPozycjaByNazwa(String nazwa) {
        Optional<PozycjaSlownikaA> pozycja = slownikArepository.getAll().stream().filter(s -> s.getNazwa().equals(nazwa)).findFirst();
        return pozycja.orElse(null);
    }
}
