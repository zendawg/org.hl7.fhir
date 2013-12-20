/*
 * XML Type:  CarePlan.Activity
 * Namespace: http://hl7.org/fhir
 * Java type: org.hl7.fhir.CarePlanActivity
 *
 * Automatically generated - do not modify.
 */
package org.hl7.fhir.impl;
/**
 * An XML CarePlan.Activity(@http://hl7.org/fhir).
 *
 * This is a complex type.
 */
public class CarePlanActivityImpl extends org.hl7.fhir.impl.BackboneElementImpl implements org.hl7.fhir.CarePlanActivity
{
    private static final long serialVersionUID = 1L;
    
    public CarePlanActivityImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName GOAL$0 = 
        new javax.xml.namespace.QName("http://hl7.org/fhir", "goal");
    private static final javax.xml.namespace.QName STATUS$2 = 
        new javax.xml.namespace.QName("http://hl7.org/fhir", "status");
    private static final javax.xml.namespace.QName PROHIBITED$4 = 
        new javax.xml.namespace.QName("http://hl7.org/fhir", "prohibited");
    private static final javax.xml.namespace.QName ACTIONRESULTING$6 = 
        new javax.xml.namespace.QName("http://hl7.org/fhir", "actionResulting");
    private static final javax.xml.namespace.QName NOTES$8 = 
        new javax.xml.namespace.QName("http://hl7.org/fhir", "notes");
    private static final javax.xml.namespace.QName DETAIL$10 = 
        new javax.xml.namespace.QName("http://hl7.org/fhir", "detail");
    private static final javax.xml.namespace.QName SIMPLE$12 = 
        new javax.xml.namespace.QName("http://hl7.org/fhir", "simple");
    
    
    /**
     * Gets array of all "goal" elements
     */
    public java.lang.String[] getGoalArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(GOAL$0, targetList);
            java.lang.String[] result = new java.lang.String[targetList.size()];
            for (int i = 0, len = targetList.size() ; i < len ; i++)
                result[i] = ((org.apache.xmlbeans.SimpleValue)targetList.get(i)).getStringValue();
            return result;
        }
    }
    
    /**
     * Gets ith "goal" element
     */
    public java.lang.String getGoalArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(GOAL$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) array of all "goal" elements
     */
    public org.hl7.fhir.XmlIdRef[] xgetGoalArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(GOAL$0, targetList);
            org.hl7.fhir.XmlIdRef[] result = new org.hl7.fhir.XmlIdRef[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets (as xml) ith "goal" element
     */
    public org.hl7.fhir.XmlIdRef xgetGoalArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.XmlIdRef target = null;
            target = (org.hl7.fhir.XmlIdRef)get_store().find_element_user(GOAL$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "goal" element
     */
    public int sizeOfGoalArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(GOAL$0);
        }
    }
    
    /**
     * Sets array of all "goal" element
     */
    public void setGoalArray(java.lang.String[] goalArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(goalArray, GOAL$0);
        }
    }
    
    /**
     * Sets ith "goal" element
     */
    public void setGoalArray(int i, java.lang.String goal)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(GOAL$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.setStringValue(goal);
        }
    }
    
    /**
     * Sets (as xml) array of all "goal" element
     */
    public void xsetGoalArray(org.hl7.fhir.XmlIdRef[]goalArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(goalArray, GOAL$0);
        }
    }
    
    /**
     * Sets (as xml) ith "goal" element
     */
    public void xsetGoalArray(int i, org.hl7.fhir.XmlIdRef goal)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.XmlIdRef target = null;
            target = (org.hl7.fhir.XmlIdRef)get_store().find_element_user(GOAL$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(goal);
        }
    }
    
    /**
     * Inserts the value as the ith "goal" element
     */
    public void insertGoal(int i, java.lang.String goal)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = 
                (org.apache.xmlbeans.SimpleValue)get_store().insert_element_user(GOAL$0, i);
            target.setStringValue(goal);
        }
    }
    
    /**
     * Appends the value as the last "goal" element
     */
    public void addGoal(java.lang.String goal)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(GOAL$0);
            target.setStringValue(goal);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "goal" element
     */
    public org.hl7.fhir.XmlIdRef insertNewGoal(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.XmlIdRef target = null;
            target = (org.hl7.fhir.XmlIdRef)get_store().insert_element_user(GOAL$0, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "goal" element
     */
    public org.hl7.fhir.XmlIdRef addNewGoal()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.XmlIdRef target = null;
            target = (org.hl7.fhir.XmlIdRef)get_store().add_element_user(GOAL$0);
            return target;
        }
    }
    
    /**
     * Removes the ith "goal" element
     */
    public void removeGoal(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(GOAL$0, i);
        }
    }
    
    /**
     * Gets the "status" element
     */
    public org.hl7.fhir.CarePlanActivityStatus getStatus()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.CarePlanActivityStatus target = null;
            target = (org.hl7.fhir.CarePlanActivityStatus)get_store().find_element_user(STATUS$2, 0);
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
    public void setStatus(org.hl7.fhir.CarePlanActivityStatus status)
    {
        generatedSetterHelperImpl(status, STATUS$2, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "status" element
     */
    public org.hl7.fhir.CarePlanActivityStatus addNewStatus()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.CarePlanActivityStatus target = null;
            target = (org.hl7.fhir.CarePlanActivityStatus)get_store().add_element_user(STATUS$2);
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
     * Gets the "prohibited" element
     */
    public org.hl7.fhir.Boolean getProhibited()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.Boolean target = null;
            target = (org.hl7.fhir.Boolean)get_store().find_element_user(PROHIBITED$4, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "prohibited" element
     */
    public void setProhibited(org.hl7.fhir.Boolean prohibited)
    {
        generatedSetterHelperImpl(prohibited, PROHIBITED$4, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "prohibited" element
     */
    public org.hl7.fhir.Boolean addNewProhibited()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.Boolean target = null;
            target = (org.hl7.fhir.Boolean)get_store().add_element_user(PROHIBITED$4);
            return target;
        }
    }
    
    /**
     * Gets array of all "actionResulting" elements
     */
    public org.hl7.fhir.ResourceReference[] getActionResultingArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(ACTIONRESULTING$6, targetList);
            org.hl7.fhir.ResourceReference[] result = new org.hl7.fhir.ResourceReference[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "actionResulting" element
     */
    public org.hl7.fhir.ResourceReference getActionResultingArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.ResourceReference target = null;
            target = (org.hl7.fhir.ResourceReference)get_store().find_element_user(ACTIONRESULTING$6, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "actionResulting" element
     */
    public int sizeOfActionResultingArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(ACTIONRESULTING$6);
        }
    }
    
    /**
     * Sets array of all "actionResulting" element  WARNING: This method is not atomicaly synchronized.
     */
    public void setActionResultingArray(org.hl7.fhir.ResourceReference[] actionResultingArray)
    {
        check_orphaned();
        arraySetterHelper(actionResultingArray, ACTIONRESULTING$6);
    }
    
    /**
     * Sets ith "actionResulting" element
     */
    public void setActionResultingArray(int i, org.hl7.fhir.ResourceReference actionResulting)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.ResourceReference target = null;
            target = (org.hl7.fhir.ResourceReference)get_store().find_element_user(ACTIONRESULTING$6, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(actionResulting);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "actionResulting" element
     */
    public org.hl7.fhir.ResourceReference insertNewActionResulting(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.ResourceReference target = null;
            target = (org.hl7.fhir.ResourceReference)get_store().insert_element_user(ACTIONRESULTING$6, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "actionResulting" element
     */
    public org.hl7.fhir.ResourceReference addNewActionResulting()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.ResourceReference target = null;
            target = (org.hl7.fhir.ResourceReference)get_store().add_element_user(ACTIONRESULTING$6);
            return target;
        }
    }
    
    /**
     * Removes the ith "actionResulting" element
     */
    public void removeActionResulting(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(ACTIONRESULTING$6, i);
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
            target = (org.hl7.fhir.String)get_store().find_element_user(NOTES$8, 0);
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
            return get_store().count_elements(NOTES$8) != 0;
        }
    }
    
    /**
     * Sets the "notes" element
     */
    public void setNotes(org.hl7.fhir.String notes)
    {
        generatedSetterHelperImpl(notes, NOTES$8, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
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
            target = (org.hl7.fhir.String)get_store().add_element_user(NOTES$8);
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
            get_store().remove_element(NOTES$8, 0);
        }
    }
    
    /**
     * Gets the "detail" element
     */
    public org.hl7.fhir.ResourceReference getDetail()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.ResourceReference target = null;
            target = (org.hl7.fhir.ResourceReference)get_store().find_element_user(DETAIL$10, 0);
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
            return get_store().count_elements(DETAIL$10) != 0;
        }
    }
    
    /**
     * Sets the "detail" element
     */
    public void setDetail(org.hl7.fhir.ResourceReference detail)
    {
        generatedSetterHelperImpl(detail, DETAIL$10, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "detail" element
     */
    public org.hl7.fhir.ResourceReference addNewDetail()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.ResourceReference target = null;
            target = (org.hl7.fhir.ResourceReference)get_store().add_element_user(DETAIL$10);
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
            get_store().remove_element(DETAIL$10, 0);
        }
    }
    
    /**
     * Gets the "simple" element
     */
    public org.hl7.fhir.CarePlanSimple getSimple()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.CarePlanSimple target = null;
            target = (org.hl7.fhir.CarePlanSimple)get_store().find_element_user(SIMPLE$12, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "simple" element
     */
    public boolean isSetSimple()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(SIMPLE$12) != 0;
        }
    }
    
    /**
     * Sets the "simple" element
     */
    public void setSimple(org.hl7.fhir.CarePlanSimple simple)
    {
        generatedSetterHelperImpl(simple, SIMPLE$12, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "simple" element
     */
    public org.hl7.fhir.CarePlanSimple addNewSimple()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.CarePlanSimple target = null;
            target = (org.hl7.fhir.CarePlanSimple)get_store().add_element_user(SIMPLE$12);
            return target;
        }
    }
    
    /**
     * Unsets the "simple" element
     */
    public void unsetSimple()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(SIMPLE$12, 0);
        }
    }
}
