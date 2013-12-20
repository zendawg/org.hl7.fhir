/*
 * XML Type:  Medication.Product
 * Namespace: http://hl7.org/fhir
 * Java type: org.hl7.fhir.MedicationProduct
 *
 * Automatically generated - do not modify.
 */
package org.hl7.fhir.impl;
/**
 * An XML Medication.Product(@http://hl7.org/fhir).
 *
 * This is a complex type.
 */
public class MedicationProductImpl extends org.hl7.fhir.impl.BackboneElementImpl implements org.hl7.fhir.MedicationProduct
{
    private static final long serialVersionUID = 1L;
    
    public MedicationProductImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName FORM$0 = 
        new javax.xml.namespace.QName("http://hl7.org/fhir", "form");
    private static final javax.xml.namespace.QName INGREDIENT$2 = 
        new javax.xml.namespace.QName("http://hl7.org/fhir", "ingredient");
    
    
    /**
     * Gets the "form" element
     */
    public org.hl7.fhir.CodeableConcept getForm()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.CodeableConcept target = null;
            target = (org.hl7.fhir.CodeableConcept)get_store().find_element_user(FORM$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "form" element
     */
    public boolean isSetForm()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(FORM$0) != 0;
        }
    }
    
    /**
     * Sets the "form" element
     */
    public void setForm(org.hl7.fhir.CodeableConcept form)
    {
        generatedSetterHelperImpl(form, FORM$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "form" element
     */
    public org.hl7.fhir.CodeableConcept addNewForm()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.CodeableConcept target = null;
            target = (org.hl7.fhir.CodeableConcept)get_store().add_element_user(FORM$0);
            return target;
        }
    }
    
    /**
     * Unsets the "form" element
     */
    public void unsetForm()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(FORM$0, 0);
        }
    }
    
    /**
     * Gets array of all "ingredient" elements
     */
    public org.hl7.fhir.MedicationIngredient[] getIngredientArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(INGREDIENT$2, targetList);
            org.hl7.fhir.MedicationIngredient[] result = new org.hl7.fhir.MedicationIngredient[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "ingredient" element
     */
    public org.hl7.fhir.MedicationIngredient getIngredientArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.MedicationIngredient target = null;
            target = (org.hl7.fhir.MedicationIngredient)get_store().find_element_user(INGREDIENT$2, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "ingredient" element
     */
    public int sizeOfIngredientArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(INGREDIENT$2);
        }
    }
    
    /**
     * Sets array of all "ingredient" element  WARNING: This method is not atomicaly synchronized.
     */
    public void setIngredientArray(org.hl7.fhir.MedicationIngredient[] ingredientArray)
    {
        check_orphaned();
        arraySetterHelper(ingredientArray, INGREDIENT$2);
    }
    
    /**
     * Sets ith "ingredient" element
     */
    public void setIngredientArray(int i, org.hl7.fhir.MedicationIngredient ingredient)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.MedicationIngredient target = null;
            target = (org.hl7.fhir.MedicationIngredient)get_store().find_element_user(INGREDIENT$2, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(ingredient);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "ingredient" element
     */
    public org.hl7.fhir.MedicationIngredient insertNewIngredient(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.MedicationIngredient target = null;
            target = (org.hl7.fhir.MedicationIngredient)get_store().insert_element_user(INGREDIENT$2, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "ingredient" element
     */
    public org.hl7.fhir.MedicationIngredient addNewIngredient()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.MedicationIngredient target = null;
            target = (org.hl7.fhir.MedicationIngredient)get_store().add_element_user(INGREDIENT$2);
            return target;
        }
    }
    
    /**
     * Removes the ith "ingredient" element
     */
    public void removeIngredient(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(INGREDIENT$2, i);
        }
    }
}
