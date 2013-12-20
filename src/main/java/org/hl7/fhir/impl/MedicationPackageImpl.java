/*
 * XML Type:  Medication.Package
 * Namespace: http://hl7.org/fhir
 * Java type: org.hl7.fhir.MedicationPackage
 *
 * Automatically generated - do not modify.
 */
package org.hl7.fhir.impl;
/**
 * An XML Medication.Package(@http://hl7.org/fhir).
 *
 * This is a complex type.
 */
public class MedicationPackageImpl extends org.hl7.fhir.impl.BackboneElementImpl implements org.hl7.fhir.MedicationPackage
{
    private static final long serialVersionUID = 1L;
    
    public MedicationPackageImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName CONTAINER$0 = 
        new javax.xml.namespace.QName("http://hl7.org/fhir", "container");
    private static final javax.xml.namespace.QName CONTENT$2 = 
        new javax.xml.namespace.QName("http://hl7.org/fhir", "content");
    
    
    /**
     * Gets the "container" element
     */
    public org.hl7.fhir.CodeableConcept getContainer()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.CodeableConcept target = null;
            target = (org.hl7.fhir.CodeableConcept)get_store().find_element_user(CONTAINER$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "container" element
     */
    public boolean isSetContainer()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(CONTAINER$0) != 0;
        }
    }
    
    /**
     * Sets the "container" element
     */
    public void setContainer(org.hl7.fhir.CodeableConcept container)
    {
        generatedSetterHelperImpl(container, CONTAINER$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "container" element
     */
    public org.hl7.fhir.CodeableConcept addNewContainer()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.CodeableConcept target = null;
            target = (org.hl7.fhir.CodeableConcept)get_store().add_element_user(CONTAINER$0);
            return target;
        }
    }
    
    /**
     * Unsets the "container" element
     */
    public void unsetContainer()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(CONTAINER$0, 0);
        }
    }
    
    /**
     * Gets array of all "content" elements
     */
    public org.hl7.fhir.MedicationContent[] getContentArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(CONTENT$2, targetList);
            org.hl7.fhir.MedicationContent[] result = new org.hl7.fhir.MedicationContent[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "content" element
     */
    public org.hl7.fhir.MedicationContent getContentArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.MedicationContent target = null;
            target = (org.hl7.fhir.MedicationContent)get_store().find_element_user(CONTENT$2, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "content" element
     */
    public int sizeOfContentArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(CONTENT$2);
        }
    }
    
    /**
     * Sets array of all "content" element  WARNING: This method is not atomicaly synchronized.
     */
    public void setContentArray(org.hl7.fhir.MedicationContent[] contentArray)
    {
        check_orphaned();
        arraySetterHelper(contentArray, CONTENT$2);
    }
    
    /**
     * Sets ith "content" element
     */
    public void setContentArray(int i, org.hl7.fhir.MedicationContent content)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.MedicationContent target = null;
            target = (org.hl7.fhir.MedicationContent)get_store().find_element_user(CONTENT$2, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(content);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "content" element
     */
    public org.hl7.fhir.MedicationContent insertNewContent(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.MedicationContent target = null;
            target = (org.hl7.fhir.MedicationContent)get_store().insert_element_user(CONTENT$2, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "content" element
     */
    public org.hl7.fhir.MedicationContent addNewContent()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.MedicationContent target = null;
            target = (org.hl7.fhir.MedicationContent)get_store().add_element_user(CONTENT$2);
            return target;
        }
    }
    
    /**
     * Removes the ith "content" element
     */
    public void removeContent(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(CONTENT$2, i);
        }
    }
}
