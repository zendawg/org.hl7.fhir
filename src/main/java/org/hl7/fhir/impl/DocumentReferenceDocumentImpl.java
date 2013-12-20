/*
 * An XML document type.
 * Localname: DocumentReference
 * Namespace: http://hl7.org/fhir
 * Java type: org.hl7.fhir.DocumentReferenceDocument
 *
 * Automatically generated - do not modify.
 */
package org.hl7.fhir.impl;
/**
 * A document containing one DocumentReference(@http://hl7.org/fhir) element.
 *
 * This is a complex type.
 */
public class DocumentReferenceDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.hl7.fhir.DocumentReferenceDocument
{
    private static final long serialVersionUID = 1L;
    
    public DocumentReferenceDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName DOCUMENTREFERENCE$0 = 
        new javax.xml.namespace.QName("http://hl7.org/fhir", "DocumentReference");
    
    
    /**
     * Gets the "DocumentReference" element
     */
    public org.hl7.fhir.DocumentReference getDocumentReference()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.DocumentReference target = null;
            target = (org.hl7.fhir.DocumentReference)get_store().find_element_user(DOCUMENTREFERENCE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "DocumentReference" element
     */
    public void setDocumentReference(org.hl7.fhir.DocumentReference documentReference)
    {
        generatedSetterHelperImpl(documentReference, DOCUMENTREFERENCE$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "DocumentReference" element
     */
    public org.hl7.fhir.DocumentReference addNewDocumentReference()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.DocumentReference target = null;
            target = (org.hl7.fhir.DocumentReference)get_store().add_element_user(DOCUMENTREFERENCE$0);
            return target;
        }
    }
}
