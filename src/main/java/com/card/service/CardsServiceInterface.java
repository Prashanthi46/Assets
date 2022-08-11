package com.card.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.card.entity.CardsEntity;
import com.card.exceptions.NotFoundException;

@Service
public interface CardsServiceInterface {
	

	public List<CardsEntity> getAllCards() throws NotFoundException;
	public CardsEntity addCard(CardsEntity c);
	public CardsEntity updateCard(String name, CardsEntity c);
	public String deleteCardBySerialNumber(String name) throws NotFoundException;
	public String deleteCardByGgid(int n)throws NotFoundException;
	public CardsEntity getCardByGgid(int name) throws NotFoundException;
    CardsEntity getCardBySerialNumber(String name) throws NotFoundException;
	CardsEntity updateCardByGgid(int name, CardsEntity c);
	
	

	

}
