package com.awesomeco.superapp.superhero

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/super-hero")
class SuperHeroController(
    val superHeroRepository: SuperHeroRepository
) {

    @GetMapping
    fun getAllSuperHeroes(): SuperHeroResponse{
        return SuperHeroResponse(superHeroRepository.findAll().toList())
    }
}

data class SuperHeroResponse(
    val listOfSuperHeroes: List<SuperHero> = emptyList()
)


