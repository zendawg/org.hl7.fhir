/*
 * An XML document type.
 * Localname: ImagingStudy
 * Namespace: http://hl7.org/fhir
 * Java type: org.hl7.fhir.ImagingStudyDocument
 *
 * Automatically generated - do not modify.
 */
package org.hl7.fhir.impl;
/**
 * A document containing one ImagingStudy(@http://hl7.org/fhir) element.
 *
 * This is a complex type.
 */
public class ImagingStudyDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.hl7.fhir.ImagingStudyDocument
{
    private static final long serialVersionUID = 1L;
    
    public ImagingStudyDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName IMAGINGSTUDY$0 = 
        new javax.xml.namespace.QName("http://hl7.org/fhir", "ImagingStudy");
    
    
    /**
     * Gets the "ImagingStudy" element
     */
    public org.hl7.fhir.ImagingStudy getImagingStudy()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.ImagingStudy target = null;
            target = (org.hl7.fhir.ImagingStudy)get_store().find_element_user(IMAGINGSTUDY$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "ImagingStudy" element
     */
    public void setImagingStudy(org.hl7.fhir.ImagingStudy imagingStudy)
    {
        generatedSetterHelperImpl(imagingStudy, IMAGINGSTUDY$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "ImagingStudy" element
     */
    public org.hl7.fhir.ImagingStudy addNewImagingStudy()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.ImagingStudy target = null;
            target = (org.hl7.fhir.ImagingStudy)get_store().add_element_user(IMAGINGSTUDY$0);
            return target;
        }
    }
}
