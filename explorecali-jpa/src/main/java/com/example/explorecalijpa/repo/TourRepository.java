package com.example.explorecalijpa.repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.explorecalijpa.model.Difficulty;
import com.example.explorecalijpa.model.Tour;

public interface TourRepository extends JpaRepository<Tour, Integer> {

  public List<Tour> findByDifficulty(Difficulty difficulty);

  public List<Tour> findByTourPackageCode(String code);
}