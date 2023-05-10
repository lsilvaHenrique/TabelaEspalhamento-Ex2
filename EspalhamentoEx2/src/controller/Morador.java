package controller;
import java.util.LinkedList;

public class Morador {
	    private int numAp;
	    private String nome;
	    private String modeloCarro;
	    private String corCarro;
	    private String placaCarro;
	    
	    public Morador (int numAp, String nome, String modeloCarro, String corCarro, String placaCarro) {
	        this.numAp = numAp;
	        this.nome = nome;
	        this.modeloCarro = modeloCarro;
	        this.corCarro = corCarro;
	        this.placaCarro = placaCarro;
	    }
	    
	    public int getNumAp() {
	        return numAp;
	    }
	    
	    public String getNome() {
	        return nome;
	    }
	    
	    public String getModeloCarro() {
	        return modeloCarro;
	    }
	    
	    public String getCorCarro() {
	        return corCarro;
	    }
	    
	    public String getPlacaCarro() {
	        return placaCarro;
	    }
	}
