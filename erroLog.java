package errorLog;

import java.util.concurrent.TimeUnit;
import java.io.FileWriter;   // Import the FileWriter class
import java.io.IOException;  // 
import java.io.File;
import java.time.LocalDateTime;    
import java.time.LocalDateTime;    

public class erroLog {
	public static void main(String [] args) throws Exception{
		
		//THESE CREATE THE FILE AND FILEWRITER OBJECTS
		File errorLogs = new File("errorLogs.txt");
        FileWriter errorWriter = new FileWriter(errorLogs, true); // SAME HERE
		
        //THIS IS THE TRY AND CATCH BLOCK WHICH CATCHES AND STORES ANY ERRORS
        try {
            //THIS IS WHERE YOU ENTER YOUR CODE YOU WANT TO DEBUG 
        } catch (Exception e) {
        	LocalDateTime now = LocalDateTime.now();
        	e.printStackTrace();
        	System.out.println("Error");
            errorWriter.write("ERROR: " + e + "\nDate and Time: " + now + "\n-----------------\n");
            errorWriter.close();
    }
	}
}

/* THIS WILL ONLY WORK WITH ERRORS THAT ARE AFFECTED BY THE TRY-CATCH BLOCK
 * FOR MORE INFO ON TRY/CATCH, LOOK AT THESE DOCS - 'https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Statements/try...catch'
 * FILE, FILEWRITER AND LOCALDATETIME LIBRARIES USED
 */