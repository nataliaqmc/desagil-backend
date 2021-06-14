package br.edu.insper.desagil.backend.model;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class TrackTest {
	private Track track;
	private Artist artist;
	@BeforeEach
	void setUp() {
	}

	@Test
	void testZeroSeconds() {
		track = new Track(artist, "x", 0);
		assertEquals("0:00", track.getDurationString());
	}

	@Test
	void testFiveSeconds() {
		track = new Track(artist, "x", 5);
		assertEquals("0:05", track.getDurationString());
	}

	@Test
	void testTwentyFiveSeconds() {
		track = new Track(artist, "x", 25);
		assertEquals("0:25", track.getDurationString());
	}

	@Test
	void testOneMinuteZeroSeconds() {
		track = new Track(artist, "x", 60);
		assertEquals("1:00", track.getDurationString());	}

	@Test
	void testOneMinuteFiveSeconds() {
		track = new Track(artist, "x", 65);
		assertEquals("1:05", track.getDurationString());	}

	@Test
	void testOneMinuteTwentyFiveSeconds() {
		track = new Track(artist, "x", 85);
		assertEquals("1:25", track.getDurationString());	}

	@Test
	void testTwoMinutesZeroSeconds() {
		track = new Track(artist, "x", 120);
		assertEquals("2:00", track.getDurationString());	}

	@Test
	void testTwoMinutesFiveSeconds() {
		track = new Track(artist, "x", 125);
		assertEquals("2:05", track.getDurationString());	}

	@Test
	void testTwoMinutesTwentyFiveSeconds() {
		track = new Track(artist, "x", 145);
		assertEquals("2:25", track.getDurationString());	}

	@Test
	void testOneCollaborator() {
		track = new Track(artist, "x", 0);
		assertEquals(0.0, track.getDurationString());	}

	@Test
	void testTwoCollaborators() {
		track = new Track(artist, "x", 0);
		assertEquals(0.0, track.getDurationString());	}
}
