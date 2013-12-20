/*
 * XML Type:  Conformance.Certificate
 * Namespace: http://hl7.org/fhir
 * Java type: org.hl7.fhir.ConformanceCertificate
 *
 * Automatically generated - do not modify.
 */
package org.hl7.fhir.impl;
/**
 * An XML Conformance.Certificate(@http://hl7.org/fhir).
 *
 * This is a complex type.
 */
public class ConformanceCertificateImpl extends org.hl7.fhir.impl.BackboneElementImpl implements org.hl7.fhir.ConformanceCertificate
{
    private static final long serialVersionUID = 1L;
    
    public ConformanceCertificateImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName TYPE$0 = 
        new javax.xml.namespace.QName("http://hl7.org/fhir", "type");
    private static final javax.xml.namespace.QName BLOB$2 = 
        new javax.xml.namespace.QName("http://hl7.org/fhir", "blob");
    
    
    /**
     * Gets the "type" element
     */
    public org.hl7.fhir.Code getType()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.Code target = null;
            target = (org.hl7.fhir.Code)get_store().find_element_user(TYPE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "type" element
     */
    public boolean isSetType()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(TYPE$0) != 0;
        }
    }
    
    /**
     * Sets the "type" element
     */
    public void setType(org.hl7.fhir.Code type)
    {
        generatedSetterHelperImpl(type, TYPE$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "type" element
     */
    public org.hl7.fhir.Code addNewType()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.Code target = null;
            target = (org.hl7.fhir.Code)get_store().add_element_user(TYPE$0);
            return target;
        }
    }
    
    /**
     * Unsets the "type" element
     */
    public void unsetType()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(TYPE$0, 0);
        }
    }
    
    /**
     * Gets the "blob" element
     */
    public org.hl7.fhir.Base64Binary getBlob()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.Base64Binary target = null;
            target = (org.hl7.fhir.Base64Binary)get_store().find_element_user(BLOB$2, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "blob" element
     */
    public boolean isSetBlob()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(BLOB$2) != 0;
        }
    }
    
    /**
     * Sets the "blob" element
     */
    public void setBlob(org.hl7.fhir.Base64Binary blob)
    {
        generatedSetterHelperImpl(blob, BLOB$2, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "blob" element
     */
    public org.hl7.fhir.Base64Binary addNewBlob()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.Base64Binary target = null;
            target = (org.hl7.fhir.Base64Binary)get_store().add_element_user(BLOB$2);
            return target;
        }
    }
    
    /**
     * Unsets the "blob" element
     */
    public void unsetBlob()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(BLOB$2, 0);
        }
    }
}
