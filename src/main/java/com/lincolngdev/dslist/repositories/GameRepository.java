package com.lincolngdev.dslist.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.lincolngdev.dslist.entities.Game;

public interface GameRepository extends JpaRepository<Game, Long > {

}
