package com.card.repo;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.card.entity.CardsEntity;

@Repository
public interface CardsRepo  extends JpaRepository<CardsEntity, String> {

	CardsEntity findBySerialNumber(String n);

	CardsEntity findBygGID(int n);

}
