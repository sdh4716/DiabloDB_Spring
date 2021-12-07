package com.example.DiabloDB.Controller;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.util.Base64Utils;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.DiabloDB.DTO.ItemDTO;
import com.example.DiabloDB.Repository.ItemDTO_Repository;


@RestController
@RequestMapping("/diabo")
public class ItemDTO_Controller {

	 @Autowired
	 private ItemDTO_Repository item_repository;
	 
	 //리스트안에 map을 사용하여 BLOB 데이터와 일반데이터를 같이 보내도록 설정
	 @GetMapping("/list")
	 public List<Map<String, Object>> find_all(){
		 return item_repository.find_all();
	 }
	 	  
}
