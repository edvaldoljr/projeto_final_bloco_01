import controller.ViagensController;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Menu {
    public static void exibirMenu() {
        System.out.println("+=========================== Menu ===========================+");
        System.out.println("+ 1. Agendar Viagem Nacional                                +");
        System.out.println("+ 2. Agendar Viagem Internacional                           +");
        System.out.println("+ 3. Lista de Reservas de Viagem Nacional                   +");
        System.out.println("+ 4. Lista de Reservas de Viagem Internacional              +");
        System.out.println("+ 5. Cancelar Reserva de Viagem Nacional                    +");
        System.out.println("+ 6. Cancelar Reserva de Viagem Internacional               +");
        System.out.println("+ 7. Sair                                                   +");
        System.out.println("+===========================================================+");
        System.out.print("Escolha uma opção: ");

    }

    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);

        String nomeComprador, destinoPais, data,  hora,  estado;
        long numeroPacote = 0;

        // Cria uma instância da classe ViagensController
        ViagensController controller = new ViagensController();

        // Cria e agenda 10 viagens nacionais
        controller.agendarViagemNacional("João da Silva", "Brasil", 1001, "20/06/2024", "14:00", "São Paulo");
        controller.agendarViagemNacional("Maria Oliveira", "Brasil", 1002, "21/06/2024", "15:00", "Rio de Janeiro");
        controller.agendarViagemNacional("Carlos Souza", "Brasil", 1003, "22/06/2024", "16:00", "Belo Horizonte");
        controller.agendarViagemNacional("Ana Lima", "Brasil", 1004, "23/06/2024", "17:00", "Curitiba");
        controller.agendarViagemNacional("Paulo Silva", "Brasil", 1005, "24/06/2024", "18:00", "Porto Alegre");
        controller.agendarViagemNacional("Fernanda Costa", "Brasil", 1006, "25/06/2024", "19:00", "Salvador");
        controller.agendarViagemNacional("Bruno Santos", "Brasil", 1007, "26/06/2024", "20:00", "Fortaleza");
        controller.agendarViagemNacional("Juliana Almeida", "Brasil", 1008, "27/06/2024", "21:00", "Recife");
        controller.agendarViagemNacional("Rodrigo Pinto", "Brasil", 1009, "28/06/2024", "22:00", "Florianópolis");
        controller.agendarViagemNacional("Mariana Rocha", "Brasil", 1010, "29/06/2024", "23:00", "Manaus");

        // Cria e agenda 10 viagens internacionais
        controller.agendarViagemInternacional("Lucas Martins", "Estados Unidos", 2001, "30/06/2024", "08:00", "Nova York");
        controller.agendarViagemInternacional("Laura Ferreira", "Canadá", 2002, "01/07/2024", "09:00", "Toronto");
        controller.agendarViagemInternacional("Pedro Mendes", "França", 2003, "02/07/2024", "10:00", "Paris");
        controller.agendarViagemInternacional("Isabela Santos", "Alemanha", 2004, "03/07/2024", "11:00", "Berlim");
        controller.agendarViagemInternacional("Thiago Almeida", "Japão", 2005, "04/07/2024", "12:00", "Tóquio");
        controller.agendarViagemInternacional("Amanda Carvalho", "Austrália", 2006, "05/07/2024", "13:00", "Sydney");
        controller.agendarViagemInternacional("Gustavo Lima", "Reino Unido", 2007, "06/07/2024", "14:00", "Londres");
        controller.agendarViagemInternacional("Patrícia Fonseca", "Itália", 2008, "07/07/2024", "15:00", "Roma");
        controller.agendarViagemInternacional("Renato Vieira", "Espanha", 2009, "08/07/2024", "16:00", "Madrid");
        controller.agendarViagemInternacional("Camila Dias", "Portugal", 2010, "09/07/2024", "17:00", "Lisboa");
        int opcao;

        while (true) {
            exibirMenu();
            try {
                opcao = leia.nextInt();
            } catch (InputMismatchException e) {
                System.out.println("\nDigite valores inteiros! ");
                leia.nextLine();
                opcao = 0;
            }

            if (opcao == 7) {
                System.out.println("Saindo do sistema. Até mais!");
                leia.close();
                System.exit(0);
            }

            switch (opcao) {
                case 1:
                    System.out.println("Digite o nome: ");
                    nomeComprador = leia.next();
                    System.out.println("Digite o Pais");
                    destinoPais = leia.next();
                    System.out.println("Digite a data no formato: [dia/mes/ano]");
                    data = leia.next();
                    System.out.println("Digite a hora da viagem no formato: [hr:min]");
                    hora = leia.next();
                    System.out.println("Digite o Estado da viagem");
                    estado = leia.next();
                    numeroPacote = numeroPacote +1;
                    controller.agendarViagemNacional(nomeComprador,destinoPais,numeroPacote,data,hora,estado);
                    System.out.println("Viagem Agendada");
                    break;
                case 2:
                    System.out.println("Digite o nome: ");
                    nomeComprador = leia.next();
                    System.out.println("Digite o Pais");
                    destinoPais = leia.next();
                    System.out.println("Digite a data no formato: [dia/mes/ano]");
                    data = leia.next();
                    System.out.println("Digite a hora da viagem no formato: [hr:min]");
                    hora = leia.next();
                    System.out.println("Digite o Estado da viagem");
                    estado = leia.next();
                    numeroPacote = numeroPacote +1;
                    controller.agendarViagemInternacional(nomeComprador,destinoPais,numeroPacote,data,hora,estado);
                    System.out.println("Viagem Agendada");
                    break;
                case 3:
                    System.out.println("Lista de Reservas de Viagem Nacional:");
                    controller.listarReservasNacionais();
                    break;
                case 4:
                    System.out.println("Lista de Reservas de Viagem Internacional:");
                    controller.listarReservasInternacionais();
                    break;
                case 5:
                    controller.CancelarReservaNacional(numeroPacote);
                    break;
                case 6:
                    controller.CancelarReservaInternacional(numeroPacote);
                    break;
                default:
                    System.out.println("Opção Inválida");
            }
        }
    }
}