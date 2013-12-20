/*
 * XML Type:  Range
 * Namespace: http://hl7.org/fhir
 * Java type: org.hl7.fhir.Range
 *
 * Automatically generated - do not modify.
 */
package org.hl7.fhir.impl;
/**
 * An XML Range(@http://hl7.org/fhir).
 *
 * This is a complex type.
 */
public class RangeImpl extends org.hl7.fhir.impl.ElementImpl implements org.hl7.fhir.Range
{
    private static final long serialVersionUID = 1L;
    
    public RangeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName LOW$0 = 
        new javax.xml.namespace.QName("http://hl7.org/fhir", "low");
    private static final javax.xml.namespace.QName HIGH$2 = 
        new javax.xml.namespace.QName("http://hl7.org/fhir", "high");
    
    
    /**
     * Gets the "low" element
     */
    public org.hl7.fhir.Quantity getLow()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.Quantity target = null;
            target = (org.hl7.fhir.Quantity)get_store().find_element_user(LOW$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "low" element
     */
    public boolean isSetLow()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(LOW$0) != 0;
        }
    }
    
    /**
     * Sets the "low" element
     */
    public void setLow(org.hl7.fhir.Quantity low)
    {
        generatedSetterHelperImpl(low, LOW$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "low" element
     */
    public org.hl7.fhir.Quantity addNewLow()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.Quantity target = null;
            target = (org.hl7.fhir.Quantity)get_store().add_element_user(LOW$0);
            return target;
        }
    }
    
    /**
     * Unsets the "low" element
     */
    public void unsetLow()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(LOW$0, 0);
        }
    }
    
    /**
     * Gets the "high" element
     */
    public org.hl7.fhir.Quantity getHigh()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.Quantity target = null;
            target = (org.hl7.fhir.Quantity)get_store().find_element_user(HIGH$2, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "high" element
     */
    public boolean isSetHigh()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(HIGH$2) != 0;
        }
    }
    
    /**
     * Sets the "high" element
     */
    public void setHigh(org.hl7.fhir.Quantity high)
    {
        generatedSetterHelperImpl(high, HIGH$2, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "high" element
     */
    public org.hl7.fhir.Quantity addNewHigh()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.Quantity target = null;
            target = (org.hl7.fhir.Quantity)get_store().add_element_user(HIGH$2);
            return target;
        }
    }
    
    /**
     * Unsets the "high" element
     */
    public void unsetHigh()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(HIGH$2, 0);
        }
    }
}
