package fr.jgoulet.animepedia.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Anime {
	
	@Id
	private Long id;
	
	@Column
	private String title_romaji;
	
	@Column
	private String  description;
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getTitle_romaji() {
		return title_romaji;
	}
	public void setTitle_romaji(String title_romaji) {
		this.title_romaji = title_romaji;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
}
