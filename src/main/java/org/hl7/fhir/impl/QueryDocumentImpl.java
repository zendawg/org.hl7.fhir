/*
 * An XML document type.
 * Localname: Query
 * Namespace: http://hl7.org/fhir
 * Java type: org.hl7.fhir.QueryDocument
 *
 * Automatically generated - do not modify.
 */
package org.hl7.fhir.impl;
/**
 * A document containing one Query(@http://hl7.org/fhir) element.
 *
 * This is a complex type.
 */
public class QueryDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.hl7.fhir.QueryDocument
{
    private static final long serialVersionUID = 1L;
    
    public QueryDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName QUERY$0 = 
        new javax.xml.namespace.QName("http://hl7.org/fhir", "Query");
    
    
    /**
     * Gets the "Query" element
     */
    public org.hl7.fhir.Query getQuery()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.Query target = null;
            target = (org.hl7.fhir.Query)get_store().find_element_user(QUERY$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "Query" element
     */
    public void setQuery(org.hl7.fhir.Query query)
    {
        generatedSetterHelperImpl(query, QUERY$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "Query" element
     */
    public org.hl7.fhir.Query addNewQuery()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.Query target = null;
            target = (org.hl7.fhir.Query)get_store().add_element_user(QUERY$0);
            return target;
        }
    }
}
