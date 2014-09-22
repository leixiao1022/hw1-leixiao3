import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Iterator;

import org.apache.uima.cas.CAS;
import org.apache.uima.cas.CASException;
import org.apache.uima.cas.FSIterator;
import org.apache.uima.collection.CasConsumer_ImplBase;
import org.apache.uima.examples.SourceDocumentInformation;
import org.apache.uima.jcas.JCas;
import org.apache.uima.jcas.tcas.Annotation;
import org.apache.uima.resource.ResourceInitializationException;
import org.apache.uima.resource.ResourceProcessException;

import cmu.edu.leixiao.Sentence;
import cmu.edu.leixiao.gene;



public class GeneCasConsumer extends CasConsumer_ImplBase {

	@Override
	public void initialize() throws ResourceInitializationException {
		
       System.out.println("Entering Cas Consumer:");
	}
	public void processCas(CAS aCAS) throws ResourceProcessException {
		// TODO Auto-generated method stub
		String oPath = (String) getUimaContext().getConfigParameterValue("OutputDocument");
		System.out.println("##########################");
		System.out.println(oPath);
		File outFile;
		FileWriter fileWriter = null;
		outFile = new File(oPath.trim());
		try {
			fileWriter = new FileWriter(outFile);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		   JCas jcas;
		    try {
		      jcas = aCAS.getJCas();
		    } catch (CASException e) {
		      throw new ResourceProcessException(e);
		    }
		   
		
		    //iterator 
		    Iterator iter = jcas.getAnnotationIndex(gene.type).iterator();
		    while (iter.hasNext()) {
		      //gene annot = (gene) annotationIter.next();
		      gene k = (gene) iter.next();
		    	//gene k = (gene)iter.next();
		      String id = k.getGeneID();
			  String tag= k.getGeneTag();
			  
			 System.out.println("GeneName+ID:");
			 
			 System.out.println(tag);
			 
			 
		     		      		        
		      try {
				fileWriter.write(id+"|"+k.getBegin()+" "+k.getEnd()+"|"+tag+"\n");
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		        
		       // iter.moveToNext();	       
		    }
	}
}
