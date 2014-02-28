/*
 * XML Type:  Profile.Structure
 * Namespace: http://hl7.org/fhir
 * Java type: org.hl7.fhir.ProfileStructure
 *
 * Automatically generated - do not modify.
 */
package org.hl7.fhir.impl;
/**
 * An XML Profile.Structure(@http://hl7.org/fhir).
 *
 * This is a complex type.
 */
public class ProfileStructureImpl extends org.hl7.fhir.impl.BackboneElementImpl implements org.hl7.fhir.ProfileStructure
{
    private static final long serialVersionUID = 1L;
    
    public ProfileStructureImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName TYPE$0 = 
        new javax.xml.namespace.QName("http://hl7.org/fhir", "type");
    private static final javax.xml.namespace.QName NAME$2 = 
        new javax.xml.namespace.QName("http://hl7.org/fhir", "name");
    private static final javax.xml.namespace.QName PUBLISH$4 = 
        new javax.xml.namespace.QName("http://hl7.org/fhir", "publish");
    private static final javax.xml.namespace.QName PURPOSE$6 = 
        new javax.xml.namespace.QName("http://hl7.org/fhir", "purpose");
    private static final javax.xml.namespace.QName ELEMENT$8 = 
        new javax.xml.namespace.QName("http://hl7.org/fhir", "element");
    private static final javax.xml.namespace.QName SEARCHPARAM$10 = 
        new javax.xml.namespace.QName("http://hl7.org/fhir", "searchParam");
    
    
    /**
     * Gets the "type" element
     */
    public org.hl7.fhir.Code getType()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.Code target = null;
            target = (org.hl7.fhir.Code)get_store().find_element_user(TYPE$0, 0);
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
    public void setType(org.hl7.fhir.Code type)
    {
        generatedSetterHelperImpl(type, TYPE$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "type" element
     */
    public org.hl7.fhir.Code addNewType()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.Code target = null;
            target = (org.hl7.fhir.Code)get_store().add_element_user(TYPE$0);
            return target;
        }
    }
    
