package labex3;

import java.io.*;

public class StringCounting {
	@SuppressWarnings("resource")
	public static void main(String[] args) throws IOException{
		File file = new File("C:\\Users\\Admin\\OneDrive\\Desktop\\geetha.txt");
	    FileInputStream fileInputStream = new FileInputStream(file);
	    InputStreamReader inputStreamReader = new InputStreamReader(fileInputStream);
	    BufferedReader bufferedReader = new BufferedReader(inputStreamReader);
	    String line;
        int wordCount = 0;
        int characterCount = 0;
        int paraCount = 0;
        while ((line = bufferedReader.readLine()) != null) {
            if (line.equals("")) {
            	  paraCount += 1;
            }
            else {
                characterCount += line.length();
                String words[] = line.split("\\s+");
                wordCount += words.length;
            }
        }
        
            System.out.println("Total word count = "+ wordCount);
            System.out.println("Total number of characters = "+ characterCount);
            System.out.println("Number of paragraphs = "+ line);
     }
		     
}
		  


