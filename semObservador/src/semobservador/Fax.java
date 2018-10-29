/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package semobservador;

import java.util.Observable;

public class Fax {
	
	private String fabricante;
	private int codigo;
	
	public Fax(String fabricante, int codigo) {
		super();
		this.fabricante = fabricante;
		this.codigo = codigo;
	}
	
	public String getFabricante() {
		return fabricante;
	}
	public void setFabricante(String fabricante) {
		this.fabricante = fabricante;
	}
	public int getCodigo() {
		return codigo;
	}
	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}
	
	public void telefoneAtendido(Telefone telefone) {
		// Comportamento espec凬ico para um fax!

		System.out.println("Fax [" + this.getCodigo() + "]: Fiquei sabendo que o telefone "
				+ telefone.getNumero() + " foi atendido!");
		
	}

	public void telefoneDesligado(Telefone telefone) {
		// Comportamento espec凬ico para um fax!

		System.out.println("Fax [" + this.getCodigo() + "]: Fiquei sabendo que o telefone "
				+ telefone.getNumero() + " foi desligado!");
		
	}

	public void telefoneTocou(Telefone telefone) {
		// Comportamento espec凬ico para um fax!

		System.out.println("Fax [" + this.getCodigo() + "]: Fiquei sabendo que o telefone "
				+ telefone.getNumero() + " tocou!");
		
	}
        public void update(Observable o, Object arg) {
            if (arg instanceof Telefone){
                switch(((Telefone) arg).getEstadoTelefone()){
                    case 1: System.out.println("O Fax" + ((Telefone) arg).getNumero() + "de "+ this.getCodigo()  +"esta tocando");
                    case 2: System.out.println("O Fax" + ((Telefone) arg).getNumero() + "de "+ this.getCodigo()  +"foi atendido");
                    case 3: System.out.println("O Fax" + ((Telefone) arg).getNumero() + "de "+ this.getCodigo()  +"foi desligado");
                }
            }
        }
}
