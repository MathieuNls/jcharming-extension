public class {% SUT %}_{% BUG %} extends TestCase {

	private static final String faillure = {% CRASH_STACK %};
	private static final int threshold = {% THRESHOLD %};
	private static int differences = Integer.MAX_VALUE;
	private static final StringTokenizer tokenizerFaillure = 
		new StringTokenizer(faillure, "\n");

	@Test
	public test{% SUT %}() {
		try {
			{% STEPS %}
		} catch (Exception e) {
			 // Count the differences
		}
		assertTrue(differences <= tokenizeOriginalFaillure
			.countTokens() / 100 * (threshold-100));		 
	}
}