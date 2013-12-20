/*
 * XML Type:  CodeableConcept
 * Namespace: http://hl7.org/fhir
 * Java type: org.hl7.fhir.CodeableConcept
 *
 * Automatically generated - do not modify.
 */
package org.hl7.fhir.impl;
/**
 * An XML CodeableConcept(@http://hl7.org/fhir).
 *
 * This is a complex type.
 */
public class CodeableConceptImpl extends org.hl7.fhir.impl.ElementImpl implements org.hl7.fhir.CodeableConcept
{
    private static final long serialVersionUID = 1L;
    
    public CodeableConceptImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName CODING$0 = 
        new javax.xml.namespace.QName("http://hl7.org/fhir", "coding");
    private static final javax.xml.namespace.QName TEXT$2 = 
        new javax.xml.namespace.QName("http://hl7.org/fhir", "text");
    
    
    /**
     * Gets array of all "coding" elements
     */
    public org.hl7.fhir.Coding[] getCodingArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(CODING$0, targetList);
            org.hl7.fhir.Coding[] result = new org.hl7.fhir.Coding[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "coding" element
     */
    public org.hl7.fhir.Coding getCodingArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.Coding target = null;
            target = (org.hl7.fhir.Coding)get_store().find_element_user(CODING$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "coding" element
     */
    public int sizeOfCodingArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(CODING$0);
        }
    }
    
    /**
     * Sets array of all "coding" element  WARNING: This method is not atomicaly synchronized.
     */
    public void setCodingArray(org.hl7.fhir.Coding[] codingArray)
    {
        check_orphaned();
        arraySetterHelper(codingArray, CODING$0);
    }
    
    /**
     * Sets ith "coding" element
     */
    public void setCodingArray(int i, org.hl7.fhir.Coding coding)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.Coding target = null;
            target = (org.hl7.fhir.Coding)get_store().find_element_user(CODING$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(coding);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "coding" element
     */
    public org.hl7.fhir.Coding insertNewCoding(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.Coding target = null;
            target = (org.hl7.fhir.Coding)get_store().insert_element_user(CODING$0, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "coding" element
     */
    public org.hl7.fhir.Coding addNewCoding()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.Coding target = null;
            target = (org.hl7.fhir.Coding)get_store().add_element_user(CODING$0);
            return target;
        }
    }
    
    /**
     * Removes the ith "coding" element
     */
    public void removeCoding(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(CODING$0, i);
        }
    }
    
    /**
     * Gets the "text" element
     */
    public org.hl7.fhir.String getText()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.String target = null;
            target = (org.hl7.fhir.String)get_store().find_element_user(TEXT$2, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "text" element
     */
    public boolean isSetText()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(TEXT$2) != 0;
        }
    }
    
    /**
     * Sets the "text" element
     */
    public void setText(org.hl7.fhir.String text)
    {
        generatedSetterHelperImpl(text, TEXT$2, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "text" element
     */
    public org.hl7.fhir.String addNewText()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.String target = null;
            target = (org.hl7.fhir.String)get_store().add_element_user(TEXT$2);
            return target;
        }
    }
    
    /**
     * Unsets the "text" element
     */
    public void unsetText()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(TEXT$2, 0);
        }
    }
}
