/*
 * XML Type:  ImmunizationRecommendation
 * Namespace: http://hl7.org/fhir
 * Java type: org.hl7.fhir.ImmunizationRecommendation
 *
 * Automatically generated - do not modify.
 */
package org.hl7.fhir.impl;
/**
 * An XML ImmunizationRecommendation(@http://hl7.org/fhir).
 *
 * This is a complex type.
 */
public class ImmunizationRecommendationImpl extends org.hl7.fhir.impl.ResourceImpl implements org.hl7.fhir.ImmunizationRecommendation
{
    private static final long serialVersionUID = 1L;
    
    public ImmunizationRecommendationImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName IDENTIFIER$0 = 
        new javax.xml.namespace.QName("http://hl7.org/fhir", "identifier");
    private static final javax.xml.namespace.QName SUBJECT$2 = 
        new javax.xml.namespace.QName("http://hl7.org/fhir", "subject");
    private static final javax.xml.namespace.QName RECOMMENDATION$4 = 
        new javax.xml.namespace.QName("http://hl7.org/fhir", "recommendation");
    
    
    /**
     * Gets array of all "identifier" elements
     */
    public org.hl7.fhir.Identifier[] getIdentifierArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(IDENTIFIER$0, targetList);
            org.hl7.fhir.Identifier[] result = new org.hl7.fhir.Identifier[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "identifier" element
     */
    public org.hl7.fhir.Identifier getIdentifierArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.Identifier target = null;
            target = (org.hl7.fhir.Identifier)get_store().find_element_user(IDENTIFIER$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "identifier" element
     */
    public int sizeOfIdentifierArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(IDENTIFIER$0);
        }
    }
    
    /**
     * Sets array of all "identifier" element  WARNING: This method is not atomicaly synchronized.
     */
    public void setIdentifierArray(org.hl7.fhir.Identifier[] identifierArray)
    {
        check_orphaned();
        arraySetterHelper(identifierArray, IDENTIFIER$0);
    }
    
    /**
     * Sets ith "identifier" element
     */
    public void setIdentifierArray(int i, org.hl7.fhir.Identifier identifier)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.Identifier target = null;
            target = (org.hl7.fhir.Identifier)get_store().find_element_user(IDENTIFIER$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(identifier);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "identifier" element
     */
    public org.hl7.fhir.Identifier insertNewIdentifier(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.Identifier target = null;
            target = (org.hl7.fhir.Identifier)get_store().insert_element_user(IDENTIFIER$0, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "identifier" element
     */
    public org.hl7.fhir.Identifier addNewIdentifier()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.Identifier target = null;
            target = (org.hl7.fhir.Identifier)get_store().add_element_user(IDENTIFIER$0);
            return target;
        }
    }
    
    /**
     * Removes the ith "identifier" element
     */
    public void removeIdentifier(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(IDENTIFIER$0, i);
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
            target = (org.hl7.fhir.ResourceReference)get_store().find_element_user(SUBJECT$2, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "subject" element
     */
    public void setSubject(org.hl7.fhir.ResourceReference subject)
    {
        generatedSetterHelperImpl(subject, SUBJECT$2, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
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
            target = (org.hl7.fhir.ResourceReference)get_store().add_element_user(SUBJECT$2);
            return target;
        }
    }
    
    /**
     * Gets array of all "recommendation" elements
     */
    public org.hl7.fhir.ImmunizationRecommendationRecommendation[] getRecommendationArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(RECOMMENDATION$4, targetList);
            org.hl7.fhir.ImmunizationRecommendationRecommendation[] result = new org.hl7.fhir.ImmunizationRecommendationRecommendation[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "recommendation" element
     */
    public org.hl7.fhir.ImmunizationRecommendationRecommendation getRecommendationArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.ImmunizationRecommendationRecommendation target = null;
            target = (org.hl7.fhir.ImmunizationRecommendationRecommendation)get_store().find_element_user(RECOMMENDATION$4, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "recommendation" element
     */
    public int sizeOfRecommendationArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(RECOMMENDATION$4);
        }
    }
    
    /**
     * Sets array of all "recommendation" element  WARNING: This method is not atomicaly synchronized.
     */
    public void setRecommendationArray(org.hl7.fhir.ImmunizationRecommendationRecommendation[] recommendationArray)
    {
        check_orphaned();
        arraySetterHelper(recommendationArray, RECOMMENDATION$4);
    }
    
    /**
     * Sets ith "recommendation" element
     */
    public void setRecommendationArray(int i, org.hl7.fhir.ImmunizationRecommendationRecommendation recommendation)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.ImmunizationRecommendationRecommendation target = null;
            target = (org.hl7.fhir.ImmunizationRecommendationRecommendation)get_store().find_element_user(RECOMMENDATION$4, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(recommendation);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "recommendation" element
     */
    public org.hl7.fhir.ImmunizationRecommendationRecommendation insertNewRecommendation(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.ImmunizationRecommendationRecommendation target = null;
            target = (org.hl7.fhir.ImmunizationRecommendationRecommendation)get_store().insert_element_user(RECOMMENDATION$4, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "recommendation" element
     */
    public org.hl7.fhir.ImmunizationRecommendationRecommendation addNewRecommendation()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.ImmunizationRecommendationRecommendation target = null;
            target = (org.hl7.fhir.ImmunizationRecommendationRecommendation)get_store().add_element_user(RECOMMENDATION$4);
            return target;
        }
    }
    
    /**
     * Removes the ith "recommendation" element
     */
    public void removeRecommendation(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(RECOMMENDATION$4, i);
        }
    }
}
