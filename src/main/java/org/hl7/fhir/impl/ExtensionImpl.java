/*
 * XML Type:  Extension
 * Namespace: http://hl7.org/fhir
 * Java type: org.hl7.fhir.Extension
 *
 * Automatically generated - do not modify.
 */
package org.hl7.fhir.impl;
/**
 * An XML Extension(@http://hl7.org/fhir).
 *
 * This is a complex type.
 */
public class ExtensionImpl extends org.hl7.fhir.impl.ElementImpl implements org.hl7.fhir.Extension
{
    private static final long serialVersionUID = 1L;
    
    public ExtensionImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName VALUEBOOLEAN$0 = 
        new javax.xml.namespace.QName("http://hl7.org/fhir", "valueBoolean");
    private static final javax.xml.namespace.QName VALUEINTEGER$2 = 
        new javax.xml.namespace.QName("http://hl7.org/fhir", "valueInteger");
    private static final javax.xml.namespace.QName VALUEDECIMAL$4 = 
        new javax.xml.namespace.QName("http://hl7.org/fhir", "valueDecimal");
    private static final javax.xml.namespace.QName VALUEBASE64BINARY$6 = 
        new javax.xml.namespace.QName("http://hl7.org/fhir", "valueBase64Binary");
    private static final javax.xml.namespace.QName VALUEINSTANT$8 = 
        new javax.xml.namespace.QName("http://hl7.org/fhir", "valueInstant");
    private static final javax.xml.namespace.QName VALUESTRING$10 = 
        new javax.xml.namespace.QName("http://hl7.org/fhir", "valueString");
    private static final javax.xml.namespace.QName VALUEURI$12 = 
        new javax.xml.namespace.QName("http://hl7.org/fhir", "valueUri");
    private static final javax.xml.namespace.QName VALUEDATE$14 = 
        new javax.xml.namespace.QName("http://hl7.org/fhir", "valueDate");
    private static final javax.xml.namespace.QName VALUEDATETIME$16 = 
        new javax.xml.namespace.QName("http://hl7.org/fhir", "valueDateTime");
    private static final javax.xml.namespace.QName VALUECODE$18 = 
        new javax.xml.namespace.QName("http://hl7.org/fhir", "valueCode");
    private static final javax.xml.namespace.QName VALUEATTACHMENT$20 = 
        new javax.xml.namespace.QName("http://hl7.org/fhir", "valueAttachment");
    private static final javax.xml.namespace.QName VALUEIDENTIFIER$22 = 
        new javax.xml.namespace.QName("http://hl7.org/fhir", "valueIdentifier");
    private static final javax.xml.namespace.QName VALUECODEABLECONCEPT$24 = 
        new javax.xml.namespace.QName("http://hl7.org/fhir", "valueCodeableConcept");
    private static final javax.xml.namespace.QName VALUECODING$26 = 
        new javax.xml.namespace.QName("http://hl7.org/fhir", "valueCoding");
    private static final javax.xml.namespace.QName VALUEQUANTITY$28 = 
        new javax.xml.namespace.QName("http://hl7.org/fhir", "valueQuantity");
    private static final javax.xml.namespace.QName VALUERANGE$30 = 
        new javax.xml.namespace.QName("http://hl7.org/fhir", "valueRange");
    private static final javax.xml.namespace.QName VALUEPERIOD$32 = 
        new javax.xml.namespace.QName("http://hl7.org/fhir", "valuePeriod");
    private static final javax.xml.namespace.QName VALUERATIO$34 = 
        new javax.xml.namespace.QName("http://hl7.org/fhir", "valueRatio");
    private static final javax.xml.namespace.QName VALUERESOURCE$36 = 
        new javax.xml.namespace.QName("http://hl7.org/fhir", "valueResource");
    private static final javax.xml.namespace.QName VALUESAMPLEDDATA$38 = 
        new javax.xml.namespace.QName("http://hl7.org/fhir", "valueSampledData");
    private static final javax.xml.namespace.QName VALUEHUMANNAME$40 = 
        new javax.xml.namespace.QName("http://hl7.org/fhir", "valueHumanName");
    private static final javax.xml.namespace.QName VALUEADDRESS$42 = 
        new javax.xml.namespace.QName("http://hl7.org/fhir", "valueAddress");
    private static final javax.xml.namespace.QName VALUECONTACT$44 = 
        new javax.xml.namespace.QName("http://hl7.org/fhir", "valueContact");
    private static final javax.xml.namespace.QName VALUESCHEDULE$46 = 
        new javax.xml.namespace.QName("http://hl7.org/fhir", "valueSchedule");
    private static final javax.xml.namespace.QName URL$48 = 
        new javax.xml.namespace.QName("", "url");
    
    
    /**
     * Gets the "valueBoolean" element
     */
    public org.hl7.fhir.Boolean getValueBoolean()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.Boolean target = null;
            target = (org.hl7.fhir.Boolean)get_store().find_element_user(VALUEBOOLEAN$0, 0);
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
            return get_store().count_elements(VALUEBOOLEAN$0) != 0;
        }
    }
    
    /**
     * Sets the "valueBoolean" element
     */
    public void setValueBoolean(org.hl7.fhir.Boolean valueBoolean)
    {
        generatedSetterHelperImpl(valueBoolean, VALUEBOOLEAN$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
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
            target = (org.hl7.fhir.Boolean)get_store().add_element_user(VALUEBOOLEAN$0);
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
            get_store().remove_element(VALUEBOOLEAN$0, 0);
        }
    }
    
    /**
     * Gets the "valueInteger" element
     */
    public org.hl7.fhir.Integer getValueInteger()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.Integer target = null;
            target = (org.hl7.fhir.Integer)get_store().find_element_user(VALUEINTEGER$2, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "valueInteger" element
     */
    public boolean isSetValueInteger()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(VALUEINTEGER$2) != 0;
        }
    }
    
    /**
     * Sets the "valueInteger" element
     */
    public void setValueInteger(org.hl7.fhir.Integer valueInteger)
    {
        generatedSetterHelperImpl(valueInteger, VALUEINTEGER$2, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "valueInteger" element
     */
    public org.hl7.fhir.Integer addNewValueInteger()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.Integer target = null;
            target = (org.hl7.fhir.Integer)get_store().add_element_user(VALUEINTEGER$2);
            return target;
        }
    }
    
    /**
     * Unsets the "valueInteger" element
     */
    public void unsetValueInteger()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(VALUEINTEGER$2, 0);
        }
    }
    
    /**
     * Gets the "valueDecimal" element
     */
    public org.hl7.fhir.Decimal getValueDecimal()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.Decimal target = null;
            target = (org.hl7.fhir.Decimal)get_store().find_element_user(VALUEDECIMAL$4, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "valueDecimal" element
     */
    public boolean isSetValueDecimal()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(VALUEDECIMAL$4) != 0;
        }
    }
    
    /**
     * Sets the "valueDecimal" element
     */
    public void setValueDecimal(org.hl7.fhir.Decimal valueDecimal)
    {
        generatedSetterHelperImpl(valueDecimal, VALUEDECIMAL$4, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "valueDecimal" element
     */
    public org.hl7.fhir.Decimal addNewValueDecimal()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.Decimal target = null;
            target = (org.hl7.fhir.Decimal)get_store().add_element_user(VALUEDECIMAL$4);
            return target;
        }
    }
    
    /**
     * Unsets the "valueDecimal" element
     */
    public void unsetValueDecimal()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(VALUEDECIMAL$4, 0);
        }
    }
    
    /**
     * Gets the "valueBase64Binary" element
     */
    public org.hl7.fhir.Base64Binary getValueBase64Binary()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.Base64Binary target = null;
            target = (org.hl7.fhir.Base64Binary)get_store().find_element_user(VALUEBASE64BINARY$6, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "valueBase64Binary" element
     */
    public boolean isSetValueBase64Binary()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(VALUEBASE64BINARY$6) != 0;
        }
    }
    
    /**
     * Sets the "valueBase64Binary" element
     */
    public void setValueBase64Binary(org.hl7.fhir.Base64Binary valueBase64Binary)
    {
        generatedSetterHelperImpl(valueBase64Binary, VALUEBASE64BINARY$6, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "valueBase64Binary" element
     */
    public org.hl7.fhir.Base64Binary addNewValueBase64Binary()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.Base64Binary target = null;
            target = (org.hl7.fhir.Base64Binary)get_store().add_element_user(VALUEBASE64BINARY$6);
            return target;
        }
    }
    
    /**
     * Unsets the "valueBase64Binary" element
     */
    public void unsetValueBase64Binary()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(VALUEBASE64BINARY$6, 0);
        }
    }
    
    /**
     * Gets the "valueInstant" element
     */
    public org.hl7.fhir.Instant getValueInstant()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.Instant target = null;
            target = (org.hl7.fhir.Instant)get_store().find_element_user(VALUEINSTANT$8, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "valueInstant" element
     */
    public boolean isSetValueInstant()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(VALUEINSTANT$8) != 0;
        }
    }
    
    /**
     * Sets the "valueInstant" element
     */
    public void setValueInstant(org.hl7.fhir.Instant valueInstant)
    {
        generatedSetterHelperImpl(valueInstant, VALUEINSTANT$8, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "valueInstant" element
     */
    public org.hl7.fhir.Instant addNewValueInstant()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.Instant target = null;
            target = (org.hl7.fhir.Instant)get_store().add_element_user(VALUEINSTANT$8);
            return target;
        }
    }
    
    /**
     * Unsets the "valueInstant" element
     */
    public void unsetValueInstant()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(VALUEINSTANT$8, 0);
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
            target = (org.hl7.fhir.String)get_store().find_element_user(VALUESTRING$10, 0);
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
            return get_store().count_elements(VALUESTRING$10) != 0;
        }
    }
    
    /**
     * Sets the "valueString" element
     */
    public void setValueString(org.hl7.fhir.String valueString)
    {
        generatedSetterHelperImpl(valueString, VALUESTRING$10, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
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
            target = (org.hl7.fhir.String)get_store().add_element_user(VALUESTRING$10);
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
            get_store().remove_element(VALUESTRING$10, 0);
        }
    }
    
    /**
     * Gets the "valueUri" element
     */
    public org.hl7.fhir.Uri getValueUri()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.Uri target = null;
            target = (org.hl7.fhir.Uri)get_store().find_element_user(VALUEURI$12, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "valueUri" element
     */
    public boolean isSetValueUri()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(VALUEURI$12) != 0;
        }
    }
    
    /**
     * Sets the "valueUri" element
     */
    public void setValueUri(org.hl7.fhir.Uri valueUri)
    {
        generatedSetterHelperImpl(valueUri, VALUEURI$12, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "valueUri" element
     */
    public org.hl7.fhir.Uri addNewValueUri()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.Uri target = null;
            target = (org.hl7.fhir.Uri)get_store().add_element_user(VALUEURI$12);
            return target;
        }
    }
    
    /**
     * Unsets the "valueUri" element
     */
    public void unsetValueUri()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(VALUEURI$12, 0);
        }
    }
    
    /**
     * Gets the "valueDate" element
     */
    public org.hl7.fhir.Date getValueDate()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.Date target = null;
            target = (org.hl7.fhir.Date)get_store().find_element_user(VALUEDATE$14, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "valueDate" element
     */
    public boolean isSetValueDate()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(VALUEDATE$14) != 0;
        }
    }
    
    /**
     * Sets the "valueDate" element
     */
    public void setValueDate(org.hl7.fhir.Date valueDate)
    {
        generatedSetterHelperImpl(valueDate, VALUEDATE$14, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "valueDate" element
     */
    public org.hl7.fhir.Date addNewValueDate()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.Date target = null;
            target = (org.hl7.fhir.Date)get_store().add_element_user(VALUEDATE$14);
            return target;
        }
    }
    
    /**
     * Unsets the "valueDate" element
     */
    public void unsetValueDate()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(VALUEDATE$14, 0);
        }
    }
    
    /**
     * Gets the "valueDateTime" element
     */
    public org.hl7.fhir.DateTime getValueDateTime()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.DateTime target = null;
            target = (org.hl7.fhir.DateTime)get_store().find_element_user(VALUEDATETIME$16, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "valueDateTime" element
     */
    public boolean isSetValueDateTime()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(VALUEDATETIME$16) != 0;
        }
    }
    
    /**
     * Sets the "valueDateTime" element
     */
    public void setValueDateTime(org.hl7.fhir.DateTime valueDateTime)
    {
        generatedSetterHelperImpl(valueDateTime, VALUEDATETIME$16, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "valueDateTime" element
     */
    public org.hl7.fhir.DateTime addNewValueDateTime()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.DateTime target = null;
            target = (org.hl7.fhir.DateTime)get_store().add_element_user(VALUEDATETIME$16);
            return target;
        }
    }
    
    /**
     * Unsets the "valueDateTime" element
     */
    public void unsetValueDateTime()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(VALUEDATETIME$16, 0);
        }
    }
    
    /**
     * Gets the "valueCode" element
     */
    public org.hl7.fhir.Code getValueCode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.Code target = null;
            target = (org.hl7.fhir.Code)get_store().find_element_user(VALUECODE$18, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "valueCode" element
     */
    public boolean isSetValueCode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(VALUECODE$18) != 0;
        }
    }
    
    /**
     * Sets the "valueCode" element
     */
    public void setValueCode(org.hl7.fhir.Code valueCode)
    {
        generatedSetterHelperImpl(valueCode, VALUECODE$18, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "valueCode" element
     */
    public org.hl7.fhir.Code addNewValueCode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.Code target = null;
            target = (org.hl7.fhir.Code)get_store().add_element_user(VALUECODE$18);
            return target;
        }
    }
    
    /**
     * Unsets the "valueCode" element
     */
    public void unsetValueCode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(VALUECODE$18, 0);
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
            target = (org.hl7.fhir.Attachment)get_store().find_element_user(VALUEATTACHMENT$20, 0);
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
            return get_store().count_elements(VALUEATTACHMENT$20) != 0;
        }
    }
    
    /**
     * Sets the "valueAttachment" element
     */
    public void setValueAttachment(org.hl7.fhir.Attachment valueAttachment)
    {
        generatedSetterHelperImpl(valueAttachment, VALUEATTACHMENT$20, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
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
            target = (org.hl7.fhir.Attachment)get_store().add_element_user(VALUEATTACHMENT$20);
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
            get_store().remove_element(VALUEATTACHMENT$20, 0);
        }
    }
    
    /**
     * Gets the "valueIdentifier" element
     */
    public org.hl7.fhir.Identifier getValueIdentifier()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.Identifier target = null;
            target = (org.hl7.fhir.Identifier)get_store().find_element_user(VALUEIDENTIFIER$22, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "valueIdentifier" element
     */
    public boolean isSetValueIdentifier()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(VALUEIDENTIFIER$22) != 0;
        }
    }
    
    /**
     * Sets the "valueIdentifier" element
     */
    public void setValueIdentifier(org.hl7.fhir.Identifier valueIdentifier)
    {
        generatedSetterHelperImpl(valueIdentifier, VALUEIDENTIFIER$22, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "valueIdentifier" element
     */
    public org.hl7.fhir.Identifier addNewValueIdentifier()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.Identifier target = null;
            target = (org.hl7.fhir.Identifier)get_store().add_element_user(VALUEIDENTIFIER$22);
            return target;
        }
    }
    
    /**
     * Unsets the "valueIdentifier" element
     */
    public void unsetValueIdentifier()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(VALUEIDENTIFIER$22, 0);
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
            target = (org.hl7.fhir.CodeableConcept)get_store().find_element_user(VALUECODEABLECONCEPT$24, 0);
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
            return get_store().count_elements(VALUECODEABLECONCEPT$24) != 0;
        }
    }
    
    /**
     * Sets the "valueCodeableConcept" element
     */
    public void setValueCodeableConcept(org.hl7.fhir.CodeableConcept valueCodeableConcept)
    {
        generatedSetterHelperImpl(valueCodeableConcept, VALUECODEABLECONCEPT$24, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
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
            target = (org.hl7.fhir.CodeableConcept)get_store().add_element_user(VALUECODEABLECONCEPT$24);
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
            get_store().remove_element(VALUECODEABLECONCEPT$24, 0);
        }
    }
    
    /**
     * Gets the "valueCoding" element
     */
    public org.hl7.fhir.Coding getValueCoding()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.Coding target = null;
            target = (org.hl7.fhir.Coding)get_store().find_element_user(VALUECODING$26, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "valueCoding" element
     */
    public boolean isSetValueCoding()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(VALUECODING$26) != 0;
        }
    }
    
    /**
     * Sets the "valueCoding" element
     */
    public void setValueCoding(org.hl7.fhir.Coding valueCoding)
    {
        generatedSetterHelperImpl(valueCoding, VALUECODING$26, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "valueCoding" element
     */
    public org.hl7.fhir.Coding addNewValueCoding()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.Coding target = null;
            target = (org.hl7.fhir.Coding)get_store().add_element_user(VALUECODING$26);
            return target;
        }
    }
    
    /**
     * Unsets the "valueCoding" element
     */
    public void unsetValueCoding()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(VALUECODING$26, 0);
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
            target = (org.hl7.fhir.Quantity)get_store().find_element_user(VALUEQUANTITY$28, 0);
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
            return get_store().count_elements(VALUEQUANTITY$28) != 0;
        }
    }
    
    /**
     * Sets the "valueQuantity" element
     */
    public void setValueQuantity(org.hl7.fhir.Quantity valueQuantity)
    {
        generatedSetterHelperImpl(valueQuantity, VALUEQUANTITY$28, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
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
            target = (org.hl7.fhir.Quantity)get_store().add_element_user(VALUEQUANTITY$28);
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
            get_store().remove_element(VALUEQUANTITY$28, 0);
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
            target = (org.hl7.fhir.Range)get_store().find_element_user(VALUERANGE$30, 0);
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
            return get_store().count_elements(VALUERANGE$30) != 0;
        }
    }
    
    /**
     * Sets the "valueRange" element
     */
    public void setValueRange(org.hl7.fhir.Range valueRange)
    {
        generatedSetterHelperImpl(valueRange, VALUERANGE$30, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
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
            target = (org.hl7.fhir.Range)get_store().add_element_user(VALUERANGE$30);
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
            get_store().remove_element(VALUERANGE$30, 0);
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
            target = (org.hl7.fhir.Period)get_store().find_element_user(VALUEPERIOD$32, 0);
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
            return get_store().count_elements(VALUEPERIOD$32) != 0;
        }
    }
    
    /**
     * Sets the "valuePeriod" element
     */
    public void setValuePeriod(org.hl7.fhir.Period valuePeriod)
    {
        generatedSetterHelperImpl(valuePeriod, VALUEPERIOD$32, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
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
            target = (org.hl7.fhir.Period)get_store().add_element_user(VALUEPERIOD$32);
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
            get_store().remove_element(VALUEPERIOD$32, 0);
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
            target = (org.hl7.fhir.Ratio)get_store().find_element_user(VALUERATIO$34, 0);
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
            return get_store().count_elements(VALUERATIO$34) != 0;
        }
    }
    
    /**
     * Sets the "valueRatio" element
     */
    public void setValueRatio(org.hl7.fhir.Ratio valueRatio)
    {
        generatedSetterHelperImpl(valueRatio, VALUERATIO$34, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
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
            target = (org.hl7.fhir.Ratio)get_store().add_element_user(VALUERATIO$34);
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
            get_store().remove_element(VALUERATIO$34, 0);
        }
    }
    
    /**
     * Gets the "valueResource" element
     */
    public org.hl7.fhir.ResourceReference getValueResource()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.ResourceReference target = null;
            target = (org.hl7.fhir.ResourceReference)get_store().find_element_user(VALUERESOURCE$36, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "valueResource" element
     */
    public boolean isSetValueResource()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(VALUERESOURCE$36) != 0;
        }
    }
    
    /**
     * Sets the "valueResource" element
     */
    public void setValueResource(org.hl7.fhir.ResourceReference valueResource)
    {
        generatedSetterHelperImpl(valueResource, VALUERESOURCE$36, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "valueResource" element
     */
    public org.hl7.fhir.ResourceReference addNewValueResource()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.ResourceReference target = null;
            target = (org.hl7.fhir.ResourceReference)get_store().add_element_user(VALUERESOURCE$36);
            return target;
        }
    }
    
    /**
     * Unsets the "valueResource" element
     */
    public void unsetValueResource()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(VALUERESOURCE$36, 0);
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
            target = (org.hl7.fhir.SampledData)get_store().find_element_user(VALUESAMPLEDDATA$38, 0);
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
            return get_store().count_elements(VALUESAMPLEDDATA$38) != 0;
        }
    }
    
    /**
     * Sets the "valueSampledData" element
     */
    public void setValueSampledData(org.hl7.fhir.SampledData valueSampledData)
    {
        generatedSetterHelperImpl(valueSampledData, VALUESAMPLEDDATA$38, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
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
            target = (org.hl7.fhir.SampledData)get_store().add_element_user(VALUESAMPLEDDATA$38);
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
            get_store().remove_element(VALUESAMPLEDDATA$38, 0);
        }
    }
    
    /**
     * Gets the "valueHumanName" element
     */
    public org.hl7.fhir.HumanName getValueHumanName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.HumanName target = null;
            target = (org.hl7.fhir.HumanName)get_store().find_element_user(VALUEHUMANNAME$40, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "valueHumanName" element
     */
    public boolean isSetValueHumanName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(VALUEHUMANNAME$40) != 0;
        }
    }
    
    /**
     * Sets the "valueHumanName" element
     */
    public void setValueHumanName(org.hl7.fhir.HumanName valueHumanName)
    {
        generatedSetterHelperImpl(valueHumanName, VALUEHUMANNAME$40, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "valueHumanName" element
     */
    public org.hl7.fhir.HumanName addNewValueHumanName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.HumanName target = null;
            target = (org.hl7.fhir.HumanName)get_store().add_element_user(VALUEHUMANNAME$40);
            return target;
        }
    }
    
    /**
     * Unsets the "valueHumanName" element
     */
    public void unsetValueHumanName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(VALUEHUMANNAME$40, 0);
        }
    }
    
    /**
     * Gets the "valueAddress" element
     */
    public org.hl7.fhir.Address getValueAddress()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.Address target = null;
            target = (org.hl7.fhir.Address)get_store().find_element_user(VALUEADDRESS$42, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "valueAddress" element
     */
    public boolean isSetValueAddress()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(VALUEADDRESS$42) != 0;
        }
    }
    
    /**
     * Sets the "valueAddress" element
     */
    public void setValueAddress(org.hl7.fhir.Address valueAddress)
    {
        generatedSetterHelperImpl(valueAddress, VALUEADDRESS$42, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "valueAddress" element
     */
    public org.hl7.fhir.Address addNewValueAddress()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.Address target = null;
            target = (org.hl7.fhir.Address)get_store().add_element_user(VALUEADDRESS$42);
            return target;
        }
    }
    
    /**
     * Unsets the "valueAddress" element
     */
    public void unsetValueAddress()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(VALUEADDRESS$42, 0);
        }
    }
    
    /**
     * Gets the "valueContact" element
     */
    public org.hl7.fhir.Contact getValueContact()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.Contact target = null;
            target = (org.hl7.fhir.Contact)get_store().find_element_user(VALUECONTACT$44, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "valueContact" element
     */
    public boolean isSetValueContact()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(VALUECONTACT$44) != 0;
        }
    }
    
    /**
     * Sets the "valueContact" element
     */
    public void setValueContact(org.hl7.fhir.Contact valueContact)
    {
        generatedSetterHelperImpl(valueContact, VALUECONTACT$44, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "valueContact" element
     */
    public org.hl7.fhir.Contact addNewValueContact()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.Contact target = null;
            target = (org.hl7.fhir.Contact)get_store().add_element_user(VALUECONTACT$44);
            return target;
        }
    }
    
    /**
     * Unsets the "valueContact" element
     */
    public void unsetValueContact()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(VALUECONTACT$44, 0);
        }
    }
    
    /**
     * Gets the "valueSchedule" element
     */
    public org.hl7.fhir.Schedule getValueSchedule()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.Schedule target = null;
            target = (org.hl7.fhir.Schedule)get_store().find_element_user(VALUESCHEDULE$46, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "valueSchedule" element
     */
    public boolean isSetValueSchedule()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(VALUESCHEDULE$46) != 0;
        }
    }
    
    /**
     * Sets the "valueSchedule" element
     */
    public void setValueSchedule(org.hl7.fhir.Schedule valueSchedule)
    {
        generatedSetterHelperImpl(valueSchedule, VALUESCHEDULE$46, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "valueSchedule" element
     */
    public org.hl7.fhir.Schedule addNewValueSchedule()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.Schedule target = null;
            target = (org.hl7.fhir.Schedule)get_store().add_element_user(VALUESCHEDULE$46);
            return target;
        }
    }
    
    /**
     * Unsets the "valueSchedule" element
     */
    public void unsetValueSchedule()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(VALUESCHEDULE$46, 0);
        }
    }
    
    /**
     * Gets the "url" attribute
     */
    public java.lang.String getUrl()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(URL$48);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "url" attribute
     */
    public org.hl7.fhir.UriPrimitive xgetUrl()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.UriPrimitive target = null;
            target = (org.hl7.fhir.UriPrimitive)get_store().find_attribute_user(URL$48);
            return target;
        }
    }
    
    /**
     * Sets the "url" attribute
     */
    public void setUrl(java.lang.String url)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(URL$48);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(URL$48);
            }
            target.setStringValue(url);
        }
    }
    
    /**
     * Sets (as xml) the "url" attribute
     */
    public void xsetUrl(org.hl7.fhir.UriPrimitive url)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.UriPrimitive target = null;
            target = (org.hl7.fhir.UriPrimitive)get_store().find_attribute_user(URL$48);
            if (target == null)
            {
                target = (org.hl7.fhir.UriPrimitive)get_store().add_attribute_user(URL$48);
            }
            target.set(url);
        }
    }
}
