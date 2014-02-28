/*
 * XML Type:  Observation
 * Namespace: http://hl7.org/fhir
 * Java type: org.hl7.fhir.Observation
 *
 * Automatically generated - do not modify.
 */
package org.hl7.fhir.impl;
/**
 * An XML Observation(@http://hl7.org/fhir).
 *
 * This is a complex type.
 */
public class ObservationImpl extends org.hl7.fhir.impl.ResourceImpl implements org.hl7.fhir.Observation
{
    private static final long serialVersionUID = 1L;
    
    public ObservationImpl(org.apache.xmlbeans.SchemaType sType)
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
    private static final javax.xml.namespace.QName INTERPRETATION$16 = 
        new javax.xml.namespace.QName("http://hl7.org/fhir", "interpretation");
    private static final javax.xml.namespace.QName COMMENTS$18 = 
        new javax.xml.namespace.QName("http://hl7.org/fhir", "comments");
    private static final javax.xml.namespace.QName APPLIESDATETIME$20 = 
        new javax.xml.namespace.QName("http://hl7.org/fhir", "appliesDateTime");
    private static final javax.xml.namespace.QName APPLIESPERIOD$22 = 
        new javax.xml.namespace.QName("http://hl7.org/fhir", "appliesPeriod");
    private static final javax.xml.namespace.QName ISSUED$24 = 
        new javax.xml.namespace.QName("http://hl7.org/fhir", "issued");
    private static final javax.xml.namespace.QName STATUS$26 = 
        new javax.xml.namespace.QName("http://hl7.org/fhir", "status");
    private static final javax.xml.namespace.QName RELIABILITY$28 = 
        new javax.xml.namespace.QName("http://hl7.org/fhir", "reliability");
    private static final javax.xml.namespace.QName BODYSITE$30 = 
        new javax.xml.namespace.QName("http://hl7.org/fhir", "bodySite");
    private static final javax.xml.namespace.QName METHOD$32 = 
        new javax.xml.namespace.QName("http://hl7.org/fhir", "method");
    private static final javax.xml.namespace.QName IDENTIFIER$34 = 
        new javax.xml.namespace.QName("http://hl7.org/fhir", "identifier");
    private static final javax.xml.namespace.QName SUBJECT$36 = 
        new javax.xml.namespace.QName("http://hl7.org/fhir", "subject");
    private static final javax.xml.namespace.QName SPECIMEN$38 = 
        new javax.xml.namespace.QName("http://hl7.org/fhir", "specimen");
    private static final javax.xml.namespace.QName PERFORMER$40 = 
        new javax.xml.namespace.QName("http://hl7.org/fhir", "performer");
    private static final javax.xml.namespace.QName REFERENCERANGE$42 = 
        new javax.xml.namespace.QName("http://hl7.org/fhir", "referenceRange");
    private static final javax.xml.namespace.QName RELATED$44 = 
        new javax.xml.namespace.QName("http://hl7.org/fhir", "related");
    
    
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
    
