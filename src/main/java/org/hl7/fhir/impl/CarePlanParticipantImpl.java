/*
 * XML Type:  CarePlan.Participant
 * Namespace: http://hl7.org/fhir
 * Java type: org.hl7.fhir.CarePlanParticipant
 *
 * Automatically generated - do not modify.
 */
package org.hl7.fhir.impl;
/**
 * An XML CarePlan.Participant(@http://hl7.org/fhir).
 *
 * This is a complex type.
 */
public class CarePlanParticipantImpl extends org.hl7.fhir.impl.BackboneElementImpl implements org.hl7.fhir.CarePlanParticipant
{
    private static final long serialVersionUID = 1L;
    
    public CarePlanParticipantImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName ROLE$0 = 
        new javax.xml.namespace.QName("http://hl7.org/fhir", "role");
    private static final javax.xml.namespace.QName MEMBER$2 = 
        new javax.xml.namespace.QName("http://hl7.org/fhir", "member");
    
    
    /**
     * Gets the "role" element
     */
    public org.hl7.fhir.CodeableConcept getRole()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.CodeableConcept target = null;
            target = (org.hl7.fhir.CodeableConcept)get_store().find_element_user(ROLE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "role" element
     */
    public boolean isSetRole()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(ROLE$0) != 0;
        }
    }
    
    /**
     * Sets the "role" element
     */
    public void setRole(org.hl7.fhir.CodeableConcept role)
    {
        generatedSetterHelperImpl(role, ROLE$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "role" element
     */
    public org.hl7.fhir.CodeableConcept addNewRole()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.CodeableConcept target = null;
            target = (org.hl7.fhir.CodeableConcept)get_store().add_element_user(ROLE$0);
            return target;
        }
    }
    
    /**
     * Unsets the "role" element
     */
    public void unsetRole()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(ROLE$0, 0);
        }
    }
    
    /**
     * Gets the "member" element
     */
    public org.hl7.fhir.ResourceReference getMember()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.ResourceReference target = null;
            target = (org.hl7.fhir.ResourceReference)get_store().find_element_user(MEMBER$2, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "member" element
     */
    public void setMember(org.hl7.fhir.ResourceReference member)
    {
        generatedSetterHelperImpl(member, MEMBER$2, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "member" element
     */
    public org.hl7.fhir.ResourceReference addNewMember()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.ResourceReference target = null;
            target = (org.hl7.fhir.ResourceReference)get_store().add_element_user(MEMBER$2);
            return target;
        }
    }
}
