/*
 * XML Type:  Ratio
 * Namespace: http://hl7.org/fhir
 * Java type: org.hl7.fhir.Ratio
 *
 * Automatically generated - do not modify.
 */
package org.hl7.fhir.impl;
/**
 * An XML Ratio(@http://hl7.org/fhir).
 *
 * This is a complex type.
 */
public class RatioImpl extends org.hl7.fhir.impl.ElementImpl implements org.hl7.fhir.Ratio
{
    private static final long serialVersionUID = 1L;
    
    public RatioImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName NUMERATOR$0 = 
        new javax.xml.namespace.QName("http://hl7.org/fhir", "numerator");
    private static final javax.xml.namespace.QName DENOMINATOR$2 = 
        new javax.xml.namespace.QName("http://hl7.org/fhir", "denominator");
    
    
    /**
     * Gets the "numerator" element
     */
    public org.hl7.fhir.Quantity getNumerator()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.Quantity target = null;
            target = (org.hl7.fhir.Quantity)get_store().find_element_user(NUMERATOR$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "numerator" element
     */
    public boolean isSetNumerator()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(NUMERATOR$0) != 0;
        }
    }
    
    /**
     * Sets the "numerator" element
     */
    public void setNumerator(org.hl7.fhir.Quantity numerator)
    {
        generatedSetterHelperImpl(numerator, NUMERATOR$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "numerator" element
     */
    public org.hl7.fhir.Quantity addNewNumerator()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.Quantity target = null;
            target = (org.hl7.fhir.Quantity)get_store().add_element_user(NUMERATOR$0);
            return target;
        }
    }
    
    /**
     * Unsets the "numerator" element
     */
    public void unsetNumerator()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(NUMERATOR$0, 0);
        }
    }
    
    /**
     * Gets the "denominator" element
     */
    public org.hl7.fhir.Quantity getDenominator()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.Quantity target = null;
            target = (org.hl7.fhir.Quantity)get_store().find_element_user(DENOMINATOR$2, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "denominator" element
     */
    public boolean isSetDenominator()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(DENOMINATOR$2) != 0;
        }
    }
    
    /**
     * Sets the "denominator" element
     */
    public void setDenominator(org.hl7.fhir.Quantity denominator)
    {
        generatedSetterHelperImpl(denominator, DENOMINATOR$2, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "denominator" element
     */
    public org.hl7.fhir.Quantity addNewDenominator()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.Quantity target = null;
            target = (org.hl7.fhir.Quantity)get_store().add_element_user(DENOMINATOR$2);
            return target;
        }
    }
    
    /**
     * Unsets the "denominator" element
     */
    public void unsetDenominator()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(DENOMINATOR$2, 0);
        }
    }
}