    /**
     * Gets the "interpretation" element
     */
    public org.hl7.fhir.CodeableConcept getInterpretation()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.CodeableConcept target = null;
            target = (org.hl7.fhir.CodeableConcept)get_store().find_element_user(INTERPRETATION$16, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "interpretation" element
     */
    public boolean isSetInterpretation()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(INTERPRETATION$16) != 0;
        }
    }
    
    /**
     * Sets the "interpretation" element
     */
    public void setInterpretation(org.hl7.fhir.CodeableConcept interpretation)
    {
        generatedSetterHelperImpl(interpretation, INTERPRETATION$16, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "interpretation" element
     */
    public org.hl7.fhir.CodeableConcept addNewInterpretation()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.CodeableConcept target = null;
            target = (org.hl7.fhir.CodeableConcept)get_store().add_element_user(INTERPRETATION$16);
            return target;
        }
    }
    
    /**
     * Unsets the "interpretation" element
     */
    public void unsetInterpretation()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(INTERPRETATION$16, 0);
        }
    }
    
    /**
     * Gets the "comments" element
     */
    public org.hl7.fhir.String getComments()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.String target = null;
            target = (org.hl7.fhir.String)get_store().find_element_user(COMMENTS$18, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "comments" element
     */
    public boolean isSetComments()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(COMMENTS$18) != 0;
        }
    }
    
    /**
     * Sets the "comments" element
     */
    public void setComments(org.hl7.fhir.String comments)
    {
        generatedSetterHelperImpl(comments, COMMENTS$18, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "comments" element
     */
    public org.hl7.fhir.String addNewComments()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.String target = null;
            target = (org.hl7.fhir.String)get_store().add_element_user(COMMENTS$18);
            return target;
        }
    }
    
    /**
     * Unsets the "comments" element
     */
    public void unsetComments()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(COMMENTS$18, 0);
        }
    }
    
    /**
     * Gets the "appliesDateTime" element
     */
    public org.hl7.fhir.DateTime getAppliesDateTime()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.DateTime target = null;
            target = (org.hl7.fhir.DateTime)get_store().find_element_user(APPLIESDATETIME$20, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "appliesDateTime" element
     */
    public boolean isSetAppliesDateTime()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(APPLIESDATETIME$20) != 0;
        }
    }
    
    /**
     * Sets the "appliesDateTime" element
     */
    public void setAppliesDateTime(org.hl7.fhir.DateTime appliesDateTime)
    {
        generatedSetterHelperImpl(appliesDateTime, APPLIESDATETIME$20, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "appliesDateTime" element
     */
    public org.hl7.fhir.DateTime addNewAppliesDateTime()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.DateTime target = null;
            target = (org.hl7.fhir.DateTime)get_store().add_element_user(APPLIESDATETIME$20);
            return target;
        }
    }
    
    /**
     * Unsets the "appliesDateTime" element
     */
    public void unsetAppliesDateTime()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(APPLIESDATETIME$20, 0);
        }
    }
    
    /**
     * Gets the "appliesPeriod" element
     */
    public org.hl7.fhir.Period getAppliesPeriod()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.Period target = null;
            target = (org.hl7.fhir.Period)get_store().find_element_user(APPLIESPERIOD$22, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "appliesPeriod" element
     */
    public boolean isSetAppliesPeriod()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(APPLIESPERIOD$22) != 0;
        }
    }
    
    /**
     * Sets the "appliesPeriod" element
     */
    public void setAppliesPeriod(org.hl7.fhir.Period appliesPeriod)
    {
        generatedSetterHelperImpl(appliesPeriod, APPLIESPERIOD$22, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "appliesPeriod" element
     */
    public org.hl7.fhir.Period addNewAppliesPeriod()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.Period target = null;
            target = (org.hl7.fhir.Period)get_store().add_element_user(APPLIESPERIOD$22);
            return target;
        }
    }
    
    /**
     * Unsets the "appliesPeriod" element
     */
    public void unsetAppliesPeriod()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(APPLIESPERIOD$22, 0);
        }
    }
    
    /**
     * Gets the "issued" element
     */
    public org.hl7.fhir.Instant getIssued()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.Instant target = null;
            target = (org.hl7.fhir.Instant)get_store().find_element_user(ISSUED$24, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "issued" element
     */
    public boolean isSetIssued()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(ISSUED$24) != 0;
        }
    }
    
    /**
     * Sets the "issued" element
     */
    public void setIssued(org.hl7.fhir.Instant issued)
    {
        generatedSetterHelperImpl(issued, ISSUED$24, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "issued" element
     */
    public org.hl7.fhir.Instant addNewIssued()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.Instant target = null;
            target = (org.hl7.fhir.Instant)get_store().add_element_user(ISSUED$24);
            return target;
        }
    }
    
    /**
     * Unsets the "issued" element
     */
    public void unsetIssued()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(ISSUED$24, 0);
        }
    }
    
    /**
     * Gets the "status" element
     */
    public org.hl7.fhir.ObservationStatus getStatus()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.ObservationStatus target = null;
            target = (org.hl7.fhir.ObservationStatus)get_store().find_element_user(STATUS$26, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "status" element
     */
    public void setStatus(org.hl7.fhir.ObservationStatus status)
    {
        generatedSetterHelperImpl(status, STATUS$26, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "status" element
     */
    public org.hl7.fhir.ObservationStatus addNewStatus()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.ObservationStatus target = null;
            target = (org.hl7.fhir.ObservationStatus)get_store().add_element_user(STATUS$26);
            return target;
        }
    }
    
    /**
     * Gets the "reliability" element
     */
    public org.hl7.fhir.ObservationReliability getReliability()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.ObservationReliability target = null;
            target = (org.hl7.fhir.ObservationReliability)get_store().find_element_user(RELIABILITY$28, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "reliability" element
     */
    public void setReliability(org.hl7.fhir.ObservationReliability reliability)
    {
        generatedSetterHelperImpl(reliability, RELIABILITY$28, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "reliability" element
     */
    public org.hl7.fhir.ObservationReliability addNewReliability()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.ObservationReliability target = null;
            target = (org.hl7.fhir.ObservationReliability)get_store().add_element_user(RELIABILITY$28);
            return target;
        }
    }
    
    /**
     * Gets the "bodySite" element
     */
    public org.hl7.fhir.CodeableConcept getBodySite()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.CodeableConcept target = null;
            target = (org.hl7.fhir.CodeableConcept)get_store().find_element_user(BODYSITE$30, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "bodySite" element
     */
    public boolean isSetBodySite()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(BODYSITE$30) != 0;
        }
    }
    
    /**
     * Sets the "bodySite" element
     */
    public void setBodySite(org.hl7.fhir.CodeableConcept bodySite)
    {
        generatedSetterHelperImpl(bodySite, BODYSITE$30, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "bodySite" element
     */
    public org.hl7.fhir.CodeableConcept addNewBodySite()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.CodeableConcept target = null;
            target = (org.hl7.fhir.CodeableConcept)get_store().add_element_user(BODYSITE$30);
            return target;
        }
    }
    
    /**
     * Unsets the "bodySite" element
     */
    public void unsetBodySite()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(BODYSITE$30, 0);
        }
    }
    
    /**
     * Gets the "method" element
     */
    public org.hl7.fhir.CodeableConcept getMethod()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.CodeableConcept target = null;
            target = (org.hl7.fhir.CodeableConcept)get_store().find_element_user(METHOD$32, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "method" element
     */
    public boolean isSetMethod()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(METHOD$32) != 0;
        }
    }
    
    /**
     * Sets the "method" element
     */
    public void setMethod(org.hl7.fhir.CodeableConcept method)
    {
        generatedSetterHelperImpl(method, METHOD$32, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "method" element
     */
    public org.hl7.fhir.CodeableConcept addNewMethod()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.CodeableConcept target = null;
            target = (org.hl7.fhir.CodeableConcept)get_store().add_element_user(METHOD$32);
            return target;
        }
    }
    
    /**
     * Unsets the "method" element
     */
    public void unsetMethod()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(METHOD$32, 0);
        }
    }
    
    /**
     * Gets the "identifier" element
     */
    public org.hl7.fhir.Identifier getIdentifier()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.Identifier target = null;
            target = (org.hl7.fhir.Identifier)get_store().find_element_user(IDENTIFIER$34, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "identifier" element
     */
    public boolean isSetIdentifier()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(IDENTIFIER$34) != 0;
        }
    }
    
    /**
     * Sets the "identifier" element
     */
    public void setIdentifier(org.hl7.fhir.Identifier identifier)
    {
        generatedSetterHelperImpl(identifier, IDENTIFIER$34, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "identifier" element
     */
    public org.hl7.fhir.Identifier addNewIdentifier()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.Identifier target = null;
            target = (org.hl7.fhir.Identifier)get_store().add_element_user(IDENTIFIER$34);
            return target;
        }
    }
    
    /**
     * Unsets the "identifier" element
     */
    public void unsetIdentifier()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(IDENTIFIER$34, 0);
        }
    }
    
    /**
     * Gets the "subject" element
     */
    public org.hl7.fhir.ResourceReference getSubject()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.ResourceReference target = null;
            target = (org.hl7.fhir.ResourceReference)get_store().find_element_user(SUBJECT$36, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "subject" element
     */
    public boolean isSetSubject()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(SUBJECT$36) != 0;
        }
    }
    
    /**
     * Sets the "subject" element
     */
    public void setSubject(org.hl7.fhir.ResourceReference subject)
    {
        generatedSetterHelperImpl(subject, SUBJECT$36, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "subject" element
     */
    public org.hl7.fhir.ResourceReference addNewSubject()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.ResourceReference target = null;
            target = (org.hl7.fhir.ResourceReference)get_store().add_element_user(SUBJECT$36);
            return target;
        }
    }
    
    /**
     * Unsets the "subject" element
     */
    public void unsetSubject()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(SUBJECT$36, 0);
        }
    }
    
    /**
     * Gets the "specimen" element
     */
    public org.hl7.fhir.ResourceReference getSpecimen()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.ResourceReference target = null;
            target = (org.hl7.fhir.ResourceReference)get_store().find_element_user(SPECIMEN$38, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "specimen" element
     */
    public boolean isSetSpecimen()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(SPECIMEN$38) != 0;
        }
    }
    
    /**
     * Sets the "specimen" element
     */
    public void setSpecimen(org.hl7.fhir.ResourceReference specimen)
    {
        generatedSetterHelperImpl(specimen, SPECIMEN$38, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "specimen" element
     */
    public org.hl7.fhir.ResourceReference addNewSpecimen()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.ResourceReference target = null;
            target = (org.hl7.fhir.ResourceReference)get_store().add_element_user(SPECIMEN$38);
            return target;
        }
    }
    
    /**
     * Unsets the "specimen" element
     */
    public void unsetSpecimen()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(SPECIMEN$38, 0);
        }
    }
    
    /**
     * Gets array of all "performer" elements
     */
    public org.hl7.fhir.ResourceReference[] getPerformerArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(PERFORMER$40, targetList);
            org.hl7.fhir.ResourceReference[] result = new org.hl7.fhir.ResourceReference[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "performer" element
     */
    public org.hl7.fhir.ResourceReference getPerformerArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.ResourceReference target = null;
            target = (org.hl7.fhir.ResourceReference)get_store().find_element_user(PERFORMER$40, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "performer" element
     */
    public int sizeOfPerformerArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(PERFORMER$40);
        }
    }
    
    /**
     * Sets array of all "performer" element  WARNING: This method is not atomicaly synchronized.
     */
    public void setPerformerArray(org.hl7.fhir.ResourceReference[] performerArray)
    {
        check_orphaned();
        arraySetterHelper(performerArray, PERFORMER$40);
    }
    
    /**
     * Sets ith "performer" element
     */
    public void setPerformerArray(int i, org.hl7.fhir.ResourceReference performer)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.ResourceReference target = null;
            target = (org.hl7.fhir.ResourceReference)get_store().find_element_user(PERFORMER$40, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(performer);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "performer" element
     */
    public org.hl7.fhir.ResourceReference insertNewPerformer(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.ResourceReference target = null;
            target = (org.hl7.fhir.ResourceReference)get_store().insert_element_user(PERFORMER$40, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "performer" element
     */
    public org.hl7.fhir.ResourceReference addNewPerformer()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.ResourceReference target = null;
            target = (org.hl7.fhir.ResourceReference)get_store().add_element_user(PERFORMER$40);
            return target;
        }
    }
    
    /**
     * Removes the ith "performer" element
     */
    public void removePerformer(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(PERFORMER$40, i);
        }
    }
    
    /**
     * Gets array of all "referenceRange" elements
     */
    public org.hl7.fhir.ObservationReferenceRange[] getReferenceRangeArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(REFERENCERANGE$42, targetList);
            org.hl7.fhir.ObservationReferenceRange[] result = new org.hl7.fhir.ObservationReferenceRange[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "referenceRange" element
     */
    public org.hl7.fhir.ObservationReferenceRange getReferenceRangeArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.ObservationReferenceRange target = null;
            target = (org.hl7.fhir.ObservationReferenceRange)get_store().find_element_user(REFERENCERANGE$42, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "referenceRange" element
     */
    public int sizeOfReferenceRangeArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(REFERENCERANGE$42);
        }
    }
    
    /**
     * Sets array of all "referenceRange" element  WARNING: This method is not atomicaly synchronized.
     */
    public void setReferenceRangeArray(org.hl7.fhir.ObservationReferenceRange[] referenceRangeArray)
    {
        check_orphaned();
        arraySetterHelper(referenceRangeArray, REFERENCERANGE$42);
    }
    
    /**
     * Sets ith "referenceRange" element
     */
    public void setReferenceRangeArray(int i, org.hl7.fhir.ObservationReferenceRange referenceRange)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.ObservationReferenceRange target = null;
            target = (org.hl7.fhir.ObservationReferenceRange)get_store().find_element_user(REFERENCERANGE$42, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(referenceRange);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "referenceRange" element
     */
    public org.hl7.fhir.ObservationReferenceRange insertNewReferenceRange(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.ObservationReferenceRange target = null;
            target = (org.hl7.fhir.ObservationReferenceRange)get_store().insert_element_user(REFERENCERANGE$42, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "referenceRange" element
     */
    public org.hl7.fhir.ObservationReferenceRange addNewReferenceRange()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.ObservationReferenceRange target = null;
            target = (org.hl7.fhir.ObservationReferenceRange)get_store().add_element_user(REFERENCERANGE$42);
            return target;
        }
    }
    
    /**
     * Removes the ith "referenceRange" element
     */
    public void removeReferenceRange(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(REFERENCERANGE$42, i);
        }
    }
    
    /**
     * Gets array of all "related" elements
     */
    public org.hl7.fhir.ObservationRelated[] getRelatedArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(RELATED$44, targetList);
            org.hl7.fhir.ObservationRelated[] result = new org.hl7.fhir.ObservationRelated[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "related" element
     */
    public org.hl7.fhir.ObservationRelated getRelatedArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.ObservationRelated target = null;
            target = (org.hl7.fhir.ObservationRelated)get_store().find_element_user(RELATED$44, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "related" element
     */
    public int sizeOfRelatedArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(RELATED$44);
        }
    }
    
    /**
     * Sets array of all "related" element  WARNING: This method is not atomicaly synchronized.
     */
    public void setRelatedArray(org.hl7.fhir.ObservationRelated[] relatedArray)
    {
        check_orphaned();
        arraySetterHelper(relatedArray, RELATED$44);
    }
    
    /**
     * Sets ith "related" element
     */
    public void setRelatedArray(int i, org.hl7.fhir.ObservationRelated related)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.ObservationRelated target = null;
            target = (org.hl7.fhir.ObservationRelated)get_store().find_element_user(RELATED$44, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(related);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "related" element
     */
    public org.hl7.fhir.ObservationRelated insertNewRelated(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.ObservationRelated target = null;
            target = (org.hl7.fhir.ObservationRelated)get_store().insert_element_user(RELATED$44, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "related" element
     */
    public org.hl7.fhir.ObservationRelated addNewRelated()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.ObservationRelated target = null;
            target = (org.hl7.fhir.ObservationRelated)get_store().add_element_user(RELATED$44);
            return target;
        }
    }
    
    /**
     * Removes the ith "related" element
     */
    public void removeRelated(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(RELATED$44, i);
        }
    }
}
