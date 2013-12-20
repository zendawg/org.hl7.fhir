/*
 * XML Type:  Specimen.Treatment
 * Namespace: http://hl7.org/fhir
 * Java type: org.hl7.fhir.SpecimenTreatment
 *
 * Automatically generated - do not modify.
 */
package org.hl7.fhir.impl;
/**
 * An XML Specimen.Treatment(@http://hl7.org/fhir).
 *
 * This is a complex type.
 */
public class SpecimenTreatmentImpl extends org.hl7.fhir.impl.BackboneElementImpl implements org.hl7.fhir.SpecimenTreatment
{
    private static final long serialVersionUID = 1L;
    
    public SpecimenTreatmentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName DESCRIPTION$0 = 
        new javax.xml.namespace.QName("http://hl7.org/fhir", "description");
    private static final javax.xml.namespace.QName PROCEDURE$2 = 
        new javax.xml.namespace.QName("http://hl7.org/fhir", "procedure");
    private static final javax.xml.namespace.QName ADDITIVE$4 = 
        new javax.xml.namespace.QName("http://hl7.org/fhir", "additive");
    
    
    /**
     * Gets the "description" element
     */
    public org.hl7.fhir.String getDescription()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.String target = null;
            target = (org.hl7.fhir.String)get_store().find_element_user(DESCRIPTION$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "description" element
     */
    public boolean isSetDescription()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(DESCRIPTION$0) != 0;
        }
    }
    
    /**
     * Sets the "description" element
     */
    public void setDescription(org.hl7.fhir.String description)
    {
        generatedSetterHelperImpl(description, DESCRIPTION$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "description" element
     */
    public org.hl7.fhir.String addNewDescription()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.String target = null;
            target = (org.hl7.fhir.String)get_store().add_element_user(DESCRIPTION$0);
            return target;
        }
    }
    
    /**
     * Unsets the "description" element
     */
    public void unsetDescription()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(DESCRIPTION$0, 0);
        }
    }
    
    /**
     * Gets the "procedure" element
     */
    public org.hl7.fhir.CodeableConcept getProcedure()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.CodeableConcept target = null;
            target = (org.hl7.fhir.CodeableConcept)get_store().find_element_user(PROCEDURE$2, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "procedure" element
     */
    public boolean isSetProcedure()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(PROCEDURE$2) != 0;
        }
    }
    
    /**
     * Sets the "procedure" element
     */
    public void setProcedure(org.hl7.fhir.CodeableConcept procedure)
    {
        generatedSetterHelperImpl(procedure, PROCEDURE$2, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "procedure" element
     */
    public org.hl7.fhir.CodeableConcept addNewProcedure()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.CodeableConcept target = null;
            target = (org.hl7.fhir.CodeableConcept)get_store().add_element_user(PROCEDURE$2);
            return target;
        }
    }
    
    /**
     * Unsets the "procedure" element
     */
    public void unsetProcedure()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(PROCEDURE$2, 0);
        }
    }
    
    /**
     * Gets array of all "additive" elements
     */
    public org.hl7.fhir.ResourceReference[] getAdditiveArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(ADDITIVE$4, targetList);
            org.hl7.fhir.ResourceReference[] result = new org.hl7.fhir.ResourceReference[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "additive" element
     */
    public org.hl7.fhir.ResourceReference getAdditiveArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.ResourceReference target = null;
            target = (org.hl7.fhir.ResourceReference)get_store().find_element_user(ADDITIVE$4, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "additive" element
     */
    public int sizeOfAdditiveArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(ADDITIVE$4);
        }
    }
    
    /**
     * Sets array of all "additive" element  WARNING: This method is not atomicaly synchronized.
     */
    public void setAdditiveArray(org.hl7.fhir.ResourceReference[] additiveArray)
    {
        check_orphaned();
        arraySetterHelper(additiveArray, ADDITIVE$4);
    }
    
    /**
     * Sets ith "additive" element
     */
    public void setAdditiveArray(int i, org.hl7.fhir.ResourceReference additive)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.ResourceReference target = null;
            target = (org.hl7.fhir.ResourceReference)get_store().find_element_user(ADDITIVE$4, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(additive);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "additive" element
     */
    public org.hl7.fhir.ResourceReference insertNewAdditive(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.ResourceReference target = null;
            target = (org.hl7.fhir.ResourceReference)get_store().insert_element_user(ADDITIVE$4, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "additive" element
     */
    public org.hl7.fhir.ResourceReference addNewAdditive()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.ResourceReference target = null;
            target = (org.hl7.fhir.ResourceReference)get_store().add_element_user(ADDITIVE$4);
            return target;
        }
    }
    
    /**
     * Removes the ith "additive" element
     */
    public void removeAdditive(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(ADDITIVE$4, i);
        }
    }
}
