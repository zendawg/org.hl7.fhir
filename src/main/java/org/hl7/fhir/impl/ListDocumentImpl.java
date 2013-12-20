/*
 * An XML document type.
 * Localname: List
 * Namespace: http://hl7.org/fhir
 * Java type: org.hl7.fhir.ListDocument
 *
 * Automatically generated - do not modify.
 */
package org.hl7.fhir.impl;
/**
 * A document containing one List(@http://hl7.org/fhir) element.
 *
 * This is a complex type.
 */
public class ListDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.hl7.fhir.ListDocument
{
    private static final long serialVersionUID = 1L;
    
    public ListDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName LIST$0 = 
        new javax.xml.namespace.QName("http://hl7.org/fhir", "List");
    
    
    /**
     * Gets the "List" element
     */
    public org.hl7.fhir.List getList()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.List target = null;
            target = (org.hl7.fhir.List)get_store().find_element_user(LIST$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "List" element
     */
    public void setList(org.hl7.fhir.List list)
    {
        generatedSetterHelperImpl(list, LIST$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "List" element
     */
    public org.hl7.fhir.List addNewList()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.List target = null;
            target = (org.hl7.fhir.List)get_store().add_element_user(LIST$0);
            return target;
        }
    }
}
