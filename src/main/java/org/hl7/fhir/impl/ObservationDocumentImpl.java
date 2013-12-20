/*
 * An XML document type.
 * Localname: Observation
 * Namespace: http://hl7.org/fhir
 * Java type: org.hl7.fhir.ObservationDocument
 *
 * Automatically generated - do not modify.
 */
package org.hl7.fhir.impl;
/**
 * A document containing one Observation(@http://hl7.org/fhir) element.
 *
 * This is a complex type.
 */
public class ObservationDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.hl7.fhir.ObservationDocument
{
    private static final long serialVersionUID = 1L;
    
    public ObservationDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName OBSERVATION$0 = 
        new javax.xml.namespace.QName("http://hl7.org/fhir", "Observation");
    
    
    /**
     * Gets the "Observation" element
     */
    public org.hl7.fhir.Observation getObservation()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.Observation target = null;
            target = (org.hl7.fhir.Observation)get_store().find_element_user(OBSERVATION$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "Observation" element
     */
    public void setObservation(org.hl7.fhir.Observation observation)
    {
        generatedSetterHelperImpl(observation, OBSERVATION$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "Observation" element
     */
    public org.hl7.fhir.Observation addNewObservation()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.Observation target = null;
            target = (org.hl7.fhir.Observation)get_store().add_element_user(OBSERVATION$0);
            return target;
        }
    }
}
