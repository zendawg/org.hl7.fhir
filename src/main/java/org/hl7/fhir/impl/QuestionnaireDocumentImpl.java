/*
 * An XML document type.
 * Localname: Questionnaire
 * Namespace: http://hl7.org/fhir
 * Java type: org.hl7.fhir.QuestionnaireDocument
 *
 * Automatically generated - do not modify.
 */
package org.hl7.fhir.impl;
/**
 * A document containing one Questionnaire(@http://hl7.org/fhir) element.
 *
 * This is a complex type.
 */
public class QuestionnaireDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.hl7.fhir.QuestionnaireDocument
{
    private static final long serialVersionUID = 1L;
    
    public QuestionnaireDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName QUESTIONNAIRE$0 = 
        new javax.xml.namespace.QName("http://hl7.org/fhir", "Questionnaire");
    
    
    /**
     * Gets the "Questionnaire" element
     */
    public org.hl7.fhir.Questionnaire getQuestionnaire()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.Questionnaire target = null;
            target = (org.hl7.fhir.Questionnaire)get_store().find_element_user(QUESTIONNAIRE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "Questionnaire" element
     */
    public void setQuestionnaire(org.hl7.fhir.Questionnaire questionnaire)
    {
        generatedSetterHelperImpl(questionnaire, QUESTIONNAIRE$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "Questionnaire" element
     */
    public org.hl7.fhir.Questionnaire addNewQuestionnaire()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.Questionnaire target = null;
            target = (org.hl7.fhir.Questionnaire)get_store().add_element_user(QUESTIONNAIRE$0);
            return target;
        }
    }
}
