package teste;



import enti.Cliente;
import enti.Cliente_Especial;

import java.util.Scanner;


public class Banco {
    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);

        String nome;
        int id;
        double saldo;
        int cont;


        Cliente d[] = new Cliente[3];
        d[0]=new Cliente("Asdrubal",123, 200);
        System.out.println(" ");
        d[1]=new Cliente_Especial("Mariana",456, 3000,100);
        System.out.println(" ");
        d[2]=new Cliente("Juan",789, 500);
        System.out.println("-----------------------------");


        for(int i=0; i<d.length; i++) {
            System.out.println(d[i]);
            System.out.println(" ");
        }

        System.out.println("-------------------------");

        for(int i=0; i<d.length; i++) {
            d[i].nalteraSalario(900);

        }

        for(int i=0; i<d.length; i++) {
            System.out.println(d[i]);
            System.out.println(" ");
        }

    }


}
