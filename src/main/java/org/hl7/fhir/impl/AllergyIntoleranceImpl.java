/*
 * XML Type:  AllergyIntolerance
 * Namespace: http://hl7.org/fhir
 * Java type: org.hl7.fhir.AllergyIntolerance
 *
 * Automatically generated - do not modify.
 */
package org.hl7.fhir.impl;
/**
 * An XML AllergyIntolerance(@http://hl7.org/fhir).
 *
 * This is a complex type.
 */
public class AllergyIntoleranceImpl extends org.hl7.fhir.impl.ResourceImpl implements org.hl7.fhir.AllergyIntolerance
{
    private static final long serialVersionUID = 1L;
    
    public AllergyIntoleranceImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName IDENTIFIER$0 = 
        new javax.xml.namespace.QName("http://hl7.org/fhir", "identifier");
    private static final javax.xml.namespace.QName CRITICALITY$2 = 
        new javax.xml.namespace.QName("http://hl7.org/fhir", "criticality");
    private static final javax.xml.namespace.QName SENSITIVITYTYPE$4 = 
        new javax.xml.namespace.QName("http://hl7.org/fhir", "sensitivityType");
    private static final javax.xml.namespace.QName RECORDEDDATE$6 = 
        new javax.xml.namespace.QName("http://hl7.org/fhir", "recordedDate");
    private static final javax.xml.namespace.QName STATUS$8 = 
        new javax.xml.namespace.QName("http://hl7.org/fhir", "status");
    private static final javax.xml.namespace.QName SUBJECT$10 = 
        new javax.xml.namespace.QName("http://hl7.org/fhir", "subject");
    private static final javax.xml.namespace.QName RECORDER$12 = 
        new javax.xml.namespace.QName("http://hl7.org/fhir", "recorder");
    private static final javax.xml.namespace.QName SUBSTANCE$14 = 
        new javax.xml.namespace.QName("http://hl7.org/fhir", "substance");
    private static final javax.xml.namespace.QName REACTION$16 = 
        new javax.xml.namespace.QName("http://hl7.org/fhir", "reaction");
    private static final javax.xml.namespace.QName SENSITIVITYTEST$18 = 
        new javax.xml.namespace.QName("http://hl7.org/fhir", "sensitivityTest");
    
    
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
     * Gets the "criticality" element
     */
    public org.hl7.fhir.Criticality getCriticality()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.Criticality target = null;
            target = (org.hl7.fhir.Criticality)get_store().find_element_user(CRITICALITY$2, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "criticality" element
     */
    public boolean isSetCriticality()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(CRITICALITY$2) != 0;
        }
    }
    
    /**
     * Sets the "criticality" element
     */
    public void setCriticality(org.hl7.fhir.Criticality criticality)
    {
        generatedSetterHelperImpl(criticality, CRITICALITY$2, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "criticality" element
     */
    public org.hl7.fhir.Criticality addNewCriticality()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.Criticality target = null;
            target = (org.hl7.fhir.Criticality)get_store().add_element_user(CRITICALITY$2);
            return target;
        }
    }
    
    /**
     * Unsets the "criticality" element
     */
    public void unsetCriticality()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(CRITICALITY$2, 0);
        }
    }
    
    /**
     * Gets the "sensitivityType" element
     */
    public org.hl7.fhir.SensitivityType getSensitivityType()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.SensitivityType target = null;
            target = (org.hl7.fhir.SensitivityType)get_store().find_element_user(SENSITIVITYTYPE$4, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "sensitivityType" element
     */
    public void setSensitivityType(org.hl7.fhir.SensitivityType sensitivityType)
    {
        generatedSetterHelperImpl(sensitivityType, SENSITIVITYTYPE$4, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "sensitivityType" element
     */
    public org.hl7.fhir.SensitivityType addNewSensitivityType()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.SensitivityType target = null;
            target = (org.hl7.fhir.SensitivityType)get_store().add_element_user(SENSITIVITYTYPE$4);
            return target;
        }
    }
    
    /**
     * Gets the "recordedDate" element
     */
    public org.hl7.fhir.DateTime getRecordedDate()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.DateTime target = null;
            target = (org.hl7.fhir.DateTime)get_store().find_element_user(RECORDEDDATE$6, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "recordedDate" element
     */
    public boolean isSetRecordedDate()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(RECORDEDDATE$6) != 0;
        }
    }
    
    /**
     * Sets the "recordedDate" element
     */
    public void setRecordedDate(org.hl7.fhir.DateTime recordedDate)
    {
        generatedSetterHelperImpl(recordedDate, RECORDEDDATE$6, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "recordedDate" element
     */
    public org.hl7.fhir.DateTime addNewRecordedDate()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.DateTime target = null;
            target = (org.hl7.fhir.DateTime)get_store().add_element_user(RECORDEDDATE$6);
            return target;
        }
    }
    
    /**
     * Unsets the "recordedDate" element
     */
    public void unsetRecordedDate()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(RECORDEDDATE$6, 0);
        }
    }
    
    /**
     * Gets the "status" element
     */
    public org.hl7.fhir.SensitivityStatus getStatus()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.SensitivityStatus target = null;
            target = (org.hl7.fhir.SensitivityStatus)get_store().find_element_user(STATUS$8, 0);
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
    public void setStatus(org.hl7.fhir.SensitivityStatus status)
    {
        generatedSetterHelperImpl(status, STATUS$8, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "status" element
     */
    public org.hl7.fhir.SensitivityStatus addNewStatus()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.SensitivityStatus target = null;
            target = (org.hl7.fhir.SensitivityStatus)get_store().add_element_user(STATUS$8);
            return target;
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
            target = (org.hl7.fhir.ResourceReference)get_store().find_element_user(SUBJECT$10, 0);
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
        generatedSetterHelperImpl(subject, SUBJECT$10, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
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
            target = (org.hl7.fhir.ResourceReference)get_store().add_element_user(SUBJECT$10);
            return target;
        }
    }
    
    /**
     * Gets the "recorder" element
     */
    public org.hl7.fhir.ResourceReference getRecorder()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.ResourceReference target = null;
            target = (org.hl7.fhir.ResourceReference)get_store().find_element_user(RECORDER$12, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "recorder" element
     */
    public boolean isSetRecorder()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(RECORDER$12) != 0;
        }
    }
    
    /**
     * Sets the "recorder" element
     */
    public void setRecorder(org.hl7.fhir.ResourceReference recorder)
    {
        generatedSetterHelperImpl(recorder, RECORDER$12, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "recorder" element
     */
    public org.hl7.fhir.ResourceReference addNewRecorder()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.ResourceReference target = null;
            target = (org.hl7.fhir.ResourceReference)get_store().add_element_user(RECORDER$12);
            return target;
        }
    }
    
    /**
     * Unsets the "recorder" element
     */
    public void unsetRecorder()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(RECORDER$12, 0);
        }
    }
    
    /**
     * Gets the "substance" element
     */
    public org.hl7.fhir.ResourceReference getSubstance()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.ResourceReference target = null;
            target = (org.hl7.fhir.ResourceReference)get_store().find_element_user(SUBSTANCE$14, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "substance" element
     */
    public void setSubstance(org.hl7.fhir.ResourceReference substance)
    {
        generatedSetterHelperImpl(substance, SUBSTANCE$14, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "substance" element
     */
    public org.hl7.fhir.ResourceReference addNewSubstance()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.ResourceReference target = null;
            target = (org.hl7.fhir.ResourceReference)get_store().add_element_user(SUBSTANCE$14);
            return target;
        }
    }
    
    /**
     * Gets array of all "reaction" elements
     */
    public org.hl7.fhir.ResourceReference[] getReactionArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(REACTION$16, targetList);
            org.hl7.fhir.ResourceReference[] result = new org.hl7.fhir.ResourceReference[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "reaction" element
     */
    public org.hl7.fhir.ResourceReference getReactionArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.ResourceReference target = null;
            target = (org.hl7.fhir.ResourceReference)get_store().find_element_user(REACTION$16, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "reaction" element
     */
    public int sizeOfReactionArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(REACTION$16);
        }
    }
    
    /**
     * Sets array of all "reaction" element  WARNING: This method is not atomicaly synchronized.
     */
    public void setReactionArray(org.hl7.fhir.ResourceReference[] reactionArray)
    {
        check_orphaned();
        arraySetterHelper(reactionArray, REACTION$16);
    }
    
    /**
     * Sets ith "reaction" element
     */
    public void setReactionArray(int i, org.hl7.fhir.ResourceReference reaction)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.ResourceReference target = null;
            target = (org.hl7.fhir.ResourceReference)get_store().find_element_user(REACTION$16, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(reaction);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "reaction" element
     */
    public org.hl7.fhir.ResourceReference insertNewReaction(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.ResourceReference target = null;
            target = (org.hl7.fhir.ResourceReference)get_store().insert_element_user(REACTION$16, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "reaction" element
     */
    public org.hl7.fhir.ResourceReference addNewReaction()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.ResourceReference target = null;
            target = (org.hl7.fhir.ResourceReference)get_store().add_element_user(REACTION$16);
            return target;
        }
    }
    
    /**
     * Removes the ith "reaction" element
     */
    public void removeReaction(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(REACTION$16, i);
        }
    }
    
    /**
     * Gets array of all "sensitivityTest" elements
     */
    public org.hl7.fhir.ResourceReference[] getSensitivityTestArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(SENSITIVITYTEST$18, targetList);
            org.hl7.fhir.ResourceReference[] result = new org.hl7.fhir.ResourceReference[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "sensitivityTest" element
     */
    public org.hl7.fhir.ResourceReference getSensitivityTestArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.ResourceReference target = null;
            target = (org.hl7.fhir.ResourceReference)get_store().find_element_user(SENSITIVITYTEST$18, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "sensitivityTest" element
     */
    public int sizeOfSensitivityTestArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(SENSITIVITYTEST$18);
        }
    }
    
    /**
     * Sets array of all "sensitivityTest" element  WARNING: This method is not atomicaly synchronized.
     */
    public void setSensitivityTestArray(org.hl7.fhir.ResourceReference[] sensitivityTestArray)
    {
        check_orphaned();
        arraySetterHelper(sensitivityTestArray, SENSITIVITYTEST$18);
    }
    
    /**
     * Sets ith "sensitivityTest" element
     */
    public void setSensitivityTestArray(int i, org.hl7.fhir.ResourceReference sensitivityTest)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.ResourceReference target = null;
            target = (org.hl7.fhir.ResourceReference)get_store().find_element_user(SENSITIVITYTEST$18, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(sensitivityTest);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "sensitivityTest" element
     */
    public org.hl7.fhir.ResourceReference insertNewSensitivityTest(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.ResourceReference target = null;
            target = (org.hl7.fhir.ResourceReference)get_store().insert_element_user(SENSITIVITYTEST$18, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "sensitivityTest" element
     */
    public org.hl7.fhir.ResourceReference addNewSensitivityTest()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.ResourceReference target = null;
            target = (org.hl7.fhir.ResourceReference)get_store().add_element_user(SENSITIVITYTEST$18);
            return target;
        }
    }
    
    /**
     * Removes the ith "sensitivityTest" element
     */
    public void removeSensitivityTest(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(SENSITIVITYTEST$18, i);
        }
    }
}
