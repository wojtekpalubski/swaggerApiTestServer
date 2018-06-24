package pl.wpe.swaggerApiTestServer.model;

public class PozycjaSlownikaA {
    private Integer id;
    private String nazwa;
    private String opis;

    public PozycjaSlownikaA() {
    }

    public PozycjaSlownikaA(Integer id, String nazwa, String opis) {
        this.id = id;
        this.nazwa = nazwa;
        this.opis = opis;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNazwa() {
        return nazwa;
    }

    public void setNazwa(String nazwa) {
        this.nazwa = nazwa;
    }

    public String getOpis() {
        return opis;
    }

    public void setOpis(String opis) {
        this.opis = opis;
    }
}
