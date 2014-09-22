
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
public class gene_Type extends Annotation_Type {
  /** @generated 
   * @return the generator for this type
   */
  @Override
  protected FSGenerator getFSGenerator() {return fsGenerator;}
  /** @generated */
  private final FSGenerator fsGenerator = 
    new FSGenerator() {
      public FeatureStructure createFS(int addr, CASImpl cas) {
  			 if (gene_Type.this.useExistingInstance) {
  			   // Return eq fs instance if already created
  		     FeatureStructure fs = gene_Type.this.jcas.getJfsFromCaddr(addr);
  		     if (null == fs) {
  		       fs = new gene(addr, gene_Type.this);
  			   gene_Type.this.jcas.putJfsFromCaddr(addr, fs);
  			   return fs;
  		     }
  		     return fs;
        } else return new gene(addr, gene_Type.this);
  	  }
    };
  /** @generated */
  @SuppressWarnings ("hiding")
  public final static int typeIndexID = gene.typeIndexID;
  /** @generated 
     @modifiable */
  @SuppressWarnings ("hiding")
  public final static boolean featOkTst = JCasRegistry.getFeatOkTst("cmu.edu.leixiao.gene");
 
  /** @generated */
  final Feature casFeat_GeneID;
  /** @generated */
  final int     casFeatCode_GeneID;
  /** @generated
   * @param addr low level Feature Structure reference
   * @return the feature value 
   */ 
  public String getGeneID(int addr) {
        if (featOkTst && casFeat_GeneID == null)
      jcas.throwFeatMissing("GeneID", "cmu.edu.leixiao.gene");
    return ll_cas.ll_getStringValue(addr, casFeatCode_GeneID);
  }
  /** @generated
   * @param addr low level Feature Structure reference
   * @param v value to set 
   */    
  public void setGeneID(int addr, String v) {
        if (featOkTst && casFeat_GeneID == null)
      jcas.throwFeatMissing("GeneID", "cmu.edu.leixiao.gene");
    ll_cas.ll_setStringValue(addr, casFeatCode_GeneID, v);}
    
  
 
  /** @generated */
  final Feature casFeat_GeneTag;
  /** @generated */
  final int     casFeatCode_GeneTag;
  /** @generated
   * @param addr low level Feature Structure reference
   * @return the feature value 
   */ 
  public String getGeneTag(int addr) {
        if (featOkTst && casFeat_GeneTag == null)
      jcas.throwFeatMissing("GeneTag", "cmu.edu.leixiao.gene");
    return ll_cas.ll_getStringValue(addr, casFeatCode_GeneTag);
  }
  /** @generated
   * @param addr low level Feature Structure reference
   * @param v value to set 
   */    
  public void setGeneTag(int addr, String v) {
        if (featOkTst && casFeat_GeneTag == null)
      jcas.throwFeatMissing("GeneTag", "cmu.edu.leixiao.gene");
    ll_cas.ll_setStringValue(addr, casFeatCode_GeneTag, v);}
    
  



  /** initialize variables to correspond with Cas Type and Features
	 * @generated
	 * @param jcas JCas
	 * @param casType Type 
	 */
  public gene_Type(JCas jcas, Type casType) {
    super(jcas, casType);
    casImpl.getFSClassRegistry().addGeneratorForType((TypeImpl)this.casType, getFSGenerator());

 
    casFeat_GeneID = jcas.getRequiredFeatureDE(casType, "GeneID", "uima.cas.String", featOkTst);
    casFeatCode_GeneID  = (null == casFeat_GeneID) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_GeneID).getCode();

 
    casFeat_GeneTag = jcas.getRequiredFeatureDE(casType, "GeneTag", "uima.cas.String", featOkTst);
    casFeatCode_GeneTag  = (null == casFeat_GeneTag) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_GeneTag).getCode();

  }
}



    