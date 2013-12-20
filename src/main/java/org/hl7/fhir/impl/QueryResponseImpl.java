/*
 * XML Type:  Query.Response
 * Namespace: http://hl7.org/fhir
 * Java type: org.hl7.fhir.QueryResponse
 *
 * Automatically generated - do not modify.
 */
package org.hl7.fhir.impl;
/**
 * An XML Query.Response(@http://hl7.org/fhir).
 *
 * This is a complex type.
 */
public class QueryResponseImpl extends org.hl7.fhir.impl.BackboneElementImpl implements org.hl7.fhir.QueryResponse
{
    private static final long serialVersionUID = 1L;
    
    public QueryResponseImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName IDENTIFIER$0 = 
        new javax.xml.namespace.QName("http://hl7.org/fhir", "identifier");
    private static final javax.xml.namespace.QName OUTCOME$2 = 
        new javax.xml.namespace.QName("http://hl7.org/fhir", "outcome");
    private static final javax.xml.namespace.QName TOTAL$4 = 
        new javax.xml.namespace.QName("http://hl7.org/fhir", "total");
    private static final javax.xml.namespace.QName PARAMETER$6 = 
        new javax.xml.namespace.QName("http://hl7.org/fhir", "parameter");
    private static final javax.xml.namespace.QName FIRST$8 = 
        new javax.xml.namespace.QName("http://hl7.org/fhir", "first");
    private static final javax.xml.namespace.QName PREVIOUS$10 = 
        new javax.xml.namespace.QName("http://hl7.org/fhir", "previous");
    private static final javax.xml.namespace.QName NEXT$12 = 
        new javax.xml.namespace.QName("http://hl7.org/fhir", "next");
    private static final javax.xml.namespace.QName LAST$14 = 
        new javax.xml.namespace.QName("http://hl7.org/fhir", "last");
    private static final javax.xml.namespace.QName REFERENCE$16 = 
        new javax.xml.namespace.QName("http://hl7.org/fhir", "reference");
    
    
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
     * Gets the "outcome" element
     */
    public org.hl7.fhir.QueryOutcome getOutcome()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.QueryOutcome target = null;
            target = (org.hl7.fhir.QueryOutcome)get_store().find_element_user(OUTCOME$2, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "outcome" element
     */
    public void setOutcome(org.hl7.fhir.QueryOutcome outcome)
    {
        generatedSetterHelperImpl(outcome, OUTCOME$2, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "outcome" element
     */
    public org.hl7.fhir.QueryOutcome addNewOutcome()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.QueryOutcome target = null;
            target = (org.hl7.fhir.QueryOutcome)get_store().add_element_user(OUTCOME$2);
            return target;
        }
    }
    
    /**
     * Gets the "total" element
     */
    public org.hl7.fhir.Integer getTotal()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.Integer target = null;
            target = (org.hl7.fhir.Integer)get_store().find_element_user(TOTAL$4, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "total" element
     */
    public boolean isSetTotal()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(TOTAL$4) != 0;
        }
    }
    
    /**
     * Sets the "total" element
     */
    public void setTotal(org.hl7.fhir.Integer total)
    {
        generatedSetterHelperImpl(total, TOTAL$4, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "total" element
     */
    public org.hl7.fhir.Integer addNewTotal()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.Integer target = null;
            target = (org.hl7.fhir.Integer)get_store().add_element_user(TOTAL$4);
            return target;
        }
    }
    
