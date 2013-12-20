/*
 * XML Type:  Condition.Evidence
 * Namespace: http://hl7.org/fhir
 * Java type: org.hl7.fhir.ConditionEvidence
 *
 * Automatically generated - do not modify.
 */
package org.hl7.fhir.impl;
/**
 * An XML Condition.Evidence(@http://hl7.org/fhir).
 *
 * This is a complex type.
 */
public class ConditionEvidenceImpl extends org.hl7.fhir.impl.BackboneElementImpl implements org.hl7.fhir.ConditionEvidence
{
    private static final long serialVersionUID = 1L;
    
    public ConditionEvidenceImpl(org.apache.xmlbeans.SchemaType sType)
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
     * Gets array of all "detail" elements
     */
    public org.hl7.fhir.ResourceReference[] getDetailArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(DETAIL$2, targetList);
            org.hl7.fhir.ResourceReference[] result = new org.hl7.fhir.ResourceReference[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "detail" element
     */
    public org.hl7.fhir.ResourceReference getDetailArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.ResourceReference target = null;
            target = (org.hl7.fhir.ResourceReference)get_store().find_element_user(DETAIL$2, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "detail" element
     */
    public int sizeOfDetailArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(DETAIL$2);
        }
    }
    
    /**
     * Sets array of all "detail" element  WARNING: This method is not atomicaly synchronized.
     */
    public void setDetailArray(org.hl7.fhir.ResourceReference[] detailArray)
    {
        check_orphaned();
        arraySetterHelper(detailArray, DETAIL$2);
    }
    
    /**
     * Sets ith "detail" element
     */
    public void setDetailArray(int i, org.hl7.fhir.ResourceReference detail)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.ResourceReference target = null;
            target = (org.hl7.fhir.ResourceReference)get_store().find_element_user(DETAIL$2, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(detail);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "detail" element
     */
    public org.hl7.fhir.ResourceReference insertNewDetail(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.ResourceReference target = null;
            target = (org.hl7.fhir.ResourceReference)get_store().insert_element_user(DETAIL$2, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "detail" element
     */
    public org.hl7.fhir.ResourceReference addNewDetail()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.ResourceReference target = null;
            target = (org.hl7.fhir.ResourceReference)get_store().add_element_user(DETAIL$2);
            return target;
        }
    }
    
    /**
     * Removes the ith "detail" element
     */
    public void removeDetail(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(DETAIL$2, i);
        }
    }
}
