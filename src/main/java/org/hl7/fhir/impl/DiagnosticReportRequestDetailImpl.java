/*
 * XML Type:  DiagnosticReport.RequestDetail
 * Namespace: http://hl7.org/fhir
 * Java type: org.hl7.fhir.DiagnosticReportRequestDetail
 *
 * Automatically generated - do not modify.
 */
package org.hl7.fhir.impl;
/**
 * An XML DiagnosticReport.RequestDetail(@http://hl7.org/fhir).
 *
 * This is a complex type.
 */
public class DiagnosticReportRequestDetailImpl extends org.hl7.fhir.impl.BackboneElementImpl implements org.hl7.fhir.DiagnosticReportRequestDetail
{
    private static final long serialVersionUID = 1L;
    
    public DiagnosticReportRequestDetailImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName ENCOUNTER$0 = 
        new javax.xml.namespace.QName("http://hl7.org/fhir", "encounter");
    private static final javax.xml.namespace.QName REQUESTORDERID$2 = 
        new javax.xml.namespace.QName("http://hl7.org/fhir", "requestOrderId");
    private static final javax.xml.namespace.QName RECEIVERORDERID$4 = 
        new javax.xml.namespace.QName("http://hl7.org/fhir", "receiverOrderId");
    private static final javax.xml.namespace.QName REQUESTTEST$6 = 
        new javax.xml.namespace.QName("http://hl7.org/fhir", "requestTest");
    private static final javax.xml.namespace.QName BODYSITE$8 = 
        new javax.xml.namespace.QName("http://hl7.org/fhir", "bodySite");
    private static final javax.xml.namespace.QName REQUESTER$10 = 
        new javax.xml.namespace.QName("http://hl7.org/fhir", "requester");
    private static final javax.xml.namespace.QName CLINICALINFO$12 = 
        new javax.xml.namespace.QName("http://hl7.org/fhir", "clinicalInfo");
    
    
    /**
     * Gets the "encounter" element
     */
    public org.hl7.fhir.ResourceReference getEncounter()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.ResourceReference target = null;
            target = (org.hl7.fhir.ResourceReference)get_store().find_element_user(ENCOUNTER$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "encounter" element
     */
    public boolean isSetEncounter()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(ENCOUNTER$0) != 0;
        }
    }
    
    /**
     * Sets the "encounter" element
     */
    public void setEncounter(org.hl7.fhir.ResourceReference encounter)
    {
        generatedSetterHelperImpl(encounter, ENCOUNTER$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "encounter" element
     */
    public org.hl7.fhir.ResourceReference addNewEncounter()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.ResourceReference target = null;
            target = (org.hl7.fhir.ResourceReference)get_store().add_element_user(ENCOUNTER$0);
            return target;
        }
    }
    
    /**
     * Unsets the "encounter" element
     */
    public void unsetEncounter()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(ENCOUNTER$0, 0);
        }
    }
    
    /**
     * Gets the "requestOrderId" element
     */
    public org.hl7.fhir.Identifier getRequestOrderId()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.Identifier target = null;
            target = (org.hl7.fhir.Identifier)get_store().find_element_user(REQUESTORDERID$2, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "requestOrderId" element
     */
    public boolean isSetRequestOrderId()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(REQUESTORDERID$2) != 0;
        }
    }
    
    /**
     * Sets the "requestOrderId" element
     */
    public void setRequestOrderId(org.hl7.fhir.Identifier requestOrderId)
    {
        generatedSetterHelperImpl(requestOrderId, REQUESTORDERID$2, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "requestOrderId" element
     */
    public org.hl7.fhir.Identifier addNewRequestOrderId()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.Identifier target = null;
            target = (org.hl7.fhir.Identifier)get_store().add_element_user(REQUESTORDERID$2);
            return target;
        }
    }
    
    /**
     * Unsets the "requestOrderId" element
     */
    public void unsetRequestOrderId()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(REQUESTORDERID$2, 0);
        }
    }
    
    /**
     * Gets the "receiverOrderId" element
     */
    public org.hl7.fhir.Identifier getReceiverOrderId()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.Identifier target = null;
            target = (org.hl7.fhir.Identifier)get_store().find_element_user(RECEIVERORDERID$4, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "receiverOrderId" element
     */
    public boolean isSetReceiverOrderId()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(RECEIVERORDERID$4) != 0;
        }
    }
    
    /**
     * Sets the "receiverOrderId" element
     */
    public void setReceiverOrderId(org.hl7.fhir.Identifier receiverOrderId)
    {
        generatedSetterHelperImpl(receiverOrderId, RECEIVERORDERID$4, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "receiverOrderId" element
     */
    public org.hl7.fhir.Identifier addNewReceiverOrderId()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.Identifier target = null;
            target = (org.hl7.fhir.Identifier)get_store().add_element_user(RECEIVERORDERID$4);
            return target;
        }
    }
    
    /**
     * Unsets the "receiverOrderId" element
     */
    public void unsetReceiverOrderId()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(RECEIVERORDERID$4, 0);
        }
    }
    
    /**
     * Gets array of all "requestTest" elements
     */
    public org.hl7.fhir.CodeableConcept[] getRequestTestArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(REQUESTTEST$6, targetList);
            org.hl7.fhir.CodeableConcept[] result = new org.hl7.fhir.CodeableConcept[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "requestTest" element
     */
    public org.hl7.fhir.CodeableConcept getRequestTestArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.CodeableConcept target = null;
            target = (org.hl7.fhir.CodeableConcept)get_store().find_element_user(REQUESTTEST$6, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "requestTest" element
     */
    public int sizeOfRequestTestArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(REQUESTTEST$6);
        }
    }
    
    /**
     * Sets array of all "requestTest" element  WARNING: This method is not atomicaly synchronized.
     */
    public void setRequestTestArray(org.hl7.fhir.CodeableConcept[] requestTestArray)
    {
        check_orphaned();
        arraySetterHelper(requestTestArray, REQUESTTEST$6);
    }
    
    /**
     * Sets ith "requestTest" element
     */
    public void setRequestTestArray(int i, org.hl7.fhir.CodeableConcept requestTest)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.CodeableConcept target = null;
            target = (org.hl7.fhir.CodeableConcept)get_store().find_element_user(REQUESTTEST$6, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(requestTest);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "requestTest" element
     */
    public org.hl7.fhir.CodeableConcept insertNewRequestTest(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.CodeableConcept target = null;
            target = (org.hl7.fhir.CodeableConcept)get_store().insert_element_user(REQUESTTEST$6, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "requestTest" element
     */
    public org.hl7.fhir.CodeableConcept addNewRequestTest()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.CodeableConcept target = null;
            target = (org.hl7.fhir.CodeableConcept)get_store().add_element_user(REQUESTTEST$6);
            return target;
        }
    }
    
    /**
     * Removes the ith "requestTest" element
     */
    public void removeRequestTest(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(REQUESTTEST$6, i);
        }
    }
    
    /**
     * Gets the "bodySite" element
     */
    public org.hl7.fhir.CodeableConcept getBodySite()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.CodeableConcept target = null;
            target = (org.hl7.fhir.CodeableConcept)get_store().find_element_user(BODYSITE$8, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "bodySite" element
     */
    public boolean isSetBodySite()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(BODYSITE$8) != 0;
        }
    }
    
    /**
     * Sets the "bodySite" element
     */
    public void setBodySite(org.hl7.fhir.CodeableConcept bodySite)
    {
        generatedSetterHelperImpl(bodySite, BODYSITE$8, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "bodySite" element
     */
    public org.hl7.fhir.CodeableConcept addNewBodySite()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.CodeableConcept target = null;
            target = (org.hl7.fhir.CodeableConcept)get_store().add_element_user(BODYSITE$8);
            return target;
        }
    }
    
    /**
     * Unsets the "bodySite" element
     */
    public void unsetBodySite()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(BODYSITE$8, 0);
        }
    }
    
    /**
     * Gets the "requester" element
     */
    public org.hl7.fhir.ResourceReference getRequester()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.ResourceReference target = null;
            target = (org.hl7.fhir.ResourceReference)get_store().find_element_user(REQUESTER$10, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "requester" element
     */
    public boolean isSetRequester()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(REQUESTER$10) != 0;
        }
    }
    
    /**
     * Sets the "requester" element
     */
    public void setRequester(org.hl7.fhir.ResourceReference requester)
    {
        generatedSetterHelperImpl(requester, REQUESTER$10, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "requester" element
     */
    public org.hl7.fhir.ResourceReference addNewRequester()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.ResourceReference target = null;
            target = (org.hl7.fhir.ResourceReference)get_store().add_element_user(REQUESTER$10);
            return target;
        }
    }
    
    /**
     * Unsets the "requester" element
     */
    public void unsetRequester()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(REQUESTER$10, 0);
        }
    }
    
    /**
     * Gets the "clinicalInfo" element
     */
    public org.hl7.fhir.String getClinicalInfo()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.String target = null;
            target = (org.hl7.fhir.String)get_store().find_element_user(CLINICALINFO$12, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "clinicalInfo" element
     */
    public boolean isSetClinicalInfo()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(CLINICALINFO$12) != 0;
        }
    }
    
    /**
     * Sets the "clinicalInfo" element
     */
    public void setClinicalInfo(org.hl7.fhir.String clinicalInfo)
    {
        generatedSetterHelperImpl(clinicalInfo, CLINICALINFO$12, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "clinicalInfo" element
     */
    public org.hl7.fhir.String addNewClinicalInfo()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.String target = null;
            target = (org.hl7.fhir.String)get_store().add_element_user(CLINICALINFO$12);
            return target;
        }
    }
    
    /**
     * Unsets the "clinicalInfo" element
     */
    public void unsetClinicalInfo()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(CLINICALINFO$12, 0);
        }
    }
}
