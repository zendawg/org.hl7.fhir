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
    
    private static final javax.xml.namespace.QName STATUS$0 = 
        new javax.xml.namespace.QName("http://hl7.org/fhir", "status");
    private static final javax.xml.namespace.QName ISSUED$2 = 
        new javax.xml.namespace.QName("http://hl7.org/fhir", "issued");
    private static final javax.xml.namespace.QName SUBJECT$4 = 
        new javax.xml.namespace.QName("http://hl7.org/fhir", "subject");
    private static final javax.xml.namespace.QName PERFORMER$6 = 
        new javax.xml.namespace.QName("http://hl7.org/fhir", "performer");
    private static final javax.xml.namespace.QName IDENTIFIER$8 = 
        new javax.xml.namespace.QName("http://hl7.org/fhir", "identifier");
    private static final javax.xml.namespace.QName REQUESTDETAIL$10 = 
        new javax.xml.namespace.QName("http://hl7.org/fhir", "requestDetail");
    private static final javax.xml.namespace.QName SERVICECATEGORY$12 = 
        new javax.xml.namespace.QName("http://hl7.org/fhir", "serviceCategory");
    private static final javax.xml.namespace.QName DIAGNOSTICDATETIME$14 = 
        new javax.xml.namespace.QName("http://hl7.org/fhir", "diagnosticDateTime");
    private static final javax.xml.namespace.QName DIAGNOSTICPERIOD$16 = 
        new javax.xml.namespace.QName("http://hl7.org/fhir", "diagnosticPeriod");
    private static final javax.xml.namespace.QName RESULTS$18 = 
        new javax.xml.namespace.QName("http://hl7.org/fhir", "results");
    private static final javax.xml.namespace.QName IMAGINGSTUDY$20 = 
        new javax.xml.namespace.QName("http://hl7.org/fhir", "imagingStudy");
    private static final javax.xml.namespace.QName IMAGE$22 = 
        new javax.xml.namespace.QName("http://hl7.org/fhir", "image");
    private static final javax.xml.namespace.QName CONCLUSION$24 = 
        new javax.xml.namespace.QName("http://hl7.org/fhir", "conclusion");
    private static final javax.xml.namespace.QName CODEDDIAGNOSIS$26 = 
        new javax.xml.namespace.QName("http://hl7.org/fhir", "codedDiagnosis");
    private static final javax.xml.namespace.QName PRESENTEDFORM$28 = 
        new javax.xml.namespace.QName("http://hl7.org/fhir", "presentedForm");
    
    
    /**
     * Gets the "status" element
     */
    public org.hl7.fhir.DiagnosticReportStatus getStatus()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.DiagnosticReportStatus target = null;
            target = (org.hl7.fhir.DiagnosticReportStatus)get_store().find_element_user(STATUS$0, 0);
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
        generatedSetterHelperImpl(status, STATUS$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
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
            target = (org.hl7.fhir.DiagnosticReportStatus)get_store().add_element_user(STATUS$0);
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
            target = (org.hl7.fhir.DateTime)get_store().find_element_user(ISSUED$2, 0);
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
        generatedSetterHelperImpl(issued, ISSUED$2, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
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
            target = (org.hl7.fhir.DateTime)get_store().add_element_user(ISSUED$2);
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
            target = (org.hl7.fhir.ResourceReference)get_store().find_element_user(SUBJECT$4, 0);
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
        generatedSetterHelperImpl(subject, SUBJECT$4, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
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
            target = (org.hl7.fhir.ResourceReference)get_store().add_element_user(SUBJECT$4);
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
            target = (org.hl7.fhir.ResourceReference)get_store().find_element_user(PERFORMER$6, 0);
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
        generatedSetterHelperImpl(performer, PERFORMER$6, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
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
            target = (org.hl7.fhir.ResourceReference)get_store().add_element_user(PERFORMER$6);
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
            target = (org.hl7.fhir.Identifier)get_store().find_element_user(IDENTIFIER$8, 0);
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
            return get_store().count_elements(IDENTIFIER$8) != 0;
        }
    }
    
    /**
     * Sets the "identifier" element
     */
    public void setIdentifier(org.hl7.fhir.Identifier identifier)
    {
        generatedSetterHelperImpl(identifier, IDENTIFIER$8, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
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
            target = (org.hl7.fhir.Identifier)get_store().add_element_user(IDENTIFIER$8);
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
            get_store().remove_element(IDENTIFIER$8, 0);
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
            get_store().find_all_element_users(REQUESTDETAIL$10, targetList);
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
            target = (org.hl7.fhir.ResourceReference)get_store().find_element_user(REQUESTDETAIL$10, i);
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
            return get_store().count_elements(REQUESTDETAIL$10);
        }
    }
    
    /**
     * Sets array of all "requestDetail" element  WARNING: This method is not atomicaly synchronized.
     */
    public void setRequestDetailArray(org.hl7.fhir.ResourceReference[] requestDetailArray)
    {
        check_orphaned();
        arraySetterHelper(requestDetailArray, REQUESTDETAIL$10);
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
            target = (org.hl7.fhir.ResourceReference)get_store().find_element_user(REQUESTDETAIL$10, i);
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
            target = (org.hl7.fhir.ResourceReference)get_store().insert_element_user(REQUESTDETAIL$10, i);
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
            target = (org.hl7.fhir.ResourceReference)get_store().add_element_user(REQUESTDETAIL$10);
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
            get_store().remove_element(REQUESTDETAIL$10, i);
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
            target = (org.hl7.fhir.CodeableConcept)get_store().find_element_user(SERVICECATEGORY$12, 0);
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
            return get_store().count_elements(SERVICECATEGORY$12) != 0;
        }
    }
    
    /**
     * Sets the "serviceCategory" element
     */
    public void setServiceCategory(org.hl7.fhir.CodeableConcept serviceCategory)
    {
        generatedSetterHelperImpl(serviceCategory, SERVICECATEGORY$12, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
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
            target = (org.hl7.fhir.CodeableConcept)get_store().add_element_user(SERVICECATEGORY$12);
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
            get_store().remove_element(SERVICECATEGORY$12, 0);
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
            target = (org.hl7.fhir.DateTime)get_store().find_element_user(DIAGNOSTICDATETIME$14, 0);
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
            return get_store().count_elements(DIAGNOSTICDATETIME$14) != 0;
        }
    }
    
    /**
     * Sets the "diagnosticDateTime" element
     */
    public void setDiagnosticDateTime(org.hl7.fhir.DateTime diagnosticDateTime)
    {
        generatedSetterHelperImpl(diagnosticDateTime, DIAGNOSTICDATETIME$14, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
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
            target = (org.hl7.fhir.DateTime)get_store().add_element_user(DIAGNOSTICDATETIME$14);
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
            get_store().remove_element(DIAGNOSTICDATETIME$14, 0);
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
            target = (org.hl7.fhir.Period)get_store().find_element_user(DIAGNOSTICPERIOD$16, 0);
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
            return get_store().count_elements(DIAGNOSTICPERIOD$16) != 0;
        }
    }
    
    /**
     * Sets the "diagnosticPeriod" element
     */
    public void setDiagnosticPeriod(org.hl7.fhir.Period diagnosticPeriod)
    {
        generatedSetterHelperImpl(diagnosticPeriod, DIAGNOSTICPERIOD$16, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
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
            target = (org.hl7.fhir.Period)get_store().add_element_user(DIAGNOSTICPERIOD$16);
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
            get_store().remove_element(DIAGNOSTICPERIOD$16, 0);
        }
    }
    
    /**
     * Gets the "results" element
     */
    public org.hl7.fhir.DiagnosticReportResults getResults()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.DiagnosticReportResults target = null;
            target = (org.hl7.fhir.DiagnosticReportResults)get_store().find_element_user(RESULTS$18, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "results" element
     */
    public void setResults(org.hl7.fhir.DiagnosticReportResults results)
    {
        generatedSetterHelperImpl(results, RESULTS$18, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "results" element
     */
    public org.hl7.fhir.DiagnosticReportResults addNewResults()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.DiagnosticReportResults target = null;
            target = (org.hl7.fhir.DiagnosticReportResults)get_store().add_element_user(RESULTS$18);
            return target;
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
            get_store().find_all_element_users(IMAGINGSTUDY$20, targetList);
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
            target = (org.hl7.fhir.ResourceReference)get_store().find_element_user(IMAGINGSTUDY$20, i);
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
            return get_store().count_elements(IMAGINGSTUDY$20);
        }
    }
    
    /**
     * Sets array of all "imagingStudy" element  WARNING: This method is not atomicaly synchronized.
     */
    public void setImagingStudyArray(org.hl7.fhir.ResourceReference[] imagingStudyArray)
    {
        check_orphaned();
        arraySetterHelper(imagingStudyArray, IMAGINGSTUDY$20);
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
            target = (org.hl7.fhir.ResourceReference)get_store().find_element_user(IMAGINGSTUDY$20, i);
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
            target = (org.hl7.fhir.ResourceReference)get_store().insert_element_user(IMAGINGSTUDY$20, i);
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
            target = (org.hl7.fhir.ResourceReference)get_store().add_element_user(IMAGINGSTUDY$20);
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
            get_store().remove_element(IMAGINGSTUDY$20, i);
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
            get_store().find_all_element_users(IMAGE$22, targetList);
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
            target = (org.hl7.fhir.DiagnosticReportImage)get_store().find_element_user(IMAGE$22, i);
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
            return get_store().count_elements(IMAGE$22);
        }
    }
    
    /**
     * Sets array of all "image" element  WARNING: This method is not atomicaly synchronized.
     */
    public void setImageArray(org.hl7.fhir.DiagnosticReportImage[] imageArray)
    {
        check_orphaned();
        arraySetterHelper(imageArray, IMAGE$22);
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
            target = (org.hl7.fhir.DiagnosticReportImage)get_store().find_element_user(IMAGE$22, i);
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
            target = (org.hl7.fhir.DiagnosticReportImage)get_store().insert_element_user(IMAGE$22, i);
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
            target = (org.hl7.fhir.DiagnosticReportImage)get_store().add_element_user(IMAGE$22);
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
            get_store().remove_element(IMAGE$22, i);
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
            target = (org.hl7.fhir.String)get_store().find_element_user(CONCLUSION$24, 0);
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
            return get_store().count_elements(CONCLUSION$24) != 0;
        }
    }
    
    /**
     * Sets the "conclusion" element
     */
    public void setConclusion(org.hl7.fhir.String conclusion)
    {
        generatedSetterHelperImpl(conclusion, CONCLUSION$24, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
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
            target = (org.hl7.fhir.String)get_store().add_element_user(CONCLUSION$24);
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
            get_store().remove_element(CONCLUSION$24, 0);
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
            get_store().find_all_element_users(CODEDDIAGNOSIS$26, targetList);
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
            target = (org.hl7.fhir.CodeableConcept)get_store().find_element_user(CODEDDIAGNOSIS$26, i);
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
            return get_store().count_elements(CODEDDIAGNOSIS$26);
        }
    }
    
    /**
     * Sets array of all "codedDiagnosis" element  WARNING: This method is not atomicaly synchronized.
     */
    public void setCodedDiagnosisArray(org.hl7.fhir.CodeableConcept[] codedDiagnosisArray)
    {
        check_orphaned();
        arraySetterHelper(codedDiagnosisArray, CODEDDIAGNOSIS$26);
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
            target = (org.hl7.fhir.CodeableConcept)get_store().find_element_user(CODEDDIAGNOSIS$26, i);
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
            target = (org.hl7.fhir.CodeableConcept)get_store().insert_element_user(CODEDDIAGNOSIS$26, i);
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
            target = (org.hl7.fhir.CodeableConcept)get_store().add_element_user(CODEDDIAGNOSIS$26);
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
            get_store().remove_element(CODEDDIAGNOSIS$26, i);
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
            get_store().find_all_element_users(PRESENTEDFORM$28, targetList);
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
            target = (org.hl7.fhir.Attachment)get_store().find_element_user(PRESENTEDFORM$28, i);
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
            return get_store().count_elements(PRESENTEDFORM$28);
        }
    }
    
    /**
     * Sets array of all "presentedForm" element  WARNING: This method is not atomicaly synchronized.
     */
    public void setPresentedFormArray(org.hl7.fhir.Attachment[] presentedFormArray)
    {
        check_orphaned();
        arraySetterHelper(presentedFormArray, PRESENTEDFORM$28);
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
            target = (org.hl7.fhir.Attachment)get_store().find_element_user(PRESENTEDFORM$28, i);
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
            target = (org.hl7.fhir.Attachment)get_store().insert_element_user(PRESENTEDFORM$28, i);
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
            target = (org.hl7.fhir.Attachment)get_store().add_element_user(PRESENTEDFORM$28);
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
            get_store().remove_element(PRESENTEDFORM$28, i);
        }
    }
}
