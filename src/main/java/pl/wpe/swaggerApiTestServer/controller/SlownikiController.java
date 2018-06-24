package pl.wpe.swaggerApiTestServer.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import pl.wpe.swaggerApiTestServer.model.PozycjaSlownikaA;
import pl.wpe.swaggerApiTestServer.model.SlownikARepository;
import pl.wpe.swaggerApiTestServer.model.SlownikAService;

import java.util.List;

@RestController
@RequestMapping("/api/v1")
public class SlownikiController {

    @Autowired
    SlownikARepository slownikArepository;

    @Autowired
    SlownikAService slownikAService;

    @GetMapping(value = "/slownik/A", produces = "application/json")
    public List<PozycjaSlownikaA> getSlownikA() {
        return slownikAService.getAll();
    }

    @GetMapping(value = "/slownik/A/{nazwa}", produces = "application/json")
    public PozycjaSlownikaA getSlownikA(@PathVariable(value = "nazwa", required = true) String nazwa, @RequestParam(required = false, defaultValue = "asc") String porzadek) {
        System.out.println("-" + nazwa + "-" + porzadek + "-");
        return slownikArepository.getPozycjaByNazwa(nazwa);
    }
}

