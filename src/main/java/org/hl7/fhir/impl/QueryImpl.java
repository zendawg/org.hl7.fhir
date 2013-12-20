/*
 * XML Type:  Query
 * Namespace: http://hl7.org/fhir
 * Java type: org.hl7.fhir.Query
 *
 * Automatically generated - do not modify.
 */
package org.hl7.fhir.impl;
/**
 * An XML Query(@http://hl7.org/fhir).
 *
 * This is a complex type.
 */
public class QueryImpl extends org.hl7.fhir.impl.ResourceImpl implements org.hl7.fhir.Query
{
    private static final long serialVersionUID = 1L;
    
    public QueryImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName IDENTIFIER$0 = 
        new javax.xml.namespace.QName("http://hl7.org/fhir", "identifier");
    private static final javax.xml.namespace.QName PARAMETER$2 = 
        new javax.xml.namespace.QName("http://hl7.org/fhir", "parameter");
    private static final javax.xml.namespace.QName RESPONSE$4 = 
        new javax.xml.namespace.QName("http://hl7.org/fhir", "response");
    
    
    /**
     * Gets the "identifier" element
     */
    public org.hl7.fhir.Uri getIdentifier()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.Uri target = null;
            target = (org.hl7.fhir.Uri)get_store().find_element_user(IDENTIFIER$0, 0);
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
    public void setIdentifier(org.hl7.fhir.Uri identifier)
    {
        generatedSetterHelperImpl(identifier, IDENTIFIER$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "identifier" element
     */
    public org.hl7.fhir.Uri addNewIdentifier()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.Uri target = null;
            target = (org.hl7.fhir.Uri)get_store().add_element_user(IDENTIFIER$0);
            return target;
        }
    }
    
    /**
     * Gets array of all "parameter" elements
     */
    public org.hl7.fhir.Extension[] getParameterArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(PARAMETER$2, targetList);
            org.hl7.fhir.Extension[] result = new org.hl7.fhir.Extension[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "parameter" element
     */
    public org.hl7.fhir.Extension getParameterArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.Extension target = null;
            target = (org.hl7.fhir.Extension)get_store().find_element_user(PARAMETER$2, i);
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
            return get_store().count_elements(PARAMETER$2);
        }
    }
    
    /**
     * Sets array of all "parameter" element  WARNING: This method is not atomicaly synchronized.
     */
    public void setParameterArray(org.hl7.fhir.Extension[] parameterArray)
    {
        check_orphaned();
        arraySetterHelper(parameterArray, PARAMETER$2);
    }
    
    /**
     * Sets ith "parameter" element
     */
    public void setParameterArray(int i, org.hl7.fhir.Extension parameter)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.Extension target = null;
            target = (org.hl7.fhir.Extension)get_store().find_element_user(PARAMETER$2, i);
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
    public org.hl7.fhir.Extension insertNewParameter(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.Extension target = null;
            target = (org.hl7.fhir.Extension)get_store().insert_element_user(PARAMETER$2, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "parameter" element
     */
    public org.hl7.fhir.Extension addNewParameter()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.Extension target = null;
            target = (org.hl7.fhir.Extension)get_store().add_element_user(PARAMETER$2);
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
            get_store().remove_element(PARAMETER$2, i);
        }
    }
    
    /**
     * Gets the "response" element
     */
    public org.hl7.fhir.QueryResponse getResponse()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.QueryResponse target = null;
            target = (org.hl7.fhir.QueryResponse)get_store().find_element_user(RESPONSE$4, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "response" element
     */
    public boolean isSetResponse()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(RESPONSE$4) != 0;
        }
    }
    
    /**
     * Sets the "response" element
     */
    public void setResponse(org.hl7.fhir.QueryResponse response)
    {
        generatedSetterHelperImpl(response, RESPONSE$4, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "response" element
     */
    public org.hl7.fhir.QueryResponse addNewResponse()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.QueryResponse target = null;
            target = (org.hl7.fhir.QueryResponse)get_store().add_element_user(RESPONSE$4);
            return target;
        }
    }
    
    /**
     * Unsets the "response" element
     */
    public void unsetResponse()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(RESPONSE$4, 0);
        }
    }
}
