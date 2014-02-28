/*
 * XML Type:  DiagnosticReport
 * Namespace: http://hl7.org/fhir
 * Java type: org.hl7.fhir.DiagnosticReport
 *
 * Automatically generated - do not modify.
 */
package org.hl7.fhir.impl;
/**
 * An XML DiagnosticReport(@http://hl7.org/fhir).
 *
 * This is a complex type.
 */
public class DiagnosticReportImpl extends org.hl7.fhir.impl.ResourceImpl implements org.hl7.fhir.DiagnosticReport
{
    private static final long serialVersionUID = 1L;
    
    public DiagnosticReportImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName NAME$0 = 
        new javax.xml.namespace.QName("http://hl7.org/fhir", "name");
    private static final javax.xml.namespace.QName STATUS$2 = 
        new javax.xml.namespace.QName("http://hl7.org/fhir", "status");
    private static final javax.xml.namespace.QName ISSUED$4 = 
        new javax.xml.namespace.QName("http://hl7.org/fhir", "issued");
    private static final javax.xml.namespace.QName SUBJECT$6 = 
        new javax.xml.namespace.QName("http://hl7.org/fhir", "subject");
    private static final javax.xml.namespace.QName PERFORMER$8 = 
        new javax.xml.namespace.QName("http://hl7.org/fhir", "performer");
    private static final javax.xml.namespace.QName IDENTIFIER$10 = 
        new javax.xml.namespace.QName("http://hl7.org/fhir", "identifier");
    private static final javax.xml.namespace.QName REQUESTDETAIL$12 = 
        new javax.xml.namespace.QName("http://hl7.org/fhir", "requestDetail");
    private static final javax.xml.namespace.QName SERVICECATEGORY$14 = 
        new javax.xml.namespace.QName("http://hl7.org/fhir", "serviceCategory");
    private static final javax.xml.namespace.QName DIAGNOSTICDATETIME$16 = 
        new javax.xml.namespace.QName("http://hl7.org/fhir", "diagnosticDateTime");
    private static final javax.xml.namespace.QName DIAGNOSTICPERIOD$18 = 
        new javax.xml.namespace.QName("http://hl7.org/fhir", "diagnosticPeriod");
    private static final javax.xml.namespace.QName SPECIMEN$20 = 
        new javax.xml.namespace.QName("http://hl7.org/fhir", "specimen");
    private static final javax.xml.namespace.QName RESULT$22 = 
        new javax.xml.namespace.QName("http://hl7.org/fhir", "result");
    private static final javax.xml.namespace.QName IMAGINGSTUDY$24 = 
        new javax.xml.namespace.QName("http://hl7.org/fhir", "imagingStudy");
    private static final javax.xml.namespace.QName IMAGE$26 = 
        new javax.xml.namespace.QName("http://hl7.org/fhir", "image");
    private static final javax.xml.namespace.QName CONCLUSION$28 = 
        new javax.xml.namespace.QName("http://hl7.org/fhir", "conclusion");
    private static final javax.xml.namespace.QName CODEDDIAGNOSIS$30 = 
        new javax.xml.namespace.QName("http://hl7.org/fhir", "codedDiagnosis");
    private static final javax.xml.namespace.QName PRESENTEDFORM$32 = 
        new javax.xml.namespace.QName("http://hl7.org/fhir", "presentedForm");
    
    
    /**
     * Gets the "name" element
     */
    public org.hl7.fhir.CodeableConcept getName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.CodeableConcept target = null;
            target = (org.hl7.fhir.CodeableConcept)get_store().find_element_user(NAME$0, 0);
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
    public void setName(org.hl7.fhir.CodeableConcept name)
    {
        generatedSetterHelperImpl(name, NAME$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "name" element
     */
    public org.hl7.fhir.CodeableConcept addNewName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.CodeableConcept target = null;
            target = (org.hl7.fhir.CodeableConcept)get_store().add_element_user(NAME$0);
            return target;
        }
    }
    
