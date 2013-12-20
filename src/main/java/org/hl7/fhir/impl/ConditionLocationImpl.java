/*
 * XML Type:  Condition.Location
 * Namespace: http://hl7.org/fhir
 * Java type: org.hl7.fhir.ConditionLocation
 *
 * Automatically generated - do not modify.
 */
package org.hl7.fhir.impl;
/**
 * An XML Condition.Location(@http://hl7.org/fhir).
 *
 * This is a complex type.
 */
public class ConditionLocationImpl extends org.hl7.fhir.impl.BackboneElementImpl implements org.hl7.fhir.ConditionLocation
{
    private static final long serialVersionUID = 1L;
    
    public ConditionLocationImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName CODE$0 = 
        new javax.xml.namespace.QName("http://hl7.org/fhir", "code");
    private static final javax.xml.namespace.QName DETAIL$2 = 
        new javax.xml.namespace.QName("http://hl7.org/fhir", "detail");
    
    
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
     * Gets the "detail" element
     */
    public org.hl7.fhir.String getDetail()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.String target = null;
            target = (org.hl7.fhir.String)get_store().find_element_user(DETAIL$2, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "detail" element
     */
    public boolean isSetDetail()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(DETAIL$2) != 0;
        }
    }
    
    /**
     * Sets the "detail" element
     */
    public void setDetail(org.hl7.fhir.String detail)
    {
        generatedSetterHelperImpl(detail, DETAIL$2, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "detail" element
     */
    public org.hl7.fhir.String addNewDetail()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.String target = null;
            target = (org.hl7.fhir.String)get_store().add_element_user(DETAIL$2);
            return target;
        }
    }
    
    /**
     * Unsets the "detail" element
     */
    public void unsetDetail()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(DETAIL$2, 0);
        }
    }
}
