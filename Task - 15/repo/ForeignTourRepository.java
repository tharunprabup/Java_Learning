package com.tharun.firstspringboot.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.tharun.firstspringboot.entity.ForeignTour;


@Repository
public interface ForeignTourRepository extends JpaRepository<ForeignTour, Long>{

}