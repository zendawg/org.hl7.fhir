/*
 * XML Type:  DocumentReference.Service
 * Namespace: http://hl7.org/fhir
 * Java type: org.hl7.fhir.DocumentReferenceService
 *
 * Automatically generated - do not modify.
 */
package org.hl7.fhir.impl;
/**
 * An XML DocumentReference.Service(@http://hl7.org/fhir).
 *
 * This is a complex type.
 */
public class DocumentReferenceServiceImpl extends org.hl7.fhir.impl.BackboneElementImpl implements org.hl7.fhir.DocumentReferenceService
{
    private static final long serialVersionUID = 1L;
    
    public DocumentReferenceServiceImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName TYPE$0 = 
        new javax.xml.namespace.QName("http://hl7.org/fhir", "type");
    private static final javax.xml.namespace.QName ADDRESS$2 = 
        new javax.xml.namespace.QName("http://hl7.org/fhir", "address");
    private static final javax.xml.namespace.QName PARAMETER$4 = 
        new javax.xml.namespace.QName("http://hl7.org/fhir", "parameter");
    
    
    /**
     * Gets the "type" element
     */
    public org.hl7.fhir.CodeableConcept getType()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.CodeableConcept target = null;
            target = (org.hl7.fhir.CodeableConcept)get_store().find_element_user(TYPE$0, 0);
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
    public void setType(org.hl7.fhir.CodeableConcept type)
    {
        generatedSetterHelperImpl(type, TYPE$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "type" element
     */
    public org.hl7.fhir.CodeableConcept addNewType()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.CodeableConcept target = null;
            target = (org.hl7.fhir.CodeableConcept)get_store().add_element_user(TYPE$0);
            return target;
        }
    }
    
    /**
     * Gets the "address" element
     */
    public org.hl7.fhir.String getAddress()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.String target = null;
            target = (org.hl7.fhir.String)get_store().find_element_user(ADDRESS$2, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "address" element
     */
    public boolean isSetAddress()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(ADDRESS$2) != 0;
        }
    }
    
    /**
     * Sets the "address" element
     */
    public void setAddress(org.hl7.fhir.String address)
    {
        generatedSetterHelperImpl(address, ADDRESS$2, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "address" element
     */
    public org.hl7.fhir.String addNewAddress()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.String target = null;
            target = (org.hl7.fhir.String)get_store().add_element_user(ADDRESS$2);
            return target;
        }
    }
    
    /**
     * Unsets the "address" element
     */
    public void unsetAddress()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(ADDRESS$2, 0);
        }
    }
    
    /**
     * Gets array of all "parameter" elements
     */
    public org.hl7.fhir.DocumentReferenceParameter[] getParameterArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(PARAMETER$4, targetList);
            org.hl7.fhir.DocumentReferenceParameter[] result = new org.hl7.fhir.DocumentReferenceParameter[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "parameter" element
     */
    public org.hl7.fhir.DocumentReferenceParameter getParameterArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.DocumentReferenceParameter target = null;
            target = (org.hl7.fhir.DocumentReferenceParameter)get_store().find_element_user(PARAMETER$4, i);
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
    public void setParameterArray(org.hl7.fhir.DocumentReferenceParameter[] parameterArray)
    {
        check_orphaned();
        arraySetterHelper(parameterArray, PARAMETER$4);
    }
    
    /**
     * Sets ith "parameter" element
     */
    public void setParameterArray(int i, org.hl7.fhir.DocumentReferenceParameter parameter)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.DocumentReferenceParameter target = null;
            target = (org.hl7.fhir.DocumentReferenceParameter)get_store().find_element_user(PARAMETER$4, i);
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
    public org.hl7.fhir.DocumentReferenceParameter insertNewParameter(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.DocumentReferenceParameter target = null;
            target = (org.hl7.fhir.DocumentReferenceParameter)get_store().insert_element_user(PARAMETER$4, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "parameter" element
     */
    public org.hl7.fhir.DocumentReferenceParameter addNewParameter()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.DocumentReferenceParameter target = null;
            target = (org.hl7.fhir.DocumentReferenceParameter)get_store().add_element_user(PARAMETER$4);
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
