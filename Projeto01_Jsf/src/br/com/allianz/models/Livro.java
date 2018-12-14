package br.com.allianz.models;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Livro {
	
	private int id;
	private String titulo;
	private String autor;
	private Date datePublicacao;
	private double preco;
	
	
	public int getId() {
		return id;
	}
	
	public void setId(int id) {
		this.id = id;
	}
	
	public String getTitulo() {
		return titulo;
	}
	
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	
	public String getAutor() {
		return autor;
	}
	
	public void setAutor(String autor) {
		this.autor = autor;
	}
	
	public Date getDatePublicacao() {
		return datePublicacao;
	}
	
	public void setDatePublicacao(Date datePublicacao) {
		this.datePublicacao = datePublicacao;
	}
	
	public double getPreco() {
		return preco;
	}
	
	public void setPreco(double preco) {
		this.preco = preco;
	}
	
	//metodo para receber a dara do formulario
	public void setDataString(String dataString) {
		
		try {
			
			Date data = new SimpleDateFormat("dd/mm/yyyy").parse(dataString);
			this.setDatePublicacao(data);
			
		} catch (Exception e) {
			
			this.setDatePublicacao(new Date());
			
		}
		
	}
	
	
	

}
