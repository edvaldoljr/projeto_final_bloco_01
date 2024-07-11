package controller;

import model.ViagensInternacional;
import model.ViagensNacional;
import repository.ViagensRepository;

import java.nio.channels.ScatteringByteChannel;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class ViagensController implements ViagensRepository {

    //Declarando listas para armazenar as reservas
    private List<ViagensNacional> reservasNacionais;
    private List<ViagensInternacional> reservasInternacionais;

    public ViagensController() {
        this.reservasNacionais = new ArrayList<>();
        this.reservasInternacionais = new ArrayList<>();
    }

    @Override
    public void agendarViagemNacional(String nomeComprador, String destinoPais, long numeroPacote, String data, String hora, String estado) {
        try {
            // Cria uma nova reserva nacional com os parâmetros fornecidos
            ViagensNacional reserva = new ViagensNacional(nomeComprador, destinoPais, numeroPacote, data, hora, estado);
            reservasNacionais.add(reserva);
            System.out.println("Viagem Nacional agendada com sucesso!");
        } catch (Exception e) {
            // Captura qualquer exceção que ocorra e exibe uma mensagem de erro
            System.out.println("Erro ao agendar viagem nacional: " + e.getMessage());
        }
    }

    @Override
    public void agendarViagemInternacional(String nomeComprador, String destinoPais, long numeroPacote, String data, String hora, String estado) {
        try{
            // Cria uma nova reserva nacional com os parâmetros fornecidos
            ViagensInternacional reserva = new ViagensInternacional(nomeComprador, destinoPais, numeroPacote, data, hora, estado);
            reservasInternacionais.add(reserva);
            System.out.println("Viagem Nacional agendada com sucesso!");
        } catch (Exception e) {
            // Captura qualquer exceção que ocorra e exibe uma mensagem de erro
            System.out.println("Erro ao agendar viagem nacional: " + e.getMessage());
        }
    }

    @Override
    public void listarReservasNacionais() {
        try {
            reservasNacionais.stream().forEach(ViagensNacional::visualizarViagem);
        }catch (Exception e) {
            System.out.println("Erro ao listar reservas nacionais: " + e.getMessage());
        }
    }

    @Override
    public void listarReservasInternacionais() {
        try {
            reservasInternacionais.stream().forEach(ViagensInternacional::visualizarViagem);
        } catch (Exception e) {
            System.out.println("Erro ao listar reservas internacionais: " + e.getMessage());
        }
    }

    @Override
    public void CancelarReservaNacional(long numeroPacote) {
        try {
            // Usa stream() e filter() para encontrar a reserva nacional com o número do pacote fornecido
            Optional<ViagensNacional> reservaOpt = reservasNacionais.stream()
                    .filter(reserva -> reserva.getNumeroPacote() == numeroPacote)
                    .findFirst();  // Retorna o primeiro elemento que corresponde ao filtro

            // Verifica se a reserva foi encontrada
            if (reservaOpt.isPresent()) {
                reservasNacionais.remove(reservaOpt.get());  // Remove a reserva encontrada da lista
                System.out.println("Reserva Nacional cancelada com sucesso!");
            } else {
                System.out.println("Reserva Nacional não encontrada.");
            }
        } catch (Exception e) {
            System.out.println("Erro ao cancelar reserva nacional: " + e.getMessage());
        }
    }

    @Override
    public void CancelarReservaInternacional(long numeroPacote) {
        try {
            // Usa stream() e filter() para encontrar a reserva internacional com o número do pacote fornecido
            Optional<ViagensInternacional> reservaOpt = reservasInternacionais.stream()
                    .filter(reserva -> reserva.getNumeroPacote() == numeroPacote)
                    .findFirst();  // Retorna o primeiro elemento que corresponde ao filtro

            // Verifica se a reserva foi encontrada
            if (reservaOpt.isPresent()) {
                reservasInternacionais.remove(reservaOpt.get());  // Remove a reserva encontrada da lista
                System.out.println("Reserva Internacional cancelada com sucesso!");
            } else {
                System.out.println("Reserva Internacional não encontrada.");
            }
        } catch (Exception e) {
            System.out.println("Erro ao cancelar reserva internacional: " + e.getMessage());
        }
    }
}
