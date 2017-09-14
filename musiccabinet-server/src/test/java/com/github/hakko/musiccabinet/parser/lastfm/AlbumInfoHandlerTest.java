package com.github.hakko.musiccabinet.parser.lastfm;

import junit.framework.Assert;

import org.junit.Test;

public class AlbumInfoHandlerTest {

	private AlbumInfoHandler aih = new AlbumInfoHandler();
	
	private static final String EMPTY_URL = "";
	private static final String CORRECT_URL = 
			"http://img2-ak.lst.fm/i/u/64s/0ba57b4d2e03435793fa00d050bbd40d.png";

	@Test
	public void nullUrlReturnsNull() {
		Assert.assertNull(aih.validateUrl(null));
	}

	@Test
	public void emptyUrlReturnsNull() {
		Assert.assertNull(aih.validateUrl(EMPTY_URL));
	}

	@Test
	public void correctUrlReturnsItself() {
		Assert.assertEquals(CORRECT_URL, aih.validateUrl(CORRECT_URL));
	}
}