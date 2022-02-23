//Colin Brennan Improved String Tokenizer
package main.java;

import java.util.ArrayList;
import java.util.StringTokenizer;

public class ImprovedStringTokenizer extends StringTokenizer{

    public ImprovedStringTokenizer(String string, String delimiter, boolean returnDelimiters) {
        super(string, delimiter, returnDelimiters);
    }

    public ImprovedStringTokenizer(String string, String delimiter) {
        super(string, delimiter);
    }

    public ImprovedStringTokenizer(String string) {
        super(string);
    }

    public ArrayList<String> getTokenizedArray() {
        ArrayList<String> tokenArray = new ArrayList();

        while(this.hasMoreTokens()) {
            tokenArray.add(this.nextToken());
        }
        return tokenArray;
    }

}