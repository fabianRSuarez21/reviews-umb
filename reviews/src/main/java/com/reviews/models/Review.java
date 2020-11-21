package com.reviews.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Review {
	
	@Id
	private Integer id_review;
	
	@Column
	private String descripcion;
	
	@Column
	private Double puntuacion;
	
	@Column
	private boolean liked;

	
	//Getters and Setters
	public Integer getId_review() {
		return id_review;
	}

	public void setId_review(Integer id_review) {
		this.id_review = id_review;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public Double getPuntuacion() {
		return puntuacion;
	}

	public void setPuntuacion(Double puntuacion) {
		this.puntuacion = puntuacion;
	}

	public boolean isLiked() {
		return liked;
	}

	public void setLiked(boolean liked) {
		this.liked = liked;
	}
	
	
}