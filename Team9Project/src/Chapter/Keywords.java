package Chapter;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.ArrayList;

import javax.swing.JOptionPane;

public class Keywords {
	
	ArrayList<ArrayList> keyword_dataframe;
	
	public Keywords(){
		
		keyword_dataframe = new ArrayList<ArrayList>();
				
        File f = new File("keywords.txt");
		
		try {
		      File myFile = f;            
		      FileReader fileReader = new FileReader(myFile);
		      
		      BufferedReader reader = new BufferedReader(fileReader);
		      
		      String line = null;		      
	    
		      while((line = reader.readLine()) != null)
		      {	 
		    	  
		    	 String[] splitlist = line.split(",");
		    	 ArrayList<String> keywordlist = new ArrayList<String>();
		    	 
		    	 for(String keyword : splitlist){
		    		 keywordlist.add(keyword); 
		    	 }
		    	 keyword_dataframe.add(keywordlist);	    	 
		      }
		      reader.close();
		      
		} catch (Exception ex) {
			JOptionPane.showMessageDialog(null, "There is an error!!");
			ex.printStackTrace();
		}
		
	}
	


}
