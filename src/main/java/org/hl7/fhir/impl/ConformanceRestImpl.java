/*
 * XML Type:  Conformance.Rest
 * Namespace: http://hl7.org/fhir
 * Java type: org.hl7.fhir.ConformanceRest
 *
 * Automatically generated - do not modify.
 */
package org.hl7.fhir.impl;
/**
 * An XML Conformance.Rest(@http://hl7.org/fhir).
 *
 * This is a complex type.
 */
public class ConformanceRestImpl extends org.hl7.fhir.impl.BackboneElementImpl implements org.hl7.fhir.ConformanceRest
{
    private static final long serialVersionUID = 1L;
    
    public ConformanceRestImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName MODE$0 = 
        new javax.xml.namespace.QName("http://hl7.org/fhir", "mode");
    private static final javax.xml.namespace.QName DOCUMENTATION$2 = 
        new javax.xml.namespace.QName("http://hl7.org/fhir", "documentation");
    private static final javax.xml.namespace.QName SECURITY$4 = 
        new javax.xml.namespace.QName("http://hl7.org/fhir", "security");
    private static final javax.xml.namespace.QName RESOURCE$6 = 
        new javax.xml.namespace.QName("http://hl7.org/fhir", "resource");
    private static final javax.xml.namespace.QName OPERATION$8 = 
        new javax.xml.namespace.QName("http://hl7.org/fhir", "operation");
    private static final javax.xml.namespace.QName QUERY$10 = 
        new javax.xml.namespace.QName("http://hl7.org/fhir", "query");
    private static final javax.xml.namespace.QName DOCUMENTMAILBOX$12 = 
        new javax.xml.namespace.QName("http://hl7.org/fhir", "documentMailbox");
    
    
    /**
     * Gets the "mode" element
     */
    public org.hl7.fhir.RestfulConformanceMode getMode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.RestfulConformanceMode target = null;
            target = (org.hl7.fhir.RestfulConformanceMode)get_store().find_element_user(MODE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "mode" element
     */
    public void setMode(org.hl7.fhir.RestfulConformanceMode mode)
    {
        generatedSetterHelperImpl(mode, MODE$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "mode" element
     */
    public org.hl7.fhir.RestfulConformanceMode addNewMode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.RestfulConformanceMode target = null;
            target = (org.hl7.fhir.RestfulConformanceMode)get_store().add_element_user(MODE$0);
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
     * True if has "documentation" element
     */
    public boolean isSetDocumentation()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(DOCUMENTATION$2) != 0;
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
     * Unsets the "documentation" element
     */
    public void unsetDocumentation()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(DOCUMENTATION$2, 0);
        }
    }
    
    /**
     * Gets the "security" element
     */
    public org.hl7.fhir.ConformanceSecurity getSecurity()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.ConformanceSecurity target = null;
            target = (org.hl7.fhir.ConformanceSecurity)get_store().find_element_user(SECURITY$4, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "security" element
     */
    public boolean isSetSecurity()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(SECURITY$4) != 0;
        }
    }
    
    /**
     * Sets the "security" element
     */
    public void setSecurity(org.hl7.fhir.ConformanceSecurity security)
    {
        generatedSetterHelperImpl(security, SECURITY$4, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "security" element
     */
    public org.hl7.fhir.ConformanceSecurity addNewSecurity()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.ConformanceSecurity target = null;
            target = (org.hl7.fhir.ConformanceSecurity)get_store().add_element_user(SECURITY$4);
            return target;
        }
    }
    
