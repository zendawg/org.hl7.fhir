/*
 * XML Type:  Profile.Slicing
 * Namespace: http://hl7.org/fhir
 * Java type: org.hl7.fhir.ProfileSlicing
 *
 * Automatically generated - do not modify.
 */
package org.hl7.fhir.impl;
/**
 * An XML Profile.Slicing(@http://hl7.org/fhir).
 *
 * This is a complex type.
 */
public class ProfileSlicingImpl extends org.hl7.fhir.impl.BackboneElementImpl implements org.hl7.fhir.ProfileSlicing
{
    private static final long serialVersionUID = 1L;
    
    public ProfileSlicingImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName DISCRIMINATOR$0 = 
        new javax.xml.namespace.QName("http://hl7.org/fhir", "discriminator");
    private static final javax.xml.namespace.QName ORDERED$2 = 
        new javax.xml.namespace.QName("http://hl7.org/fhir", "ordered");
    private static final javax.xml.namespace.QName RULES$4 = 
        new javax.xml.namespace.QName("http://hl7.org/fhir", "rules");
    
    
    /**
     * Gets the "discriminator" element
     */
    public org.hl7.fhir.Id getDiscriminator()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.Id target = null;
            target = (org.hl7.fhir.Id)get_store().find_element_user(DISCRIMINATOR$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "discriminator" element
     */
    public void setDiscriminator(org.hl7.fhir.Id discriminator)
    {
        generatedSetterHelperImpl(discriminator, DISCRIMINATOR$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "discriminator" element
     */
    public org.hl7.fhir.Id addNewDiscriminator()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.Id target = null;
            target = (org.hl7.fhir.Id)get_store().add_element_user(DISCRIMINATOR$0);
            return target;
        }
    }
    
    /**
     * Gets the "ordered" element
     */
    public org.hl7.fhir.Boolean getOrdered()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.Boolean target = null;
            target = (org.hl7.fhir.Boolean)get_store().find_element_user(ORDERED$2, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "ordered" element
     */
    public void setOrdered(org.hl7.fhir.Boolean ordered)
    {
        generatedSetterHelperImpl(ordered, ORDERED$2, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "ordered" element
     */
    public org.hl7.fhir.Boolean addNewOrdered()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.Boolean target = null;
            target = (org.hl7.fhir.Boolean)get_store().add_element_user(ORDERED$2);
            return target;
        }
    }
    
    /**
     * Gets the "rules" element
     */
    public org.hl7.fhir.SlicingRules getRules()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.SlicingRules target = null;
            target = (org.hl7.fhir.SlicingRules)get_store().find_element_user(RULES$4, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "rules" element
     */
    public void setRules(org.hl7.fhir.SlicingRules rules)
    {
        generatedSetterHelperImpl(rules, RULES$4, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "rules" element
     */
    public org.hl7.fhir.SlicingRules addNewRules()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.SlicingRules target = null;
            target = (org.hl7.fhir.SlicingRules)get_store().add_element_user(RULES$4);
            return target;
        }
    }
}
