package view;

import java.util.LinkedList;
import controller.HashTable;
import controller.Morador;

public class Principal {
	
	public static void main(String[] args) {
	    HashTable tabela = new HashTable(100);
	    
	    // Adicionar moradores
	    tabela.add(new Morador(101, "João", "Fiat Uno", "Vermelho", "ABC-1234"));
	    tabela.add(new Morador(102, "Maria", "VW Gol", "Branco", "DEF-5678"));
	    tabela.add(new Morador(201, "Pedro", "Ford Ka", "Preto", "GHI-9012"));
	    tabela.add(new Morador(701, "Lucas", "Chevrolet Onix", "Prata", "JKL-3456"));
	    
	    // Buscar morador pelo número do apartamento
	    Morador morador = tabela.get(201);
	    if (morador != null) {
	        System.out.println(morador.getNome() + " tem um " + morador.getModeloCarro() + " " +
	                           morador.getCorCarro() + " com a placa " + morador.getPlacaCarro());
	    } else {
	        System.out.println("Morador não encontrado.");
	    }
	    
	    // Excluir morador pelo número do apartamento
	    tabela.remove(201);
	    
	    // Listar moradores de um determinado andar
	    LinkedList<Morador> moradoresAndar1 = tabela.listByFloor(1);
	    System.out.println("Moradores do 1º andar:");
	    for (Morador m : moradoresAndar1) {
	        System.out.println(m.getNome() + " tem um " + m.getModeloCarro() + " " +
	                           m.getCorCarro() + " com a placa " + m.getPlacaCarro());
	    }
	}

}
