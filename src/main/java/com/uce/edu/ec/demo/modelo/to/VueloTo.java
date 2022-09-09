package com.uce.edu.ec.demo.modelo.to;

import java.math.BigDecimal;

public class VueloTo {

	private String numero;
	private String origen;
	private String destino;
	private String nombre;
	private BigDecimal valorAsiento;

	public VueloTo() {
		// TODO Auto-generated constructor stub
	}

	public VueloTo(String numero, String origen, String destino, String nombre, BigDecimal valorAsiento) {
		super();
		this.numero = numero;
		this.origen = origen;
		this.destino = destino;
		this.nombre = nombre;
		this.valorAsiento = valorAsiento;
	}

	// SET y GET
	public String getNumero() {
		return numero;
	}

	public void setNumero(String numero) {
		this.numero = numero;
	}

	public String getOrigen() {
		return origen;
	}

	public void setOrigen(String origen) {
		this.origen = origen;
	}

	public String getDestino() {
		return destino;
	}

	public void setDestino(String destino) {
		this.destino = destino;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public BigDecimal getValorAsiento() {
		return valorAsiento;
	}

	public void setValorAsiento(BigDecimal valorAsiento) {
		this.valorAsiento = valorAsiento;
	}

	@Override
	public String toString() {
		return "VueloTo [numero=" + numero + ", origen=" + origen + ", destino=" + destino + ", nombre=" + nombre
				+ ", valorAsiento=" + valorAsiento + "]";
	}

}
