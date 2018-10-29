/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package semobservador;
import java.util.HashSet;
import java.util.Observable;
import java.util.Set;


public class Telefone extends Observable {

	private String numero;
	public int estadoTelefone;
        // estado telefone se 1, tocando, 2, atendido, 3 , desligado.

    public int getEstadoTelefone() {
        return estadoTelefone;
    }

    public void setEstadoTelefone(int estadoTelefone) {
        this.estadoTelefone = estadoTelefone;
    }

	public Telefone() {
	}
	
	public Telefone(String numero) {
		this();
		this.numero = numero;
	}

	public String getNumero() {
		return numero;
	}

	public void setNumero(String numero) {
		this.numero = numero;
	}

	public void tocar() {
            Telefone telefone = new Telefone();
            telefone.setEstadoTelefone(1);
            setChanged();
            notifyObservers(telefone);		
	}
	
	public void atender() {
            Telefone telefone = new Telefone();
            telefone.setEstadoTelefone(2);
            setChanged();
            notifyObservers(telefone);
	}
	
	public void desligar() {
            Telefone telefone = new Telefone();
            telefone.setEstadoTelefone(3);
            setChanged();
            notifyObservers(telefone);
	}
	
}
