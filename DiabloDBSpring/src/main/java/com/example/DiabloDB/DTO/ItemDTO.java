package com.example.DiabloDB.DTO;

import java.sql.Blob;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.PrePersist;

import lombok.Data;

@Data
@Entity(name="item_dto")
public class ItemDTO {
	@Id 
	@GeneratedValue(strategy = GenerationType.IDENTITY) 
	private Long num;
	@Column(length=3000)
	private String names;
	@Column(length=3000)
	private String options;
	@Column(length=3000)
	private String recommends;
	@Column(length=3000)
	private String categorys;
	private Long likes;
	private Long dislikes;
	private Blob images;
	
	// 좋아요, 싫어요 초기값
	@PrePersist
	public void prePersist() {
		this.likes= this.likes==null?0:this.likes;
		this.dislikes= this.dislikes==null?0:this.dislikes;
	}

}
