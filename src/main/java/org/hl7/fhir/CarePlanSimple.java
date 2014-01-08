/*
 * XML Type:  CarePlan.Simple
 * Namespace: http://hl7.org/fhir
 * Java type: org.hl7.fhir.CarePlanSimple
 *
 * Automatically generated - do not modify.
 */
package org.hl7.fhir;


/**
 * An XML CarePlan.Simple(@http://hl7.org/fhir).
 *
 * This is a complex type.
 */
public interface CarePlanSimple extends org.hl7.fhir.BackboneElement
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(CarePlanSimple.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s92E42043E21BA03841BD964CC980A9AA").resolveHandle("careplansimplecea0type");
    
    /**
     * Gets the "category" element
     */
    org.hl7.fhir.CarePlanActivityCategory getCategory();
    
    /**
     * Sets the "category" element
     */
    void setCategory(org.hl7.fhir.CarePlanActivityCategory category);
    
    /**
     * Appends and returns a new empty "category" element
     */
    org.hl7.fhir.CarePlanActivityCategory addNewCategory();
    
    /**
     * Gets the "code" element
     */
    org.hl7.fhir.CodeableConcept getCode();
    
    /**
     * True if has "code" element
     */
    boolean isSetCode();
    
    /**
     * Sets the "code" element
     */
    void setCode(org.hl7.fhir.CodeableConcept code);
    
    /**
     * Appends and returns a new empty "code" element
     */
    org.hl7.fhir.CodeableConcept addNewCode();
    
    /**
     * Unsets the "code" element
     */
    void unsetCode();
    
    /**
     * Gets the "timingSchedule" element
     */
    org.hl7.fhir.Schedule getTimingSchedule();
    
    /**
     * True if has "timingSchedule" element
     */
    boolean isSetTimingSchedule();
    
    /**
     * Sets the "timingSchedule" element
     */
    void setTimingSchedule(org.hl7.fhir.Schedule timingSchedule);
    
    /**
     * Appends and returns a new empty "timingSchedule" element
     */
    org.hl7.fhir.Schedule addNewTimingSchedule();
    
    /**
     * Unsets the "timingSchedule" element
     */
    void unsetTimingSchedule();
    
    /**
     * Gets the "timingPeriod" element
     */
    org.hl7.fhir.Period getTimingPeriod();
    
    /**
     * True if has "timingPeriod" element
     */
    boolean isSetTimingPeriod();
    
    /**
     * Sets the "timingPeriod" element
     */
    void setTimingPeriod(org.hl7.fhir.Period timingPeriod);
    
    /**
     * Appends and returns a new empty "timingPeriod" element
     */
    org.hl7.fhir.Period addNewTimingPeriod();
    
    /**
     * Unsets the "timingPeriod" element
     */
    void unsetTimingPeriod();
    
    /**
     * Gets the "timingString" element
     */
    org.hl7.fhir.String getTimingString();
    
    /**
     * True if has "timingString" element
     */
    boolean isSetTimingString();
    
    /**
     * Sets the "timingString" element
     */
    void setTimingString(org.hl7.fhir.String timingString);
    
    /**
     * Appends and returns a new empty "timingString" element
     */
    org.hl7.fhir.String addNewTimingString();
    
    /**
     * Unsets the "timingString" element
     */
    void unsetTimingString();
    
    /**
     * Gets the "location" element
     */
    org.hl7.fhir.ResourceReference getLocation();
    
    /**
     * True if has "location" element
     */
    boolean isSetLocation();
    
    /**
     * Sets the "location" element
     */
    void setLocation(org.hl7.fhir.ResourceReference location);
    
    /**
     * Appends and returns a new empty "location" element
     */
    org.hl7.fhir.ResourceReference addNewLocation();
    
    /**
     * Unsets the "location" element
     */
    void unsetLocation();
    
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
     * Gets the "product" element
     */
    org.hl7.fhir.ResourceReference getProduct();
    
    /**
     * True if has "product" element
     */
    boolean isSetProduct();
    
    /**
     * Sets the "product" element
     */
    void setProduct(org.hl7.fhir.ResourceReference product);
    
    /**
     * Appends and returns a new empty "product" element
     */
    org.hl7.fhir.ResourceReference addNewProduct();
    
    /**
     * Unsets the "product" element
     */
    void unsetProduct();
    
    /**
     * Gets the "dailyAmount" element
     */
    org.hl7.fhir.Quantity getDailyAmount();
    
    /**
     * True if has "dailyAmount" element
     */
    boolean isSetDailyAmount();
    
    /**
     * Sets the "dailyAmount" element
     */
    void setDailyAmount(org.hl7.fhir.Quantity dailyAmount);
    
    /**
     * Appends and returns a new empty "dailyAmount" element
     */
    org.hl7.fhir.Quantity addNewDailyAmount();
    
    /**
     * Unsets the "dailyAmount" element
     */
    void unsetDailyAmount();
    
    /**
     * Gets the "quantity" element
     */
    org.hl7.fhir.Quantity getQuantity();
    
    /**
     * True if has "quantity" element
     */
    boolean isSetQuantity();
    
    /**
     * Sets the "quantity" element
     */
    void setQuantity(org.hl7.fhir.Quantity quantity);
    
    /**
     * Appends and returns a new empty "quantity" element
     */
    org.hl7.fhir.Quantity addNewQuantity();
    
    /**
     * Unsets the "quantity" element
     */
    void unsetQuantity();
    
    /**
     * Gets the "details" element
     */
    org.hl7.fhir.String getDetails();
    
    /**
     * True if has "details" element
     */
    boolean isSetDetails();
    
    /**
     * Sets the "details" element
     */
    void setDetails(org.hl7.fhir.String details);
    
    /**
     * Appends and returns a new empty "details" element
     */
    org.hl7.fhir.String addNewDetails();
    
    /**
     * Unsets the "details" element
     */
    void unsetDetails();
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static org.hl7.fhir.CarePlanSimple newInstance() {
          return (org.hl7.fhir.CarePlanSimple) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static org.hl7.fhir.CarePlanSimple newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (org.hl7.fhir.CarePlanSimple) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static org.hl7.fhir.CarePlanSimple parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (org.hl7.fhir.CarePlanSimple) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static org.hl7.fhir.CarePlanSimple parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.hl7.fhir.CarePlanSimple) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static org.hl7.fhir.CarePlanSimple parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.hl7.fhir.CarePlanSimple) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static org.hl7.fhir.CarePlanSimple parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.hl7.fhir.CarePlanSimple) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static org.hl7.fhir.CarePlanSimple parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.hl7.fhir.CarePlanSimple) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static org.hl7.fhir.CarePlanSimple parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.hl7.fhir.CarePlanSimple) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static org.hl7.fhir.CarePlanSimple parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.hl7.fhir.CarePlanSimple) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static org.hl7.fhir.CarePlanSimple parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.hl7.fhir.CarePlanSimple) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static org.hl7.fhir.CarePlanSimple parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.hl7.fhir.CarePlanSimple) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static org.hl7.fhir.CarePlanSimple parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.hl7.fhir.CarePlanSimple) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static org.hl7.fhir.CarePlanSimple parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (org.hl7.fhir.CarePlanSimple) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static org.hl7.fhir.CarePlanSimple parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.hl7.fhir.CarePlanSimple) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static org.hl7.fhir.CarePlanSimple parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (org.hl7.fhir.CarePlanSimple) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static org.hl7.fhir.CarePlanSimple parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.hl7.fhir.CarePlanSimple) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.hl7.fhir.CarePlanSimple parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (org.hl7.fhir.CarePlanSimple) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.hl7.fhir.CarePlanSimple parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (org.hl7.fhir.CarePlanSimple) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
