/*
 * XML Type:  Observation.ReferenceRange
 * Namespace: http://hl7.org/fhir
 * Java type: org.hl7.fhir.ObservationReferenceRange
 *
 * Automatically generated - do not modify.
 */
package org.hl7.fhir.impl;
/**
 * An XML Observation.ReferenceRange(@http://hl7.org/fhir).
 *
 * This is a complex type.
 */
public class ObservationReferenceRangeImpl extends org.hl7.fhir.impl.BackboneElementImpl implements org.hl7.fhir.ObservationReferenceRange
{
    private static final long serialVersionUID = 1L;
    
    public ObservationReferenceRangeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName LOW$0 = 
        new javax.xml.namespace.QName("http://hl7.org/fhir", "low");
    private static final javax.xml.namespace.QName HIGH$2 = 
        new javax.xml.namespace.QName("http://hl7.org/fhir", "high");
    private static final javax.xml.namespace.QName MEANING$4 = 
        new javax.xml.namespace.QName("http://hl7.org/fhir", "meaning");
    private static final javax.xml.namespace.QName AGE$6 = 
        new javax.xml.namespace.QName("http://hl7.org/fhir", "age");
    
    
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
    
    /**
     * Gets the "meaning" element
     */
    public org.hl7.fhir.CodeableConcept getMeaning()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.CodeableConcept target = null;
            target = (org.hl7.fhir.CodeableConcept)get_store().find_element_user(MEANING$4, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "meaning" element
     */
    public boolean isSetMeaning()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(MEANING$4) != 0;
        }
    }
    
    /**
     * Sets the "meaning" element
     */
    public void setMeaning(org.hl7.fhir.CodeableConcept meaning)
    {
        generatedSetterHelperImpl(meaning, MEANING$4, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "meaning" element
     */
    public org.hl7.fhir.CodeableConcept addNewMeaning()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.CodeableConcept target = null;
            target = (org.hl7.fhir.CodeableConcept)get_store().add_element_user(MEANING$4);
            return target;
        }
    }
    
    /**
     * Unsets the "meaning" element
     */
    public void unsetMeaning()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(MEANING$4, 0);
        }
    }
    
    /**
     * Gets the "age" element
     */
    public org.hl7.fhir.Range getAge()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.Range target = null;
            target = (org.hl7.fhir.Range)get_store().find_element_user(AGE$6, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "age" element
     */
    public boolean isSetAge()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(AGE$6) != 0;
        }
    }
    
    /**
     * Sets the "age" element
     */
    public void setAge(org.hl7.fhir.Range age)
    {
        generatedSetterHelperImpl(age, AGE$6, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "age" element
     */
    public org.hl7.fhir.Range addNewAge()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.Range target = null;
            target = (org.hl7.fhir.Range)get_store().add_element_user(AGE$6);
            return target;
        }
    }
    
    /**
     * Unsets the "age" element
     */
    public void unsetAge()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(AGE$6, 0);
        }
    }
}
