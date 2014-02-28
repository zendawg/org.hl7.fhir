/*
 * XML Type:  CarePlan.Goal
 * Namespace: http://hl7.org/fhir
 * Java type: org.hl7.fhir.CarePlanGoal
 *
 * Automatically generated - do not modify.
 */
package org.hl7.fhir;


/**
 * An XML CarePlan.Goal(@http://hl7.org/fhir).
 *
 * This is a complex type.
 */
public interface CarePlanGoal extends org.hl7.fhir.BackboneElement
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(CarePlanGoal.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s9E39DC3B416F07EA0C8EBAFDA46576CE").resolveHandle("careplangoal8841type");
    
    /**
     * Gets the "description" element
     */
    org.hl7.fhir.String getDescription();
    
    /**
     * Sets the "description" element
     */
    void setDescription(org.hl7.fhir.String description);
    
    /**
     * Appends and returns a new empty "description" element
     */
    org.hl7.fhir.String addNewDescription();
    
    /**
     * Gets the "status" element
     */
    org.hl7.fhir.CarePlanGoalStatus getStatus();
    
    /**
     * True if has "status" element
     */
    boolean isSetStatus();
    
    /**
     * Sets the "status" element
     */
    void setStatus(org.hl7.fhir.CarePlanGoalStatus status);
    
    /**
     * Appends and returns a new empty "status" element
     */
    org.hl7.fhir.CarePlanGoalStatus addNewStatus();
    
    /**
     * Unsets the "status" element
     */
    void unsetStatus();
    
    /**
     * Gets the "notes" element
     */
    org.hl7.fhir.String getNotes();
    
    /**
     * True if has "notes" element
     */
    boolean isSetNotes();
    
    /**
     * Sets the "notes" element
     */
    void setNotes(org.hl7.fhir.String notes);
    
    /**
     * Appends and returns a new empty "notes" element
     */
    org.hl7.fhir.String addNewNotes();
    
    /**
     * Unsets the "notes" element
     */
    void unsetNotes();
    
    /**
     * Gets array of all "concern" elements
     */
    org.hl7.fhir.ResourceReference[] getConcernArray();
    
    /**
     * Gets ith "concern" element
     */
    org.hl7.fhir.ResourceReference getConcernArray(int i);
    
    /**
     * Returns number of "concern" element
     */
    int sizeOfConcernArray();
    
    /**
     * Sets array of all "concern" element
     */
    void setConcernArray(org.hl7.fhir.ResourceReference[] concernArray);
    
    /**
     * Sets ith "concern" element
     */
    void setConcernArray(int i, org.hl7.fhir.ResourceReference concern);
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "concern" element
     */
    org.hl7.fhir.ResourceReference insertNewConcern(int i);
    
    /**
     * Appends and returns a new empty value (as xml) as the last "concern" element
     */
    org.hl7.fhir.ResourceReference addNewConcern();
    
    /**
     * Removes the ith "concern" element
     */
    void removeConcern(int i);
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static org.hl7.fhir.CarePlanGoal newInstance() {
          return (org.hl7.fhir.CarePlanGoal) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static org.hl7.fhir.CarePlanGoal newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (org.hl7.fhir.CarePlanGoal) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static org.hl7.fhir.CarePlanGoal parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (org.hl7.fhir.CarePlanGoal) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static org.hl7.fhir.CarePlanGoal parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.hl7.fhir.CarePlanGoal) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static org.hl7.fhir.CarePlanGoal parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.hl7.fhir.CarePlanGoal) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static org.hl7.fhir.CarePlanGoal parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.hl7.fhir.CarePlanGoal) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static org.hl7.fhir.CarePlanGoal parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.hl7.fhir.CarePlanGoal) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static org.hl7.fhir.CarePlanGoal parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.hl7.fhir.CarePlanGoal) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static org.hl7.fhir.CarePlanGoal parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.hl7.fhir.CarePlanGoal) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static org.hl7.fhir.CarePlanGoal parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.hl7.fhir.CarePlanGoal) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static org.hl7.fhir.CarePlanGoal parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.hl7.fhir.CarePlanGoal) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static org.hl7.fhir.CarePlanGoal parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.hl7.fhir.CarePlanGoal) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static org.hl7.fhir.CarePlanGoal parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (org.hl7.fhir.CarePlanGoal) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static org.hl7.fhir.CarePlanGoal parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.hl7.fhir.CarePlanGoal) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static org.hl7.fhir.CarePlanGoal parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (org.hl7.fhir.CarePlanGoal) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static org.hl7.fhir.CarePlanGoal parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.hl7.fhir.CarePlanGoal) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.hl7.fhir.CarePlanGoal parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (org.hl7.fhir.CarePlanGoal) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.hl7.fhir.CarePlanGoal parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (org.hl7.fhir.CarePlanGoal) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
