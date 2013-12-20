/*
 * XML Type:  Order.When
 * Namespace: http://hl7.org/fhir
 * Java type: org.hl7.fhir.OrderWhen
 *
 * Automatically generated - do not modify.
 */
package org.hl7.fhir.impl;
/**
 * An XML Order.When(@http://hl7.org/fhir).
 *
 * This is a complex type.
 */
public class OrderWhenImpl extends org.hl7.fhir.impl.BackboneElementImpl implements org.hl7.fhir.OrderWhen
{
    private static final long serialVersionUID = 1L;
    
    public OrderWhenImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName CODE$0 = 
        new javax.xml.namespace.QName("http://hl7.org/fhir", "code");
    private static final javax.xml.namespace.QName SCHEDULE$2 = 
        new javax.xml.namespace.QName("http://hl7.org/fhir", "schedule");
    
    
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
     * True if has "code" element
     */
    public boolean isSetCode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(CODE$0) != 0;
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
     * Unsets the "code" element
     */
    public void unsetCode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(CODE$0, 0);
        }
    }
    
    /**
     * Gets the "schedule" element
     */
    public org.hl7.fhir.Schedule getSchedule()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.Schedule target = null;
            target = (org.hl7.fhir.Schedule)get_store().find_element_user(SCHEDULE$2, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "schedule" element
     */
    public boolean isSetSchedule()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(SCHEDULE$2) != 0;
        }
    }
    
    /**
     * Sets the "schedule" element
     */
    public void setSchedule(org.hl7.fhir.Schedule schedule)
    {
        generatedSetterHelperImpl(schedule, SCHEDULE$2, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "schedule" element
     */
    public org.hl7.fhir.Schedule addNewSchedule()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.Schedule target = null;
            target = (org.hl7.fhir.Schedule)get_store().add_element_user(SCHEDULE$2);
            return target;
        }
    }
    
    /**
     * Unsets the "schedule" element
     */
    public void unsetSchedule()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(SCHEDULE$2, 0);
        }
    }
}
