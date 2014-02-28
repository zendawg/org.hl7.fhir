/*
 * XML Type:  Observation
 * Namespace: http://hl7.org/fhir
 * Java type: org.hl7.fhir.Observation
 *
 * Automatically generated - do not modify.
 */
package org.hl7.fhir;


/**
 * An XML Observation(@http://hl7.org/fhir).
 *
 * This is a complex type.
 */
public interface Observation extends org.hl7.fhir.Resource
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(Observation.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s9E39DC3B416F07EA0C8EBAFDA46576CE").resolveHandle("observationbae6type");
    
    /**
     * Gets the "name" element
     */
    org.hl7.fhir.CodeableConcept getName();
    
    /**
     * Sets the "name" element
     */
    void setName(org.hl7.fhir.CodeableConcept name);
    
    /**
     * Appends and returns a new empty "name" element
     */
    org.hl7.fhir.CodeableConcept addNewName();
    
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
     * Gets the "interpretation" element
     */
    org.hl7.fhir.CodeableConcept getInterpretation();
    
    /**
     * True if has "interpretation" element
     */
    boolean isSetInterpretation();
    
    /**
     * Sets the "interpretation" element
     */
    void setInterpretation(org.hl7.fhir.CodeableConcept interpretation);
    
    /**
     * Appends and returns a new empty "interpretation" element
     */
    org.hl7.fhir.CodeableConcept addNewInterpretation();
    
    /**
     * Unsets the "interpretation" element
     */
    void unsetInterpretation();
    
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
     * Gets the "appliesDateTime" element
     */
    org.hl7.fhir.DateTime getAppliesDateTime();
    
    /**
     * True if has "appliesDateTime" element
     */
    boolean isSetAppliesDateTime();
    
    /**
     * Sets the "appliesDateTime" element
     */
    void setAppliesDateTime(org.hl7.fhir.DateTime appliesDateTime);
    
    /**
     * Appends and returns a new empty "appliesDateTime" element
     */
    org.hl7.fhir.DateTime addNewAppliesDateTime();
    
    /**
     * Unsets the "appliesDateTime" element
     */
    void unsetAppliesDateTime();
    
    /**
     * Gets the "appliesPeriod" element
     */
    org.hl7.fhir.Period getAppliesPeriod();
    
    /**
     * True if has "appliesPeriod" element
     */
    boolean isSetAppliesPeriod();
    
    /**
     * Sets the "appliesPeriod" element
     */
    void setAppliesPeriod(org.hl7.fhir.Period appliesPeriod);
    
    /**
     * Appends and returns a new empty "appliesPeriod" element
     */
    org.hl7.fhir.Period addNewAppliesPeriod();
    
    /**
     * Unsets the "appliesPeriod" element
     */
    void unsetAppliesPeriod();
    
    /**
     * Gets the "issued" element
     */
    org.hl7.fhir.Instant getIssued();
    
    /**
     * True if has "issued" element
     */
    boolean isSetIssued();
    
    /**
     * Sets the "issued" element
     */
    void setIssued(org.hl7.fhir.Instant issued);
    
    /**
     * Appends and returns a new empty "issued" element
     */
    org.hl7.fhir.Instant addNewIssued();
    
    /**
     * Unsets the "issued" element
     */
    void unsetIssued();
    
    /**
     * Gets the "status" element
     */
    org.hl7.fhir.ObservationStatus getStatus();
    
    /**
     * Sets the "status" element
     */
    void setStatus(org.hl7.fhir.ObservationStatus status);
    
    /**
     * Appends and returns a new empty "status" element
     */
    org.hl7.fhir.ObservationStatus addNewStatus();
    
    /**
     * Gets the "reliability" element
     */
    org.hl7.fhir.ObservationReliability getReliability();
    
    /**
     * Sets the "reliability" element
     */
    void setReliability(org.hl7.fhir.ObservationReliability reliability);
    
    /**
     * Appends and returns a new empty "reliability" element
     */
    org.hl7.fhir.ObservationReliability addNewReliability();
    
    /**
     * Gets the "bodySite" element
     */
    org.hl7.fhir.CodeableConcept getBodySite();
    
    /**
     * True if has "bodySite" element
     */
    boolean isSetBodySite();
    
    /**
     * Sets the "bodySite" element
     */
    void setBodySite(org.hl7.fhir.CodeableConcept bodySite);
    
    /**
     * Appends and returns a new empty "bodySite" element
     */
    org.hl7.fhir.CodeableConcept addNewBodySite();
    
    /**
     * Unsets the "bodySite" element
     */
    void unsetBodySite();
    
    /**
     * Gets the "method" element
     */
    org.hl7.fhir.CodeableConcept getMethod();
    
    /**
     * True if has "method" element
     */
    boolean isSetMethod();
    
    /**
     * Sets the "method" element
     */
    void setMethod(org.hl7.fhir.CodeableConcept method);
    
    /**
     * Appends and returns a new empty "method" element
     */
    org.hl7.fhir.CodeableConcept addNewMethod();
    
    /**
     * Unsets the "method" element
     */
    void unsetMethod();
    
    /**
     * Gets the "identifier" element
     */
    org.hl7.fhir.Identifier getIdentifier();
    
    /**
     * True if has "identifier" element
     */
    boolean isSetIdentifier();
    
    /**
     * Sets the "identifier" element
     */
    void setIdentifier(org.hl7.fhir.Identifier identifier);
    
    /**
     * Appends and returns a new empty "identifier" element
     */
    org.hl7.fhir.Identifier addNewIdentifier();
    
    /**
     * Unsets the "identifier" element
     */
    void unsetIdentifier();
    
    /**
     * Gets the "subject" element
     */
    org.hl7.fhir.ResourceReference getSubject();
    
    /**
     * True if has "subject" element
     */
    boolean isSetSubject();
    
    /**
     * Sets the "subject" element
     */
    void setSubject(org.hl7.fhir.ResourceReference subject);
    
    /**
     * Appends and returns a new empty "subject" element
     */
    org.hl7.fhir.ResourceReference addNewSubject();
    
    /**
     * Unsets the "subject" element
     */
    void unsetSubject();
    
    /**
     * Gets the "specimen" element
     */
    org.hl7.fhir.ResourceReference getSpecimen();
    
    /**
     * True if has "specimen" element
     */
    boolean isSetSpecimen();
    
    /**
     * Sets the "specimen" element
     */
    void setSpecimen(org.hl7.fhir.ResourceReference specimen);
    
    /**
     * Appends and returns a new empty "specimen" element
     */
    org.hl7.fhir.ResourceReference addNewSpecimen();
    
    /**
     * Unsets the "specimen" element
     */
    void unsetSpecimen();
    
    /**
     * Gets array of all "performer" elements
     */
    org.hl7.fhir.ResourceReference[] getPerformerArray();
    
    /**
     * Gets ith "performer" element
     */
    org.hl7.fhir.ResourceReference getPerformerArray(int i);
    
    /**
     * Returns number of "performer" element
     */
    int sizeOfPerformerArray();
    
    /**
     * Sets array of all "performer" element
     */
    void setPerformerArray(org.hl7.fhir.ResourceReference[] performerArray);
    
    /**
     * Sets ith "performer" element
     */
    void setPerformerArray(int i, org.hl7.fhir.ResourceReference performer);
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "performer" element
     */
    org.hl7.fhir.ResourceReference insertNewPerformer(int i);
    
    /**
     * Appends and returns a new empty value (as xml) as the last "performer" element
     */
    org.hl7.fhir.ResourceReference addNewPerformer();
    
    /**
     * Removes the ith "performer" element
     */
    void removePerformer(int i);
    
    /**
     * Gets array of all "referenceRange" elements
     */
    org.hl7.fhir.ObservationReferenceRange[] getReferenceRangeArray();
    
    /**
     * Gets ith "referenceRange" element
     */
    org.hl7.fhir.ObservationReferenceRange getReferenceRangeArray(int i);
    
    /**
     * Returns number of "referenceRange" element
     */
    int sizeOfReferenceRangeArray();
    
    /**
     * Sets array of all "referenceRange" element
     */
    void setReferenceRangeArray(org.hl7.fhir.ObservationReferenceRange[] referenceRangeArray);
    
    /**
     * Sets ith "referenceRange" element
     */
    void setReferenceRangeArray(int i, org.hl7.fhir.ObservationReferenceRange referenceRange);
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "referenceRange" element
     */
    org.hl7.fhir.ObservationReferenceRange insertNewReferenceRange(int i);
    
    /**
     * Appends and returns a new empty value (as xml) as the last "referenceRange" element
     */
    org.hl7.fhir.ObservationReferenceRange addNewReferenceRange();
    
    /**
     * Removes the ith "referenceRange" element
     */
    void removeReferenceRange(int i);
    
    /**
     * Gets array of all "related" elements
     */
    org.hl7.fhir.ObservationRelated[] getRelatedArray();
    
    /**
     * Gets ith "related" element
     */
    org.hl7.fhir.ObservationRelated getRelatedArray(int i);
    
    /**
     * Returns number of "related" element
     */
    int sizeOfRelatedArray();
    
    /**
     * Sets array of all "related" element
     */
    void setRelatedArray(org.hl7.fhir.ObservationRelated[] relatedArray);
    
    /**
     * Sets ith "related" element
     */
    void setRelatedArray(int i, org.hl7.fhir.ObservationRelated related);
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "related" element
     */
    org.hl7.fhir.ObservationRelated insertNewRelated(int i);
    
    /**
     * Appends and returns a new empty value (as xml) as the last "related" element
     */
    org.hl7.fhir.ObservationRelated addNewRelated();
    
    /**
     * Removes the ith "related" element
     */
    void removeRelated(int i);
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static org.hl7.fhir.Observation newInstance() {
          return (org.hl7.fhir.Observation) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static org.hl7.fhir.Observation newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (org.hl7.fhir.Observation) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static org.hl7.fhir.Observation parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (org.hl7.fhir.Observation) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static org.hl7.fhir.Observation parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.hl7.fhir.Observation) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static org.hl7.fhir.Observation parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.hl7.fhir.Observation) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static org.hl7.fhir.Observation parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.hl7.fhir.Observation) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static org.hl7.fhir.Observation parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.hl7.fhir.Observation) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static org.hl7.fhir.Observation parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.hl7.fhir.Observation) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static org.hl7.fhir.Observation parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.hl7.fhir.Observation) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static org.hl7.fhir.Observation parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.hl7.fhir.Observation) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static org.hl7.fhir.Observation parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.hl7.fhir.Observation) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static org.hl7.fhir.Observation parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.hl7.fhir.Observation) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static org.hl7.fhir.Observation parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (org.hl7.fhir.Observation) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static org.hl7.fhir.Observation parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.hl7.fhir.Observation) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static org.hl7.fhir.Observation parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (org.hl7.fhir.Observation) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static org.hl7.fhir.Observation parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.hl7.fhir.Observation) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.hl7.fhir.Observation parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (org.hl7.fhir.Observation) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.hl7.fhir.Observation parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (org.hl7.fhir.Observation) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
