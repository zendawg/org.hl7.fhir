/*
 * An XML document type.
 * Localname: Other
 * Namespace: http://hl7.org/fhir
 * Java type: org.hl7.fhir.OtherDocument
 *
 * Automatically generated - do not modify.
 */
package org.hl7.fhir.impl;
/**
 * A document containing one Other(@http://hl7.org/fhir) element.
 *
 * This is a complex type.
 */
public class OtherDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.hl7.fhir.OtherDocument
{
    private static final long serialVersionUID = 1L;
    
    public OtherDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName OTHER$0 = 
        new javax.xml.namespace.QName("http://hl7.org/fhir", "Other");
    
    
    /**
     * Gets the "Other" element
     */
    public org.hl7.fhir.Other getOther()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.Other target = null;
            target = (org.hl7.fhir.Other)get_store().find_element_user(OTHER$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "Other" element
     */
    public void setOther(org.hl7.fhir.Other other)
    {
        generatedSetterHelperImpl(other, OTHER$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "Other" element
     */
    public org.hl7.fhir.Other addNewOther()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.Other target = null;
            target = (org.hl7.fhir.Other)get_store().add_element_user(OTHER$0);
            return target;
        }
    }
}
