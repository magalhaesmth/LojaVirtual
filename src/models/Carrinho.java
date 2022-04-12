package models;

import java.util.Date;

public class Carrinho {
	
	private Date dataCompra = new Date();
	private Cliente cliente;
	
	public Date getDataCompra() {
		return dataCompra;
	}
	public Cliente getCliente() {
		return cliente;
	}
	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

}
