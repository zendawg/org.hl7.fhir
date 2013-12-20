/*
 * An XML document type.
 * Localname: ImmunizationRecommendation
 * Namespace: http://hl7.org/fhir
 * Java type: org.hl7.fhir.ImmunizationRecommendationDocument
 *
 * Automatically generated - do not modify.
 */
package org.hl7.fhir.impl;
/**
 * A document containing one ImmunizationRecommendation(@http://hl7.org/fhir) element.
 *
 * This is a complex type.
 */
public class ImmunizationRecommendationDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.hl7.fhir.ImmunizationRecommendationDocument
{
    private static final long serialVersionUID = 1L;
    
    public ImmunizationRecommendationDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName IMMUNIZATIONRECOMMENDATION$0 = 
        new javax.xml.namespace.QName("http://hl7.org/fhir", "ImmunizationRecommendation");
    
    
    /**
     * Gets the "ImmunizationRecommendation" element
     */
    public org.hl7.fhir.ImmunizationRecommendation getImmunizationRecommendation()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.ImmunizationRecommendation target = null;
            target = (org.hl7.fhir.ImmunizationRecommendation)get_store().find_element_user(IMMUNIZATIONRECOMMENDATION$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "ImmunizationRecommendation" element
     */
    public void setImmunizationRecommendation(org.hl7.fhir.ImmunizationRecommendation immunizationRecommendation)
    {
        generatedSetterHelperImpl(immunizationRecommendation, IMMUNIZATIONRECOMMENDATION$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "ImmunizationRecommendation" element
     */
    public org.hl7.fhir.ImmunizationRecommendation addNewImmunizationRecommendation()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.ImmunizationRecommendation target = null;
            target = (org.hl7.fhir.ImmunizationRecommendation)get_store().add_element_user(IMMUNIZATIONRECOMMENDATION$0);
            return target;
        }
    }
}
