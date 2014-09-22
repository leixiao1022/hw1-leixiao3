import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

import org.apache.uima.cas.CAS;
import org.apache.uima.cas.CASException;
import org.apache.uima.collection.CollectionException;
import org.apache.uima.collection.CollectionReader_ImplBase;
import org.apache.uima.examples.SourceDocumentInformation;
import org.apache.uima.jcas.JCas;
import org.apache.uima.jcas.tcas.DocumentAnnotation;
import org.apache.uima.resource.ResourceInitializationException;
import org.apache.uima.util.FileUtils;
import org.apache.uima.util.Progress;

import cmu.edu.leixiao.Sentence;


public class GeneCollectionReader extends CollectionReader_ImplBase {
	
	int flag;
	public static final String PARAM_INPUTDIR = "InputDocument";
	public void initialize() throws ResourceInitializationException {
	//	System.out.println("###########?");
	//	System.out.println(getConfigParameterValue(PARAM_INPUTDIR));
		flag=1;

	}
	
	@Override
	public void getNext(CAS aCAS) throws IOException, CollectionException {
		// TODO Auto-generated method stub
	//	System.out.println("###########");

		 
		JCas jcas;
	    try {
	      jcas = aCAS.getJCas();
	    } catch (CASException e) {
	      throw new CollectionException(e);
	    }

	   // Sentence s=jcas;
	    		
	    // open input stream to file
	   // File file = (File) mFiles.get(mCurrentIndex++);
	    
	      // put document in CAS
	 
	    
	    FileReader reader = new FileReader((String)getConfigParameterValue(PARAM_INPUTDIR));
	    System.out.println(getConfigParameterValue(PARAM_INPUTDIR));
		  BufferedReader br = new BufferedReader(reader);
		  String s1 = null;
		  while((s1 = br.readLine()) != null) {
			  
			  Sentence a=new Sentence(jcas);
			  
			  int i=s1.indexOf(" ");
			  String id=s1.substring(0,i);
			  String text=s1.substring(i+1,s1.length()-1);					  
			  a.setSentenceID(id);
			  a.setSentenceText(text);
			  a.addToIndexes();
//			  System.out.println(id);
			  
		  }
		 br.close();
		 reader.close();
		 flag=0;
	    

		

	}

	@Override
	public void close() throws IOException {
		// TODO Auto-generated method stub

	}

	@Override
	public Progress[] getProgress() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean hasNext() throws IOException, CollectionException {
		// TODO Auto-generated method stub
		if(flag==1) return true;
		else return false;
	}

}
