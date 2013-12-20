/*
 * XML Type:  Patient.Animal
 * Namespace: http://hl7.org/fhir
 * Java type: org.hl7.fhir.PatientAnimal
 *
 * Automatically generated - do not modify.
 */
package org.hl7.fhir.impl;
/**
 * An XML Patient.Animal(@http://hl7.org/fhir).
 *
 * This is a complex type.
 */
public class PatientAnimalImpl extends org.hl7.fhir.impl.BackboneElementImpl implements org.hl7.fhir.PatientAnimal
{
    private static final long serialVersionUID = 1L;
    
    public PatientAnimalImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName SPECIES$0 = 
        new javax.xml.namespace.QName("http://hl7.org/fhir", "species");
    private static final javax.xml.namespace.QName BREED$2 = 
        new javax.xml.namespace.QName("http://hl7.org/fhir", "breed");
    private static final javax.xml.namespace.QName GENDERSTATUS$4 = 
        new javax.xml.namespace.QName("http://hl7.org/fhir", "genderStatus");
    
    
    /**
     * Gets the "species" element
     */
    public org.hl7.fhir.CodeableConcept getSpecies()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.CodeableConcept target = null;
            target = (org.hl7.fhir.CodeableConcept)get_store().find_element_user(SPECIES$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "species" element
     */
    public void setSpecies(org.hl7.fhir.CodeableConcept species)
    {
        generatedSetterHelperImpl(species, SPECIES$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "species" element
     */
    public org.hl7.fhir.CodeableConcept addNewSpecies()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.CodeableConcept target = null;
            target = (org.hl7.fhir.CodeableConcept)get_store().add_element_user(SPECIES$0);
            return target;
        }
    }
    
    /**
     * Gets the "breed" element
     */
    public org.hl7.fhir.CodeableConcept getBreed()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.CodeableConcept target = null;
            target = (org.hl7.fhir.CodeableConcept)get_store().find_element_user(BREED$2, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "breed" element
     */
    public boolean isSetBreed()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(BREED$2) != 0;
        }
    }
    
    /**
     * Sets the "breed" element
     */
    public void setBreed(org.hl7.fhir.CodeableConcept breed)
    {
        generatedSetterHelperImpl(breed, BREED$2, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "breed" element
     */
    public org.hl7.fhir.CodeableConcept addNewBreed()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.CodeableConcept target = null;
            target = (org.hl7.fhir.CodeableConcept)get_store().add_element_user(BREED$2);
            return target;
        }
    }
    
    /**
     * Unsets the "breed" element
     */
    public void unsetBreed()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(BREED$2, 0);
        }
    }
    
    /**
     * Gets the "genderStatus" element
     */
    public org.hl7.fhir.CodeableConcept getGenderStatus()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.CodeableConcept target = null;
            target = (org.hl7.fhir.CodeableConcept)get_store().find_element_user(GENDERSTATUS$4, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "genderStatus" element
     */
    public boolean isSetGenderStatus()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(GENDERSTATUS$4) != 0;
        }
    }
    
    /**
     * Sets the "genderStatus" element
     */
    public void setGenderStatus(org.hl7.fhir.CodeableConcept genderStatus)
    {
        generatedSetterHelperImpl(genderStatus, GENDERSTATUS$4, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "genderStatus" element
     */
    public org.hl7.fhir.CodeableConcept addNewGenderStatus()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.CodeableConcept target = null;
            target = (org.hl7.fhir.CodeableConcept)get_store().add_element_user(GENDERSTATUS$4);
            return target;
        }
    }
    
    /**
     * Unsets the "genderStatus" element
     */
    public void unsetGenderStatus()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(GENDERSTATUS$4, 0);
        }
    }
}
