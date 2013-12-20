/*
 * XML Type:  Medication.Content
 * Namespace: http://hl7.org/fhir
 * Java type: org.hl7.fhir.MedicationContent
 *
 * Automatically generated - do not modify.
 */
package org.hl7.fhir.impl;
/**
 * An XML Medication.Content(@http://hl7.org/fhir).
 *
 * This is a complex type.
 */
public class MedicationContentImpl extends org.hl7.fhir.impl.BackboneElementImpl implements org.hl7.fhir.MedicationContent
{
    private static final long serialVersionUID = 1L;
    
    public MedicationContentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName ITEM$0 = 
        new javax.xml.namespace.QName("http://hl7.org/fhir", "item");
    private static final javax.xml.namespace.QName AMOUNT$2 = 
        new javax.xml.namespace.QName("http://hl7.org/fhir", "amount");
    
    
    /**
     * Gets the "item" element
     */
    public org.hl7.fhir.ResourceReference getItem()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.ResourceReference target = null;
            target = (org.hl7.fhir.ResourceReference)get_store().find_element_user(ITEM$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "item" element
     */
    public void setItem(org.hl7.fhir.ResourceReference item)
    {
        generatedSetterHelperImpl(item, ITEM$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "item" element
     */
    public org.hl7.fhir.ResourceReference addNewItem()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.ResourceReference target = null;
            target = (org.hl7.fhir.ResourceReference)get_store().add_element_user(ITEM$0);
            return target;
        }
    }
    
    /**
     * Gets the "amount" element
     */
    public org.hl7.fhir.Quantity getAmount()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.Quantity target = null;
            target = (org.hl7.fhir.Quantity)get_store().find_element_user(AMOUNT$2, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "amount" element
     */
    public boolean isSetAmount()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(AMOUNT$2) != 0;
        }
    }
    
    /**
     * Sets the "amount" element
     */
    public void setAmount(org.hl7.fhir.Quantity amount)
    {
        generatedSetterHelperImpl(amount, AMOUNT$2, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "amount" element
     */
    public org.hl7.fhir.Quantity addNewAmount()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.Quantity target = null;
            target = (org.hl7.fhir.Quantity)get_store().add_element_user(AMOUNT$2);
            return target;
        }
    }
    
    /**
     * Unsets the "amount" element
     */
    public void unsetAmount()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(AMOUNT$2, 0);
        }
    }
}
