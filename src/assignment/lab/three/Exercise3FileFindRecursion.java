package assignment.lab.three;

import java.io.File;

public class Exercise3FileFindRecursion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		File path = new File("..\\COMP254_JBELENZO\\bin\\assignment\\lab\\three");
		
		findFile(path.getPath(), "find.txt");

	}
	
    public static void findFile(String path, String findFileName) {
        File file = new File(path);

        // Make sure its a File and is equal to the fileName to be searched
        // System.out.println(file.getName());
        if (file.getName().equals(findFileName)) {
            System.out.println("FOUND!!! " + file.getAbsolutePath());
        }

        // Check if the given path is a directory
        else if (file.isDirectory()) {
        	System.out.println("         " + file.getAbsolutePath());
            // Iterate over all entries in the directory
            File[] entries = file.listFiles();
            if (entries != null) {
                for (File entry : entries) {
                    // Recursively call the findFile for each entry
                    findFile(entry.getAbsolutePath(), findFileName);
                }
            }
        }
    }
	
	/* public static boolean find(File path, String findFileName) {
		
		if (path.isDirectory()) {
			
			for (String fileName : path.list()) {
				File file = new File(fileName, findFileName);
				find(file, findFileName);
			}
		}
		if (path.getName().equals(findFileName)) {
			System.out.println("Found! " + "\t" + path.getPath());
			return true;
		} else {
			System.out.println("\t" + path.getPath());
			return false;
		} 
	} */

}
