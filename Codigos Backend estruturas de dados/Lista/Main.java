package one.digitalinnovation;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        List<Carro> listCarros = new ArrayList<>();

        listCarros.add(new Carro("Ford"));  // Adiciona
        listCarros.add(new Carro("chevrolet"));
        listCarros.add(new Carro("Fiat"));
        listCarros.add(new Carro("Peugeot"));
        System.out.println("-------------------------------------------------------------");
        System.out.println(listCarros);
        System.out.println("-------------------------------------------------------------");
        System.out.println(listCarros.contains(new Carro("Ford")));  // Se contém ou não = F/V
        System.out.println("-------------------------------------------------------------");
        System.out.println(listCarros.get(2)); // Mostra o íntem do índice 2 (Fiat)
        System.out.println("-------------------------------------------------------------");
        System.out.println(listCarros.indexOf(new Carro("Peugeot"))); // Mostra o índice do ítem
        System.out.println("-------------------------------------------------------------");
        System.out.println(listCarros.remove(2)); // Remove pelo índice.
        System.out.println("-------------------------------------------------------------");




    }
}
