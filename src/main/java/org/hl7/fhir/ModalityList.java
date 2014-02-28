/*
 * XML Type:  Modality-list
 * Namespace: http://hl7.org/fhir
 * Java type: org.hl7.fhir.ModalityList
 *
 * Automatically generated - do not modify.
 */
package org.hl7.fhir;


/**
 * An XML Modality-list(@http://hl7.org/fhir).
 *
 * This is an atomic type that is a restriction of org.hl7.fhir.ModalityList.
 */
public interface ModalityList extends org.apache.xmlbeans.XmlString
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(ModalityList.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s9E39DC3B416F07EA0C8EBAFDA46576CE").resolveHandle("modalitylist0204type");
    
    org.apache.xmlbeans.StringEnumAbstractBase enumValue();
    void set(org.apache.xmlbeans.StringEnumAbstractBase e);
    
    static final Enum AR = Enum.forString("AR");
    static final Enum AU = Enum.forString("AU");
    static final Enum BDUS = Enum.forString("BDUS");
    static final Enum BI = Enum.forString("BI");
    static final Enum BMD = Enum.forString("BMD");
    static final Enum CR = Enum.forString("CR");
    static final Enum CT = Enum.forString("CT");
    static final Enum DG = Enum.forString("DG");
    static final Enum DX = Enum.forString("DX");
    static final Enum ECG = Enum.forString("ECG");
    static final Enum EPS = Enum.forString("EPS");
    static final Enum ES = Enum.forString("ES");
    static final Enum GM = Enum.forString("GM");
    static final Enum HC = Enum.forString("HC");
    static final Enum HD = Enum.forString("HD");
    static final Enum IO = Enum.forString("IO");
    static final Enum IVOCT = Enum.forString("IVOCT");
    static final Enum IVUS = Enum.forString("IVUS");
    static final Enum KER = Enum.forString("KER");
    static final Enum KO = Enum.forString("KO");
    static final Enum LEN = Enum.forString("LEN");
    static final Enum LS = Enum.forString("LS");
    static final Enum MG = Enum.forString("MG");
    static final Enum MR = Enum.forString("MR");
    static final Enum NM = Enum.forString("NM");
    static final Enum OAM = Enum.forString("OAM");
    static final Enum OCT = Enum.forString("OCT");
    static final Enum OP = Enum.forString("OP");
    static final Enum OPM = Enum.forString("OPM");
    static final Enum OPT = Enum.forString("OPT");
    static final Enum OPV = Enum.forString("OPV");
    static final Enum OT = Enum.forString("OT");
    static final Enum PR = Enum.forString("PR");
    static final Enum PT = Enum.forString("PT");
    static final Enum PX = Enum.forString("PX");
    static final Enum REG = Enum.forString("REG");
    static final Enum RF = Enum.forString("RF");
    static final Enum RG = Enum.forString("RG");
    static final Enum RTDOSE = Enum.forString("RTDOSE");
    static final Enum RTIMAGE = Enum.forString("RTIMAGE");
    static final Enum RTPLAN = Enum.forString("RTPLAN");
    static final Enum RTRECORD = Enum.forString("RTRECORD");
    static final Enum RTSTRUCT = Enum.forString("RTSTRUCT");
    static final Enum SEG = Enum.forString("SEG");
    static final Enum SM = Enum.forString("SM");
    static final Enum SMR = Enum.forString("SMR");
    static final Enum SR = Enum.forString("SR");
    static final Enum SRF = Enum.forString("SRF");
    static final Enum TG = Enum.forString("TG");
    static final Enum US = Enum.forString("US");
    static final Enum VA = Enum.forString("VA");
    static final Enum XA = Enum.forString("XA");
    static final Enum XC = Enum.forString("XC");
    
    static final int INT_AR = Enum.INT_AR;
    static final int INT_AU = Enum.INT_AU;
    static final int INT_BDUS = Enum.INT_BDUS;
    static final int INT_BI = Enum.INT_BI;
    static final int INT_BMD = Enum.INT_BMD;
    static final int INT_CR = Enum.INT_CR;
    static final int INT_CT = Enum.INT_CT;
    static final int INT_DG = Enum.INT_DG;
    static final int INT_DX = Enum.INT_DX;
    static final int INT_ECG = Enum.INT_ECG;
    static final int INT_EPS = Enum.INT_EPS;
    static final int INT_ES = Enum.INT_ES;
    static final int INT_GM = Enum.INT_GM;
    static final int INT_HC = Enum.INT_HC;
    static final int INT_HD = Enum.INT_HD;
    static final int INT_IO = Enum.INT_IO;
    static final int INT_IVOCT = Enum.INT_IVOCT;
    static final int INT_IVUS = Enum.INT_IVUS;
    static final int INT_KER = Enum.INT_KER;
    static final int INT_KO = Enum.INT_KO;
    static final int INT_LEN = Enum.INT_LEN;
    static final int INT_LS = Enum.INT_LS;
    static final int INT_MG = Enum.INT_MG;
    static final int INT_MR = Enum.INT_MR;
    static final int INT_NM = Enum.INT_NM;
    static final int INT_OAM = Enum.INT_OAM;
    static final int INT_OCT = Enum.INT_OCT;
    static final int INT_OP = Enum.INT_OP;
    static final int INT_OPM = Enum.INT_OPM;
    static final int INT_OPT = Enum.INT_OPT;
    static final int INT_OPV = Enum.INT_OPV;
    static final int INT_OT = Enum.INT_OT;
    static final int INT_PR = Enum.INT_PR;
    static final int INT_PT = Enum.INT_PT;
    static final int INT_PX = Enum.INT_PX;
    static final int INT_REG = Enum.INT_REG;
    static final int INT_RF = Enum.INT_RF;
    static final int INT_RG = Enum.INT_RG;
    static final int INT_RTDOSE = Enum.INT_RTDOSE;
    static final int INT_RTIMAGE = Enum.INT_RTIMAGE;
    static final int INT_RTPLAN = Enum.INT_RTPLAN;
    static final int INT_RTRECORD = Enum.INT_RTRECORD;
    static final int INT_RTSTRUCT = Enum.INT_RTSTRUCT;
    static final int INT_SEG = Enum.INT_SEG;
    static final int INT_SM = Enum.INT_SM;
    static final int INT_SMR = Enum.INT_SMR;
    static final int INT_SR = Enum.INT_SR;
    static final int INT_SRF = Enum.INT_SRF;
    static final int INT_TG = Enum.INT_TG;
    static final int INT_US = Enum.INT_US;
    static final int INT_VA = Enum.INT_VA;
    static final int INT_XA = Enum.INT_XA;
    static final int INT_XC = Enum.INT_XC;
    
    /**
     * Enumeration value class for org.hl7.fhir.ModalityList.
     * These enum values can be used as follows:
     * <pre>
     * enum.toString(); // returns the string value of the enum
     * enum.intValue(); // returns an int value, useful for switches
     * // e.g., case Enum.INT_AR
     * Enum.forString(s); // returns the enum value for a string
     * Enum.forInt(i); // returns the enum value for an int
     * </pre>
     * Enumeration objects are immutable singleton objects that
     * can be compared using == object equality. They have no
     * public constructor. See the constants defined within this
     * class for all the valid values.
     */
    static final class Enum extends org.apache.xmlbeans.StringEnumAbstractBase
    {
        /**
         * Returns the enum value for a string, or null if none.
         */
        public static Enum forString(java.lang.String s)
            { return (Enum)table.forString(s); }
        /**
         * Returns the enum value corresponding to an int, or null if none.
         */
        public static Enum forInt(int i)
            { return (Enum)table.forInt(i); }
        
        private Enum(java.lang.String s, int i)
            { super(s, i); }
        
        static final int INT_AR = 1;
        static final int INT_AU = 2;
        static final int INT_BDUS = 3;
        static final int INT_BI = 4;
        static final int INT_BMD = 5;
        static final int INT_CR = 6;
        static final int INT_CT = 7;
        static final int INT_DG = 8;
        static final int INT_DX = 9;
        static final int INT_ECG = 10;
        static final int INT_EPS = 11;
        static final int INT_ES = 12;
        static final int INT_GM = 13;
        static final int INT_HC = 14;
        static final int INT_HD = 15;
        static final int INT_IO = 16;
        static final int INT_IVOCT = 17;
        static final int INT_IVUS = 18;
        static final int INT_KER = 19;
        static final int INT_KO = 20;
        static final int INT_LEN = 21;
        static final int INT_LS = 22;
        static final int INT_MG = 23;
        static final int INT_MR = 24;
        static final int INT_NM = 25;
        static final int INT_OAM = 26;
        static final int INT_OCT = 27;
        static final int INT_OP = 28;
        static final int INT_OPM = 29;
        static final int INT_OPT = 30;
        static final int INT_OPV = 31;
        static final int INT_OT = 32;
        static final int INT_PR = 33;
        static final int INT_PT = 34;
        static final int INT_PX = 35;
        static final int INT_REG = 36;
        static final int INT_RF = 37;
        static final int INT_RG = 38;
        static final int INT_RTDOSE = 39;
        static final int INT_RTIMAGE = 40;
        static final int INT_RTPLAN = 41;
        static final int INT_RTRECORD = 42;
        static final int INT_RTSTRUCT = 43;
        static final int INT_SEG = 44;
        static final int INT_SM = 45;
        static final int INT_SMR = 46;
        static final int INT_SR = 47;
        static final int INT_SRF = 48;
        static final int INT_TG = 49;
        static final int INT_US = 50;
        static final int INT_VA = 51;
        static final int INT_XA = 52;
        static final int INT_XC = 53;
        
        public static final org.apache.xmlbeans.StringEnumAbstractBase.Table table =
            new org.apache.xmlbeans.StringEnumAbstractBase.Table
        (
            new Enum[]
            {
                new Enum("AR", INT_AR),
                new Enum("AU", INT_AU),
                new Enum("BDUS", INT_BDUS),
                new Enum("BI", INT_BI),
                new Enum("BMD", INT_BMD),
                new Enum("CR", INT_CR),
                new Enum("CT", INT_CT),
                new Enum("DG", INT_DG),
                new Enum("DX", INT_DX),
                new Enum("ECG", INT_ECG),
                new Enum("EPS", INT_EPS),
                new Enum("ES", INT_ES),
                new Enum("GM", INT_GM),
                new Enum("HC", INT_HC),
                new Enum("HD", INT_HD),
                new Enum("IO", INT_IO),
                new Enum("IVOCT", INT_IVOCT),
                new Enum("IVUS", INT_IVUS),
                new Enum("KER", INT_KER),
                new Enum("KO", INT_KO),
                new Enum("LEN", INT_LEN),
                new Enum("LS", INT_LS),
                new Enum("MG", INT_MG),
                new Enum("MR", INT_MR),
                new Enum("NM", INT_NM),
                new Enum("OAM", INT_OAM),
                new Enum("OCT", INT_OCT),
                new Enum("OP", INT_OP),
                new Enum("OPM", INT_OPM),
                new Enum("OPT", INT_OPT),
                new Enum("OPV", INT_OPV),
                new Enum("OT", INT_OT),
                new Enum("PR", INT_PR),
                new Enum("PT", INT_PT),
                new Enum("PX", INT_PX),
                new Enum("REG", INT_REG),
                new Enum("RF", INT_RF),
                new Enum("RG", INT_RG),
                new Enum("RTDOSE", INT_RTDOSE),
                new Enum("RTIMAGE", INT_RTIMAGE),
                new Enum("RTPLAN", INT_RTPLAN),
                new Enum("RTRECORD", INT_RTRECORD),
                new Enum("RTSTRUCT", INT_RTSTRUCT),
                new Enum("SEG", INT_SEG),
                new Enum("SM", INT_SM),
                new Enum("SMR", INT_SMR),
                new Enum("SR", INT_SR),
                new Enum("SRF", INT_SRF),
                new Enum("TG", INT_TG),
                new Enum("US", INT_US),
                new Enum("VA", INT_VA),
                new Enum("XA", INT_XA),
                new Enum("XC", INT_XC),
            }
        );
        private static final long serialVersionUID = 1L;
        private java.lang.Object readResolve() { return forInt(intValue()); } 
    }
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static org.hl7.fhir.ModalityList newValue(java.lang.Object obj) {
          return (org.hl7.fhir.ModalityList) type.newValue( obj ); }
        
        public static org.hl7.fhir.ModalityList newInstance() {
          return (org.hl7.fhir.ModalityList) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static org.hl7.fhir.ModalityList newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (org.hl7.fhir.ModalityList) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static org.hl7.fhir.ModalityList parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (org.hl7.fhir.ModalityList) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static org.hl7.fhir.ModalityList parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.hl7.fhir.ModalityList) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static org.hl7.fhir.ModalityList parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.hl7.fhir.ModalityList) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static org.hl7.fhir.ModalityList parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.hl7.fhir.ModalityList) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static org.hl7.fhir.ModalityList parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.hl7.fhir.ModalityList) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static org.hl7.fhir.ModalityList parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.hl7.fhir.ModalityList) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static org.hl7.fhir.ModalityList parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.hl7.fhir.ModalityList) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static org.hl7.fhir.ModalityList parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.hl7.fhir.ModalityList) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static org.hl7.fhir.ModalityList parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.hl7.fhir.ModalityList) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static org.hl7.fhir.ModalityList parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.hl7.fhir.ModalityList) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static org.hl7.fhir.ModalityList parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (org.hl7.fhir.ModalityList) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static org.hl7.fhir.ModalityList parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.hl7.fhir.ModalityList) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static org.hl7.fhir.ModalityList parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (org.hl7.fhir.ModalityList) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static org.hl7.fhir.ModalityList parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.hl7.fhir.ModalityList) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.hl7.fhir.ModalityList parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (org.hl7.fhir.ModalityList) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.hl7.fhir.ModalityList parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (org.hl7.fhir.ModalityList) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
