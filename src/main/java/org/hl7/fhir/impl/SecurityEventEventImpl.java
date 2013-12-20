/*
 * XML Type:  SecurityEvent.Event
 * Namespace: http://hl7.org/fhir
 * Java type: org.hl7.fhir.SecurityEventEvent
 *
 * Automatically generated - do not modify.
 */
package org.hl7.fhir.impl;
/**
 * An XML SecurityEvent.Event(@http://hl7.org/fhir).
 *
 * This is a complex type.
 */
public class SecurityEventEventImpl extends org.hl7.fhir.impl.BackboneElementImpl implements org.hl7.fhir.SecurityEventEvent
{
    private static final long serialVersionUID = 1L;
    
    public SecurityEventEventImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName TYPE$0 = 
        new javax.xml.namespace.QName("http://hl7.org/fhir", "type");
    private static final javax.xml.namespace.QName SUBTYPE$2 = 
        new javax.xml.namespace.QName("http://hl7.org/fhir", "subtype");
    private static final javax.xml.namespace.QName ACTION$4 = 
        new javax.xml.namespace.QName("http://hl7.org/fhir", "action");
    private static final javax.xml.namespace.QName DATETIME$6 = 
        new javax.xml.namespace.QName("http://hl7.org/fhir", "dateTime");
    private static final javax.xml.namespace.QName OUTCOME$8 = 
        new javax.xml.namespace.QName("http://hl7.org/fhir", "outcome");
    private static final javax.xml.namespace.QName OUTCOMEDESC$10 = 
        new javax.xml.namespace.QName("http://hl7.org/fhir", "outcomeDesc");
    
    
    /**
     * Gets the "type" element
     */
    public org.hl7.fhir.CodeableConcept getType()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.CodeableConcept target = null;
            target = (org.hl7.fhir.CodeableConcept)get_store().find_element_user(TYPE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "type" element
     */
    public void setType(org.hl7.fhir.CodeableConcept type)
    {
        generatedSetterHelperImpl(type, TYPE$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "type" element
     */
    public org.hl7.fhir.CodeableConcept addNewType()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.CodeableConcept target = null;
            target = (org.hl7.fhir.CodeableConcept)get_store().add_element_user(TYPE$0);
            return target;
        }
    }
    
    /**
     * Gets array of all "subtype" elements
     */
    public org.hl7.fhir.CodeableConcept[] getSubtypeArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(SUBTYPE$2, targetList);
            org.hl7.fhir.CodeableConcept[] result = new org.hl7.fhir.CodeableConcept[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "subtype" element
     */
    public org.hl7.fhir.CodeableConcept getSubtypeArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.CodeableConcept target = null;
            target = (org.hl7.fhir.CodeableConcept)get_store().find_element_user(SUBTYPE$2, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "subtype" element
     */
    public int sizeOfSubtypeArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(SUBTYPE$2);
        }
    }
    
    /**
     * Sets array of all "subtype" element  WARNING: This method is not atomicaly synchronized.
     */
    public void setSubtypeArray(org.hl7.fhir.CodeableConcept[] subtypeArray)
    {
        check_orphaned();
        arraySetterHelper(subtypeArray, SUBTYPE$2);
    }
    
    /**
     * Sets ith "subtype" element
     */
    public void setSubtypeArray(int i, org.hl7.fhir.CodeableConcept subtype)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.CodeableConcept target = null;
            target = (org.hl7.fhir.CodeableConcept)get_store().find_element_user(SUBTYPE$2, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(subtype);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "subtype" element
     */
    public org.hl7.fhir.CodeableConcept insertNewSubtype(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.CodeableConcept target = null;
            target = (org.hl7.fhir.CodeableConcept)get_store().insert_element_user(SUBTYPE$2, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "subtype" element
     */
    public org.hl7.fhir.CodeableConcept addNewSubtype()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.CodeableConcept target = null;
            target = (org.hl7.fhir.CodeableConcept)get_store().add_element_user(SUBTYPE$2);
            return target;
        }
    }
    
    /**
     * Removes the ith "subtype" element
     */
    public void removeSubtype(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(SUBTYPE$2, i);
        }
    }
    
    /**
     * Gets the "action" element
     */
    public org.hl7.fhir.SecurityEventAction getAction()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.SecurityEventAction target = null;
            target = (org.hl7.fhir.SecurityEventAction)get_store().find_element_user(ACTION$4, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "action" element
     */
    public boolean isSetAction()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(ACTION$4) != 0;
        }
    }
    
