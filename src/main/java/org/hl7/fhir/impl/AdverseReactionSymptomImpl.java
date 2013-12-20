/*
 * XML Type:  AdverseReaction.Symptom
 * Namespace: http://hl7.org/fhir
 * Java type: org.hl7.fhir.AdverseReactionSymptom
 *
 * Automatically generated - do not modify.
 */
package org.hl7.fhir.impl;
/**
 * An XML AdverseReaction.Symptom(@http://hl7.org/fhir).
 *
 * This is a complex type.
 */
public class AdverseReactionSymptomImpl extends org.hl7.fhir.impl.BackboneElementImpl implements org.hl7.fhir.AdverseReactionSymptom
{
    private static final long serialVersionUID = 1L;
    
    public AdverseReactionSymptomImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName CODE$0 = 
        new javax.xml.namespace.QName("http://hl7.org/fhir", "code");
    private static final javax.xml.namespace.QName SEVERITY$2 = 
        new javax.xml.namespace.QName("http://hl7.org/fhir", "severity");
    
    
    /**
     * Gets the "code" element
     */
    public org.hl7.fhir.CodeableConcept getCode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.CodeableConcept target = null;
            target = (org.hl7.fhir.CodeableConcept)get_store().find_element_user(CODE$0, 0);
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
    public void setCode(org.hl7.fhir.CodeableConcept code)
    {
        generatedSetterHelperImpl(code, CODE$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "code" element
     */
    public org.hl7.fhir.CodeableConcept addNewCode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.CodeableConcept target = null;
            target = (org.hl7.fhir.CodeableConcept)get_store().add_element_user(CODE$0);
            return target;
        }
    }
    
    /**
     * Gets the "severity" element
     */
    public org.hl7.fhir.ReactionSeverity getSeverity()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.ReactionSeverity target = null;
            target = (org.hl7.fhir.ReactionSeverity)get_store().find_element_user(SEVERITY$2, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "severity" element
     */
    public boolean isSetSeverity()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(SEVERITY$2) != 0;
        }
    }
    
    /**
     * Sets the "severity" element
     */
    public void setSeverity(org.hl7.fhir.ReactionSeverity severity)
    {
        generatedSetterHelperImpl(severity, SEVERITY$2, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "severity" element
     */
    public org.hl7.fhir.ReactionSeverity addNewSeverity()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.ReactionSeverity target = null;
            target = (org.hl7.fhir.ReactionSeverity)get_store().add_element_user(SEVERITY$2);
            return target;
        }
    }
    
    /**
     * Unsets the "severity" element
     */
    public void unsetSeverity()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(SEVERITY$2, 0);
        }
    }
}
