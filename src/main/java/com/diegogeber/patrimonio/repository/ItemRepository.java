package com.diegogeber.patrimonio.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.diegogeber.patrimonio.model.Item;

public interface ItemRepository extends JpaRepository<Item, Long> {
	
}
