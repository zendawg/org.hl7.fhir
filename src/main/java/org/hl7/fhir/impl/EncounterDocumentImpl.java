/*
 * An XML document type.
 * Localname: Encounter
 * Namespace: http://hl7.org/fhir
 * Java type: org.hl7.fhir.EncounterDocument
 *
 * Automatically generated - do not modify.
 */
package org.hl7.fhir.impl;
/**
 * A document containing one Encounter(@http://hl7.org/fhir) element.
 *
 * This is a complex type.
 */
public class EncounterDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.hl7.fhir.EncounterDocument
{
    private static final long serialVersionUID = 1L;
    
    public EncounterDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName ENCOUNTER$0 = 
        new javax.xml.namespace.QName("http://hl7.org/fhir", "Encounter");
    
    
    /**
     * Gets the "Encounter" element
     */
    public org.hl7.fhir.Encounter getEncounter()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.Encounter target = null;
            target = (org.hl7.fhir.Encounter)get_store().find_element_user(ENCOUNTER$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "Encounter" element
     */
    public void setEncounter(org.hl7.fhir.Encounter encounter)
    {
        generatedSetterHelperImpl(encounter, ENCOUNTER$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "Encounter" element
     */
    public org.hl7.fhir.Encounter addNewEncounter()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.Encounter target = null;
            target = (org.hl7.fhir.Encounter)get_store().add_element_user(ENCOUNTER$0);
            return target;
        }
    }
}
