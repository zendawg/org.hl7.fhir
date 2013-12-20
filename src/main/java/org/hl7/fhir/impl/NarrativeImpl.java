/*
 * XML Type:  Narrative
 * Namespace: http://hl7.org/fhir
 * Java type: org.hl7.fhir.Narrative
 *
 * Automatically generated - do not modify.
 */
package org.hl7.fhir.impl;
/**
 * An XML Narrative(@http://hl7.org/fhir).
 *
 * This is a complex type.
 */
public class NarrativeImpl extends org.hl7.fhir.impl.ElementImpl implements org.hl7.fhir.Narrative
{
    private static final long serialVersionUID = 1L;
    
    public NarrativeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName STATUS$0 = 
        new javax.xml.namespace.QName("http://hl7.org/fhir", "status");
    private static final javax.xml.namespace.QName DIV$2 = 
        new javax.xml.namespace.QName("http://www.w3.org/1999/xhtml", "div");
    
    
    /**
     * Gets the "status" element
     */
    public org.hl7.fhir.NarrativeStatus getStatus()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.NarrativeStatus target = null;
            target = (org.hl7.fhir.NarrativeStatus)get_store().find_element_user(STATUS$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "status" element
     */
    public void setStatus(org.hl7.fhir.NarrativeStatus status)
    {
        generatedSetterHelperImpl(status, STATUS$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "status" element
     */
    public org.hl7.fhir.NarrativeStatus addNewStatus()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.NarrativeStatus target = null;
            target = (org.hl7.fhir.NarrativeStatus)get_store().add_element_user(STATUS$0);
            return target;
        }
    }
    
    /**
     * Gets the "div" element
     */
    public org.w3.x1999.xhtml.DivDocument.Div getDiv()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.w3.x1999.xhtml.DivDocument.Div target = null;
            target = (org.w3.x1999.xhtml.DivDocument.Div)get_store().find_element_user(DIV$2, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "div" element
     */
    public void setDiv(org.w3.x1999.xhtml.DivDocument.Div div)
    {
        generatedSetterHelperImpl(div, DIV$2, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "div" element
     */
    public org.w3.x1999.xhtml.DivDocument.Div addNewDiv()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.w3.x1999.xhtml.DivDocument.Div target = null;
            target = (org.w3.x1999.xhtml.DivDocument.Div)get_store().add_element_user(DIV$2);
            return target;
        }
    }
}
