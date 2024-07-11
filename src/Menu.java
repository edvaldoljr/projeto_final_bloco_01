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
                    System.out.println("Agendar Viagem Nacional:");
                    break;
                case 2:
                    System.out.println("Agendar Viagem Internacional:");
                    break;
                case 3:
                    System.out.println("Lista de Reservas de Viagem Nacional:");
                    break;
                case 4:
                    System.out.println("Lista de Reservas de Viagem Internacional:");
                    break;
                case 5:
                    System.out.println("Cancelar Reserva de Viagem Nacional:");
                    break;
                case 6:
                    System.out.println("Cancelar Reserva de Viagem Internacional:");
                    break;
                default:
                    System.out.println("Opção Inválida");
            }
        }
    }
}