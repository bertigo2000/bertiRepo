package com.ecommerce.microcommerce.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.ecommerce.microcommerce.model.Product;

@Repository
public interface ProductDao extends JpaRepository<Product, Integer>{

//	    public List<Product>findAll();
	    public Product findById(int id);
//	    public Product save(Product product);
	    
	    List<Product> findByPrixGreaterThan(int prixLimit);
	    List<Product> findByNomLike(String recherche);
	    
	    //@Query("SELECT id, nom, prix FROM Product p WHERE p.prix > :prixLimit")
	    @Query("SELECT p FROM Product p WHERE p.prix > :prixLimit")
	    List<Product>  chercherUnProduitCher(@Param("prixLimit") int prix);
	    
	   
}
