/*
 * XML Type:  Conformance.Resource
 * Namespace: http://hl7.org/fhir
 * Java type: org.hl7.fhir.ConformanceResource
 *
 * Automatically generated - do not modify.
 */
package org.hl7.fhir.impl;
/**
 * An XML Conformance.Resource(@http://hl7.org/fhir).
 *
 * This is a complex type.
 */
public class ConformanceResourceImpl extends org.hl7.fhir.impl.BackboneElementImpl implements org.hl7.fhir.ConformanceResource
{
    private static final long serialVersionUID = 1L;
    
    public ConformanceResourceImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName TYPE$0 = 
        new javax.xml.namespace.QName("http://hl7.org/fhir", "type");
    private static final javax.xml.namespace.QName PROFILE$2 = 
        new javax.xml.namespace.QName("http://hl7.org/fhir", "profile");
    private static final javax.xml.namespace.QName OPERATION$4 = 
        new javax.xml.namespace.QName("http://hl7.org/fhir", "operation");
    private static final javax.xml.namespace.QName READHISTORY$6 = 
        new javax.xml.namespace.QName("http://hl7.org/fhir", "readHistory");
    private static final javax.xml.namespace.QName UPDATECREATE$8 = 
        new javax.xml.namespace.QName("http://hl7.org/fhir", "updateCreate");
    private static final javax.xml.namespace.QName SEARCHINCLUDE$10 = 
        new javax.xml.namespace.QName("http://hl7.org/fhir", "searchInclude");
    private static final javax.xml.namespace.QName SEARCHPARAM$12 = 
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
     * Gets the "profile" element
     */
    public org.hl7.fhir.ResourceReference getProfile()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.ResourceReference target = null;
            target = (org.hl7.fhir.ResourceReference)get_store().find_element_user(PROFILE$2, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "profile" element
     */
    public boolean isSetProfile()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(PROFILE$2) != 0;
        }
    }
    
    /**
     * Sets the "profile" element
     */
    public void setProfile(org.hl7.fhir.ResourceReference profile)
    {
        generatedSetterHelperImpl(profile, PROFILE$2, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "profile" element
     */
    public org.hl7.fhir.ResourceReference addNewProfile()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.ResourceReference target = null;
            target = (org.hl7.fhir.ResourceReference)get_store().add_element_user(PROFILE$2);
            return target;
        }
    }
    
    /**
     * Unsets the "profile" element
     */
    public void unsetProfile()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(PROFILE$2, 0);
        }
    }
    
    /**
     * Gets array of all "operation" elements
     */
    public org.hl7.fhir.ConformanceOperation[] getOperationArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(OPERATION$4, targetList);
            org.hl7.fhir.ConformanceOperation[] result = new org.hl7.fhir.ConformanceOperation[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "operation" element
     */
    public org.hl7.fhir.ConformanceOperation getOperationArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.ConformanceOperation target = null;
            target = (org.hl7.fhir.ConformanceOperation)get_store().find_element_user(OPERATION$4, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "operation" element
     */
    public int sizeOfOperationArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(OPERATION$4);
        }
    }
    
    /**
     * Sets array of all "operation" element  WARNING: This method is not atomicaly synchronized.
     */
    public void setOperationArray(org.hl7.fhir.ConformanceOperation[] operationArray)
    {
        check_orphaned();
        arraySetterHelper(operationArray, OPERATION$4);
    }
    
    /**
     * Sets ith "operation" element
     */
    public void setOperationArray(int i, org.hl7.fhir.ConformanceOperation operation)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.ConformanceOperation target = null;
            target = (org.hl7.fhir.ConformanceOperation)get_store().find_element_user(OPERATION$4, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(operation);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "operation" element
     */
    public org.hl7.fhir.ConformanceOperation insertNewOperation(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.ConformanceOperation target = null;
            target = (org.hl7.fhir.ConformanceOperation)get_store().insert_element_user(OPERATION$4, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "operation" element
     */
    public org.hl7.fhir.ConformanceOperation addNewOperation()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.ConformanceOperation target = null;
            target = (org.hl7.fhir.ConformanceOperation)get_store().add_element_user(OPERATION$4);
            return target;
        }
    }
    
    /**
     * Removes the ith "operation" element
     */
    public void removeOperation(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(OPERATION$4, i);
        }
    }
    
    /**
     * Gets the "readHistory" element
     */
    public org.hl7.fhir.Boolean getReadHistory()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.Boolean target = null;
            target = (org.hl7.fhir.Boolean)get_store().find_element_user(READHISTORY$6, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "readHistory" element
     */
    public boolean isSetReadHistory()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(READHISTORY$6) != 0;
        }
    }
    
    /**
     * Sets the "readHistory" element
     */
    public void setReadHistory(org.hl7.fhir.Boolean readHistory)
    {
        generatedSetterHelperImpl(readHistory, READHISTORY$6, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "readHistory" element
     */
    public org.hl7.fhir.Boolean addNewReadHistory()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.Boolean target = null;
            target = (org.hl7.fhir.Boolean)get_store().add_element_user(READHISTORY$6);
            return target;
        }
    }
    
    /**
     * Unsets the "readHistory" element
     */
    public void unsetReadHistory()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(READHISTORY$6, 0);
        }
    }
    
    /**
     * Gets the "updateCreate" element
     */
    public org.hl7.fhir.Boolean getUpdateCreate()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.Boolean target = null;
            target = (org.hl7.fhir.Boolean)get_store().find_element_user(UPDATECREATE$8, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "updateCreate" element
     */
    public boolean isSetUpdateCreate()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(UPDATECREATE$8) != 0;
        }
    }
    
    /**
     * Sets the "updateCreate" element
     */
    public void setUpdateCreate(org.hl7.fhir.Boolean updateCreate)
    {
        generatedSetterHelperImpl(updateCreate, UPDATECREATE$8, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "updateCreate" element
     */
    public org.hl7.fhir.Boolean addNewUpdateCreate()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.Boolean target = null;
            target = (org.hl7.fhir.Boolean)get_store().add_element_user(UPDATECREATE$8);
            return target;
        }
    }
    
    /**
     * Unsets the "updateCreate" element
     */
    public void unsetUpdateCreate()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(UPDATECREATE$8, 0);
        }
    }
    
    /**
     * Gets array of all "searchInclude" elements
     */
    public org.hl7.fhir.String[] getSearchIncludeArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(SEARCHINCLUDE$10, targetList);
            org.hl7.fhir.String[] result = new org.hl7.fhir.String[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "searchInclude" element
     */
    public org.hl7.fhir.String getSearchIncludeArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.String target = null;
            target = (org.hl7.fhir.String)get_store().find_element_user(SEARCHINCLUDE$10, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "searchInclude" element
     */
    public int sizeOfSearchIncludeArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(SEARCHINCLUDE$10);
        }
    }
    
    /**
     * Sets array of all "searchInclude" element  WARNING: This method is not atomicaly synchronized.
     */
    public void setSearchIncludeArray(org.hl7.fhir.String[] searchIncludeArray)
    {
        check_orphaned();
        arraySetterHelper(searchIncludeArray, SEARCHINCLUDE$10);
    }
    
    /**
     * Sets ith "searchInclude" element
     */
    public void setSearchIncludeArray(int i, org.hl7.fhir.String searchInclude)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.String target = null;
            target = (org.hl7.fhir.String)get_store().find_element_user(SEARCHINCLUDE$10, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(searchInclude);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "searchInclude" element
     */
    public org.hl7.fhir.String insertNewSearchInclude(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.String target = null;
            target = (org.hl7.fhir.String)get_store().insert_element_user(SEARCHINCLUDE$10, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "searchInclude" element
     */
    public org.hl7.fhir.String addNewSearchInclude()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.String target = null;
            target = (org.hl7.fhir.String)get_store().add_element_user(SEARCHINCLUDE$10);
            return target;
        }
    }
    
    /**
     * Removes the ith "searchInclude" element
     */
    public void removeSearchInclude(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(SEARCHINCLUDE$10, i);
        }
    }
    
    /**
     * Gets array of all "searchParam" elements
     */
    public org.hl7.fhir.ConformanceSearchParam[] getSearchParamArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(SEARCHPARAM$12, targetList);
            org.hl7.fhir.ConformanceSearchParam[] result = new org.hl7.fhir.ConformanceSearchParam[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "searchParam" element
     */
    public org.hl7.fhir.ConformanceSearchParam getSearchParamArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.ConformanceSearchParam target = null;
            target = (org.hl7.fhir.ConformanceSearchParam)get_store().find_element_user(SEARCHPARAM$12, i);
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
            return get_store().count_elements(SEARCHPARAM$12);
        }
    }
    
    /**
     * Sets array of all "searchParam" element  WARNING: This method is not atomicaly synchronized.
     */
    public void setSearchParamArray(org.hl7.fhir.ConformanceSearchParam[] searchParamArray)
    {
        check_orphaned();
        arraySetterHelper(searchParamArray, SEARCHPARAM$12);
    }
    
    /**
     * Sets ith "searchParam" element
     */
    public void setSearchParamArray(int i, org.hl7.fhir.ConformanceSearchParam searchParam)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.ConformanceSearchParam target = null;
            target = (org.hl7.fhir.ConformanceSearchParam)get_store().find_element_user(SEARCHPARAM$12, i);
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
    public org.hl7.fhir.ConformanceSearchParam insertNewSearchParam(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.ConformanceSearchParam target = null;
            target = (org.hl7.fhir.ConformanceSearchParam)get_store().insert_element_user(SEARCHPARAM$12, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "searchParam" element
     */
    public org.hl7.fhir.ConformanceSearchParam addNewSearchParam()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.ConformanceSearchParam target = null;
            target = (org.hl7.fhir.ConformanceSearchParam)get_store().add_element_user(SEARCHPARAM$12);
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
            get_store().remove_element(SEARCHPARAM$12, i);
        }
    }
}
