/*
 * XML Type:  Profile.SearchParam
 * Namespace: http://hl7.org/fhir
 * Java type: org.hl7.fhir.ProfileSearchParam
 *
 * Automatically generated - do not modify.
 */
package org.hl7.fhir.impl;
/**
 * An XML Profile.SearchParam(@http://hl7.org/fhir).
 *
 * This is a complex type.
 */
public class ProfileSearchParamImpl extends org.hl7.fhir.impl.BackboneElementImpl implements org.hl7.fhir.ProfileSearchParam
{
    private static final long serialVersionUID = 1L;
    
    public ProfileSearchParamImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName NAME$0 = 
        new javax.xml.namespace.QName("http://hl7.org/fhir", "name");
    private static final javax.xml.namespace.QName TYPE$2 = 
        new javax.xml.namespace.QName("http://hl7.org/fhir", "type");
    private static final javax.xml.namespace.QName DOCUMENTATION$4 = 
        new javax.xml.namespace.QName("http://hl7.org/fhir", "documentation");
    private static final javax.xml.namespace.QName XPATH$6 = 
        new javax.xml.namespace.QName("http://hl7.org/fhir", "xpath");
    private static final javax.xml.namespace.QName TARGET$8 = 
        new javax.xml.namespace.QName("http://hl7.org/fhir", "target");
    
    
    /**
     * Gets the "name" element
     */
    public org.hl7.fhir.String getName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.String target = null;
            target = (org.hl7.fhir.String)get_store().find_element_user(NAME$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "name" element
     */
    public void setName(org.hl7.fhir.String name)
    {
        generatedSetterHelperImpl(name, NAME$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "name" element
     */
    public org.hl7.fhir.String addNewName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.String target = null;
            target = (org.hl7.fhir.String)get_store().add_element_user(NAME$0);
            return target;
        }
    }
    
    /**
     * Gets the "type" element
     */
    public org.hl7.fhir.SearchParamType getType()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.SearchParamType target = null;
            target = (org.hl7.fhir.SearchParamType)get_store().find_element_user(TYPE$2, 0);
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
    public void setType(org.hl7.fhir.SearchParamType type)
    {
        generatedSetterHelperImpl(type, TYPE$2, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "type" element
     */
    public org.hl7.fhir.SearchParamType addNewType()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.SearchParamType target = null;
            target = (org.hl7.fhir.SearchParamType)get_store().add_element_user(TYPE$2);
            return target;
        }
    }
    
    /**
     * Gets the "documentation" element
     */
    public org.hl7.fhir.String getDocumentation()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.String target = null;
            target = (org.hl7.fhir.String)get_store().find_element_user(DOCUMENTATION$4, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "documentation" element
     */
    public void setDocumentation(org.hl7.fhir.String documentation)
    {
        generatedSetterHelperImpl(documentation, DOCUMENTATION$4, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "documentation" element
     */
    public org.hl7.fhir.String addNewDocumentation()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.String target = null;
            target = (org.hl7.fhir.String)get_store().add_element_user(DOCUMENTATION$4);
            return target;
        }
    }
    
    /**
     * Gets the "xpath" element
     */
    public org.hl7.fhir.String getXpath()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.String target = null;
            target = (org.hl7.fhir.String)get_store().find_element_user(XPATH$6, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "xpath" element
     */
    public boolean isSetXpath()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(XPATH$6) != 0;
        }
    }
    
    /**
     * Sets the "xpath" element
     */
    public void setXpath(org.hl7.fhir.String xpath)
    {
        generatedSetterHelperImpl(xpath, XPATH$6, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "xpath" element
     */
    public org.hl7.fhir.String addNewXpath()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.String target = null;
            target = (org.hl7.fhir.String)get_store().add_element_user(XPATH$6);
            return target;
        }
    }
    
    /**
     * Unsets the "xpath" element
     */
    public void unsetXpath()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(XPATH$6, 0);
        }
    }
    
    /**
     * Gets array of all "target" elements
     */
    public org.hl7.fhir.Code[] getTargetArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(TARGET$8, targetList);
            org.hl7.fhir.Code[] result = new org.hl7.fhir.Code[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "target" element
     */
    public org.hl7.fhir.Code getTargetArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.Code target = null;
            target = (org.hl7.fhir.Code)get_store().find_element_user(TARGET$8, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "target" element
     */
    public int sizeOfTargetArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(TARGET$8);
        }
    }
    
    /**
     * Sets array of all "target" element  WARNING: This method is not atomicaly synchronized.
     */
    public void setTargetArray(org.hl7.fhir.Code[] targetValueArray)
    {
        check_orphaned();
        arraySetterHelper(targetValueArray, TARGET$8);
    }
    
    /**
     * Sets ith "target" element
     */
    public void setTargetArray(int i, org.hl7.fhir.Code targetValue)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.Code target = null;
            target = (org.hl7.fhir.Code)get_store().find_element_user(TARGET$8, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(targetValue);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "target" element
     */
    public org.hl7.fhir.Code insertNewTarget(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.Code target = null;
            target = (org.hl7.fhir.Code)get_store().insert_element_user(TARGET$8, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "target" element
     */
    public org.hl7.fhir.Code addNewTarget()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.Code target = null;
            target = (org.hl7.fhir.Code)get_store().add_element_user(TARGET$8);
            return target;
        }
    }
    
    /**
     * Removes the ith "target" element
     */
    public void removeTarget(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(TARGET$8, i);
        }
    }
}
