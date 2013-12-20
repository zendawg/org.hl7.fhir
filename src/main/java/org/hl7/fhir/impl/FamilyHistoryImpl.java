/*
 * XML Type:  FamilyHistory
 * Namespace: http://hl7.org/fhir
 * Java type: org.hl7.fhir.FamilyHistory
 *
 * Automatically generated - do not modify.
 */
package org.hl7.fhir.impl;
/**
 * An XML FamilyHistory(@http://hl7.org/fhir).
 *
 * This is a complex type.
 */
public class FamilyHistoryImpl extends org.hl7.fhir.impl.ResourceImpl implements org.hl7.fhir.FamilyHistory
{
    private static final long serialVersionUID = 1L;
    
    public FamilyHistoryImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName IDENTIFIER$0 = 
        new javax.xml.namespace.QName("http://hl7.org/fhir", "identifier");
    private static final javax.xml.namespace.QName SUBJECT$2 = 
        new javax.xml.namespace.QName("http://hl7.org/fhir", "subject");
    private static final javax.xml.namespace.QName NOTE$4 = 
        new javax.xml.namespace.QName("http://hl7.org/fhir", "note");
    private static final javax.xml.namespace.QName RELATION$6 = 
        new javax.xml.namespace.QName("http://hl7.org/fhir", "relation");
    
    
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
     * Gets the "subject" element
     */
    public org.hl7.fhir.ResourceReference getSubject()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.ResourceReference target = null;
            target = (org.hl7.fhir.ResourceReference)get_store().find_element_user(SUBJECT$2, 0);
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
        generatedSetterHelperImpl(subject, SUBJECT$2, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
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
            target = (org.hl7.fhir.ResourceReference)get_store().add_element_user(SUBJECT$2);
            return target;
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
            target = (org.hl7.fhir.String)get_store().find_element_user(NOTE$4, 0);
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
            return get_store().count_elements(NOTE$4) != 0;
        }
    }
    
    /**
     * Sets the "note" element
     */
    public void setNote(org.hl7.fhir.String note)
    {
        generatedSetterHelperImpl(note, NOTE$4, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
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
            target = (org.hl7.fhir.String)get_store().add_element_user(NOTE$4);
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
            get_store().remove_element(NOTE$4, 0);
        }
    }
    
    /**
     * Gets array of all "relation" elements
     */
    public org.hl7.fhir.FamilyHistoryRelation[] getRelationArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(RELATION$6, targetList);
            org.hl7.fhir.FamilyHistoryRelation[] result = new org.hl7.fhir.FamilyHistoryRelation[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "relation" element
     */
    public org.hl7.fhir.FamilyHistoryRelation getRelationArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.FamilyHistoryRelation target = null;
            target = (org.hl7.fhir.FamilyHistoryRelation)get_store().find_element_user(RELATION$6, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "relation" element
     */
    public int sizeOfRelationArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(RELATION$6);
        }
    }
    
    /**
     * Sets array of all "relation" element  WARNING: This method is not atomicaly synchronized.
     */
    public void setRelationArray(org.hl7.fhir.FamilyHistoryRelation[] relationArray)
    {
        check_orphaned();
        arraySetterHelper(relationArray, RELATION$6);
    }
    
    /**
     * Sets ith "relation" element
     */
    public void setRelationArray(int i, org.hl7.fhir.FamilyHistoryRelation relation)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.FamilyHistoryRelation target = null;
            target = (org.hl7.fhir.FamilyHistoryRelation)get_store().find_element_user(RELATION$6, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(relation);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "relation" element
     */
    public org.hl7.fhir.FamilyHistoryRelation insertNewRelation(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.FamilyHistoryRelation target = null;
            target = (org.hl7.fhir.FamilyHistoryRelation)get_store().insert_element_user(RELATION$6, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "relation" element
     */
    public org.hl7.fhir.FamilyHistoryRelation addNewRelation()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.FamilyHistoryRelation target = null;
            target = (org.hl7.fhir.FamilyHistoryRelation)get_store().add_element_user(RELATION$6);
            return target;
        }
    }
    
    /**
     * Removes the ith "relation" element
     */
    public void removeRelation(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(RELATION$6, i);
        }
    }
}
