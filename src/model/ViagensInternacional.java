package model;

public class ViagensInternacional extends Viagens {

    private String Estado;

    public ViagensInternacional(String nomeComprador, String destinoPais, long numeroPacote, String data, String hora, String estado) {
        super(nomeComprador,destinoPais, numeroPacote, data, hora);
        Estado = estado;
    }

    public ViagensInternacional() {
    }

    public String getEstado() {
        return Estado;
    }

    public void setEstado(String estado) {
        Estado = estado;
    }

    @Override
    public void visualizarViagem() {
        System.out.println("Tipo de Viagem: Nacional");
        System.out.println("Nome Viagente: " + getNomeComprador());
        System.out.println("Destino: " + getDestinoPais());
        System.out.println("Estado: " + getEstado());
        System.out.println("Data: " + getData());
        System.out.println("Hora: " + getHora());
    }
}
