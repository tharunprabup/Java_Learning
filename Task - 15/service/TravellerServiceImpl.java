package com.tharun.firstspringboot.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tharun.firstspringboot.entity.ForeignTour;
import com.tharun.firstspringboot.entity.LocalTour;
import com.tharun.firstspringboot.entity.Traveller;
import com.tharun.firstspringboot.repo.ForeignTourRepository;
import com.tharun.firstspringboot.repo.LocalTourRepository;
import com.tharun.firstspringboot.repo.TravellerRepository;

@Service
public class TravellerServiceImpl implements TravellerService{
	
	@Autowired
	TravellerRepository travellerRepository;
	@Autowired
	private LocalTourRepository localTourRepository;
	@Autowired
	private ForeignTourRepository foreignTourRepository;
	@Override
	public Traveller addTraveller(Traveller traveller) {
		return travellerRepository.save(traveller);
	}
	@Override
	public LocalTour saveLocalTourRequest(LocalTour localTour) {

		Traveller traveller = localTour.getTrtourist();
		localTour.setTrtourist(traveller);
		return localTourRepository.save(localTour);
	}

	@Override
	public ForeignTour saveForeignTourRequest(ForeignTour foreignTour) {
		System.out.println("-----------foreign Tour -------" +foreignTour);
		Traveller traveller = foreignTour.getTrtourist();
		foreignTour.setTrtourist(traveller);
		return foreignTourRepository.save(foreignTour);
	}
	@Override
	public List<Traveller> listAllTravellers() {
		return (List<Traveller>) travellerRepository.findAll();
	}

	@Override
	public Optional<Traveller> findByTravellerId(Long tId) {
	return travellerRepository.findById(tId);

	}

	@Override
	public Traveller findByTravellerName(String tname) {
		return travellerRepository.findByTravellerName(tname);
	}
	
	@Override
	public void deleteByTravellerId(Long tid) {
		 travellerRepository.deleteById(tid);
	}

}
