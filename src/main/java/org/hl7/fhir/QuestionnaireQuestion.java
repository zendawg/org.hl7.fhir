/*
 * XML Type:  Questionnaire.Question
 * Namespace: http://hl7.org/fhir
 * Java type: org.hl7.fhir.QuestionnaireQuestion
 *
 * Automatically generated - do not modify.
 */
package org.hl7.fhir;


/**
 * An XML Questionnaire.Question(@http://hl7.org/fhir).
 *
 * This is a complex type.
 */
public interface QuestionnaireQuestion extends org.hl7.fhir.BackboneElement
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(QuestionnaireQuestion.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s9E39DC3B416F07EA0C8EBAFDA46576CE").resolveHandle("questionnairequestioned1dtype");
    
    /**
     * Gets the "name" element
     */
    org.hl7.fhir.CodeableConcept getName();
    
    /**
     * True if has "name" element
     */
    boolean isSetName();
    
    /**
     * Sets the "name" element
     */
    void setName(org.hl7.fhir.CodeableConcept name);
    
    /**
     * Appends and returns a new empty "name" element
     */
    org.hl7.fhir.CodeableConcept addNewName();
    
    /**
     * Unsets the "name" element
     */
    void unsetName();
    
    /**
     * Gets the "text" element
     */
    org.hl7.fhir.String getText();
    
    /**
     * True if has "text" element
     */
    boolean isSetText();
    
    /**
     * Sets the "text" element
     */
    void setText(org.hl7.fhir.String text);
    
    /**
     * Appends and returns a new empty "text" element
     */
    org.hl7.fhir.String addNewText();
    
    /**
     * Unsets the "text" element
     */
    void unsetText();
    
    /**
     * Gets the "answerDecimal" element
     */
    org.hl7.fhir.Decimal getAnswerDecimal();
    
    /**
     * True if has "answerDecimal" element
     */
    boolean isSetAnswerDecimal();
    
    /**
     * Sets the "answerDecimal" element
     */
    void setAnswerDecimal(org.hl7.fhir.Decimal answerDecimal);
    
    /**
     * Appends and returns a new empty "answerDecimal" element
     */
    org.hl7.fhir.Decimal addNewAnswerDecimal();
    
    /**
     * Unsets the "answerDecimal" element
     */
    void unsetAnswerDecimal();
    
    /**
     * Gets the "answerInteger" element
     */
    org.hl7.fhir.Integer getAnswerInteger();
    
    /**
     * True if has "answerInteger" element
     */
    boolean isSetAnswerInteger();
    
    /**
     * Sets the "answerInteger" element
     */
    void setAnswerInteger(org.hl7.fhir.Integer answerInteger);
    
    /**
     * Appends and returns a new empty "answerInteger" element
     */
    org.hl7.fhir.Integer addNewAnswerInteger();
    
    /**
     * Unsets the "answerInteger" element
     */
    void unsetAnswerInteger();
    
    /**
     * Gets the "answerBoolean" element
     */
    org.hl7.fhir.Boolean getAnswerBoolean();
    
    /**
     * True if has "answerBoolean" element
     */
    boolean isSetAnswerBoolean();
    
    /**
     * Sets the "answerBoolean" element
     */
    void setAnswerBoolean(org.hl7.fhir.Boolean answerBoolean);
    
    /**
     * Appends and returns a new empty "answerBoolean" element
     */
    org.hl7.fhir.Boolean addNewAnswerBoolean();
    
    /**
     * Unsets the "answerBoolean" element
     */
    void unsetAnswerBoolean();
    
    /**
     * Gets the "answerDate" element
     */
    org.hl7.fhir.Date getAnswerDate();
    
    /**
     * True if has "answerDate" element
     */
    boolean isSetAnswerDate();
    
    /**
     * Sets the "answerDate" element
     */
    void setAnswerDate(org.hl7.fhir.Date answerDate);
    
    /**
     * Appends and returns a new empty "answerDate" element
     */
    org.hl7.fhir.Date addNewAnswerDate();
    
    /**
     * Unsets the "answerDate" element
     */
    void unsetAnswerDate();
    
    /**
     * Gets the "answerString" element
     */
    org.hl7.fhir.String getAnswerString();
    
    /**
     * True if has "answerString" element
     */
    boolean isSetAnswerString();
    
    /**
     * Sets the "answerString" element
     */
    void setAnswerString(org.hl7.fhir.String answerString);
    
    /**
     * Appends and returns a new empty "answerString" element
     */
    org.hl7.fhir.String addNewAnswerString();
    
    /**
     * Unsets the "answerString" element
     */
    void unsetAnswerString();
    
    /**
     * Gets the "answerDateTime" element
     */
    org.hl7.fhir.DateTime getAnswerDateTime();
    
    /**
     * True if has "answerDateTime" element
     */
    boolean isSetAnswerDateTime();
    
    /**
     * Sets the "answerDateTime" element
     */
    void setAnswerDateTime(org.hl7.fhir.DateTime answerDateTime);
    
    /**
     * Appends and returns a new empty "answerDateTime" element
     */
    org.hl7.fhir.DateTime addNewAnswerDateTime();
    
    /**
     * Unsets the "answerDateTime" element
     */
    void unsetAnswerDateTime();
    
    /**
     * Gets the "answerInstant" element
     */
    org.hl7.fhir.Instant getAnswerInstant();
    
    /**
     * True if has "answerInstant" element
     */
    boolean isSetAnswerInstant();
    
    /**
     * Sets the "answerInstant" element
     */
    void setAnswerInstant(org.hl7.fhir.Instant answerInstant);
    
    /**
     * Appends and returns a new empty "answerInstant" element
     */
    org.hl7.fhir.Instant addNewAnswerInstant();
    
    /**
     * Unsets the "answerInstant" element
     */
    void unsetAnswerInstant();
    
    /**
     * Gets array of all "choice" elements
     */
    org.hl7.fhir.Coding[] getChoiceArray();
    
    /**
     * Gets ith "choice" element
     */
    org.hl7.fhir.Coding getChoiceArray(int i);
    
    /**
     * Returns number of "choice" element
     */
    int sizeOfChoiceArray();
    
    /**
     * Sets array of all "choice" element
     */
    void setChoiceArray(org.hl7.fhir.Coding[] choiceArray);
    
    /**
     * Sets ith "choice" element
     */
    void setChoiceArray(int i, org.hl7.fhir.Coding choice);
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "choice" element
     */
    org.hl7.fhir.Coding insertNewChoice(int i);
    
    /**
     * Appends and returns a new empty value (as xml) as the last "choice" element
     */
    org.hl7.fhir.Coding addNewChoice();
    
    /**
     * Removes the ith "choice" element
     */
    void removeChoice(int i);
    
    /**
     * Gets the "options" element
     */
    org.hl7.fhir.ResourceReference getOptions();
    
    /**
     * True if has "options" element
     */
    boolean isSetOptions();
    
    /**
     * Sets the "options" element
     */
    void setOptions(org.hl7.fhir.ResourceReference options);
    
    /**
     * Appends and returns a new empty "options" element
     */
    org.hl7.fhir.ResourceReference addNewOptions();
    
    /**
     * Unsets the "options" element
     */
    void unsetOptions();
    
    /**
     * Gets the "dataBoolean" element
     */
    org.hl7.fhir.Boolean getDataBoolean();
    
    /**
     * True if has "dataBoolean" element
     */
    boolean isSetDataBoolean();
    
    /**
     * Sets the "dataBoolean" element
     */
    void setDataBoolean(org.hl7.fhir.Boolean dataBoolean);
    
    /**
     * Appends and returns a new empty "dataBoolean" element
     */
    org.hl7.fhir.Boolean addNewDataBoolean();
    
    /**
     * Unsets the "dataBoolean" element
     */
    void unsetDataBoolean();
    
    /**
     * Gets the "dataInteger" element
     */
    org.hl7.fhir.Integer getDataInteger();
    
    /**
     * True if has "dataInteger" element
     */
    boolean isSetDataInteger();
    
    /**
     * Sets the "dataInteger" element
     */
    void setDataInteger(org.hl7.fhir.Integer dataInteger);
    
    /**
     * Appends and returns a new empty "dataInteger" element
     */
    org.hl7.fhir.Integer addNewDataInteger();
    
    /**
     * Unsets the "dataInteger" element
     */
    void unsetDataInteger();
    
    /**
     * Gets the "dataDecimal" element
     */
    org.hl7.fhir.Decimal getDataDecimal();
    
    /**
     * True if has "dataDecimal" element
     */
    boolean isSetDataDecimal();
    
    /**
     * Sets the "dataDecimal" element
     */
    void setDataDecimal(org.hl7.fhir.Decimal dataDecimal);
    
    /**
     * Appends and returns a new empty "dataDecimal" element
     */
    org.hl7.fhir.Decimal addNewDataDecimal();
    
    /**
     * Unsets the "dataDecimal" element
     */
    void unsetDataDecimal();
    
    /**
     * Gets the "dataBase64Binary" element
     */
    org.hl7.fhir.Base64Binary getDataBase64Binary();
    
    /**
     * True if has "dataBase64Binary" element
     */
    boolean isSetDataBase64Binary();
    
    /**
     * Sets the "dataBase64Binary" element
     */
    void setDataBase64Binary(org.hl7.fhir.Base64Binary dataBase64Binary);
    
    /**
     * Appends and returns a new empty "dataBase64Binary" element
     */
    org.hl7.fhir.Base64Binary addNewDataBase64Binary();
    
    /**
     * Unsets the "dataBase64Binary" element
     */
    void unsetDataBase64Binary();
    
    /**
     * Gets the "dataInstant" element
     */
    org.hl7.fhir.Instant getDataInstant();
    
    /**
     * True if has "dataInstant" element
     */
    boolean isSetDataInstant();
    
    /**
     * Sets the "dataInstant" element
     */
    void setDataInstant(org.hl7.fhir.Instant dataInstant);
    
    /**
     * Appends and returns a new empty "dataInstant" element
     */
    org.hl7.fhir.Instant addNewDataInstant();
    
    /**
     * Unsets the "dataInstant" element
     */
    void unsetDataInstant();
    
    /**
     * Gets the "dataString" element
     */
    org.hl7.fhir.String getDataString();
    
    /**
     * True if has "dataString" element
     */
    boolean isSetDataString();
    
    /**
     * Sets the "dataString" element
     */
    void setDataString(org.hl7.fhir.String dataString);
    
    /**
     * Appends and returns a new empty "dataString" element
     */
    org.hl7.fhir.String addNewDataString();
    
    /**
     * Unsets the "dataString" element
     */
    void unsetDataString();
    
    /**
     * Gets the "dataUri" element
     */
    org.hl7.fhir.Uri getDataUri();
    
    /**
     * True if has "dataUri" element
     */
    boolean isSetDataUri();
    
    /**
     * Sets the "dataUri" element
     */
    void setDataUri(org.hl7.fhir.Uri dataUri);
    
    /**
     * Appends and returns a new empty "dataUri" element
     */
    org.hl7.fhir.Uri addNewDataUri();
    
    /**
     * Unsets the "dataUri" element
     */
    void unsetDataUri();
    
    /**
     * Gets the "dataDate" element
     */
    org.hl7.fhir.Date getDataDate();
    
    /**
     * True if has "dataDate" element
     */
    boolean isSetDataDate();
    
    /**
     * Sets the "dataDate" element
     */
    void setDataDate(org.hl7.fhir.Date dataDate);
    
    /**
     * Appends and returns a new empty "dataDate" element
     */
    org.hl7.fhir.Date addNewDataDate();
    
    /**
     * Unsets the "dataDate" element
     */
    void unsetDataDate();
    
    /**
     * Gets the "dataDateTime" element
     */
    org.hl7.fhir.DateTime getDataDateTime();
    
    /**
     * True if has "dataDateTime" element
     */
    boolean isSetDataDateTime();
    
    /**
     * Sets the "dataDateTime" element
     */
    void setDataDateTime(org.hl7.fhir.DateTime dataDateTime);
    
    /**
     * Appends and returns a new empty "dataDateTime" element
     */
    org.hl7.fhir.DateTime addNewDataDateTime();
    
    /**
     * Unsets the "dataDateTime" element
     */
    void unsetDataDateTime();
    
    /**
     * Gets the "dataCode" element
     */
    org.hl7.fhir.Code getDataCode();
    
    /**
     * True if has "dataCode" element
     */
    boolean isSetDataCode();
    
    /**
     * Sets the "dataCode" element
     */
    void setDataCode(org.hl7.fhir.Code dataCode);
    
    /**
     * Appends and returns a new empty "dataCode" element
     */
    org.hl7.fhir.Code addNewDataCode();
    
    /**
     * Unsets the "dataCode" element
     */
    void unsetDataCode();
    
    /**
     * Gets the "dataOid" element
     */
    org.hl7.fhir.Oid getDataOid();
    
    /**
     * True if has "dataOid" element
     */
    boolean isSetDataOid();
    
    /**
     * Sets the "dataOid" element
     */
    void setDataOid(org.hl7.fhir.Oid dataOid);
    
    /**
     * Appends and returns a new empty "dataOid" element
     */
    org.hl7.fhir.Oid addNewDataOid();
    
    /**
     * Unsets the "dataOid" element
     */
    void unsetDataOid();
    
    /**
     * Gets the "dataUuid" element
     */
    org.hl7.fhir.Uuid getDataUuid();
    
    /**
     * True if has "dataUuid" element
     */
    boolean isSetDataUuid();
    
    /**
     * Sets the "dataUuid" element
     */
    void setDataUuid(org.hl7.fhir.Uuid dataUuid);
    
    /**
     * Appends and returns a new empty "dataUuid" element
     */
    org.hl7.fhir.Uuid addNewDataUuid();
    
    /**
     * Unsets the "dataUuid" element
     */
    void unsetDataUuid();
    
    /**
     * Gets the "dataId" element
     */
    org.hl7.fhir.Id getDataId();
    
    /**
     * True if has "dataId" element
     */
    boolean isSetDataId();
    
    /**
     * Sets the "dataId" element
     */
    void setDataId(org.hl7.fhir.Id dataId);
    
    /**
     * Appends and returns a new empty "dataId" element
     */
    org.hl7.fhir.Id addNewDataId();
    
    /**
     * Unsets the "dataId" element
     */
    void unsetDataId();
    
    /**
     * Gets the "dataAttachment" element
     */
    org.hl7.fhir.Attachment getDataAttachment();
    
    /**
     * True if has "dataAttachment" element
     */
    boolean isSetDataAttachment();
    
    /**
     * Sets the "dataAttachment" element
     */
    void setDataAttachment(org.hl7.fhir.Attachment dataAttachment);
    
    /**
     * Appends and returns a new empty "dataAttachment" element
     */
    org.hl7.fhir.Attachment addNewDataAttachment();
    
    /**
     * Unsets the "dataAttachment" element
     */
    void unsetDataAttachment();
    
    /**
     * Gets the "dataIdentifier" element
     */
    org.hl7.fhir.Identifier getDataIdentifier();
    
    /**
     * True if has "dataIdentifier" element
     */
    boolean isSetDataIdentifier();
    
    /**
     * Sets the "dataIdentifier" element
     */
    void setDataIdentifier(org.hl7.fhir.Identifier dataIdentifier);
    
    /**
     * Appends and returns a new empty "dataIdentifier" element
     */
    org.hl7.fhir.Identifier addNewDataIdentifier();
    
    /**
     * Unsets the "dataIdentifier" element
     */
    void unsetDataIdentifier();
    
    /**
     * Gets the "dataCodeableConcept" element
     */
    org.hl7.fhir.CodeableConcept getDataCodeableConcept();
    
    /**
     * True if has "dataCodeableConcept" element
     */
    boolean isSetDataCodeableConcept();
    
    /**
     * Sets the "dataCodeableConcept" element
     */
    void setDataCodeableConcept(org.hl7.fhir.CodeableConcept dataCodeableConcept);
    
    /**
     * Appends and returns a new empty "dataCodeableConcept" element
     */
    org.hl7.fhir.CodeableConcept addNewDataCodeableConcept();
    
    /**
     * Unsets the "dataCodeableConcept" element
     */
    void unsetDataCodeableConcept();
    
    /**
     * Gets the "dataCoding" element
     */
    org.hl7.fhir.Coding getDataCoding();
    
    /**
     * True if has "dataCoding" element
     */
    boolean isSetDataCoding();
    
    /**
     * Sets the "dataCoding" element
     */
    void setDataCoding(org.hl7.fhir.Coding dataCoding);
    
    /**
     * Appends and returns a new empty "dataCoding" element
     */
    org.hl7.fhir.Coding addNewDataCoding();
    
    /**
     * Unsets the "dataCoding" element
     */
    void unsetDataCoding();
    
    /**
     * Gets the "dataQuantity" element
     */
    org.hl7.fhir.Quantity getDataQuantity();
    
    /**
     * True if has "dataQuantity" element
     */
    boolean isSetDataQuantity();
    
    /**
     * Sets the "dataQuantity" element
     */
    void setDataQuantity(org.hl7.fhir.Quantity dataQuantity);
    
    /**
     * Appends and returns a new empty "dataQuantity" element
     */
    org.hl7.fhir.Quantity addNewDataQuantity();
    
    /**
     * Unsets the "dataQuantity" element
     */
    void unsetDataQuantity();
    
    /**
     * Gets the "dataRange" element
     */
    org.hl7.fhir.Range getDataRange();
    
    /**
     * True if has "dataRange" element
     */
    boolean isSetDataRange();
    
    /**
     * Sets the "dataRange" element
     */
    void setDataRange(org.hl7.fhir.Range dataRange);
    
    /**
     * Appends and returns a new empty "dataRange" element
     */
    org.hl7.fhir.Range addNewDataRange();
    
    /**
     * Unsets the "dataRange" element
     */
    void unsetDataRange();
    
    /**
     * Gets the "dataPeriod" element
     */
    org.hl7.fhir.Period getDataPeriod();
    
    /**
     * True if has "dataPeriod" element
     */
    boolean isSetDataPeriod();
    
    /**
     * Sets the "dataPeriod" element
     */
    void setDataPeriod(org.hl7.fhir.Period dataPeriod);
    
    /**
     * Appends and returns a new empty "dataPeriod" element
     */
    org.hl7.fhir.Period addNewDataPeriod();
    
    /**
     * Unsets the "dataPeriod" element
     */
    void unsetDataPeriod();
    
    /**
     * Gets the "dataRatio" element
     */
    org.hl7.fhir.Ratio getDataRatio();
    
    /**
     * True if has "dataRatio" element
     */
    boolean isSetDataRatio();
    
    /**
     * Sets the "dataRatio" element
     */
    void setDataRatio(org.hl7.fhir.Ratio dataRatio);
    
    /**
     * Appends and returns a new empty "dataRatio" element
     */
    org.hl7.fhir.Ratio addNewDataRatio();
    
    /**
     * Unsets the "dataRatio" element
     */
    void unsetDataRatio();
    
    /**
     * Gets the "dataResource" element
     */
    org.hl7.fhir.ResourceReference getDataResource();
    
    /**
     * True if has "dataResource" element
     */
    boolean isSetDataResource();
    
    /**
     * Sets the "dataResource" element
     */
    void setDataResource(org.hl7.fhir.ResourceReference dataResource);
    
    /**
     * Appends and returns a new empty "dataResource" element
     */
    org.hl7.fhir.ResourceReference addNewDataResource();
    
    /**
     * Unsets the "dataResource" element
     */
    void unsetDataResource();
    
    /**
     * Gets the "dataSampledData" element
     */
    org.hl7.fhir.SampledData getDataSampledData();
    
    /**
     * True if has "dataSampledData" element
     */
    boolean isSetDataSampledData();
    
    /**
     * Sets the "dataSampledData" element
     */
    void setDataSampledData(org.hl7.fhir.SampledData dataSampledData);
    
    /**
     * Appends and returns a new empty "dataSampledData" element
     */
    org.hl7.fhir.SampledData addNewDataSampledData();
    
    /**
     * Unsets the "dataSampledData" element
     */
    void unsetDataSampledData();
    
    /**
     * Gets the "dataHumanName" element
     */
    org.hl7.fhir.HumanName getDataHumanName();
    
    /**
     * True if has "dataHumanName" element
     */
    boolean isSetDataHumanName();
    
    /**
     * Sets the "dataHumanName" element
     */
    void setDataHumanName(org.hl7.fhir.HumanName dataHumanName);
    
    /**
     * Appends and returns a new empty "dataHumanName" element
     */
    org.hl7.fhir.HumanName addNewDataHumanName();
    
    /**
     * Unsets the "dataHumanName" element
     */
    void unsetDataHumanName();
    
    /**
     * Gets the "dataAddress" element
     */
    org.hl7.fhir.Address getDataAddress();
    
    /**
     * True if has "dataAddress" element
     */
    boolean isSetDataAddress();
    
    /**
     * Sets the "dataAddress" element
     */
    void setDataAddress(org.hl7.fhir.Address dataAddress);
    
    /**
     * Appends and returns a new empty "dataAddress" element
     */
    org.hl7.fhir.Address addNewDataAddress();
    
    /**
     * Unsets the "dataAddress" element
     */
    void unsetDataAddress();
    
    /**
     * Gets the "dataContact" element
     */
    org.hl7.fhir.Contact getDataContact();
    
    /**
     * True if has "dataContact" element
     */
    boolean isSetDataContact();
    
    /**
     * Sets the "dataContact" element
     */
    void setDataContact(org.hl7.fhir.Contact dataContact);
    
    /**
     * Appends and returns a new empty "dataContact" element
     */
    org.hl7.fhir.Contact addNewDataContact();
    
    /**
     * Unsets the "dataContact" element
     */
    void unsetDataContact();
    
    /**
     * Gets the "dataSchedule" element
     */
    org.hl7.fhir.Schedule getDataSchedule();
    
    /**
     * True if has "dataSchedule" element
     */
    boolean isSetDataSchedule();
    
    /**
     * Sets the "dataSchedule" element
     */
    void setDataSchedule(org.hl7.fhir.Schedule dataSchedule);
    
    /**
     * Appends and returns a new empty "dataSchedule" element
     */
    org.hl7.fhir.Schedule addNewDataSchedule();
    
    /**
     * Unsets the "dataSchedule" element
     */
    void unsetDataSchedule();
    
    /**
     * Gets the "remarks" element
     */
    org.hl7.fhir.String getRemarks();
    
    /**
     * True if has "remarks" element
     */
    boolean isSetRemarks();
    
    /**
     * Sets the "remarks" element
     */
    void setRemarks(org.hl7.fhir.String remarks);
    
    /**
     * Appends and returns a new empty "remarks" element
     */
    org.hl7.fhir.String addNewRemarks();
    
    /**
     * Unsets the "remarks" element
     */
    void unsetRemarks();
    
    /**
     * Gets array of all "group" elements
     */
    org.hl7.fhir.QuestionnaireGroup[] getGroupArray();
    
    /**
     * Gets ith "group" element
     */
    org.hl7.fhir.QuestionnaireGroup getGroupArray(int i);
    
    /**
     * Returns number of "group" element
     */
    int sizeOfGroupArray();
    
    /**
     * Sets array of all "group" element
     */
    void setGroupArray(org.hl7.fhir.QuestionnaireGroup[] groupArray);
    
    /**
     * Sets ith "group" element
     */
    void setGroupArray(int i, org.hl7.fhir.QuestionnaireGroup group);
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "group" element
     */
    org.hl7.fhir.QuestionnaireGroup insertNewGroup(int i);
    
    /**
     * Appends and returns a new empty value (as xml) as the last "group" element
     */
    org.hl7.fhir.QuestionnaireGroup addNewGroup();
    
    /**
     * Removes the ith "group" element
     */
    void removeGroup(int i);
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static org.hl7.fhir.QuestionnaireQuestion newInstance() {
          return (org.hl7.fhir.QuestionnaireQuestion) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static org.hl7.fhir.QuestionnaireQuestion newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (org.hl7.fhir.QuestionnaireQuestion) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static org.hl7.fhir.QuestionnaireQuestion parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (org.hl7.fhir.QuestionnaireQuestion) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static org.hl7.fhir.QuestionnaireQuestion parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.hl7.fhir.QuestionnaireQuestion) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static org.hl7.fhir.QuestionnaireQuestion parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.hl7.fhir.QuestionnaireQuestion) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static org.hl7.fhir.QuestionnaireQuestion parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.hl7.fhir.QuestionnaireQuestion) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static org.hl7.fhir.QuestionnaireQuestion parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.hl7.fhir.QuestionnaireQuestion) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static org.hl7.fhir.QuestionnaireQuestion parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.hl7.fhir.QuestionnaireQuestion) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static org.hl7.fhir.QuestionnaireQuestion parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.hl7.fhir.QuestionnaireQuestion) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static org.hl7.fhir.QuestionnaireQuestion parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.hl7.fhir.QuestionnaireQuestion) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static org.hl7.fhir.QuestionnaireQuestion parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.hl7.fhir.QuestionnaireQuestion) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static org.hl7.fhir.QuestionnaireQuestion parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.hl7.fhir.QuestionnaireQuestion) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static org.hl7.fhir.QuestionnaireQuestion parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (org.hl7.fhir.QuestionnaireQuestion) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static org.hl7.fhir.QuestionnaireQuestion parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.hl7.fhir.QuestionnaireQuestion) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static org.hl7.fhir.QuestionnaireQuestion parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (org.hl7.fhir.QuestionnaireQuestion) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static org.hl7.fhir.QuestionnaireQuestion parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.hl7.fhir.QuestionnaireQuestion) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.hl7.fhir.QuestionnaireQuestion parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (org.hl7.fhir.QuestionnaireQuestion) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.hl7.fhir.QuestionnaireQuestion parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (org.hl7.fhir.QuestionnaireQuestion) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
