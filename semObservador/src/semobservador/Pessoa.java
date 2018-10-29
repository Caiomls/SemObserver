/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package semobservador;

import java.util.Observable;
import java.util.Observer;

public class Pessoa implements Observer {

	private String nome;
	private String cpf;

	public Pessoa(String nome, String cpf) {
		super();
		this.nome = nome;
		this.cpf = cpf;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	

    @Override
    public void update(Observable o, Object arg) {
        if (arg instanceof Telefone){
            switch(((Telefone) arg).getEstadoTelefone()){
                case 1: System.out.println("O telefone" + ((Telefone) arg).getNumero() + "de "+ this.getNome()  +"esta tocando");
                case 2: System.out.println("O telefone" + ((Telefone) arg).getNumero() + "de "+ this.getNome()  +"foi atendido");
                case 3: System.out.println("O telefone" + ((Telefone) arg).getNumero() + "de "+ this.getNome()  +"foi desligado");
            }
        }
    }

}
