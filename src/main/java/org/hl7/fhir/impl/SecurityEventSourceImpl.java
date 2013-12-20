/*
 * XML Type:  SecurityEvent.Source
 * Namespace: http://hl7.org/fhir
 * Java type: org.hl7.fhir.SecurityEventSource
 *
 * Automatically generated - do not modify.
 */
package org.hl7.fhir.impl;
/**
 * An XML SecurityEvent.Source(@http://hl7.org/fhir).
 *
 * This is a complex type.
 */
public class SecurityEventSourceImpl extends org.hl7.fhir.impl.BackboneElementImpl implements org.hl7.fhir.SecurityEventSource
{
    private static final long serialVersionUID = 1L;
    
    public SecurityEventSourceImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName SITE$0 = 
        new javax.xml.namespace.QName("http://hl7.org/fhir", "site");
    private static final javax.xml.namespace.QName IDENTIFIER$2 = 
        new javax.xml.namespace.QName("http://hl7.org/fhir", "identifier");
    private static final javax.xml.namespace.QName TYPE$4 = 
        new javax.xml.namespace.QName("http://hl7.org/fhir", "type");
    
    
    /**
     * Gets the "site" element
     */
    public org.hl7.fhir.String getSite()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.String target = null;
            target = (org.hl7.fhir.String)get_store().find_element_user(SITE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "site" element
     */
    public boolean isSetSite()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(SITE$0) != 0;
        }
    }
    
    /**
     * Sets the "site" element
     */
    public void setSite(org.hl7.fhir.String site)
    {
        generatedSetterHelperImpl(site, SITE$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "site" element
     */
    public org.hl7.fhir.String addNewSite()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.String target = null;
            target = (org.hl7.fhir.String)get_store().add_element_user(SITE$0);
            return target;
        }
    }
    
    /**
     * Unsets the "site" element
     */
    public void unsetSite()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(SITE$0, 0);
        }
    }
    
    /**
     * Gets the "identifier" element
     */
    public org.hl7.fhir.String getIdentifier()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.String target = null;
            target = (org.hl7.fhir.String)get_store().find_element_user(IDENTIFIER$2, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "identifier" element
     */
    public void setIdentifier(org.hl7.fhir.String identifier)
    {
        generatedSetterHelperImpl(identifier, IDENTIFIER$2, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "identifier" element
     */
    public org.hl7.fhir.String addNewIdentifier()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.String target = null;
            target = (org.hl7.fhir.String)get_store().add_element_user(IDENTIFIER$2);
            return target;
        }
    }
    
    /**
     * Gets array of all "type" elements
     */
    public org.hl7.fhir.Coding[] getTypeArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(TYPE$4, targetList);
            org.hl7.fhir.Coding[] result = new org.hl7.fhir.Coding[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "type" element
     */
    public org.hl7.fhir.Coding getTypeArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.Coding target = null;
            target = (org.hl7.fhir.Coding)get_store().find_element_user(TYPE$4, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "type" element
     */
    public int sizeOfTypeArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(TYPE$4);
        }
    }
    
    /**
     * Sets array of all "type" element  WARNING: This method is not atomicaly synchronized.
     */
    public void setTypeArray(org.hl7.fhir.Coding[] typeArray)
    {
        check_orphaned();
        arraySetterHelper(typeArray, TYPE$4);
    }
    
    /**
     * Sets ith "type" element
     */
    public void setTypeArray(int i, org.hl7.fhir.Coding type)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.Coding target = null;
            target = (org.hl7.fhir.Coding)get_store().find_element_user(TYPE$4, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(type);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "type" element
     */
    public org.hl7.fhir.Coding insertNewType(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.Coding target = null;
            target = (org.hl7.fhir.Coding)get_store().insert_element_user(TYPE$4, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "type" element
     */
    public org.hl7.fhir.Coding addNewType()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.Coding target = null;
            target = (org.hl7.fhir.Coding)get_store().add_element_user(TYPE$4);
            return target;
        }
    }
    
    /**
     * Removes the ith "type" element
     */
    public void removeType(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(TYPE$4, i);
        }
    }
}
