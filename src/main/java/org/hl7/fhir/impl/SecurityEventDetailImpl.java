/*
 * XML Type:  SecurityEvent.Detail
 * Namespace: http://hl7.org/fhir
 * Java type: org.hl7.fhir.SecurityEventDetail
 *
 * Automatically generated - do not modify.
 */
package org.hl7.fhir.impl;
/**
 * An XML SecurityEvent.Detail(@http://hl7.org/fhir).
 *
 * This is a complex type.
 */
public class SecurityEventDetailImpl extends org.hl7.fhir.impl.BackboneElementImpl implements org.hl7.fhir.SecurityEventDetail
{
    private static final long serialVersionUID = 1L;
    
    public SecurityEventDetailImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName TYPE$0 = 
        new javax.xml.namespace.QName("http://hl7.org/fhir", "type");
    private static final javax.xml.namespace.QName VALUE$2 = 
        new javax.xml.namespace.QName("http://hl7.org/fhir", "value");
    
    
    /**
     * Gets the "type" element
     */
    public org.hl7.fhir.String getType()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.String target = null;
            target = (org.hl7.fhir.String)get_store().find_element_user(TYPE$0, 0);
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
    public void setType(org.hl7.fhir.String type)
    {
        generatedSetterHelperImpl(type, TYPE$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "type" element
     */
    public org.hl7.fhir.String addNewType()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.String target = null;
            target = (org.hl7.fhir.String)get_store().add_element_user(TYPE$0);
            return target;
        }
    }
    
    /**
     * Gets the "value" element
     */
    public org.hl7.fhir.Base64Binary getValue()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.Base64Binary target = null;
            target = (org.hl7.fhir.Base64Binary)get_store().find_element_user(VALUE$2, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "value" element
     */
    public void setValue(org.hl7.fhir.Base64Binary value)
    {
        generatedSetterHelperImpl(value, VALUE$2, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "value" element
     */
    public org.hl7.fhir.Base64Binary addNewValue()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.Base64Binary target = null;
            target = (org.hl7.fhir.Base64Binary)get_store().add_element_user(VALUE$2);
            return target;
        }
    }
}
