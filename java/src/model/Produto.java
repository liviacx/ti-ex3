package model;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;

public class Produto {
	private int id;
	private String regiao;
	private float preco;
	private String item;
	private String marca;	
	private LocalDate dataValidade;
	
	public Produto() {
		id = -1;
		regiao = "";
		preco = 0.00F;
		marca = "";
		item = "";
		dataValidade = LocalDate.now().plusMonths(6); // o default é uma validade de 6 meses.
	}

	public Produto(int id, String regiao, float preco, String marca, String item, LocalDate v) {
		setId(id);
		setRegiao(regiao);
		setPreco(preco);
		setMarca(marca);
		setItem(item);
		setDataValidade(v);
	}		
	
	public int getID() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	
	public String getRegiao() {
		return regiao;
	}

	public void setRegiao(String regiao) {
		this.regiao = regiao;
	}

	public float getPreco() {
		return preco;
	}

	public void setPreco(float preco) {
		this.preco = preco;
	}

	public String getMarca() {
		return marca;
	}
	
	public void setMarca(String marca) {
		this.marca = marca;
	}
	
	public LocalDate getDataValidade() {
		return dataValidade;
	}

	public String getItem() {
		return item;
	}

	public void setItem(String item) {
		this.item = item;
	}

	public void setDataValidade(LocalDate dataValidade) {
		// a data de fabricação deve ser anterior é data de validade.
			this.dataValidade = dataValidade;
	}

	public boolean emValidade() {
		return LocalDateTime.now().isBefore(this.getDataValidade().atTime(23, 59));
	}


	/**
	 * Método sobreposto da classe Object. É executado quando um objeto precisa
	 * ser exibido na forma de String.
	 */
	@Override
	public String toString() {
		return "Produto: " + regiao + "   Preço: R$" + preco + "   Marca.: " + marca + "   Item: "
				+ item  + "   Data de Validade: " + dataValidade;
	}
	
	@Override
	public boolean equals(Object obj) {
		return (this.getID() == ((Produto) obj).getID());
	}	
}