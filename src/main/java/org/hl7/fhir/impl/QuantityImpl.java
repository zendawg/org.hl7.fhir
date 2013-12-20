/*
 * XML Type:  Quantity
 * Namespace: http://hl7.org/fhir
 * Java type: org.hl7.fhir.Quantity
 *
 * Automatically generated - do not modify.
 */
package org.hl7.fhir.impl;
/**
 * An XML Quantity(@http://hl7.org/fhir).
 *
 * This is a complex type.
 */
public class QuantityImpl extends org.hl7.fhir.impl.ElementImpl implements org.hl7.fhir.Quantity
{
    private static final long serialVersionUID = 1L;
    
    public QuantityImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName VALUE$0 = 
        new javax.xml.namespace.QName("http://hl7.org/fhir", "value");
    private static final javax.xml.namespace.QName COMPARATOR$2 = 
        new javax.xml.namespace.QName("http://hl7.org/fhir", "comparator");
    private static final javax.xml.namespace.QName UNITS$4 = 
        new javax.xml.namespace.QName("http://hl7.org/fhir", "units");
    private static final javax.xml.namespace.QName SYSTEM$6 = 
        new javax.xml.namespace.QName("http://hl7.org/fhir", "system");
    private static final javax.xml.namespace.QName CODE$8 = 
        new javax.xml.namespace.QName("http://hl7.org/fhir", "code");
    
    
    /**
     * Gets the "value" element
     */
    public org.hl7.fhir.Decimal getValue()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.Decimal target = null;
            target = (org.hl7.fhir.Decimal)get_store().find_element_user(VALUE$0, 0);
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
            return get_store().count_elements(VALUE$0) != 0;
        }
    }
    
    /**
     * Sets the "value" element
     */
    public void setValue(org.hl7.fhir.Decimal value)
    {
        generatedSetterHelperImpl(value, VALUE$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "value" element
     */
    public org.hl7.fhir.Decimal addNewValue()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.Decimal target = null;
            target = (org.hl7.fhir.Decimal)get_store().add_element_user(VALUE$0);
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
            get_store().remove_element(VALUE$0, 0);
        }
    }
    
    /**
     * Gets the "comparator" element
     */
    public org.hl7.fhir.QuantityCompararator getComparator()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.QuantityCompararator target = null;
            target = (org.hl7.fhir.QuantityCompararator)get_store().find_element_user(COMPARATOR$2, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "comparator" element
     */
    public boolean isSetComparator()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(COMPARATOR$2) != 0;
        }
    }
    
    /**
     * Sets the "comparator" element
     */
    public void setComparator(org.hl7.fhir.QuantityCompararator comparator)
    {
        generatedSetterHelperImpl(comparator, COMPARATOR$2, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "comparator" element
     */
    public org.hl7.fhir.QuantityCompararator addNewComparator()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.QuantityCompararator target = null;
            target = (org.hl7.fhir.QuantityCompararator)get_store().add_element_user(COMPARATOR$2);
            return target;
        }
    }
    
    /**
     * Unsets the "comparator" element
     */
    public void unsetComparator()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(COMPARATOR$2, 0);
        }
    }
    
    /**
     * Gets the "units" element
     */
    public org.hl7.fhir.String getUnits()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.String target = null;
            target = (org.hl7.fhir.String)get_store().find_element_user(UNITS$4, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "units" element
     */
    public boolean isSetUnits()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(UNITS$4) != 0;
        }
    }
    
    /**
     * Sets the "units" element
     */
    public void setUnits(org.hl7.fhir.String units)
    {
        generatedSetterHelperImpl(units, UNITS$4, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "units" element
     */
    public org.hl7.fhir.String addNewUnits()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.String target = null;
            target = (org.hl7.fhir.String)get_store().add_element_user(UNITS$4);
            return target;
        }
    }
    
    /**
     * Unsets the "units" element
     */
    public void unsetUnits()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(UNITS$4, 0);
        }
    }
    
    /**
     * Gets the "system" element
     */
    public org.hl7.fhir.Uri getSystem()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.Uri target = null;
            target = (org.hl7.fhir.Uri)get_store().find_element_user(SYSTEM$6, 0);
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
            return get_store().count_elements(SYSTEM$6) != 0;
        }
    }
    
    /**
     * Sets the "system" element
     */
    public void setSystem(org.hl7.fhir.Uri system)
    {
        generatedSetterHelperImpl(system, SYSTEM$6, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "system" element
     */
    public org.hl7.fhir.Uri addNewSystem()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.Uri target = null;
            target = (org.hl7.fhir.Uri)get_store().add_element_user(SYSTEM$6);
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
            get_store().remove_element(SYSTEM$6, 0);
        }
    }
    
    /**
     * Gets the "code" element
     */
    public org.hl7.fhir.Code getCode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.Code target = null;
            target = (org.hl7.fhir.Code)get_store().find_element_user(CODE$8, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "code" element
     */
    public boolean isSetCode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(CODE$8) != 0;
        }
    }
    
    /**
     * Sets the "code" element
     */
    public void setCode(org.hl7.fhir.Code code)
    {
        generatedSetterHelperImpl(code, CODE$8, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "code" element
     */
    public org.hl7.fhir.Code addNewCode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.Code target = null;
            target = (org.hl7.fhir.Code)get_store().add_element_user(CODE$8);
            return target;
        }
    }
    
    /**
     * Unsets the "code" element
     */
    public void unsetCode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(CODE$8, 0);
        }
    }
}