    /**
     * Gets the "status" element
     */
    public org.hl7.fhir.DiagnosticReportStatus getStatus()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.DiagnosticReportStatus target = null;
            target = (org.hl7.fhir.DiagnosticReportStatus)get_store().find_element_user(STATUS$2, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "status" element
     */
    public void setStatus(org.hl7.fhir.DiagnosticReportStatus status)
    {
        generatedSetterHelperImpl(status, STATUS$2, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "status" element
     */
    public org.hl7.fhir.DiagnosticReportStatus addNewStatus()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.DiagnosticReportStatus target = null;
            target = (org.hl7.fhir.DiagnosticReportStatus)get_store().add_element_user(STATUS$2);
            return target;
        }
    }
    
    /**
     * Gets the "issued" element
     */
    public org.hl7.fhir.DateTime getIssued()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.DateTime target = null;
            target = (org.hl7.fhir.DateTime)get_store().find_element_user(ISSUED$4, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "issued" element
     */
    public void setIssued(org.hl7.fhir.DateTime issued)
    {
        generatedSetterHelperImpl(issued, ISSUED$4, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "issued" element
     */
    public org.hl7.fhir.DateTime addNewIssued()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.DateTime target = null;
            target = (org.hl7.fhir.DateTime)get_store().add_element_user(ISSUED$4);
            return target;
        }
    }
    
    /**
     * Gets the "subject" element
     */
    public org.hl7.fhir.ResourceReference getSubject()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.ResourceReference target = null;
            target = (org.hl7.fhir.ResourceReference)get_store().find_element_user(SUBJECT$6, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "subject" element
     */
    public void setSubject(org.hl7.fhir.ResourceReference subject)
    {
        generatedSetterHelperImpl(subject, SUBJECT$6, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "subject" element
     */
    public org.hl7.fhir.ResourceReference addNewSubject()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.ResourceReference target = null;
            target = (org.hl7.fhir.ResourceReference)get_store().add_element_user(SUBJECT$6);
            return target;
        }
    }
    
    /**
     * Gets the "performer" element
     */
    public org.hl7.fhir.ResourceReference getPerformer()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.ResourceReference target = null;
            target = (org.hl7.fhir.ResourceReference)get_store().find_element_user(PERFORMER$8, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "performer" element
     */
    public void setPerformer(org.hl7.fhir.ResourceReference performer)
    {
        generatedSetterHelperImpl(performer, PERFORMER$8, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "performer" element
     */
    public org.hl7.fhir.ResourceReference addNewPerformer()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.ResourceReference target = null;
            target = (org.hl7.fhir.ResourceReference)get_store().add_element_user(PERFORMER$8);
            return target;
        }
    }
    
    /**
     * Gets the "identifier" element
     */
    public org.hl7.fhir.Identifier getIdentifier()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.Identifier target = null;
            target = (org.hl7.fhir.Identifier)get_store().find_element_user(IDENTIFIER$10, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "identifier" element
     */
    public boolean isSetIdentifier()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(IDENTIFIER$10) != 0;
        }
    }
    
    /**
     * Sets the "identifier" element
     */
    public void setIdentifier(org.hl7.fhir.Identifier identifier)
    {
        generatedSetterHelperImpl(identifier, IDENTIFIER$10, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "identifier" element
     */
    public org.hl7.fhir.Identifier addNewIdentifier()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.Identifier target = null;
            target = (org.hl7.fhir.Identifier)get_store().add_element_user(IDENTIFIER$10);
            return target;
        }
    }
    
    /**
     * Unsets the "identifier" element
     */
    public void unsetIdentifier()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(IDENTIFIER$10, 0);
        }
    }
    
    /**
     * Gets array of all "requestDetail" elements
     */
    public org.hl7.fhir.ResourceReference[] getRequestDetailArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(REQUESTDETAIL$12, targetList);
            org.hl7.fhir.ResourceReference[] result = new org.hl7.fhir.ResourceReference[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "requestDetail" element
     */
    public org.hl7.fhir.ResourceReference getRequestDetailArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.ResourceReference target = null;
            target = (org.hl7.fhir.ResourceReference)get_store().find_element_user(REQUESTDETAIL$12, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "requestDetail" element
     */
    public int sizeOfRequestDetailArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(REQUESTDETAIL$12);
        }
    }
    
    /**
     * Sets array of all "requestDetail" element  WARNING: This method is not atomicaly synchronized.
     */
    public void setRequestDetailArray(org.hl7.fhir.ResourceReference[] requestDetailArray)
    {
        check_orphaned();
        arraySetterHelper(requestDetailArray, REQUESTDETAIL$12);
    }
    
    /**
     * Sets ith "requestDetail" element
     */
    public void setRequestDetailArray(int i, org.hl7.fhir.ResourceReference requestDetail)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.ResourceReference target = null;
            target = (org.hl7.fhir.ResourceReference)get_store().find_element_user(REQUESTDETAIL$12, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(requestDetail);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "requestDetail" element
     */
    public org.hl7.fhir.ResourceReference insertNewRequestDetail(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.ResourceReference target = null;
            target = (org.hl7.fhir.ResourceReference)get_store().insert_element_user(REQUESTDETAIL$12, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "requestDetail" element
     */
    public org.hl7.fhir.ResourceReference addNewRequestDetail()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.ResourceReference target = null;
            target = (org.hl7.fhir.ResourceReference)get_store().add_element_user(REQUESTDETAIL$12);
            return target;
        }
    }
    
    /**
     * Removes the ith "requestDetail" element
     */
    public void removeRequestDetail(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(REQUESTDETAIL$12, i);
        }
    }
    
    /**
     * Gets the "serviceCategory" element
     */
    public org.hl7.fhir.CodeableConcept getServiceCategory()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.CodeableConcept target = null;
            target = (org.hl7.fhir.CodeableConcept)get_store().find_element_user(SERVICECATEGORY$14, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "serviceCategory" element
     */
    public boolean isSetServiceCategory()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(SERVICECATEGORY$14) != 0;
        }
    }
    
