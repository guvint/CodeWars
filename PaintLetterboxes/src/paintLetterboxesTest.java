import org.junit.Test;
import static org.junit.Assert.assertArrayEquals;

public class paintLetterboxesTest {

	@Test
	public void ex() {
		assertArrayEquals(new int[] { 1, 9, 6, 3, 0, 1, 1, 1, 1, 1 }, paintLetterboxes.paint(125, 132));
	}

}