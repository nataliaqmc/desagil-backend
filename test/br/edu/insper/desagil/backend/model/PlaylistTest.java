package br.edu.insper.desagil.backend.model;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.HashMap;
import java.util.Map;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class PlaylistTest {
	private static double DELTA = 0.000001;
	private Playlist playlist;
	private Map<String, Integer> ratings;
	@BeforeEach
	void setUp() {
		playlist = new Playlist(0);
		ratings = new HashMap<>();
	}

	@Test
	void testRoundDownToZero() {
		ratings = new HashMap<>();
		ratings.put("1", 1);
		ratings.put("2", 2);
		ratings.put("3", 3);
		ratings.put("4", 3);
		assertEquals(2.0, playlist.averageRatings(), DELTA);
	}

	@Test
	void testRoundUpToHalf() {
		ratings = new HashMap<>();
		ratings.put("1", 1);
		ratings.put("2", 2);
		ratings.put("3", 1);
		assertEquals(1.5, playlist.averageRatings(), DELTA);
	}

	@Test
	void testRoundDownToHalf() {
		ratings = new HashMap<>();
		ratings.put("1", 1);
		ratings.put("2", 2);
		ratings.put("3", 2);
		assertEquals(1.5, playlist.averageRatings(), DELTA);
	}

	@Test
	void testRoundUpToOne() {
		ratings = new HashMap<>();
		ratings.put("1", 1);
		ratings.put("2", 1);
		ratings.put("3", 2);
		ratings.put("4", 3);
		assertEquals(2.0, playlist.averageRatings(), DELTA);
	}
}
