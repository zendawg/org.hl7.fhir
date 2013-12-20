/*
 * XML Type:  Conformance.SearchParam
 * Namespace: http://hl7.org/fhir
 * Java type: org.hl7.fhir.ConformanceSearchParam
 *
 * Automatically generated - do not modify.
 */
package org.hl7.fhir.impl;
/**
 * An XML Conformance.SearchParam(@http://hl7.org/fhir).
 *
 * This is a complex type.
 */
public class ConformanceSearchParamImpl extends org.hl7.fhir.impl.BackboneElementImpl implements org.hl7.fhir.ConformanceSearchParam
{
    private static final long serialVersionUID = 1L;
    
    public ConformanceSearchParamImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName NAME$0 = 
        new javax.xml.namespace.QName("http://hl7.org/fhir", "name");
    private static final javax.xml.namespace.QName SOURCE$2 = 
        new javax.xml.namespace.QName("http://hl7.org/fhir", "source");
    private static final javax.xml.namespace.QName TYPE$4 = 
        new javax.xml.namespace.QName("http://hl7.org/fhir", "type");
    private static final javax.xml.namespace.QName DOCUMENTATION$6 = 
        new javax.xml.namespace.QName("http://hl7.org/fhir", "documentation");
    private static final javax.xml.namespace.QName XPATH$8 = 
        new javax.xml.namespace.QName("http://hl7.org/fhir", "xpath");
    private static final javax.xml.namespace.QName TARGET$10 = 
        new javax.xml.namespace.QName("http://hl7.org/fhir", "target");
    private static final javax.xml.namespace.QName CHAIN$12 = 
        new javax.xml.namespace.QName("http://hl7.org/fhir", "chain");
    
    
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
     * Gets the "source" element
     */
    public org.hl7.fhir.Uri getSource()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.Uri target = null;
            target = (org.hl7.fhir.Uri)get_store().find_element_user(SOURCE$2, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "source" element
     */
    public boolean isSetSource()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(SOURCE$2) != 0;
        }
    }
    
    /**
     * Sets the "source" element
     */
    public void setSource(org.hl7.fhir.Uri source)
    {
        generatedSetterHelperImpl(source, SOURCE$2, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "source" element
     */
    public org.hl7.fhir.Uri addNewSource()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.Uri target = null;
            target = (org.hl7.fhir.Uri)get_store().add_element_user(SOURCE$2);
            return target;
        }
    }
    
    /**
     * Unsets the "source" element
     */
    public void unsetSource()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(SOURCE$2, 0);
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
            target = (org.hl7.fhir.SearchParamType)get_store().find_element_user(TYPE$4, 0);
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
        generatedSetterHelperImpl(type, TYPE$4, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
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
            target = (org.hl7.fhir.SearchParamType)get_store().add_element_user(TYPE$4);
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
            target = (org.hl7.fhir.String)get_store().find_element_user(DOCUMENTATION$6, 0);
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
        generatedSetterHelperImpl(documentation, DOCUMENTATION$6, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
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
            target = (org.hl7.fhir.String)get_store().add_element_user(DOCUMENTATION$6);
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
            target = (org.hl7.fhir.String)get_store().find_element_user(XPATH$8, 0);
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
            return get_store().count_elements(XPATH$8) != 0;
        }
    }
    
    /**
     * Sets the "xpath" element
     */
    public void setXpath(org.hl7.fhir.String xpath)
    {
        generatedSetterHelperImpl(xpath, XPATH$8, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
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
            target = (org.hl7.fhir.String)get_store().add_element_user(XPATH$8);
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
            get_store().remove_element(XPATH$8, 0);
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
            get_store().find_all_element_users(TARGET$10, targetList);
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
            target = (org.hl7.fhir.Code)get_store().find_element_user(TARGET$10, i);
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
            return get_store().count_elements(TARGET$10);
        }
    }
    
    /**
     * Sets array of all "target" element  WARNING: This method is not atomicaly synchronized.
     */
    public void setTargetArray(org.hl7.fhir.Code[] targetValueArray)
    {
        check_orphaned();
        arraySetterHelper(targetValueArray, TARGET$10);
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
            target = (org.hl7.fhir.Code)get_store().find_element_user(TARGET$10, i);
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
            target = (org.hl7.fhir.Code)get_store().insert_element_user(TARGET$10, i);
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
            target = (org.hl7.fhir.Code)get_store().add_element_user(TARGET$10);
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
            get_store().remove_element(TARGET$10, i);
        }
    }
    
    /**
     * Gets array of all "chain" elements
     */
    public org.hl7.fhir.String[] getChainArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(CHAIN$12, targetList);
            org.hl7.fhir.String[] result = new org.hl7.fhir.String[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "chain" element
     */
    public org.hl7.fhir.String getChainArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.String target = null;
            target = (org.hl7.fhir.String)get_store().find_element_user(CHAIN$12, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "chain" element
     */
    public int sizeOfChainArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(CHAIN$12);
        }
    }
    
    /**
     * Sets array of all "chain" element  WARNING: This method is not atomicaly synchronized.
     */
    public void setChainArray(org.hl7.fhir.String[] chainArray)
    {
        check_orphaned();
        arraySetterHelper(chainArray, CHAIN$12);
    }
    
    /**
     * Sets ith "chain" element
     */
    public void setChainArray(int i, org.hl7.fhir.String chain)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.String target = null;
            target = (org.hl7.fhir.String)get_store().find_element_user(CHAIN$12, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(chain);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "chain" element
     */
    public org.hl7.fhir.String insertNewChain(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.String target = null;
            target = (org.hl7.fhir.String)get_store().insert_element_user(CHAIN$12, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "chain" element
     */
    public org.hl7.fhir.String addNewChain()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.String target = null;
            target = (org.hl7.fhir.String)get_store().add_element_user(CHAIN$12);
            return target;
        }
    }
    
    /**
     * Removes the ith "chain" element
     */
    public void removeChain(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(CHAIN$12, i);
        }
    }
}
