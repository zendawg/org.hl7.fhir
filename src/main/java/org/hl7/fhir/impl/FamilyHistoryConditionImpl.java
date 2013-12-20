/*
 * XML Type:  FamilyHistory.Condition
 * Namespace: http://hl7.org/fhir
 * Java type: org.hl7.fhir.FamilyHistoryCondition
 *
 * Automatically generated - do not modify.
 */
package org.hl7.fhir.impl;
/**
 * An XML FamilyHistory.Condition(@http://hl7.org/fhir).
 *
 * This is a complex type.
 */
public class FamilyHistoryConditionImpl extends org.hl7.fhir.impl.BackboneElementImpl implements org.hl7.fhir.FamilyHistoryCondition
{
    private static final long serialVersionUID = 1L;
    
    public FamilyHistoryConditionImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName TYPE$0 = 
        new javax.xml.namespace.QName("http://hl7.org/fhir", "type");
    private static final javax.xml.namespace.QName OUTCOME$2 = 
        new javax.xml.namespace.QName("http://hl7.org/fhir", "outcome");
    private static final javax.xml.namespace.QName ONSETAGE$4 = 
        new javax.xml.namespace.QName("http://hl7.org/fhir", "onsetAge");
    private static final javax.xml.namespace.QName ONSETRANGE$6 = 
        new javax.xml.namespace.QName("http://hl7.org/fhir", "onsetRange");
    private static final javax.xml.namespace.QName ONSETSTRING$8 = 
        new javax.xml.namespace.QName("http://hl7.org/fhir", "onsetString");
    private static final javax.xml.namespace.QName NOTE$10 = 
        new javax.xml.namespace.QName("http://hl7.org/fhir", "note");
    
    
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
     * Gets the "outcome" element
     */
    public org.hl7.fhir.CodeableConcept getOutcome()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.CodeableConcept target = null;
            target = (org.hl7.fhir.CodeableConcept)get_store().find_element_user(OUTCOME$2, 0);
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
            return get_store().count_elements(OUTCOME$2) != 0;
        }
    }
    
    /**
     * Sets the "outcome" element
     */
    public void setOutcome(org.hl7.fhir.CodeableConcept outcome)
    {
        generatedSetterHelperImpl(outcome, OUTCOME$2, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "outcome" element
     */
    public org.hl7.fhir.CodeableConcept addNewOutcome()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.CodeableConcept target = null;
            target = (org.hl7.fhir.CodeableConcept)get_store().add_element_user(OUTCOME$2);
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
            get_store().remove_element(OUTCOME$2, 0);
        }
    }
    
    /**
     * Gets the "onsetAge" element
     */
    public org.hl7.fhir.Age getOnsetAge()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.Age target = null;
            target = (org.hl7.fhir.Age)get_store().find_element_user(ONSETAGE$4, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "onsetAge" element
     */
    public boolean isSetOnsetAge()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(ONSETAGE$4) != 0;
        }
    }
    
    /**
     * Sets the "onsetAge" element
     */
    public void setOnsetAge(org.hl7.fhir.Age onsetAge)
    {
        generatedSetterHelperImpl(onsetAge, ONSETAGE$4, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "onsetAge" element
     */
    public org.hl7.fhir.Age addNewOnsetAge()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.Age target = null;
            target = (org.hl7.fhir.Age)get_store().add_element_user(ONSETAGE$4);
            return target;
        }
    }
    
    /**
     * Unsets the "onsetAge" element
     */
    public void unsetOnsetAge()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(ONSETAGE$4, 0);
        }
    }
    
    /**
     * Gets the "onsetRange" element
     */
    public org.hl7.fhir.Range getOnsetRange()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.Range target = null;
            target = (org.hl7.fhir.Range)get_store().find_element_user(ONSETRANGE$6, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "onsetRange" element
     */
    public boolean isSetOnsetRange()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(ONSETRANGE$6) != 0;
        }
    }
    
    /**
     * Sets the "onsetRange" element
     */
    public void setOnsetRange(org.hl7.fhir.Range onsetRange)
    {
        generatedSetterHelperImpl(onsetRange, ONSETRANGE$6, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "onsetRange" element
     */
    public org.hl7.fhir.Range addNewOnsetRange()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.Range target = null;
            target = (org.hl7.fhir.Range)get_store().add_element_user(ONSETRANGE$6);
            return target;
        }
    }
    
    /**
     * Unsets the "onsetRange" element
     */
    public void unsetOnsetRange()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(ONSETRANGE$6, 0);
        }
    }
    
    /**
     * Gets the "onsetString" element
     */
    public org.hl7.fhir.String getOnsetString()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.String target = null;
            target = (org.hl7.fhir.String)get_store().find_element_user(ONSETSTRING$8, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "onsetString" element
     */
    public boolean isSetOnsetString()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(ONSETSTRING$8) != 0;
        }
    }
    
    /**
     * Sets the "onsetString" element
     */
    public void setOnsetString(org.hl7.fhir.String onsetString)
    {
        generatedSetterHelperImpl(onsetString, ONSETSTRING$8, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "onsetString" element
     */
    public org.hl7.fhir.String addNewOnsetString()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.String target = null;
            target = (org.hl7.fhir.String)get_store().add_element_user(ONSETSTRING$8);
            return target;
        }
    }
    
    /**
     * Unsets the "onsetString" element
     */
    public void unsetOnsetString()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(ONSETSTRING$8, 0);
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
            target = (org.hl7.fhir.String)get_store().find_element_user(NOTE$10, 0);
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
            return get_store().count_elements(NOTE$10) != 0;
        }
    }
    
    /**
     * Sets the "note" element
     */
    public void setNote(org.hl7.fhir.String note)
    {
        generatedSetterHelperImpl(note, NOTE$10, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
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
            target = (org.hl7.fhir.String)get_store().add_element_user(NOTE$10);
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
            get_store().remove_element(NOTE$10, 0);
        }
    }
}
