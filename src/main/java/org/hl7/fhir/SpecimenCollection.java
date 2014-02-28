/*
 * XML Type:  Specimen.Collection
 * Namespace: http://hl7.org/fhir
 * Java type: org.hl7.fhir.SpecimenCollection
 *
 * Automatically generated - do not modify.
 */
package org.hl7.fhir;


/**
 * An XML Specimen.Collection(@http://hl7.org/fhir).
 *
 * This is a complex type.
 */
public interface SpecimenCollection extends org.hl7.fhir.BackboneElement
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(SpecimenCollection.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s9E39DC3B416F07EA0C8EBAFDA46576CE").resolveHandle("specimencollectionc11etype");
    
    /**
     * Gets the "collector" element
     */
    org.hl7.fhir.ResourceReference getCollector();
    
    /**
     * True if has "collector" element
     */
    boolean isSetCollector();
    
    /**
     * Sets the "collector" element
     */
    void setCollector(org.hl7.fhir.ResourceReference collector);
    
    /**
     * Appends and returns a new empty "collector" element
     */
    org.hl7.fhir.ResourceReference addNewCollector();
    
    /**
     * Unsets the "collector" element
     */
    void unsetCollector();
    
    /**
     * Gets array of all "comment" elements
     */
    org.hl7.fhir.String[] getCommentArray();
    
    /**
     * Gets ith "comment" element
     */
    org.hl7.fhir.String getCommentArray(int i);
    
    /**
     * Returns number of "comment" element
     */
    int sizeOfCommentArray();
    
    /**
     * Sets array of all "comment" element
     */
    void setCommentArray(org.hl7.fhir.String[] commentArray);
    
    /**
     * Sets ith "comment" element
     */
    void setCommentArray(int i, org.hl7.fhir.String comment);
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "comment" element
     */
    org.hl7.fhir.String insertNewComment(int i);
    
    /**
     * Appends and returns a new empty value (as xml) as the last "comment" element
     */
    org.hl7.fhir.String addNewComment();
    
    /**
     * Removes the ith "comment" element
     */
    void removeComment(int i);
    
    /**
     * Gets the "collectedDateTime" element
     */
    org.hl7.fhir.DateTime getCollectedDateTime();
    
    /**
     * True if has "collectedDateTime" element
     */
    boolean isSetCollectedDateTime();
    
    /**
     * Sets the "collectedDateTime" element
     */
    void setCollectedDateTime(org.hl7.fhir.DateTime collectedDateTime);
    
    /**
     * Appends and returns a new empty "collectedDateTime" element
     */
    org.hl7.fhir.DateTime addNewCollectedDateTime();
    
    /**
     * Unsets the "collectedDateTime" element
     */
    void unsetCollectedDateTime();
    
    /**
     * Gets the "collectedPeriod" element
     */
    org.hl7.fhir.Period getCollectedPeriod();
    
    /**
     * True if has "collectedPeriod" element
     */
    boolean isSetCollectedPeriod();
    
    /**
     * Sets the "collectedPeriod" element
     */
    void setCollectedPeriod(org.hl7.fhir.Period collectedPeriod);
    
    /**
     * Appends and returns a new empty "collectedPeriod" element
     */
    org.hl7.fhir.Period addNewCollectedPeriod();
    
    /**
     * Unsets the "collectedPeriod" element
     */
    void unsetCollectedPeriod();
    
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
     * Gets the "sourceSite" element
     */
    org.hl7.fhir.CodeableConcept getSourceSite();
    
    /**
     * True if has "sourceSite" element
     */
    boolean isSetSourceSite();
    
    /**
     * Sets the "sourceSite" element
     */
    void setSourceSite(org.hl7.fhir.CodeableConcept sourceSite);
    
    /**
     * Appends and returns a new empty "sourceSite" element
     */
    org.hl7.fhir.CodeableConcept addNewSourceSite();
    
    /**
     * Unsets the "sourceSite" element
     */
    void unsetSourceSite();
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static org.hl7.fhir.SpecimenCollection newInstance() {
          return (org.hl7.fhir.SpecimenCollection) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static org.hl7.fhir.SpecimenCollection newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (org.hl7.fhir.SpecimenCollection) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static org.hl7.fhir.SpecimenCollection parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (org.hl7.fhir.SpecimenCollection) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static org.hl7.fhir.SpecimenCollection parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.hl7.fhir.SpecimenCollection) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static org.hl7.fhir.SpecimenCollection parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.hl7.fhir.SpecimenCollection) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static org.hl7.fhir.SpecimenCollection parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.hl7.fhir.SpecimenCollection) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static org.hl7.fhir.SpecimenCollection parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.hl7.fhir.SpecimenCollection) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static org.hl7.fhir.SpecimenCollection parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.hl7.fhir.SpecimenCollection) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static org.hl7.fhir.SpecimenCollection parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.hl7.fhir.SpecimenCollection) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static org.hl7.fhir.SpecimenCollection parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.hl7.fhir.SpecimenCollection) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static org.hl7.fhir.SpecimenCollection parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.hl7.fhir.SpecimenCollection) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static org.hl7.fhir.SpecimenCollection parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.hl7.fhir.SpecimenCollection) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static org.hl7.fhir.SpecimenCollection parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (org.hl7.fhir.SpecimenCollection) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static org.hl7.fhir.SpecimenCollection parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.hl7.fhir.SpecimenCollection) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static org.hl7.fhir.SpecimenCollection parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (org.hl7.fhir.SpecimenCollection) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static org.hl7.fhir.SpecimenCollection parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.hl7.fhir.SpecimenCollection) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.hl7.fhir.SpecimenCollection parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (org.hl7.fhir.SpecimenCollection) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.hl7.fhir.SpecimenCollection parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (org.hl7.fhir.SpecimenCollection) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
