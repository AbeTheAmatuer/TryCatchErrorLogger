package errorLog;

//STUFF YOU NEED TO IMPORT
import java.util.concurrent.TimeUnit;
import java.io.FileWriter;   
import java.io.IOException;  
import java.io.File;
import java.time.LocalDateTime;    

public class errorLog {
	public static void main(String [] args) throws Exception{
		
		//THESE CREATE THE FILE AND FILEWRITER OBJECTS
		File errorLogs = new File("errorLogs.txt"); //BY DEFAULT SHOULD CREATE errorLogs.txt FILE IN FOLDER OUTSIDE OF WHERE JAVA CLASS FILE IS LOCATED, SPECIFY PATH TO CHANGE
		/* PATH FORMAT FOR MAC: folder/folder/folder/folder/fileName.txt. Replace 'folder' with desired folders, ie "user", "documents", "desktop", etc.
  		   PATH FORMAT FOR WINDOWS: DRIVE:\\folder\\folder\\folder\\folder\\fileName.txt (Change drive to respective drive, ie C:, D:, H: etc, replace 'folder' with desired folders, ie "user", "documents", "desktop", etc.
  		*/
        	FileWriter errorWriter = new FileWriter(errorLogs, true); 
		
        //THIS IS THE TRY AND CATCH BLOCK WHICH CATCHES AND STORES ANY ERRORS
        try {
            //THIS IS WHERE YOU ENTER YOUR CODE YOU WANT TO DEBUG 
        } catch (Exception e) {
        	LocalDateTime now = LocalDateTime.now();
        	e.printStackTrace();
            	errorWriter.write("ERROR: " + e + "\nDate and Time: " + now + "\n-----------------\n");
            	errorWriter.close();
    	}
     }
}

/* THIS WILL ONLY WORK WITH ERRORS THAT ARE AFFECTED BY THE TRY-CATCH BLOCK
 * FOR MORE INFO ON TRY/CATCH, LOOK AT THESE DOCS - 'https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Statements/try...catch'
 * FILE, FILEWRITER AND LOCALDATETIME LIBRARIES USED
 * WRITTEN BY ABETHEAMATEUR
 */
