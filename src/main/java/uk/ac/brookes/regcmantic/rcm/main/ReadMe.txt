----------------------------------
Document Structure Analysis Files
==========================================================================
1.eu5_multiple/pg_000.htm

2. feature_annotated_corpus.ser
        2.1 jape4html_v2/main.jape
        2.2 gazetteer_html/lists.def
3. feature_reader.ser
        3.1 recent_structures.txt

4. structure_predictor.ser
5. reg_xml.xml




----------------------------------
Entity Extraction Files 
==========================================================================
Pre (1) new_terms.txt
        (1.1) extracted_terms.txt
        (1.2) definition_terms.txt
        (1.3) general_stopwords.txt
        (1.4) ontoreg_stopwords.txt
Pre (2) ontology_concepts.lst (gazetteer_ont/)
        (2.1) ontoreg_stopwords.txt
        (2.2) general_stopwords.txt
1. FullStructuredRegulation.xml
        1.1 required_annotation_list.txt
2. entity_annotator_v3
        2.1 sentence/main.jape
        2.2 entity/main.jape
        2.3 gazetteer_general/lists.def
3. topic_list.ser
        3.1 (opt) reg_v2.xml
        3.2 required_annotation_list.txt
        3.3 topic_list.txt
        3.4 GATE related
            3.41 jape4xmlRegulation/main.jape
            3.42 jape4xmlRegulation2/main.jape
            3.43 gazetteer_general/lists.def
4. SemReg ontology





---------------------------------
Mapping Files
=========================================================================

Besides two ontologies (SemReg and OntoReg), the mapping process needs the following
files.

1. difference_table.xml

2. mapping_reg.xml
        2.1 Selected_RegList.txt
3. mapping_task.xml
        3.1 Selected_TaskList.txt

4. three_scores.xml

5. computed_mapping.txt
6. existing_mapping.txt

7. mapping_result.xml