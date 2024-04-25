package Hanoi;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		Hanoi hanoi = new Hanoi(2);  // Inicializa el juego con 3 discos
        Scanner scanner = new Scanner(System.in);
        boolean juega=true;
        System.out.println("Estado inicial:");
        hanoi.imprime();
        
        while (juega) {
            System.out.print("Ingrese su movimiento (Origen Destino, ej. AB para mover de A a B): ");
            String movimiento = scanner.nextLine().toUpperCase();
            
            if (movimiento.length() != 2) {
                System.out.println("Movimiento inválido, intente de nuevo.");
                continue;
            }

            char origen = movimiento.charAt(0);
            char destino = movimiento.charAt(1);

            if (origen != 'A' && origen != 'B' && origen != 'C' || destino != 'A' && destino != 'B' && destino != 'C') {
                System.out.println("Torres inválidas, intente de nuevo.");
                continue;
            }

            hanoi.mueve(origen, destino);
            hanoi.imprime();
            if (hanoi.fin())
            {
            	System.out.println("Se terminó");
            	juega=false;
            }
        }
    }

}
