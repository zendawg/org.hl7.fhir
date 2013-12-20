/*
 * An XML document type.
 * Localname: DocumentManifest
 * Namespace: http://hl7.org/fhir
 * Java type: org.hl7.fhir.DocumentManifestDocument
 *
 * Automatically generated - do not modify.
 */
package org.hl7.fhir.impl;
/**
 * A document containing one DocumentManifest(@http://hl7.org/fhir) element.
 *
 * This is a complex type.
 */
public class DocumentManifestDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.hl7.fhir.DocumentManifestDocument
{
    private static final long serialVersionUID = 1L;
    
    public DocumentManifestDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName DOCUMENTMANIFEST$0 = 
        new javax.xml.namespace.QName("http://hl7.org/fhir", "DocumentManifest");
    
    
    /**
     * Gets the "DocumentManifest" element
     */
    public org.hl7.fhir.DocumentManifest getDocumentManifest()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.DocumentManifest target = null;
            target = (org.hl7.fhir.DocumentManifest)get_store().find_element_user(DOCUMENTMANIFEST$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "DocumentManifest" element
     */
    public void setDocumentManifest(org.hl7.fhir.DocumentManifest documentManifest)
    {
        generatedSetterHelperImpl(documentManifest, DOCUMENTMANIFEST$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "DocumentManifest" element
     */
    public org.hl7.fhir.DocumentManifest addNewDocumentManifest()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.DocumentManifest target = null;
            target = (org.hl7.fhir.DocumentManifest)get_store().add_element_user(DOCUMENTMANIFEST$0);
            return target;
        }
    }
}
