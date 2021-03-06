package com.ecommerce.microcommerce.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.Min;

import org.hibernate.validator.constraints.Length;

import com.fasterxml.jackson.annotation.JsonFilter;

//@JsonIgnoreProperties(value = {"prixAchat", "id"})
//@JsonFilter("monFiltreDynamique")// filtre dynamique
@Entity
public class Product {
	
	
	public Product(int id, String nom, int prix, int prixAchat) {
		super();
		this.id = id;
		this.nom = nom;
		this.prix = prix;
		this.prixAchat = prixAchat;
	}

	    public Product() {
		super();
		// TODO Auto-generated constructor stub
	}

	    @Id
	    @GeneratedValue( strategy = GenerationType.IDENTITY )
		private int id;
	    
	    @Length(min=3, max=20,message = "Nom trop long ou trop court. Et oui messages sont plus stylés que ceux de Spring")
	    private String nom;
	    
	    @Min(value = 1)
	    private int prix;
	    
	    //info qu'on ne veut pas afficher dans une requette
	    private int prixAchat;
	    
	    private int qteStock;
	    
	    
	    
	    
		public int getPrixAchat() {
			return prixAchat;
		}

		public void setPrixAchat(int prixAchat) {
			this.prixAchat = prixAchat;
		}

		public int getId() {
			return id;
		}
		public void setId(int id) {
			this.id = id;
		}
		public String getNom() {
			return nom;
		}
		public void setNom(String nom) {
			this.nom = nom;
		}
		public int getPrix() {
			return prix;
		}
		public void setPrix(int prix) {
			this.prix = prix;
		}
	
		@Override
		public String toString() {
			return "Product [id=" + id + ", nom=" + nom + ", prix=" + prix + "]";
		}
	    
	    
	    
	    
}
