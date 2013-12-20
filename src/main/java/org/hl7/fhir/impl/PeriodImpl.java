/*
 * XML Type:  Period
 * Namespace: http://hl7.org/fhir
 * Java type: org.hl7.fhir.Period
 *
 * Automatically generated - do not modify.
 */
package org.hl7.fhir.impl;
/**
 * An XML Period(@http://hl7.org/fhir).
 *
 * This is a complex type.
 */
public class PeriodImpl extends org.hl7.fhir.impl.ElementImpl implements org.hl7.fhir.Period
{
    private static final long serialVersionUID = 1L;
    
    public PeriodImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName START$0 = 
        new javax.xml.namespace.QName("http://hl7.org/fhir", "start");
    private static final javax.xml.namespace.QName END$2 = 
        new javax.xml.namespace.QName("http://hl7.org/fhir", "end");
    
    
    /**
     * Gets the "start" element
     */
    public org.hl7.fhir.DateTime getStart()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.DateTime target = null;
            target = (org.hl7.fhir.DateTime)get_store().find_element_user(START$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "start" element
     */
    public boolean isSetStart()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(START$0) != 0;
        }
    }
    
    /**
     * Sets the "start" element
     */
    public void setStart(org.hl7.fhir.DateTime start)
    {
        generatedSetterHelperImpl(start, START$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "start" element
     */
    public org.hl7.fhir.DateTime addNewStart()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.DateTime target = null;
            target = (org.hl7.fhir.DateTime)get_store().add_element_user(START$0);
            return target;
        }
    }
    
    /**
     * Unsets the "start" element
     */
    public void unsetStart()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(START$0, 0);
        }
    }
    
    /**
     * Gets the "end" element
     */
    public org.hl7.fhir.DateTime getEnd()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.DateTime target = null;
            target = (org.hl7.fhir.DateTime)get_store().find_element_user(END$2, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "end" element
     */
    public boolean isSetEnd()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(END$2) != 0;
        }
    }
    
    /**
     * Sets the "end" element
     */
    public void setEnd(org.hl7.fhir.DateTime end)
    {
        generatedSetterHelperImpl(end, END$2, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "end" element
     */
    public org.hl7.fhir.DateTime addNewEnd()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.DateTime target = null;
            target = (org.hl7.fhir.DateTime)get_store().add_element_user(END$2);
            return target;
        }
    }
    
    /**
     * Unsets the "end" element
     */
    public void unsetEnd()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(END$2, 0);
        }
    }
}
