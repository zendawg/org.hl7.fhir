/*
 * XML Type:  ValueSet.Compose
 * Namespace: http://hl7.org/fhir
 * Java type: org.hl7.fhir.ValueSetCompose
 *
 * Automatically generated - do not modify.
 */
package org.hl7.fhir.impl;
/**
 * An XML ValueSet.Compose(@http://hl7.org/fhir).
 *
 * This is a complex type.
 */
public class ValueSetComposeImpl extends org.hl7.fhir.impl.BackboneElementImpl implements org.hl7.fhir.ValueSetCompose
{
    private static final long serialVersionUID = 1L;
    
    public ValueSetComposeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName IMPORT$0 = 
        new javax.xml.namespace.QName("http://hl7.org/fhir", "import");
    private static final javax.xml.namespace.QName INCLUDE$2 = 
        new javax.xml.namespace.QName("http://hl7.org/fhir", "include");
    private static final javax.xml.namespace.QName EXCLUDE$4 = 
        new javax.xml.namespace.QName("http://hl7.org/fhir", "exclude");
    
    
    /**
     * Gets array of all "import" elements
     */
    public org.hl7.fhir.Uri[] getImportArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(IMPORT$0, targetList);
            org.hl7.fhir.Uri[] result = new org.hl7.fhir.Uri[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "import" element
     */
    public org.hl7.fhir.Uri getImportArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.Uri target = null;
            target = (org.hl7.fhir.Uri)get_store().find_element_user(IMPORT$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "import" element
     */
    public int sizeOfImportArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(IMPORT$0);
        }
    }
    
    /**
     * Sets array of all "import" element  WARNING: This method is not atomicaly synchronized.
     */
    public void setImportArray(org.hl7.fhir.Uri[] ximportArray)
    {
        check_orphaned();
        arraySetterHelper(ximportArray, IMPORT$0);
    }
    
    /**
     * Sets ith "import" element
     */
    public void setImportArray(int i, org.hl7.fhir.Uri ximport)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.Uri target = null;
            target = (org.hl7.fhir.Uri)get_store().find_element_user(IMPORT$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(ximport);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "import" element
     */
    public org.hl7.fhir.Uri insertNewImport(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.Uri target = null;
            target = (org.hl7.fhir.Uri)get_store().insert_element_user(IMPORT$0, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "import" element
     */
    public org.hl7.fhir.Uri addNewImport()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.Uri target = null;
            target = (org.hl7.fhir.Uri)get_store().add_element_user(IMPORT$0);
            return target;
        }
    }
    
    /**
     * Removes the ith "import" element
     */
    public void removeImport(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(IMPORT$0, i);
        }
    }
    
    /**
     * Gets array of all "include" elements
     */
    public org.hl7.fhir.ValueSetInclude[] getIncludeArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(INCLUDE$2, targetList);
            org.hl7.fhir.ValueSetInclude[] result = new org.hl7.fhir.ValueSetInclude[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "include" element
     */
    public org.hl7.fhir.ValueSetInclude getIncludeArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.ValueSetInclude target = null;
            target = (org.hl7.fhir.ValueSetInclude)get_store().find_element_user(INCLUDE$2, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "include" element
     */
    public int sizeOfIncludeArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(INCLUDE$2);
        }
    }
    
    /**
     * Sets array of all "include" element  WARNING: This method is not atomicaly synchronized.
     */
    public void setIncludeArray(org.hl7.fhir.ValueSetInclude[] includeArray)
    {
        check_orphaned();
        arraySetterHelper(includeArray, INCLUDE$2);
    }
    
    /**
     * Sets ith "include" element
     */
    public void setIncludeArray(int i, org.hl7.fhir.ValueSetInclude include)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.ValueSetInclude target = null;
            target = (org.hl7.fhir.ValueSetInclude)get_store().find_element_user(INCLUDE$2, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(include);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "include" element
     */
    public org.hl7.fhir.ValueSetInclude insertNewInclude(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.ValueSetInclude target = null;
            target = (org.hl7.fhir.ValueSetInclude)get_store().insert_element_user(INCLUDE$2, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "include" element
     */
    public org.hl7.fhir.ValueSetInclude addNewInclude()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.ValueSetInclude target = null;
            target = (org.hl7.fhir.ValueSetInclude)get_store().add_element_user(INCLUDE$2);
            return target;
        }
    }
    
    /**
     * Removes the ith "include" element
     */
    public void removeInclude(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(INCLUDE$2, i);
        }
    }
    
    /**
     * Gets array of all "exclude" elements
     */
    public org.hl7.fhir.ValueSetInclude[] getExcludeArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(EXCLUDE$4, targetList);
            org.hl7.fhir.ValueSetInclude[] result = new org.hl7.fhir.ValueSetInclude[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "exclude" element
     */
    public org.hl7.fhir.ValueSetInclude getExcludeArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.ValueSetInclude target = null;
            target = (org.hl7.fhir.ValueSetInclude)get_store().find_element_user(EXCLUDE$4, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "exclude" element
     */
    public int sizeOfExcludeArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(EXCLUDE$4);
        }
    }
    
    /**
     * Sets array of all "exclude" element  WARNING: This method is not atomicaly synchronized.
     */
    public void setExcludeArray(org.hl7.fhir.ValueSetInclude[] excludeArray)
    {
        check_orphaned();
        arraySetterHelper(excludeArray, EXCLUDE$4);
    }
    
    /**
     * Sets ith "exclude" element
     */
    public void setExcludeArray(int i, org.hl7.fhir.ValueSetInclude exclude)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.ValueSetInclude target = null;
            target = (org.hl7.fhir.ValueSetInclude)get_store().find_element_user(EXCLUDE$4, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(exclude);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "exclude" element
     */
    public org.hl7.fhir.ValueSetInclude insertNewExclude(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.ValueSetInclude target = null;
            target = (org.hl7.fhir.ValueSetInclude)get_store().insert_element_user(EXCLUDE$4, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "exclude" element
     */
    public org.hl7.fhir.ValueSetInclude addNewExclude()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.ValueSetInclude target = null;
            target = (org.hl7.fhir.ValueSetInclude)get_store().add_element_user(EXCLUDE$4);
            return target;
        }
    }
    
    /**
     * Removes the ith "exclude" element
     */
    public void removeExclude(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(EXCLUDE$4, i);
        }
    }
}
