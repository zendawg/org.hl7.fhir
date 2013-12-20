/*
 * An XML document type.
 * Localname: AllergyIntolerance
 * Namespace: http://hl7.org/fhir
 * Java type: org.hl7.fhir.AllergyIntoleranceDocument
 *
 * Automatically generated - do not modify.
 */
package org.hl7.fhir.impl;
/**
 * A document containing one AllergyIntolerance(@http://hl7.org/fhir) element.
 *
 * This is a complex type.
 */
public class AllergyIntoleranceDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.hl7.fhir.AllergyIntoleranceDocument
{
    private static final long serialVersionUID = 1L;
    
    public AllergyIntoleranceDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName ALLERGYINTOLERANCE$0 = 
        new javax.xml.namespace.QName("http://hl7.org/fhir", "AllergyIntolerance");
    
    
    /**
     * Gets the "AllergyIntolerance" element
     */
    public org.hl7.fhir.AllergyIntolerance getAllergyIntolerance()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.AllergyIntolerance target = null;
            target = (org.hl7.fhir.AllergyIntolerance)get_store().find_element_user(ALLERGYINTOLERANCE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "AllergyIntolerance" element
     */
    public void setAllergyIntolerance(org.hl7.fhir.AllergyIntolerance allergyIntolerance)
    {
        generatedSetterHelperImpl(allergyIntolerance, ALLERGYINTOLERANCE$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "AllergyIntolerance" element
     */
    public org.hl7.fhir.AllergyIntolerance addNewAllergyIntolerance()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.AllergyIntolerance target = null;
            target = (org.hl7.fhir.AllergyIntolerance)get_store().add_element_user(ALLERGYINTOLERANCE$0);
            return target;
        }
    }
}
