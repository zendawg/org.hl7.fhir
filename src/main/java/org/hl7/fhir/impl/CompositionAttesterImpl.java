/*
 * XML Type:  Composition.Attester
 * Namespace: http://hl7.org/fhir
 * Java type: org.hl7.fhir.CompositionAttester
 *
 * Automatically generated - do not modify.
 */
package org.hl7.fhir.impl;
/**
 * An XML Composition.Attester(@http://hl7.org/fhir).
 *
 * This is a complex type.
 */
public class CompositionAttesterImpl extends org.hl7.fhir.impl.BackboneElementImpl implements org.hl7.fhir.CompositionAttester
{
    private static final long serialVersionUID = 1L;
    
    public CompositionAttesterImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName MODE$0 = 
        new javax.xml.namespace.QName("http://hl7.org/fhir", "mode");
    private static final javax.xml.namespace.QName TIME$2 = 
        new javax.xml.namespace.QName("http://hl7.org/fhir", "time");
    private static final javax.xml.namespace.QName PARTY$4 = 
        new javax.xml.namespace.QName("http://hl7.org/fhir", "party");
    
    
    /**
     * Gets array of all "mode" elements
     */
    public org.hl7.fhir.CompositionAttestationMode[] getModeArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(MODE$0, targetList);
            org.hl7.fhir.CompositionAttestationMode[] result = new org.hl7.fhir.CompositionAttestationMode[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "mode" element
     */
    public org.hl7.fhir.CompositionAttestationMode getModeArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.CompositionAttestationMode target = null;
            target = (org.hl7.fhir.CompositionAttestationMode)get_store().find_element_user(MODE$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "mode" element
     */
    public int sizeOfModeArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(MODE$0);
        }
    }
    
    /**
     * Sets array of all "mode" element  WARNING: This method is not atomicaly synchronized.
     */
    public void setModeArray(org.hl7.fhir.CompositionAttestationMode[] modeArray)
    {
        check_orphaned();
        arraySetterHelper(modeArray, MODE$0);
    }
    
    /**
     * Sets ith "mode" element
     */
    public void setModeArray(int i, org.hl7.fhir.CompositionAttestationMode mode)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.CompositionAttestationMode target = null;
            target = (org.hl7.fhir.CompositionAttestationMode)get_store().find_element_user(MODE$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(mode);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "mode" element
     */
    public org.hl7.fhir.CompositionAttestationMode insertNewMode(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.CompositionAttestationMode target = null;
            target = (org.hl7.fhir.CompositionAttestationMode)get_store().insert_element_user(MODE$0, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "mode" element
     */
    public org.hl7.fhir.CompositionAttestationMode addNewMode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.CompositionAttestationMode target = null;
            target = (org.hl7.fhir.CompositionAttestationMode)get_store().add_element_user(MODE$0);
            return target;
        }
    }
    
    /**
     * Removes the ith "mode" element
     */
    public void removeMode(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(MODE$0, i);
        }
    }
    
    /**
     * Gets the "time" element
     */
    public org.hl7.fhir.DateTime getTime()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.DateTime target = null;
            target = (org.hl7.fhir.DateTime)get_store().find_element_user(TIME$2, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "time" element
     */
    public boolean isSetTime()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(TIME$2) != 0;
        }
    }
    
    /**
     * Sets the "time" element
     */
    public void setTime(org.hl7.fhir.DateTime time)
    {
        generatedSetterHelperImpl(time, TIME$2, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "time" element
     */
    public org.hl7.fhir.DateTime addNewTime()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.DateTime target = null;
            target = (org.hl7.fhir.DateTime)get_store().add_element_user(TIME$2);
            return target;
        }
    }
    
    /**
     * Unsets the "time" element
     */
    public void unsetTime()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(TIME$2, 0);
        }
    }
    
    /**
     * Gets the "party" element
     */
    public org.hl7.fhir.ResourceReference getParty()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.ResourceReference target = null;
            target = (org.hl7.fhir.ResourceReference)get_store().find_element_user(PARTY$4, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "party" element
     */
    public boolean isSetParty()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(PARTY$4) != 0;
        }
    }
    
    /**
     * Sets the "party" element
     */
    public void setParty(org.hl7.fhir.ResourceReference party)
    {
        generatedSetterHelperImpl(party, PARTY$4, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "party" element
     */
    public org.hl7.fhir.ResourceReference addNewParty()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.ResourceReference target = null;
            target = (org.hl7.fhir.ResourceReference)get_store().add_element_user(PARTY$4);
            return target;
        }
    }
    
    /**
     * Unsets the "party" element
     */
    public void unsetParty()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(PARTY$4, 0);
        }
    }
}
