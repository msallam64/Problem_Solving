
package CodeForces_Problem;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class String_Task {
    public static void main(String[] args) throws IOException {
        BufferedReader r = new BufferedReader(new InputStreamReader(System.in));
		String out = ""; //final output
		String vowels = "aoyeuiAOYEUI";//given list of vowels (include captials, to make life easier)
		
		String word = r.readLine(); //getting the word
		
		for(int i = 0; i < word.length(); i++){ //important loop, basically 99% of the program
			boolean m = false; //checking if a vowel
			for(int a = 0; a < vowels.length(); a++)
				if(word.charAt(i) == vowels.charAt(a)) //if letter in word, matches that of a vowel, vowel = true
					m = true;
			if(!m){ //if it's not a vowel
				out +="."; //add dot before constonant
				if((int)word.charAt(i) <= 90 && (int)word.charAt(i) >= 65){ //if it's uppercased (ascii)
					out += (char)(word.charAt(i) + 32); //add 32 to make it lowercased
				}
				else //if it's not uppercased, just add it.
					out += word.charAt(i);
			}		
		}
		System.out.println(out); //finally print the string
	}
}