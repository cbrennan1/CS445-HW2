// Colin Brennan
package test.java;
import org.junit.jupiter.api.Test;

import main.java.ImprovedStringTokenizer;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.ArrayList;


public class ImprovedStringTokenizerTesting {
	//String Fixtures
	private static final String token;
	private static final ArrayList<String> expectedTokenizedArrayOutput;
	
	//Initialize fixtures
	static {
		token = "My name is Colin Brennan and I am in Chicago";	
		
		expectedTokenizedArrayOutput = new ArrayList(10);
		expectedTokenizedArrayOutput.add("My");
		expectedTokenizedArrayOutput.add("name");
		expectedTokenizedArrayOutput.add("is");
		expectedTokenizedArrayOutput.add("Colin");
		expectedTokenizedArrayOutput.add("Brennan");
		expectedTokenizedArrayOutput.add("and");
		expectedTokenizedArrayOutput.add("I");
		expectedTokenizedArrayOutput.add("am");
		expectedTokenizedArrayOutput.add("in");
		expectedTokenizedArrayOutput.add("Chicago");
	}
	
	@Test
	void tesForTokenizedArray() {
		ImprovedStringTokenizer impprovedStringTokenizer = new ImprovedStringTokenizer(token);
		ArrayList<String> tokenArr = impprovedStringTokenizer.getTokenizedArray();
		assertEquals(expectedTokenizedArrayOutput, tokenArr);
		
	}
}