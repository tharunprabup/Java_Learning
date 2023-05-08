package com.tharun.firstspringboot.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.tharun.firstspringboot.entity.LocalTour;


@Repository
public interface LocalTourRepository extends JpaRepository<LocalTour, Long>{

}
