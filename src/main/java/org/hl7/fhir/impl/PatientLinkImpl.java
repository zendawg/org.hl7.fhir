/*
 * XML Type:  Patient.Link
 * Namespace: http://hl7.org/fhir
 * Java type: org.hl7.fhir.PatientLink
 *
 * Automatically generated - do not modify.
 */
package org.hl7.fhir.impl;
/**
 * An XML Patient.Link(@http://hl7.org/fhir).
 *
 * This is a complex type.
 */
public class PatientLinkImpl extends org.hl7.fhir.impl.BackboneElementImpl implements org.hl7.fhir.PatientLink
{
    private static final long serialVersionUID = 1L;
    
    public PatientLinkImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName OTHER$0 = 
        new javax.xml.namespace.QName("http://hl7.org/fhir", "other");
    private static final javax.xml.namespace.QName TYPE$2 = 
        new javax.xml.namespace.QName("http://hl7.org/fhir", "type");
    
    
    /**
     * Gets the "other" element
     */
    public org.hl7.fhir.ResourceReference getOther()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.ResourceReference target = null;
            target = (org.hl7.fhir.ResourceReference)get_store().find_element_user(OTHER$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "other" element
     */
    public void setOther(org.hl7.fhir.ResourceReference other)
    {
        generatedSetterHelperImpl(other, OTHER$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "other" element
     */
    public org.hl7.fhir.ResourceReference addNewOther()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.ResourceReference target = null;
            target = (org.hl7.fhir.ResourceReference)get_store().add_element_user(OTHER$0);
            return target;
        }
    }
    
    /**
     * Gets the "type" element
     */
    public org.hl7.fhir.LinkType getType()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.LinkType target = null;
            target = (org.hl7.fhir.LinkType)get_store().find_element_user(TYPE$2, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "type" element
     */
    public void setType(org.hl7.fhir.LinkType type)
    {
        generatedSetterHelperImpl(type, TYPE$2, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "type" element
     */
    public org.hl7.fhir.LinkType addNewType()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.LinkType target = null;
            target = (org.hl7.fhir.LinkType)get_store().add_element_user(TYPE$2);
            return target;
        }
    }
}
