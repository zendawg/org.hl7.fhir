/*
 * An XML document type.
 * Localname: Condition
 * Namespace: http://hl7.org/fhir
 * Java type: org.hl7.fhir.ConditionDocument
 *
 * Automatically generated - do not modify.
 */
package org.hl7.fhir.impl;
/**
 * A document containing one Condition(@http://hl7.org/fhir) element.
 *
 * This is a complex type.
 */
public class ConditionDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.hl7.fhir.ConditionDocument
{
    private static final long serialVersionUID = 1L;
    
    public ConditionDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName CONDITION$0 = 
        new javax.xml.namespace.QName("http://hl7.org/fhir", "Condition");
    
    
    /**
     * Gets the "Condition" element
     */
    public org.hl7.fhir.Condition getCondition()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.Condition target = null;
            target = (org.hl7.fhir.Condition)get_store().find_element_user(CONDITION$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "Condition" element
     */
    public void setCondition(org.hl7.fhir.Condition condition)
    {
        generatedSetterHelperImpl(condition, CONDITION$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "Condition" element
     */
    public org.hl7.fhir.Condition addNewCondition()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.Condition target = null;
            target = (org.hl7.fhir.Condition)get_store().add_element_user(CONDITION$0);
            return target;
        }
    }
}
