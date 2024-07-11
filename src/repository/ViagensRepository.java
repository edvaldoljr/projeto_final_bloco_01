package repository;

public interface ViagensRepository {

    public void agendarViagemNacional(String nomeComprador, String destinoPais, long numeroPacote, String data, String hora, String estado);
    public void agendarViagemInternacional(String nomeComprador, String destinoPais, long numeroPacote, String data, String hora, String estado);
    public void listarReservasNacionais();
    public void listarReservasInternacionais();
    public void CancelarReservaNacional(long numeroPacote);
    public void CancelarReservaInternacional(long numeroPacote);
}
