/*
 * XML Type:  DiagnosticReport.Image
 * Namespace: http://hl7.org/fhir
 * Java type: org.hl7.fhir.DiagnosticReportImage
 *
 * Automatically generated - do not modify.
 */
package org.hl7.fhir.impl;
/**
 * An XML DiagnosticReport.Image(@http://hl7.org/fhir).
 *
 * This is a complex type.
 */
public class DiagnosticReportImageImpl extends org.hl7.fhir.impl.BackboneElementImpl implements org.hl7.fhir.DiagnosticReportImage
{
    private static final long serialVersionUID = 1L;
    
    public DiagnosticReportImageImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName COMMENT$0 = 
        new javax.xml.namespace.QName("http://hl7.org/fhir", "comment");
    private static final javax.xml.namespace.QName LINK$2 = 
        new javax.xml.namespace.QName("http://hl7.org/fhir", "link");
    
    
    /**
     * Gets the "comment" element
     */
    public org.hl7.fhir.String getComment()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.String target = null;
            target = (org.hl7.fhir.String)get_store().find_element_user(COMMENT$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "comment" element
     */
    public boolean isSetComment()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(COMMENT$0) != 0;
        }
    }
    
    /**
     * Sets the "comment" element
     */
    public void setComment(org.hl7.fhir.String comment)
    {
        generatedSetterHelperImpl(comment, COMMENT$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "comment" element
     */
    public org.hl7.fhir.String addNewComment()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.String target = null;
            target = (org.hl7.fhir.String)get_store().add_element_user(COMMENT$0);
            return target;
        }
    }
    
    /**
     * Unsets the "comment" element
     */
    public void unsetComment()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(COMMENT$0, 0);
        }
    }
    
    /**
     * Gets the "link" element
     */
    public org.hl7.fhir.ResourceReference getLink()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.ResourceReference target = null;
            target = (org.hl7.fhir.ResourceReference)get_store().find_element_user(LINK$2, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "link" element
     */
    public void setLink(org.hl7.fhir.ResourceReference link)
    {
        generatedSetterHelperImpl(link, LINK$2, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "link" element
     */
    public org.hl7.fhir.ResourceReference addNewLink()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.ResourceReference target = null;
            target = (org.hl7.fhir.ResourceReference)get_store().add_element_user(LINK$2);
            return target;
        }
    }
}
