
package uk.ac.brookes.regcmantic.api.wn;

/**
 *
 * @author Krishna Sapkota, 06-Dec-2011,   16:06:08
 * A PhD project at Oxford Brookes University
 */
public interface  ISimilarity {    
     public  double getSimilarity(String word1, String word2);
     public double getRelatedness(String word1, String word2);

}
