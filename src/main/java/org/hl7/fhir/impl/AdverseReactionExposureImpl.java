/*
 * XML Type:  AdverseReaction.Exposure
 * Namespace: http://hl7.org/fhir
 * Java type: org.hl7.fhir.AdverseReactionExposure
 *
 * Automatically generated - do not modify.
 */
package org.hl7.fhir.impl;
/**
 * An XML AdverseReaction.Exposure(@http://hl7.org/fhir).
 *
 * This is a complex type.
 */
public class AdverseReactionExposureImpl extends org.hl7.fhir.impl.BackboneElementImpl implements org.hl7.fhir.AdverseReactionExposure
{
    private static final long serialVersionUID = 1L;
    
    public AdverseReactionExposureImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName DATE$0 = 
        new javax.xml.namespace.QName("http://hl7.org/fhir", "date");
    private static final javax.xml.namespace.QName TYPE$2 = 
        new javax.xml.namespace.QName("http://hl7.org/fhir", "type");
    private static final javax.xml.namespace.QName CAUSALITYEXPECTATION$4 = 
        new javax.xml.namespace.QName("http://hl7.org/fhir", "causalityExpectation");
    private static final javax.xml.namespace.QName SUBSTANCE$6 = 
        new javax.xml.namespace.QName("http://hl7.org/fhir", "substance");
    
    
    /**
     * Gets the "date" element
     */
    public org.hl7.fhir.DateTime getDate()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.DateTime target = null;
            target = (org.hl7.fhir.DateTime)get_store().find_element_user(DATE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "date" element
     */
    public boolean isSetDate()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(DATE$0) != 0;
        }
    }
    
    /**
     * Sets the "date" element
     */
    public void setDate(org.hl7.fhir.DateTime date)
    {
        generatedSetterHelperImpl(date, DATE$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "date" element
     */
    public org.hl7.fhir.DateTime addNewDate()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.DateTime target = null;
            target = (org.hl7.fhir.DateTime)get_store().add_element_user(DATE$0);
            return target;
        }
    }
    
    /**
     * Unsets the "date" element
     */
    public void unsetDate()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(DATE$0, 0);
        }
    }
    
    /**
     * Gets the "type" element
     */
    public org.hl7.fhir.ExposureType getType()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.ExposureType target = null;
            target = (org.hl7.fhir.ExposureType)get_store().find_element_user(TYPE$2, 0);
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
            return get_store().count_elements(TYPE$2) != 0;
        }
    }
    
    /**
     * Sets the "type" element
     */
    public void setType(org.hl7.fhir.ExposureType type)
    {
        generatedSetterHelperImpl(type, TYPE$2, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "type" element
     */
    public org.hl7.fhir.ExposureType addNewType()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.ExposureType target = null;
            target = (org.hl7.fhir.ExposureType)get_store().add_element_user(TYPE$2);
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
            get_store().remove_element(TYPE$2, 0);
        }
    }
    
    /**
     * Gets the "causalityExpectation" element
     */
    public org.hl7.fhir.CausalityExpectation getCausalityExpectation()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.CausalityExpectation target = null;
            target = (org.hl7.fhir.CausalityExpectation)get_store().find_element_user(CAUSALITYEXPECTATION$4, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "causalityExpectation" element
     */
    public boolean isSetCausalityExpectation()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(CAUSALITYEXPECTATION$4) != 0;
        }
    }
    
    /**
     * Sets the "causalityExpectation" element
     */
    public void setCausalityExpectation(org.hl7.fhir.CausalityExpectation causalityExpectation)
    {
        generatedSetterHelperImpl(causalityExpectation, CAUSALITYEXPECTATION$4, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "causalityExpectation" element
     */
    public org.hl7.fhir.CausalityExpectation addNewCausalityExpectation()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.CausalityExpectation target = null;
            target = (org.hl7.fhir.CausalityExpectation)get_store().add_element_user(CAUSALITYEXPECTATION$4);
            return target;
        }
    }
    
    /**
     * Unsets the "causalityExpectation" element
     */
    public void unsetCausalityExpectation()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(CAUSALITYEXPECTATION$4, 0);
        }
    }
    
    /**
     * Gets the "substance" element
     */
    public org.hl7.fhir.ResourceReference getSubstance()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.ResourceReference target = null;
            target = (org.hl7.fhir.ResourceReference)get_store().find_element_user(SUBSTANCE$6, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "substance" element
     */
    public boolean isSetSubstance()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(SUBSTANCE$6) != 0;
        }
    }
    
    /**
     * Sets the "substance" element
     */
    public void setSubstance(org.hl7.fhir.ResourceReference substance)
    {
        generatedSetterHelperImpl(substance, SUBSTANCE$6, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "substance" element
     */
    public org.hl7.fhir.ResourceReference addNewSubstance()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.ResourceReference target = null;
            target = (org.hl7.fhir.ResourceReference)get_store().add_element_user(SUBSTANCE$6);
            return target;
        }
    }
    
    /**
     * Unsets the "substance" element
     */
    public void unsetSubstance()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(SUBSTANCE$6, 0);
        }
    }
}
