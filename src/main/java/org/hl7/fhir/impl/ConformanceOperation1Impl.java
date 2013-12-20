/*
 * XML Type:  Conformance.Operation1
 * Namespace: http://hl7.org/fhir
 * Java type: org.hl7.fhir.ConformanceOperation1
 *
 * Automatically generated - do not modify.
 */
package org.hl7.fhir.impl;
/**
 * An XML Conformance.Operation1(@http://hl7.org/fhir).
 *
 * This is a complex type.
 */
public class ConformanceOperation1Impl extends org.hl7.fhir.impl.BackboneElementImpl implements org.hl7.fhir.ConformanceOperation1
{
    private static final long serialVersionUID = 1L;
    
    public ConformanceOperation1Impl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName CODE$0 = 
        new javax.xml.namespace.QName("http://hl7.org/fhir", "code");
    private static final javax.xml.namespace.QName DOCUMENTATION$2 = 
        new javax.xml.namespace.QName("http://hl7.org/fhir", "documentation");
    
    
    /**
     * Gets the "code" element
     */
    public org.hl7.fhir.RestfulOperationSystem getCode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.RestfulOperationSystem target = null;
            target = (org.hl7.fhir.RestfulOperationSystem)get_store().find_element_user(CODE$0, 0);
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
    public void setCode(org.hl7.fhir.RestfulOperationSystem code)
    {
        generatedSetterHelperImpl(code, CODE$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "code" element
     */
    public org.hl7.fhir.RestfulOperationSystem addNewCode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.RestfulOperationSystem target = null;
            target = (org.hl7.fhir.RestfulOperationSystem)get_store().add_element_user(CODE$0);
            return target;
        }
    }
    
    /**
     * Gets the "documentation" element
     */
    public org.hl7.fhir.String getDocumentation()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.String target = null;
            target = (org.hl7.fhir.String)get_store().find_element_user(DOCUMENTATION$2, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "documentation" element
     */
    public boolean isSetDocumentation()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(DOCUMENTATION$2) != 0;
        }
    }
    
    /**
     * Sets the "documentation" element
     */
    public void setDocumentation(org.hl7.fhir.String documentation)
    {
        generatedSetterHelperImpl(documentation, DOCUMENTATION$2, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "documentation" element
     */
    public org.hl7.fhir.String addNewDocumentation()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.String target = null;
            target = (org.hl7.fhir.String)get_store().add_element_user(DOCUMENTATION$2);
            return target;
        }
    }
    
    /**
     * Unsets the "documentation" element
     */
    public void unsetDocumentation()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(DOCUMENTATION$2, 0);
        }
    }
}
