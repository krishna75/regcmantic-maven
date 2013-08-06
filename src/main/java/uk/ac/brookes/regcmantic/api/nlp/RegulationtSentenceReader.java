/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package uk.ac.brookes.regcmantic.api.nlp;

import uk.ac.brookes.regcmantic.rcm.main.Settings;
import uk.ac.brookes.regcmantic.api.xml.XmlReader;
import java.util.ArrayList;
import org.w3c.dom.Element;

/**
 *
 * @author Krishna Sapkota,  May 16, 2012,  3:29:12 PM
 * A PhD project at Oxford Brookes University
 */
public  class RegulationtSentenceReader extends AbstractSentenceReader{
    
    /* IO Files*/
    String path = Settings.PHASE2+ "before_parsing/";
    String IN_ANNOTATED_REG_FILE = path+ "SemiAnnotatedRegulation.xml";
    String OUT_SEN_FILE = path + "Sentence.xml";

    public RegulationtSentenceReader(String inFile, String outFile) { 
        super (inFile, outFile);
        writeFile(senTextList, outFile);
    }
    @Override
    public void init(){
        elementName = "statement";
        inFile = IN_ANNOTATED_REG_FILE;
        outFile = OUT_SEN_FILE;
        reader = new XmlReader() ; 
        senElementList = new ArrayList<Element>();
        senTextList = new ArrayList<String>();
    }

}
