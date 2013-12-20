/*
 * An XML document type.
 * Localname: Provenance
 * Namespace: http://hl7.org/fhir
 * Java type: org.hl7.fhir.ProvenanceDocument
 *
 * Automatically generated - do not modify.
 */
package org.hl7.fhir.impl;
/**
 * A document containing one Provenance(@http://hl7.org/fhir) element.
 *
 * This is a complex type.
 */
public class ProvenanceDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.hl7.fhir.ProvenanceDocument
{
    private static final long serialVersionUID = 1L;
    
    public ProvenanceDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName PROVENANCE$0 = 
        new javax.xml.namespace.QName("http://hl7.org/fhir", "Provenance");
    
    
    /**
     * Gets the "Provenance" element
     */
    public org.hl7.fhir.Provenance getProvenance()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.Provenance target = null;
            target = (org.hl7.fhir.Provenance)get_store().find_element_user(PROVENANCE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "Provenance" element
     */
    public void setProvenance(org.hl7.fhir.Provenance provenance)
    {
        generatedSetterHelperImpl(provenance, PROVENANCE$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "Provenance" element
     */
    public org.hl7.fhir.Provenance addNewProvenance()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.Provenance target = null;
            target = (org.hl7.fhir.Provenance)get_store().add_element_user(PROVENANCE$0);
            return target;
        }
    }
}
