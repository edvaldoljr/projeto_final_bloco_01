package model;

public abstract class Viagens {
    private String destinoPais;
    private long numeroPacote;
    private String data;
    private String hora;

    public Viagens(String destinoPais, long numeroPacote, String data, String hora) {
        this.destinoPais = destinoPais;
        this.numeroPacote = numeroPacote;
        this.data = data;
        this.hora = hora;
    }

    public Viagens() {
    }

    public String getDestinoPais() {
        return destinoPais;
    }

    public void setDestinoPais(String destinoPais) {
        this.destinoPais = destinoPais;
    }

    public long getNumeroPacote() {
        return numeroPacote;
    }

    public void setNumeroPacote(long numeroPacote) {
        this.numeroPacote = numeroPacote;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public String getHora() {
        return hora;
    }

    public void setHora(String hora) {
        this.hora = hora;
    }

    public abstract void visualizarViagem();
}
