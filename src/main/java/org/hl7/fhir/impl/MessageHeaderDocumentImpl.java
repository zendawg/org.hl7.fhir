/*
 * An XML document type.
 * Localname: MessageHeader
 * Namespace: http://hl7.org/fhir
 * Java type: org.hl7.fhir.MessageHeaderDocument
 *
 * Automatically generated - do not modify.
 */
package org.hl7.fhir.impl;
/**
 * A document containing one MessageHeader(@http://hl7.org/fhir) element.
 *
 * This is a complex type.
 */
public class MessageHeaderDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.hl7.fhir.MessageHeaderDocument
{
    private static final long serialVersionUID = 1L;
    
    public MessageHeaderDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName MESSAGEHEADER$0 = 
        new javax.xml.namespace.QName("http://hl7.org/fhir", "MessageHeader");
    
    
    /**
     * Gets the "MessageHeader" element
     */
    public org.hl7.fhir.MessageHeader getMessageHeader()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.MessageHeader target = null;
            target = (org.hl7.fhir.MessageHeader)get_store().find_element_user(MESSAGEHEADER$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "MessageHeader" element
     */
    public void setMessageHeader(org.hl7.fhir.MessageHeader messageHeader)
    {
        generatedSetterHelperImpl(messageHeader, MESSAGEHEADER$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "MessageHeader" element
     */
    public org.hl7.fhir.MessageHeader addNewMessageHeader()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.MessageHeader target = null;
            target = (org.hl7.fhir.MessageHeader)get_store().add_element_user(MESSAGEHEADER$0);
            return target;
        }
    }
}
