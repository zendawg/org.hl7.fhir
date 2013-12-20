/*
 * XML Type:  Substance.Ingredient
 * Namespace: http://hl7.org/fhir
 * Java type: org.hl7.fhir.SubstanceIngredient
 *
 * Automatically generated - do not modify.
 */
package org.hl7.fhir.impl;
/**
 * An XML Substance.Ingredient(@http://hl7.org/fhir).
 *
 * This is a complex type.
 */
public class SubstanceIngredientImpl extends org.hl7.fhir.impl.BackboneElementImpl implements org.hl7.fhir.SubstanceIngredient
{
    private static final long serialVersionUID = 1L;
    
    public SubstanceIngredientImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName QUANTITY$0 = 
        new javax.xml.namespace.QName("http://hl7.org/fhir", "quantity");
    private static final javax.xml.namespace.QName SUBSTANCE$2 = 
        new javax.xml.namespace.QName("http://hl7.org/fhir", "substance");
    
    
    /**
     * Gets the "quantity" element
     */
    public org.hl7.fhir.Ratio getQuantity()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.Ratio target = null;
            target = (org.hl7.fhir.Ratio)get_store().find_element_user(QUANTITY$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "quantity" element
     */
    public boolean isSetQuantity()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(QUANTITY$0) != 0;
        }
    }
    
    /**
     * Sets the "quantity" element
     */
    public void setQuantity(org.hl7.fhir.Ratio quantity)
    {
        generatedSetterHelperImpl(quantity, QUANTITY$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "quantity" element
     */
    public org.hl7.fhir.Ratio addNewQuantity()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.Ratio target = null;
            target = (org.hl7.fhir.Ratio)get_store().add_element_user(QUANTITY$0);
            return target;
        }
    }
    
    /**
     * Unsets the "quantity" element
     */
    public void unsetQuantity()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(QUANTITY$0, 0);
        }
    }
    
    /**
     * Gets the "substance" element
     */
    public org.hl7.fhir.ResourceReference getSubstance()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.ResourceReference target = null;
            target = (org.hl7.fhir.ResourceReference)get_store().find_element_user(SUBSTANCE$2, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "substance" element
     */
    public void setSubstance(org.hl7.fhir.ResourceReference substance)
    {
        generatedSetterHelperImpl(substance, SUBSTANCE$2, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "substance" element
     */
    public org.hl7.fhir.ResourceReference addNewSubstance()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.ResourceReference target = null;
            target = (org.hl7.fhir.ResourceReference)get_store().add_element_user(SUBSTANCE$2);
            return target;
        }
    }
}
