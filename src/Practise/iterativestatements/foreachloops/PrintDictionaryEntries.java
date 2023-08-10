package Practise.iterativestatements.foreachloops;

public class PrintDictionaryEntries {

	public static void main(String[] args) {
	     // Create a simple array of key-value pairs (dictionary)
        String[][] dictionary = {
            {"apple", "a fruit"},
            {"banana", "a fruit"},
            {"carrot", "a vegetable"},
            {"dog", "an animal"},
            {"elephant", "a large animal"}
        };

        // Iterate through the dictionary and print key-value pairs
        for (String[] entry : dictionary) {
            String key = entry[0];
            String value = entry[1];
            System.out.println(key + ": " + value);
		}

	}

}
