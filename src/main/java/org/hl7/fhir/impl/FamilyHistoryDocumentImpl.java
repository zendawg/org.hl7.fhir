/*
 * An XML document type.
 * Localname: FamilyHistory
 * Namespace: http://hl7.org/fhir
 * Java type: org.hl7.fhir.FamilyHistoryDocument
 *
 * Automatically generated - do not modify.
 */
package org.hl7.fhir.impl;
/**
 * A document containing one FamilyHistory(@http://hl7.org/fhir) element.
 *
 * This is a complex type.
 */
public class FamilyHistoryDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.hl7.fhir.FamilyHistoryDocument
{
    private static final long serialVersionUID = 1L;
    
    public FamilyHistoryDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName FAMILYHISTORY$0 = 
        new javax.xml.namespace.QName("http://hl7.org/fhir", "FamilyHistory");
    
    
    /**
     * Gets the "FamilyHistory" element
     */
    public org.hl7.fhir.FamilyHistory getFamilyHistory()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.FamilyHistory target = null;
            target = (org.hl7.fhir.FamilyHistory)get_store().find_element_user(FAMILYHISTORY$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "FamilyHistory" element
     */
    public void setFamilyHistory(org.hl7.fhir.FamilyHistory familyHistory)
    {
        generatedSetterHelperImpl(familyHistory, FAMILYHISTORY$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "FamilyHistory" element
     */
    public org.hl7.fhir.FamilyHistory addNewFamilyHistory()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.FamilyHistory target = null;
            target = (org.hl7.fhir.FamilyHistory)get_store().add_element_user(FAMILYHISTORY$0);
            return target;
        }
    }
}
