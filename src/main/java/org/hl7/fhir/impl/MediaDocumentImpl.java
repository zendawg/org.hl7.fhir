/*
 * An XML document type.
 * Localname: Media
 * Namespace: http://hl7.org/fhir
 * Java type: org.hl7.fhir.MediaDocument
 *
 * Automatically generated - do not modify.
 */
package org.hl7.fhir.impl;
/**
 * A document containing one Media(@http://hl7.org/fhir) element.
 *
 * This is a complex type.
 */
public class MediaDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.hl7.fhir.MediaDocument
{
    private static final long serialVersionUID = 1L;
    
    public MediaDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName MEDIA$0 = 
        new javax.xml.namespace.QName("http://hl7.org/fhir", "Media");
    
    
    /**
     * Gets the "Media" element
     */
    public org.hl7.fhir.Media getMedia()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.Media target = null;
            target = (org.hl7.fhir.Media)get_store().find_element_user(MEDIA$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "Media" element
     */
    public void setMedia(org.hl7.fhir.Media media)
    {
        generatedSetterHelperImpl(media, MEDIA$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "Media" element
     */
    public org.hl7.fhir.Media addNewMedia()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.Media target = null;
            target = (org.hl7.fhir.Media)get_store().add_element_user(MEDIA$0);
            return target;
        }
    }
}
