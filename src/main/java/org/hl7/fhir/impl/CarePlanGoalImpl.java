/*
 * XML Type:  CarePlan.Goal
 * Namespace: http://hl7.org/fhir
 * Java type: org.hl7.fhir.CarePlanGoal
 *
 * Automatically generated - do not modify.
 */
package org.hl7.fhir.impl;
/**
 * An XML CarePlan.Goal(@http://hl7.org/fhir).
 *
 * This is a complex type.
 */
public class CarePlanGoalImpl extends org.hl7.fhir.impl.BackboneElementImpl implements org.hl7.fhir.CarePlanGoal
{
    private static final long serialVersionUID = 1L;
    
    public CarePlanGoalImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName DESCRIPTION$0 = 
        new javax.xml.namespace.QName("http://hl7.org/fhir", "description");
    private static final javax.xml.namespace.QName STATUS$2 = 
        new javax.xml.namespace.QName("http://hl7.org/fhir", "status");
    private static final javax.xml.namespace.QName NOTES$4 = 
        new javax.xml.namespace.QName("http://hl7.org/fhir", "notes");
    private static final javax.xml.namespace.QName CONCERN$6 = 
        new javax.xml.namespace.QName("http://hl7.org/fhir", "concern");
    
    
    /**
     * Gets the "description" element
     */
    public org.hl7.fhir.String getDescription()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.String target = null;
            target = (org.hl7.fhir.String)get_store().find_element_user(DESCRIPTION$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "description" element
     */
    public void setDescription(org.hl7.fhir.String description)
    {
        generatedSetterHelperImpl(description, DESCRIPTION$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "description" element
     */
    public org.hl7.fhir.String addNewDescription()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.String target = null;
            target = (org.hl7.fhir.String)get_store().add_element_user(DESCRIPTION$0);
            return target;
        }
    }
    
    /**
     * Gets the "status" element
     */
    public org.hl7.fhir.CarePlanGoalStatus getStatus()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.CarePlanGoalStatus target = null;
            target = (org.hl7.fhir.CarePlanGoalStatus)get_store().find_element_user(STATUS$2, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "status" element
     */
    public boolean isSetStatus()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(STATUS$2) != 0;
        }
    }
    
    /**
     * Sets the "status" element
     */
    public void setStatus(org.hl7.fhir.CarePlanGoalStatus status)
    {
        generatedSetterHelperImpl(status, STATUS$2, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "status" element
     */
    public org.hl7.fhir.CarePlanGoalStatus addNewStatus()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.CarePlanGoalStatus target = null;
            target = (org.hl7.fhir.CarePlanGoalStatus)get_store().add_element_user(STATUS$2);
            return target;
        }
    }
    
    /**
     * Unsets the "status" element
     */
    public void unsetStatus()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(STATUS$2, 0);
        }
    }
    
    /**
     * Gets the "notes" element
     */
    public org.hl7.fhir.String getNotes()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.String target = null;
            target = (org.hl7.fhir.String)get_store().find_element_user(NOTES$4, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "notes" element
     */
    public boolean isSetNotes()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(NOTES$4) != 0;
        }
    }
    
    /**
     * Sets the "notes" element
     */
    public void setNotes(org.hl7.fhir.String notes)
    {
        generatedSetterHelperImpl(notes, NOTES$4, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "notes" element
     */
    public org.hl7.fhir.String addNewNotes()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.String target = null;
            target = (org.hl7.fhir.String)get_store().add_element_user(NOTES$4);
            return target;
        }
    }
    
    /**
     * Unsets the "notes" element
     */
    public void unsetNotes()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(NOTES$4, 0);
        }
    }
    
    /**
     * Gets array of all "concern" elements
     */
    public org.hl7.fhir.ResourceReference[] getConcernArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(CONCERN$6, targetList);
            org.hl7.fhir.ResourceReference[] result = new org.hl7.fhir.ResourceReference[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "concern" element
     */
    public org.hl7.fhir.ResourceReference getConcernArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.ResourceReference target = null;
            target = (org.hl7.fhir.ResourceReference)get_store().find_element_user(CONCERN$6, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "concern" element
     */
    public int sizeOfConcernArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(CONCERN$6);
        }
    }
    
    /**
     * Sets array of all "concern" element  WARNING: This method is not atomicaly synchronized.
     */
    public void setConcernArray(org.hl7.fhir.ResourceReference[] concernArray)
    {
        check_orphaned();
        arraySetterHelper(concernArray, CONCERN$6);
    }
    
    /**
     * Sets ith "concern" element
     */
    public void setConcernArray(int i, org.hl7.fhir.ResourceReference concern)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.ResourceReference target = null;
            target = (org.hl7.fhir.ResourceReference)get_store().find_element_user(CONCERN$6, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(concern);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "concern" element
     */
    public org.hl7.fhir.ResourceReference insertNewConcern(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.ResourceReference target = null;
            target = (org.hl7.fhir.ResourceReference)get_store().insert_element_user(CONCERN$6, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "concern" element
     */
    public org.hl7.fhir.ResourceReference addNewConcern()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.ResourceReference target = null;
            target = (org.hl7.fhir.ResourceReference)get_store().add_element_user(CONCERN$6);
            return target;
        }
    }
    
    /**
     * Removes the ith "concern" element
     */
    public void removeConcern(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(CONCERN$6, i);
        }
    }
}
