/*
 * XML Type:  Resource
 * Namespace: http://hl7.org/fhir
 * Java type: org.hl7.fhir.Resource
 *
 * Automatically generated - do not modify.
 */
package org.hl7.fhir.impl;
/**
 * An XML Resource(@http://hl7.org/fhir).
 *
 * This is a complex type.
 */
public class ResourceImpl extends org.hl7.fhir.impl.BackboneElementImpl implements org.hl7.fhir.Resource
{
    private static final long serialVersionUID = 1L;
    
    public ResourceImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName LANGUAGE$0 = 
        new javax.xml.namespace.QName("http://hl7.org/fhir", "language");
    private static final javax.xml.namespace.QName TEXT$2 = 
        new javax.xml.namespace.QName("http://hl7.org/fhir", "text");
    private static final javax.xml.namespace.QName CONTAINED$4 = 
        new javax.xml.namespace.QName("http://hl7.org/fhir", "contained");
    
    
    /**
     * Gets the "language" element
     */
    public org.hl7.fhir.Code getLanguage()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.Code target = null;
            target = (org.hl7.fhir.Code)get_store().find_element_user(LANGUAGE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "language" element
     */
    public boolean isSetLanguage()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(LANGUAGE$0) != 0;
        }
    }
    
    /**
     * Sets the "language" element
     */
    public void setLanguage(org.hl7.fhir.Code language)
    {
        generatedSetterHelperImpl(language, LANGUAGE$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "language" element
     */
    public org.hl7.fhir.Code addNewLanguage()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.Code target = null;
            target = (org.hl7.fhir.Code)get_store().add_element_user(LANGUAGE$0);
            return target;
        }
    }
    
    /**
     * Unsets the "language" element
     */
    public void unsetLanguage()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(LANGUAGE$0, 0);
        }
    }
    
    /**
     * Gets the "text" element
     */
    public org.hl7.fhir.Narrative getText()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.Narrative target = null;
            target = (org.hl7.fhir.Narrative)get_store().find_element_user(TEXT$2, 0);
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
    public void setText(org.hl7.fhir.Narrative text)
    {
        generatedSetterHelperImpl(text, TEXT$2, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "text" element
     */
    public org.hl7.fhir.Narrative addNewText()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.Narrative target = null;
            target = (org.hl7.fhir.Narrative)get_store().add_element_user(TEXT$2);
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
    
    /**
     * Gets array of all "contained" elements
     */
    public org.hl7.fhir.ResourceInline[] getContainedArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(CONTAINED$4, targetList);
            org.hl7.fhir.ResourceInline[] result = new org.hl7.fhir.ResourceInline[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "contained" element
     */
    public org.hl7.fhir.ResourceInline getContainedArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.ResourceInline target = null;
            target = (org.hl7.fhir.ResourceInline)get_store().find_element_user(CONTAINED$4, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "contained" element
     */
    public int sizeOfContainedArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(CONTAINED$4);
        }
    }
    
    /**
     * Sets array of all "contained" element  WARNING: This method is not atomicaly synchronized.
     */
    public void setContainedArray(org.hl7.fhir.ResourceInline[] containedArray)
    {
        check_orphaned();
        arraySetterHelper(containedArray, CONTAINED$4);
    }
    
    /**
     * Sets ith "contained" element
     */
    public void setContainedArray(int i, org.hl7.fhir.ResourceInline contained)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.ResourceInline target = null;
            target = (org.hl7.fhir.ResourceInline)get_store().find_element_user(CONTAINED$4, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(contained);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "contained" element
     */
    public org.hl7.fhir.ResourceInline insertNewContained(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.ResourceInline target = null;
            target = (org.hl7.fhir.ResourceInline)get_store().insert_element_user(CONTAINED$4, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "contained" element
     */
    public org.hl7.fhir.ResourceInline addNewContained()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.ResourceInline target = null;
            target = (org.hl7.fhir.ResourceInline)get_store().add_element_user(CONTAINED$4);
            return target;
        }
    }
    
    /**
     * Removes the ith "contained" element
     */
    public void removeContained(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(CONTAINED$4, i);
        }
    }
}
