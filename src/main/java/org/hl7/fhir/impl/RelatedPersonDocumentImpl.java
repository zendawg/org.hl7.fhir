/*
 * An XML document type.
 * Localname: RelatedPerson
 * Namespace: http://hl7.org/fhir
 * Java type: org.hl7.fhir.RelatedPersonDocument
 *
 * Automatically generated - do not modify.
 */
package org.hl7.fhir.impl;
/**
 * A document containing one RelatedPerson(@http://hl7.org/fhir) element.
 *
 * This is a complex type.
 */
public class RelatedPersonDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.hl7.fhir.RelatedPersonDocument
{
    private static final long serialVersionUID = 1L;
    
    public RelatedPersonDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName RELATEDPERSON$0 = 
        new javax.xml.namespace.QName("http://hl7.org/fhir", "RelatedPerson");
    
    
    /**
     * Gets the "RelatedPerson" element
     */
    public org.hl7.fhir.RelatedPerson getRelatedPerson()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.RelatedPerson target = null;
            target = (org.hl7.fhir.RelatedPerson)get_store().find_element_user(RELATEDPERSON$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "RelatedPerson" element
     */
    public void setRelatedPerson(org.hl7.fhir.RelatedPerson relatedPerson)
    {
        generatedSetterHelperImpl(relatedPerson, RELATEDPERSON$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "RelatedPerson" element
     */
    public org.hl7.fhir.RelatedPerson addNewRelatedPerson()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.RelatedPerson target = null;
            target = (org.hl7.fhir.RelatedPerson)get_store().add_element_user(RELATEDPERSON$0);
            return target;
        }
    }
}