    /**
     * Unsets the "total" element
     */
    public void unsetTotal()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(TOTAL$4, 0);
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
            get_store().find_all_element_users(PARAMETER$6, targetList);
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
            target = (org.hl7.fhir.Extension)get_store().find_element_user(PARAMETER$6, i);
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
            return get_store().count_elements(PARAMETER$6);
        }
    }
    
    /**
     * Sets array of all "parameter" element  WARNING: This method is not atomicaly synchronized.
     */
    public void setParameterArray(org.hl7.fhir.Extension[] parameterArray)
    {
        check_orphaned();
        arraySetterHelper(parameterArray, PARAMETER$6);
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
            target = (org.hl7.fhir.Extension)get_store().find_element_user(PARAMETER$6, i);
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
            target = (org.hl7.fhir.Extension)get_store().insert_element_user(PARAMETER$6, i);
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
            target = (org.hl7.fhir.Extension)get_store().add_element_user(PARAMETER$6);
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
            get_store().remove_element(PARAMETER$6, i);
        }
    }
    
    /**
     * Gets array of all "first" elements
     */
    public org.hl7.fhir.Extension[] getFirstArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(FIRST$8, targetList);
            org.hl7.fhir.Extension[] result = new org.hl7.fhir.Extension[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "first" element
     */
    public org.hl7.fhir.Extension getFirstArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.Extension target = null;
            target = (org.hl7.fhir.Extension)get_store().find_element_user(FIRST$8, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "first" element
     */
    public int sizeOfFirstArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(FIRST$8);
        }
    }
    
    /**
     * Sets array of all "first" element  WARNING: This method is not atomicaly synchronized.
     */
    public void setFirstArray(org.hl7.fhir.Extension[] firstArray)
    {
        check_orphaned();
        arraySetterHelper(firstArray, FIRST$8);
    }
    
    /**
     * Sets ith "first" element
     */
    public void setFirstArray(int i, org.hl7.fhir.Extension first)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.Extension target = null;
            target = (org.hl7.fhir.Extension)get_store().find_element_user(FIRST$8, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(first);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "first" element
     */
    public org.hl7.fhir.Extension insertNewFirst(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.Extension target = null;
            target = (org.hl7.fhir.Extension)get_store().insert_element_user(FIRST$8, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "first" element
     */
    public org.hl7.fhir.Extension addNewFirst()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.Extension target = null;
            target = (org.hl7.fhir.Extension)get_store().add_element_user(FIRST$8);
            return target;
        }
    }
    
    /**
     * Removes the ith "first" element
     */
    public void removeFirst(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(FIRST$8, i);
        }
    }
    
    /**
     * Gets array of all "previous" elements
     */
    public org.hl7.fhir.Extension[] getPreviousArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(PREVIOUS$10, targetList);
            org.hl7.fhir.Extension[] result = new org.hl7.fhir.Extension[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "previous" element
     */
    public org.hl7.fhir.Extension getPreviousArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.Extension target = null;
            target = (org.hl7.fhir.Extension)get_store().find_element_user(PREVIOUS$10, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "previous" element
     */
    public int sizeOfPreviousArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(PREVIOUS$10);
        }
    }
    
    /**
     * Sets array of all "previous" element  WARNING: This method is not atomicaly synchronized.
     */
    public void setPreviousArray(org.hl7.fhir.Extension[] previousArray)
    {
        check_orphaned();
        arraySetterHelper(previousArray, PREVIOUS$10);
    }
    
    /**
     * Sets ith "previous" element
     */
    public void setPreviousArray(int i, org.hl7.fhir.Extension previous)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.Extension target = null;
            target = (org.hl7.fhir.Extension)get_store().find_element_user(PREVIOUS$10, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(previous);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "previous" element
     */
    public org.hl7.fhir.Extension insertNewPrevious(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.Extension target = null;
            target = (org.hl7.fhir.Extension)get_store().insert_element_user(PREVIOUS$10, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "previous" element
     */
    public org.hl7.fhir.Extension addNewPrevious()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.Extension target = null;
            target = (org.hl7.fhir.Extension)get_store().add_element_user(PREVIOUS$10);
            return target;
        }
    }
    
    /**
     * Removes the ith "previous" element
     */
    public void removePrevious(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(PREVIOUS$10, i);
        }
    }
    
    /**
     * Gets array of all "next" elements
     */
    public org.hl7.fhir.Extension[] getNextArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(NEXT$12, targetList);
            org.hl7.fhir.Extension[] result = new org.hl7.fhir.Extension[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "next" element
     */
    public org.hl7.fhir.Extension getNextArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.Extension target = null;
            target = (org.hl7.fhir.Extension)get_store().find_element_user(NEXT$12, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "next" element
     */
    public int sizeOfNextArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(NEXT$12);
        }
    }
    
    /**
     * Sets array of all "next" element  WARNING: This method is not atomicaly synchronized.
     */
    public void setNextArray(org.hl7.fhir.Extension[] nextArray)
    {
        check_orphaned();
        arraySetterHelper(nextArray, NEXT$12);
    }
    
    /**
     * Sets ith "next" element
     */
    public void setNextArray(int i, org.hl7.fhir.Extension next)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.Extension target = null;
            target = (org.hl7.fhir.Extension)get_store().find_element_user(NEXT$12, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(next);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "next" element
     */
    public org.hl7.fhir.Extension insertNewNext(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.Extension target = null;
            target = (org.hl7.fhir.Extension)get_store().insert_element_user(NEXT$12, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "next" element
     */
    public org.hl7.fhir.Extension addNewNext()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.Extension target = null;
            target = (org.hl7.fhir.Extension)get_store().add_element_user(NEXT$12);
            return target;
        }
    }
    
    /**
     * Removes the ith "next" element
     */
    public void removeNext(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(NEXT$12, i);
        }
    }
    
    /**
     * Gets array of all "last" elements
     */
    public org.hl7.fhir.Extension[] getLastArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(LAST$14, targetList);
            org.hl7.fhir.Extension[] result = new org.hl7.fhir.Extension[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "last" element
     */
    public org.hl7.fhir.Extension getLastArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.Extension target = null;
            target = (org.hl7.fhir.Extension)get_store().find_element_user(LAST$14, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "last" element
     */
    public int sizeOfLastArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(LAST$14);
        }
    }
    
    /**
     * Sets array of all "last" element  WARNING: This method is not atomicaly synchronized.
     */
    public void setLastArray(org.hl7.fhir.Extension[] lastArray)
    {
        check_orphaned();
        arraySetterHelper(lastArray, LAST$14);
    }
    
    /**
     * Sets ith "last" element
     */
    public void setLastArray(int i, org.hl7.fhir.Extension last)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.Extension target = null;
            target = (org.hl7.fhir.Extension)get_store().find_element_user(LAST$14, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(last);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "last" element
     */
    public org.hl7.fhir.Extension insertNewLast(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.Extension target = null;
            target = (org.hl7.fhir.Extension)get_store().insert_element_user(LAST$14, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "last" element
     */
    public org.hl7.fhir.Extension addNewLast()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.Extension target = null;
            target = (org.hl7.fhir.Extension)get_store().add_element_user(LAST$14);
            return target;
        }
    }
    
    /**
     * Removes the ith "last" element
     */
    public void removeLast(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(LAST$14, i);
        }
    }
    
    /**
     * Gets array of all "reference" elements
     */
    public org.hl7.fhir.ResourceReference[] getReferenceArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(REFERENCE$16, targetList);
            org.hl7.fhir.ResourceReference[] result = new org.hl7.fhir.ResourceReference[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "reference" element
     */
    public org.hl7.fhir.ResourceReference getReferenceArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.ResourceReference target = null;
            target = (org.hl7.fhir.ResourceReference)get_store().find_element_user(REFERENCE$16, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "reference" element
     */
    public int sizeOfReferenceArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(REFERENCE$16);
        }
    }
    
    /**
     * Sets array of all "reference" element  WARNING: This method is not atomicaly synchronized.
     */
    public void setReferenceArray(org.hl7.fhir.ResourceReference[] referenceArray)
    {
        check_orphaned();
        arraySetterHelper(referenceArray, REFERENCE$16);
    }
    
    /**
     * Sets ith "reference" element
     */
    public void setReferenceArray(int i, org.hl7.fhir.ResourceReference reference)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.ResourceReference target = null;
            target = (org.hl7.fhir.ResourceReference)get_store().find_element_user(REFERENCE$16, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(reference);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "reference" element
     */
    public org.hl7.fhir.ResourceReference insertNewReference(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.ResourceReference target = null;
            target = (org.hl7.fhir.ResourceReference)get_store().insert_element_user(REFERENCE$16, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "reference" element
     */
    public org.hl7.fhir.ResourceReference addNewReference()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.ResourceReference target = null;
            target = (org.hl7.fhir.ResourceReference)get_store().add_element_user(REFERENCE$16);
            return target;
        }
    }
    
    /**
     * Removes the ith "reference" element
     */
    public void removeReference(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(REFERENCE$16, i);
        }
    }
}
