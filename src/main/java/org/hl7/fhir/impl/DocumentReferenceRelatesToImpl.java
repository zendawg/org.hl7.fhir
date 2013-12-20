/*
 * XML Type:  DocumentReference.RelatesTo
 * Namespace: http://hl7.org/fhir
 * Java type: org.hl7.fhir.DocumentReferenceRelatesTo
 *
 * Automatically generated - do not modify.
 */
package org.hl7.fhir.impl;
/**
 * An XML DocumentReference.RelatesTo(@http://hl7.org/fhir).
 *
 * This is a complex type.
 */
public class DocumentReferenceRelatesToImpl extends org.hl7.fhir.impl.BackboneElementImpl implements org.hl7.fhir.DocumentReferenceRelatesTo
{
    private static final long serialVersionUID = 1L;
    
    public DocumentReferenceRelatesToImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName CODE$0 = 
        new javax.xml.namespace.QName("http://hl7.org/fhir", "code");
    private static final javax.xml.namespace.QName TARGET$2 = 
        new javax.xml.namespace.QName("http://hl7.org/fhir", "target");
    
    
    /**
     * Gets the "code" element
     */
    public org.hl7.fhir.DocumentRelationshipType getCode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.DocumentRelationshipType target = null;
            target = (org.hl7.fhir.DocumentRelationshipType)get_store().find_element_user(CODE$0, 0);
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
    public void setCode(org.hl7.fhir.DocumentRelationshipType code)
    {
        generatedSetterHelperImpl(code, CODE$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "code" element
     */
    public org.hl7.fhir.DocumentRelationshipType addNewCode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.DocumentRelationshipType target = null;
            target = (org.hl7.fhir.DocumentRelationshipType)get_store().add_element_user(CODE$0);
            return target;
        }
    }
    
    /**
     * Gets the "target" element
     */
    public org.hl7.fhir.ResourceReference getTarget()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.ResourceReference target = null;
            target = (org.hl7.fhir.ResourceReference)get_store().find_element_user(TARGET$2, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "target" element
     */
    public void setTarget(org.hl7.fhir.ResourceReference targetValue)
    {
        generatedSetterHelperImpl(targetValue, TARGET$2, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "target" element
     */
    public org.hl7.fhir.ResourceReference addNewTarget()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.ResourceReference target = null;
            target = (org.hl7.fhir.ResourceReference)get_store().add_element_user(TARGET$2);
            return target;
        }
    }
}
