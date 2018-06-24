package pl.wpe.swaggerApiTestServer;

import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.junit4.SpringRunner;
import pl.wpe.swaggerApiTestServer.model.PozycjaSlownikaA;
import pl.wpe.swaggerApiTestServer.model.SlownikARepository;
import pl.wpe.swaggerApiTestServer.model.SlownikAService;

import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;
import static org.mockito.Mockito.when;

@RunWith(SpringRunner.class)
//@SpringBootTest
public class SlownikAServiceTest {

    @InjectMocks
    SlownikAService sas;
    @MockBean
    SlownikARepository sa;

    @Before
    public void init() {
        sas.setSlownikArepository(sa);
        when(sa.getAll()).thenReturn(Arrays.asList(
                new PozycjaSlownikaA(1, "A", "pozA"),
                new PozycjaSlownikaA(2, "B", "pozB"),
                new PozycjaSlownikaA(3, "C", "pozC")
        ));
//        when(sa.getPozycjaByNazwa("A")).thenReturn(sa.getPozycjaByNazwa("A"));
    }

    @Test
    public void getAll() {
        List<PozycjaSlownikaA> lista = sas.getAll();
        assertNotNull(lista);
        assertEquals(3, lista.size());
    }

    @Test
    public void getPozycjaByNazwa_test1() {
        PozycjaSlownikaA lista = sas.getPozycjaByNazwa("A");
        assertNotNull(lista);
        assertEquals("A", lista.getNazwa());
    }
    @Test
    public void getPozycjaByNazwa_test2() {
        PozycjaSlownikaA lista = sas.getPozycjaByNazwa("D");
        assertNull("W slowniku nie ma pozycji D",lista);
    }
}
