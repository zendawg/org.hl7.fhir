/*
 * XML Type:  Profile.Definition
 * Namespace: http://hl7.org/fhir
 * Java type: org.hl7.fhir.ProfileDefinition
 *
 * Automatically generated - do not modify.
 */
package org.hl7.fhir;


/**
 * An XML Profile.Definition(@http://hl7.org/fhir).
 *
 * This is a complex type.
 */
public interface ProfileDefinition extends org.hl7.fhir.BackboneElement
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(ProfileDefinition.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s92E42043E21BA03841BD964CC980A9AA").resolveHandle("profiledefinition8704type");
    
    /**
     * Gets the "short" element
     */
    org.hl7.fhir.String getShort();
    
    /**
     * Sets the "short" element
     */
    void setShort(org.hl7.fhir.String xshort);
    
    /**
     * Appends and returns a new empty "short" element
     */
    org.hl7.fhir.String addNewShort();
    
    /**
     * Gets the "formal" element
     */
    org.hl7.fhir.String getFormal();
    
    /**
     * Sets the "formal" element
     */
    void setFormal(org.hl7.fhir.String formal);
    
    /**
     * Appends and returns a new empty "formal" element
     */
    org.hl7.fhir.String addNewFormal();
    
    /**
     * Gets the "comments" element
     */
    org.hl7.fhir.String getComments();
    
    /**
     * True if has "comments" element
     */
    boolean isSetComments();
    
    /**
     * Sets the "comments" element
     */
    void setComments(org.hl7.fhir.String comments);
    
    /**
     * Appends and returns a new empty "comments" element
     */
    org.hl7.fhir.String addNewComments();
    
    /**
     * Unsets the "comments" element
     */
    void unsetComments();
    
    /**
     * Gets the "requirements" element
     */
    org.hl7.fhir.String getRequirements();
    
    /**
     * True if has "requirements" element
     */
    boolean isSetRequirements();
    
    /**
     * Sets the "requirements" element
     */
    void setRequirements(org.hl7.fhir.String requirements);
    
    /**
     * Appends and returns a new empty "requirements" element
     */
    org.hl7.fhir.String addNewRequirements();
    
    /**
     * Unsets the "requirements" element
     */
    void unsetRequirements();
    
    /**
     * Gets array of all "synonym" elements
     */
    org.hl7.fhir.String[] getSynonymArray();
    
    /**
     * Gets ith "synonym" element
     */
    org.hl7.fhir.String getSynonymArray(int i);
    
    /**
     * Returns number of "synonym" element
     */
    int sizeOfSynonymArray();
    
    /**
     * Sets array of all "synonym" element
     */
    void setSynonymArray(org.hl7.fhir.String[] synonymArray);
    
    /**
     * Sets ith "synonym" element
     */
    void setSynonymArray(int i, org.hl7.fhir.String synonym);
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "synonym" element
     */
    org.hl7.fhir.String insertNewSynonym(int i);
    
    /**
     * Appends and returns a new empty value (as xml) as the last "synonym" element
     */
    org.hl7.fhir.String addNewSynonym();
    
    /**
     * Removes the ith "synonym" element
     */
    void removeSynonym(int i);
    
    /**
     * Gets the "min" element
     */
    org.hl7.fhir.Integer getMin();
    
    /**
     * Sets the "min" element
     */
    void setMin(org.hl7.fhir.Integer min);
    
    /**
     * Appends and returns a new empty "min" element
     */
    org.hl7.fhir.Integer addNewMin();
    
    /**
     * Gets the "max" element
     */
    org.hl7.fhir.String getMax();
    
    /**
     * Sets the "max" element
     */
    void setMax(org.hl7.fhir.String max);
    
    /**
     * Appends and returns a new empty "max" element
     */
    org.hl7.fhir.String addNewMax();
    
    /**
     * Gets array of all "type" elements
     */
    org.hl7.fhir.ProfileType[] getTypeArray();
    
    /**
     * Gets ith "type" element
     */
    org.hl7.fhir.ProfileType getTypeArray(int i);
    
    /**
     * Returns number of "type" element
     */
    int sizeOfTypeArray();
    
    /**
     * Sets array of all "type" element
     */
    void setTypeArray(org.hl7.fhir.ProfileType[] typeArray);
    
    /**
     * Sets ith "type" element
     */
    void setTypeArray(int i, org.hl7.fhir.ProfileType type);
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "type" element
     */
    org.hl7.fhir.ProfileType insertNewType(int i);
    
    /**
     * Appends and returns a new empty value (as xml) as the last "type" element
     */
    org.hl7.fhir.ProfileType addNewType();
    
    /**
     * Removes the ith "type" element
     */
    void removeType(int i);
    
    /**
     * Gets the "nameReference" element
     */
    org.hl7.fhir.String getNameReference();
    
    /**
     * True if has "nameReference" element
     */
    boolean isSetNameReference();
    
    /**
     * Sets the "nameReference" element
     */
    void setNameReference(org.hl7.fhir.String nameReference);
    
    /**
     * Appends and returns a new empty "nameReference" element
     */
    org.hl7.fhir.String addNewNameReference();
    
    /**
     * Unsets the "nameReference" element
     */
    void unsetNameReference();
    
    /**
     * Gets the "valueBoolean" element
     */
    org.hl7.fhir.Boolean getValueBoolean();
    
    /**
     * True if has "valueBoolean" element
     */
    boolean isSetValueBoolean();
    
    /**
     * Sets the "valueBoolean" element
     */
    void setValueBoolean(org.hl7.fhir.Boolean valueBoolean);
    
    /**
     * Appends and returns a new empty "valueBoolean" element
     */
    org.hl7.fhir.Boolean addNewValueBoolean();
    
    /**
     * Unsets the "valueBoolean" element
     */
    void unsetValueBoolean();
    
    /**
     * Gets the "valueInteger" element
     */
    org.hl7.fhir.Integer getValueInteger();
    
    /**
     * True if has "valueInteger" element
     */
    boolean isSetValueInteger();
    
    /**
     * Sets the "valueInteger" element
     */
    void setValueInteger(org.hl7.fhir.Integer valueInteger);
    
    /**
     * Appends and returns a new empty "valueInteger" element
     */
    org.hl7.fhir.Integer addNewValueInteger();
    
    /**
     * Unsets the "valueInteger" element
     */
    void unsetValueInteger();
    
    /**
     * Gets the "valueDecimal" element
     */
    org.hl7.fhir.Decimal getValueDecimal();
    
    /**
     * True if has "valueDecimal" element
     */
    boolean isSetValueDecimal();
    
    /**
     * Sets the "valueDecimal" element
     */
    void setValueDecimal(org.hl7.fhir.Decimal valueDecimal);
    
    /**
     * Appends and returns a new empty "valueDecimal" element
     */
    org.hl7.fhir.Decimal addNewValueDecimal();
    
    /**
     * Unsets the "valueDecimal" element
     */
    void unsetValueDecimal();
    
    /**
     * Gets the "valueBase64Binary" element
     */
    org.hl7.fhir.Base64Binary getValueBase64Binary();
    
    /**
     * True if has "valueBase64Binary" element
     */
    boolean isSetValueBase64Binary();
    
    /**
     * Sets the "valueBase64Binary" element
     */
    void setValueBase64Binary(org.hl7.fhir.Base64Binary valueBase64Binary);
    
    /**
     * Appends and returns a new empty "valueBase64Binary" element
     */
    org.hl7.fhir.Base64Binary addNewValueBase64Binary();
    
    /**
     * Unsets the "valueBase64Binary" element
     */
    void unsetValueBase64Binary();
    
    /**
     * Gets the "valueInstant" element
     */
    org.hl7.fhir.Instant getValueInstant();
    
    /**
     * True if has "valueInstant" element
     */
    boolean isSetValueInstant();
    
    /**
     * Sets the "valueInstant" element
     */
    void setValueInstant(org.hl7.fhir.Instant valueInstant);
    
    /**
     * Appends and returns a new empty "valueInstant" element
     */
    org.hl7.fhir.Instant addNewValueInstant();
    
    /**
     * Unsets the "valueInstant" element
     */
    void unsetValueInstant();
    
    /**
     * Gets the "valueString" element
     */
    org.hl7.fhir.String getValueString();
    
    /**
     * True if has "valueString" element
     */
    boolean isSetValueString();
    
    /**
     * Sets the "valueString" element
     */
    void setValueString(org.hl7.fhir.String valueString);
    
    /**
     * Appends and returns a new empty "valueString" element
     */
    org.hl7.fhir.String addNewValueString();
    
    /**
     * Unsets the "valueString" element
     */
    void unsetValueString();
    
    /**
     * Gets the "valueUri" element
     */
    org.hl7.fhir.Uri getValueUri();
    
    /**
     * True if has "valueUri" element
     */
    boolean isSetValueUri();
    
    /**
     * Sets the "valueUri" element
     */
    void setValueUri(org.hl7.fhir.Uri valueUri);
    
    /**
     * Appends and returns a new empty "valueUri" element
     */
    org.hl7.fhir.Uri addNewValueUri();
    
    /**
     * Unsets the "valueUri" element
     */
    void unsetValueUri();
    
    /**
     * Gets the "valueDate" element
     */
    org.hl7.fhir.Date getValueDate();
    
    /**
     * True if has "valueDate" element
     */
    boolean isSetValueDate();
    
    /**
     * Sets the "valueDate" element
     */
    void setValueDate(org.hl7.fhir.Date valueDate);
    
    /**
     * Appends and returns a new empty "valueDate" element
     */
    org.hl7.fhir.Date addNewValueDate();
    
    /**
     * Unsets the "valueDate" element
     */
    void unsetValueDate();
    
    /**
     * Gets the "valueDateTime" element
     */
    org.hl7.fhir.DateTime getValueDateTime();
    
    /**
     * True if has "valueDateTime" element
     */
    boolean isSetValueDateTime();
    
    /**
     * Sets the "valueDateTime" element
     */
    void setValueDateTime(org.hl7.fhir.DateTime valueDateTime);
    
    /**
     * Appends and returns a new empty "valueDateTime" element
     */
    org.hl7.fhir.DateTime addNewValueDateTime();
    
    /**
     * Unsets the "valueDateTime" element
     */
    void unsetValueDateTime();
    
    /**
     * Gets the "valueCode" element
     */
    org.hl7.fhir.Code getValueCode();
    
    /**
     * True if has "valueCode" element
     */
    boolean isSetValueCode();
    
    /**
     * Sets the "valueCode" element
     */
    void setValueCode(org.hl7.fhir.Code valueCode);
    
    /**
     * Appends and returns a new empty "valueCode" element
     */
    org.hl7.fhir.Code addNewValueCode();
    
    /**
     * Unsets the "valueCode" element
     */
    void unsetValueCode();
    
    /**
     * Gets the "valueOid" element
     */
    org.hl7.fhir.Oid getValueOid();
    
    /**
     * True if has "valueOid" element
     */
    boolean isSetValueOid();
    
    /**
     * Sets the "valueOid" element
     */
    void setValueOid(org.hl7.fhir.Oid valueOid);
    
    /**
     * Appends and returns a new empty "valueOid" element
     */
    org.hl7.fhir.Oid addNewValueOid();
    
    /**
     * Unsets the "valueOid" element
     */
    void unsetValueOid();
    
    /**
     * Gets the "valueUuid" element
     */
    org.hl7.fhir.Uuid getValueUuid();
    
    /**
     * True if has "valueUuid" element
     */
    boolean isSetValueUuid();
    
    /**
     * Sets the "valueUuid" element
     */
    void setValueUuid(org.hl7.fhir.Uuid valueUuid);
    
    /**
     * Appends and returns a new empty "valueUuid" element
     */
    org.hl7.fhir.Uuid addNewValueUuid();
    
    /**
     * Unsets the "valueUuid" element
     */
    void unsetValueUuid();
    
    /**
     * Gets the "valueId" element
     */
    org.hl7.fhir.Id getValueId();
    
    /**
     * True if has "valueId" element
     */
    boolean isSetValueId();
    
    /**
     * Sets the "valueId" element
     */
    void setValueId(org.hl7.fhir.Id valueId);
    
    /**
     * Appends and returns a new empty "valueId" element
     */
    org.hl7.fhir.Id addNewValueId();
    
    /**
     * Unsets the "valueId" element
     */
    void unsetValueId();
    
    /**
     * Gets the "valueAttachment" element
     */
    org.hl7.fhir.Attachment getValueAttachment();
    
    /**
     * True if has "valueAttachment" element
     */
    boolean isSetValueAttachment();
    
    /**
     * Sets the "valueAttachment" element
     */
    void setValueAttachment(org.hl7.fhir.Attachment valueAttachment);
    
    /**
     * Appends and returns a new empty "valueAttachment" element
     */
    org.hl7.fhir.Attachment addNewValueAttachment();
    
    /**
     * Unsets the "valueAttachment" element
     */
    void unsetValueAttachment();
    
    /**
     * Gets the "valueIdentifier" element
     */
    org.hl7.fhir.Identifier getValueIdentifier();
    
    /**
     * True if has "valueIdentifier" element
     */
    boolean isSetValueIdentifier();
    
    /**
     * Sets the "valueIdentifier" element
     */
    void setValueIdentifier(org.hl7.fhir.Identifier valueIdentifier);
    
    /**
     * Appends and returns a new empty "valueIdentifier" element
     */
    org.hl7.fhir.Identifier addNewValueIdentifier();
    
    /**
     * Unsets the "valueIdentifier" element
     */
    void unsetValueIdentifier();
    
    /**
     * Gets the "valueCodeableConcept" element
     */
    org.hl7.fhir.CodeableConcept getValueCodeableConcept();
    
    /**
     * True if has "valueCodeableConcept" element
     */
    boolean isSetValueCodeableConcept();
    
    /**
     * Sets the "valueCodeableConcept" element
     */
    void setValueCodeableConcept(org.hl7.fhir.CodeableConcept valueCodeableConcept);
    
    /**
     * Appends and returns a new empty "valueCodeableConcept" element
     */
    org.hl7.fhir.CodeableConcept addNewValueCodeableConcept();
    
    /**
     * Unsets the "valueCodeableConcept" element
     */
    void unsetValueCodeableConcept();
    
    /**
     * Gets the "valueCoding" element
     */
    org.hl7.fhir.Coding getValueCoding();
    
    /**
     * True if has "valueCoding" element
     */
    boolean isSetValueCoding();
    
    /**
     * Sets the "valueCoding" element
     */
    void setValueCoding(org.hl7.fhir.Coding valueCoding);
    
    /**
     * Appends and returns a new empty "valueCoding" element
     */
    org.hl7.fhir.Coding addNewValueCoding();
    
    /**
     * Unsets the "valueCoding" element
     */
    void unsetValueCoding();
    
    /**
     * Gets the "valueQuantity" element
     */
    org.hl7.fhir.Quantity getValueQuantity();
    
    /**
     * True if has "valueQuantity" element
     */
    boolean isSetValueQuantity();
    
    /**
     * Sets the "valueQuantity" element
     */
    void setValueQuantity(org.hl7.fhir.Quantity valueQuantity);
    
    /**
     * Appends and returns a new empty "valueQuantity" element
     */
    org.hl7.fhir.Quantity addNewValueQuantity();
    
    /**
     * Unsets the "valueQuantity" element
     */
    void unsetValueQuantity();
    
    /**
     * Gets the "valueRange" element
     */
    org.hl7.fhir.Range getValueRange();
    
    /**
     * True if has "valueRange" element
     */
    boolean isSetValueRange();
    
    /**
     * Sets the "valueRange" element
     */
    void setValueRange(org.hl7.fhir.Range valueRange);
    
    /**
     * Appends and returns a new empty "valueRange" element
     */
    org.hl7.fhir.Range addNewValueRange();
    
    /**
     * Unsets the "valueRange" element
     */
    void unsetValueRange();
    
    /**
     * Gets the "valuePeriod" element
     */
    org.hl7.fhir.Period getValuePeriod();
    
    /**
     * True if has "valuePeriod" element
     */
    boolean isSetValuePeriod();
    
    /**
     * Sets the "valuePeriod" element
     */
    void setValuePeriod(org.hl7.fhir.Period valuePeriod);
    
    /**
     * Appends and returns a new empty "valuePeriod" element
     */
    org.hl7.fhir.Period addNewValuePeriod();
    
    /**
     * Unsets the "valuePeriod" element
     */
    void unsetValuePeriod();
    
    /**
     * Gets the "valueRatio" element
     */
    org.hl7.fhir.Ratio getValueRatio();
    
    /**
     * True if has "valueRatio" element
     */
    boolean isSetValueRatio();
    
    /**
     * Sets the "valueRatio" element
     */
    void setValueRatio(org.hl7.fhir.Ratio valueRatio);
    
    /**
     * Appends and returns a new empty "valueRatio" element
     */
    org.hl7.fhir.Ratio addNewValueRatio();
    
    /**
     * Unsets the "valueRatio" element
     */
    void unsetValueRatio();
    
    /**
     * Gets the "valueResource" element
     */
    org.hl7.fhir.ResourceReference getValueResource();
    
    /**
     * True if has "valueResource" element
     */
    boolean isSetValueResource();
    
    /**
     * Sets the "valueResource" element
     */
    void setValueResource(org.hl7.fhir.ResourceReference valueResource);
    
    /**
     * Appends and returns a new empty "valueResource" element
     */
    org.hl7.fhir.ResourceReference addNewValueResource();
    
    /**
     * Unsets the "valueResource" element
     */
    void unsetValueResource();
    
    /**
     * Gets the "valueSampledData" element
     */
    org.hl7.fhir.SampledData getValueSampledData();
    
    /**
     * True if has "valueSampledData" element
     */
    boolean isSetValueSampledData();
    
    /**
     * Sets the "valueSampledData" element
     */
    void setValueSampledData(org.hl7.fhir.SampledData valueSampledData);
    
    /**
     * Appends and returns a new empty "valueSampledData" element
     */
    org.hl7.fhir.SampledData addNewValueSampledData();
    
    /**
     * Unsets the "valueSampledData" element
     */
    void unsetValueSampledData();
    
    /**
     * Gets the "valueHumanName" element
     */
    org.hl7.fhir.HumanName getValueHumanName();
    
    /**
     * True if has "valueHumanName" element
     */
    boolean isSetValueHumanName();
    
    /**
     * Sets the "valueHumanName" element
     */
    void setValueHumanName(org.hl7.fhir.HumanName valueHumanName);
    
    /**
     * Appends and returns a new empty "valueHumanName" element
     */
    org.hl7.fhir.HumanName addNewValueHumanName();
    
    /**
     * Unsets the "valueHumanName" element
     */
    void unsetValueHumanName();
    
    /**
     * Gets the "valueAddress" element
     */
    org.hl7.fhir.Address getValueAddress();
    
    /**
     * True if has "valueAddress" element
     */
    boolean isSetValueAddress();
    
    /**
     * Sets the "valueAddress" element
     */
    void setValueAddress(org.hl7.fhir.Address valueAddress);
    
    /**
     * Appends and returns a new empty "valueAddress" element
     */
    org.hl7.fhir.Address addNewValueAddress();
    
    /**
     * Unsets the "valueAddress" element
     */
    void unsetValueAddress();
    
    /**
     * Gets the "valueContact" element
     */
    org.hl7.fhir.Contact getValueContact();
    
    /**
     * True if has "valueContact" element
     */
    boolean isSetValueContact();
    
    /**
     * Sets the "valueContact" element
     */
    void setValueContact(org.hl7.fhir.Contact valueContact);
    
    /**
     * Appends and returns a new empty "valueContact" element
     */
    org.hl7.fhir.Contact addNewValueContact();
    
    /**
     * Unsets the "valueContact" element
     */
    void unsetValueContact();
    
    /**
     * Gets the "valueSchedule" element
     */
    org.hl7.fhir.Schedule getValueSchedule();
    
    /**
     * True if has "valueSchedule" element
     */
    boolean isSetValueSchedule();
    
    /**
     * Sets the "valueSchedule" element
     */
    void setValueSchedule(org.hl7.fhir.Schedule valueSchedule);
    
    /**
     * Appends and returns a new empty "valueSchedule" element
     */
    org.hl7.fhir.Schedule addNewValueSchedule();
    
    /**
     * Unsets the "valueSchedule" element
     */
    void unsetValueSchedule();
    
    /**
     * Gets the "exampleBoolean" element
     */
    org.hl7.fhir.Boolean getExampleBoolean();
    
    /**
     * True if has "exampleBoolean" element
     */
    boolean isSetExampleBoolean();
    
    /**
     * Sets the "exampleBoolean" element
     */
    void setExampleBoolean(org.hl7.fhir.Boolean exampleBoolean);
    
    /**
     * Appends and returns a new empty "exampleBoolean" element
     */
    org.hl7.fhir.Boolean addNewExampleBoolean();
    
    /**
     * Unsets the "exampleBoolean" element
     */
    void unsetExampleBoolean();
    
    /**
     * Gets the "exampleInteger" element
     */
    org.hl7.fhir.Integer getExampleInteger();
    
    /**
     * True if has "exampleInteger" element
     */
    boolean isSetExampleInteger();
    
    /**
     * Sets the "exampleInteger" element
     */
    void setExampleInteger(org.hl7.fhir.Integer exampleInteger);
    
    /**
     * Appends and returns a new empty "exampleInteger" element
     */
    org.hl7.fhir.Integer addNewExampleInteger();
    
    /**
     * Unsets the "exampleInteger" element
     */
    void unsetExampleInteger();
    
    /**
     * Gets the "exampleDecimal" element
     */
    org.hl7.fhir.Decimal getExampleDecimal();
    
    /**
     * True if has "exampleDecimal" element
     */
    boolean isSetExampleDecimal();
    
    /**
     * Sets the "exampleDecimal" element
     */
    void setExampleDecimal(org.hl7.fhir.Decimal exampleDecimal);
    
    /**
     * Appends and returns a new empty "exampleDecimal" element
     */
    org.hl7.fhir.Decimal addNewExampleDecimal();
    
    /**
     * Unsets the "exampleDecimal" element
     */
    void unsetExampleDecimal();
    
    /**
     * Gets the "exampleBase64Binary" element
     */
    org.hl7.fhir.Base64Binary getExampleBase64Binary();
    
    /**
     * True if has "exampleBase64Binary" element
     */
    boolean isSetExampleBase64Binary();
    
    /**
     * Sets the "exampleBase64Binary" element
     */
    void setExampleBase64Binary(org.hl7.fhir.Base64Binary exampleBase64Binary);
    
    /**
     * Appends and returns a new empty "exampleBase64Binary" element
     */
    org.hl7.fhir.Base64Binary addNewExampleBase64Binary();
    
    /**
     * Unsets the "exampleBase64Binary" element
     */
    void unsetExampleBase64Binary();
    
    /**
     * Gets the "exampleInstant" element
     */
    org.hl7.fhir.Instant getExampleInstant();
    
    /**
     * True if has "exampleInstant" element
     */
    boolean isSetExampleInstant();
    
    /**
     * Sets the "exampleInstant" element
     */
    void setExampleInstant(org.hl7.fhir.Instant exampleInstant);
    
    /**
     * Appends and returns a new empty "exampleInstant" element
     */
    org.hl7.fhir.Instant addNewExampleInstant();
    
    /**
     * Unsets the "exampleInstant" element
     */
    void unsetExampleInstant();
    
    /**
     * Gets the "exampleString" element
     */
    org.hl7.fhir.String getExampleString();
    
    /**
     * True if has "exampleString" element
     */
    boolean isSetExampleString();
    
    /**
     * Sets the "exampleString" element
     */
    void setExampleString(org.hl7.fhir.String exampleString);
    
    /**
     * Appends and returns a new empty "exampleString" element
     */
    org.hl7.fhir.String addNewExampleString();
    
    /**
     * Unsets the "exampleString" element
     */
    void unsetExampleString();
    
    /**
     * Gets the "exampleUri" element
     */
    org.hl7.fhir.Uri getExampleUri();
    
    /**
     * True if has "exampleUri" element
     */
    boolean isSetExampleUri();
    
    /**
     * Sets the "exampleUri" element
     */
    void setExampleUri(org.hl7.fhir.Uri exampleUri);
    
    /**
     * Appends and returns a new empty "exampleUri" element
     */
    org.hl7.fhir.Uri addNewExampleUri();
    
    /**
     * Unsets the "exampleUri" element
     */
    void unsetExampleUri();
    
    /**
     * Gets the "exampleDate" element
     */
    org.hl7.fhir.Date getExampleDate();
    
    /**
     * True if has "exampleDate" element
     */
    boolean isSetExampleDate();
    
    /**
     * Sets the "exampleDate" element
     */
    void setExampleDate(org.hl7.fhir.Date exampleDate);
    
    /**
     * Appends and returns a new empty "exampleDate" element
     */
    org.hl7.fhir.Date addNewExampleDate();
    
    /**
     * Unsets the "exampleDate" element
     */
    void unsetExampleDate();
    
    /**
     * Gets the "exampleDateTime" element
     */
    org.hl7.fhir.DateTime getExampleDateTime();
    
    /**
     * True if has "exampleDateTime" element
     */
    boolean isSetExampleDateTime();
    
    /**
     * Sets the "exampleDateTime" element
     */
    void setExampleDateTime(org.hl7.fhir.DateTime exampleDateTime);
    
    /**
     * Appends and returns a new empty "exampleDateTime" element
     */
    org.hl7.fhir.DateTime addNewExampleDateTime();
    
    /**
     * Unsets the "exampleDateTime" element
     */
    void unsetExampleDateTime();
    
    /**
     * Gets the "exampleCode" element
     */
    org.hl7.fhir.Code getExampleCode();
    
    /**
     * True if has "exampleCode" element
     */
    boolean isSetExampleCode();
    
    /**
     * Sets the "exampleCode" element
     */
    void setExampleCode(org.hl7.fhir.Code exampleCode);
    
    /**
     * Appends and returns a new empty "exampleCode" element
     */
    org.hl7.fhir.Code addNewExampleCode();
    
    /**
     * Unsets the "exampleCode" element
     */
    void unsetExampleCode();
    
    /**
     * Gets the "exampleOid" element
     */
    org.hl7.fhir.Oid getExampleOid();
    
    /**
     * True if has "exampleOid" element
     */
    boolean isSetExampleOid();
    
    /**
     * Sets the "exampleOid" element
     */
    void setExampleOid(org.hl7.fhir.Oid exampleOid);
    
    /**
     * Appends and returns a new empty "exampleOid" element
     */
    org.hl7.fhir.Oid addNewExampleOid();
    
    /**
     * Unsets the "exampleOid" element
     */
    void unsetExampleOid();
    
    /**
     * Gets the "exampleUuid" element
     */
    org.hl7.fhir.Uuid getExampleUuid();
    
    /**
     * True if has "exampleUuid" element
     */
    boolean isSetExampleUuid();
    
    /**
     * Sets the "exampleUuid" element
     */
    void setExampleUuid(org.hl7.fhir.Uuid exampleUuid);
    
    /**
     * Appends and returns a new empty "exampleUuid" element
     */
    org.hl7.fhir.Uuid addNewExampleUuid();
    
    /**
     * Unsets the "exampleUuid" element
     */
    void unsetExampleUuid();
    
    /**
     * Gets the "exampleId" element
     */
    org.hl7.fhir.Id getExampleId();
    
    /**
     * True if has "exampleId" element
     */
    boolean isSetExampleId();
    
    /**
     * Sets the "exampleId" element
     */
    void setExampleId(org.hl7.fhir.Id exampleId);
    
    /**
     * Appends and returns a new empty "exampleId" element
     */
    org.hl7.fhir.Id addNewExampleId();
    
    /**
     * Unsets the "exampleId" element
     */
    void unsetExampleId();
    
    /**
     * Gets the "exampleAttachment" element
     */
    org.hl7.fhir.Attachment getExampleAttachment();
    
    /**
     * True if has "exampleAttachment" element
     */
    boolean isSetExampleAttachment();
    
    /**
     * Sets the "exampleAttachment" element
     */
    void setExampleAttachment(org.hl7.fhir.Attachment exampleAttachment);
    
    /**
     * Appends and returns a new empty "exampleAttachment" element
     */
    org.hl7.fhir.Attachment addNewExampleAttachment();
    
    /**
     * Unsets the "exampleAttachment" element
     */
    void unsetExampleAttachment();
    
    /**
     * Gets the "exampleIdentifier" element
     */
    org.hl7.fhir.Identifier getExampleIdentifier();
    
    /**
     * True if has "exampleIdentifier" element
     */
    boolean isSetExampleIdentifier();
    
    /**
     * Sets the "exampleIdentifier" element
     */
    void setExampleIdentifier(org.hl7.fhir.Identifier exampleIdentifier);
    
    /**
     * Appends and returns a new empty "exampleIdentifier" element
     */
    org.hl7.fhir.Identifier addNewExampleIdentifier();
    
    /**
     * Unsets the "exampleIdentifier" element
     */
    void unsetExampleIdentifier();
    
    /**
     * Gets the "exampleCodeableConcept" element
     */
    org.hl7.fhir.CodeableConcept getExampleCodeableConcept();
    
    /**
     * True if has "exampleCodeableConcept" element
     */
    boolean isSetExampleCodeableConcept();
    
    /**
     * Sets the "exampleCodeableConcept" element
     */
    void setExampleCodeableConcept(org.hl7.fhir.CodeableConcept exampleCodeableConcept);
    
    /**
     * Appends and returns a new empty "exampleCodeableConcept" element
     */
    org.hl7.fhir.CodeableConcept addNewExampleCodeableConcept();
    
    /**
     * Unsets the "exampleCodeableConcept" element
     */
    void unsetExampleCodeableConcept();
    
    /**
     * Gets the "exampleCoding" element
     */
    org.hl7.fhir.Coding getExampleCoding();
    
    /**
     * True if has "exampleCoding" element
     */
    boolean isSetExampleCoding();
    
    /**
     * Sets the "exampleCoding" element
     */
    void setExampleCoding(org.hl7.fhir.Coding exampleCoding);
    
    /**
     * Appends and returns a new empty "exampleCoding" element
     */
    org.hl7.fhir.Coding addNewExampleCoding();
    
    /**
     * Unsets the "exampleCoding" element
     */
    void unsetExampleCoding();
    
    /**
     * Gets the "exampleQuantity" element
     */
    org.hl7.fhir.Quantity getExampleQuantity();
    
    /**
     * True if has "exampleQuantity" element
     */
    boolean isSetExampleQuantity();
    
    /**
     * Sets the "exampleQuantity" element
     */
    void setExampleQuantity(org.hl7.fhir.Quantity exampleQuantity);
    
    /**
     * Appends and returns a new empty "exampleQuantity" element
     */
    org.hl7.fhir.Quantity addNewExampleQuantity();
    
    /**
     * Unsets the "exampleQuantity" element
     */
    void unsetExampleQuantity();
    
    /**
     * Gets the "exampleRange" element
     */
    org.hl7.fhir.Range getExampleRange();
    
    /**
     * True if has "exampleRange" element
     */
    boolean isSetExampleRange();
    
    /**
     * Sets the "exampleRange" element
     */
    void setExampleRange(org.hl7.fhir.Range exampleRange);
    
    /**
     * Appends and returns a new empty "exampleRange" element
     */
    org.hl7.fhir.Range addNewExampleRange();
    
    /**
     * Unsets the "exampleRange" element
     */
    void unsetExampleRange();
    
    /**
     * Gets the "examplePeriod" element
     */
    org.hl7.fhir.Period getExamplePeriod();
    
    /**
     * True if has "examplePeriod" element
     */
    boolean isSetExamplePeriod();
    
    /**
     * Sets the "examplePeriod" element
     */
    void setExamplePeriod(org.hl7.fhir.Period examplePeriod);
    
    /**
     * Appends and returns a new empty "examplePeriod" element
     */
    org.hl7.fhir.Period addNewExamplePeriod();
    
    /**
     * Unsets the "examplePeriod" element
     */
    void unsetExamplePeriod();
    
    /**
     * Gets the "exampleRatio" element
     */
    org.hl7.fhir.Ratio getExampleRatio();
    
    /**
     * True if has "exampleRatio" element
     */
    boolean isSetExampleRatio();
    
    /**
     * Sets the "exampleRatio" element
     */
    void setExampleRatio(org.hl7.fhir.Ratio exampleRatio);
    
    /**
     * Appends and returns a new empty "exampleRatio" element
     */
    org.hl7.fhir.Ratio addNewExampleRatio();
    
    /**
     * Unsets the "exampleRatio" element
     */
    void unsetExampleRatio();
    
    /**
     * Gets the "exampleResource" element
     */
    org.hl7.fhir.ResourceReference getExampleResource();
    
    /**
     * True if has "exampleResource" element
     */
    boolean isSetExampleResource();
    
    /**
     * Sets the "exampleResource" element
     */
    void setExampleResource(org.hl7.fhir.ResourceReference exampleResource);
    
    /**
     * Appends and returns a new empty "exampleResource" element
     */
    org.hl7.fhir.ResourceReference addNewExampleResource();
    
    /**
     * Unsets the "exampleResource" element
     */
    void unsetExampleResource();
    
    /**
     * Gets the "exampleSampledData" element
     */
    org.hl7.fhir.SampledData getExampleSampledData();
    
    /**
     * True if has "exampleSampledData" element
     */
    boolean isSetExampleSampledData();
    
    /**
     * Sets the "exampleSampledData" element
     */
    void setExampleSampledData(org.hl7.fhir.SampledData exampleSampledData);
    
    /**
     * Appends and returns a new empty "exampleSampledData" element
     */
    org.hl7.fhir.SampledData addNewExampleSampledData();
    
    /**
     * Unsets the "exampleSampledData" element
     */
    void unsetExampleSampledData();
    
    /**
     * Gets the "exampleHumanName" element
     */
    org.hl7.fhir.HumanName getExampleHumanName();
    
    /**
     * True if has "exampleHumanName" element
     */
    boolean isSetExampleHumanName();
    
    /**
     * Sets the "exampleHumanName" element
     */
    void setExampleHumanName(org.hl7.fhir.HumanName exampleHumanName);
    
    /**
     * Appends and returns a new empty "exampleHumanName" element
     */
    org.hl7.fhir.HumanName addNewExampleHumanName();
    
    /**
     * Unsets the "exampleHumanName" element
     */
    void unsetExampleHumanName();
    
    /**
     * Gets the "exampleAddress" element
     */
    org.hl7.fhir.Address getExampleAddress();
    
    /**
     * True if has "exampleAddress" element
     */
    boolean isSetExampleAddress();
    
    /**
     * Sets the "exampleAddress" element
     */
    void setExampleAddress(org.hl7.fhir.Address exampleAddress);
    
    /**
     * Appends and returns a new empty "exampleAddress" element
     */
    org.hl7.fhir.Address addNewExampleAddress();
    
    /**
     * Unsets the "exampleAddress" element
     */
    void unsetExampleAddress();
    
    /**
     * Gets the "exampleContact" element
     */
    org.hl7.fhir.Contact getExampleContact();
    
    /**
     * True if has "exampleContact" element
     */
    boolean isSetExampleContact();
    
    /**
     * Sets the "exampleContact" element
     */
    void setExampleContact(org.hl7.fhir.Contact exampleContact);
    
    /**
     * Appends and returns a new empty "exampleContact" element
     */
    org.hl7.fhir.Contact addNewExampleContact();
    
    /**
     * Unsets the "exampleContact" element
     */
    void unsetExampleContact();
    
    /**
     * Gets the "exampleSchedule" element
     */
    org.hl7.fhir.Schedule getExampleSchedule();
    
    /**
     * True if has "exampleSchedule" element
     */
    boolean isSetExampleSchedule();
    
    /**
     * Sets the "exampleSchedule" element
     */
    void setExampleSchedule(org.hl7.fhir.Schedule exampleSchedule);
    
    /**
     * Appends and returns a new empty "exampleSchedule" element
     */
    org.hl7.fhir.Schedule addNewExampleSchedule();
    
    /**
     * Unsets the "exampleSchedule" element
     */
    void unsetExampleSchedule();
    
    /**
     * Gets the "maxLength" element
     */
    org.hl7.fhir.Integer getMaxLength();
    
    /**
     * True if has "maxLength" element
     */
    boolean isSetMaxLength();
    
    /**
     * Sets the "maxLength" element
     */
    void setMaxLength(org.hl7.fhir.Integer maxLength);
    
    /**
     * Appends and returns a new empty "maxLength" element
     */
    org.hl7.fhir.Integer addNewMaxLength();
    
    /**
     * Unsets the "maxLength" element
     */
    void unsetMaxLength();
    
    /**
     * Gets array of all "condition" elements
     */
    org.hl7.fhir.Id[] getConditionArray();
    
    /**
     * Gets ith "condition" element
     */
    org.hl7.fhir.Id getConditionArray(int i);
    
    /**
     * Returns number of "condition" element
     */
    int sizeOfConditionArray();
    
    /**
     * Sets array of all "condition" element
     */
    void setConditionArray(org.hl7.fhir.Id[] conditionArray);
    
    /**
     * Sets ith "condition" element
     */
    void setConditionArray(int i, org.hl7.fhir.Id condition);
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "condition" element
     */
    org.hl7.fhir.Id insertNewCondition(int i);
    
    /**
     * Appends and returns a new empty value (as xml) as the last "condition" element
     */
    org.hl7.fhir.Id addNewCondition();
    
    /**
     * Removes the ith "condition" element
     */
    void removeCondition(int i);
    
    /**
     * Gets array of all "constraint" elements
     */
    org.hl7.fhir.ProfileConstraint[] getConstraintArray();
    
    /**
     * Gets ith "constraint" element
     */
    org.hl7.fhir.ProfileConstraint getConstraintArray(int i);
    
    /**
     * Returns number of "constraint" element
     */
    int sizeOfConstraintArray();
    
    /**
     * Sets array of all "constraint" element
     */
    void setConstraintArray(org.hl7.fhir.ProfileConstraint[] constraintArray);
    
    /**
     * Sets ith "constraint" element
     */
    void setConstraintArray(int i, org.hl7.fhir.ProfileConstraint constraint);
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "constraint" element
     */
    org.hl7.fhir.ProfileConstraint insertNewConstraint(int i);
    
    /**
     * Appends and returns a new empty value (as xml) as the last "constraint" element
     */
    org.hl7.fhir.ProfileConstraint addNewConstraint();
    
    /**
     * Removes the ith "constraint" element
     */
    void removeConstraint(int i);
    
    /**
     * Gets the "mustSupport" element
     */
    org.hl7.fhir.Boolean getMustSupport();
    
    /**
     * True if has "mustSupport" element
     */
    boolean isSetMustSupport();
    
    /**
     * Sets the "mustSupport" element
     */
    void setMustSupport(org.hl7.fhir.Boolean mustSupport);
    
    /**
     * Appends and returns a new empty "mustSupport" element
     */
    org.hl7.fhir.Boolean addNewMustSupport();
    
    /**
     * Unsets the "mustSupport" element
     */
    void unsetMustSupport();
    
    /**
     * Gets the "isModifier" element
     */
    org.hl7.fhir.Boolean getIsModifier();
    
    /**
     * Sets the "isModifier" element
     */
    void setIsModifier(org.hl7.fhir.Boolean isModifier);
    
    /**
     * Appends and returns a new empty "isModifier" element
     */
    org.hl7.fhir.Boolean addNewIsModifier();
    
    /**
     * Gets the "binding" element
     */
    org.hl7.fhir.ProfileBinding getBinding();
    
    /**
     * True if has "binding" element
     */
    boolean isSetBinding();
    
    /**
     * Sets the "binding" element
     */
    void setBinding(org.hl7.fhir.ProfileBinding binding);
    
    /**
     * Appends and returns a new empty "binding" element
     */
    org.hl7.fhir.ProfileBinding addNewBinding();
    
    /**
     * Unsets the "binding" element
     */
    void unsetBinding();
    
    /**
     * Gets array of all "mapping" elements
     */
    org.hl7.fhir.ProfileMapping1[] getMappingArray();
    
    /**
     * Gets ith "mapping" element
     */
    org.hl7.fhir.ProfileMapping1 getMappingArray(int i);
    
    /**
     * Returns number of "mapping" element
     */
    int sizeOfMappingArray();
    
    /**
     * Sets array of all "mapping" element
     */
    void setMappingArray(org.hl7.fhir.ProfileMapping1[] mappingArray);
    
    /**
     * Sets ith "mapping" element
     */
    void setMappingArray(int i, org.hl7.fhir.ProfileMapping1 mapping);
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "mapping" element
     */
    org.hl7.fhir.ProfileMapping1 insertNewMapping(int i);
    
    /**
     * Appends and returns a new empty value (as xml) as the last "mapping" element
     */
    org.hl7.fhir.ProfileMapping1 addNewMapping();
    
    /**
     * Removes the ith "mapping" element
     */
    void removeMapping(int i);
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static org.hl7.fhir.ProfileDefinition newInstance() {
          return (org.hl7.fhir.ProfileDefinition) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static org.hl7.fhir.ProfileDefinition newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (org.hl7.fhir.ProfileDefinition) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static org.hl7.fhir.ProfileDefinition parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (org.hl7.fhir.ProfileDefinition) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static org.hl7.fhir.ProfileDefinition parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.hl7.fhir.ProfileDefinition) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static org.hl7.fhir.ProfileDefinition parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.hl7.fhir.ProfileDefinition) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static org.hl7.fhir.ProfileDefinition parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.hl7.fhir.ProfileDefinition) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static org.hl7.fhir.ProfileDefinition parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.hl7.fhir.ProfileDefinition) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static org.hl7.fhir.ProfileDefinition parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.hl7.fhir.ProfileDefinition) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static org.hl7.fhir.ProfileDefinition parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.hl7.fhir.ProfileDefinition) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static org.hl7.fhir.ProfileDefinition parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.hl7.fhir.ProfileDefinition) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static org.hl7.fhir.ProfileDefinition parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.hl7.fhir.ProfileDefinition) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static org.hl7.fhir.ProfileDefinition parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.hl7.fhir.ProfileDefinition) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static org.hl7.fhir.ProfileDefinition parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (org.hl7.fhir.ProfileDefinition) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static org.hl7.fhir.ProfileDefinition parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.hl7.fhir.ProfileDefinition) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static org.hl7.fhir.ProfileDefinition parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (org.hl7.fhir.ProfileDefinition) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static org.hl7.fhir.ProfileDefinition parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.hl7.fhir.ProfileDefinition) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.hl7.fhir.ProfileDefinition parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (org.hl7.fhir.ProfileDefinition) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.hl7.fhir.ProfileDefinition parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (org.hl7.fhir.ProfileDefinition) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
