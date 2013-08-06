
package uk.ac.brookes.regcmantic.api.wn;

import java.util.HashMap;
import java.util.Map;
import shef.nlp.wordnet.similarity.SimilarityMeasure;

/**
 *
 * @author Krishna Sapkota, 06-Dec-2011,   16:18:26
 * A PhD project at Oxford Brookes University
 */
public class AbstractSimilarity extends AbstractWordnet implements ISimilarity{
    SimilarityMeasure sim ;
    Map<String, String> params = new HashMap<String, String>();
    
    public AbstractSimilarity() {
       
    }

    @Override
    public double getSimilarity(String word1, String word2) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public double getRelatedness(String word1, String word2) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

}
