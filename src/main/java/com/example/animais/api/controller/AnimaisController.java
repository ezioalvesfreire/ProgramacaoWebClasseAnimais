package com.example.animais.api.controller;

import com.example.animais.api.model.Animais;
import com.example.animais.api.repository.AnimaisRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;
import java.net.URI;

import java.util.List;

@RestController
public class AnimaisController {

    @Autowired
    private AnimaisRepository animaisRepository;

    @GetMapping("/animais")
    public ResponseEntity<Object> createAnimais (@RequestBody Animais animais){
        Animais savedAnimais = animaisRepository.save(animais);

        URI location = ServletUriComponentsBuilder.fromCurrentRequest()
                .path("/{id}").buildAndExpand(savedAnimais.getId()).toUri();

        return ResponseEntity.created(location).build();

    }

}
