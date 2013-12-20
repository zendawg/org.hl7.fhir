/*
 * XML Type:  Group.Characteristic
 * Namespace: http://hl7.org/fhir
 * Java type: org.hl7.fhir.GroupCharacteristic
 *
 * Automatically generated - do not modify.
 */
package org.hl7.fhir.impl;
/**
 * An XML Group.Characteristic(@http://hl7.org/fhir).
 *
 * This is a complex type.
 */
public class GroupCharacteristicImpl extends org.hl7.fhir.impl.BackboneElementImpl implements org.hl7.fhir.GroupCharacteristic
{
    private static final long serialVersionUID = 1L;
    
    public GroupCharacteristicImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName CODE$0 = 
        new javax.xml.namespace.QName("http://hl7.org/fhir", "code");
    private static final javax.xml.namespace.QName VALUECODEABLECONCEPT$2 = 
        new javax.xml.namespace.QName("http://hl7.org/fhir", "valueCodeableConcept");
    private static final javax.xml.namespace.QName VALUEBOOLEAN$4 = 
        new javax.xml.namespace.QName("http://hl7.org/fhir", "valueBoolean");
    private static final javax.xml.namespace.QName VALUEQUANTITY$6 = 
        new javax.xml.namespace.QName("http://hl7.org/fhir", "valueQuantity");
    private static final javax.xml.namespace.QName VALUERANGE$8 = 
        new javax.xml.namespace.QName("http://hl7.org/fhir", "valueRange");
    private static final javax.xml.namespace.QName EXCLUDE$10 = 
        new javax.xml.namespace.QName("http://hl7.org/fhir", "exclude");
    
    
    /**
     * Gets the "code" element
     */
    public org.hl7.fhir.CodeableConcept getCode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.CodeableConcept target = null;
            target = (org.hl7.fhir.CodeableConcept)get_store().find_element_user(CODE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "code" element
     */
    public void setCode(org.hl7.fhir.CodeableConcept code)
    {
        generatedSetterHelperImpl(code, CODE$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "code" element
     */
    public org.hl7.fhir.CodeableConcept addNewCode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.CodeableConcept target = null;
            target = (org.hl7.fhir.CodeableConcept)get_store().add_element_user(CODE$0);
            return target;
        }
    }
    
    /**
     * Gets the "valueCodeableConcept" element
     */
    public org.hl7.fhir.CodeableConcept getValueCodeableConcept()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.CodeableConcept target = null;
            target = (org.hl7.fhir.CodeableConcept)get_store().find_element_user(VALUECODEABLECONCEPT$2, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "valueCodeableConcept" element
     */
    public boolean isSetValueCodeableConcept()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(VALUECODEABLECONCEPT$2) != 0;
        }
    }
    
    /**
     * Sets the "valueCodeableConcept" element
     */
    public void setValueCodeableConcept(org.hl7.fhir.CodeableConcept valueCodeableConcept)
    {
        generatedSetterHelperImpl(valueCodeableConcept, VALUECODEABLECONCEPT$2, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "valueCodeableConcept" element
     */
    public org.hl7.fhir.CodeableConcept addNewValueCodeableConcept()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.CodeableConcept target = null;
            target = (org.hl7.fhir.CodeableConcept)get_store().add_element_user(VALUECODEABLECONCEPT$2);
            return target;
        }
    }
    
    /**
     * Unsets the "valueCodeableConcept" element
     */
    public void unsetValueCodeableConcept()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(VALUECODEABLECONCEPT$2, 0);
        }
    }
    
    /**
     * Gets the "valueBoolean" element
     */
    public org.hl7.fhir.Boolean getValueBoolean()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.Boolean target = null;
            target = (org.hl7.fhir.Boolean)get_store().find_element_user(VALUEBOOLEAN$4, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "valueBoolean" element
     */
    public boolean isSetValueBoolean()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(VALUEBOOLEAN$4) != 0;
        }
    }
    
    /**
     * Sets the "valueBoolean" element
     */
    public void setValueBoolean(org.hl7.fhir.Boolean valueBoolean)
    {
        generatedSetterHelperImpl(valueBoolean, VALUEBOOLEAN$4, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "valueBoolean" element
     */
    public org.hl7.fhir.Boolean addNewValueBoolean()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.Boolean target = null;
            target = (org.hl7.fhir.Boolean)get_store().add_element_user(VALUEBOOLEAN$4);
            return target;
        }
    }
    
    /**
     * Unsets the "valueBoolean" element
     */
    public void unsetValueBoolean()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(VALUEBOOLEAN$4, 0);
        }
    }
    
    /**
     * Gets the "valueQuantity" element
     */
    public org.hl7.fhir.Quantity getValueQuantity()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.Quantity target = null;
            target = (org.hl7.fhir.Quantity)get_store().find_element_user(VALUEQUANTITY$6, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "valueQuantity" element
     */
    public boolean isSetValueQuantity()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(VALUEQUANTITY$6) != 0;
        }
    }
    
    /**
     * Sets the "valueQuantity" element
     */
    public void setValueQuantity(org.hl7.fhir.Quantity valueQuantity)
    {
        generatedSetterHelperImpl(valueQuantity, VALUEQUANTITY$6, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "valueQuantity" element
     */
    public org.hl7.fhir.Quantity addNewValueQuantity()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.Quantity target = null;
            target = (org.hl7.fhir.Quantity)get_store().add_element_user(VALUEQUANTITY$6);
            return target;
        }
    }
    
    /**
     * Unsets the "valueQuantity" element
     */
    public void unsetValueQuantity()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(VALUEQUANTITY$6, 0);
        }
    }
    
    /**
     * Gets the "valueRange" element
     */
    public org.hl7.fhir.Range getValueRange()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.Range target = null;
            target = (org.hl7.fhir.Range)get_store().find_element_user(VALUERANGE$8, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "valueRange" element
     */
    public boolean isSetValueRange()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(VALUERANGE$8) != 0;
        }
    }
    
    /**
     * Sets the "valueRange" element
     */
    public void setValueRange(org.hl7.fhir.Range valueRange)
    {
        generatedSetterHelperImpl(valueRange, VALUERANGE$8, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "valueRange" element
     */
    public org.hl7.fhir.Range addNewValueRange()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.Range target = null;
            target = (org.hl7.fhir.Range)get_store().add_element_user(VALUERANGE$8);
            return target;
        }
    }
    
    /**
     * Unsets the "valueRange" element
     */
    public void unsetValueRange()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(VALUERANGE$8, 0);
        }
    }
    
    /**
     * Gets the "exclude" element
     */
    public org.hl7.fhir.Boolean getExclude()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.Boolean target = null;
            target = (org.hl7.fhir.Boolean)get_store().find_element_user(EXCLUDE$10, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "exclude" element
     */
    public void setExclude(org.hl7.fhir.Boolean exclude)
    {
        generatedSetterHelperImpl(exclude, EXCLUDE$10, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "exclude" element
     */
    public org.hl7.fhir.Boolean addNewExclude()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.Boolean target = null;
            target = (org.hl7.fhir.Boolean)get_store().add_element_user(EXCLUDE$10);
            return target;
        }
    }
}
