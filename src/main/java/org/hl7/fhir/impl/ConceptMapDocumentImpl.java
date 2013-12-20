/*
 * An XML document type.
 * Localname: ConceptMap
 * Namespace: http://hl7.org/fhir
 * Java type: org.hl7.fhir.ConceptMapDocument
 *
 * Automatically generated - do not modify.
 */
package org.hl7.fhir.impl;
/**
 * A document containing one ConceptMap(@http://hl7.org/fhir) element.
 *
 * This is a complex type.
 */
public class ConceptMapDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.hl7.fhir.ConceptMapDocument
{
    private static final long serialVersionUID = 1L;
    
    public ConceptMapDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName CONCEPTMAP$0 = 
        new javax.xml.namespace.QName("http://hl7.org/fhir", "ConceptMap");
    
    
    /**
     * Gets the "ConceptMap" element
     */
    public org.hl7.fhir.ConceptMap getConceptMap()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.ConceptMap target = null;
            target = (org.hl7.fhir.ConceptMap)get_store().find_element_user(CONCEPTMAP$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "ConceptMap" element
     */
    public void setConceptMap(org.hl7.fhir.ConceptMap conceptMap)
    {
        generatedSetterHelperImpl(conceptMap, CONCEPTMAP$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
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
            target = (org.hl7.fhir.ConceptMap)get_store().add_element_user(CONCEPTMAP$0);
            return target;
        }
    }
}
