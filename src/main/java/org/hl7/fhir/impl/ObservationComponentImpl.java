/*
 * XML Type:  Observation.Component
 * Namespace: http://hl7.org/fhir
 * Java type: org.hl7.fhir.ObservationComponent
 *
 * Automatically generated - do not modify.
 */
package org.hl7.fhir.impl;
/**
 * An XML Observation.Component(@http://hl7.org/fhir).
 *
 * This is a complex type.
 */
public class ObservationComponentImpl extends org.hl7.fhir.impl.BackboneElementImpl implements org.hl7.fhir.ObservationComponent
{
    private static final long serialVersionUID = 1L;
    
    public ObservationComponentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName NAME$0 = 
        new javax.xml.namespace.QName("http://hl7.org/fhir", "name");
    private static final javax.xml.namespace.QName VALUEQUANTITY$2 = 
        new javax.xml.namespace.QName("http://hl7.org/fhir", "valueQuantity");
    private static final javax.xml.namespace.QName VALUECODEABLECONCEPT$4 = 
        new javax.xml.namespace.QName("http://hl7.org/fhir", "valueCodeableConcept");
    private static final javax.xml.namespace.QName VALUEATTACHMENT$6 = 
        new javax.xml.namespace.QName("http://hl7.org/fhir", "valueAttachment");
    private static final javax.xml.namespace.QName VALUERATIO$8 = 
        new javax.xml.namespace.QName("http://hl7.org/fhir", "valueRatio");
    private static final javax.xml.namespace.QName VALUEPERIOD$10 = 
        new javax.xml.namespace.QName("http://hl7.org/fhir", "valuePeriod");
    private static final javax.xml.namespace.QName VALUESAMPLEDDATA$12 = 
        new javax.xml.namespace.QName("http://hl7.org/fhir", "valueSampledData");
    private static final javax.xml.namespace.QName VALUESTRING$14 = 
        new javax.xml.namespace.QName("http://hl7.org/fhir", "valueString");
    
    
    /**
     * Gets the "name" element
     */
    public org.hl7.fhir.CodeableConcept getName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.CodeableConcept target = null;
            target = (org.hl7.fhir.CodeableConcept)get_store().find_element_user(NAME$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "name" element
     */
    public void setName(org.hl7.fhir.CodeableConcept name)
    {
        generatedSetterHelperImpl(name, NAME$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "name" element
     */
    public org.hl7.fhir.CodeableConcept addNewName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.CodeableConcept target = null;
            target = (org.hl7.fhir.CodeableConcept)get_store().add_element_user(NAME$0);
            return target;
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
            target = (org.hl7.fhir.Quantity)get_store().find_element_user(VALUEQUANTITY$2, 0);
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
            return get_store().count_elements(VALUEQUANTITY$2) != 0;
        }
    }
    
    /**
     * Sets the "valueQuantity" element
     */
    public void setValueQuantity(org.hl7.fhir.Quantity valueQuantity)
    {
        generatedSetterHelperImpl(valueQuantity, VALUEQUANTITY$2, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
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
            target = (org.hl7.fhir.Quantity)get_store().add_element_user(VALUEQUANTITY$2);
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
            get_store().remove_element(VALUEQUANTITY$2, 0);
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
            target = (org.hl7.fhir.CodeableConcept)get_store().find_element_user(VALUECODEABLECONCEPT$4, 0);
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
            return get_store().count_elements(VALUECODEABLECONCEPT$4) != 0;
        }
    }
    
    /**
     * Sets the "valueCodeableConcept" element
     */
    public void setValueCodeableConcept(org.hl7.fhir.CodeableConcept valueCodeableConcept)
    {
        generatedSetterHelperImpl(valueCodeableConcept, VALUECODEABLECONCEPT$4, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
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
            target = (org.hl7.fhir.CodeableConcept)get_store().add_element_user(VALUECODEABLECONCEPT$4);
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
            get_store().remove_element(VALUECODEABLECONCEPT$4, 0);
        }
    }
    
    /**
     * Gets the "valueAttachment" element
     */
    public org.hl7.fhir.Attachment getValueAttachment()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.Attachment target = null;
            target = (org.hl7.fhir.Attachment)get_store().find_element_user(VALUEATTACHMENT$6, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "valueAttachment" element
     */
    public boolean isSetValueAttachment()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(VALUEATTACHMENT$6) != 0;
        }
    }
    
