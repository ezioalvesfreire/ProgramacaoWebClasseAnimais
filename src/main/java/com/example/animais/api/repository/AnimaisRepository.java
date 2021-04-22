package com.example.animais.api.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.example.animais.api.model.Animais;
import org.springframework.stereotype.Repository;
import org.springframework.data.jpa.repository.JpaRepository;

@Repository
public interface AnimaisRepository extends JpaRepository<Animais, Long> {

}
