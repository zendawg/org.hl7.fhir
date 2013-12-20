/*
 * XML Type:  Condition.Stage
 * Namespace: http://hl7.org/fhir
 * Java type: org.hl7.fhir.ConditionStage
 *
 * Automatically generated - do not modify.
 */
package org.hl7.fhir.impl;
/**
 * An XML Condition.Stage(@http://hl7.org/fhir).
 *
 * This is a complex type.
 */
public class ConditionStageImpl extends org.hl7.fhir.impl.BackboneElementImpl implements org.hl7.fhir.ConditionStage
{
    private static final long serialVersionUID = 1L;
    
    public ConditionStageImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName SUMMARY$0 = 
        new javax.xml.namespace.QName("http://hl7.org/fhir", "summary");
    private static final javax.xml.namespace.QName ASSESSMENT$2 = 
        new javax.xml.namespace.QName("http://hl7.org/fhir", "assessment");
    
    
    /**
     * Gets the "summary" element
     */
    public org.hl7.fhir.CodeableConcept getSummary()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.CodeableConcept target = null;
            target = (org.hl7.fhir.CodeableConcept)get_store().find_element_user(SUMMARY$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "summary" element
     */
    public boolean isSetSummary()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(SUMMARY$0) != 0;
        }
    }
    
    /**
     * Sets the "summary" element
     */
    public void setSummary(org.hl7.fhir.CodeableConcept summary)
    {
        generatedSetterHelperImpl(summary, SUMMARY$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "summary" element
     */
    public org.hl7.fhir.CodeableConcept addNewSummary()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.CodeableConcept target = null;
            target = (org.hl7.fhir.CodeableConcept)get_store().add_element_user(SUMMARY$0);
            return target;
        }
    }
    
    /**
     * Unsets the "summary" element
     */
    public void unsetSummary()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(SUMMARY$0, 0);
        }
    }
    
    /**
     * Gets array of all "assessment" elements
     */
    public org.hl7.fhir.ResourceReference[] getAssessmentArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(ASSESSMENT$2, targetList);
            org.hl7.fhir.ResourceReference[] result = new org.hl7.fhir.ResourceReference[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "assessment" element
     */
    public org.hl7.fhir.ResourceReference getAssessmentArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.ResourceReference target = null;
            target = (org.hl7.fhir.ResourceReference)get_store().find_element_user(ASSESSMENT$2, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "assessment" element
     */
    public int sizeOfAssessmentArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(ASSESSMENT$2);
        }
    }
    
    /**
     * Sets array of all "assessment" element  WARNING: This method is not atomicaly synchronized.
     */
    public void setAssessmentArray(org.hl7.fhir.ResourceReference[] assessmentArray)
    {
        check_orphaned();
        arraySetterHelper(assessmentArray, ASSESSMENT$2);
    }
    
    /**
     * Sets ith "assessment" element
     */
    public void setAssessmentArray(int i, org.hl7.fhir.ResourceReference assessment)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.ResourceReference target = null;
            target = (org.hl7.fhir.ResourceReference)get_store().find_element_user(ASSESSMENT$2, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(assessment);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "assessment" element
     */
    public org.hl7.fhir.ResourceReference insertNewAssessment(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.ResourceReference target = null;
            target = (org.hl7.fhir.ResourceReference)get_store().insert_element_user(ASSESSMENT$2, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "assessment" element
     */
    public org.hl7.fhir.ResourceReference addNewAssessment()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.ResourceReference target = null;
            target = (org.hl7.fhir.ResourceReference)get_store().add_element_user(ASSESSMENT$2);
            return target;
        }
    }
    
    /**
     * Removes the ith "assessment" element
     */
    public void removeAssessment(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(ASSESSMENT$2, i);
        }
    }
}
