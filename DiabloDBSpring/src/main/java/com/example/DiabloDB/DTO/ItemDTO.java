package com.example.DiabloDB.DTO;

import java.sql.Blob;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.PrePersist;

import lombok.Data;

@Entity
@Data
public class ItemDTO {
	@Id @GeneratedValue(strategy = GenerationType.IDENTITY) 
	private Long num;
	private String name;
	private String option;
	private String recommend;
	private String category;
	private Long like;
	private Long dislike;
	private Blob image;
	
	// 좋아요, 싫어요 초기값
		@PrePersist
		public void prePersist() {
			this.like= this.like==null?0:this.like;
			this.dislike= this.dislike==null?0:this.dislike;
		}

}
