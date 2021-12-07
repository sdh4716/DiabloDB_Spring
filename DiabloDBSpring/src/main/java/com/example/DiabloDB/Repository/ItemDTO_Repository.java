package com.example.DiabloDB.Repository;

import java.util.List;
import java.util.Map;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.example.DiabloDB.DTO.ItemDTO;

public interface ItemDTO_Repository extends JpaRepository<ItemDTO, Long>{
	
	@Query(value="Select * from diadb.item_dto", nativeQuery=true)
	public List<Map<String, Object>> find_all();
}
