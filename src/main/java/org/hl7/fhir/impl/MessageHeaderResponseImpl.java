/*
 * XML Type:  MessageHeader.Response
 * Namespace: http://hl7.org/fhir
 * Java type: org.hl7.fhir.MessageHeaderResponse
 *
 * Automatically generated - do not modify.
 */
package org.hl7.fhir.impl;
/**
 * An XML MessageHeader.Response(@http://hl7.org/fhir).
 *
 * This is a complex type.
 */
public class MessageHeaderResponseImpl extends org.hl7.fhir.impl.BackboneElementImpl implements org.hl7.fhir.MessageHeaderResponse
{
    private static final long serialVersionUID = 1L;
    
    public MessageHeaderResponseImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName IDENTIFIER$0 = 
        new javax.xml.namespace.QName("http://hl7.org/fhir", "identifier");
    private static final javax.xml.namespace.QName CODE$2 = 
        new javax.xml.namespace.QName("http://hl7.org/fhir", "code");
    private static final javax.xml.namespace.QName DETAILS$4 = 
        new javax.xml.namespace.QName("http://hl7.org/fhir", "details");
    
    
    /**
     * Gets the "identifier" element
     */
    public org.hl7.fhir.Id getIdentifier()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.Id target = null;
            target = (org.hl7.fhir.Id)get_store().find_element_user(IDENTIFIER$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "identifier" element
     */
    public void setIdentifier(org.hl7.fhir.Id identifier)
    {
        generatedSetterHelperImpl(identifier, IDENTIFIER$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "identifier" element
     */
    public org.hl7.fhir.Id addNewIdentifier()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.Id target = null;
            target = (org.hl7.fhir.Id)get_store().add_element_user(IDENTIFIER$0);
            return target;
        }
    }
    
    /**
     * Gets the "code" element
     */
    public org.hl7.fhir.ResponseType getCode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.ResponseType target = null;
            target = (org.hl7.fhir.ResponseType)get_store().find_element_user(CODE$2, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "code" element
     */
    public void setCode(org.hl7.fhir.ResponseType code)
    {
        generatedSetterHelperImpl(code, CODE$2, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "code" element
     */
    public org.hl7.fhir.ResponseType addNewCode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.ResponseType target = null;
            target = (org.hl7.fhir.ResponseType)get_store().add_element_user(CODE$2);
            return target;
        }
    }
    
    /**
     * Gets the "details" element
     */
    public org.hl7.fhir.ResourceReference getDetails()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.ResourceReference target = null;
            target = (org.hl7.fhir.ResourceReference)get_store().find_element_user(DETAILS$4, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "details" element
     */
    public boolean isSetDetails()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(DETAILS$4) != 0;
        }
    }
    
    /**
     * Sets the "details" element
     */
    public void setDetails(org.hl7.fhir.ResourceReference details)
    {
        generatedSetterHelperImpl(details, DETAILS$4, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "details" element
     */
    public org.hl7.fhir.ResourceReference addNewDetails()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.ResourceReference target = null;
            target = (org.hl7.fhir.ResourceReference)get_store().add_element_user(DETAILS$4);
            return target;
        }
    }
    
    /**
     * Unsets the "details" element
     */
    public void unsetDetails()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(DETAILS$4, 0);
        }
    }
}
