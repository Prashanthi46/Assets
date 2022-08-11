package com.card.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.card.entity.CardsEntity;
import com.card.exceptions.NotFoundException;
import com.card.repo.CardsRepo;


@Service
public class CardsServiceImpl implements CardsServiceInterface {
	@Autowired
	CardsRepo cardsRepo;
	
	
	@Override
	public List<CardsEntity> getAllCards() throws NotFoundException {
		List<CardsEntity> m =cardsRepo.findAll();
		if (m.isEmpty()) {
			throw new NotFoundException("no desktops found");
		}
		return cardsRepo.findAll();
	}
	


	@Override
	public CardsEntity addCard(CardsEntity c) {
		return cardsRepo.save(c);
	}
	

	public String deleteCardBySerialNumber(String n)throws NotFoundException{
		CardsEntity m = cardsRepo.findBySerialNumber(n);
		cardsRepo.delete(m);
		return"Deleted Successfully";
	}


	public String deleteCardByGgid(int n)throws NotFoundException{
		CardsEntity m = cardsRepo.findBygGID(n);
		cardsRepo.delete(m);
		return"Deleted Successfully";
	}


	@Override
	public CardsEntity updateCard(String name, CardsEntity c) {
		c.setSerial_Number(name);
		return cardsRepo.save(c);
	}

	@Override
	public CardsEntity updateCardByGgid(int name, CardsEntity c) {
		c.setGGID(name);
		return cardsRepo.save(c);
	}

	
	@Override
	public CardsEntity getCardBySerialNumber(String name) throws NotFoundException {
		CardsEntity m = cardsRepo.findBySerialNumber(name);
		
		return m;
	}
	

	
	@Override
	public CardsEntity getCardByGgid(int name) throws NotFoundException {
		CardsEntity m = cardsRepo.findBygGID(name);
		
		return m;
	}


	
	

	
}
