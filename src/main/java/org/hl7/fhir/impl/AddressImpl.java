/*
 * XML Type:  Address
 * Namespace: http://hl7.org/fhir
 * Java type: org.hl7.fhir.Address
 *
 * Automatically generated - do not modify.
 */
package org.hl7.fhir.impl;
/**
 * An XML Address(@http://hl7.org/fhir).
 *
 * This is a complex type.
 */
public class AddressImpl extends org.hl7.fhir.impl.ElementImpl implements org.hl7.fhir.Address
{
    private static final long serialVersionUID = 1L;
    
    public AddressImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName USE$0 = 
        new javax.xml.namespace.QName("http://hl7.org/fhir", "use");
    private static final javax.xml.namespace.QName TEXT$2 = 
        new javax.xml.namespace.QName("http://hl7.org/fhir", "text");
    private static final javax.xml.namespace.QName LINE$4 = 
        new javax.xml.namespace.QName("http://hl7.org/fhir", "line");
    private static final javax.xml.namespace.QName CITY$6 = 
        new javax.xml.namespace.QName("http://hl7.org/fhir", "city");
    private static final javax.xml.namespace.QName STATE$8 = 
        new javax.xml.namespace.QName("http://hl7.org/fhir", "state");
    private static final javax.xml.namespace.QName ZIP$10 = 
        new javax.xml.namespace.QName("http://hl7.org/fhir", "zip");
    private static final javax.xml.namespace.QName COUNTRY$12 = 
        new javax.xml.namespace.QName("http://hl7.org/fhir", "country");
    private static final javax.xml.namespace.QName PERIOD$14 = 
        new javax.xml.namespace.QName("http://hl7.org/fhir", "period");
    
    
    /**
     * Gets the "use" element
     */
    public org.hl7.fhir.AddressUse getUse()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.AddressUse target = null;
            target = (org.hl7.fhir.AddressUse)get_store().find_element_user(USE$0, 0);
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
            return get_store().count_elements(USE$0) != 0;
        }
    }
    
    /**
     * Sets the "use" element
     */
    public void setUse(org.hl7.fhir.AddressUse use)
    {
        generatedSetterHelperImpl(use, USE$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "use" element
     */
    public org.hl7.fhir.AddressUse addNewUse()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.AddressUse target = null;
            target = (org.hl7.fhir.AddressUse)get_store().add_element_user(USE$0);
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
            get_store().remove_element(USE$0, 0);
        }
    }
    
    /**
     * Gets the "text" element
     */
    public org.hl7.fhir.String getText()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.String target = null;
            target = (org.hl7.fhir.String)get_store().find_element_user(TEXT$2, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "text" element
     */
    public boolean isSetText()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(TEXT$2) != 0;
        }
    }
    
    /**
     * Sets the "text" element
     */
    public void setText(org.hl7.fhir.String text)
    {
        generatedSetterHelperImpl(text, TEXT$2, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "text" element
     */
    public org.hl7.fhir.String addNewText()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.String target = null;
            target = (org.hl7.fhir.String)get_store().add_element_user(TEXT$2);
            return target;
        }
    }
    
    /**
     * Unsets the "text" element
     */
    public void unsetText()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(TEXT$2, 0);
        }
    }
    
    /**
     * Gets array of all "line" elements
     */
    public org.hl7.fhir.String[] getLineArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(LINE$4, targetList);
            org.hl7.fhir.String[] result = new org.hl7.fhir.String[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "line" element
     */
    public org.hl7.fhir.String getLineArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.String target = null;
            target = (org.hl7.fhir.String)get_store().find_element_user(LINE$4, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "line" element
     */
    public int sizeOfLineArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(LINE$4);
        }
    }
    
    /**
     * Sets array of all "line" element  WARNING: This method is not atomicaly synchronized.
     */
    public void setLineArray(org.hl7.fhir.String[] lineArray)
    {
        check_orphaned();
        arraySetterHelper(lineArray, LINE$4);
    }
    
    /**
     * Sets ith "line" element
     */
    public void setLineArray(int i, org.hl7.fhir.String line)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.String target = null;
            target = (org.hl7.fhir.String)get_store().find_element_user(LINE$4, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(line);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "line" element
     */
    public org.hl7.fhir.String insertNewLine(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.String target = null;
            target = (org.hl7.fhir.String)get_store().insert_element_user(LINE$4, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "line" element
     */
    public org.hl7.fhir.String addNewLine()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.String target = null;
            target = (org.hl7.fhir.String)get_store().add_element_user(LINE$4);
            return target;
        }
    }
    
    /**
     * Removes the ith "line" element
     */
    public void removeLine(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(LINE$4, i);
        }
    }
    
    /**
     * Gets the "city" element
     */
    public org.hl7.fhir.String getCity()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.String target = null;
            target = (org.hl7.fhir.String)get_store().find_element_user(CITY$6, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "city" element
     */
    public boolean isSetCity()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(CITY$6) != 0;
        }
    }
    
    /**
     * Sets the "city" element
     */
    public void setCity(org.hl7.fhir.String city)
    {
        generatedSetterHelperImpl(city, CITY$6, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "city" element
     */
    public org.hl7.fhir.String addNewCity()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.String target = null;
            target = (org.hl7.fhir.String)get_store().add_element_user(CITY$6);
            return target;
        }
    }
    
    /**
     * Unsets the "city" element
     */
    public void unsetCity()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(CITY$6, 0);
        }
    }
    
    /**
     * Gets the "state" element
     */
    public org.hl7.fhir.String getState()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.String target = null;
            target = (org.hl7.fhir.String)get_store().find_element_user(STATE$8, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "state" element
     */
    public boolean isSetState()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(STATE$8) != 0;
        }
    }
    
    /**
     * Sets the "state" element
     */
    public void setState(org.hl7.fhir.String state)
    {
        generatedSetterHelperImpl(state, STATE$8, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "state" element
     */
    public org.hl7.fhir.String addNewState()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.String target = null;
            target = (org.hl7.fhir.String)get_store().add_element_user(STATE$8);
            return target;
        }
    }
    
    /**
     * Unsets the "state" element
     */
    public void unsetState()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(STATE$8, 0);
        }
    }
    
    /**
     * Gets the "zip" element
     */
    public org.hl7.fhir.String getZip()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.String target = null;
            target = (org.hl7.fhir.String)get_store().find_element_user(ZIP$10, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "zip" element
     */
    public boolean isSetZip()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(ZIP$10) != 0;
        }
    }
    
    /**
     * Sets the "zip" element
     */
    public void setZip(org.hl7.fhir.String zip)
    {
        generatedSetterHelperImpl(zip, ZIP$10, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "zip" element
     */
    public org.hl7.fhir.String addNewZip()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.String target = null;
            target = (org.hl7.fhir.String)get_store().add_element_user(ZIP$10);
            return target;
        }
    }
    
    /**
     * Unsets the "zip" element
     */
    public void unsetZip()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(ZIP$10, 0);
        }
    }
    
    /**
     * Gets the "country" element
     */
    public org.hl7.fhir.String getCountry()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.String target = null;
            target = (org.hl7.fhir.String)get_store().find_element_user(COUNTRY$12, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "country" element
     */
    public boolean isSetCountry()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(COUNTRY$12) != 0;
        }
    }
    
    /**
     * Sets the "country" element
     */
    public void setCountry(org.hl7.fhir.String country)
    {
        generatedSetterHelperImpl(country, COUNTRY$12, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "country" element
     */
    public org.hl7.fhir.String addNewCountry()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.String target = null;
            target = (org.hl7.fhir.String)get_store().add_element_user(COUNTRY$12);
            return target;
        }
    }
    
    /**
     * Unsets the "country" element
     */
    public void unsetCountry()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(COUNTRY$12, 0);
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
            target = (org.hl7.fhir.Period)get_store().find_element_user(PERIOD$14, 0);
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
            return get_store().count_elements(PERIOD$14) != 0;
        }
    }
    
    /**
     * Sets the "period" element
     */
    public void setPeriod(org.hl7.fhir.Period period)
    {
        generatedSetterHelperImpl(period, PERIOD$14, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
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
            target = (org.hl7.fhir.Period)get_store().add_element_user(PERIOD$14);
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
            get_store().remove_element(PERIOD$14, 0);
        }
    }
}
