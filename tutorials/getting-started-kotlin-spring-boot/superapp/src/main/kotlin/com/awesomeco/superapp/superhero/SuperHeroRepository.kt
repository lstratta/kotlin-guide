package com.awesomeco.superapp.superhero

import org.springframework.data.repository.CrudRepository
import org.springframework.stereotype.Repository

@Repository
interface SuperHeroRepository: CrudRepository<SuperHero, Long>










