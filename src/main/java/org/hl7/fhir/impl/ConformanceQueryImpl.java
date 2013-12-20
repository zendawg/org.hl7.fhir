/*
 * XML Type:  Conformance.Query
 * Namespace: http://hl7.org/fhir
 * Java type: org.hl7.fhir.ConformanceQuery
 *
 * Automatically generated - do not modify.
 */
package org.hl7.fhir.impl;
/**
 * An XML Conformance.Query(@http://hl7.org/fhir).
 *
 * This is a complex type.
 */
public class ConformanceQueryImpl extends org.hl7.fhir.impl.BackboneElementImpl implements org.hl7.fhir.ConformanceQuery
{
    private static final long serialVersionUID = 1L;
    
    public ConformanceQueryImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName NAME$0 = 
        new javax.xml.namespace.QName("http://hl7.org/fhir", "name");
    private static final javax.xml.namespace.QName DOCUMENTATION$2 = 
        new javax.xml.namespace.QName("http://hl7.org/fhir", "documentation");
    private static final javax.xml.namespace.QName PARAMETER$4 = 
        new javax.xml.namespace.QName("http://hl7.org/fhir", "parameter");
    
    
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
     * Gets the "documentation" element
     */
    public org.hl7.fhir.String getDocumentation()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.String target = null;
            target = (org.hl7.fhir.String)get_store().find_element_user(DOCUMENTATION$2, 0);
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
        generatedSetterHelperImpl(documentation, DOCUMENTATION$2, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
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
            target = (org.hl7.fhir.String)get_store().add_element_user(DOCUMENTATION$2);
            return target;
        }
    }
    
    /**
     * Gets array of all "parameter" elements
     */
    public org.hl7.fhir.ConformanceSearchParam[] getParameterArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(PARAMETER$4, targetList);
            org.hl7.fhir.ConformanceSearchParam[] result = new org.hl7.fhir.ConformanceSearchParam[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "parameter" element
     */
    public org.hl7.fhir.ConformanceSearchParam getParameterArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.ConformanceSearchParam target = null;
            target = (org.hl7.fhir.ConformanceSearchParam)get_store().find_element_user(PARAMETER$4, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "parameter" element
     */
    public int sizeOfParameterArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(PARAMETER$4);
        }
    }
    
    /**
     * Sets array of all "parameter" element  WARNING: This method is not atomicaly synchronized.
     */
    public void setParameterArray(org.hl7.fhir.ConformanceSearchParam[] parameterArray)
    {
        check_orphaned();
        arraySetterHelper(parameterArray, PARAMETER$4);
    }
    
    /**
     * Sets ith "parameter" element
     */
    public void setParameterArray(int i, org.hl7.fhir.ConformanceSearchParam parameter)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.ConformanceSearchParam target = null;
            target = (org.hl7.fhir.ConformanceSearchParam)get_store().find_element_user(PARAMETER$4, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(parameter);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "parameter" element
     */
    public org.hl7.fhir.ConformanceSearchParam insertNewParameter(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.ConformanceSearchParam target = null;
            target = (org.hl7.fhir.ConformanceSearchParam)get_store().insert_element_user(PARAMETER$4, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "parameter" element
     */
    public org.hl7.fhir.ConformanceSearchParam addNewParameter()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.ConformanceSearchParam target = null;
            target = (org.hl7.fhir.ConformanceSearchParam)get_store().add_element_user(PARAMETER$4);
            return target;
        }
    }
    
    /**
     * Removes the ith "parameter" element
     */
    public void removeParameter(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(PARAMETER$4, i);
        }
    }
}
