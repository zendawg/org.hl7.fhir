/*
 * XML Type:  uuid
 * Namespace: http://hl7.org/fhir
 * Java type: org.hl7.fhir.Uuid
 *
 * Automatically generated - do not modify.
 */
package org.hl7.fhir.impl;
/**
 * An XML uuid(@http://hl7.org/fhir).
 *
 * This is a complex type.
 */
public class UuidImpl extends org.hl7.fhir.impl.ElementImpl implements org.hl7.fhir.Uuid
{
    private static final long serialVersionUID = 1L;
    
    public UuidImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName VALUE$0 = 
        new javax.xml.namespace.QName("", "value");
    
    
    /**
     * Gets the "value" attribute
     */
    public java.lang.String getValue()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(VALUE$0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "value" attribute
     */
    public org.hl7.fhir.UuidPrimitive xgetValue()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.UuidPrimitive target = null;
            target = (org.hl7.fhir.UuidPrimitive)get_store().find_attribute_user(VALUE$0);
            return target;
        }
    }
    
    /**
     * True if has "value" attribute
     */
    public boolean isSetValue()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(VALUE$0) != null;
        }
    }
    
    /**
     * Sets the "value" attribute
     */
    public void setValue(java.lang.String value)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(VALUE$0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(VALUE$0);
            }
            target.setStringValue(value);
        }
    }
    
    /**
     * Sets (as xml) the "value" attribute
     */
    public void xsetValue(org.hl7.fhir.UuidPrimitive value)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.UuidPrimitive target = null;
            target = (org.hl7.fhir.UuidPrimitive)get_store().find_attribute_user(VALUE$0);
            if (target == null)
            {
                target = (org.hl7.fhir.UuidPrimitive)get_store().add_attribute_user(VALUE$0);
            }
            target.set(value);
        }
    }
    
    /**
     * Unsets the "value" attribute
     */
    public void unsetValue()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(VALUE$0);
        }
    }
}
