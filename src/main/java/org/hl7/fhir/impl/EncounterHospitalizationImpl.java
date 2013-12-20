/*
 * XML Type:  Encounter.Hospitalization
 * Namespace: http://hl7.org/fhir
 * Java type: org.hl7.fhir.EncounterHospitalization
 *
 * Automatically generated - do not modify.
 */
package org.hl7.fhir.impl;
/**
 * An XML Encounter.Hospitalization(@http://hl7.org/fhir).
 *
 * This is a complex type.
 */
public class EncounterHospitalizationImpl extends org.hl7.fhir.impl.BackboneElementImpl implements org.hl7.fhir.EncounterHospitalization
{
    private static final long serialVersionUID = 1L;
    
    public EncounterHospitalizationImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName PREADMISSIONIDENTIFIER$0 = 
        new javax.xml.namespace.QName("http://hl7.org/fhir", "preAdmissionIdentifier");
    private static final javax.xml.namespace.QName ORIGIN$2 = 
        new javax.xml.namespace.QName("http://hl7.org/fhir", "origin");
    private static final javax.xml.namespace.QName ADMITSOURCE$4 = 
        new javax.xml.namespace.QName("http://hl7.org/fhir", "admitSource");
    private static final javax.xml.namespace.QName PERIOD$6 = 
        new javax.xml.namespace.QName("http://hl7.org/fhir", "period");
    private static final javax.xml.namespace.QName ACCOMODATION$8 = 
        new javax.xml.namespace.QName("http://hl7.org/fhir", "accomodation");
    private static final javax.xml.namespace.QName DIET$10 = 
        new javax.xml.namespace.QName("http://hl7.org/fhir", "diet");
    private static final javax.xml.namespace.QName SPECIALCOURTESY$12 = 
        new javax.xml.namespace.QName("http://hl7.org/fhir", "specialCourtesy");
    private static final javax.xml.namespace.QName SPECIALARRANGEMENT$14 = 
        new javax.xml.namespace.QName("http://hl7.org/fhir", "specialArrangement");
    private static final javax.xml.namespace.QName DESTINATION$16 = 
        new javax.xml.namespace.QName("http://hl7.org/fhir", "destination");
    private static final javax.xml.namespace.QName DISCHARGEDISPOSITION$18 = 
        new javax.xml.namespace.QName("http://hl7.org/fhir", "dischargeDisposition");
    private static final javax.xml.namespace.QName DISCHARGEDIAGNOSIS$20 = 
        new javax.xml.namespace.QName("http://hl7.org/fhir", "dischargeDiagnosis");
    private static final javax.xml.namespace.QName READMISSION$22 = 
        new javax.xml.namespace.QName("http://hl7.org/fhir", "reAdmission");
    
    
    /**
     * Gets the "preAdmissionIdentifier" element
     */
    public org.hl7.fhir.Identifier getPreAdmissionIdentifier()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.Identifier target = null;
            target = (org.hl7.fhir.Identifier)get_store().find_element_user(PREADMISSIONIDENTIFIER$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "preAdmissionIdentifier" element
     */
    public boolean isSetPreAdmissionIdentifier()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(PREADMISSIONIDENTIFIER$0) != 0;
        }
    }
    
    /**
     * Sets the "preAdmissionIdentifier" element
     */
    public void setPreAdmissionIdentifier(org.hl7.fhir.Identifier preAdmissionIdentifier)
    {
        generatedSetterHelperImpl(preAdmissionIdentifier, PREADMISSIONIDENTIFIER$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "preAdmissionIdentifier" element
     */
    public org.hl7.fhir.Identifier addNewPreAdmissionIdentifier()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.Identifier target = null;
            target = (org.hl7.fhir.Identifier)get_store().add_element_user(PREADMISSIONIDENTIFIER$0);
            return target;
        }
    }
    
    /**
     * Unsets the "preAdmissionIdentifier" element
     */
    public void unsetPreAdmissionIdentifier()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(PREADMISSIONIDENTIFIER$0, 0);
        }
    }
    
    /**
     * Gets the "origin" element
     */
    public org.hl7.fhir.ResourceReference getOrigin()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.ResourceReference target = null;
            target = (org.hl7.fhir.ResourceReference)get_store().find_element_user(ORIGIN$2, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "origin" element
     */
    public boolean isSetOrigin()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(ORIGIN$2) != 0;
        }
    }
    
    /**
     * Sets the "origin" element
     */
    public void setOrigin(org.hl7.fhir.ResourceReference origin)
    {
        generatedSetterHelperImpl(origin, ORIGIN$2, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "origin" element
     */
    public org.hl7.fhir.ResourceReference addNewOrigin()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.ResourceReference target = null;
            target = (org.hl7.fhir.ResourceReference)get_store().add_element_user(ORIGIN$2);
            return target;
        }
    }
    
    /**
     * Unsets the "origin" element
     */
    public void unsetOrigin()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(ORIGIN$2, 0);
        }
    }
    
    /**
     * Gets the "admitSource" element
     */
    public org.hl7.fhir.CodeableConcept getAdmitSource()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.CodeableConcept target = null;
            target = (org.hl7.fhir.CodeableConcept)get_store().find_element_user(ADMITSOURCE$4, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "admitSource" element
     */
    public boolean isSetAdmitSource()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(ADMITSOURCE$4) != 0;
        }
    }
    
    /**
     * Sets the "admitSource" element
     */
    public void setAdmitSource(org.hl7.fhir.CodeableConcept admitSource)
    {
        generatedSetterHelperImpl(admitSource, ADMITSOURCE$4, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "admitSource" element
     */
    public org.hl7.fhir.CodeableConcept addNewAdmitSource()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.CodeableConcept target = null;
            target = (org.hl7.fhir.CodeableConcept)get_store().add_element_user(ADMITSOURCE$4);
            return target;
        }
    }
    
    /**
     * Unsets the "admitSource" element
     */
    public void unsetAdmitSource()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(ADMITSOURCE$4, 0);
        }
    }
    
    /**
     * Gets the "period" element
     */
    public org.hl7.fhir.Period getPeriod()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.Period target = null;
            target = (org.hl7.fhir.Period)get_store().find_element_user(PERIOD$6, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "period" element
     */
    public boolean isSetPeriod()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(PERIOD$6) != 0;
        }
    }
    
    /**
     * Sets the "period" element
     */
    public void setPeriod(org.hl7.fhir.Period period)
    {
        generatedSetterHelperImpl(period, PERIOD$6, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "period" element
     */
    public org.hl7.fhir.Period addNewPeriod()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.Period target = null;
            target = (org.hl7.fhir.Period)get_store().add_element_user(PERIOD$6);
            return target;
        }
    }
    
    /**
     * Unsets the "period" element
     */
    public void unsetPeriod()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(PERIOD$6, 0);
        }
    }
    
    /**
     * Gets array of all "accomodation" elements
     */
    public org.hl7.fhir.EncounterAccomodation[] getAccomodationArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(ACCOMODATION$8, targetList);
            org.hl7.fhir.EncounterAccomodation[] result = new org.hl7.fhir.EncounterAccomodation[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "accomodation" element
     */
    public org.hl7.fhir.EncounterAccomodation getAccomodationArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.EncounterAccomodation target = null;
            target = (org.hl7.fhir.EncounterAccomodation)get_store().find_element_user(ACCOMODATION$8, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "accomodation" element
     */
    public int sizeOfAccomodationArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(ACCOMODATION$8);
        }
    }
    
    /**
     * Sets array of all "accomodation" element  WARNING: This method is not atomicaly synchronized.
     */
    public void setAccomodationArray(org.hl7.fhir.EncounterAccomodation[] accomodationArray)
    {
        check_orphaned();
        arraySetterHelper(accomodationArray, ACCOMODATION$8);
    }
    
    /**
     * Sets ith "accomodation" element
     */
    public void setAccomodationArray(int i, org.hl7.fhir.EncounterAccomodation accomodation)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.EncounterAccomodation target = null;
            target = (org.hl7.fhir.EncounterAccomodation)get_store().find_element_user(ACCOMODATION$8, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(accomodation);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "accomodation" element
     */
    public org.hl7.fhir.EncounterAccomodation insertNewAccomodation(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.EncounterAccomodation target = null;
            target = (org.hl7.fhir.EncounterAccomodation)get_store().insert_element_user(ACCOMODATION$8, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "accomodation" element
     */
    public org.hl7.fhir.EncounterAccomodation addNewAccomodation()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.EncounterAccomodation target = null;
            target = (org.hl7.fhir.EncounterAccomodation)get_store().add_element_user(ACCOMODATION$8);
            return target;
        }
    }
    
    /**
     * Removes the ith "accomodation" element
     */
    public void removeAccomodation(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(ACCOMODATION$8, i);
        }
    }
    
    /**
     * Gets the "diet" element
     */
    public org.hl7.fhir.CodeableConcept getDiet()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.CodeableConcept target = null;
            target = (org.hl7.fhir.CodeableConcept)get_store().find_element_user(DIET$10, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "diet" element
     */
    public boolean isSetDiet()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(DIET$10) != 0;
        }
    }
    
    /**
     * Sets the "diet" element
     */
    public void setDiet(org.hl7.fhir.CodeableConcept diet)
    {
        generatedSetterHelperImpl(diet, DIET$10, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "diet" element
     */
    public org.hl7.fhir.CodeableConcept addNewDiet()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.CodeableConcept target = null;
            target = (org.hl7.fhir.CodeableConcept)get_store().add_element_user(DIET$10);
            return target;
        }
    }
    
    /**
     * Unsets the "diet" element
     */
    public void unsetDiet()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(DIET$10, 0);
        }
    }
    
    /**
     * Gets array of all "specialCourtesy" elements
     */
    public org.hl7.fhir.CodeableConcept[] getSpecialCourtesyArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(SPECIALCOURTESY$12, targetList);
            org.hl7.fhir.CodeableConcept[] result = new org.hl7.fhir.CodeableConcept[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "specialCourtesy" element
     */
    public org.hl7.fhir.CodeableConcept getSpecialCourtesyArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.CodeableConcept target = null;
            target = (org.hl7.fhir.CodeableConcept)get_store().find_element_user(SPECIALCOURTESY$12, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "specialCourtesy" element
     */
    public int sizeOfSpecialCourtesyArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(SPECIALCOURTESY$12);
        }
    }
    
    /**
     * Sets array of all "specialCourtesy" element  WARNING: This method is not atomicaly synchronized.
     */
    public void setSpecialCourtesyArray(org.hl7.fhir.CodeableConcept[] specialCourtesyArray)
    {
        check_orphaned();
        arraySetterHelper(specialCourtesyArray, SPECIALCOURTESY$12);
    }
    
    /**
     * Sets ith "specialCourtesy" element
     */
    public void setSpecialCourtesyArray(int i, org.hl7.fhir.CodeableConcept specialCourtesy)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.CodeableConcept target = null;
            target = (org.hl7.fhir.CodeableConcept)get_store().find_element_user(SPECIALCOURTESY$12, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(specialCourtesy);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "specialCourtesy" element
     */
    public org.hl7.fhir.CodeableConcept insertNewSpecialCourtesy(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.CodeableConcept target = null;
            target = (org.hl7.fhir.CodeableConcept)get_store().insert_element_user(SPECIALCOURTESY$12, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "specialCourtesy" element
     */
    public org.hl7.fhir.CodeableConcept addNewSpecialCourtesy()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.CodeableConcept target = null;
            target = (org.hl7.fhir.CodeableConcept)get_store().add_element_user(SPECIALCOURTESY$12);
            return target;
        }
    }
    
    /**
     * Removes the ith "specialCourtesy" element
     */
    public void removeSpecialCourtesy(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(SPECIALCOURTESY$12, i);
        }
    }
    
    /**
     * Gets array of all "specialArrangement" elements
     */
    public org.hl7.fhir.CodeableConcept[] getSpecialArrangementArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(SPECIALARRANGEMENT$14, targetList);
            org.hl7.fhir.CodeableConcept[] result = new org.hl7.fhir.CodeableConcept[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "specialArrangement" element
     */
    public org.hl7.fhir.CodeableConcept getSpecialArrangementArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.CodeableConcept target = null;
            target = (org.hl7.fhir.CodeableConcept)get_store().find_element_user(SPECIALARRANGEMENT$14, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "specialArrangement" element
     */
    public int sizeOfSpecialArrangementArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(SPECIALARRANGEMENT$14);
        }
    }
    
    /**
     * Sets array of all "specialArrangement" element  WARNING: This method is not atomicaly synchronized.
     */
    public void setSpecialArrangementArray(org.hl7.fhir.CodeableConcept[] specialArrangementArray)
    {
        check_orphaned();
        arraySetterHelper(specialArrangementArray, SPECIALARRANGEMENT$14);
    }
    
    /**
     * Sets ith "specialArrangement" element
     */
    public void setSpecialArrangementArray(int i, org.hl7.fhir.CodeableConcept specialArrangement)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.CodeableConcept target = null;
            target = (org.hl7.fhir.CodeableConcept)get_store().find_element_user(SPECIALARRANGEMENT$14, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(specialArrangement);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "specialArrangement" element
     */
    public org.hl7.fhir.CodeableConcept insertNewSpecialArrangement(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.CodeableConcept target = null;
            target = (org.hl7.fhir.CodeableConcept)get_store().insert_element_user(SPECIALARRANGEMENT$14, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "specialArrangement" element
     */
    public org.hl7.fhir.CodeableConcept addNewSpecialArrangement()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.CodeableConcept target = null;
            target = (org.hl7.fhir.CodeableConcept)get_store().add_element_user(SPECIALARRANGEMENT$14);
            return target;
        }
    }
    
    /**
     * Removes the ith "specialArrangement" element
     */
    public void removeSpecialArrangement(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(SPECIALARRANGEMENT$14, i);
        }
    }
    
    /**
     * Gets the "destination" element
     */
    public org.hl7.fhir.ResourceReference getDestination()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.ResourceReference target = null;
            target = (org.hl7.fhir.ResourceReference)get_store().find_element_user(DESTINATION$16, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "destination" element
     */
    public boolean isSetDestination()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(DESTINATION$16) != 0;
        }
    }
    
    /**
     * Sets the "destination" element
     */
    public void setDestination(org.hl7.fhir.ResourceReference destination)
    {
        generatedSetterHelperImpl(destination, DESTINATION$16, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "destination" element
     */
    public org.hl7.fhir.ResourceReference addNewDestination()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.ResourceReference target = null;
            target = (org.hl7.fhir.ResourceReference)get_store().add_element_user(DESTINATION$16);
            return target;
        }
    }
    
    /**
     * Unsets the "destination" element
     */
    public void unsetDestination()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(DESTINATION$16, 0);
        }
    }
    
    /**
     * Gets the "dischargeDisposition" element
     */
    public org.hl7.fhir.CodeableConcept getDischargeDisposition()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.CodeableConcept target = null;
            target = (org.hl7.fhir.CodeableConcept)get_store().find_element_user(DISCHARGEDISPOSITION$18, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "dischargeDisposition" element
     */
    public boolean isSetDischargeDisposition()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(DISCHARGEDISPOSITION$18) != 0;
        }
    }
    
    /**
     * Sets the "dischargeDisposition" element
     */
    public void setDischargeDisposition(org.hl7.fhir.CodeableConcept dischargeDisposition)
    {
        generatedSetterHelperImpl(dischargeDisposition, DISCHARGEDISPOSITION$18, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "dischargeDisposition" element
     */
    public org.hl7.fhir.CodeableConcept addNewDischargeDisposition()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.CodeableConcept target = null;
            target = (org.hl7.fhir.CodeableConcept)get_store().add_element_user(DISCHARGEDISPOSITION$18);
            return target;
        }
    }
    
    /**
     * Unsets the "dischargeDisposition" element
     */
    public void unsetDischargeDisposition()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(DISCHARGEDISPOSITION$18, 0);
        }
    }
    
    /**
     * Gets the "dischargeDiagnosis" element
     */
    public org.hl7.fhir.ResourceReference getDischargeDiagnosis()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.ResourceReference target = null;
            target = (org.hl7.fhir.ResourceReference)get_store().find_element_user(DISCHARGEDIAGNOSIS$20, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "dischargeDiagnosis" element
     */
    public boolean isSetDischargeDiagnosis()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(DISCHARGEDIAGNOSIS$20) != 0;
        }
    }
    
    /**
     * Sets the "dischargeDiagnosis" element
     */
    public void setDischargeDiagnosis(org.hl7.fhir.ResourceReference dischargeDiagnosis)
    {
        generatedSetterHelperImpl(dischargeDiagnosis, DISCHARGEDIAGNOSIS$20, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "dischargeDiagnosis" element
     */
    public org.hl7.fhir.ResourceReference addNewDischargeDiagnosis()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.ResourceReference target = null;
            target = (org.hl7.fhir.ResourceReference)get_store().add_element_user(DISCHARGEDIAGNOSIS$20);
            return target;
        }
    }
    
    /**
     * Unsets the "dischargeDiagnosis" element
     */
    public void unsetDischargeDiagnosis()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(DISCHARGEDIAGNOSIS$20, 0);
        }
    }
    
    /**
     * Gets the "reAdmission" element
     */
    public org.hl7.fhir.Boolean getReAdmission()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.Boolean target = null;
            target = (org.hl7.fhir.Boolean)get_store().find_element_user(READMISSION$22, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "reAdmission" element
     */
    public boolean isSetReAdmission()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(READMISSION$22) != 0;
        }
    }
    
    /**
     * Sets the "reAdmission" element
     */
    public void setReAdmission(org.hl7.fhir.Boolean reAdmission)
    {
        generatedSetterHelperImpl(reAdmission, READMISSION$22, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "reAdmission" element
     */
    public org.hl7.fhir.Boolean addNewReAdmission()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.Boolean target = null;
            target = (org.hl7.fhir.Boolean)get_store().add_element_user(READMISSION$22);
            return target;
        }
    }
    
    /**
     * Unsets the "reAdmission" element
     */
    public void unsetReAdmission()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(READMISSION$22, 0);
        }
    }
}
