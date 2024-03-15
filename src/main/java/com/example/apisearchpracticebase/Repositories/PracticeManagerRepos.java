package com.example.apisearchpracticebase.Repositories;

import com.example.apisearchpracticebase.Models.CollegePracticeManager;
import com.example.apisearchpracticebase.Models.PracticeManager;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PracticeManagerRepos extends CrudRepository<PracticeManager, Long> {
}