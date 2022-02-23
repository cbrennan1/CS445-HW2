package testing.java;

import org.junit.jupiter.api.Test;

import main.java.ImprovedStringTokenizer;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.ArrayList;


public class ImprovedStringTokenizerTesting {
	//String Fixtures Declared
	private static final String token;
	private static final ArrayList<String> expectedTokenizedArrayOutput;
	
	//Initialize string fixtures
	static {
		token = "I am Colin Brennan and live in Chicago";	
		
		expectedTokenizedArrayOutput = new ArrayList(8);
		expectedTokenizedArrayOutput.add("I");
		expectedTokenizedArrayOutput.add("am");
		expectedTokenizedArrayOutput.add("Colin");
		expectedTokenizedArrayOutput.add("Brennan");
		expectedTokenizedArrayOutput.add("and");
		expectedTokenizedArrayOutput.add("live");
		expectedTokenizedArrayOutput.add("in");
		expectedTokenizedArrayOutput.add("Chicago");

	}
	
	@Test
	void tesForTokenizedArray() {
		ImprovedStringTokenizer improvedStringTokenizer = new ImprovedStringTokenizer(token);
		ArrayList<String> tokenArray = improvedStringTokenizer.getTokenizedArray();
		assertEquals(expectedTokenizedArrayOutput, tokenArray);
		
	}
}
