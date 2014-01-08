/*
 * XML Type:  SampledData
 * Namespace: http://hl7.org/fhir
 * Java type: org.hl7.fhir.SampledData
 *
 * Automatically generated - do not modify.
 */
package org.hl7.fhir.impl;
/**
 * An XML SampledData(@http://hl7.org/fhir).
 *
 * This is a complex type.
 */
public class SampledDataImpl extends org.hl7.fhir.impl.ElementImpl implements org.hl7.fhir.SampledData
{
    private static final long serialVersionUID = 1L;
    
    public SampledDataImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName ORIGIN$0 = 
        new javax.xml.namespace.QName("http://hl7.org/fhir", "origin");
    private static final javax.xml.namespace.QName PERIOD$2 = 
        new javax.xml.namespace.QName("http://hl7.org/fhir", "period");
    private static final javax.xml.namespace.QName FACTOR$4 = 
        new javax.xml.namespace.QName("http://hl7.org/fhir", "factor");
    private static final javax.xml.namespace.QName LOWERLIMIT$6 = 
        new javax.xml.namespace.QName("http://hl7.org/fhir", "lowerLimit");
    private static final javax.xml.namespace.QName UPPERLIMIT$8 = 
        new javax.xml.namespace.QName("http://hl7.org/fhir", "upperLimit");
    private static final javax.xml.namespace.QName DIMENSIONS$10 = 
        new javax.xml.namespace.QName("http://hl7.org/fhir", "dimensions");
    private static final javax.xml.namespace.QName DATA$12 = 
        new javax.xml.namespace.QName("http://hl7.org/fhir", "data");
    
    
    /**
     * Gets the "origin" element
     */
    public org.hl7.fhir.Quantity getOrigin()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.Quantity target = null;
            target = (org.hl7.fhir.Quantity)get_store().find_element_user(ORIGIN$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "origin" element
     */
    public void setOrigin(org.hl7.fhir.Quantity origin)
    {
        generatedSetterHelperImpl(origin, ORIGIN$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "origin" element
     */
    public org.hl7.fhir.Quantity addNewOrigin()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.Quantity target = null;
            target = (org.hl7.fhir.Quantity)get_store().add_element_user(ORIGIN$0);
            return target;
        }
    }
    
    /**
     * Gets the "period" element
     */
    public org.hl7.fhir.Decimal getPeriod()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.Decimal target = null;
            target = (org.hl7.fhir.Decimal)get_store().find_element_user(PERIOD$2, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "period" element
     */
    public void setPeriod(org.hl7.fhir.Decimal period)
    {
        generatedSetterHelperImpl(period, PERIOD$2, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "period" element
     */
    public org.hl7.fhir.Decimal addNewPeriod()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.Decimal target = null;
            target = (org.hl7.fhir.Decimal)get_store().add_element_user(PERIOD$2);
            return target;
        }
    }
    
    /**
     * Gets the "factor" element
     */
    public org.hl7.fhir.Decimal getFactor()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.Decimal target = null;
            target = (org.hl7.fhir.Decimal)get_store().find_element_user(FACTOR$4, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "factor" element
     */
    public boolean isSetFactor()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(FACTOR$4) != 0;
        }
    }
    
    /**
     * Sets the "factor" element
     */
    public void setFactor(org.hl7.fhir.Decimal factor)
    {
        generatedSetterHelperImpl(factor, FACTOR$4, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "factor" element
     */
    public org.hl7.fhir.Decimal addNewFactor()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.Decimal target = null;
            target = (org.hl7.fhir.Decimal)get_store().add_element_user(FACTOR$4);
            return target;
        }
    }
    
    /**
     * Unsets the "factor" element
     */
    public void unsetFactor()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(FACTOR$4, 0);
        }
    }
    
    /**
     * Gets the "lowerLimit" element
     */
    public org.hl7.fhir.Decimal getLowerLimit()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.Decimal target = null;
            target = (org.hl7.fhir.Decimal)get_store().find_element_user(LOWERLIMIT$6, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "lowerLimit" element
     */
    public boolean isSetLowerLimit()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(LOWERLIMIT$6) != 0;
        }
    }
    
    /**
     * Sets the "lowerLimit" element
     */
    public void setLowerLimit(org.hl7.fhir.Decimal lowerLimit)
    {
        generatedSetterHelperImpl(lowerLimit, LOWERLIMIT$6, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "lowerLimit" element
     */
    public org.hl7.fhir.Decimal addNewLowerLimit()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.Decimal target = null;
            target = (org.hl7.fhir.Decimal)get_store().add_element_user(LOWERLIMIT$6);
            return target;
        }
    }
    
    /**
     * Unsets the "lowerLimit" element
     */
    public void unsetLowerLimit()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(LOWERLIMIT$6, 0);
        }
    }
    
    /**
     * Gets the "upperLimit" element
     */
    public org.hl7.fhir.Decimal getUpperLimit()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.Decimal target = null;
            target = (org.hl7.fhir.Decimal)get_store().find_element_user(UPPERLIMIT$8, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "upperLimit" element
     */
    public boolean isSetUpperLimit()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(UPPERLIMIT$8) != 0;
        }
    }
    
    /**
     * Sets the "upperLimit" element
     */
    public void setUpperLimit(org.hl7.fhir.Decimal upperLimit)
    {
        generatedSetterHelperImpl(upperLimit, UPPERLIMIT$8, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "upperLimit" element
     */
    public org.hl7.fhir.Decimal addNewUpperLimit()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.Decimal target = null;
            target = (org.hl7.fhir.Decimal)get_store().add_element_user(UPPERLIMIT$8);
            return target;
        }
    }
    
    /**
     * Unsets the "upperLimit" element
     */
    public void unsetUpperLimit()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(UPPERLIMIT$8, 0);
        }
    }
    
    /**
     * Gets the "dimensions" element
     */
    public org.hl7.fhir.Integer getDimensions()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.Integer target = null;
            target = (org.hl7.fhir.Integer)get_store().find_element_user(DIMENSIONS$10, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "dimensions" element
     */
    public void setDimensions(org.hl7.fhir.Integer dimensions)
    {
        generatedSetterHelperImpl(dimensions, DIMENSIONS$10, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "dimensions" element
     */
    public org.hl7.fhir.Integer addNewDimensions()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.Integer target = null;
            target = (org.hl7.fhir.Integer)get_store().add_element_user(DIMENSIONS$10);
            return target;
        }
    }
    
    /**
     * Gets the "data" element
     */
    public org.hl7.fhir.SampledDataDataType getData()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.SampledDataDataType target = null;
            target = (org.hl7.fhir.SampledDataDataType)get_store().find_element_user(DATA$12, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "data" element
     */
    public void setData(org.hl7.fhir.SampledDataDataType data)
    {
        generatedSetterHelperImpl(data, DATA$12, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "data" element
     */
    public org.hl7.fhir.SampledDataDataType addNewData()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.SampledDataDataType target = null;
            target = (org.hl7.fhir.SampledDataDataType)get_store().add_element_user(DATA$12);
            return target;
        }
    }
}