    /**
     * Sets the "action" element
     */
    public void setAction(org.hl7.fhir.SecurityEventAction action)
    {
        generatedSetterHelperImpl(action, ACTION$4, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "action" element
     */
    public org.hl7.fhir.SecurityEventAction addNewAction()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.SecurityEventAction target = null;
            target = (org.hl7.fhir.SecurityEventAction)get_store().add_element_user(ACTION$4);
            return target;
        }
    }
    
    /**
     * Unsets the "action" element
     */
    public void unsetAction()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(ACTION$4, 0);
        }
    }
    
    /**
     * Gets the "dateTime" element
     */
    public org.hl7.fhir.Instant getDateTime()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.Instant target = null;
            target = (org.hl7.fhir.Instant)get_store().find_element_user(DATETIME$6, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "dateTime" element
     */
    public void setDateTime(org.hl7.fhir.Instant dateTime)
    {
        generatedSetterHelperImpl(dateTime, DATETIME$6, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "dateTime" element
     */
    public org.hl7.fhir.Instant addNewDateTime()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.Instant target = null;
            target = (org.hl7.fhir.Instant)get_store().add_element_user(DATETIME$6);
            return target;
        }
    }
    
    /**
     * Gets the "outcome" element
     */
    public org.hl7.fhir.SecurityEventOutcome getOutcome()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.SecurityEventOutcome target = null;
            target = (org.hl7.fhir.SecurityEventOutcome)get_store().find_element_user(OUTCOME$8, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "outcome" element
     */
    public boolean isSetOutcome()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(OUTCOME$8) != 0;
        }
    }
    
    /**
     * Sets the "outcome" element
     */
    public void setOutcome(org.hl7.fhir.SecurityEventOutcome outcome)
    {
        generatedSetterHelperImpl(outcome, OUTCOME$8, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "outcome" element
     */
    public org.hl7.fhir.SecurityEventOutcome addNewOutcome()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.SecurityEventOutcome target = null;
            target = (org.hl7.fhir.SecurityEventOutcome)get_store().add_element_user(OUTCOME$8);
            return target;
        }
    }
    
    /**
     * Unsets the "outcome" element
     */
    public void unsetOutcome()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(OUTCOME$8, 0);
        }
    }
    
    /**
     * Gets the "outcomeDesc" element
     */
    public org.hl7.fhir.String getOutcomeDesc()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.String target = null;
            target = (org.hl7.fhir.String)get_store().find_element_user(OUTCOMEDESC$10, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "outcomeDesc" element
     */
    public boolean isSetOutcomeDesc()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(OUTCOMEDESC$10) != 0;
        }
    }
    
    /**
     * Sets the "outcomeDesc" element
     */
    public void setOutcomeDesc(org.hl7.fhir.String outcomeDesc)
    {
        generatedSetterHelperImpl(outcomeDesc, OUTCOMEDESC$10, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "outcomeDesc" element
     */
    public org.hl7.fhir.String addNewOutcomeDesc()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.String target = null;
            target = (org.hl7.fhir.String)get_store().add_element_user(OUTCOMEDESC$10);
            return target;
        }
    }
    
    /**
     * Unsets the "outcomeDesc" element
     */
    public void unsetOutcomeDesc()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(OUTCOMEDESC$10, 0);
        }
    }
}
