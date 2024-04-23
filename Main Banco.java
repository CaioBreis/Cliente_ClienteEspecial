package teste;

import enti.ClienteComum;
import enti.Cliente_Especial;

import java.util.Scanner;

public class Banco {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        ClienteComum clientes[] = new ClienteComum[3];
        clientes[0] = new ClienteComum("Asdrubal", 123, 200);
        clientes[1] = new Cliente_Especial("Mariana", 456, 3000, 100);
        clientes[2] = new ClienteComum("Juan", 789, 500);

        System.out.println("-----------------------------");
        for (ClienteComum cliente : clientes) {
            System.out.println(cliente);
            System.out.println(" ");
        }

        System.out.println("-------------------------");
        for (ClienteComum cliente : clientes) {
            cliente.nalteraSaldo(900);
        }

        for (ClienteComum cliente : clientes) {
            System.out.println(cliente);
            System.out.println(" ");
        }
    }
}
