package com.example.DiabloDB.Repository;

import java.util.List;
import java.util.Map;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.example.DiabloDB.DTO.ItemDTO;

public interface ItemDTO_Repository extends JpaRepository<ItemDTO, Long>{
	
	@Query(value="select * from diadb.item_dto where categorys=?1", nativeQuery=true)
	public List<ItemDTO> find_all(String name);
	
	
	@Query(value="select * from diadb.item_dto where names like %:names%",nativeQuery=true)
	public List<ItemDTO> Search(@Param("names")String names);
	
}
