
/* First created by JCasGen Sun Sep 21 21:47:06 EDT 2014 */
package cmu.edu.leixiao;

import org.apache.uima.jcas.JCas;
import org.apache.uima.jcas.JCasRegistry;
import org.apache.uima.cas.impl.CASImpl;
import org.apache.uima.cas.impl.FSGenerator;
import org.apache.uima.cas.FeatureStructure;
import org.apache.uima.cas.impl.TypeImpl;
import org.apache.uima.cas.Type;
import org.apache.uima.cas.impl.FeatureImpl;
import org.apache.uima.cas.Feature;
import org.apache.uima.jcas.tcas.Annotation_Type;

/** 
 * Updated by JCasGen Mon Sep 22 03:52:31 EDT 2014
 * @generated */
public class Sentence_Type extends Annotation_Type {
  /** @generated 
   * @return the generator for this type
   */
  @Override
  protected FSGenerator getFSGenerator() {return fsGenerator;}
  /** @generated */
  private final FSGenerator fsGenerator = 
    new FSGenerator() {
      public FeatureStructure createFS(int addr, CASImpl cas) {
  			 if (Sentence_Type.this.useExistingInstance) {
  			   // Return eq fs instance if already created
  		     FeatureStructure fs = Sentence_Type.this.jcas.getJfsFromCaddr(addr);
  		     if (null == fs) {
  		       fs = new Sentence(addr, Sentence_Type.this);
  			   Sentence_Type.this.jcas.putJfsFromCaddr(addr, fs);
  			   return fs;
  		     }
  		     return fs;
        } else return new Sentence(addr, Sentence_Type.this);
  	  }
    };
  /** @generated */
  @SuppressWarnings ("hiding")
  public final static int typeIndexID = Sentence.typeIndexID;
  /** @generated 
     @modifiable */
  @SuppressWarnings ("hiding")
  public final static boolean featOkTst = JCasRegistry.getFeatOkTst("cmu.edu.leixiao.Sentence");
 
  /** @generated */
  final Feature casFeat_SentenceID;
  /** @generated */
  final int     casFeatCode_SentenceID;
  /** @generated
   * @param addr low level Feature Structure reference
   * @return the feature value 
   */ 
  public String getSentenceID(int addr) {
        if (featOkTst && casFeat_SentenceID == null)
      jcas.throwFeatMissing("SentenceID", "cmu.edu.leixiao.Sentence");
    return ll_cas.ll_getStringValue(addr, casFeatCode_SentenceID);
  }
  /** @generated
   * @param addr low level Feature Structure reference
   * @param v value to set 
   */    
  public void setSentenceID(int addr, String v) {
        if (featOkTst && casFeat_SentenceID == null)
      jcas.throwFeatMissing("SentenceID", "cmu.edu.leixiao.Sentence");
    ll_cas.ll_setStringValue(addr, casFeatCode_SentenceID, v);}
    
  
 
  /** @generated */
  final Feature casFeat_SentenceText;
  /** @generated */
  final int     casFeatCode_SentenceText;
  /** @generated
   * @param addr low level Feature Structure reference
   * @return the feature value 
   */ 
  public String getSentenceText(int addr) {
        if (featOkTst && casFeat_SentenceText == null)
      jcas.throwFeatMissing("SentenceText", "cmu.edu.leixiao.Sentence");
    return ll_cas.ll_getStringValue(addr, casFeatCode_SentenceText);
  }
  /** @generated
   * @param addr low level Feature Structure reference
   * @param v value to set 
   */    
  public void setSentenceText(int addr, String v) {
        if (featOkTst && casFeat_SentenceText == null)
      jcas.throwFeatMissing("SentenceText", "cmu.edu.leixiao.Sentence");
    ll_cas.ll_setStringValue(addr, casFeatCode_SentenceText, v);}
    
  



  /** initialize variables to correspond with Cas Type and Features
	 * @generated
	 * @param jcas JCas
	 * @param casType Type 
	 */
  public Sentence_Type(JCas jcas, Type casType) {
    super(jcas, casType);
    casImpl.getFSClassRegistry().addGeneratorForType((TypeImpl)this.casType, getFSGenerator());

 
    casFeat_SentenceID = jcas.getRequiredFeatureDE(casType, "SentenceID", "uima.cas.String", featOkTst);
    casFeatCode_SentenceID  = (null == casFeat_SentenceID) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_SentenceID).getCode();

 
    casFeat_SentenceText = jcas.getRequiredFeatureDE(casType, "SentenceText", "uima.cas.String", featOkTst);
    casFeatCode_SentenceText  = (null == casFeat_SentenceText) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_SentenceText).getCode();

  }
}



    