package br.edu.insper.desagil.backend.model;


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
		secToMin = duration/60;
		int i = (int) secToMin;
		double d = secToMin - i;
		if (d == 0.0) {
			duracao = i + ":" + "00";
			return duracao;
		}
		else{
			duracao = i + ":" + (int)d*100;				
			return duracao;
		}
		
	}
	public String getFullArtistName() {
		return null;
		
	}
	

}
