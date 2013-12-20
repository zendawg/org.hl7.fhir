/*
 * XML Type:  BackboneElement
 * Namespace: http://hl7.org/fhir
 * Java type: org.hl7.fhir.BackboneElement
 *
 * Automatically generated - do not modify.
 */
package org.hl7.fhir.impl;
/**
 * An XML BackboneElement(@http://hl7.org/fhir).
 *
 * This is a complex type.
 */
public class BackboneElementImpl extends org.hl7.fhir.impl.ElementImpl implements org.hl7.fhir.BackboneElement
{
    private static final long serialVersionUID = 1L;
    
    public BackboneElementImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName MODIFIEREXTENSION$0 = 
        new javax.xml.namespace.QName("http://hl7.org/fhir", "modifierExtension");
    
    
    /**
     * Gets array of all "modifierExtension" elements
     */
    public org.hl7.fhir.Extension[] getModifierExtensionArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(MODIFIEREXTENSION$0, targetList);
            org.hl7.fhir.Extension[] result = new org.hl7.fhir.Extension[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "modifierExtension" element
     */
    public org.hl7.fhir.Extension getModifierExtensionArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.Extension target = null;
            target = (org.hl7.fhir.Extension)get_store().find_element_user(MODIFIEREXTENSION$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "modifierExtension" element
     */
    public int sizeOfModifierExtensionArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(MODIFIEREXTENSION$0);
        }
    }
    
    /**
     * Sets array of all "modifierExtension" element  WARNING: This method is not atomicaly synchronized.
     */
    public void setModifierExtensionArray(org.hl7.fhir.Extension[] modifierExtensionArray)
    {
        check_orphaned();
        arraySetterHelper(modifierExtensionArray, MODIFIEREXTENSION$0);
    }
    
    /**
     * Sets ith "modifierExtension" element
     */
    public void setModifierExtensionArray(int i, org.hl7.fhir.Extension modifierExtension)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.Extension target = null;
            target = (org.hl7.fhir.Extension)get_store().find_element_user(MODIFIEREXTENSION$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(modifierExtension);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "modifierExtension" element
     */
    public org.hl7.fhir.Extension insertNewModifierExtension(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.Extension target = null;
            target = (org.hl7.fhir.Extension)get_store().insert_element_user(MODIFIEREXTENSION$0, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "modifierExtension" element
     */
    public org.hl7.fhir.Extension addNewModifierExtension()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.Extension target = null;
            target = (org.hl7.fhir.Extension)get_store().add_element_user(MODIFIEREXTENSION$0);
            return target;
        }
    }
    
    /**
     * Removes the ith "modifierExtension" element
     */
    public void removeModifierExtension(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(MODIFIEREXTENSION$0, i);
        }
    }
}
