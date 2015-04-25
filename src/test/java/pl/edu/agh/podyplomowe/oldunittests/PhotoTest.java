package pl.edu.agh.podyplomowe.oldunittests;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import pl.edu.agh.podyplomowe.Photo;

public class PhotoTest {

	@Test
	public void shouldDefaultCommentBeEmptyString() {
		// Given
		Photo photo = new Photo();

		// Then
		assertEquals("", photo.getComment());
	}
}