    /**
     * Gets the "name" element
     */
    public org.hl7.fhir.String getName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.String target = null;
            target = (org.hl7.fhir.String)get_store().find_element_user(NAME$2, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "name" element
     */
    public boolean isSetName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(NAME$2) != 0;
        }
    }
    
    /**
     * Sets the "name" element
     */
    public void setName(org.hl7.fhir.String name)
    {
        generatedSetterHelperImpl(name, NAME$2, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
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
            target = (org.hl7.fhir.String)get_store().add_element_user(NAME$2);
            return target;
        }
    }
    
    /**
     * Unsets the "name" element
     */
    public void unsetName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(NAME$2, 0);
        }
    }
    
    /**
     * Gets the "publish" element
     */
    public org.hl7.fhir.Boolean getPublish()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.Boolean target = null;
            target = (org.hl7.fhir.Boolean)get_store().find_element_user(PUBLISH$4, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "publish" element
     */
    public boolean isSetPublish()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(PUBLISH$4) != 0;
        }
    }
    
    /**
     * Sets the "publish" element
     */
    public void setPublish(org.hl7.fhir.Boolean publish)
    {
        generatedSetterHelperImpl(publish, PUBLISH$4, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "publish" element
     */
    public org.hl7.fhir.Boolean addNewPublish()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.Boolean target = null;
            target = (org.hl7.fhir.Boolean)get_store().add_element_user(PUBLISH$4);
            return target;
        }
    }
    
    /**
     * Unsets the "publish" element
     */
    public void unsetPublish()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(PUBLISH$4, 0);
        }
    }
    
    /**
     * Gets the "purpose" element
     */
    public org.hl7.fhir.String getPurpose()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.String target = null;
            target = (org.hl7.fhir.String)get_store().find_element_user(PURPOSE$6, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "purpose" element
     */
    public boolean isSetPurpose()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(PURPOSE$6) != 0;
        }
    }
    
    /**
     * Sets the "purpose" element
     */
    public void setPurpose(org.hl7.fhir.String purpose)
    {
        generatedSetterHelperImpl(purpose, PURPOSE$6, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "purpose" element
     */
    public org.hl7.fhir.String addNewPurpose()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.String target = null;
            target = (org.hl7.fhir.String)get_store().add_element_user(PURPOSE$6);
            return target;
        }
    }
    
    /**
     * Unsets the "purpose" element
     */
    public void unsetPurpose()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(PURPOSE$6, 0);
        }
    }
    
    /**
     * Gets array of all "element" elements
     */
    public org.hl7.fhir.ProfileElement[] getElementArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(ELEMENT$8, targetList);
            org.hl7.fhir.ProfileElement[] result = new org.hl7.fhir.ProfileElement[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "element" element
     */
    public org.hl7.fhir.ProfileElement getElementArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.ProfileElement target = null;
            target = (org.hl7.fhir.ProfileElement)get_store().find_element_user(ELEMENT$8, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "element" element
     */
    public int sizeOfElementArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(ELEMENT$8);
        }
    }
    
    /**
     * Sets array of all "element" element  WARNING: This method is not atomicaly synchronized.
     */
    public void setElementArray(org.hl7.fhir.ProfileElement[] elementArray)
    {
        check_orphaned();
        arraySetterHelper(elementArray, ELEMENT$8);
    }
    
    /**
     * Sets ith "element" element
     */
    public void setElementArray(int i, org.hl7.fhir.ProfileElement element)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.ProfileElement target = null;
            target = (org.hl7.fhir.ProfileElement)get_store().find_element_user(ELEMENT$8, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(element);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "element" element
     */
    public org.hl7.fhir.ProfileElement insertNewElement(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.ProfileElement target = null;
            target = (org.hl7.fhir.ProfileElement)get_store().insert_element_user(ELEMENT$8, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "element" element
     */
    public org.hl7.fhir.ProfileElement addNewElement()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.ProfileElement target = null;
            target = (org.hl7.fhir.ProfileElement)get_store().add_element_user(ELEMENT$8);
            return target;
        }
    }
    
    /**
     * Removes the ith "element" element
     */
    public void removeElement(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(ELEMENT$8, i);
        }
    }
    
    /**
     * Gets array of all "searchParam" elements
     */
    public org.hl7.fhir.ProfileSearchParam[] getSearchParamArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(SEARCHPARAM$10, targetList);
            org.hl7.fhir.ProfileSearchParam[] result = new org.hl7.fhir.ProfileSearchParam[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "searchParam" element
     */
    public org.hl7.fhir.ProfileSearchParam getSearchParamArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.ProfileSearchParam target = null;
            target = (org.hl7.fhir.ProfileSearchParam)get_store().find_element_user(SEARCHPARAM$10, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "searchParam" element
     */
    public int sizeOfSearchParamArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(SEARCHPARAM$10);
        }
    }
    
    /**
     * Sets array of all "searchParam" element  WARNING: This method is not atomicaly synchronized.
     */
    public void setSearchParamArray(org.hl7.fhir.ProfileSearchParam[] searchParamArray)
    {
        check_orphaned();
        arraySetterHelper(searchParamArray, SEARCHPARAM$10);
    }
    
    /**
     * Sets ith "searchParam" element
     */
    public void setSearchParamArray(int i, org.hl7.fhir.ProfileSearchParam searchParam)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.ProfileSearchParam target = null;
            target = (org.hl7.fhir.ProfileSearchParam)get_store().find_element_user(SEARCHPARAM$10, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(searchParam);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "searchParam" element
     */
    public org.hl7.fhir.ProfileSearchParam insertNewSearchParam(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.ProfileSearchParam target = null;
            target = (org.hl7.fhir.ProfileSearchParam)get_store().insert_element_user(SEARCHPARAM$10, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "searchParam" element
     */
    public org.hl7.fhir.ProfileSearchParam addNewSearchParam()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.ProfileSearchParam target = null;
            target = (org.hl7.fhir.ProfileSearchParam)get_store().add_element_user(SEARCHPARAM$10);
            return target;
        }
    }
    
    /**
     * Removes the ith "searchParam" element
     */
    public void removeSearchParam(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(SEARCHPARAM$10, i);
        }
    }
}
