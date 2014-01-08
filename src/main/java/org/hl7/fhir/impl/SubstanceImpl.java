/*
 * XML Type:  Substance
 * Namespace: http://hl7.org/fhir
 * Java type: org.hl7.fhir.Substance
 *
 * Automatically generated - do not modify.
 */
package org.hl7.fhir.impl;
/**
 * An XML Substance(@http://hl7.org/fhir).
 *
 * This is a complex type.
 */
public class SubstanceImpl extends org.hl7.fhir.impl.ResourceImpl implements org.hl7.fhir.Substance
{
    private static final long serialVersionUID = 1L;
    
    public SubstanceImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName TYPE$0 = 
        new javax.xml.namespace.QName("http://hl7.org/fhir", "type");
    private static final javax.xml.namespace.QName DESCRIPTION$2 = 
        new javax.xml.namespace.QName("http://hl7.org/fhir", "description");
    private static final javax.xml.namespace.QName INSTANCE$4 = 
        new javax.xml.namespace.QName("http://hl7.org/fhir", "instance");
    private static final javax.xml.namespace.QName INGREDIENT$6 = 
        new javax.xml.namespace.QName("http://hl7.org/fhir", "ingredient");
    
    
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
     * Gets the "description" element
     */
    public org.hl7.fhir.String getDescription()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.String target = null;
            target = (org.hl7.fhir.String)get_store().find_element_user(DESCRIPTION$2, 0);
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
            return get_store().count_elements(DESCRIPTION$2) != 0;
        }
    }
    
    /**
     * Sets the "description" element
     */
    public void setDescription(org.hl7.fhir.String description)
    {
        generatedSetterHelperImpl(description, DESCRIPTION$2, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
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
            target = (org.hl7.fhir.String)get_store().add_element_user(DESCRIPTION$2);
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
            get_store().remove_element(DESCRIPTION$2, 0);
        }
    }
    
    /**
     * Gets the "instance" element
     */
    public org.hl7.fhir.SubstanceInstance getInstance()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.SubstanceInstance target = null;
            target = (org.hl7.fhir.SubstanceInstance)get_store().find_element_user(INSTANCE$4, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "instance" element
     */
    public boolean isSetInstance()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(INSTANCE$4) != 0;
        }
    }
    
    /**
     * Sets the "instance" element
     */
    public void setInstance(org.hl7.fhir.SubstanceInstance instance)
    {
        generatedSetterHelperImpl(instance, INSTANCE$4, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "instance" element
     */
    public org.hl7.fhir.SubstanceInstance addNewInstance()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.SubstanceInstance target = null;
            target = (org.hl7.fhir.SubstanceInstance)get_store().add_element_user(INSTANCE$4);
            return target;
        }
    }
    
    /**
     * Unsets the "instance" element
     */
    public void unsetInstance()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(INSTANCE$4, 0);
        }
    }
    
    /**
     * Gets array of all "ingredient" elements
     */
    public org.hl7.fhir.SubstanceIngredient[] getIngredientArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(INGREDIENT$6, targetList);
            org.hl7.fhir.SubstanceIngredient[] result = new org.hl7.fhir.SubstanceIngredient[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "ingredient" element
     */
    public org.hl7.fhir.SubstanceIngredient getIngredientArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.SubstanceIngredient target = null;
            target = (org.hl7.fhir.SubstanceIngredient)get_store().find_element_user(INGREDIENT$6, i);
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
            return get_store().count_elements(INGREDIENT$6);
        }
    }
    
    /**
     * Sets array of all "ingredient" element  WARNING: This method is not atomicaly synchronized.
     */
    public void setIngredientArray(org.hl7.fhir.SubstanceIngredient[] ingredientArray)
    {
        check_orphaned();
        arraySetterHelper(ingredientArray, INGREDIENT$6);
    }
    
    /**
     * Sets ith "ingredient" element
     */
    public void setIngredientArray(int i, org.hl7.fhir.SubstanceIngredient ingredient)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.SubstanceIngredient target = null;
            target = (org.hl7.fhir.SubstanceIngredient)get_store().find_element_user(INGREDIENT$6, i);
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
    public org.hl7.fhir.SubstanceIngredient insertNewIngredient(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.SubstanceIngredient target = null;
            target = (org.hl7.fhir.SubstanceIngredient)get_store().insert_element_user(INGREDIENT$6, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "ingredient" element
     */
    public org.hl7.fhir.SubstanceIngredient addNewIngredient()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.SubstanceIngredient target = null;
            target = (org.hl7.fhir.SubstanceIngredient)get_store().add_element_user(INGREDIENT$6);
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
            get_store().remove_element(INGREDIENT$6, i);
        }
    }
}
