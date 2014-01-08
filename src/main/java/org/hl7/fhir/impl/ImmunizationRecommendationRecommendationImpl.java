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
    
    private static final javax.xml.namespace.QName DATE$0 = 
        new javax.xml.namespace.QName("http://hl7.org/fhir", "date");
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
    private static final javax.xml.namespace.QName SUPPORTINGPATIENTINFORMATION$14 = 
        new javax.xml.namespace.QName("http://hl7.org/fhir", "supportingPatientInformation");
    
    
    /**
     * Gets the "date" element
     */
    public org.hl7.fhir.DateTime getDate()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.DateTime target = null;
            target = (org.hl7.fhir.DateTime)get_store().find_element_user(DATE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "date" element
     */
    public void setDate(org.hl7.fhir.DateTime date)
    {
        generatedSetterHelperImpl(date, DATE$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "date" element
     */
    public org.hl7.fhir.DateTime addNewDate()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.DateTime target = null;
            target = (org.hl7.fhir.DateTime)get_store().add_element_user(DATE$0);
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
    public org.hl7.fhir.CodeableConcept getForecastStatus()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.CodeableConcept target = null;
            target = (org.hl7.fhir.CodeableConcept)get_store().find_element_user(FORECASTSTATUS$6, 0);
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
    public void setForecastStatus(org.hl7.fhir.CodeableConcept forecastStatus)
    {
        generatedSetterHelperImpl(forecastStatus, FORECASTSTATUS$6, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "forecastStatus" element
     */
    public org.hl7.fhir.CodeableConcept addNewForecastStatus()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.CodeableConcept target = null;
            target = (org.hl7.fhir.CodeableConcept)get_store().add_element_user(FORECASTSTATUS$6);
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
     * Gets array of all "supportingPatientInformation" elements
     */
    public org.hl7.fhir.ResourceReference[] getSupportingPatientInformationArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(SUPPORTINGPATIENTINFORMATION$14, targetList);
            org.hl7.fhir.ResourceReference[] result = new org.hl7.fhir.ResourceReference[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "supportingPatientInformation" element
     */
    public org.hl7.fhir.ResourceReference getSupportingPatientInformationArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.ResourceReference target = null;
            target = (org.hl7.fhir.ResourceReference)get_store().find_element_user(SUPPORTINGPATIENTINFORMATION$14, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "supportingPatientInformation" element
     */
    public int sizeOfSupportingPatientInformationArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(SUPPORTINGPATIENTINFORMATION$14);
        }
    }
    
    /**
     * Sets array of all "supportingPatientInformation" element  WARNING: This method is not atomicaly synchronized.
     */
    public void setSupportingPatientInformationArray(org.hl7.fhir.ResourceReference[] supportingPatientInformationArray)
    {
        check_orphaned();
        arraySetterHelper(supportingPatientInformationArray, SUPPORTINGPATIENTINFORMATION$14);
    }
    
    /**
     * Sets ith "supportingPatientInformation" element
     */
    public void setSupportingPatientInformationArray(int i, org.hl7.fhir.ResourceReference supportingPatientInformation)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.ResourceReference target = null;
            target = (org.hl7.fhir.ResourceReference)get_store().find_element_user(SUPPORTINGPATIENTINFORMATION$14, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(supportingPatientInformation);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "supportingPatientInformation" element
     */
    public org.hl7.fhir.ResourceReference insertNewSupportingPatientInformation(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.ResourceReference target = null;
            target = (org.hl7.fhir.ResourceReference)get_store().insert_element_user(SUPPORTINGPATIENTINFORMATION$14, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "supportingPatientInformation" element
     */
    public org.hl7.fhir.ResourceReference addNewSupportingPatientInformation()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.ResourceReference target = null;
            target = (org.hl7.fhir.ResourceReference)get_store().add_element_user(SUPPORTINGPATIENTINFORMATION$14);
            return target;
        }
    }
    
    /**
     * Removes the ith "supportingPatientInformation" element
     */
    public void removeSupportingPatientInformation(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(SUPPORTINGPATIENTINFORMATION$14, i);
        }
    }
}