    /**
     * Sets the "serviceCategory" element
     */
    public void setServiceCategory(org.hl7.fhir.CodeableConcept serviceCategory)
    {
        generatedSetterHelperImpl(serviceCategory, SERVICECATEGORY$14, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "serviceCategory" element
     */
    public org.hl7.fhir.CodeableConcept addNewServiceCategory()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.CodeableConcept target = null;
            target = (org.hl7.fhir.CodeableConcept)get_store().add_element_user(SERVICECATEGORY$14);
            return target;
        }
    }
    
    /**
     * Unsets the "serviceCategory" element
     */
    public void unsetServiceCategory()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(SERVICECATEGORY$14, 0);
        }
    }
    
    /**
     * Gets the "diagnosticDateTime" element
     */
    public org.hl7.fhir.DateTime getDiagnosticDateTime()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.DateTime target = null;
            target = (org.hl7.fhir.DateTime)get_store().find_element_user(DIAGNOSTICDATETIME$16, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "diagnosticDateTime" element
     */
    public boolean isSetDiagnosticDateTime()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(DIAGNOSTICDATETIME$16) != 0;
        }
    }
    
    /**
     * Sets the "diagnosticDateTime" element
     */
    public void setDiagnosticDateTime(org.hl7.fhir.DateTime diagnosticDateTime)
    {
        generatedSetterHelperImpl(diagnosticDateTime, DIAGNOSTICDATETIME$16, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "diagnosticDateTime" element
     */
    public org.hl7.fhir.DateTime addNewDiagnosticDateTime()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.DateTime target = null;
            target = (org.hl7.fhir.DateTime)get_store().add_element_user(DIAGNOSTICDATETIME$16);
            return target;
        }
    }
    
    /**
     * Unsets the "diagnosticDateTime" element
     */
    public void unsetDiagnosticDateTime()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(DIAGNOSTICDATETIME$16, 0);
        }
    }
    
    /**
     * Gets the "diagnosticPeriod" element
     */
    public org.hl7.fhir.Period getDiagnosticPeriod()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.Period target = null;
            target = (org.hl7.fhir.Period)get_store().find_element_user(DIAGNOSTICPERIOD$18, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "diagnosticPeriod" element
     */
    public boolean isSetDiagnosticPeriod()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(DIAGNOSTICPERIOD$18) != 0;
        }
    }
    
    /**
     * Sets the "diagnosticPeriod" element
     */
    public void setDiagnosticPeriod(org.hl7.fhir.Period diagnosticPeriod)
    {
        generatedSetterHelperImpl(diagnosticPeriod, DIAGNOSTICPERIOD$18, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "diagnosticPeriod" element
     */
    public org.hl7.fhir.Period addNewDiagnosticPeriod()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.Period target = null;
            target = (org.hl7.fhir.Period)get_store().add_element_user(DIAGNOSTICPERIOD$18);
            return target;
        }
    }
    
    /**
     * Unsets the "diagnosticPeriod" element
     */
    public void unsetDiagnosticPeriod()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(DIAGNOSTICPERIOD$18, 0);
        }
    }
    
    /**
     * Gets array of all "specimen" elements
     */
    public org.hl7.fhir.ResourceReference[] getSpecimenArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(SPECIMEN$20, targetList);
            org.hl7.fhir.ResourceReference[] result = new org.hl7.fhir.ResourceReference[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "specimen" element
     */
    public org.hl7.fhir.ResourceReference getSpecimenArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.ResourceReference target = null;
            target = (org.hl7.fhir.ResourceReference)get_store().find_element_user(SPECIMEN$20, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "specimen" element
     */
    public int sizeOfSpecimenArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(SPECIMEN$20);
        }
    }
    
    /**
     * Sets array of all "specimen" element  WARNING: This method is not atomicaly synchronized.
     */
    public void setSpecimenArray(org.hl7.fhir.ResourceReference[] specimenArray)
    {
        check_orphaned();
        arraySetterHelper(specimenArray, SPECIMEN$20);
    }
    
    /**
     * Sets ith "specimen" element
     */
    public void setSpecimenArray(int i, org.hl7.fhir.ResourceReference specimen)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.ResourceReference target = null;
            target = (org.hl7.fhir.ResourceReference)get_store().find_element_user(SPECIMEN$20, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(specimen);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "specimen" element
     */
    public org.hl7.fhir.ResourceReference insertNewSpecimen(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.ResourceReference target = null;
            target = (org.hl7.fhir.ResourceReference)get_store().insert_element_user(SPECIMEN$20, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "specimen" element
     */
    public org.hl7.fhir.ResourceReference addNewSpecimen()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.ResourceReference target = null;
            target = (org.hl7.fhir.ResourceReference)get_store().add_element_user(SPECIMEN$20);
            return target;
        }
    }
    
    /**
     * Removes the ith "specimen" element
     */
    public void removeSpecimen(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(SPECIMEN$20, i);
        }
    }
    
    /**
     * Gets array of all "result" elements
     */
    public org.hl7.fhir.ResourceReference[] getResultArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(RESULT$22, targetList);
            org.hl7.fhir.ResourceReference[] result = new org.hl7.fhir.ResourceReference[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "result" element
     */
    public org.hl7.fhir.ResourceReference getResultArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.ResourceReference target = null;
            target = (org.hl7.fhir.ResourceReference)get_store().find_element_user(RESULT$22, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "result" element
     */
    public int sizeOfResultArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(RESULT$22);
        }
    }
    
    /**
     * Sets array of all "result" element  WARNING: This method is not atomicaly synchronized.
     */
    public void setResultArray(org.hl7.fhir.ResourceReference[] resultArray)
    {
        check_orphaned();
        arraySetterHelper(resultArray, RESULT$22);
    }
    
    /**
     * Sets ith "result" element
     */
    public void setResultArray(int i, org.hl7.fhir.ResourceReference result)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.ResourceReference target = null;
            target = (org.hl7.fhir.ResourceReference)get_store().find_element_user(RESULT$22, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(result);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "result" element
     */
    public org.hl7.fhir.ResourceReference insertNewResult(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.ResourceReference target = null;
            target = (org.hl7.fhir.ResourceReference)get_store().insert_element_user(RESULT$22, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "result" element
     */
    public org.hl7.fhir.ResourceReference addNewResult()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.ResourceReference target = null;
            target = (org.hl7.fhir.ResourceReference)get_store().add_element_user(RESULT$22);
            return target;
        }
    }
    
    /**
     * Removes the ith "result" element
     */
    public void removeResult(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(RESULT$22, i);
        }
    }
    
    /**
     * Gets array of all "imagingStudy" elements
     */
    public org.hl7.fhir.ResourceReference[] getImagingStudyArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(IMAGINGSTUDY$24, targetList);
            org.hl7.fhir.ResourceReference[] result = new org.hl7.fhir.ResourceReference[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "imagingStudy" element
     */
    public org.hl7.fhir.ResourceReference getImagingStudyArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.ResourceReference target = null;
            target = (org.hl7.fhir.ResourceReference)get_store().find_element_user(IMAGINGSTUDY$24, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "imagingStudy" element
     */
    public int sizeOfImagingStudyArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(IMAGINGSTUDY$24);
        }
    }
    
    /**
     * Sets array of all "imagingStudy" element  WARNING: This method is not atomicaly synchronized.
     */
    public void setImagingStudyArray(org.hl7.fhir.ResourceReference[] imagingStudyArray)
    {
        check_orphaned();
        arraySetterHelper(imagingStudyArray, IMAGINGSTUDY$24);
    }
    
    /**
     * Sets ith "imagingStudy" element
     */
    public void setImagingStudyArray(int i, org.hl7.fhir.ResourceReference imagingStudy)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.ResourceReference target = null;
            target = (org.hl7.fhir.ResourceReference)get_store().find_element_user(IMAGINGSTUDY$24, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(imagingStudy);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "imagingStudy" element
     */
    public org.hl7.fhir.ResourceReference insertNewImagingStudy(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.ResourceReference target = null;
            target = (org.hl7.fhir.ResourceReference)get_store().insert_element_user(IMAGINGSTUDY$24, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "imagingStudy" element
     */
    public org.hl7.fhir.ResourceReference addNewImagingStudy()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.ResourceReference target = null;
            target = (org.hl7.fhir.ResourceReference)get_store().add_element_user(IMAGINGSTUDY$24);
            return target;
        }
    }
    
    /**
     * Removes the ith "imagingStudy" element
     */
    public void removeImagingStudy(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(IMAGINGSTUDY$24, i);
        }
    }
    
    /**
     * Gets array of all "image" elements
     */
    public org.hl7.fhir.DiagnosticReportImage[] getImageArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(IMAGE$26, targetList);
            org.hl7.fhir.DiagnosticReportImage[] result = new org.hl7.fhir.DiagnosticReportImage[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "image" element
     */
    public org.hl7.fhir.DiagnosticReportImage getImageArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.DiagnosticReportImage target = null;
            target = (org.hl7.fhir.DiagnosticReportImage)get_store().find_element_user(IMAGE$26, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "image" element
     */
    public int sizeOfImageArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(IMAGE$26);
        }
    }
    
    /**
     * Sets array of all "image" element  WARNING: This method is not atomicaly synchronized.
     */
    public void setImageArray(org.hl7.fhir.DiagnosticReportImage[] imageArray)
    {
        check_orphaned();
        arraySetterHelper(imageArray, IMAGE$26);
    }
    
    /**
     * Sets ith "image" element
     */
    public void setImageArray(int i, org.hl7.fhir.DiagnosticReportImage image)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.DiagnosticReportImage target = null;
            target = (org.hl7.fhir.DiagnosticReportImage)get_store().find_element_user(IMAGE$26, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(image);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "image" element
     */
    public org.hl7.fhir.DiagnosticReportImage insertNewImage(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.DiagnosticReportImage target = null;
            target = (org.hl7.fhir.DiagnosticReportImage)get_store().insert_element_user(IMAGE$26, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "image" element
     */
    public org.hl7.fhir.DiagnosticReportImage addNewImage()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.DiagnosticReportImage target = null;
            target = (org.hl7.fhir.DiagnosticReportImage)get_store().add_element_user(IMAGE$26);
            return target;
        }
    }
    
    /**
     * Removes the ith "image" element
     */
    public void removeImage(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(IMAGE$26, i);
        }
    }
    
    /**
     * Gets the "conclusion" element
     */
    public org.hl7.fhir.String getConclusion()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.String target = null;
            target = (org.hl7.fhir.String)get_store().find_element_user(CONCLUSION$28, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "conclusion" element
     */
    public boolean isSetConclusion()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(CONCLUSION$28) != 0;
        }
    }
    
    /**
     * Sets the "conclusion" element
     */
    public void setConclusion(org.hl7.fhir.String conclusion)
    {
        generatedSetterHelperImpl(conclusion, CONCLUSION$28, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "conclusion" element
     */
    public org.hl7.fhir.String addNewConclusion()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.String target = null;
            target = (org.hl7.fhir.String)get_store().add_element_user(CONCLUSION$28);
            return target;
        }
    }
    
    /**
     * Unsets the "conclusion" element
     */
    public void unsetConclusion()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(CONCLUSION$28, 0);
        }
    }
    
    /**
     * Gets array of all "codedDiagnosis" elements
     */
    public org.hl7.fhir.CodeableConcept[] getCodedDiagnosisArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(CODEDDIAGNOSIS$30, targetList);
            org.hl7.fhir.CodeableConcept[] result = new org.hl7.fhir.CodeableConcept[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "codedDiagnosis" element
     */
    public org.hl7.fhir.CodeableConcept getCodedDiagnosisArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.CodeableConcept target = null;
            target = (org.hl7.fhir.CodeableConcept)get_store().find_element_user(CODEDDIAGNOSIS$30, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "codedDiagnosis" element
     */
    public int sizeOfCodedDiagnosisArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(CODEDDIAGNOSIS$30);
        }
    }
    
    /**
     * Sets array of all "codedDiagnosis" element  WARNING: This method is not atomicaly synchronized.
     */
    public void setCodedDiagnosisArray(org.hl7.fhir.CodeableConcept[] codedDiagnosisArray)
    {
        check_orphaned();
        arraySetterHelper(codedDiagnosisArray, CODEDDIAGNOSIS$30);
    }
    
    /**
     * Sets ith "codedDiagnosis" element
     */
    public void setCodedDiagnosisArray(int i, org.hl7.fhir.CodeableConcept codedDiagnosis)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.CodeableConcept target = null;
            target = (org.hl7.fhir.CodeableConcept)get_store().find_element_user(CODEDDIAGNOSIS$30, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(codedDiagnosis);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "codedDiagnosis" element
     */
    public org.hl7.fhir.CodeableConcept insertNewCodedDiagnosis(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.CodeableConcept target = null;
            target = (org.hl7.fhir.CodeableConcept)get_store().insert_element_user(CODEDDIAGNOSIS$30, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "codedDiagnosis" element
     */
    public org.hl7.fhir.CodeableConcept addNewCodedDiagnosis()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.CodeableConcept target = null;
            target = (org.hl7.fhir.CodeableConcept)get_store().add_element_user(CODEDDIAGNOSIS$30);
            return target;
        }
    }
    
    /**
     * Removes the ith "codedDiagnosis" element
     */
    public void removeCodedDiagnosis(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(CODEDDIAGNOSIS$30, i);
        }
    }
    
    /**
     * Gets array of all "presentedForm" elements
     */
    public org.hl7.fhir.Attachment[] getPresentedFormArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(PRESENTEDFORM$32, targetList);
            org.hl7.fhir.Attachment[] result = new org.hl7.fhir.Attachment[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "presentedForm" element
     */
    public org.hl7.fhir.Attachment getPresentedFormArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.Attachment target = null;
            target = (org.hl7.fhir.Attachment)get_store().find_element_user(PRESENTEDFORM$32, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "presentedForm" element
     */
    public int sizeOfPresentedFormArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(PRESENTEDFORM$32);
        }
    }
    
    /**
     * Sets array of all "presentedForm" element  WARNING: This method is not atomicaly synchronized.
     */
    public void setPresentedFormArray(org.hl7.fhir.Attachment[] presentedFormArray)
    {
        check_orphaned();
        arraySetterHelper(presentedFormArray, PRESENTEDFORM$32);
    }
    
    /**
     * Sets ith "presentedForm" element
     */
    public void setPresentedFormArray(int i, org.hl7.fhir.Attachment presentedForm)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.Attachment target = null;
            target = (org.hl7.fhir.Attachment)get_store().find_element_user(PRESENTEDFORM$32, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(presentedForm);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "presentedForm" element
     */
    public org.hl7.fhir.Attachment insertNewPresentedForm(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.Attachment target = null;
            target = (org.hl7.fhir.Attachment)get_store().insert_element_user(PRESENTEDFORM$32, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "presentedForm" element
     */
    public org.hl7.fhir.Attachment addNewPresentedForm()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.Attachment target = null;
            target = (org.hl7.fhir.Attachment)get_store().add_element_user(PRESENTEDFORM$32);
            return target;
        }
    }
    
    /**
     * Removes the ith "presentedForm" element
     */
    public void removePresentedForm(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(PRESENTEDFORM$32, i);
        }
    }
}
