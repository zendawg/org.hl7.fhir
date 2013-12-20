/*
 * XML Type:  Immunization.Reaction
 * Namespace: http://hl7.org/fhir
 * Java type: org.hl7.fhir.ImmunizationReaction
 *
 * Automatically generated - do not modify.
 */
package org.hl7.fhir.impl;
/**
 * An XML Immunization.Reaction(@http://hl7.org/fhir).
 *
 * This is a complex type.
 */
public class ImmunizationReactionImpl extends org.hl7.fhir.impl.BackboneElementImpl implements org.hl7.fhir.ImmunizationReaction
{
    private static final long serialVersionUID = 1L;
    
    public ImmunizationReactionImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName DATE$0 = 
        new javax.xml.namespace.QName("http://hl7.org/fhir", "date");
    private static final javax.xml.namespace.QName DETAIL$2 = 
        new javax.xml.namespace.QName("http://hl7.org/fhir", "detail");
    private static final javax.xml.namespace.QName REPORTED$4 = 
        new javax.xml.namespace.QName("http://hl7.org/fhir", "reported");
    
    
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
     * Gets the "detail" element
     */
    public org.hl7.fhir.ResourceReference getDetail()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.ResourceReference target = null;
            target = (org.hl7.fhir.ResourceReference)get_store().find_element_user(DETAIL$2, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "detail" element
     */
    public boolean isSetDetail()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(DETAIL$2) != 0;
        }
    }
    
    /**
     * Sets the "detail" element
     */
    public void setDetail(org.hl7.fhir.ResourceReference detail)
    {
        generatedSetterHelperImpl(detail, DETAIL$2, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "detail" element
     */
    public org.hl7.fhir.ResourceReference addNewDetail()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.ResourceReference target = null;
            target = (org.hl7.fhir.ResourceReference)get_store().add_element_user(DETAIL$2);
            return target;
        }
    }
    
    /**
     * Unsets the "detail" element
     */
    public void unsetDetail()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(DETAIL$2, 0);
        }
    }
    
    /**
     * Gets the "reported" element
     */
    public org.hl7.fhir.Boolean getReported()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.Boolean target = null;
            target = (org.hl7.fhir.Boolean)get_store().find_element_user(REPORTED$4, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "reported" element
     */
    public boolean isSetReported()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(REPORTED$4) != 0;
        }
    }
    
    /**
     * Sets the "reported" element
     */
    public void setReported(org.hl7.fhir.Boolean reported)
    {
        generatedSetterHelperImpl(reported, REPORTED$4, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "reported" element
     */
    public org.hl7.fhir.Boolean addNewReported()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.Boolean target = null;
            target = (org.hl7.fhir.Boolean)get_store().add_element_user(REPORTED$4);
            return target;
        }
    }
    
    /**
     * Unsets the "reported" element
     */
    public void unsetReported()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(REPORTED$4, 0);
        }
    }
}
