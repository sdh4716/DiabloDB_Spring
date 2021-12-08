package com.example.DiabloDB.Controller;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.query.Param;
import org.springframework.util.Base64Utils;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.DiabloDB.DTO.ItemDTO;
import com.example.DiabloDB.Repository.ItemDTO_Repository;


@RestController
//@RequestMapping("/diabo")
public class ItemDTO_Controller {

	 @Autowired
	 private ItemDTO_Repository item_repository;

	 //리스트안에 맵을 사용하여 키,값으로 Blob를 포함한 데이터를 모두 보내준다
	 /*@GetMapping("/list")
	 public List<Map<String, Object>> find_all(){
		 return item_repository.find_all();
	 }*/
	 
	 @GetMapping("/list") //전체
	 public List<ItemDTO> find_all(){
		 return item_repository.findAll();
	 }
	 
	 @GetMapping("/list_category/{category}") //카테고리 상세보기
	 public List<ItemDTO> find_by(@PathVariable String category){
		 return item_repository.find_all(category);
	 }
	 
     //검색 
	 @GetMapping("/search/{names}")
	 public List<ItemDTO> Search(@PathVariable String names) {
		 return item_repository.Search(names);
	 }
	
}
