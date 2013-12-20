/*
 * XML Type:  ImmunizationRecommendation.Recommendation
 * Namespace: http://hl7.org/fhir
 * Java type: org.hl7.fhir.ImmunizationRecommendationRecommendation
 *
 * Automatically generated - do not modify.
 */
package org.hl7.fhir.impl;
/**
 * An XML ImmunizationRecommendation.Recommendation(@http://hl7.org/fhir).
 *
 * This is a complex type.
 */
public class ImmunizationRecommendationRecommendationImpl extends org.hl7.fhir.impl.BackboneElementImpl implements org.hl7.fhir.ImmunizationRecommendationRecommendation
{
    private static final long serialVersionUID = 1L;
    
    public ImmunizationRecommendationRecommendationImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName RECOMMENDATIONDATE$0 = 
        new javax.xml.namespace.QName("http://hl7.org/fhir", "recommendationDate");
    private static final javax.xml.namespace.QName VACCINETYPE$2 = 
        new javax.xml.namespace.QName("http://hl7.org/fhir", "vaccineType");
    private static final javax.xml.namespace.QName DOSENUMBER$4 = 
        new javax.xml.namespace.QName("http://hl7.org/fhir", "doseNumber");
    private static final javax.xml.namespace.QName FORECASTSTATUS$6 = 
        new javax.xml.namespace.QName("http://hl7.org/fhir", "forecastStatus");
    private static final javax.xml.namespace.QName DATECRITERION$8 = 
        new javax.xml.namespace.QName("http://hl7.org/fhir", "dateCriterion");
    private static final javax.xml.namespace.QName PROTOCOL$10 = 
        new javax.xml.namespace.QName("http://hl7.org/fhir", "protocol");
    private static final javax.xml.namespace.QName SUPPORTINGIMMUNIZATION$12 = 
        new javax.xml.namespace.QName("http://hl7.org/fhir", "supportingImmunization");
    private static final javax.xml.namespace.QName SUPPORTINGADVERSEEVENTREPORT$14 = 
        new javax.xml.namespace.QName("http://hl7.org/fhir", "supportingAdverseEventReport");
    private static final javax.xml.namespace.QName SUPPORTINGPATIENTOBSERVATION$16 = 
        new javax.xml.namespace.QName("http://hl7.org/fhir", "supportingPatientObservation");
    
    
    /**
     * Gets the "recommendationDate" element
     */
    public org.hl7.fhir.DateTime getRecommendationDate()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.DateTime target = null;
            target = (org.hl7.fhir.DateTime)get_store().find_element_user(RECOMMENDATIONDATE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "recommendationDate" element
     */
    public void setRecommendationDate(org.hl7.fhir.DateTime recommendationDate)
    {
        generatedSetterHelperImpl(recommendationDate, RECOMMENDATIONDATE$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "recommendationDate" element
     */
    public org.hl7.fhir.DateTime addNewRecommendationDate()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.DateTime target = null;
            target = (org.hl7.fhir.DateTime)get_store().add_element_user(RECOMMENDATIONDATE$0);
            return target;
        }
    }
    
    /**
     * Gets the "vaccineType" element
     */
    public org.hl7.fhir.CodeableConcept getVaccineType()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.CodeableConcept target = null;
            target = (org.hl7.fhir.CodeableConcept)get_store().find_element_user(VACCINETYPE$2, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "vaccineType" element
     */
    public void setVaccineType(org.hl7.fhir.CodeableConcept vaccineType)
    {
        generatedSetterHelperImpl(vaccineType, VACCINETYPE$2, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "vaccineType" element
     */
    public org.hl7.fhir.CodeableConcept addNewVaccineType()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.CodeableConcept target = null;
            target = (org.hl7.fhir.CodeableConcept)get_store().add_element_user(VACCINETYPE$2);
            return target;
        }
    }
    
    /**
     * Gets the "doseNumber" element
     */
    public org.hl7.fhir.Integer getDoseNumber()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.Integer target = null;
            target = (org.hl7.fhir.Integer)get_store().find_element_user(DOSENUMBER$4, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "doseNumber" element
     */
    public boolean isSetDoseNumber()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(DOSENUMBER$4) != 0;
        }
    }
    
    /**
     * Sets the "doseNumber" element
     */
    public void setDoseNumber(org.hl7.fhir.Integer doseNumber)
    {
        generatedSetterHelperImpl(doseNumber, DOSENUMBER$4, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "doseNumber" element
     */
    public org.hl7.fhir.Integer addNewDoseNumber()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.Integer target = null;
            target = (org.hl7.fhir.Integer)get_store().add_element_user(DOSENUMBER$4);
            return target;
        }
    }
    
    /**
     * Unsets the "doseNumber" element
     */
    public void unsetDoseNumber()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(DOSENUMBER$4, 0);
        }
    }
    
    /**
     * Gets the "forecastStatus" element
     */
    public org.hl7.fhir.ImmunizationForecastStatus getForecastStatus()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.ImmunizationForecastStatus target = null;
            target = (org.hl7.fhir.ImmunizationForecastStatus)get_store().find_element_user(FORECASTSTATUS$6, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "forecastStatus" element
     */
    public void setForecastStatus(org.hl7.fhir.ImmunizationForecastStatus forecastStatus)
    {
        generatedSetterHelperImpl(forecastStatus, FORECASTSTATUS$6, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "forecastStatus" element
     */
    public org.hl7.fhir.ImmunizationForecastStatus addNewForecastStatus()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.ImmunizationForecastStatus target = null;
            target = (org.hl7.fhir.ImmunizationForecastStatus)get_store().add_element_user(FORECASTSTATUS$6);
            return target;
        }
    }
    
    /**
     * Gets array of all "dateCriterion" elements
     */
    public org.hl7.fhir.ImmunizationRecommendationDateCriterion[] getDateCriterionArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(DATECRITERION$8, targetList);
            org.hl7.fhir.ImmunizationRecommendationDateCriterion[] result = new org.hl7.fhir.ImmunizationRecommendationDateCriterion[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "dateCriterion" element
     */
    public org.hl7.fhir.ImmunizationRecommendationDateCriterion getDateCriterionArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.ImmunizationRecommendationDateCriterion target = null;
            target = (org.hl7.fhir.ImmunizationRecommendationDateCriterion)get_store().find_element_user(DATECRITERION$8, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "dateCriterion" element
     */
    public int sizeOfDateCriterionArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(DATECRITERION$8);
        }
    }
    
    /**
     * Sets array of all "dateCriterion" element  WARNING: This method is not atomicaly synchronized.
     */
    public void setDateCriterionArray(org.hl7.fhir.ImmunizationRecommendationDateCriterion[] dateCriterionArray)
    {
        check_orphaned();
        arraySetterHelper(dateCriterionArray, DATECRITERION$8);
    }
    
    /**
     * Sets ith "dateCriterion" element
     */
    public void setDateCriterionArray(int i, org.hl7.fhir.ImmunizationRecommendationDateCriterion dateCriterion)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.ImmunizationRecommendationDateCriterion target = null;
            target = (org.hl7.fhir.ImmunizationRecommendationDateCriterion)get_store().find_element_user(DATECRITERION$8, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(dateCriterion);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "dateCriterion" element
     */
    public org.hl7.fhir.ImmunizationRecommendationDateCriterion insertNewDateCriterion(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.ImmunizationRecommendationDateCriterion target = null;
            target = (org.hl7.fhir.ImmunizationRecommendationDateCriterion)get_store().insert_element_user(DATECRITERION$8, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "dateCriterion" element
     */
    public org.hl7.fhir.ImmunizationRecommendationDateCriterion addNewDateCriterion()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.ImmunizationRecommendationDateCriterion target = null;
            target = (org.hl7.fhir.ImmunizationRecommendationDateCriterion)get_store().add_element_user(DATECRITERION$8);
            return target;
        }
    }
    
    /**
     * Removes the ith "dateCriterion" element
     */
    public void removeDateCriterion(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(DATECRITERION$8, i);
        }
    }
    
    /**
     * Gets the "protocol" element
     */
    public org.hl7.fhir.ImmunizationRecommendationProtocol getProtocol()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.ImmunizationRecommendationProtocol target = null;
            target = (org.hl7.fhir.ImmunizationRecommendationProtocol)get_store().find_element_user(PROTOCOL$10, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "protocol" element
     */
    public boolean isSetProtocol()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(PROTOCOL$10) != 0;
        }
    }
    
    /**
     * Sets the "protocol" element
     */
    public void setProtocol(org.hl7.fhir.ImmunizationRecommendationProtocol protocol)
    {
        generatedSetterHelperImpl(protocol, PROTOCOL$10, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "protocol" element
     */
    public org.hl7.fhir.ImmunizationRecommendationProtocol addNewProtocol()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.ImmunizationRecommendationProtocol target = null;
            target = (org.hl7.fhir.ImmunizationRecommendationProtocol)get_store().add_element_user(PROTOCOL$10);
            return target;
        }
    }
    
    /**
     * Unsets the "protocol" element
     */
    public void unsetProtocol()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(PROTOCOL$10, 0);
        }
    }
    
    /**
     * Gets array of all "supportingImmunization" elements
     */
    public org.hl7.fhir.ResourceReference[] getSupportingImmunizationArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(SUPPORTINGIMMUNIZATION$12, targetList);
            org.hl7.fhir.ResourceReference[] result = new org.hl7.fhir.ResourceReference[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "supportingImmunization" element
     */
    public org.hl7.fhir.ResourceReference getSupportingImmunizationArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.ResourceReference target = null;
            target = (org.hl7.fhir.ResourceReference)get_store().find_element_user(SUPPORTINGIMMUNIZATION$12, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "supportingImmunization" element
     */
    public int sizeOfSupportingImmunizationArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(SUPPORTINGIMMUNIZATION$12);
        }
    }
    
    /**
     * Sets array of all "supportingImmunization" element  WARNING: This method is not atomicaly synchronized.
     */
    public void setSupportingImmunizationArray(org.hl7.fhir.ResourceReference[] supportingImmunizationArray)
    {
        check_orphaned();
        arraySetterHelper(supportingImmunizationArray, SUPPORTINGIMMUNIZATION$12);
    }
    
    /**
     * Sets ith "supportingImmunization" element
     */
    public void setSupportingImmunizationArray(int i, org.hl7.fhir.ResourceReference supportingImmunization)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.ResourceReference target = null;
            target = (org.hl7.fhir.ResourceReference)get_store().find_element_user(SUPPORTINGIMMUNIZATION$12, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(supportingImmunization);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "supportingImmunization" element
     */
    public org.hl7.fhir.ResourceReference insertNewSupportingImmunization(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.ResourceReference target = null;
            target = (org.hl7.fhir.ResourceReference)get_store().insert_element_user(SUPPORTINGIMMUNIZATION$12, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "supportingImmunization" element
     */
    public org.hl7.fhir.ResourceReference addNewSupportingImmunization()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.ResourceReference target = null;
            target = (org.hl7.fhir.ResourceReference)get_store().add_element_user(SUPPORTINGIMMUNIZATION$12);
            return target;
        }
    }
    
    /**
     * Removes the ith "supportingImmunization" element
     */
    public void removeSupportingImmunization(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(SUPPORTINGIMMUNIZATION$12, i);
        }
    }
    
    /**
     * Gets array of all "supportingAdverseEventReport" elements
     */
    public org.hl7.fhir.ImmunizationRecommendationSupportingAdverseEventReport[] getSupportingAdverseEventReportArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(SUPPORTINGADVERSEEVENTREPORT$14, targetList);
            org.hl7.fhir.ImmunizationRecommendationSupportingAdverseEventReport[] result = new org.hl7.fhir.ImmunizationRecommendationSupportingAdverseEventReport[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "supportingAdverseEventReport" element
     */
    public org.hl7.fhir.ImmunizationRecommendationSupportingAdverseEventReport getSupportingAdverseEventReportArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.ImmunizationRecommendationSupportingAdverseEventReport target = null;
            target = (org.hl7.fhir.ImmunizationRecommendationSupportingAdverseEventReport)get_store().find_element_user(SUPPORTINGADVERSEEVENTREPORT$14, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "supportingAdverseEventReport" element
     */
    public int sizeOfSupportingAdverseEventReportArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(SUPPORTINGADVERSEEVENTREPORT$14);
        }
    }
    
    /**
     * Sets array of all "supportingAdverseEventReport" element  WARNING: This method is not atomicaly synchronized.
     */
    public void setSupportingAdverseEventReportArray(org.hl7.fhir.ImmunizationRecommendationSupportingAdverseEventReport[] supportingAdverseEventReportArray)
    {
        check_orphaned();
        arraySetterHelper(supportingAdverseEventReportArray, SUPPORTINGADVERSEEVENTREPORT$14);
    }
    
    /**
     * Sets ith "supportingAdverseEventReport" element
     */
    public void setSupportingAdverseEventReportArray(int i, org.hl7.fhir.ImmunizationRecommendationSupportingAdverseEventReport supportingAdverseEventReport)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.ImmunizationRecommendationSupportingAdverseEventReport target = null;
            target = (org.hl7.fhir.ImmunizationRecommendationSupportingAdverseEventReport)get_store().find_element_user(SUPPORTINGADVERSEEVENTREPORT$14, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(supportingAdverseEventReport);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "supportingAdverseEventReport" element
     */
    public org.hl7.fhir.ImmunizationRecommendationSupportingAdverseEventReport insertNewSupportingAdverseEventReport(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.ImmunizationRecommendationSupportingAdverseEventReport target = null;
            target = (org.hl7.fhir.ImmunizationRecommendationSupportingAdverseEventReport)get_store().insert_element_user(SUPPORTINGADVERSEEVENTREPORT$14, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "supportingAdverseEventReport" element
     */
    public org.hl7.fhir.ImmunizationRecommendationSupportingAdverseEventReport addNewSupportingAdverseEventReport()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.ImmunizationRecommendationSupportingAdverseEventReport target = null;
            target = (org.hl7.fhir.ImmunizationRecommendationSupportingAdverseEventReport)get_store().add_element_user(SUPPORTINGADVERSEEVENTREPORT$14);
            return target;
        }
    }
    
    /**
     * Removes the ith "supportingAdverseEventReport" element
     */
    public void removeSupportingAdverseEventReport(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(SUPPORTINGADVERSEEVENTREPORT$14, i);
        }
    }
    
    /**
     * Gets array of all "supportingPatientObservation" elements
     */
    public org.hl7.fhir.ResourceReference[] getSupportingPatientObservationArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(SUPPORTINGPATIENTOBSERVATION$16, targetList);
            org.hl7.fhir.ResourceReference[] result = new org.hl7.fhir.ResourceReference[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "supportingPatientObservation" element
     */
    public org.hl7.fhir.ResourceReference getSupportingPatientObservationArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.ResourceReference target = null;
            target = (org.hl7.fhir.ResourceReference)get_store().find_element_user(SUPPORTINGPATIENTOBSERVATION$16, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "supportingPatientObservation" element
     */
    public int sizeOfSupportingPatientObservationArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(SUPPORTINGPATIENTOBSERVATION$16);
        }
    }
    
    /**
     * Sets array of all "supportingPatientObservation" element  WARNING: This method is not atomicaly synchronized.
     */
    public void setSupportingPatientObservationArray(org.hl7.fhir.ResourceReference[] supportingPatientObservationArray)
    {
        check_orphaned();
        arraySetterHelper(supportingPatientObservationArray, SUPPORTINGPATIENTOBSERVATION$16);
    }
    
    /**
     * Sets ith "supportingPatientObservation" element
     */
    public void setSupportingPatientObservationArray(int i, org.hl7.fhir.ResourceReference supportingPatientObservation)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.ResourceReference target = null;
            target = (org.hl7.fhir.ResourceReference)get_store().find_element_user(SUPPORTINGPATIENTOBSERVATION$16, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(supportingPatientObservation);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "supportingPatientObservation" element
     */
    public org.hl7.fhir.ResourceReference insertNewSupportingPatientObservation(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.ResourceReference target = null;
            target = (org.hl7.fhir.ResourceReference)get_store().insert_element_user(SUPPORTINGPATIENTOBSERVATION$16, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "supportingPatientObservation" element
     */
    public org.hl7.fhir.ResourceReference addNewSupportingPatientObservation()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.ResourceReference target = null;
            target = (org.hl7.fhir.ResourceReference)get_store().add_element_user(SUPPORTINGPATIENTOBSERVATION$16);
            return target;
        }
    }
    
    /**
     * Removes the ith "supportingPatientObservation" element
     */
    public void removeSupportingPatientObservation(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(SUPPORTINGPATIENTOBSERVATION$16, i);
        }
    }
}
