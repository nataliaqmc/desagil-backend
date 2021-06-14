package br.edu.insper.desagil.backend.model;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Playlist {
	private int id;
	private List<Track> tracks;
	private Map<String, Integer> ratings;
	
	
	public Playlist(int id, List<Track> tracks,  Map<String, Integer> ratings) {
		super();
		this.id = id;
		this.tracks = new ArrayList<>();
		this.ratings = new HashMap<>();
	}
	public int getId() {
		return id;
	}
	public List<Track> getTracks() {
		return tracks;
	}
	public Map<String, Integer> getRatings() {
		return ratings;
	}
	public void addTrack(Track track) {
		tracks.add(track);
	}
	public void putRaiting(String nomeUser, Integer avaliacao) {
		ratings.put(nomeUser, avaliacao);
	}
	public double averageRatings() {
		double soma = 0;
		int tamanho = ratings.size();
		for (Integer v: ratings.values()) {
			soma = soma + v;
		}
		double media = soma/tamanho;
		int i = (int) media;
		double d = media - i;
		if (d < 0.26) {
			return i + 0.0;
		}
		else if(d >= 0.26 && d< 0.74) {
			return i + 0.5;
		}
			
		return i + 1.0;
		
	}
	

}
