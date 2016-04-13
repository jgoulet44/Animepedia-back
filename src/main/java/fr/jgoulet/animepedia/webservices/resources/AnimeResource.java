package fr.jgoulet.animepedia.webservices.resources;

import java.util.List;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import fr.jgoulet.animepedia.entities.Anime;
import fr.jgoulet.animepedia.repositories.AnimeRepository;

@Component
@Path("/anime")
public class AnimeResource {
	
	@Autowired
	private AnimeRepository repo;
	
	@GET
	@Produces("application/json")
	public List<Anime> getAnimes(){
		return repo.findAll();
	}
}
