package com.farmacia.farmacia.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Entity
@Table(name = "categoria")
public class Categoria {
		
		@Id
		@GeneratedValue(strategy = GenerationType.IDENTITY)
		private long id;
		@NotNull
		@Size(min = 5, max = 300)
		private String tipo;
		@NotNull
		private boolean entrega;
		@NotNull
		private boolean troca;
		@ManyToOne
		@JsonIgnoreProperties("categoria")
		private Produto produto; 
		
		public long getId() {
			return id;
		}
		public void setId(long id) {
			this.id = id;
		}
		public String getTipo() {
			return tipo;
		}
		public void setTipo(String tipo) {
			this.tipo = tipo;
		}
		public boolean isEntrega() {
			return entrega;
		}
		public void setEntrega(boolean entrega) {
			this.entrega = entrega;
		}
		public boolean isTroca() {
			return troca;
		}
		public void setTroca(boolean troca) {
			this.troca = troca;
		}
		
		public Produto getProduto() {
			return produto;
		}
		public void setProduto(Produto produto) {
			this.produto = produto;
		}
		
}
