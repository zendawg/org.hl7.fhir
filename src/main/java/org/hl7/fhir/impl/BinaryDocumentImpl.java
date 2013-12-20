/*
 * An XML document type.
 * Localname: Binary
 * Namespace: http://hl7.org/fhir
 * Java type: org.hl7.fhir.BinaryDocument
 *
 * Automatically generated - do not modify.
 */
package org.hl7.fhir.impl;
/**
 * A document containing one Binary(@http://hl7.org/fhir) element.
 *
 * This is a complex type.
 */
public class BinaryDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.hl7.fhir.BinaryDocument
{
    private static final long serialVersionUID = 1L;
    
    public BinaryDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName BINARY$0 = 
        new javax.xml.namespace.QName("http://hl7.org/fhir", "Binary");
    
    
    /**
     * Gets the "Binary" element
     */
    public org.hl7.fhir.Binary getBinary()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.Binary target = null;
            target = (org.hl7.fhir.Binary)get_store().find_element_user(BINARY$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "Binary" element
     */
    public void setBinary(org.hl7.fhir.Binary binary)
    {
        generatedSetterHelperImpl(binary, BINARY$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "Binary" element
     */
    public org.hl7.fhir.Binary addNewBinary()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.Binary target = null;
            target = (org.hl7.fhir.Binary)get_store().add_element_user(BINARY$0);
            return target;
        }
    }
}
