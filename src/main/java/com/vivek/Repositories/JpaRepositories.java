package com.vivek.Repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.vivek.Model.Movies;
@Repository
public interface JpaRepositories extends JpaRepository<Movies, String> {

}
