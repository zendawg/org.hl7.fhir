/*
 * XML Type:  Observation.Related
 * Namespace: http://hl7.org/fhir
 * Java type: org.hl7.fhir.ObservationRelated
 *
 * Automatically generated - do not modify.
 */
package org.hl7.fhir.impl;
/**
 * An XML Observation.Related(@http://hl7.org/fhir).
 *
 * This is a complex type.
 */
public class ObservationRelatedImpl extends org.hl7.fhir.impl.BackboneElementImpl implements org.hl7.fhir.ObservationRelated
{
    private static final long serialVersionUID = 1L;
    
    public ObservationRelatedImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName TYPE$0 = 
        new javax.xml.namespace.QName("http://hl7.org/fhir", "type");
    private static final javax.xml.namespace.QName TARGET$2 = 
        new javax.xml.namespace.QName("http://hl7.org/fhir", "target");
    
    
    /**
     * Gets the "type" element
     */
    public org.hl7.fhir.ObservationRelationshipType getType()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.ObservationRelationshipType target = null;
            target = (org.hl7.fhir.ObservationRelationshipType)get_store().find_element_user(TYPE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "type" element
     */
    public boolean isSetType()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(TYPE$0) != 0;
        }
    }
    
    /**
     * Sets the "type" element
     */
    public void setType(org.hl7.fhir.ObservationRelationshipType type)
    {
        generatedSetterHelperImpl(type, TYPE$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "type" element
     */
    public org.hl7.fhir.ObservationRelationshipType addNewType()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.ObservationRelationshipType target = null;
            target = (org.hl7.fhir.ObservationRelationshipType)get_store().add_element_user(TYPE$0);
            return target;
        }
    }
    
    /**
     * Unsets the "type" element
     */
    public void unsetType()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(TYPE$0, 0);
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