    /**
     * Unsets the "security" element
     */
    public void unsetSecurity()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(SECURITY$4, 0);
        }
    }
    
    /**
     * Gets array of all "resource" elements
     */
    public org.hl7.fhir.ConformanceResource[] getResourceArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(RESOURCE$6, targetList);
            org.hl7.fhir.ConformanceResource[] result = new org.hl7.fhir.ConformanceResource[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "resource" element
     */
    public org.hl7.fhir.ConformanceResource getResourceArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.ConformanceResource target = null;
            target = (org.hl7.fhir.ConformanceResource)get_store().find_element_user(RESOURCE$6, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "resource" element
     */
    public int sizeOfResourceArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(RESOURCE$6);
        }
    }
    
    /**
     * Sets array of all "resource" element  WARNING: This method is not atomicaly synchronized.
     */
    public void setResourceArray(org.hl7.fhir.ConformanceResource[] resourceArray)
    {
        check_orphaned();
        arraySetterHelper(resourceArray, RESOURCE$6);
    }
    
    /**
     * Sets ith "resource" element
     */
    public void setResourceArray(int i, org.hl7.fhir.ConformanceResource resource)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.ConformanceResource target = null;
            target = (org.hl7.fhir.ConformanceResource)get_store().find_element_user(RESOURCE$6, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(resource);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "resource" element
     */
    public org.hl7.fhir.ConformanceResource insertNewResource(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.ConformanceResource target = null;
            target = (org.hl7.fhir.ConformanceResource)get_store().insert_element_user(RESOURCE$6, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "resource" element
     */
    public org.hl7.fhir.ConformanceResource addNewResource()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.ConformanceResource target = null;
            target = (org.hl7.fhir.ConformanceResource)get_store().add_element_user(RESOURCE$6);
            return target;
        }
    }
    
    /**
     * Removes the ith "resource" element
     */
    public void removeResource(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(RESOURCE$6, i);
        }
    }
    
    /**
     * Gets array of all "operation" elements
     */
    public org.hl7.fhir.ConformanceOperation1[] getOperationArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(OPERATION$8, targetList);
            org.hl7.fhir.ConformanceOperation1[] result = new org.hl7.fhir.ConformanceOperation1[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "operation" element
     */
    public org.hl7.fhir.ConformanceOperation1 getOperationArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.ConformanceOperation1 target = null;
            target = (org.hl7.fhir.ConformanceOperation1)get_store().find_element_user(OPERATION$8, i);
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
            return get_store().count_elements(OPERATION$8);
        }
    }
    
    /**
     * Sets array of all "operation" element  WARNING: This method is not atomicaly synchronized.
     */
    public void setOperationArray(org.hl7.fhir.ConformanceOperation1[] operationArray)
    {
        check_orphaned();
        arraySetterHelper(operationArray, OPERATION$8);
    }
    
    /**
     * Sets ith "operation" element
     */
    public void setOperationArray(int i, org.hl7.fhir.ConformanceOperation1 operation)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.ConformanceOperation1 target = null;
            target = (org.hl7.fhir.ConformanceOperation1)get_store().find_element_user(OPERATION$8, i);
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
    public org.hl7.fhir.ConformanceOperation1 insertNewOperation(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.ConformanceOperation1 target = null;
            target = (org.hl7.fhir.ConformanceOperation1)get_store().insert_element_user(OPERATION$8, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "operation" element
     */
    public org.hl7.fhir.ConformanceOperation1 addNewOperation()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.ConformanceOperation1 target = null;
            target = (org.hl7.fhir.ConformanceOperation1)get_store().add_element_user(OPERATION$8);
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
            get_store().remove_element(OPERATION$8, i);
        }
    }
    
    /**
     * Gets array of all "query" elements
     */
    public org.hl7.fhir.ConformanceQuery[] getQueryArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(QUERY$10, targetList);
            org.hl7.fhir.ConformanceQuery[] result = new org.hl7.fhir.ConformanceQuery[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "query" element
     */
    public org.hl7.fhir.ConformanceQuery getQueryArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.ConformanceQuery target = null;
            target = (org.hl7.fhir.ConformanceQuery)get_store().find_element_user(QUERY$10, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "query" element
     */
    public int sizeOfQueryArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(QUERY$10);
        }
    }
    
    /**
     * Sets array of all "query" element  WARNING: This method is not atomicaly synchronized.
     */
    public void setQueryArray(org.hl7.fhir.ConformanceQuery[] queryArray)
    {
        check_orphaned();
        arraySetterHelper(queryArray, QUERY$10);
    }
    
    /**
     * Sets ith "query" element
     */
    public void setQueryArray(int i, org.hl7.fhir.ConformanceQuery query)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.ConformanceQuery target = null;
            target = (org.hl7.fhir.ConformanceQuery)get_store().find_element_user(QUERY$10, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(query);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "query" element
     */
    public org.hl7.fhir.ConformanceQuery insertNewQuery(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.ConformanceQuery target = null;
            target = (org.hl7.fhir.ConformanceQuery)get_store().insert_element_user(QUERY$10, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "query" element
     */
    public org.hl7.fhir.ConformanceQuery addNewQuery()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.ConformanceQuery target = null;
            target = (org.hl7.fhir.ConformanceQuery)get_store().add_element_user(QUERY$10);
            return target;
        }
    }
    
    /**
     * Removes the ith "query" element
     */
    public void removeQuery(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(QUERY$10, i);
        }
    }
    
    /**
     * Gets array of all "documentMailbox" elements
     */
    public org.hl7.fhir.Uri[] getDocumentMailboxArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(DOCUMENTMAILBOX$12, targetList);
            org.hl7.fhir.Uri[] result = new org.hl7.fhir.Uri[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "documentMailbox" element
     */
    public org.hl7.fhir.Uri getDocumentMailboxArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.Uri target = null;
            target = (org.hl7.fhir.Uri)get_store().find_element_user(DOCUMENTMAILBOX$12, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "documentMailbox" element
     */
    public int sizeOfDocumentMailboxArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(DOCUMENTMAILBOX$12);
        }
    }
    
    /**
     * Sets array of all "documentMailbox" element  WARNING: This method is not atomicaly synchronized.
     */
    public void setDocumentMailboxArray(org.hl7.fhir.Uri[] documentMailboxArray)
    {
        check_orphaned();
        arraySetterHelper(documentMailboxArray, DOCUMENTMAILBOX$12);
    }
    
    /**
     * Sets ith "documentMailbox" element
     */
    public void setDocumentMailboxArray(int i, org.hl7.fhir.Uri documentMailbox)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.Uri target = null;
            target = (org.hl7.fhir.Uri)get_store().find_element_user(DOCUMENTMAILBOX$12, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(documentMailbox);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "documentMailbox" element
     */
    public org.hl7.fhir.Uri insertNewDocumentMailbox(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.Uri target = null;
            target = (org.hl7.fhir.Uri)get_store().insert_element_user(DOCUMENTMAILBOX$12, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "documentMailbox" element
     */
    public org.hl7.fhir.Uri addNewDocumentMailbox()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.Uri target = null;
            target = (org.hl7.fhir.Uri)get_store().add_element_user(DOCUMENTMAILBOX$12);
            return target;
        }
    }
    
    /**
     * Removes the ith "documentMailbox" element
     */
    public void removeDocumentMailbox(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(DOCUMENTMAILBOX$12, i);
        }
    }
}