    /**
     * Sets the "valueAttachment" element
     */
    public void setValueAttachment(org.hl7.fhir.Attachment valueAttachment)
    {
        generatedSetterHelperImpl(valueAttachment, VALUEATTACHMENT$6, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "valueAttachment" element
     */
    public org.hl7.fhir.Attachment addNewValueAttachment()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.Attachment target = null;
            target = (org.hl7.fhir.Attachment)get_store().add_element_user(VALUEATTACHMENT$6);
            return target;
        }
    }
    
    /**
     * Unsets the "valueAttachment" element
     */
    public void unsetValueAttachment()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(VALUEATTACHMENT$6, 0);
        }
    }
    
    /**
     * Gets the "valueRatio" element
     */
    public org.hl7.fhir.Ratio getValueRatio()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.Ratio target = null;
            target = (org.hl7.fhir.Ratio)get_store().find_element_user(VALUERATIO$8, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "valueRatio" element
     */
    public boolean isSetValueRatio()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(VALUERATIO$8) != 0;
        }
    }
    
    /**
     * Sets the "valueRatio" element
     */
    public void setValueRatio(org.hl7.fhir.Ratio valueRatio)
    {
        generatedSetterHelperImpl(valueRatio, VALUERATIO$8, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "valueRatio" element
     */
    public org.hl7.fhir.Ratio addNewValueRatio()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.Ratio target = null;
            target = (org.hl7.fhir.Ratio)get_store().add_element_user(VALUERATIO$8);
            return target;
        }
    }
    
    /**
     * Unsets the "valueRatio" element
     */
    public void unsetValueRatio()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(VALUERATIO$8, 0);
        }
    }
    
    /**
     * Gets the "valuePeriod" element
     */
    public org.hl7.fhir.Period getValuePeriod()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.Period target = null;
            target = (org.hl7.fhir.Period)get_store().find_element_user(VALUEPERIOD$10, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "valuePeriod" element
     */
    public boolean isSetValuePeriod()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(VALUEPERIOD$10) != 0;
        }
    }
    
    /**
     * Sets the "valuePeriod" element
     */
    public void setValuePeriod(org.hl7.fhir.Period valuePeriod)
    {
        generatedSetterHelperImpl(valuePeriod, VALUEPERIOD$10, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "valuePeriod" element
     */
    public org.hl7.fhir.Period addNewValuePeriod()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.Period target = null;
            target = (org.hl7.fhir.Period)get_store().add_element_user(VALUEPERIOD$10);
            return target;
        }
    }
    
    /**
     * Unsets the "valuePeriod" element
     */
    public void unsetValuePeriod()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(VALUEPERIOD$10, 0);
        }
    }
    
    /**
     * Gets the "valueSampledData" element
     */
    public org.hl7.fhir.SampledData getValueSampledData()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.SampledData target = null;
            target = (org.hl7.fhir.SampledData)get_store().find_element_user(VALUESAMPLEDDATA$12, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "valueSampledData" element
     */
    public boolean isSetValueSampledData()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(VALUESAMPLEDDATA$12) != 0;
        }
    }
    
    /**
     * Sets the "valueSampledData" element
     */
    public void setValueSampledData(org.hl7.fhir.SampledData valueSampledData)
    {
        generatedSetterHelperImpl(valueSampledData, VALUESAMPLEDDATA$12, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "valueSampledData" element
     */
    public org.hl7.fhir.SampledData addNewValueSampledData()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.SampledData target = null;
            target = (org.hl7.fhir.SampledData)get_store().add_element_user(VALUESAMPLEDDATA$12);
            return target;
        }
    }
    
    /**
     * Unsets the "valueSampledData" element
     */
    public void unsetValueSampledData()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(VALUESAMPLEDDATA$12, 0);
        }
    }
    
    /**
     * Gets the "valueString" element
     */
    public org.hl7.fhir.String getValueString()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.String target = null;
            target = (org.hl7.fhir.String)get_store().find_element_user(VALUESTRING$14, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "valueString" element
     */
    public boolean isSetValueString()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(VALUESTRING$14) != 0;
        }
    }
    
    /**
     * Sets the "valueString" element
     */
    public void setValueString(org.hl7.fhir.String valueString)
    {
        generatedSetterHelperImpl(valueString, VALUESTRING$14, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "valueString" element
     */
    public org.hl7.fhir.String addNewValueString()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.String target = null;
            target = (org.hl7.fhir.String)get_store().add_element_user(VALUESTRING$14);
            return target;
        }
    }
    
    /**
     * Unsets the "valueString" element
     */
    public void unsetValueString()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(VALUESTRING$14, 0);
        }
    }
}
