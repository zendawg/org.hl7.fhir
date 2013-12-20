/*
 * XML Type:  Extension
 * Namespace: http://hl7.org/fhir
 * Java type: org.hl7.fhir.Extension
 *
 * Automatically generated - do not modify.
 */
package org.hl7.fhir;


/**
 * An XML Extension(@http://hl7.org/fhir).
 *
 * This is a complex type.
 */
public interface Extension extends org.hl7.fhir.Element
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(Extension.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sC0D81A460DAE2D55E8CE901A6C9B1A88").resolveHandle("extension6139type");
    
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
     * Gets the "url" attribute
     */
    java.lang.String getUrl();
    
    /**
     * Gets (as xml) the "url" attribute
     */
    org.hl7.fhir.UriPrimitive xgetUrl();
    
    /**
     * Sets the "url" attribute
     */
    void setUrl(java.lang.String url);
    
    /**
     * Sets (as xml) the "url" attribute
     */
    void xsetUrl(org.hl7.fhir.UriPrimitive url);
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static org.hl7.fhir.Extension newInstance() {
          return (org.hl7.fhir.Extension) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static org.hl7.fhir.Extension newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (org.hl7.fhir.Extension) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static org.hl7.fhir.Extension parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (org.hl7.fhir.Extension) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static org.hl7.fhir.Extension parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.hl7.fhir.Extension) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static org.hl7.fhir.Extension parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.hl7.fhir.Extension) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static org.hl7.fhir.Extension parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.hl7.fhir.Extension) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static org.hl7.fhir.Extension parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.hl7.fhir.Extension) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static org.hl7.fhir.Extension parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.hl7.fhir.Extension) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static org.hl7.fhir.Extension parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.hl7.fhir.Extension) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static org.hl7.fhir.Extension parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.hl7.fhir.Extension) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static org.hl7.fhir.Extension parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.hl7.fhir.Extension) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static org.hl7.fhir.Extension parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.hl7.fhir.Extension) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static org.hl7.fhir.Extension parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (org.hl7.fhir.Extension) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static org.hl7.fhir.Extension parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.hl7.fhir.Extension) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static org.hl7.fhir.Extension parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (org.hl7.fhir.Extension) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static org.hl7.fhir.Extension parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.hl7.fhir.Extension) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.hl7.fhir.Extension parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (org.hl7.fhir.Extension) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.hl7.fhir.Extension parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (org.hl7.fhir.Extension) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
