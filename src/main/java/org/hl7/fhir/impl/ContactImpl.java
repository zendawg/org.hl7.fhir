/*
 * XML Type:  Contact
 * Namespace: http://hl7.org/fhir
 * Java type: org.hl7.fhir.Contact
 *
 * Automatically generated - do not modify.
 */
package org.hl7.fhir.impl;
/**
 * An XML Contact(@http://hl7.org/fhir).
 *
 * This is a complex type.
 */
public class ContactImpl extends org.hl7.fhir.impl.ElementImpl implements org.hl7.fhir.Contact
{
    private static final long serialVersionUID = 1L;
    
    public ContactImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName SYSTEM$0 = 
        new javax.xml.namespace.QName("http://hl7.org/fhir", "system");
    private static final javax.xml.namespace.QName VALUE$2 = 
        new javax.xml.namespace.QName("http://hl7.org/fhir", "value");
    private static final javax.xml.namespace.QName USE$4 = 
        new javax.xml.namespace.QName("http://hl7.org/fhir", "use");
    private static final javax.xml.namespace.QName PERIOD$6 = 
        new javax.xml.namespace.QName("http://hl7.org/fhir", "period");
    
    
    /**
     * Gets the "system" element
     */
    public org.hl7.fhir.ContactSystem getSystem()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.ContactSystem target = null;
            target = (org.hl7.fhir.ContactSystem)get_store().find_element_user(SYSTEM$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "system" element
     */
    public boolean isSetSystem()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(SYSTEM$0) != 0;
        }
    }
    
    /**
     * Sets the "system" element
     */
    public void setSystem(org.hl7.fhir.ContactSystem system)
    {
        generatedSetterHelperImpl(system, SYSTEM$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "system" element
     */
    public org.hl7.fhir.ContactSystem addNewSystem()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.ContactSystem target = null;
            target = (org.hl7.fhir.ContactSystem)get_store().add_element_user(SYSTEM$0);
            return target;
        }
    }
    
    /**
     * Unsets the "system" element
     */
    public void unsetSystem()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(SYSTEM$0, 0);
        }
    }
    
    /**
     * Gets the "value" element
     */
    public org.hl7.fhir.String getValue()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.String target = null;
            target = (org.hl7.fhir.String)get_store().find_element_user(VALUE$2, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "value" element
     */
    public boolean isSetValue()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(VALUE$2) != 0;
        }
    }
    
    /**
     * Sets the "value" element
     */
    public void setValue(org.hl7.fhir.String value)
    {
        generatedSetterHelperImpl(value, VALUE$2, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "value" element
     */
    public org.hl7.fhir.String addNewValue()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.String target = null;
            target = (org.hl7.fhir.String)get_store().add_element_user(VALUE$2);
            return target;
        }
    }
    
    /**
     * Unsets the "value" element
     */
    public void unsetValue()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(VALUE$2, 0);
        }
    }
    
    /**
     * Gets the "use" element
     */
    public org.hl7.fhir.ContactUse getUse()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.ContactUse target = null;
            target = (org.hl7.fhir.ContactUse)get_store().find_element_user(USE$4, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "use" element
     */
    public boolean isSetUse()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(USE$4) != 0;
        }
    }
    
    /**
     * Sets the "use" element
     */
    public void setUse(org.hl7.fhir.ContactUse use)
    {
        generatedSetterHelperImpl(use, USE$4, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "use" element
     */
    public org.hl7.fhir.ContactUse addNewUse()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.ContactUse target = null;
            target = (org.hl7.fhir.ContactUse)get_store().add_element_user(USE$4);
            return target;
        }
    }
    
    /**
     * Unsets the "use" element
     */
    public void unsetUse()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(USE$4, 0);
        }
    }
    
    /**
     * Gets the "period" element
     */
    public org.hl7.fhir.Period getPeriod()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.Period target = null;
            target = (org.hl7.fhir.Period)get_store().find_element_user(PERIOD$6, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "period" element
     */
    public boolean isSetPeriod()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(PERIOD$6) != 0;
        }
    }
    
    /**
     * Sets the "period" element
     */
    public void setPeriod(org.hl7.fhir.Period period)
    {
        generatedSetterHelperImpl(period, PERIOD$6, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "period" element
     */
    public org.hl7.fhir.Period addNewPeriod()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.Period target = null;
            target = (org.hl7.fhir.Period)get_store().add_element_user(PERIOD$6);
            return target;
        }
    }
    
    /**
     * Unsets the "period" element
     */
    public void unsetPeriod()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(PERIOD$6, 0);
        }
    }
}
