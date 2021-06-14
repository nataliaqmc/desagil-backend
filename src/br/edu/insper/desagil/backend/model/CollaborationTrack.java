package br.edu.insper.desagil.backend.model;

import java.util.List;

public class CollaborationTrack extends Track{
	private List<Artist> collaborators;
	public CollaborationTrack(Artist artist, List<Artist> collaborators, String name, int duration) {
		super(artist, name, duration);
		// TODO Auto-generated constructor stub
		this.collaborators = collaborators;
	}
	@Override
	public String getFullArtistName() {
		String nomeInteiro;
		if (collaborators != null){
			nomeInteiro = getArtist().toString() +"(feat. "+ collaborators.toString()+")";
			return nomeInteiro;
		}
		else {
			nomeInteiro = getArtist().toString();
			return nomeInteiro;
		}
		
		
	}

}
