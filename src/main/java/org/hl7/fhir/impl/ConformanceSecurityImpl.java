/*
 * XML Type:  Conformance.Security
 * Namespace: http://hl7.org/fhir
 * Java type: org.hl7.fhir.ConformanceSecurity
 *
 * Automatically generated - do not modify.
 */
package org.hl7.fhir.impl;
/**
 * An XML Conformance.Security(@http://hl7.org/fhir).
 *
 * This is a complex type.
 */
public class ConformanceSecurityImpl extends org.hl7.fhir.impl.BackboneElementImpl implements org.hl7.fhir.ConformanceSecurity
{
    private static final long serialVersionUID = 1L;
    
    public ConformanceSecurityImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName CORS$0 = 
        new javax.xml.namespace.QName("http://hl7.org/fhir", "cors");
    private static final javax.xml.namespace.QName SERVICE$2 = 
        new javax.xml.namespace.QName("http://hl7.org/fhir", "service");
    private static final javax.xml.namespace.QName DESCRIPTION$4 = 
        new javax.xml.namespace.QName("http://hl7.org/fhir", "description");
    private static final javax.xml.namespace.QName CERTIFICATE$6 = 
        new javax.xml.namespace.QName("http://hl7.org/fhir", "certificate");
    
    
    /**
     * Gets the "cors" element
     */
    public org.hl7.fhir.Boolean getCors()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.Boolean target = null;
            target = (org.hl7.fhir.Boolean)get_store().find_element_user(CORS$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "cors" element
     */
    public boolean isSetCors()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(CORS$0) != 0;
        }
    }
    
    /**
     * Sets the "cors" element
     */
    public void setCors(org.hl7.fhir.Boolean cors)
    {
        generatedSetterHelperImpl(cors, CORS$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "cors" element
     */
    public org.hl7.fhir.Boolean addNewCors()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.Boolean target = null;
            target = (org.hl7.fhir.Boolean)get_store().add_element_user(CORS$0);
            return target;
        }
    }
    
    /**
     * Unsets the "cors" element
     */
    public void unsetCors()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(CORS$0, 0);
        }
    }
    
    /**
     * Gets array of all "service" elements
     */
    public org.hl7.fhir.CodeableConcept[] getServiceArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(SERVICE$2, targetList);
            org.hl7.fhir.CodeableConcept[] result = new org.hl7.fhir.CodeableConcept[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "service" element
     */
    public org.hl7.fhir.CodeableConcept getServiceArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.CodeableConcept target = null;
            target = (org.hl7.fhir.CodeableConcept)get_store().find_element_user(SERVICE$2, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "service" element
     */
    public int sizeOfServiceArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(SERVICE$2);
        }
    }
    
    /**
     * Sets array of all "service" element  WARNING: This method is not atomicaly synchronized.
     */
    public void setServiceArray(org.hl7.fhir.CodeableConcept[] serviceArray)
    {
        check_orphaned();
        arraySetterHelper(serviceArray, SERVICE$2);
    }
    
    /**
     * Sets ith "service" element
     */
    public void setServiceArray(int i, org.hl7.fhir.CodeableConcept service)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.CodeableConcept target = null;
            target = (org.hl7.fhir.CodeableConcept)get_store().find_element_user(SERVICE$2, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(service);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "service" element
     */
    public org.hl7.fhir.CodeableConcept insertNewService(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.CodeableConcept target = null;
            target = (org.hl7.fhir.CodeableConcept)get_store().insert_element_user(SERVICE$2, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "service" element
     */
    public org.hl7.fhir.CodeableConcept addNewService()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.CodeableConcept target = null;
            target = (org.hl7.fhir.CodeableConcept)get_store().add_element_user(SERVICE$2);
            return target;
        }
    }
    
    /**
     * Removes the ith "service" element
     */
    public void removeService(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(SERVICE$2, i);
        }
    }
    
    /**
     * Gets the "description" element
     */
    public org.hl7.fhir.String getDescription()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.String target = null;
            target = (org.hl7.fhir.String)get_store().find_element_user(DESCRIPTION$4, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "description" element
     */
    public boolean isSetDescription()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(DESCRIPTION$4) != 0;
        }
    }
    
    /**
     * Sets the "description" element
     */
    public void setDescription(org.hl7.fhir.String description)
    {
        generatedSetterHelperImpl(description, DESCRIPTION$4, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "description" element
     */
    public org.hl7.fhir.String addNewDescription()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.String target = null;
            target = (org.hl7.fhir.String)get_store().add_element_user(DESCRIPTION$4);
            return target;
        }
    }
    
    /**
     * Unsets the "description" element
     */
    public void unsetDescription()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(DESCRIPTION$4, 0);
        }
    }
    
    /**
     * Gets array of all "certificate" elements
     */
    public org.hl7.fhir.ConformanceCertificate[] getCertificateArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(CERTIFICATE$6, targetList);
            org.hl7.fhir.ConformanceCertificate[] result = new org.hl7.fhir.ConformanceCertificate[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "certificate" element
     */
    public org.hl7.fhir.ConformanceCertificate getCertificateArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.ConformanceCertificate target = null;
            target = (org.hl7.fhir.ConformanceCertificate)get_store().find_element_user(CERTIFICATE$6, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "certificate" element
     */
    public int sizeOfCertificateArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(CERTIFICATE$6);
        }
    }
    
    /**
     * Sets array of all "certificate" element  WARNING: This method is not atomicaly synchronized.
     */
    public void setCertificateArray(org.hl7.fhir.ConformanceCertificate[] certificateArray)
    {
        check_orphaned();
        arraySetterHelper(certificateArray, CERTIFICATE$6);
    }
    
    /**
     * Sets ith "certificate" element
     */
    public void setCertificateArray(int i, org.hl7.fhir.ConformanceCertificate certificate)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.ConformanceCertificate target = null;
            target = (org.hl7.fhir.ConformanceCertificate)get_store().find_element_user(CERTIFICATE$6, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(certificate);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "certificate" element
     */
    public org.hl7.fhir.ConformanceCertificate insertNewCertificate(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.ConformanceCertificate target = null;
            target = (org.hl7.fhir.ConformanceCertificate)get_store().insert_element_user(CERTIFICATE$6, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "certificate" element
     */
    public org.hl7.fhir.ConformanceCertificate addNewCertificate()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.ConformanceCertificate target = null;
            target = (org.hl7.fhir.ConformanceCertificate)get_store().add_element_user(CERTIFICATE$6);
            return target;
        }
    }
    
    /**
     * Removes the ith "certificate" element
     */
    public void removeCertificate(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(CERTIFICATE$6, i);
        }
    }
}
