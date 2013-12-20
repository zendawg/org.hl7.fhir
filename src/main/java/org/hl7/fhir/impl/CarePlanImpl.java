/*
 * XML Type:  CarePlan
 * Namespace: http://hl7.org/fhir
 * Java type: org.hl7.fhir.CarePlan
 *
 * Automatically generated - do not modify.
 */
package org.hl7.fhir.impl;
/**
 * An XML CarePlan(@http://hl7.org/fhir).
 *
 * This is a complex type.
 */
public class CarePlanImpl extends org.hl7.fhir.impl.ResourceImpl implements org.hl7.fhir.CarePlan
{
    private static final long serialVersionUID = 1L;
    
    public CarePlanImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName IDENTIFIER$0 = 
        new javax.xml.namespace.QName("http://hl7.org/fhir", "identifier");
    private static final javax.xml.namespace.QName PATIENT$2 = 
        new javax.xml.namespace.QName("http://hl7.org/fhir", "patient");
    private static final javax.xml.namespace.QName STATUS$4 = 
        new javax.xml.namespace.QName("http://hl7.org/fhir", "status");
    private static final javax.xml.namespace.QName PERIOD$6 = 
        new javax.xml.namespace.QName("http://hl7.org/fhir", "period");
    private static final javax.xml.namespace.QName MODIFIED$8 = 
        new javax.xml.namespace.QName("http://hl7.org/fhir", "modified");
    private static final javax.xml.namespace.QName CONCERN$10 = 
        new javax.xml.namespace.QName("http://hl7.org/fhir", "concern");
    private static final javax.xml.namespace.QName PARTICIPANT$12 = 
        new javax.xml.namespace.QName("http://hl7.org/fhir", "participant");
    private static final javax.xml.namespace.QName GOAL$14 = 
        new javax.xml.namespace.QName("http://hl7.org/fhir", "goal");
    private static final javax.xml.namespace.QName ACTIVITY$16 = 
        new javax.xml.namespace.QName("http://hl7.org/fhir", "activity");
    private static final javax.xml.namespace.QName NOTES$18 = 
        new javax.xml.namespace.QName("http://hl7.org/fhir", "notes");
    
    
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
     * Gets the "patient" element
     */
    public org.hl7.fhir.ResourceReference getPatient()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.ResourceReference target = null;
            target = (org.hl7.fhir.ResourceReference)get_store().find_element_user(PATIENT$2, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "patient" element
     */
    public boolean isSetPatient()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(PATIENT$2) != 0;
        }
    }
    
    /**
     * Sets the "patient" element
     */
    public void setPatient(org.hl7.fhir.ResourceReference patient)
    {
        generatedSetterHelperImpl(patient, PATIENT$2, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "patient" element
     */
    public org.hl7.fhir.ResourceReference addNewPatient()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.ResourceReference target = null;
            target = (org.hl7.fhir.ResourceReference)get_store().add_element_user(PATIENT$2);
            return target;
        }
    }
    
    /**
     * Unsets the "patient" element
     */
    public void unsetPatient()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(PATIENT$2, 0);
        }
    }
    
    /**
     * Gets the "status" element
     */
    public org.hl7.fhir.CarePlanStatus getStatus()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.CarePlanStatus target = null;
            target = (org.hl7.fhir.CarePlanStatus)get_store().find_element_user(STATUS$4, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "status" element
     */
    public void setStatus(org.hl7.fhir.CarePlanStatus status)
    {
        generatedSetterHelperImpl(status, STATUS$4, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "status" element
     */
    public org.hl7.fhir.CarePlanStatus addNewStatus()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.CarePlanStatus target = null;
            target = (org.hl7.fhir.CarePlanStatus)get_store().add_element_user(STATUS$4);
            return target;
        }
    }
    
    /**
     * Gets the "period" element
     */
    public org.hl7.fhir.Period getPeriod()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.Period target = null;
            target = (org.hl7.fhir.Period)get_store().find_element_user(PERIOD$6, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "period" element
     */
    public boolean isSetPeriod()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(PERIOD$6) != 0;
        }
    }
    
    /**
     * Sets the "period" element
     */
    public void setPeriod(org.hl7.fhir.Period period)
    {
        generatedSetterHelperImpl(period, PERIOD$6, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "period" element
     */
    public org.hl7.fhir.Period addNewPeriod()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.Period target = null;
            target = (org.hl7.fhir.Period)get_store().add_element_user(PERIOD$6);
            return target;
        }
    }
    
    /**
     * Unsets the "period" element
     */
    public void unsetPeriod()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(PERIOD$6, 0);
        }
    }
    
    /**
     * Gets the "modified" element
     */
    public org.hl7.fhir.DateTime getModified()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.DateTime target = null;
            target = (org.hl7.fhir.DateTime)get_store().find_element_user(MODIFIED$8, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "modified" element
     */
    public boolean isSetModified()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(MODIFIED$8) != 0;
        }
    }
    
    /**
     * Sets the "modified" element
     */
    public void setModified(org.hl7.fhir.DateTime modified)
    {
        generatedSetterHelperImpl(modified, MODIFIED$8, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "modified" element
     */
    public org.hl7.fhir.DateTime addNewModified()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.DateTime target = null;
            target = (org.hl7.fhir.DateTime)get_store().add_element_user(MODIFIED$8);
            return target;
        }
    }
    
    /**
     * Unsets the "modified" element
     */
    public void unsetModified()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(MODIFIED$8, 0);
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
            get_store().find_all_element_users(CONCERN$10, targetList);
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
            target = (org.hl7.fhir.ResourceReference)get_store().find_element_user(CONCERN$10, i);
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
            return get_store().count_elements(CONCERN$10);
        }
    }
    
    /**
     * Sets array of all "concern" element  WARNING: This method is not atomicaly synchronized.
     */
    public void setConcernArray(org.hl7.fhir.ResourceReference[] concernArray)
    {
        check_orphaned();
        arraySetterHelper(concernArray, CONCERN$10);
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
            target = (org.hl7.fhir.ResourceReference)get_store().find_element_user(CONCERN$10, i);
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
            target = (org.hl7.fhir.ResourceReference)get_store().insert_element_user(CONCERN$10, i);
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
            target = (org.hl7.fhir.ResourceReference)get_store().add_element_user(CONCERN$10);
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
            get_store().remove_element(CONCERN$10, i);
        }
    }
    
    /**
     * Gets array of all "participant" elements
     */
    public org.hl7.fhir.CarePlanParticipant[] getParticipantArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(PARTICIPANT$12, targetList);
            org.hl7.fhir.CarePlanParticipant[] result = new org.hl7.fhir.CarePlanParticipant[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "participant" element
     */
    public org.hl7.fhir.CarePlanParticipant getParticipantArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.CarePlanParticipant target = null;
            target = (org.hl7.fhir.CarePlanParticipant)get_store().find_element_user(PARTICIPANT$12, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "participant" element
     */
    public int sizeOfParticipantArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(PARTICIPANT$12);
        }
    }
    
    /**
     * Sets array of all "participant" element  WARNING: This method is not atomicaly synchronized.
     */
    public void setParticipantArray(org.hl7.fhir.CarePlanParticipant[] participantArray)
    {
        check_orphaned();
        arraySetterHelper(participantArray, PARTICIPANT$12);
    }
    
    /**
     * Sets ith "participant" element
     */
    public void setParticipantArray(int i, org.hl7.fhir.CarePlanParticipant participant)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.CarePlanParticipant target = null;
            target = (org.hl7.fhir.CarePlanParticipant)get_store().find_element_user(PARTICIPANT$12, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(participant);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "participant" element
     */
    public org.hl7.fhir.CarePlanParticipant insertNewParticipant(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.CarePlanParticipant target = null;
            target = (org.hl7.fhir.CarePlanParticipant)get_store().insert_element_user(PARTICIPANT$12, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "participant" element
     */
    public org.hl7.fhir.CarePlanParticipant addNewParticipant()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.CarePlanParticipant target = null;
            target = (org.hl7.fhir.CarePlanParticipant)get_store().add_element_user(PARTICIPANT$12);
            return target;
        }
    }
    
    /**
     * Removes the ith "participant" element
     */
    public void removeParticipant(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(PARTICIPANT$12, i);
        }
    }
    
    /**
     * Gets array of all "goal" elements
     */
    public org.hl7.fhir.CarePlanGoal[] getGoalArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(GOAL$14, targetList);
            org.hl7.fhir.CarePlanGoal[] result = new org.hl7.fhir.CarePlanGoal[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "goal" element
     */
    public org.hl7.fhir.CarePlanGoal getGoalArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.CarePlanGoal target = null;
            target = (org.hl7.fhir.CarePlanGoal)get_store().find_element_user(GOAL$14, i);
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
            return get_store().count_elements(GOAL$14);
        }
    }
    
    /**
     * Sets array of all "goal" element  WARNING: This method is not atomicaly synchronized.
     */
    public void setGoalArray(org.hl7.fhir.CarePlanGoal[] goalArray)
    {
        check_orphaned();
        arraySetterHelper(goalArray, GOAL$14);
    }
    
    /**
     * Sets ith "goal" element
     */
    public void setGoalArray(int i, org.hl7.fhir.CarePlanGoal goal)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.CarePlanGoal target = null;
            target = (org.hl7.fhir.CarePlanGoal)get_store().find_element_user(GOAL$14, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(goal);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "goal" element
     */
    public org.hl7.fhir.CarePlanGoal insertNewGoal(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.CarePlanGoal target = null;
            target = (org.hl7.fhir.CarePlanGoal)get_store().insert_element_user(GOAL$14, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "goal" element
     */
    public org.hl7.fhir.CarePlanGoal addNewGoal()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.CarePlanGoal target = null;
            target = (org.hl7.fhir.CarePlanGoal)get_store().add_element_user(GOAL$14);
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
            get_store().remove_element(GOAL$14, i);
        }
    }
    
    /**
     * Gets array of all "activity" elements
     */
    public org.hl7.fhir.CarePlanActivity[] getActivityArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(ACTIVITY$16, targetList);
            org.hl7.fhir.CarePlanActivity[] result = new org.hl7.fhir.CarePlanActivity[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "activity" element
     */
    public org.hl7.fhir.CarePlanActivity getActivityArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.CarePlanActivity target = null;
            target = (org.hl7.fhir.CarePlanActivity)get_store().find_element_user(ACTIVITY$16, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "activity" element
     */
    public int sizeOfActivityArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(ACTIVITY$16);
        }
    }
    
    /**
     * Sets array of all "activity" element  WARNING: This method is not atomicaly synchronized.
     */
    public void setActivityArray(org.hl7.fhir.CarePlanActivity[] activityArray)
    {
        check_orphaned();
        arraySetterHelper(activityArray, ACTIVITY$16);
    }
    
    /**
     * Sets ith "activity" element
     */
    public void setActivityArray(int i, org.hl7.fhir.CarePlanActivity activity)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.CarePlanActivity target = null;
            target = (org.hl7.fhir.CarePlanActivity)get_store().find_element_user(ACTIVITY$16, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(activity);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "activity" element
     */
    public org.hl7.fhir.CarePlanActivity insertNewActivity(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.CarePlanActivity target = null;
            target = (org.hl7.fhir.CarePlanActivity)get_store().insert_element_user(ACTIVITY$16, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "activity" element
     */
    public org.hl7.fhir.CarePlanActivity addNewActivity()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.CarePlanActivity target = null;
            target = (org.hl7.fhir.CarePlanActivity)get_store().add_element_user(ACTIVITY$16);
            return target;
        }
    }
    
    /**
     * Removes the ith "activity" element
     */
    public void removeActivity(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(ACTIVITY$16, i);
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
            target = (org.hl7.fhir.String)get_store().find_element_user(NOTES$18, 0);
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
            return get_store().count_elements(NOTES$18) != 0;
        }
    }
    
    /**
     * Sets the "notes" element
     */
    public void setNotes(org.hl7.fhir.String notes)
    {
        generatedSetterHelperImpl(notes, NOTES$18, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
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
            target = (org.hl7.fhir.String)get_store().add_element_user(NOTES$18);
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
            get_store().remove_element(NOTES$18, 0);
        }
    }
}
