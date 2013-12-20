/*
 * XML Type:  Resource.Inline
 * Namespace: http://hl7.org/fhir
 * Java type: org.hl7.fhir.ResourceInline
 *
 * Automatically generated - do not modify.
 */
package org.hl7.fhir.impl;
/**
 * An XML Resource.Inline(@http://hl7.org/fhir).
 *
 * This is a complex type.
 */
public class ResourceInlineImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.hl7.fhir.ResourceInline
{
    private static final long serialVersionUID = 1L;
    
    public ResourceInlineImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName BINARY$0 = 
        new javax.xml.namespace.QName("http://hl7.org/fhir", "Binary");
    private static final javax.xml.namespace.QName PROVENANCE$2 = 
        new javax.xml.namespace.QName("http://hl7.org/fhir", "Provenance");
    private static final javax.xml.namespace.QName CONDITION$4 = 
        new javax.xml.namespace.QName("http://hl7.org/fhir", "Condition");
    private static final javax.xml.namespace.QName CAREPLAN$6 = 
        new javax.xml.namespace.QName("http://hl7.org/fhir", "CarePlan");
    private static final javax.xml.namespace.QName SUPPLY$8 = 
        new javax.xml.namespace.QName("http://hl7.org/fhir", "Supply");
    private static final javax.xml.namespace.QName DEVICE$10 = 
        new javax.xml.namespace.QName("http://hl7.org/fhir", "Device");
    private static final javax.xml.namespace.QName QUERY$12 = 
        new javax.xml.namespace.QName("http://hl7.org/fhir", "Query");
    private static final javax.xml.namespace.QName ORDER$14 = 
        new javax.xml.namespace.QName("http://hl7.org/fhir", "Order");
    private static final javax.xml.namespace.QName ORGANIZATION$16 = 
        new javax.xml.namespace.QName("http://hl7.org/fhir", "Organization");
    private static final javax.xml.namespace.QName PROCEDURE$18 = 
        new javax.xml.namespace.QName("http://hl7.org/fhir", "Procedure");
    private static final javax.xml.namespace.QName SUBSTANCE$20 = 
        new javax.xml.namespace.QName("http://hl7.org/fhir", "Substance");
    private static final javax.xml.namespace.QName DIAGNOSTICREPORT$22 = 
        new javax.xml.namespace.QName("http://hl7.org/fhir", "DiagnosticReport");
    private static final javax.xml.namespace.QName GROUP$24 = 
        new javax.xml.namespace.QName("http://hl7.org/fhir", "Group");
    private static final javax.xml.namespace.QName VALUESET$26 = 
        new javax.xml.namespace.QName("http://hl7.org/fhir", "ValueSet");
    private static final javax.xml.namespace.QName MEDICATION$28 = 
        new javax.xml.namespace.QName("http://hl7.org/fhir", "Medication");
    private static final javax.xml.namespace.QName MESSAGEHEADER$30 = 
        new javax.xml.namespace.QName("http://hl7.org/fhir", "MessageHeader");
    private static final javax.xml.namespace.QName IMMUNIZATIONRECOMMENDATION$32 = 
        new javax.xml.namespace.QName("http://hl7.org/fhir", "ImmunizationRecommendation");
    private static final javax.xml.namespace.QName DOCUMENTMANIFEST$34 = 
        new javax.xml.namespace.QName("http://hl7.org/fhir", "DocumentManifest");
    private static final javax.xml.namespace.QName MEDICATIONDISPENSE$36 = 
        new javax.xml.namespace.QName("http://hl7.org/fhir", "MedicationDispense");
    private static final javax.xml.namespace.QName MEDICATIONPRESCRIPTION$38 = 
        new javax.xml.namespace.QName("http://hl7.org/fhir", "MedicationPrescription");
    private static final javax.xml.namespace.QName MEDICATIONADMINISTRATION$40 = 
        new javax.xml.namespace.QName("http://hl7.org/fhir", "MedicationAdministration");
    private static final javax.xml.namespace.QName ENCOUNTER$42 = 
        new javax.xml.namespace.QName("http://hl7.org/fhir", "Encounter");
    private static final javax.xml.namespace.QName SECURITYEVENT$44 = 
        new javax.xml.namespace.QName("http://hl7.org/fhir", "SecurityEvent");
    private static final javax.xml.namespace.QName MEDICATIONSTATEMENT$46 = 
        new javax.xml.namespace.QName("http://hl7.org/fhir", "MedicationStatement");
    private static final javax.xml.namespace.QName LIST$48 = 
        new javax.xml.namespace.QName("http://hl7.org/fhir", "List");
    private static final javax.xml.namespace.QName QUESTIONNAIRE$50 = 
        new javax.xml.namespace.QName("http://hl7.org/fhir", "Questionnaire");
    private static final javax.xml.namespace.QName COMPOSITION$52 = 
        new javax.xml.namespace.QName("http://hl7.org/fhir", "Composition");
    private static final javax.xml.namespace.QName DEVICEOBSERVATIONREPORT$54 = 
        new javax.xml.namespace.QName("http://hl7.org/fhir", "DeviceObservationReport");
    private static final javax.xml.namespace.QName OPERATIONOUTCOME$56 = 
        new javax.xml.namespace.QName("http://hl7.org/fhir", "OperationOutcome");
    private static final javax.xml.namespace.QName CONFORMANCE$58 = 
        new javax.xml.namespace.QName("http://hl7.org/fhir", "Conformance");
    private static final javax.xml.namespace.QName MEDIA$60 = 
        new javax.xml.namespace.QName("http://hl7.org/fhir", "Media");
    private static final javax.xml.namespace.QName FAMILYHISTORY$62 = 
        new javax.xml.namespace.QName("http://hl7.org/fhir", "FamilyHistory");
    private static final javax.xml.namespace.QName OTHER$64 = 
        new javax.xml.namespace.QName("http://hl7.org/fhir", "Other");
    private static final javax.xml.namespace.QName PROFILE$66 = 
        new javax.xml.namespace.QName("http://hl7.org/fhir", "Profile");
    private static final javax.xml.namespace.QName LOCATION$68 = 
        new javax.xml.namespace.QName("http://hl7.org/fhir", "Location");
    private static final javax.xml.namespace.QName OBSERVATION$70 = 
        new javax.xml.namespace.QName("http://hl7.org/fhir", "Observation");
    private static final javax.xml.namespace.QName ALLERGYINTOLERANCE$72 = 
        new javax.xml.namespace.QName("http://hl7.org/fhir", "AllergyIntolerance");
    private static final javax.xml.namespace.QName DOCUMENTREFERENCE$74 = 
        new javax.xml.namespace.QName("http://hl7.org/fhir", "DocumentReference");
    private static final javax.xml.namespace.QName IMMUNIZATION$76 = 
        new javax.xml.namespace.QName("http://hl7.org/fhir", "Immunization");
    private static final javax.xml.namespace.QName RELATEDPERSON$78 = 
        new javax.xml.namespace.QName("http://hl7.org/fhir", "RelatedPerson");
    private static final javax.xml.namespace.QName SPECIMEN$80 = 
        new javax.xml.namespace.QName("http://hl7.org/fhir", "Specimen");
    private static final javax.xml.namespace.QName ORDERRESPONSE$82 = 
        new javax.xml.namespace.QName("http://hl7.org/fhir", "OrderResponse");
    private static final javax.xml.namespace.QName ALERT$84 = 
        new javax.xml.namespace.QName("http://hl7.org/fhir", "Alert");
    private static final javax.xml.namespace.QName CONCEPTMAP$86 = 
        new javax.xml.namespace.QName("http://hl7.org/fhir", "ConceptMap");
    private static final javax.xml.namespace.QName PATIENT$88 = 
        new javax.xml.namespace.QName("http://hl7.org/fhir", "Patient");
    private static final javax.xml.namespace.QName PRACTITIONER$90 = 
        new javax.xml.namespace.QName("http://hl7.org/fhir", "Practitioner");
    private static final javax.xml.namespace.QName ADVERSEREACTION$92 = 
        new javax.xml.namespace.QName("http://hl7.org/fhir", "AdverseReaction");
    private static final javax.xml.namespace.QName IMAGINGSTUDY$94 = 
        new javax.xml.namespace.QName("http://hl7.org/fhir", "ImagingStudy");
    private static final javax.xml.namespace.QName DIAGNOSTICORDER$96 = 
        new javax.xml.namespace.QName("http://hl7.org/fhir", "DiagnosticOrder");
    
    
    /**
     * Gets the "Binary" element
     */
    public org.hl7.fhir.Binary getBinary()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.Binary target = null;
            target = (org.hl7.fhir.Binary)get_store().find_element_user(BINARY$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "Binary" element
     */
    public boolean isSetBinary()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(BINARY$0) != 0;
        }
    }
    
    /**
     * Sets the "Binary" element
     */
    public void setBinary(org.hl7.fhir.Binary binary)
    {
        generatedSetterHelperImpl(binary, BINARY$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "Binary" element
     */
    public org.hl7.fhir.Binary addNewBinary()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.Binary target = null;
            target = (org.hl7.fhir.Binary)get_store().add_element_user(BINARY$0);
            return target;
        }
    }
    
    /**
     * Unsets the "Binary" element
     */
    public void unsetBinary()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(BINARY$0, 0);
        }
    }
    
    /**
     * Gets the "Provenance" element
     */
    public org.hl7.fhir.Provenance getProvenance()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.Provenance target = null;
            target = (org.hl7.fhir.Provenance)get_store().find_element_user(PROVENANCE$2, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "Provenance" element
     */
    public boolean isSetProvenance()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(PROVENANCE$2) != 0;
        }
    }
    
    /**
     * Sets the "Provenance" element
     */
    public void setProvenance(org.hl7.fhir.Provenance provenance)
    {
        generatedSetterHelperImpl(provenance, PROVENANCE$2, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "Provenance" element
     */
    public org.hl7.fhir.Provenance addNewProvenance()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.Provenance target = null;
            target = (org.hl7.fhir.Provenance)get_store().add_element_user(PROVENANCE$2);
            return target;
        }
    }
    
    /**
     * Unsets the "Provenance" element
     */
    public void unsetProvenance()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(PROVENANCE$2, 0);
        }
    }
    
    /**
     * Gets the "Condition" element
     */
    public org.hl7.fhir.Condition getCondition()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.Condition target = null;
            target = (org.hl7.fhir.Condition)get_store().find_element_user(CONDITION$4, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "Condition" element
     */
    public boolean isSetCondition()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(CONDITION$4) != 0;
        }
    }
    
    /**
     * Sets the "Condition" element
     */
    public void setCondition(org.hl7.fhir.Condition condition)
    {
        generatedSetterHelperImpl(condition, CONDITION$4, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "Condition" element
     */
    public org.hl7.fhir.Condition addNewCondition()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.Condition target = null;
            target = (org.hl7.fhir.Condition)get_store().add_element_user(CONDITION$4);
            return target;
        }
    }
    
    /**
     * Unsets the "Condition" element
     */
    public void unsetCondition()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(CONDITION$4, 0);
        }
    }
    
    /**
     * Gets the "CarePlan" element
     */
    public org.hl7.fhir.CarePlan getCarePlan()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.CarePlan target = null;
            target = (org.hl7.fhir.CarePlan)get_store().find_element_user(CAREPLAN$6, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "CarePlan" element
     */
    public boolean isSetCarePlan()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(CAREPLAN$6) != 0;
        }
    }
    
    /**
     * Sets the "CarePlan" element
     */
    public void setCarePlan(org.hl7.fhir.CarePlan carePlan)
    {
        generatedSetterHelperImpl(carePlan, CAREPLAN$6, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "CarePlan" element
     */
    public org.hl7.fhir.CarePlan addNewCarePlan()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.CarePlan target = null;
            target = (org.hl7.fhir.CarePlan)get_store().add_element_user(CAREPLAN$6);
            return target;
        }
    }
    
    /**
     * Unsets the "CarePlan" element
     */
    public void unsetCarePlan()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(CAREPLAN$6, 0);
        }
    }
    
    /**
     * Gets the "Supply" element
     */
    public org.hl7.fhir.Supply getSupply()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.Supply target = null;
            target = (org.hl7.fhir.Supply)get_store().find_element_user(SUPPLY$8, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "Supply" element
     */
    public boolean isSetSupply()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(SUPPLY$8) != 0;
        }
    }
    
    /**
     * Sets the "Supply" element
     */
    public void setSupply(org.hl7.fhir.Supply supply)
    {
        generatedSetterHelperImpl(supply, SUPPLY$8, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "Supply" element
     */
    public org.hl7.fhir.Supply addNewSupply()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.Supply target = null;
            target = (org.hl7.fhir.Supply)get_store().add_element_user(SUPPLY$8);
            return target;
        }
    }
    
    /**
     * Unsets the "Supply" element
     */
    public void unsetSupply()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(SUPPLY$8, 0);
        }
    }
    
    /**
     * Gets the "Device" element
     */
    public org.hl7.fhir.Device getDevice()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.Device target = null;
            target = (org.hl7.fhir.Device)get_store().find_element_user(DEVICE$10, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "Device" element
     */
    public boolean isSetDevice()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(DEVICE$10) != 0;
        }
    }
    
    /**
     * Sets the "Device" element
     */
    public void setDevice(org.hl7.fhir.Device device)
    {
        generatedSetterHelperImpl(device, DEVICE$10, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "Device" element
     */
    public org.hl7.fhir.Device addNewDevice()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.Device target = null;
            target = (org.hl7.fhir.Device)get_store().add_element_user(DEVICE$10);
            return target;
        }
    }
    
    /**
     * Unsets the "Device" element
     */
    public void unsetDevice()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(DEVICE$10, 0);
        }
    }
    
    /**
     * Gets the "Query" element
     */
    public org.hl7.fhir.Query getQuery()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.Query target = null;
            target = (org.hl7.fhir.Query)get_store().find_element_user(QUERY$12, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "Query" element
     */
    public boolean isSetQuery()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(QUERY$12) != 0;
        }
    }
    
    /**
     * Sets the "Query" element
     */
    public void setQuery(org.hl7.fhir.Query query)
    {
        generatedSetterHelperImpl(query, QUERY$12, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "Query" element
     */
    public org.hl7.fhir.Query addNewQuery()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.Query target = null;
            target = (org.hl7.fhir.Query)get_store().add_element_user(QUERY$12);
            return target;
        }
    }
    
    /**
     * Unsets the "Query" element
     */
    public void unsetQuery()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(QUERY$12, 0);
        }
    }
    
    /**
     * Gets the "Order" element
     */
    public org.hl7.fhir.Order getOrder()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.Order target = null;
            target = (org.hl7.fhir.Order)get_store().find_element_user(ORDER$14, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "Order" element
     */
    public boolean isSetOrder()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(ORDER$14) != 0;
        }
    }
    
    /**
     * Sets the "Order" element
     */
    public void setOrder(org.hl7.fhir.Order order)
    {
        generatedSetterHelperImpl(order, ORDER$14, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "Order" element
     */
    public org.hl7.fhir.Order addNewOrder()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.Order target = null;
            target = (org.hl7.fhir.Order)get_store().add_element_user(ORDER$14);
            return target;
        }
    }
    
    /**
     * Unsets the "Order" element
     */
    public void unsetOrder()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(ORDER$14, 0);
        }
    }
    
    /**
     * Gets the "Organization" element
     */
    public org.hl7.fhir.Organization getOrganization()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.Organization target = null;
            target = (org.hl7.fhir.Organization)get_store().find_element_user(ORGANIZATION$16, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "Organization" element
     */
    public boolean isSetOrganization()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(ORGANIZATION$16) != 0;
        }
    }
    
    /**
     * Sets the "Organization" element
     */
    public void setOrganization(org.hl7.fhir.Organization organization)
    {
        generatedSetterHelperImpl(organization, ORGANIZATION$16, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "Organization" element
     */
    public org.hl7.fhir.Organization addNewOrganization()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.Organization target = null;
            target = (org.hl7.fhir.Organization)get_store().add_element_user(ORGANIZATION$16);
            return target;
        }
    }
    
    /**
     * Unsets the "Organization" element
     */
    public void unsetOrganization()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(ORGANIZATION$16, 0);
        }
    }
    
    /**
     * Gets the "Procedure" element
     */
    public org.hl7.fhir.Procedure getProcedure()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.Procedure target = null;
            target = (org.hl7.fhir.Procedure)get_store().find_element_user(PROCEDURE$18, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "Procedure" element
     */
    public boolean isSetProcedure()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(PROCEDURE$18) != 0;
        }
    }
    
    /**
     * Sets the "Procedure" element
     */
    public void setProcedure(org.hl7.fhir.Procedure procedure)
    {
        generatedSetterHelperImpl(procedure, PROCEDURE$18, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "Procedure" element
     */
    public org.hl7.fhir.Procedure addNewProcedure()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.Procedure target = null;
            target = (org.hl7.fhir.Procedure)get_store().add_element_user(PROCEDURE$18);
            return target;
        }
    }
    
    /**
     * Unsets the "Procedure" element
     */
    public void unsetProcedure()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(PROCEDURE$18, 0);
        }
    }
    
    /**
     * Gets the "Substance" element
     */
    public org.hl7.fhir.Substance getSubstance()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.Substance target = null;
            target = (org.hl7.fhir.Substance)get_store().find_element_user(SUBSTANCE$20, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "Substance" element
     */
    public boolean isSetSubstance()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(SUBSTANCE$20) != 0;
        }
    }
    
    /**
     * Sets the "Substance" element
     */
    public void setSubstance(org.hl7.fhir.Substance substance)
    {
        generatedSetterHelperImpl(substance, SUBSTANCE$20, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "Substance" element
     */
    public org.hl7.fhir.Substance addNewSubstance()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.Substance target = null;
            target = (org.hl7.fhir.Substance)get_store().add_element_user(SUBSTANCE$20);
            return target;
        }
    }
    
    /**
     * Unsets the "Substance" element
     */
    public void unsetSubstance()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(SUBSTANCE$20, 0);
        }
    }
    
    /**
     * Gets the "DiagnosticReport" element
     */
    public org.hl7.fhir.DiagnosticReport getDiagnosticReport()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.DiagnosticReport target = null;
            target = (org.hl7.fhir.DiagnosticReport)get_store().find_element_user(DIAGNOSTICREPORT$22, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "DiagnosticReport" element
     */
    public boolean isSetDiagnosticReport()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(DIAGNOSTICREPORT$22) != 0;
        }
    }
    
    /**
     * Sets the "DiagnosticReport" element
     */
    public void setDiagnosticReport(org.hl7.fhir.DiagnosticReport diagnosticReport)
    {
        generatedSetterHelperImpl(diagnosticReport, DIAGNOSTICREPORT$22, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "DiagnosticReport" element
     */
    public org.hl7.fhir.DiagnosticReport addNewDiagnosticReport()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.DiagnosticReport target = null;
            target = (org.hl7.fhir.DiagnosticReport)get_store().add_element_user(DIAGNOSTICREPORT$22);
            return target;
        }
    }
    
    /**
     * Unsets the "DiagnosticReport" element
     */
    public void unsetDiagnosticReport()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(DIAGNOSTICREPORT$22, 0);
        }
    }
    
    /**
     * Gets the "Group" element
     */
    public org.hl7.fhir.Group getGroup()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.Group target = null;
            target = (org.hl7.fhir.Group)get_store().find_element_user(GROUP$24, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "Group" element
     */
    public boolean isSetGroup()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(GROUP$24) != 0;
        }
    }
    
    /**
     * Sets the "Group" element
     */
    public void setGroup(org.hl7.fhir.Group group)
    {
        generatedSetterHelperImpl(group, GROUP$24, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "Group" element
     */
    public org.hl7.fhir.Group addNewGroup()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.Group target = null;
            target = (org.hl7.fhir.Group)get_store().add_element_user(GROUP$24);
            return target;
        }
    }
    
    /**
     * Unsets the "Group" element
     */
    public void unsetGroup()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(GROUP$24, 0);
        }
    }
    
    /**
     * Gets the "ValueSet" element
     */
    public org.hl7.fhir.ValueSet getValueSet()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.ValueSet target = null;
            target = (org.hl7.fhir.ValueSet)get_store().find_element_user(VALUESET$26, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "ValueSet" element
     */
    public boolean isSetValueSet()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(VALUESET$26) != 0;
        }
    }
    
    /**
     * Sets the "ValueSet" element
     */
    public void setValueSet(org.hl7.fhir.ValueSet valueSet)
    {
        generatedSetterHelperImpl(valueSet, VALUESET$26, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "ValueSet" element
     */
    public org.hl7.fhir.ValueSet addNewValueSet()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.ValueSet target = null;
            target = (org.hl7.fhir.ValueSet)get_store().add_element_user(VALUESET$26);
            return target;
        }
    }
    
    /**
     * Unsets the "ValueSet" element
     */
    public void unsetValueSet()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(VALUESET$26, 0);
        }
    }
    
    /**
     * Gets the "Medication" element
     */
    public org.hl7.fhir.Medication getMedication()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.Medication target = null;
            target = (org.hl7.fhir.Medication)get_store().find_element_user(MEDICATION$28, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "Medication" element
     */
    public boolean isSetMedication()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(MEDICATION$28) != 0;
        }
    }
    
    /**
     * Sets the "Medication" element
     */
    public void setMedication(org.hl7.fhir.Medication medication)
    {
        generatedSetterHelperImpl(medication, MEDICATION$28, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "Medication" element
     */
    public org.hl7.fhir.Medication addNewMedication()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.Medication target = null;
            target = (org.hl7.fhir.Medication)get_store().add_element_user(MEDICATION$28);
            return target;
        }
    }
    
    /**
     * Unsets the "Medication" element
     */
    public void unsetMedication()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(MEDICATION$28, 0);
        }
    }
    
    /**
     * Gets the "MessageHeader" element
     */
    public org.hl7.fhir.MessageHeader getMessageHeader()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.MessageHeader target = null;
            target = (org.hl7.fhir.MessageHeader)get_store().find_element_user(MESSAGEHEADER$30, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "MessageHeader" element
     */
    public boolean isSetMessageHeader()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(MESSAGEHEADER$30) != 0;
        }
    }
    
    /**
     * Sets the "MessageHeader" element
     */
    public void setMessageHeader(org.hl7.fhir.MessageHeader messageHeader)
    {
        generatedSetterHelperImpl(messageHeader, MESSAGEHEADER$30, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "MessageHeader" element
     */
    public org.hl7.fhir.MessageHeader addNewMessageHeader()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.MessageHeader target = null;
            target = (org.hl7.fhir.MessageHeader)get_store().add_element_user(MESSAGEHEADER$30);
            return target;
        }
    }
    
    /**
     * Unsets the "MessageHeader" element
     */
    public void unsetMessageHeader()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(MESSAGEHEADER$30, 0);
        }
    }
    
    /**
     * Gets the "ImmunizationRecommendation" element
     */
    public org.hl7.fhir.ImmunizationRecommendation getImmunizationRecommendation()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.ImmunizationRecommendation target = null;
            target = (org.hl7.fhir.ImmunizationRecommendation)get_store().find_element_user(IMMUNIZATIONRECOMMENDATION$32, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "ImmunizationRecommendation" element
     */
    public boolean isSetImmunizationRecommendation()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(IMMUNIZATIONRECOMMENDATION$32) != 0;
        }
    }
    
    /**
     * Sets the "ImmunizationRecommendation" element
     */
    public void setImmunizationRecommendation(org.hl7.fhir.ImmunizationRecommendation immunizationRecommendation)
    {
        generatedSetterHelperImpl(immunizationRecommendation, IMMUNIZATIONRECOMMENDATION$32, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "ImmunizationRecommendation" element
     */
    public org.hl7.fhir.ImmunizationRecommendation addNewImmunizationRecommendation()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.ImmunizationRecommendation target = null;
            target = (org.hl7.fhir.ImmunizationRecommendation)get_store().add_element_user(IMMUNIZATIONRECOMMENDATION$32);
            return target;
        }
    }
    
    /**
     * Unsets the "ImmunizationRecommendation" element
     */
    public void unsetImmunizationRecommendation()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(IMMUNIZATIONRECOMMENDATION$32, 0);
        }
    }
    
    /**
     * Gets the "DocumentManifest" element
     */
    public org.hl7.fhir.DocumentManifest getDocumentManifest()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.DocumentManifest target = null;
            target = (org.hl7.fhir.DocumentManifest)get_store().find_element_user(DOCUMENTMANIFEST$34, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "DocumentManifest" element
     */
    public boolean isSetDocumentManifest()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(DOCUMENTMANIFEST$34) != 0;
        }
    }
    
    /**
     * Sets the "DocumentManifest" element
     */
    public void setDocumentManifest(org.hl7.fhir.DocumentManifest documentManifest)
    {
        generatedSetterHelperImpl(documentManifest, DOCUMENTMANIFEST$34, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "DocumentManifest" element
     */
    public org.hl7.fhir.DocumentManifest addNewDocumentManifest()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.DocumentManifest target = null;
            target = (org.hl7.fhir.DocumentManifest)get_store().add_element_user(DOCUMENTMANIFEST$34);
            return target;
        }
    }
    
    /**
     * Unsets the "DocumentManifest" element
     */
    public void unsetDocumentManifest()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(DOCUMENTMANIFEST$34, 0);
        }
    }
    
    /**
     * Gets the "MedicationDispense" element
     */
    public org.hl7.fhir.MedicationDispense getMedicationDispense()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.MedicationDispense target = null;
            target = (org.hl7.fhir.MedicationDispense)get_store().find_element_user(MEDICATIONDISPENSE$36, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "MedicationDispense" element
     */
    public boolean isSetMedicationDispense()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(MEDICATIONDISPENSE$36) != 0;
        }
    }
    
    /**
     * Sets the "MedicationDispense" element
     */
    public void setMedicationDispense(org.hl7.fhir.MedicationDispense medicationDispense)
    {
        generatedSetterHelperImpl(medicationDispense, MEDICATIONDISPENSE$36, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "MedicationDispense" element
     */
    public org.hl7.fhir.MedicationDispense addNewMedicationDispense()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.MedicationDispense target = null;
            target = (org.hl7.fhir.MedicationDispense)get_store().add_element_user(MEDICATIONDISPENSE$36);
            return target;
        }
    }
    
    /**
     * Unsets the "MedicationDispense" element
     */
    public void unsetMedicationDispense()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(MEDICATIONDISPENSE$36, 0);
        }
    }
    
    /**
     * Gets the "MedicationPrescription" element
     */
    public org.hl7.fhir.MedicationPrescription getMedicationPrescription()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.MedicationPrescription target = null;
            target = (org.hl7.fhir.MedicationPrescription)get_store().find_element_user(MEDICATIONPRESCRIPTION$38, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "MedicationPrescription" element
     */
    public boolean isSetMedicationPrescription()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(MEDICATIONPRESCRIPTION$38) != 0;
        }
    }
    
    /**
     * Sets the "MedicationPrescription" element
     */
    public void setMedicationPrescription(org.hl7.fhir.MedicationPrescription medicationPrescription)
    {
        generatedSetterHelperImpl(medicationPrescription, MEDICATIONPRESCRIPTION$38, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "MedicationPrescription" element
     */
    public org.hl7.fhir.MedicationPrescription addNewMedicationPrescription()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.MedicationPrescription target = null;
            target = (org.hl7.fhir.MedicationPrescription)get_store().add_element_user(MEDICATIONPRESCRIPTION$38);
            return target;
        }
    }
    
    /**
     * Unsets the "MedicationPrescription" element
     */
    public void unsetMedicationPrescription()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(MEDICATIONPRESCRIPTION$38, 0);
        }
    }
    
    /**
     * Gets the "MedicationAdministration" element
     */
    public org.hl7.fhir.MedicationAdministration getMedicationAdministration()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.MedicationAdministration target = null;
            target = (org.hl7.fhir.MedicationAdministration)get_store().find_element_user(MEDICATIONADMINISTRATION$40, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "MedicationAdministration" element
     */
    public boolean isSetMedicationAdministration()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(MEDICATIONADMINISTRATION$40) != 0;
        }
    }
    
    /**
     * Sets the "MedicationAdministration" element
     */
    public void setMedicationAdministration(org.hl7.fhir.MedicationAdministration medicationAdministration)
    {
        generatedSetterHelperImpl(medicationAdministration, MEDICATIONADMINISTRATION$40, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "MedicationAdministration" element
     */
    public org.hl7.fhir.MedicationAdministration addNewMedicationAdministration()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.MedicationAdministration target = null;
            target = (org.hl7.fhir.MedicationAdministration)get_store().add_element_user(MEDICATIONADMINISTRATION$40);
            return target;
        }
    }
    
    /**
     * Unsets the "MedicationAdministration" element
     */
    public void unsetMedicationAdministration()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(MEDICATIONADMINISTRATION$40, 0);
        }
    }
    
    /**
     * Gets the "Encounter" element
     */
    public org.hl7.fhir.Encounter getEncounter()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.Encounter target = null;
            target = (org.hl7.fhir.Encounter)get_store().find_element_user(ENCOUNTER$42, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "Encounter" element
     */
    public boolean isSetEncounter()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(ENCOUNTER$42) != 0;
        }
    }
    
    /**
     * Sets the "Encounter" element
     */
    public void setEncounter(org.hl7.fhir.Encounter encounter)
    {
        generatedSetterHelperImpl(encounter, ENCOUNTER$42, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "Encounter" element
     */
    public org.hl7.fhir.Encounter addNewEncounter()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.Encounter target = null;
            target = (org.hl7.fhir.Encounter)get_store().add_element_user(ENCOUNTER$42);
            return target;
        }
    }
    
    /**
     * Unsets the "Encounter" element
     */
    public void unsetEncounter()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(ENCOUNTER$42, 0);
        }
    }
    
    /**
     * Gets the "SecurityEvent" element
     */
    public org.hl7.fhir.SecurityEvent getSecurityEvent()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.SecurityEvent target = null;
            target = (org.hl7.fhir.SecurityEvent)get_store().find_element_user(SECURITYEVENT$44, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "SecurityEvent" element
     */
    public boolean isSetSecurityEvent()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(SECURITYEVENT$44) != 0;
        }
    }
    
    /**
     * Sets the "SecurityEvent" element
     */
    public void setSecurityEvent(org.hl7.fhir.SecurityEvent securityEvent)
    {
        generatedSetterHelperImpl(securityEvent, SECURITYEVENT$44, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "SecurityEvent" element
     */
    public org.hl7.fhir.SecurityEvent addNewSecurityEvent()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.SecurityEvent target = null;
            target = (org.hl7.fhir.SecurityEvent)get_store().add_element_user(SECURITYEVENT$44);
            return target;
        }
    }
    
    /**
     * Unsets the "SecurityEvent" element
     */
    public void unsetSecurityEvent()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(SECURITYEVENT$44, 0);
        }
    }
    
    /**
     * Gets the "MedicationStatement" element
     */
    public org.hl7.fhir.MedicationStatement getMedicationStatement()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.MedicationStatement target = null;
            target = (org.hl7.fhir.MedicationStatement)get_store().find_element_user(MEDICATIONSTATEMENT$46, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "MedicationStatement" element
     */
    public boolean isSetMedicationStatement()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(MEDICATIONSTATEMENT$46) != 0;
        }
    }
    
    /**
     * Sets the "MedicationStatement" element
     */
    public void setMedicationStatement(org.hl7.fhir.MedicationStatement medicationStatement)
    {
        generatedSetterHelperImpl(medicationStatement, MEDICATIONSTATEMENT$46, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "MedicationStatement" element
     */
    public org.hl7.fhir.MedicationStatement addNewMedicationStatement()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.MedicationStatement target = null;
            target = (org.hl7.fhir.MedicationStatement)get_store().add_element_user(MEDICATIONSTATEMENT$46);
            return target;
        }
    }
    
    /**
     * Unsets the "MedicationStatement" element
     */
    public void unsetMedicationStatement()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(MEDICATIONSTATEMENT$46, 0);
        }
    }
    
    /**
     * Gets the "List" element
     */
    public org.hl7.fhir.List getList()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.List target = null;
            target = (org.hl7.fhir.List)get_store().find_element_user(LIST$48, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "List" element
     */
    public boolean isSetList()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(LIST$48) != 0;
        }
    }
    
    /**
     * Sets the "List" element
     */
    public void setList(org.hl7.fhir.List list)
    {
        generatedSetterHelperImpl(list, LIST$48, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "List" element
     */
    public org.hl7.fhir.List addNewList()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.List target = null;
            target = (org.hl7.fhir.List)get_store().add_element_user(LIST$48);
            return target;
        }
    }
    
    /**
     * Unsets the "List" element
     */
    public void unsetList()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(LIST$48, 0);
        }
    }
    
    /**
     * Gets the "Questionnaire" element
     */
    public org.hl7.fhir.Questionnaire getQuestionnaire()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.Questionnaire target = null;
            target = (org.hl7.fhir.Questionnaire)get_store().find_element_user(QUESTIONNAIRE$50, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "Questionnaire" element
     */
    public boolean isSetQuestionnaire()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(QUESTIONNAIRE$50) != 0;
        }
    }
    
    /**
     * Sets the "Questionnaire" element
     */
    public void setQuestionnaire(org.hl7.fhir.Questionnaire questionnaire)
    {
        generatedSetterHelperImpl(questionnaire, QUESTIONNAIRE$50, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "Questionnaire" element
     */
    public org.hl7.fhir.Questionnaire addNewQuestionnaire()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.Questionnaire target = null;
            target = (org.hl7.fhir.Questionnaire)get_store().add_element_user(QUESTIONNAIRE$50);
            return target;
        }
    }
    
    /**
     * Unsets the "Questionnaire" element
     */
    public void unsetQuestionnaire()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(QUESTIONNAIRE$50, 0);
        }
    }
    
    /**
     * Gets the "Composition" element
     */
    public org.hl7.fhir.Composition getComposition()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.Composition target = null;
            target = (org.hl7.fhir.Composition)get_store().find_element_user(COMPOSITION$52, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "Composition" element
     */
    public boolean isSetComposition()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(COMPOSITION$52) != 0;
        }
    }
    
    /**
     * Sets the "Composition" element
     */
    public void setComposition(org.hl7.fhir.Composition composition)
    {
        generatedSetterHelperImpl(composition, COMPOSITION$52, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "Composition" element
     */
    public org.hl7.fhir.Composition addNewComposition()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.Composition target = null;
            target = (org.hl7.fhir.Composition)get_store().add_element_user(COMPOSITION$52);
            return target;
        }
    }
    
    /**
     * Unsets the "Composition" element
     */
    public void unsetComposition()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(COMPOSITION$52, 0);
        }
    }
    
    /**
     * Gets the "DeviceObservationReport" element
     */
    public org.hl7.fhir.DeviceObservationReport getDeviceObservationReport()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.DeviceObservationReport target = null;
            target = (org.hl7.fhir.DeviceObservationReport)get_store().find_element_user(DEVICEOBSERVATIONREPORT$54, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "DeviceObservationReport" element
     */
    public boolean isSetDeviceObservationReport()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(DEVICEOBSERVATIONREPORT$54) != 0;
        }
    }
    
    /**
     * Sets the "DeviceObservationReport" element
     */
    public void setDeviceObservationReport(org.hl7.fhir.DeviceObservationReport deviceObservationReport)
    {
        generatedSetterHelperImpl(deviceObservationReport, DEVICEOBSERVATIONREPORT$54, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "DeviceObservationReport" element
     */
    public org.hl7.fhir.DeviceObservationReport addNewDeviceObservationReport()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.DeviceObservationReport target = null;
            target = (org.hl7.fhir.DeviceObservationReport)get_store().add_element_user(DEVICEOBSERVATIONREPORT$54);
            return target;
        }
    }
    
    /**
     * Unsets the "DeviceObservationReport" element
     */
    public void unsetDeviceObservationReport()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(DEVICEOBSERVATIONREPORT$54, 0);
        }
    }
    
    /**
     * Gets the "OperationOutcome" element
     */
    public org.hl7.fhir.OperationOutcome getOperationOutcome()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.OperationOutcome target = null;
            target = (org.hl7.fhir.OperationOutcome)get_store().find_element_user(OPERATIONOUTCOME$56, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "OperationOutcome" element
     */
    public boolean isSetOperationOutcome()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(OPERATIONOUTCOME$56) != 0;
        }
    }
    
    /**
     * Sets the "OperationOutcome" element
     */
    public void setOperationOutcome(org.hl7.fhir.OperationOutcome operationOutcome)
    {
        generatedSetterHelperImpl(operationOutcome, OPERATIONOUTCOME$56, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "OperationOutcome" element
     */
    public org.hl7.fhir.OperationOutcome addNewOperationOutcome()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.OperationOutcome target = null;
            target = (org.hl7.fhir.OperationOutcome)get_store().add_element_user(OPERATIONOUTCOME$56);
            return target;
        }
    }
    
    /**
     * Unsets the "OperationOutcome" element
     */
    public void unsetOperationOutcome()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(OPERATIONOUTCOME$56, 0);
        }
    }
    
    /**
     * Gets the "Conformance" element
     */
    public org.hl7.fhir.Conformance getConformance()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.Conformance target = null;
            target = (org.hl7.fhir.Conformance)get_store().find_element_user(CONFORMANCE$58, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "Conformance" element
     */
    public boolean isSetConformance()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(CONFORMANCE$58) != 0;
        }
    }
    
    /**
     * Sets the "Conformance" element
     */
    public void setConformance(org.hl7.fhir.Conformance conformance)
    {
        generatedSetterHelperImpl(conformance, CONFORMANCE$58, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "Conformance" element
     */
    public org.hl7.fhir.Conformance addNewConformance()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.Conformance target = null;
            target = (org.hl7.fhir.Conformance)get_store().add_element_user(CONFORMANCE$58);
            return target;
        }
    }
    
    /**
     * Unsets the "Conformance" element
     */
    public void unsetConformance()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(CONFORMANCE$58, 0);
        }
    }
    
    /**
     * Gets the "Media" element
     */
    public org.hl7.fhir.Media getMedia()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.Media target = null;
            target = (org.hl7.fhir.Media)get_store().find_element_user(MEDIA$60, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "Media" element
     */
    public boolean isSetMedia()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(MEDIA$60) != 0;
        }
    }
    
    /**
     * Sets the "Media" element
     */
    public void setMedia(org.hl7.fhir.Media media)
    {
        generatedSetterHelperImpl(media, MEDIA$60, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "Media" element
     */
    public org.hl7.fhir.Media addNewMedia()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.Media target = null;
            target = (org.hl7.fhir.Media)get_store().add_element_user(MEDIA$60);
            return target;
        }
    }
    
    /**
     * Unsets the "Media" element
     */
    public void unsetMedia()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(MEDIA$60, 0);
        }
    }
    
    /**
     * Gets the "FamilyHistory" element
     */
    public org.hl7.fhir.FamilyHistory getFamilyHistory()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.FamilyHistory target = null;
            target = (org.hl7.fhir.FamilyHistory)get_store().find_element_user(FAMILYHISTORY$62, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "FamilyHistory" element
     */
    public boolean isSetFamilyHistory()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(FAMILYHISTORY$62) != 0;
        }
    }
    
    /**
     * Sets the "FamilyHistory" element
     */
    public void setFamilyHistory(org.hl7.fhir.FamilyHistory familyHistory)
    {
        generatedSetterHelperImpl(familyHistory, FAMILYHISTORY$62, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "FamilyHistory" element
     */
    public org.hl7.fhir.FamilyHistory addNewFamilyHistory()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.FamilyHistory target = null;
            target = (org.hl7.fhir.FamilyHistory)get_store().add_element_user(FAMILYHISTORY$62);
            return target;
        }
    }
    
    /**
     * Unsets the "FamilyHistory" element
     */
    public void unsetFamilyHistory()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(FAMILYHISTORY$62, 0);
        }
    }
    
    /**
     * Gets the "Other" element
     */
    public org.hl7.fhir.Other getOther()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.Other target = null;
            target = (org.hl7.fhir.Other)get_store().find_element_user(OTHER$64, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "Other" element
     */
    public boolean isSetOther()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(OTHER$64) != 0;
        }
    }
    
    /**
     * Sets the "Other" element
     */
    public void setOther(org.hl7.fhir.Other other)
    {
        generatedSetterHelperImpl(other, OTHER$64, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "Other" element
     */
    public org.hl7.fhir.Other addNewOther()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.Other target = null;
            target = (org.hl7.fhir.Other)get_store().add_element_user(OTHER$64);
            return target;
        }
    }
    
    /**
     * Unsets the "Other" element
     */
    public void unsetOther()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(OTHER$64, 0);
        }
    }
    
    /**
     * Gets the "Profile" element
     */
    public org.hl7.fhir.Profile getProfile()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.Profile target = null;
            target = (org.hl7.fhir.Profile)get_store().find_element_user(PROFILE$66, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "Profile" element
     */
    public boolean isSetProfile()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(PROFILE$66) != 0;
        }
    }
    
    /**
     * Sets the "Profile" element
     */
    public void setProfile(org.hl7.fhir.Profile profile)
    {
        generatedSetterHelperImpl(profile, PROFILE$66, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "Profile" element
     */
    public org.hl7.fhir.Profile addNewProfile()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.Profile target = null;
            target = (org.hl7.fhir.Profile)get_store().add_element_user(PROFILE$66);
            return target;
        }
    }
    
    /**
     * Unsets the "Profile" element
     */
    public void unsetProfile()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(PROFILE$66, 0);
        }
    }
    
    /**
     * Gets the "Location" element
     */
    public org.hl7.fhir.Location getLocation()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.Location target = null;
            target = (org.hl7.fhir.Location)get_store().find_element_user(LOCATION$68, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "Location" element
     */
    public boolean isSetLocation()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(LOCATION$68) != 0;
        }
    }
    
    /**
     * Sets the "Location" element
     */
    public void setLocation(org.hl7.fhir.Location location)
    {
        generatedSetterHelperImpl(location, LOCATION$68, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "Location" element
     */
    public org.hl7.fhir.Location addNewLocation()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.Location target = null;
            target = (org.hl7.fhir.Location)get_store().add_element_user(LOCATION$68);
            return target;
        }
    }
    
    /**
     * Unsets the "Location" element
     */
    public void unsetLocation()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(LOCATION$68, 0);
        }
    }
    
    /**
     * Gets the "Observation" element
     */
    public org.hl7.fhir.Observation getObservation()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.Observation target = null;
            target = (org.hl7.fhir.Observation)get_store().find_element_user(OBSERVATION$70, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "Observation" element
     */
    public boolean isSetObservation()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(OBSERVATION$70) != 0;
        }
    }
    
    /**
     * Sets the "Observation" element
     */
    public void setObservation(org.hl7.fhir.Observation observation)
    {
        generatedSetterHelperImpl(observation, OBSERVATION$70, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "Observation" element
     */
    public org.hl7.fhir.Observation addNewObservation()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.Observation target = null;
            target = (org.hl7.fhir.Observation)get_store().add_element_user(OBSERVATION$70);
            return target;
        }
    }
    
    /**
     * Unsets the "Observation" element
     */
    public void unsetObservation()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(OBSERVATION$70, 0);
        }
    }
    
    /**
     * Gets the "AllergyIntolerance" element
     */
    public org.hl7.fhir.AllergyIntolerance getAllergyIntolerance()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.AllergyIntolerance target = null;
            target = (org.hl7.fhir.AllergyIntolerance)get_store().find_element_user(ALLERGYINTOLERANCE$72, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "AllergyIntolerance" element
     */
    public boolean isSetAllergyIntolerance()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(ALLERGYINTOLERANCE$72) != 0;
        }
    }
    
    /**
     * Sets the "AllergyIntolerance" element
     */
    public void setAllergyIntolerance(org.hl7.fhir.AllergyIntolerance allergyIntolerance)
    {
        generatedSetterHelperImpl(allergyIntolerance, ALLERGYINTOLERANCE$72, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "AllergyIntolerance" element
     */
    public org.hl7.fhir.AllergyIntolerance addNewAllergyIntolerance()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.AllergyIntolerance target = null;
            target = (org.hl7.fhir.AllergyIntolerance)get_store().add_element_user(ALLERGYINTOLERANCE$72);
            return target;
        }
    }
    
    /**
     * Unsets the "AllergyIntolerance" element
     */
    public void unsetAllergyIntolerance()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(ALLERGYINTOLERANCE$72, 0);
        }
    }
    
    /**
     * Gets the "DocumentReference" element
     */
    public org.hl7.fhir.DocumentReference getDocumentReference()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.DocumentReference target = null;
            target = (org.hl7.fhir.DocumentReference)get_store().find_element_user(DOCUMENTREFERENCE$74, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "DocumentReference" element
     */
    public boolean isSetDocumentReference()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(DOCUMENTREFERENCE$74) != 0;
        }
    }
    
    /**
     * Sets the "DocumentReference" element
     */
    public void setDocumentReference(org.hl7.fhir.DocumentReference documentReference)
    {
        generatedSetterHelperImpl(documentReference, DOCUMENTREFERENCE$74, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "DocumentReference" element
     */
    public org.hl7.fhir.DocumentReference addNewDocumentReference()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.DocumentReference target = null;
            target = (org.hl7.fhir.DocumentReference)get_store().add_element_user(DOCUMENTREFERENCE$74);
            return target;
        }
    }
    
    /**
     * Unsets the "DocumentReference" element
     */
    public void unsetDocumentReference()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(DOCUMENTREFERENCE$74, 0);
        }
    }
    
    /**
     * Gets the "Immunization" element
     */
    public org.hl7.fhir.Immunization getImmunization()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.Immunization target = null;
            target = (org.hl7.fhir.Immunization)get_store().find_element_user(IMMUNIZATION$76, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "Immunization" element
     */
    public boolean isSetImmunization()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(IMMUNIZATION$76) != 0;
        }
    }
    
    /**
     * Sets the "Immunization" element
     */
    public void setImmunization(org.hl7.fhir.Immunization immunization)
    {
        generatedSetterHelperImpl(immunization, IMMUNIZATION$76, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "Immunization" element
     */
    public org.hl7.fhir.Immunization addNewImmunization()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.Immunization target = null;
            target = (org.hl7.fhir.Immunization)get_store().add_element_user(IMMUNIZATION$76);
            return target;
        }
    }
    
    /**
     * Unsets the "Immunization" element
     */
    public void unsetImmunization()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(IMMUNIZATION$76, 0);
        }
    }
    
    /**
     * Gets the "RelatedPerson" element
     */
    public org.hl7.fhir.RelatedPerson getRelatedPerson()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.RelatedPerson target = null;
            target = (org.hl7.fhir.RelatedPerson)get_store().find_element_user(RELATEDPERSON$78, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "RelatedPerson" element
     */
    public boolean isSetRelatedPerson()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(RELATEDPERSON$78) != 0;
        }
    }
    
    /**
     * Sets the "RelatedPerson" element
     */
    public void setRelatedPerson(org.hl7.fhir.RelatedPerson relatedPerson)
    {
        generatedSetterHelperImpl(relatedPerson, RELATEDPERSON$78, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "RelatedPerson" element
     */
    public org.hl7.fhir.RelatedPerson addNewRelatedPerson()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.RelatedPerson target = null;
            target = (org.hl7.fhir.RelatedPerson)get_store().add_element_user(RELATEDPERSON$78);
            return target;
        }
    }
    
    /**
     * Unsets the "RelatedPerson" element
     */
    public void unsetRelatedPerson()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(RELATEDPERSON$78, 0);
        }
    }
    
    /**
     * Gets the "Specimen" element
     */
    public org.hl7.fhir.Specimen getSpecimen()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.Specimen target = null;
            target = (org.hl7.fhir.Specimen)get_store().find_element_user(SPECIMEN$80, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "Specimen" element
     */
    public boolean isSetSpecimen()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(SPECIMEN$80) != 0;
        }
    }
    
    /**
     * Sets the "Specimen" element
     */
    public void setSpecimen(org.hl7.fhir.Specimen specimen)
    {
        generatedSetterHelperImpl(specimen, SPECIMEN$80, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "Specimen" element
     */
    public org.hl7.fhir.Specimen addNewSpecimen()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.Specimen target = null;
            target = (org.hl7.fhir.Specimen)get_store().add_element_user(SPECIMEN$80);
            return target;
        }
    }
    
    /**
     * Unsets the "Specimen" element
     */
    public void unsetSpecimen()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(SPECIMEN$80, 0);
        }
    }
    
    /**
     * Gets the "OrderResponse" element
     */
    public org.hl7.fhir.OrderResponse getOrderResponse()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.OrderResponse target = null;
            target = (org.hl7.fhir.OrderResponse)get_store().find_element_user(ORDERRESPONSE$82, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "OrderResponse" element
     */
    public boolean isSetOrderResponse()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(ORDERRESPONSE$82) != 0;
        }
    }
    
    /**
     * Sets the "OrderResponse" element
     */
    public void setOrderResponse(org.hl7.fhir.OrderResponse orderResponse)
    {
        generatedSetterHelperImpl(orderResponse, ORDERRESPONSE$82, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "OrderResponse" element
     */
    public org.hl7.fhir.OrderResponse addNewOrderResponse()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.OrderResponse target = null;
            target = (org.hl7.fhir.OrderResponse)get_store().add_element_user(ORDERRESPONSE$82);
            return target;
        }
    }
    
    /**
     * Unsets the "OrderResponse" element
     */
    public void unsetOrderResponse()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(ORDERRESPONSE$82, 0);
        }
    }
    
    /**
     * Gets the "Alert" element
     */
    public org.hl7.fhir.Alert getAlert()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.Alert target = null;
            target = (org.hl7.fhir.Alert)get_store().find_element_user(ALERT$84, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "Alert" element
     */
    public boolean isSetAlert()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(ALERT$84) != 0;
        }
    }
    
    /**
     * Sets the "Alert" element
     */
    public void setAlert(org.hl7.fhir.Alert alert)
    {
        generatedSetterHelperImpl(alert, ALERT$84, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "Alert" element
     */
    public org.hl7.fhir.Alert addNewAlert()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.Alert target = null;
            target = (org.hl7.fhir.Alert)get_store().add_element_user(ALERT$84);
            return target;
        }
    }
    
    /**
     * Unsets the "Alert" element
     */
    public void unsetAlert()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(ALERT$84, 0);
        }
    }
    
    /**
     * Gets the "ConceptMap" element
     */
    public org.hl7.fhir.ConceptMap getConceptMap()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.ConceptMap target = null;
            target = (org.hl7.fhir.ConceptMap)get_store().find_element_user(CONCEPTMAP$86, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "ConceptMap" element
     */
    public boolean isSetConceptMap()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(CONCEPTMAP$86) != 0;
        }
    }
    
    /**
     * Sets the "ConceptMap" element
     */
    public void setConceptMap(org.hl7.fhir.ConceptMap conceptMap)
    {
        generatedSetterHelperImpl(conceptMap, CONCEPTMAP$86, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "ConceptMap" element
     */
    public org.hl7.fhir.ConceptMap addNewConceptMap()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.ConceptMap target = null;
            target = (org.hl7.fhir.ConceptMap)get_store().add_element_user(CONCEPTMAP$86);
            return target;
        }
    }
    
    /**
     * Unsets the "ConceptMap" element
     */
    public void unsetConceptMap()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(CONCEPTMAP$86, 0);
        }
    }
    
    /**
     * Gets the "Patient" element
     */
    public org.hl7.fhir.Patient getPatient()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.Patient target = null;
            target = (org.hl7.fhir.Patient)get_store().find_element_user(PATIENT$88, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "Patient" element
     */
    public boolean isSetPatient()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(PATIENT$88) != 0;
        }
    }
    
    /**
     * Sets the "Patient" element
     */
    public void setPatient(org.hl7.fhir.Patient patient)
    {
        generatedSetterHelperImpl(patient, PATIENT$88, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "Patient" element
     */
    public org.hl7.fhir.Patient addNewPatient()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.Patient target = null;
            target = (org.hl7.fhir.Patient)get_store().add_element_user(PATIENT$88);
            return target;
        }
    }
    
    /**
     * Unsets the "Patient" element
     */
    public void unsetPatient()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(PATIENT$88, 0);
        }
    }
    
    /**
     * Gets the "Practitioner" element
     */
    public org.hl7.fhir.Practitioner getPractitioner()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.Practitioner target = null;
            target = (org.hl7.fhir.Practitioner)get_store().find_element_user(PRACTITIONER$90, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "Practitioner" element
     */
    public boolean isSetPractitioner()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(PRACTITIONER$90) != 0;
        }
    }
    
    /**
     * Sets the "Practitioner" element
     */
    public void setPractitioner(org.hl7.fhir.Practitioner practitioner)
    {
        generatedSetterHelperImpl(practitioner, PRACTITIONER$90, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "Practitioner" element
     */
    public org.hl7.fhir.Practitioner addNewPractitioner()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.Practitioner target = null;
            target = (org.hl7.fhir.Practitioner)get_store().add_element_user(PRACTITIONER$90);
            return target;
        }
    }
    
    /**
     * Unsets the "Practitioner" element
     */
    public void unsetPractitioner()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(PRACTITIONER$90, 0);
        }
    }
    
    /**
     * Gets the "AdverseReaction" element
     */
    public org.hl7.fhir.AdverseReaction getAdverseReaction()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.AdverseReaction target = null;
            target = (org.hl7.fhir.AdverseReaction)get_store().find_element_user(ADVERSEREACTION$92, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "AdverseReaction" element
     */
    public boolean isSetAdverseReaction()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(ADVERSEREACTION$92) != 0;
        }
    }
    
    /**
     * Sets the "AdverseReaction" element
     */
    public void setAdverseReaction(org.hl7.fhir.AdverseReaction adverseReaction)
    {
        generatedSetterHelperImpl(adverseReaction, ADVERSEREACTION$92, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "AdverseReaction" element
     */
    public org.hl7.fhir.AdverseReaction addNewAdverseReaction()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.AdverseReaction target = null;
            target = (org.hl7.fhir.AdverseReaction)get_store().add_element_user(ADVERSEREACTION$92);
            return target;
        }
    }
    
    /**
     * Unsets the "AdverseReaction" element
     */
    public void unsetAdverseReaction()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(ADVERSEREACTION$92, 0);
        }
    }
    
    /**
     * Gets the "ImagingStudy" element
     */
    public org.hl7.fhir.ImagingStudy getImagingStudy()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.ImagingStudy target = null;
            target = (org.hl7.fhir.ImagingStudy)get_store().find_element_user(IMAGINGSTUDY$94, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "ImagingStudy" element
     */
    public boolean isSetImagingStudy()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(IMAGINGSTUDY$94) != 0;
        }
    }
    
    /**
     * Sets the "ImagingStudy" element
     */
    public void setImagingStudy(org.hl7.fhir.ImagingStudy imagingStudy)
    {
        generatedSetterHelperImpl(imagingStudy, IMAGINGSTUDY$94, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "ImagingStudy" element
     */
    public org.hl7.fhir.ImagingStudy addNewImagingStudy()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.ImagingStudy target = null;
            target = (org.hl7.fhir.ImagingStudy)get_store().add_element_user(IMAGINGSTUDY$94);
            return target;
        }
    }
    
    /**
     * Unsets the "ImagingStudy" element
     */
    public void unsetImagingStudy()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(IMAGINGSTUDY$94, 0);
        }
    }
    
    /**
     * Gets the "DiagnosticOrder" element
     */
    public org.hl7.fhir.DiagnosticOrder getDiagnosticOrder()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.DiagnosticOrder target = null;
            target = (org.hl7.fhir.DiagnosticOrder)get_store().find_element_user(DIAGNOSTICORDER$96, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "DiagnosticOrder" element
     */
    public boolean isSetDiagnosticOrder()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(DIAGNOSTICORDER$96) != 0;
        }
    }
    
    /**
     * Sets the "DiagnosticOrder" element
     */
    public void setDiagnosticOrder(org.hl7.fhir.DiagnosticOrder diagnosticOrder)
    {
        generatedSetterHelperImpl(diagnosticOrder, DIAGNOSTICORDER$96, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "DiagnosticOrder" element
     */
    public org.hl7.fhir.DiagnosticOrder addNewDiagnosticOrder()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.DiagnosticOrder target = null;
            target = (org.hl7.fhir.DiagnosticOrder)get_store().add_element_user(DIAGNOSTICORDER$96);
            return target;
        }
    }
    
    /**
     * Unsets the "DiagnosticOrder" element
     */
    public void unsetDiagnosticOrder()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(DIAGNOSTICORDER$96, 0);
        }
    }
}
