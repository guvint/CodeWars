
import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class YesOrNoTest {
	@Test
	public void testBoolToWord() {
		assertEquals(YesOrNo.yesOrNo(true), "Yes");
		assertEquals(YesOrNo.yesOrNo(false), "No");
	}
}