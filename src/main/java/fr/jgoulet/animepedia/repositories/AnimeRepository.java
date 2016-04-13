package fr.jgoulet.animepedia.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import fr.jgoulet.animepedia.entities.Anime;

public interface AnimeRepository extends JpaRepository<Anime, Long> {
	
}
