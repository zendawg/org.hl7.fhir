/*
 * XML Type:  Profile.Type
 * Namespace: http://hl7.org/fhir
 * Java type: org.hl7.fhir.ProfileType
 *
 * Automatically generated - do not modify.
 */
package org.hl7.fhir.impl;
/**
 * An XML Profile.Type(@http://hl7.org/fhir).
 *
 * This is a complex type.
 */
public class ProfileTypeImpl extends org.hl7.fhir.impl.BackboneElementImpl implements org.hl7.fhir.ProfileType
{
    private static final long serialVersionUID = 1L;
    
    public ProfileTypeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName CODE$0 = 
        new javax.xml.namespace.QName("http://hl7.org/fhir", "code");
    private static final javax.xml.namespace.QName PROFILE$2 = 
        new javax.xml.namespace.QName("http://hl7.org/fhir", "profile");
    private static final javax.xml.namespace.QName AGGREGATION$4 = 
        new javax.xml.namespace.QName("http://hl7.org/fhir", "aggregation");
    
    
    /**
     * Gets the "code" element
     */
    public org.hl7.fhir.Code getCode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.Code target = null;
            target = (org.hl7.fhir.Code)get_store().find_element_user(CODE$0, 0);
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
    public void setCode(org.hl7.fhir.Code code)
    {
        generatedSetterHelperImpl(code, CODE$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "code" element
     */
    public org.hl7.fhir.Code addNewCode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.Code target = null;
            target = (org.hl7.fhir.Code)get_store().add_element_user(CODE$0);
            return target;
        }
    }
    
    /**
     * Gets the "profile" element
     */
    public org.hl7.fhir.Uri getProfile()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.Uri target = null;
            target = (org.hl7.fhir.Uri)get_store().find_element_user(PROFILE$2, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "profile" element
     */
    public boolean isSetProfile()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(PROFILE$2) != 0;
        }
    }
    
    /**
     * Sets the "profile" element
     */
    public void setProfile(org.hl7.fhir.Uri profile)
    {
        generatedSetterHelperImpl(profile, PROFILE$2, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "profile" element
     */
    public org.hl7.fhir.Uri addNewProfile()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.Uri target = null;
            target = (org.hl7.fhir.Uri)get_store().add_element_user(PROFILE$2);
            return target;
        }
    }
    
    /**
     * Unsets the "profile" element
     */
    public void unsetProfile()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(PROFILE$2, 0);
        }
    }
    
    /**
     * Gets array of all "aggregation" elements
     */
    public org.hl7.fhir.AggregationMode[] getAggregationArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(AGGREGATION$4, targetList);
            org.hl7.fhir.AggregationMode[] result = new org.hl7.fhir.AggregationMode[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "aggregation" element
     */
    public org.hl7.fhir.AggregationMode getAggregationArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.AggregationMode target = null;
            target = (org.hl7.fhir.AggregationMode)get_store().find_element_user(AGGREGATION$4, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "aggregation" element
     */
    public int sizeOfAggregationArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(AGGREGATION$4);
        }
    }
    
    /**
     * Sets array of all "aggregation" element  WARNING: This method is not atomicaly synchronized.
     */
    public void setAggregationArray(org.hl7.fhir.AggregationMode[] aggregationArray)
    {
        check_orphaned();
        arraySetterHelper(aggregationArray, AGGREGATION$4);
    }
    
    /**
     * Sets ith "aggregation" element
     */
    public void setAggregationArray(int i, org.hl7.fhir.AggregationMode aggregation)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.AggregationMode target = null;
            target = (org.hl7.fhir.AggregationMode)get_store().find_element_user(AGGREGATION$4, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(aggregation);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "aggregation" element
     */
    public org.hl7.fhir.AggregationMode insertNewAggregation(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.AggregationMode target = null;
            target = (org.hl7.fhir.AggregationMode)get_store().insert_element_user(AGGREGATION$4, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "aggregation" element
     */
    public org.hl7.fhir.AggregationMode addNewAggregation()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.AggregationMode target = null;
            target = (org.hl7.fhir.AggregationMode)get_store().add_element_user(AGGREGATION$4);
            return target;
        }
    }
    
    /**
     * Removes the ith "aggregation" element
     */
    public void removeAggregation(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(AGGREGATION$4, i);
        }
    }
}
