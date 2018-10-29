/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package semobservador;

import java.util.Observable;
import java.util.Observer;


public class SecretariaEletronica implements Observer {

	private String numeroSerie;
	private String modelo;

	public SecretariaEletronica(String numeroSerie, String modelo) {
		super();
		this.numeroSerie = numeroSerie;
		this.modelo = modelo;
	}

	public String getNumeroSerie() {
		return numeroSerie;
	}

	public void setNumeroSerie(String numeroSerie) {
		this.numeroSerie = numeroSerie;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	

    @Override
    public void update(Observable o, Object arg) {
        if (arg instanceof Telefone){
            switch(((Telefone) arg).getEstadoTelefone()){
                case 1: System.out.println("O telefone" + ((Telefone) arg).getNumero() + "esta tocando");
                case 2: System.out.println("O telefone" + ((Telefone) arg).getNumero() + "foi atendido");
                case 3: System.out.println("O telefone" + ((Telefone) arg).getNumero() + "foi desligado");
            }
        }
    }

}