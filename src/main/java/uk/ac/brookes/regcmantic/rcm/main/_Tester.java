
package uk.ac.brookes.regcmantic.rcm.main;

import uk.ac.brookes.regcmantic.helper.util.Print;
import uk.ac.brookes.regcmantic.helper.util.RegEx;
import java.awt.Font;

/**
 *
 * @author Krishna Sapkota, 25-Dec-2011,   09:05:10
 * A PhD project at Oxford Brookes University
 */
public class _Tester {

    public _Tester() {
        testRegEx();
//        test();
        //testJavaFonts();
    }


    private void testJavaFonts(){
        int bold = Font.BOLD;
        int italic = Font.ITALIC;
        Print.prln("bold value = "+bold+", italic value = "+italic);
    }
    
    private void test(){
//        _2_MappingData m = new _2_MappingData();
//        m.readFile();
////        Print.prArrayList(m.listRegulationsByTask("TankCleanTask101"));
//        Print.prArrayList(m.listTasksByRegulation("Eudralex_5.22"));
    }
    
    private void testRegEx(){
        String text = "HI-THERE howAreYouOK?";
        text = RegEx.splitCamelcase(text);
        text = RegEx.trimPhrase(text);
//        text = "HiThereAreYouOk?";
        Print.prln(RegEx.splitCamelcase(text));
    }
}
