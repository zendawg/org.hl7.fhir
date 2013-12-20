/*
 * XML Type:  Schedule.Repeat
 * Namespace: http://hl7.org/fhir
 * Java type: org.hl7.fhir.ScheduleRepeat
 *
 * Automatically generated - do not modify.
 */
package org.hl7.fhir.impl;
/**
 * An XML Schedule.Repeat(@http://hl7.org/fhir).
 *
 * This is a complex type.
 */
public class ScheduleRepeatImpl extends org.hl7.fhir.impl.ElementImpl implements org.hl7.fhir.ScheduleRepeat
{
    private static final long serialVersionUID = 1L;
    
    public ScheduleRepeatImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName FREQUENCY$0 = 
        new javax.xml.namespace.QName("http://hl7.org/fhir", "frequency");
    private static final javax.xml.namespace.QName WHEN$2 = 
        new javax.xml.namespace.QName("http://hl7.org/fhir", "when");
    private static final javax.xml.namespace.QName DURATION$4 = 
        new javax.xml.namespace.QName("http://hl7.org/fhir", "duration");
    private static final javax.xml.namespace.QName UNITS$6 = 
        new javax.xml.namespace.QName("http://hl7.org/fhir", "units");
    private static final javax.xml.namespace.QName COUNT$8 = 
        new javax.xml.namespace.QName("http://hl7.org/fhir", "count");
    private static final javax.xml.namespace.QName END$10 = 
        new javax.xml.namespace.QName("http://hl7.org/fhir", "end");
    
    
    /**
     * Gets the "frequency" element
     */
    public org.hl7.fhir.Integer getFrequency()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.Integer target = null;
            target = (org.hl7.fhir.Integer)get_store().find_element_user(FREQUENCY$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "frequency" element
     */
    public boolean isSetFrequency()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(FREQUENCY$0) != 0;
        }
    }
    
    /**
     * Sets the "frequency" element
     */
    public void setFrequency(org.hl7.fhir.Integer frequency)
    {
        generatedSetterHelperImpl(frequency, FREQUENCY$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "frequency" element
     */
    public org.hl7.fhir.Integer addNewFrequency()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.Integer target = null;
            target = (org.hl7.fhir.Integer)get_store().add_element_user(FREQUENCY$0);
            return target;
        }
    }
    
    /**
     * Unsets the "frequency" element
     */
    public void unsetFrequency()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(FREQUENCY$0, 0);
        }
    }
    
    /**
     * Gets the "when" element
     */
    public org.hl7.fhir.EventTiming getWhen()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.EventTiming target = null;
            target = (org.hl7.fhir.EventTiming)get_store().find_element_user(WHEN$2, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "when" element
     */
    public boolean isSetWhen()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(WHEN$2) != 0;
        }
    }
    
    /**
     * Sets the "when" element
     */
    public void setWhen(org.hl7.fhir.EventTiming when)
    {
        generatedSetterHelperImpl(when, WHEN$2, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "when" element
     */
    public org.hl7.fhir.EventTiming addNewWhen()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.EventTiming target = null;
            target = (org.hl7.fhir.EventTiming)get_store().add_element_user(WHEN$2);
            return target;
        }
    }
    
    /**
     * Unsets the "when" element
     */
    public void unsetWhen()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(WHEN$2, 0);
        }
    }
    
    /**
     * Gets the "duration" element
     */
    public org.hl7.fhir.Decimal getDuration()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.Decimal target = null;
            target = (org.hl7.fhir.Decimal)get_store().find_element_user(DURATION$4, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "duration" element
     */
    public void setDuration(org.hl7.fhir.Decimal duration)
    {
        generatedSetterHelperImpl(duration, DURATION$4, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "duration" element
     */
    public org.hl7.fhir.Decimal addNewDuration()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.Decimal target = null;
            target = (org.hl7.fhir.Decimal)get_store().add_element_user(DURATION$4);
            return target;
        }
    }
    
    /**
     * Gets the "units" element
     */
    public org.hl7.fhir.UnitsOfTime getUnits()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.UnitsOfTime target = null;
            target = (org.hl7.fhir.UnitsOfTime)get_store().find_element_user(UNITS$6, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "units" element
     */
    public void setUnits(org.hl7.fhir.UnitsOfTime units)
    {
        generatedSetterHelperImpl(units, UNITS$6, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "units" element
     */
    public org.hl7.fhir.UnitsOfTime addNewUnits()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.UnitsOfTime target = null;
            target = (org.hl7.fhir.UnitsOfTime)get_store().add_element_user(UNITS$6);
            return target;
        }
    }
    
    /**
     * Gets the "count" element
     */
    public org.hl7.fhir.Integer getCount()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.Integer target = null;
            target = (org.hl7.fhir.Integer)get_store().find_element_user(COUNT$8, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "count" element
     */
    public boolean isSetCount()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(COUNT$8) != 0;
        }
    }
    
    /**
     * Sets the "count" element
     */
    public void setCount(org.hl7.fhir.Integer count)
    {
        generatedSetterHelperImpl(count, COUNT$8, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "count" element
     */
    public org.hl7.fhir.Integer addNewCount()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.Integer target = null;
            target = (org.hl7.fhir.Integer)get_store().add_element_user(COUNT$8);
            return target;
        }
    }
    
    /**
     * Unsets the "count" element
     */
    public void unsetCount()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(COUNT$8, 0);
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
            target = (org.hl7.fhir.DateTime)get_store().find_element_user(END$10, 0);
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
            return get_store().count_elements(END$10) != 0;
        }
    }
    
    /**
     * Sets the "end" element
     */
    public void setEnd(org.hl7.fhir.DateTime end)
    {
        generatedSetterHelperImpl(end, END$10, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
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
            target = (org.hl7.fhir.DateTime)get_store().add_element_user(END$10);
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
            get_store().remove_element(END$10, 0);
        }
    }
}
