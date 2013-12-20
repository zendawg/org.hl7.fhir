/*
 * An XML document type.
 * Localname: Organization
 * Namespace: http://hl7.org/fhir
 * Java type: org.hl7.fhir.OrganizationDocument
 *
 * Automatically generated - do not modify.
 */
package org.hl7.fhir.impl;
/**
 * A document containing one Organization(@http://hl7.org/fhir) element.
 *
 * This is a complex type.
 */
public class OrganizationDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.hl7.fhir.OrganizationDocument
{
    private static final long serialVersionUID = 1L;
    
    public OrganizationDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName ORGANIZATION$0 = 
        new javax.xml.namespace.QName("http://hl7.org/fhir", "Organization");
    
    
    /**
     * Gets the "Organization" element
     */
    public org.hl7.fhir.Organization getOrganization()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.Organization target = null;
            target = (org.hl7.fhir.Organization)get_store().find_element_user(ORGANIZATION$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "Organization" element
     */
    public void setOrganization(org.hl7.fhir.Organization organization)
    {
        generatedSetterHelperImpl(organization, ORGANIZATION$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "Organization" element
     */
    public org.hl7.fhir.Organization addNewOrganization()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.Organization target = null;
            target = (org.hl7.fhir.Organization)get_store().add_element_user(ORGANIZATION$0);
            return target;
        }
    }
}
