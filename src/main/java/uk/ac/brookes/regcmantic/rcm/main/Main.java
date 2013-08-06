/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package uk.ac.brookes.regcmantic.rcm.main;

import uk.ac.brookes.regcmantic.rcm.phase1._1_FeatureAnnotator;
import uk.ac.brookes.regcmantic.rcm.phase1._2_FeatureReader;
import uk.ac.brookes.regcmantic.rcm.phase1._3_StructurePredictor;
import uk.ac.brookes.regcmantic.rcm.phase1._4_UIStyleSelector_V3;


/**
 *
 * @author Krishna Sapkota
// */
public class Main {
    //TODO check library if it is complete

 /**
     * @param args the command line arguments
     */
public static void main(String[] args)   {

/* ================== EXTRACTION STEPS (OLD, USE NEW ONE) ================== 
 *  Makesure, you read the ReadMe.txt file for the files used in this project.
 */

//                    new _1_FeatureAnnotator();
//                    new _2_FeatureReader();
//                    new _3_StructurePredictor();
                    new _4_UIStyleSelector_V3();
//             ======================================
//                    1. SemReg population
//                    new _1_EntityAnnotator_V3();
//                    new _2_EntityReader_V3();
//                    new _3_SemReg_V5_Populator();
//                    2. ontoReg population
//                    new SemToOnto();
//                    3. task annotation
//                    new TaskAnnotator();
//                    4. matching algorithm
//                    new MappingApplication().fillAllMatched();

/* ============================ MAPPING STEPS ================================  */

/*  1.  collects annotations of regulation and tasks.
        write() - interpretes the ontological concepts
        read() - reads the interpreted files */
//                  RegTaskCollector collecter = new RegTaskCollector();
//                  collecter.write();
//                  collecter.read();

/* 2. computes three scores */
//                  new ThreeScoresGenerator();

/* 3. computes aggregate score from three scoes */
//                  new MappingAlgorithms();

/* 4. collectors collect the existing and computed mappings to compare */
//                  new ExistingMappingCollector();
//                  new ComputedMappingCollector();

 /* 5. computes precision, recall and f-measure */
//                  new MappingResultProcessor();


/* ================== EXTRA TESTS =========================================== */
//                      new XmlWriter_1();
//                      new XmlWriter();
//                      new XmlTest();
//                    new Mapping_V2();
//                    new StyleExtractor_V3();
//                    new StructureReader().extract();
//                    new HelloPDFBox();
//                    new EntityReader_V2();
//                    new UIStyleSelector_V3();
//                    new WordNetTest();
//                    new RegulationToXml().extract();
//                    new MyReader();
//                    new MyWriter();
//                    new Splitter();
//                    new RegEx();
//
//    new zzz_MappingData().getDataArrays();
//new GUIMapping();
//        new SwixGUI();
//    new MapDetails();
//    new ComplianceChecker();
//   ResultData rd = new ResultData();
//   rd.readFile();
//   rd.writeFile();
//    new UIComplianceChecker1(); 
//    new OntoRegChecker(); // spin based
//    new OntoRegOrdering();
//        new api.ont.Tester();
//    new Cardinality();
//    new SwrlOwlJess();
//    new OntoReg().create();
//        new MappingToCsv();
//    new ExtractionToCsv();
//    new Explanations();
//  new  _1_MappingAlgorithm();
//    new Violation().readFile();
//    new IndividualViolation();
//    new RcmExtendedFrame();
//    String indName = "TankCleanTask101";
//    new UIViolationDetails(indName);
//    new ViolationCollector();
//    new HelloCssParser();
//    new StanfordParser(); 
//    new RegulationtSentenceReader();
//    new RefinedSentenceReader();
//    new Chunker();//  creates paresed chunk (small file)
//    new GazGenerator(); // creates gazetteers for the paresed sentences
//    new _0_OntoGazCreator();
//        new GazCreater();

//    new _Tester();
//    new api.wn._Tester();
//    new api.gt.SerialDatastoreIO();
//    new DatastoreReader();
//    new DifferenceTableCreator();
//  DifferenceTable table =  new DifferenceTable();
//  table.readFile();
//  double value = table.getDifference("Equipment", "name");
    
//  new RegEx();
//  ThreeScores ts =   new ThreeScores();
//  ts.read();
//  ts.generateMappingId();
//  ts.writeCsv();
    //    new MappingResultProcessorTunner();
//    new Similarity();
//  new MappingAlgorithmsTuner();

//    new rcm.main._Tester();

//    new HelloPDFBox();
//    new HtmlDisplay();
//new HelloJPedal();
//    new api.ont.Tester();//----------------------------------------------------------------------------------------
//    new api.wn.Tester();
//    new helper.gui.Tester();
//new SimilarityTest();
//   Print.prln(RegEx.removeOtherCharacters("Hero123Honda_MotorBike#2partner_name is HeroHonda againMine"));
//    Print.prln(new Thesaurus("time").toString());
//    new MappingAlgorithm();
//    new UIMappingSelector();
//    new MappingData().readFile();
//    new Topic();
//         new Test();
//     new NewJFrame().setVisible(true);
//         new UIMain();

//
//
//    new UINodeMatrixPanel(new JFrame());
//    new DOS();

    
    
    }


}
