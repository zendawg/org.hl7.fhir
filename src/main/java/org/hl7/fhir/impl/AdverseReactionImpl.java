/*
 * XML Type:  AdverseReaction
 * Namespace: http://hl7.org/fhir
 * Java type: org.hl7.fhir.AdverseReaction
 *
 * Automatically generated - do not modify.
 */
package org.hl7.fhir.impl;
/**
 * An XML AdverseReaction(@http://hl7.org/fhir).
 *
 * This is a complex type.
 */
public class AdverseReactionImpl extends org.hl7.fhir.impl.ResourceImpl implements org.hl7.fhir.AdverseReaction
{
    private static final long serialVersionUID = 1L;
    
    public AdverseReactionImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName IDENTIFIER$0 = 
        new javax.xml.namespace.QName("http://hl7.org/fhir", "identifier");
    private static final javax.xml.namespace.QName DATE$2 = 
        new javax.xml.namespace.QName("http://hl7.org/fhir", "date");
    private static final javax.xml.namespace.QName SUBJECT$4 = 
        new javax.xml.namespace.QName("http://hl7.org/fhir", "subject");
    private static final javax.xml.namespace.QName DIDNOTOCCURFLAG$6 = 
        new javax.xml.namespace.QName("http://hl7.org/fhir", "didNotOccurFlag");
    private static final javax.xml.namespace.QName RECORDER$8 = 
        new javax.xml.namespace.QName("http://hl7.org/fhir", "recorder");
    private static final javax.xml.namespace.QName SYMPTOM$10 = 
        new javax.xml.namespace.QName("http://hl7.org/fhir", "symptom");
    private static final javax.xml.namespace.QName EXPOSURE$12 = 
        new javax.xml.namespace.QName("http://hl7.org/fhir", "exposure");
    
    
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
     * Gets the "date" element
     */
    public org.hl7.fhir.DateTime getDate()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.DateTime target = null;
            target = (org.hl7.fhir.DateTime)get_store().find_element_user(DATE$2, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "date" element
     */
    public boolean isSetDate()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(DATE$2) != 0;
        }
    }
    
    /**
     * Sets the "date" element
     */
    public void setDate(org.hl7.fhir.DateTime date)
    {
        generatedSetterHelperImpl(date, DATE$2, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "date" element
     */
    public org.hl7.fhir.DateTime addNewDate()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.DateTime target = null;
            target = (org.hl7.fhir.DateTime)get_store().add_element_user(DATE$2);
            return target;
        }
    }
    
    /**
     * Unsets the "date" element
     */
    public void unsetDate()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(DATE$2, 0);
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
            target = (org.hl7.fhir.ResourceReference)get_store().find_element_user(SUBJECT$4, 0);
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
        generatedSetterHelperImpl(subject, SUBJECT$4, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
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
            target = (org.hl7.fhir.ResourceReference)get_store().add_element_user(SUBJECT$4);
            return target;
        }
    }
    
    /**
     * Gets the "didNotOccurFlag" element
     */
    public org.hl7.fhir.Boolean getDidNotOccurFlag()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.Boolean target = null;
            target = (org.hl7.fhir.Boolean)get_store().find_element_user(DIDNOTOCCURFLAG$6, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "didNotOccurFlag" element
     */
    public void setDidNotOccurFlag(org.hl7.fhir.Boolean didNotOccurFlag)
    {
        generatedSetterHelperImpl(didNotOccurFlag, DIDNOTOCCURFLAG$6, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "didNotOccurFlag" element
     */
    public org.hl7.fhir.Boolean addNewDidNotOccurFlag()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.Boolean target = null;
            target = (org.hl7.fhir.Boolean)get_store().add_element_user(DIDNOTOCCURFLAG$6);
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
            target = (org.hl7.fhir.ResourceReference)get_store().find_element_user(RECORDER$8, 0);
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
            return get_store().count_elements(RECORDER$8) != 0;
        }
    }
    
    /**
     * Sets the "recorder" element
     */
    public void setRecorder(org.hl7.fhir.ResourceReference recorder)
    {
        generatedSetterHelperImpl(recorder, RECORDER$8, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
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
            target = (org.hl7.fhir.ResourceReference)get_store().add_element_user(RECORDER$8);
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
            get_store().remove_element(RECORDER$8, 0);
        }
    }
    
    /**
     * Gets array of all "symptom" elements
     */
    public org.hl7.fhir.AdverseReactionSymptom[] getSymptomArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(SYMPTOM$10, targetList);
            org.hl7.fhir.AdverseReactionSymptom[] result = new org.hl7.fhir.AdverseReactionSymptom[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "symptom" element
     */
    public org.hl7.fhir.AdverseReactionSymptom getSymptomArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.AdverseReactionSymptom target = null;
            target = (org.hl7.fhir.AdverseReactionSymptom)get_store().find_element_user(SYMPTOM$10, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "symptom" element
     */
    public int sizeOfSymptomArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(SYMPTOM$10);
        }
    }
    
    /**
     * Sets array of all "symptom" element  WARNING: This method is not atomicaly synchronized.
     */
    public void setSymptomArray(org.hl7.fhir.AdverseReactionSymptom[] symptomArray)
    {
        check_orphaned();
        arraySetterHelper(symptomArray, SYMPTOM$10);
    }
    
    /**
     * Sets ith "symptom" element
     */
    public void setSymptomArray(int i, org.hl7.fhir.AdverseReactionSymptom symptom)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.AdverseReactionSymptom target = null;
            target = (org.hl7.fhir.AdverseReactionSymptom)get_store().find_element_user(SYMPTOM$10, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(symptom);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "symptom" element
     */
    public org.hl7.fhir.AdverseReactionSymptom insertNewSymptom(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.AdverseReactionSymptom target = null;
            target = (org.hl7.fhir.AdverseReactionSymptom)get_store().insert_element_user(SYMPTOM$10, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "symptom" element
     */
    public org.hl7.fhir.AdverseReactionSymptom addNewSymptom()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.AdverseReactionSymptom target = null;
            target = (org.hl7.fhir.AdverseReactionSymptom)get_store().add_element_user(SYMPTOM$10);
            return target;
        }
    }
    
    /**
     * Removes the ith "symptom" element
     */
    public void removeSymptom(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(SYMPTOM$10, i);
        }
    }
    
    /**
     * Gets array of all "exposure" elements
     */
    public org.hl7.fhir.AdverseReactionExposure[] getExposureArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(EXPOSURE$12, targetList);
            org.hl7.fhir.AdverseReactionExposure[] result = new org.hl7.fhir.AdverseReactionExposure[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "exposure" element
     */
    public org.hl7.fhir.AdverseReactionExposure getExposureArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.AdverseReactionExposure target = null;
            target = (org.hl7.fhir.AdverseReactionExposure)get_store().find_element_user(EXPOSURE$12, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "exposure" element
     */
    public int sizeOfExposureArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(EXPOSURE$12);
        }
    }
    
    /**
     * Sets array of all "exposure" element  WARNING: This method is not atomicaly synchronized.
     */
    public void setExposureArray(org.hl7.fhir.AdverseReactionExposure[] exposureArray)
    {
        check_orphaned();
        arraySetterHelper(exposureArray, EXPOSURE$12);
    }
    
    /**
     * Sets ith "exposure" element
     */
    public void setExposureArray(int i, org.hl7.fhir.AdverseReactionExposure exposure)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.AdverseReactionExposure target = null;
            target = (org.hl7.fhir.AdverseReactionExposure)get_store().find_element_user(EXPOSURE$12, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(exposure);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "exposure" element
     */
    public org.hl7.fhir.AdverseReactionExposure insertNewExposure(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.AdverseReactionExposure target = null;
            target = (org.hl7.fhir.AdverseReactionExposure)get_store().insert_element_user(EXPOSURE$12, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "exposure" element
     */
    public org.hl7.fhir.AdverseReactionExposure addNewExposure()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.AdverseReactionExposure target = null;
            target = (org.hl7.fhir.AdverseReactionExposure)get_store().add_element_user(EXPOSURE$12);
            return target;
        }
    }
    
    /**
     * Removes the ith "exposure" element
     */
    public void removeExposure(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(EXPOSURE$12, i);
        }
    }
}
