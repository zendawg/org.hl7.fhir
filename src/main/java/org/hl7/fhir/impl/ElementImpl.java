/*
 * XML Type:  Element
 * Namespace: http://hl7.org/fhir
 * Java type: org.hl7.fhir.Element
 *
 * Automatically generated - do not modify.
 */
package org.hl7.fhir.impl;
/**
 * An XML Element(@http://hl7.org/fhir).
 *
 * This is a complex type.
 */
public class ElementImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.hl7.fhir.Element
{
    private static final long serialVersionUID = 1L;
    
    public ElementImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName EXTENSION$0 = 
        new javax.xml.namespace.QName("http://hl7.org/fhir", "extension");
    private static final javax.xml.namespace.QName ID$2 = 
        new javax.xml.namespace.QName("", "id");
    
    
    /**
     * Gets array of all "extension" elements
     */
    public org.hl7.fhir.Extension[] getExtensionArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(EXTENSION$0, targetList);
            org.hl7.fhir.Extension[] result = new org.hl7.fhir.Extension[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "extension" element
     */
    public org.hl7.fhir.Extension getExtensionArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.Extension target = null;
            target = (org.hl7.fhir.Extension)get_store().find_element_user(EXTENSION$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "extension" element
     */
    public int sizeOfExtensionArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(EXTENSION$0);
        }
    }
    
    /**
     * Sets array of all "extension" element  WARNING: This method is not atomicaly synchronized.
     */
    public void setExtensionArray(org.hl7.fhir.Extension[] extensionArray)
    {
        check_orphaned();
        arraySetterHelper(extensionArray, EXTENSION$0);
    }
    
    /**
     * Sets ith "extension" element
     */
    public void setExtensionArray(int i, org.hl7.fhir.Extension extension)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.Extension target = null;
            target = (org.hl7.fhir.Extension)get_store().find_element_user(EXTENSION$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(extension);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "extension" element
     */
    public org.hl7.fhir.Extension insertNewExtension(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.Extension target = null;
            target = (org.hl7.fhir.Extension)get_store().insert_element_user(EXTENSION$0, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "extension" element
     */
    public org.hl7.fhir.Extension addNewExtension()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.Extension target = null;
            target = (org.hl7.fhir.Extension)get_store().add_element_user(EXTENSION$0);
            return target;
        }
    }
    
    /**
     * Removes the ith "extension" element
     */
    public void removeExtension(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(EXTENSION$0, i);
        }
    }
    
    /**
     * Gets the "id" attribute
     */
    public java.lang.String getId()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(ID$2);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "id" attribute
     */
    public org.hl7.fhir.IdPrimitive xgetId()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.IdPrimitive target = null;
            target = (org.hl7.fhir.IdPrimitive)get_store().find_attribute_user(ID$2);
            return target;
        }
    }
    
    /**
     * True if has "id" attribute
     */
    public boolean isSetId()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(ID$2) != null;
        }
    }
    
    /**
     * Sets the "id" attribute
     */
    public void setId(java.lang.String id)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(ID$2);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(ID$2);
            }
            target.setStringValue(id);
        }
    }
    
    /**
     * Sets (as xml) the "id" attribute
     */
    public void xsetId(org.hl7.fhir.IdPrimitive id)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.IdPrimitive target = null;
            target = (org.hl7.fhir.IdPrimitive)get_store().find_attribute_user(ID$2);
            if (target == null)
            {
                target = (org.hl7.fhir.IdPrimitive)get_store().add_attribute_user(ID$2);
            }
            target.set(id);
        }
    }
    
    /**
     * Unsets the "id" attribute
     */
    public void unsetId()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(ID$2);
        }
    }
}
