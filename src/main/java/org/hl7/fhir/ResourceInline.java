/*
 * XML Type:  Resource.Inline
 * Namespace: http://hl7.org/fhir
 * Java type: org.hl7.fhir.ResourceInline
 *
 * Automatically generated - do not modify.
 */
package org.hl7.fhir;


/**
 * An XML Resource.Inline(@http://hl7.org/fhir).
 *
 * This is a complex type.
 */
public interface ResourceInline extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(ResourceInline.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s9E39DC3B416F07EA0C8EBAFDA46576CE").resolveHandle("resourceinlinecb53type");
    
    /**
     * Gets the "Binary" element
     */
    org.hl7.fhir.Binary getBinary();
    
    /**
     * True if has "Binary" element
     */
    boolean isSetBinary();
    
    /**
     * Sets the "Binary" element
     */
    void setBinary(org.hl7.fhir.Binary binary);
    
    /**
     * Appends and returns a new empty "Binary" element
     */
    org.hl7.fhir.Binary addNewBinary();
    
    /**
     * Unsets the "Binary" element
     */
    void unsetBinary();
    
    /**
     * Gets the "Provenance" element
     */
    org.hl7.fhir.Provenance getProvenance();
    
    /**
     * True if has "Provenance" element
     */
    boolean isSetProvenance();
    
    /**
     * Sets the "Provenance" element
     */
    void setProvenance(org.hl7.fhir.Provenance provenance);
    
    /**
     * Appends and returns a new empty "Provenance" element
     */
    org.hl7.fhir.Provenance addNewProvenance();
    
    /**
     * Unsets the "Provenance" element
     */
    void unsetProvenance();
    
    /**
     * Gets the "Condition" element
     */
    org.hl7.fhir.Condition getCondition();
    
    /**
     * True if has "Condition" element
     */
    boolean isSetCondition();
    
    /**
     * Sets the "Condition" element
     */
    void setCondition(org.hl7.fhir.Condition condition);
    
    /**
     * Appends and returns a new empty "Condition" element
     */
    org.hl7.fhir.Condition addNewCondition();
    
    /**
     * Unsets the "Condition" element
     */
    void unsetCondition();
    
    /**
     * Gets the "CarePlan" element
     */
    org.hl7.fhir.CarePlan getCarePlan();
    
    /**
     * True if has "CarePlan" element
     */
    boolean isSetCarePlan();
    
    /**
     * Sets the "CarePlan" element
     */
    void setCarePlan(org.hl7.fhir.CarePlan carePlan);
    
    /**
     * Appends and returns a new empty "CarePlan" element
     */
    org.hl7.fhir.CarePlan addNewCarePlan();
    
    /**
     * Unsets the "CarePlan" element
     */
    void unsetCarePlan();
    
    /**
     * Gets the "Supply" element
     */
    org.hl7.fhir.Supply getSupply();
    
    /**
     * True if has "Supply" element
     */
    boolean isSetSupply();
    
    /**
     * Sets the "Supply" element
     */
    void setSupply(org.hl7.fhir.Supply supply);
    
    /**
     * Appends and returns a new empty "Supply" element
     */
    org.hl7.fhir.Supply addNewSupply();
    
    /**
     * Unsets the "Supply" element
     */
    void unsetSupply();
    
    /**
     * Gets the "Device" element
     */
    org.hl7.fhir.Device getDevice();
    
    /**
     * True if has "Device" element
     */
    boolean isSetDevice();
    
    /**
     * Sets the "Device" element
     */
    void setDevice(org.hl7.fhir.Device device);
    
    /**
     * Appends and returns a new empty "Device" element
     */
    org.hl7.fhir.Device addNewDevice();
    
    /**
     * Unsets the "Device" element
     */
    void unsetDevice();
    
    /**
     * Gets the "Query" element
     */
    org.hl7.fhir.Query getQuery();
    
    /**
     * True if has "Query" element
     */
    boolean isSetQuery();
    
    /**
     * Sets the "Query" element
     */
    void setQuery(org.hl7.fhir.Query query);
    
    /**
     * Appends and returns a new empty "Query" element
     */
    org.hl7.fhir.Query addNewQuery();
    
    /**
     * Unsets the "Query" element
     */
    void unsetQuery();
    
    /**
     * Gets the "Order" element
     */
    org.hl7.fhir.Order getOrder();
    
    /**
     * True if has "Order" element
     */
    boolean isSetOrder();
    
    /**
     * Sets the "Order" element
     */
    void setOrder(org.hl7.fhir.Order order);
    
    /**
     * Appends and returns a new empty "Order" element
     */
    org.hl7.fhir.Order addNewOrder();
    
    /**
     * Unsets the "Order" element
     */
    void unsetOrder();
    
    /**
     * Gets the "Organization" element
     */
    org.hl7.fhir.Organization getOrganization();
    
    /**
     * True if has "Organization" element
     */
    boolean isSetOrganization();
    
    /**
     * Sets the "Organization" element
     */
    void setOrganization(org.hl7.fhir.Organization organization);
    
    /**
     * Appends and returns a new empty "Organization" element
     */
    org.hl7.fhir.Organization addNewOrganization();
    
    /**
     * Unsets the "Organization" element
     */
    void unsetOrganization();
    
    /**
     * Gets the "Procedure" element
     */
    org.hl7.fhir.Procedure getProcedure();
    
    /**
     * True if has "Procedure" element
     */
    boolean isSetProcedure();
    
    /**
     * Sets the "Procedure" element
     */
    void setProcedure(org.hl7.fhir.Procedure procedure);
    
    /**
     * Appends and returns a new empty "Procedure" element
     */
    org.hl7.fhir.Procedure addNewProcedure();
    
    /**
     * Unsets the "Procedure" element
     */
    void unsetProcedure();
    
    /**
     * Gets the "Substance" element
     */
    org.hl7.fhir.Substance getSubstance();
    
    /**
     * True if has "Substance" element
     */
    boolean isSetSubstance();
    
    /**
     * Sets the "Substance" element
     */
    void setSubstance(org.hl7.fhir.Substance substance);
    
    /**
     * Appends and returns a new empty "Substance" element
     */
    org.hl7.fhir.Substance addNewSubstance();
    
    /**
     * Unsets the "Substance" element
     */
    void unsetSubstance();
    
    /**
     * Gets the "DiagnosticReport" element
     */
    org.hl7.fhir.DiagnosticReport getDiagnosticReport();
    
    /**
     * True if has "DiagnosticReport" element
     */
    boolean isSetDiagnosticReport();
    
    /**
     * Sets the "DiagnosticReport" element
     */
    void setDiagnosticReport(org.hl7.fhir.DiagnosticReport diagnosticReport);
    
    /**
     * Appends and returns a new empty "DiagnosticReport" element
     */
    org.hl7.fhir.DiagnosticReport addNewDiagnosticReport();
    
    /**
     * Unsets the "DiagnosticReport" element
     */
    void unsetDiagnosticReport();
    
    /**
     * Gets the "Group" element
     */
    org.hl7.fhir.Group getGroup();
    
    /**
     * True if has "Group" element
     */
    boolean isSetGroup();
    
    /**
     * Sets the "Group" element
     */
    void setGroup(org.hl7.fhir.Group group);
    
    /**
     * Appends and returns a new empty "Group" element
     */
    org.hl7.fhir.Group addNewGroup();
    
    /**
     * Unsets the "Group" element
     */
    void unsetGroup();
    
    /**
     * Gets the "ValueSet" element
     */
    org.hl7.fhir.ValueSet getValueSet();
    
    /**
     * True if has "ValueSet" element
     */
    boolean isSetValueSet();
    
    /**
     * Sets the "ValueSet" element
     */
    void setValueSet(org.hl7.fhir.ValueSet valueSet);
    
    /**
     * Appends and returns a new empty "ValueSet" element
     */
    org.hl7.fhir.ValueSet addNewValueSet();
    
    /**
     * Unsets the "ValueSet" element
     */
    void unsetValueSet();
    
    /**
     * Gets the "Medication" element
     */
    org.hl7.fhir.Medication getMedication();
    
    /**
     * True if has "Medication" element
     */
    boolean isSetMedication();
    
    /**
     * Sets the "Medication" element
     */
    void setMedication(org.hl7.fhir.Medication medication);
    
    /**
     * Appends and returns a new empty "Medication" element
     */
    org.hl7.fhir.Medication addNewMedication();
    
    /**
     * Unsets the "Medication" element
     */
    void unsetMedication();
    
    /**
     * Gets the "MessageHeader" element
     */
    org.hl7.fhir.MessageHeader getMessageHeader();
    
    /**
     * True if has "MessageHeader" element
     */
    boolean isSetMessageHeader();
    
    /**
     * Sets the "MessageHeader" element
     */
    void setMessageHeader(org.hl7.fhir.MessageHeader messageHeader);
    
    /**
     * Appends and returns a new empty "MessageHeader" element
     */
    org.hl7.fhir.MessageHeader addNewMessageHeader();
    
    /**
     * Unsets the "MessageHeader" element
     */
    void unsetMessageHeader();
    
    /**
     * Gets the "ImmunizationRecommendation" element
     */
    org.hl7.fhir.ImmunizationRecommendation getImmunizationRecommendation();
    
    /**
     * True if has "ImmunizationRecommendation" element
     */
    boolean isSetImmunizationRecommendation();
    
    /**
     * Sets the "ImmunizationRecommendation" element
     */
    void setImmunizationRecommendation(org.hl7.fhir.ImmunizationRecommendation immunizationRecommendation);
    
    /**
     * Appends and returns a new empty "ImmunizationRecommendation" element
     */
    org.hl7.fhir.ImmunizationRecommendation addNewImmunizationRecommendation();
    
    /**
     * Unsets the "ImmunizationRecommendation" element
     */
    void unsetImmunizationRecommendation();
    
    /**
     * Gets the "DocumentManifest" element
     */
    org.hl7.fhir.DocumentManifest getDocumentManifest();
    
    /**
     * True if has "DocumentManifest" element
     */
    boolean isSetDocumentManifest();
    
    /**
     * Sets the "DocumentManifest" element
     */
    void setDocumentManifest(org.hl7.fhir.DocumentManifest documentManifest);
    
    /**
     * Appends and returns a new empty "DocumentManifest" element
     */
    org.hl7.fhir.DocumentManifest addNewDocumentManifest();
    
    /**
     * Unsets the "DocumentManifest" element
     */
    void unsetDocumentManifest();
    
    /**
     * Gets the "MedicationDispense" element
     */
    org.hl7.fhir.MedicationDispense getMedicationDispense();
    
    /**
     * True if has "MedicationDispense" element
     */
    boolean isSetMedicationDispense();
    
    /**
     * Sets the "MedicationDispense" element
     */
    void setMedicationDispense(org.hl7.fhir.MedicationDispense medicationDispense);
    
    /**
     * Appends and returns a new empty "MedicationDispense" element
     */
    org.hl7.fhir.MedicationDispense addNewMedicationDispense();
    
    /**
     * Unsets the "MedicationDispense" element
     */
    void unsetMedicationDispense();
    
    /**
     * Gets the "MedicationPrescription" element
     */
    org.hl7.fhir.MedicationPrescription getMedicationPrescription();
    
    /**
     * True if has "MedicationPrescription" element
     */
    boolean isSetMedicationPrescription();
    
    /**
     * Sets the "MedicationPrescription" element
     */
    void setMedicationPrescription(org.hl7.fhir.MedicationPrescription medicationPrescription);
    
    /**
     * Appends and returns a new empty "MedicationPrescription" element
     */
    org.hl7.fhir.MedicationPrescription addNewMedicationPrescription();
    
    /**
     * Unsets the "MedicationPrescription" element
     */
    void unsetMedicationPrescription();
    
    /**
     * Gets the "MedicationAdministration" element
     */
    org.hl7.fhir.MedicationAdministration getMedicationAdministration();
    
    /**
     * True if has "MedicationAdministration" element
     */
    boolean isSetMedicationAdministration();
    
    /**
     * Sets the "MedicationAdministration" element
     */
    void setMedicationAdministration(org.hl7.fhir.MedicationAdministration medicationAdministration);
    
    /**
     * Appends and returns a new empty "MedicationAdministration" element
     */
    org.hl7.fhir.MedicationAdministration addNewMedicationAdministration();
    
    /**
     * Unsets the "MedicationAdministration" element
     */
    void unsetMedicationAdministration();
    
    /**
     * Gets the "Encounter" element
     */
    org.hl7.fhir.Encounter getEncounter();
    
    /**
     * True if has "Encounter" element
     */
    boolean isSetEncounter();
    
    /**
     * Sets the "Encounter" element
     */
    void setEncounter(org.hl7.fhir.Encounter encounter);
    
    /**
     * Appends and returns a new empty "Encounter" element
     */
    org.hl7.fhir.Encounter addNewEncounter();
    
    /**
     * Unsets the "Encounter" element
     */
    void unsetEncounter();
    
    /**
     * Gets the "SecurityEvent" element
     */
    org.hl7.fhir.SecurityEvent getSecurityEvent();
    
    /**
     * True if has "SecurityEvent" element
     */
    boolean isSetSecurityEvent();
    
    /**
     * Sets the "SecurityEvent" element
     */
    void setSecurityEvent(org.hl7.fhir.SecurityEvent securityEvent);
    
    /**
     * Appends and returns a new empty "SecurityEvent" element
     */
    org.hl7.fhir.SecurityEvent addNewSecurityEvent();
    
    /**
     * Unsets the "SecurityEvent" element
     */
    void unsetSecurityEvent();
    
    /**
     * Gets the "MedicationStatement" element
     */
    org.hl7.fhir.MedicationStatement getMedicationStatement();
    
    /**
     * True if has "MedicationStatement" element
     */
    boolean isSetMedicationStatement();
    
    /**
     * Sets the "MedicationStatement" element
     */
    void setMedicationStatement(org.hl7.fhir.MedicationStatement medicationStatement);
    
    /**
     * Appends and returns a new empty "MedicationStatement" element
     */
    org.hl7.fhir.MedicationStatement addNewMedicationStatement();
    
    /**
     * Unsets the "MedicationStatement" element
     */
    void unsetMedicationStatement();
    
    /**
     * Gets the "List" element
     */
    org.hl7.fhir.List getList();
    
    /**
     * True if has "List" element
     */
    boolean isSetList();
    
    /**
     * Sets the "List" element
     */
    void setList(org.hl7.fhir.List list);
    
    /**
     * Appends and returns a new empty "List" element
     */
    org.hl7.fhir.List addNewList();
    
    /**
     * Unsets the "List" element
     */
    void unsetList();
    
    /**
     * Gets the "Questionnaire" element
     */
    org.hl7.fhir.Questionnaire getQuestionnaire();
    
    /**
     * True if has "Questionnaire" element
     */
    boolean isSetQuestionnaire();
    
    /**
     * Sets the "Questionnaire" element
     */
    void setQuestionnaire(org.hl7.fhir.Questionnaire questionnaire);
    
    /**
     * Appends and returns a new empty "Questionnaire" element
     */
    org.hl7.fhir.Questionnaire addNewQuestionnaire();
    
    /**
     * Unsets the "Questionnaire" element
     */
    void unsetQuestionnaire();
    
    /**
     * Gets the "Composition" element
     */
    org.hl7.fhir.Composition getComposition();
    
    /**
     * True if has "Composition" element
     */
    boolean isSetComposition();
    
    /**
     * Sets the "Composition" element
     */
    void setComposition(org.hl7.fhir.Composition composition);
    
    /**
     * Appends and returns a new empty "Composition" element
     */
    org.hl7.fhir.Composition addNewComposition();
    
    /**
     * Unsets the "Composition" element
     */
    void unsetComposition();
    
    /**
     * Gets the "DeviceObservationReport" element
     */
    org.hl7.fhir.DeviceObservationReport getDeviceObservationReport();
    
    /**
     * True if has "DeviceObservationReport" element
     */
    boolean isSetDeviceObservationReport();
    
    /**
     * Sets the "DeviceObservationReport" element
     */
    void setDeviceObservationReport(org.hl7.fhir.DeviceObservationReport deviceObservationReport);
    
    /**
     * Appends and returns a new empty "DeviceObservationReport" element
     */
    org.hl7.fhir.DeviceObservationReport addNewDeviceObservationReport();
    
    /**
     * Unsets the "DeviceObservationReport" element
     */
    void unsetDeviceObservationReport();
    
    /**
     * Gets the "OperationOutcome" element
     */
    org.hl7.fhir.OperationOutcome getOperationOutcome();
    
    /**
     * True if has "OperationOutcome" element
     */
    boolean isSetOperationOutcome();
    
    /**
     * Sets the "OperationOutcome" element
     */
    void setOperationOutcome(org.hl7.fhir.OperationOutcome operationOutcome);
    
    /**
     * Appends and returns a new empty "OperationOutcome" element
     */
    org.hl7.fhir.OperationOutcome addNewOperationOutcome();
    
    /**
     * Unsets the "OperationOutcome" element
     */
    void unsetOperationOutcome();
    
    /**
     * Gets the "Conformance" element
     */
    org.hl7.fhir.Conformance getConformance();
    
    /**
     * True if has "Conformance" element
     */
    boolean isSetConformance();
    
    /**
     * Sets the "Conformance" element
     */
    void setConformance(org.hl7.fhir.Conformance conformance);
    
    /**
     * Appends and returns a new empty "Conformance" element
     */
    org.hl7.fhir.Conformance addNewConformance();
    
    /**
     * Unsets the "Conformance" element
     */
    void unsetConformance();
    
    /**
     * Gets the "Media" element
     */
    org.hl7.fhir.Media getMedia();
    
    /**
     * True if has "Media" element
     */
    boolean isSetMedia();
    
    /**
     * Sets the "Media" element
     */
    void setMedia(org.hl7.fhir.Media media);
    
    /**
     * Appends and returns a new empty "Media" element
     */
    org.hl7.fhir.Media addNewMedia();
    
    /**
     * Unsets the "Media" element
     */
    void unsetMedia();
    
    /**
     * Gets the "FamilyHistory" element
     */
    org.hl7.fhir.FamilyHistory getFamilyHistory();
    
    /**
     * True if has "FamilyHistory" element
     */
    boolean isSetFamilyHistory();
    
    /**
     * Sets the "FamilyHistory" element
     */
    void setFamilyHistory(org.hl7.fhir.FamilyHistory familyHistory);
    
    /**
     * Appends and returns a new empty "FamilyHistory" element
     */
    org.hl7.fhir.FamilyHistory addNewFamilyHistory();
    
    /**
     * Unsets the "FamilyHistory" element
     */
    void unsetFamilyHistory();
    
    /**
     * Gets the "Other" element
     */
    org.hl7.fhir.Other getOther();
    
    /**
     * True if has "Other" element
     */
    boolean isSetOther();
    
    /**
     * Sets the "Other" element
     */
    void setOther(org.hl7.fhir.Other other);
    
    /**
     * Appends and returns a new empty "Other" element
     */
    org.hl7.fhir.Other addNewOther();
    
    /**
     * Unsets the "Other" element
     */
    void unsetOther();
    
    /**
     * Gets the "Profile" element
     */
    org.hl7.fhir.Profile getProfile();
    
    /**
     * True if has "Profile" element
     */
    boolean isSetProfile();
    
    /**
     * Sets the "Profile" element
     */
    void setProfile(org.hl7.fhir.Profile profile);
    
    /**
     * Appends and returns a new empty "Profile" element
     */
    org.hl7.fhir.Profile addNewProfile();
    
    /**
     * Unsets the "Profile" element
     */
    void unsetProfile();
    
    /**
     * Gets the "Location" element
     */
    org.hl7.fhir.Location getLocation();
    
    /**
     * True if has "Location" element
     */
    boolean isSetLocation();
    
    /**
     * Sets the "Location" element
     */
    void setLocation(org.hl7.fhir.Location location);
    
    /**
     * Appends and returns a new empty "Location" element
     */
    org.hl7.fhir.Location addNewLocation();
    
    /**
     * Unsets the "Location" element
     */
    void unsetLocation();
    
    /**
     * Gets the "Observation" element
     */
    org.hl7.fhir.Observation getObservation();
    
    /**
     * True if has "Observation" element
     */
    boolean isSetObservation();
    
    /**
     * Sets the "Observation" element
     */
    void setObservation(org.hl7.fhir.Observation observation);
    
    /**
     * Appends and returns a new empty "Observation" element
     */
    org.hl7.fhir.Observation addNewObservation();
    
    /**
     * Unsets the "Observation" element
     */
    void unsetObservation();
    
    /**
     * Gets the "AllergyIntolerance" element
     */
    org.hl7.fhir.AllergyIntolerance getAllergyIntolerance();
    
    /**
     * True if has "AllergyIntolerance" element
     */
    boolean isSetAllergyIntolerance();
    
    /**
     * Sets the "AllergyIntolerance" element
     */
    void setAllergyIntolerance(org.hl7.fhir.AllergyIntolerance allergyIntolerance);
    
    /**
     * Appends and returns a new empty "AllergyIntolerance" element
     */
    org.hl7.fhir.AllergyIntolerance addNewAllergyIntolerance();
    
    /**
     * Unsets the "AllergyIntolerance" element
     */
    void unsetAllergyIntolerance();
    
    /**
     * Gets the "DocumentReference" element
     */
    org.hl7.fhir.DocumentReference getDocumentReference();
    
    /**
     * True if has "DocumentReference" element
     */
    boolean isSetDocumentReference();
    
    /**
     * Sets the "DocumentReference" element
     */
    void setDocumentReference(org.hl7.fhir.DocumentReference documentReference);
    
    /**
     * Appends and returns a new empty "DocumentReference" element
     */
    org.hl7.fhir.DocumentReference addNewDocumentReference();
    
    /**
     * Unsets the "DocumentReference" element
     */
    void unsetDocumentReference();
    
    /**
     * Gets the "Immunization" element
     */
    org.hl7.fhir.Immunization getImmunization();
    
    /**
     * True if has "Immunization" element
     */
    boolean isSetImmunization();
    
    /**
     * Sets the "Immunization" element
     */
    void setImmunization(org.hl7.fhir.Immunization immunization);
    
    /**
     * Appends and returns a new empty "Immunization" element
     */
    org.hl7.fhir.Immunization addNewImmunization();
    
    /**
     * Unsets the "Immunization" element
     */
    void unsetImmunization();
    
    /**
     * Gets the "RelatedPerson" element
     */
    org.hl7.fhir.RelatedPerson getRelatedPerson();
    
    /**
     * True if has "RelatedPerson" element
     */
    boolean isSetRelatedPerson();
    
    /**
     * Sets the "RelatedPerson" element
     */
    void setRelatedPerson(org.hl7.fhir.RelatedPerson relatedPerson);
    
    /**
     * Appends and returns a new empty "RelatedPerson" element
     */
    org.hl7.fhir.RelatedPerson addNewRelatedPerson();
    
    /**
     * Unsets the "RelatedPerson" element
     */
    void unsetRelatedPerson();
    
    /**
     * Gets the "Specimen" element
     */
    org.hl7.fhir.Specimen getSpecimen();
    
    /**
     * True if has "Specimen" element
     */
    boolean isSetSpecimen();
    
    /**
     * Sets the "Specimen" element
     */
    void setSpecimen(org.hl7.fhir.Specimen specimen);
    
    /**
     * Appends and returns a new empty "Specimen" element
     */
    org.hl7.fhir.Specimen addNewSpecimen();
    
    /**
     * Unsets the "Specimen" element
     */
    void unsetSpecimen();
    
    /**
     * Gets the "OrderResponse" element
     */
    org.hl7.fhir.OrderResponse getOrderResponse();
    
    /**
     * True if has "OrderResponse" element
     */
    boolean isSetOrderResponse();
    
    /**
     * Sets the "OrderResponse" element
     */
    void setOrderResponse(org.hl7.fhir.OrderResponse orderResponse);
    
    /**
     * Appends and returns a new empty "OrderResponse" element
     */
    org.hl7.fhir.OrderResponse addNewOrderResponse();
    
    /**
     * Unsets the "OrderResponse" element
     */
    void unsetOrderResponse();
    
    /**
     * Gets the "Alert" element
     */
    org.hl7.fhir.Alert getAlert();
    
    /**
     * True if has "Alert" element
     */
    boolean isSetAlert();
    
    /**
     * Sets the "Alert" element
     */
    void setAlert(org.hl7.fhir.Alert alert);
    
    /**
     * Appends and returns a new empty "Alert" element
     */
    org.hl7.fhir.Alert addNewAlert();
    
    /**
     * Unsets the "Alert" element
     */
    void unsetAlert();
    
    /**
     * Gets the "ConceptMap" element
     */
    org.hl7.fhir.ConceptMap getConceptMap();
    
    /**
     * True if has "ConceptMap" element
     */
    boolean isSetConceptMap();
    
    /**
     * Sets the "ConceptMap" element
     */
    void setConceptMap(org.hl7.fhir.ConceptMap conceptMap);
    
    /**
     * Appends and returns a new empty "ConceptMap" element
     */
    org.hl7.fhir.ConceptMap addNewConceptMap();
    
    /**
     * Unsets the "ConceptMap" element
     */
    void unsetConceptMap();
    
    /**
     * Gets the "Patient" element
     */
    org.hl7.fhir.Patient getPatient();
    
    /**
     * True if has "Patient" element
     */
    boolean isSetPatient();
    
    /**
     * Sets the "Patient" element
     */
    void setPatient(org.hl7.fhir.Patient patient);
    
    /**
     * Appends and returns a new empty "Patient" element
     */
    org.hl7.fhir.Patient addNewPatient();
    
    /**
     * Unsets the "Patient" element
     */
    void unsetPatient();
    
    /**
     * Gets the "Practitioner" element
     */
    org.hl7.fhir.Practitioner getPractitioner();
    
    /**
     * True if has "Practitioner" element
     */
    boolean isSetPractitioner();
    
    /**
     * Sets the "Practitioner" element
     */
    void setPractitioner(org.hl7.fhir.Practitioner practitioner);
    
    /**
     * Appends and returns a new empty "Practitioner" element
     */
    org.hl7.fhir.Practitioner addNewPractitioner();
    
    /**
     * Unsets the "Practitioner" element
     */
    void unsetPractitioner();
    
    /**
     * Gets the "AdverseReaction" element
     */
    org.hl7.fhir.AdverseReaction getAdverseReaction();
    
    /**
     * True if has "AdverseReaction" element
     */
    boolean isSetAdverseReaction();
    
    /**
     * Sets the "AdverseReaction" element
     */
    void setAdverseReaction(org.hl7.fhir.AdverseReaction adverseReaction);
    
    /**
     * Appends and returns a new empty "AdverseReaction" element
     */
    org.hl7.fhir.AdverseReaction addNewAdverseReaction();
    
    /**
     * Unsets the "AdverseReaction" element
     */
    void unsetAdverseReaction();
    
    /**
     * Gets the "ImagingStudy" element
     */
    org.hl7.fhir.ImagingStudy getImagingStudy();
    
    /**
     * True if has "ImagingStudy" element
     */
    boolean isSetImagingStudy();
    
    /**
     * Sets the "ImagingStudy" element
     */
    void setImagingStudy(org.hl7.fhir.ImagingStudy imagingStudy);
    
    /**
     * Appends and returns a new empty "ImagingStudy" element
     */
    org.hl7.fhir.ImagingStudy addNewImagingStudy();
    
    /**
     * Unsets the "ImagingStudy" element
     */
    void unsetImagingStudy();
    
    /**
     * Gets the "DiagnosticOrder" element
     */
    org.hl7.fhir.DiagnosticOrder getDiagnosticOrder();
    
    /**
     * True if has "DiagnosticOrder" element
     */
    boolean isSetDiagnosticOrder();
    
    /**
     * Sets the "DiagnosticOrder" element
     */
    void setDiagnosticOrder(org.hl7.fhir.DiagnosticOrder diagnosticOrder);
    
    /**
     * Appends and returns a new empty "DiagnosticOrder" element
     */
    org.hl7.fhir.DiagnosticOrder addNewDiagnosticOrder();
    
    /**
     * Unsets the "DiagnosticOrder" element
     */
    void unsetDiagnosticOrder();
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static org.hl7.fhir.ResourceInline newInstance() {
          return (org.hl7.fhir.ResourceInline) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static org.hl7.fhir.ResourceInline newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (org.hl7.fhir.ResourceInline) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static org.hl7.fhir.ResourceInline parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (org.hl7.fhir.ResourceInline) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static org.hl7.fhir.ResourceInline parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.hl7.fhir.ResourceInline) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static org.hl7.fhir.ResourceInline parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.hl7.fhir.ResourceInline) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static org.hl7.fhir.ResourceInline parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.hl7.fhir.ResourceInline) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static org.hl7.fhir.ResourceInline parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.hl7.fhir.ResourceInline) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static org.hl7.fhir.ResourceInline parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.hl7.fhir.ResourceInline) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static org.hl7.fhir.ResourceInline parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.hl7.fhir.ResourceInline) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static org.hl7.fhir.ResourceInline parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.hl7.fhir.ResourceInline) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static org.hl7.fhir.ResourceInline parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.hl7.fhir.ResourceInline) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static org.hl7.fhir.ResourceInline parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.hl7.fhir.ResourceInline) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static org.hl7.fhir.ResourceInline parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (org.hl7.fhir.ResourceInline) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static org.hl7.fhir.ResourceInline parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.hl7.fhir.ResourceInline) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static org.hl7.fhir.ResourceInline parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (org.hl7.fhir.ResourceInline) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static org.hl7.fhir.ResourceInline parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.hl7.fhir.ResourceInline) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.hl7.fhir.ResourceInline parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (org.hl7.fhir.ResourceInline) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.hl7.fhir.ResourceInline parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (org.hl7.fhir.ResourceInline) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
