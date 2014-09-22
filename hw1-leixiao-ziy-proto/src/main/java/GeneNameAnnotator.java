import java.util.Map;

import org.apache.uima.analysis_component.JCasAnnotator_ImplBase;
import org.apache.uima.analysis_engine.AnalysisEngineProcessException;
import org.apache.uima.cas.FSIterator;
import org.apache.uima.cas.text.AnnotationFS;
import org.apache.uima.jcas.JCas;
import org.apache.uima.resource.ResourceInitializationException;

import cmu.edu.leixiao.Sentence;
import cmu.edu.leixiao.gene;

public class GeneNameAnnotator extends JCasAnnotator_ImplBase {

	@Override
	public void process(JCas aJCas) throws AnalysisEngineProcessException {
		// TODO Auto-generated method stub
		//FSIterator it = aCAS.getAnnotationIndex(mContainingType).iterator();
		 FSIterator iter = aJCas.getAnnotationIndex().iterator();

	    // iterate
	    while (iter.isValid()) {
	    	
	    	Sentence a = (Sentence)iter.get();
	    	
	    	String docText = a.getSentenceText();
	    	PosTagNamedEntityRecognizer recognizer = null;
			try {
				recognizer = new PosTagNamedEntityRecognizer();
			} catch (ResourceInitializationException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
	    
	    	//gene name=new gene(aJCas);
	    	String id=a.getSentenceID();
			
		    Map<Integer, Integer> mymap = recognizer.getGeneSpans(docText); 
		    int begin=0;
		    int end=0;		    
			 for (Map.Entry<Integer, Integer> entry : mymap.entrySet()) {
				 gene name=new gene(aJCas);

				 begin=entry.getKey();
				 end=entry.getValue();
				//System.out.println(begin+"   "+end);
				 //System.out.println("----");
				 String text=docText.substring(begin,end);		
			     name.setGeneID(id);
				 name.setGeneTag(text);
				// name.setBegin(begin);
				//name.setEnd(end);
				 name.addToIndexes();
				 
				 System.out.println(begin+"   "+end+"   "+name.getGeneID()+" "+name.getGeneTag());
				 
				// System.out.println("GeneName+ID:");
				 //System.out.println(text+id);
			 }
			// System.out.println("----");
			iter.moveToNext();
	    }
		 

	}

}
