/*
 * XML Type:  FamilyHistory.Relation
 * Namespace: http://hl7.org/fhir
 * Java type: org.hl7.fhir.FamilyHistoryRelation
 *
 * Automatically generated - do not modify.
 */
package org.hl7.fhir.impl;
/**
 * An XML FamilyHistory.Relation(@http://hl7.org/fhir).
 *
 * This is a complex type.
 */
public class FamilyHistoryRelationImpl extends org.hl7.fhir.impl.BackboneElementImpl implements org.hl7.fhir.FamilyHistoryRelation
{
    private static final long serialVersionUID = 1L;
    
    public FamilyHistoryRelationImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName NAME$0 = 
        new javax.xml.namespace.QName("http://hl7.org/fhir", "name");
    private static final javax.xml.namespace.QName RELATIONSHIP$2 = 
        new javax.xml.namespace.QName("http://hl7.org/fhir", "relationship");
    private static final javax.xml.namespace.QName BORNPERIOD$4 = 
        new javax.xml.namespace.QName("http://hl7.org/fhir", "bornPeriod");
    private static final javax.xml.namespace.QName BORNDATE$6 = 
        new javax.xml.namespace.QName("http://hl7.org/fhir", "bornDate");
    private static final javax.xml.namespace.QName BORNSTRING$8 = 
        new javax.xml.namespace.QName("http://hl7.org/fhir", "bornString");
    private static final javax.xml.namespace.QName DECEASEDBOOLEAN$10 = 
        new javax.xml.namespace.QName("http://hl7.org/fhir", "deceasedBoolean");
    private static final javax.xml.namespace.QName DECEASEDAGE$12 = 
        new javax.xml.namespace.QName("http://hl7.org/fhir", "deceasedAge");
    private static final javax.xml.namespace.QName DECEASEDRANGE$14 = 
        new javax.xml.namespace.QName("http://hl7.org/fhir", "deceasedRange");
    private static final javax.xml.namespace.QName DECEASEDDATE$16 = 
        new javax.xml.namespace.QName("http://hl7.org/fhir", "deceasedDate");
    private static final javax.xml.namespace.QName DECEASEDSTRING$18 = 
        new javax.xml.namespace.QName("http://hl7.org/fhir", "deceasedString");
    private static final javax.xml.namespace.QName NOTE$20 = 
        new javax.xml.namespace.QName("http://hl7.org/fhir", "note");
    private static final javax.xml.namespace.QName CONDITION$22 = 
        new javax.xml.namespace.QName("http://hl7.org/fhir", "condition");
    
    
    /**
     * Gets the "name" element
     */
    public org.hl7.fhir.String getName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.String target = null;
            target = (org.hl7.fhir.String)get_store().find_element_user(NAME$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "name" element
     */
    public boolean isSetName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(NAME$0) != 0;
        }
    }
    
    /**
     * Sets the "name" element
     */
    public void setName(org.hl7.fhir.String name)
    {
        generatedSetterHelperImpl(name, NAME$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "name" element
     */
    public org.hl7.fhir.String addNewName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.String target = null;
            target = (org.hl7.fhir.String)get_store().add_element_user(NAME$0);
            return target;
        }
    }
    
    /**
     * Unsets the "name" element
     */
    public void unsetName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(NAME$0, 0);
        }
    }
    
    /**
     * Gets the "relationship" element
     */
    public org.hl7.fhir.CodeableConcept getRelationship()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.CodeableConcept target = null;
            target = (org.hl7.fhir.CodeableConcept)get_store().find_element_user(RELATIONSHIP$2, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "relationship" element
     */
    public void setRelationship(org.hl7.fhir.CodeableConcept relationship)
    {
        generatedSetterHelperImpl(relationship, RELATIONSHIP$2, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "relationship" element
     */
    public org.hl7.fhir.CodeableConcept addNewRelationship()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.CodeableConcept target = null;
            target = (org.hl7.fhir.CodeableConcept)get_store().add_element_user(RELATIONSHIP$2);
            return target;
        }
    }
    
    /**
     * Gets the "bornPeriod" element
     */
    public org.hl7.fhir.Period getBornPeriod()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.Period target = null;
            target = (org.hl7.fhir.Period)get_store().find_element_user(BORNPERIOD$4, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "bornPeriod" element
     */
    public boolean isSetBornPeriod()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(BORNPERIOD$4) != 0;
        }
    }
    
    /**
     * Sets the "bornPeriod" element
     */
    public void setBornPeriod(org.hl7.fhir.Period bornPeriod)
    {
        generatedSetterHelperImpl(bornPeriod, BORNPERIOD$4, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "bornPeriod" element
     */
    public org.hl7.fhir.Period addNewBornPeriod()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.Period target = null;
            target = (org.hl7.fhir.Period)get_store().add_element_user(BORNPERIOD$4);
            return target;
        }
    }
    
    /**
     * Unsets the "bornPeriod" element
     */
    public void unsetBornPeriod()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(BORNPERIOD$4, 0);
        }
    }
    
    /**
     * Gets the "bornDate" element
     */
    public org.hl7.fhir.Date getBornDate()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.Date target = null;
            target = (org.hl7.fhir.Date)get_store().find_element_user(BORNDATE$6, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "bornDate" element
     */
    public boolean isSetBornDate()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(BORNDATE$6) != 0;
        }
    }
    
    /**
     * Sets the "bornDate" element
     */
    public void setBornDate(org.hl7.fhir.Date bornDate)
    {
        generatedSetterHelperImpl(bornDate, BORNDATE$6, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "bornDate" element
     */
    public org.hl7.fhir.Date addNewBornDate()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.Date target = null;
            target = (org.hl7.fhir.Date)get_store().add_element_user(BORNDATE$6);
            return target;
        }
    }
    
    /**
     * Unsets the "bornDate" element
     */
    public void unsetBornDate()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(BORNDATE$6, 0);
        }
    }
    
    /**
     * Gets the "bornString" element
     */
    public org.hl7.fhir.String getBornString()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.String target = null;
            target = (org.hl7.fhir.String)get_store().find_element_user(BORNSTRING$8, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "bornString" element
     */
    public boolean isSetBornString()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(BORNSTRING$8) != 0;
        }
    }
    
    /**
     * Sets the "bornString" element
     */
    public void setBornString(org.hl7.fhir.String bornString)
    {
        generatedSetterHelperImpl(bornString, BORNSTRING$8, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "bornString" element
     */
    public org.hl7.fhir.String addNewBornString()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.String target = null;
            target = (org.hl7.fhir.String)get_store().add_element_user(BORNSTRING$8);
            return target;
        }
    }
    
    /**
     * Unsets the "bornString" element
     */
    public void unsetBornString()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(BORNSTRING$8, 0);
        }
    }
    
    /**
     * Gets the "deceasedBoolean" element
     */
    public org.hl7.fhir.Boolean getDeceasedBoolean()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.Boolean target = null;
            target = (org.hl7.fhir.Boolean)get_store().find_element_user(DECEASEDBOOLEAN$10, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "deceasedBoolean" element
     */
    public boolean isSetDeceasedBoolean()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(DECEASEDBOOLEAN$10) != 0;
        }
    }
    
    /**
     * Sets the "deceasedBoolean" element
     */
    public void setDeceasedBoolean(org.hl7.fhir.Boolean deceasedBoolean)
    {
        generatedSetterHelperImpl(deceasedBoolean, DECEASEDBOOLEAN$10, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "deceasedBoolean" element
     */
    public org.hl7.fhir.Boolean addNewDeceasedBoolean()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.Boolean target = null;
            target = (org.hl7.fhir.Boolean)get_store().add_element_user(DECEASEDBOOLEAN$10);
            return target;
        }
    }
    
    /**
     * Unsets the "deceasedBoolean" element
     */
    public void unsetDeceasedBoolean()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(DECEASEDBOOLEAN$10, 0);
        }
    }
    
    /**
     * Gets the "deceasedAge" element
     */
    public org.hl7.fhir.Age getDeceasedAge()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.Age target = null;
            target = (org.hl7.fhir.Age)get_store().find_element_user(DECEASEDAGE$12, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "deceasedAge" element
     */
    public boolean isSetDeceasedAge()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(DECEASEDAGE$12) != 0;
        }
    }
    
    /**
     * Sets the "deceasedAge" element
     */
    public void setDeceasedAge(org.hl7.fhir.Age deceasedAge)
    {
        generatedSetterHelperImpl(deceasedAge, DECEASEDAGE$12, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "deceasedAge" element
     */
    public org.hl7.fhir.Age addNewDeceasedAge()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.Age target = null;
            target = (org.hl7.fhir.Age)get_store().add_element_user(DECEASEDAGE$12);
            return target;
        }
    }
    
    /**
     * Unsets the "deceasedAge" element
     */
    public void unsetDeceasedAge()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(DECEASEDAGE$12, 0);
        }
    }
    
    /**
     * Gets the "deceasedRange" element
     */
    public org.hl7.fhir.Range getDeceasedRange()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.Range target = null;
            target = (org.hl7.fhir.Range)get_store().find_element_user(DECEASEDRANGE$14, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "deceasedRange" element
     */
    public boolean isSetDeceasedRange()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(DECEASEDRANGE$14) != 0;
        }
    }
    
    /**
     * Sets the "deceasedRange" element
     */
    public void setDeceasedRange(org.hl7.fhir.Range deceasedRange)
    {
        generatedSetterHelperImpl(deceasedRange, DECEASEDRANGE$14, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "deceasedRange" element
     */
    public org.hl7.fhir.Range addNewDeceasedRange()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.Range target = null;
            target = (org.hl7.fhir.Range)get_store().add_element_user(DECEASEDRANGE$14);
            return target;
        }
    }
    
    /**
     * Unsets the "deceasedRange" element
     */
    public void unsetDeceasedRange()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(DECEASEDRANGE$14, 0);
        }
    }
    
    /**
     * Gets the "deceasedDate" element
     */
    public org.hl7.fhir.Date getDeceasedDate()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.Date target = null;
            target = (org.hl7.fhir.Date)get_store().find_element_user(DECEASEDDATE$16, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "deceasedDate" element
     */
    public boolean isSetDeceasedDate()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(DECEASEDDATE$16) != 0;
        }
    }
    
    /**
     * Sets the "deceasedDate" element
     */
    public void setDeceasedDate(org.hl7.fhir.Date deceasedDate)
    {
        generatedSetterHelperImpl(deceasedDate, DECEASEDDATE$16, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "deceasedDate" element
     */
    public org.hl7.fhir.Date addNewDeceasedDate()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.Date target = null;
            target = (org.hl7.fhir.Date)get_store().add_element_user(DECEASEDDATE$16);
            return target;
        }
    }
    
    /**
     * Unsets the "deceasedDate" element
     */
    public void unsetDeceasedDate()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(DECEASEDDATE$16, 0);
        }
    }
    
    /**
     * Gets the "deceasedString" element
     */
    public org.hl7.fhir.String getDeceasedString()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.String target = null;
            target = (org.hl7.fhir.String)get_store().find_element_user(DECEASEDSTRING$18, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "deceasedString" element
     */
    public boolean isSetDeceasedString()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(DECEASEDSTRING$18) != 0;
        }
    }
    
    /**
     * Sets the "deceasedString" element
     */
    public void setDeceasedString(org.hl7.fhir.String deceasedString)
    {
        generatedSetterHelperImpl(deceasedString, DECEASEDSTRING$18, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "deceasedString" element
     */
    public org.hl7.fhir.String addNewDeceasedString()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.String target = null;
            target = (org.hl7.fhir.String)get_store().add_element_user(DECEASEDSTRING$18);
            return target;
        }
    }
    
    /**
     * Unsets the "deceasedString" element
     */
    public void unsetDeceasedString()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(DECEASEDSTRING$18, 0);
        }
    }
    
    /**
     * Gets the "note" element
     */
    public org.hl7.fhir.String getNote()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.String target = null;
            target = (org.hl7.fhir.String)get_store().find_element_user(NOTE$20, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "note" element
     */
    public boolean isSetNote()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(NOTE$20) != 0;
        }
    }
    
    /**
     * Sets the "note" element
     */
    public void setNote(org.hl7.fhir.String note)
    {
        generatedSetterHelperImpl(note, NOTE$20, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "note" element
     */
    public org.hl7.fhir.String addNewNote()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.String target = null;
            target = (org.hl7.fhir.String)get_store().add_element_user(NOTE$20);
            return target;
        }
    }
    
    /**
     * Unsets the "note" element
     */
    public void unsetNote()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(NOTE$20, 0);
        }
    }
    
    /**
     * Gets array of all "condition" elements
     */
    public org.hl7.fhir.FamilyHistoryCondition[] getConditionArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(CONDITION$22, targetList);
            org.hl7.fhir.FamilyHistoryCondition[] result = new org.hl7.fhir.FamilyHistoryCondition[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "condition" element
     */
    public org.hl7.fhir.FamilyHistoryCondition getConditionArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.FamilyHistoryCondition target = null;
            target = (org.hl7.fhir.FamilyHistoryCondition)get_store().find_element_user(CONDITION$22, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "condition" element
     */
    public int sizeOfConditionArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(CONDITION$22);
        }
    }
    
    /**
     * Sets array of all "condition" element  WARNING: This method is not atomicaly synchronized.
     */
    public void setConditionArray(org.hl7.fhir.FamilyHistoryCondition[] conditionArray)
    {
        check_orphaned();
        arraySetterHelper(conditionArray, CONDITION$22);
    }
    
    /**
     * Sets ith "condition" element
     */
    public void setConditionArray(int i, org.hl7.fhir.FamilyHistoryCondition condition)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.FamilyHistoryCondition target = null;
            target = (org.hl7.fhir.FamilyHistoryCondition)get_store().find_element_user(CONDITION$22, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(condition);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "condition" element
     */
    public org.hl7.fhir.FamilyHistoryCondition insertNewCondition(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.FamilyHistoryCondition target = null;
            target = (org.hl7.fhir.FamilyHistoryCondition)get_store().insert_element_user(CONDITION$22, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "condition" element
     */
    public org.hl7.fhir.FamilyHistoryCondition addNewCondition()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.FamilyHistoryCondition target = null;
            target = (org.hl7.fhir.FamilyHistoryCondition)get_store().add_element_user(CONDITION$22);
            return target;
        }
    }
    
    /**
     * Removes the ith "condition" element
     */
    public void removeCondition(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(CONDITION$22, i);
        }
    }
}
