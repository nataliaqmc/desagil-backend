package br.edu.insper.desagil.backend.model;

import java.util.ArrayList;
import java.util.List;

public class Track {
	private Artist artist;
	private String name;
	private int duration;
	
	public Track(Artist artist, String name, int duration) {
		super();
		this.artist = artist;
		this.name = name;
		this.duration = duration;
	}
	public Artist getArtist() {
		return artist;
	}
	public String getName() {
		return name;
	}
	public int getDuration() {
		return duration;
	}
	public String getDurationString() {
		String duracao = null;
		double secToMin;
		List<Double> lista = new ArrayList<>();
		secToMin = duration/60;
		lista.add(secToMin);
		duracao = lista.toString();
							
		return duracao;
	}
	public String getFullArtistName() {
		return null;
		
	}
	

}
