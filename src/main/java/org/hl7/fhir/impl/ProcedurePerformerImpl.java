/*
 * XML Type:  Procedure.Performer
 * Namespace: http://hl7.org/fhir
 * Java type: org.hl7.fhir.ProcedurePerformer
 *
 * Automatically generated - do not modify.
 */
package org.hl7.fhir.impl;
/**
 * An XML Procedure.Performer(@http://hl7.org/fhir).
 *
 * This is a complex type.
 */
public class ProcedurePerformerImpl extends org.hl7.fhir.impl.BackboneElementImpl implements org.hl7.fhir.ProcedurePerformer
{
    private static final long serialVersionUID = 1L;
    
    public ProcedurePerformerImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName PERSON$0 = 
        new javax.xml.namespace.QName("http://hl7.org/fhir", "person");
    private static final javax.xml.namespace.QName ROLE$2 = 
        new javax.xml.namespace.QName("http://hl7.org/fhir", "role");
    
    
    /**
     * Gets the "person" element
     */
    public org.hl7.fhir.ResourceReference getPerson()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.ResourceReference target = null;
            target = (org.hl7.fhir.ResourceReference)get_store().find_element_user(PERSON$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "person" element
     */
    public boolean isSetPerson()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(PERSON$0) != 0;
        }
    }
    
    /**
     * Sets the "person" element
     */
    public void setPerson(org.hl7.fhir.ResourceReference person)
    {
        generatedSetterHelperImpl(person, PERSON$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "person" element
     */
    public org.hl7.fhir.ResourceReference addNewPerson()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.ResourceReference target = null;
            target = (org.hl7.fhir.ResourceReference)get_store().add_element_user(PERSON$0);
            return target;
        }
    }
    
    /**
     * Unsets the "person" element
     */
    public void unsetPerson()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(PERSON$0, 0);
        }
    }
    
    /**
     * Gets the "role" element
     */
    public org.hl7.fhir.CodeableConcept getRole()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.CodeableConcept target = null;
            target = (org.hl7.fhir.CodeableConcept)get_store().find_element_user(ROLE$2, 0);
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
            return get_store().count_elements(ROLE$2) != 0;
        }
    }
    
    /**
     * Sets the "role" element
     */
    public void setRole(org.hl7.fhir.CodeableConcept role)
    {
        generatedSetterHelperImpl(role, ROLE$2, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
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
            target = (org.hl7.fhir.CodeableConcept)get_store().add_element_user(ROLE$2);
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
            get_store().remove_element(ROLE$2, 0);
        }
    }
}
