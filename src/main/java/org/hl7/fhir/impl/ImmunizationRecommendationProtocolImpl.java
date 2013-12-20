/*
 * XML Type:  ImmunizationRecommendation.Protocol
 * Namespace: http://hl7.org/fhir
 * Java type: org.hl7.fhir.ImmunizationRecommendationProtocol
 *
 * Automatically generated - do not modify.
 */
package org.hl7.fhir.impl;
/**
 * An XML ImmunizationRecommendation.Protocol(@http://hl7.org/fhir).
 *
 * This is a complex type.
 */
public class ImmunizationRecommendationProtocolImpl extends org.hl7.fhir.impl.BackboneElementImpl implements org.hl7.fhir.ImmunizationRecommendationProtocol
{
    private static final long serialVersionUID = 1L;
    
    public ImmunizationRecommendationProtocolImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName DOSESEQUENCE$0 = 
        new javax.xml.namespace.QName("http://hl7.org/fhir", "doseSequence");
    private static final javax.xml.namespace.QName DESCRIPTION$2 = 
        new javax.xml.namespace.QName("http://hl7.org/fhir", "description");
    private static final javax.xml.namespace.QName AUTHORITY$4 = 
        new javax.xml.namespace.QName("http://hl7.org/fhir", "authority");
    private static final javax.xml.namespace.QName SERIES$6 = 
        new javax.xml.namespace.QName("http://hl7.org/fhir", "series");
    
    
    /**
     * Gets the "doseSequence" element
     */
    public org.hl7.fhir.Integer getDoseSequence()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.Integer target = null;
            target = (org.hl7.fhir.Integer)get_store().find_element_user(DOSESEQUENCE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "doseSequence" element
     */
    public boolean isSetDoseSequence()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(DOSESEQUENCE$0) != 0;
        }
    }
    
    /**
     * Sets the "doseSequence" element
     */
    public void setDoseSequence(org.hl7.fhir.Integer doseSequence)
    {
        generatedSetterHelperImpl(doseSequence, DOSESEQUENCE$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "doseSequence" element
     */
    public org.hl7.fhir.Integer addNewDoseSequence()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.Integer target = null;
            target = (org.hl7.fhir.Integer)get_store().add_element_user(DOSESEQUENCE$0);
            return target;
        }
    }
    
    /**
     * Unsets the "doseSequence" element
     */
    public void unsetDoseSequence()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(DOSESEQUENCE$0, 0);
        }
    }
    
    /**
     * Gets the "description" element
     */
    public org.hl7.fhir.String getDescription()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.String target = null;
            target = (org.hl7.fhir.String)get_store().find_element_user(DESCRIPTION$2, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "description" element
     */
    public boolean isSetDescription()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(DESCRIPTION$2) != 0;
        }
    }
    
    /**
     * Sets the "description" element
     */
    public void setDescription(org.hl7.fhir.String description)
    {
        generatedSetterHelperImpl(description, DESCRIPTION$2, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "description" element
     */
    public org.hl7.fhir.String addNewDescription()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.String target = null;
            target = (org.hl7.fhir.String)get_store().add_element_user(DESCRIPTION$2);
            return target;
        }
    }
    
    /**
     * Unsets the "description" element
     */
    public void unsetDescription()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(DESCRIPTION$2, 0);
        }
    }
    
    /**
     * Gets the "authority" element
     */
    public org.hl7.fhir.ResourceReference getAuthority()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.ResourceReference target = null;
            target = (org.hl7.fhir.ResourceReference)get_store().find_element_user(AUTHORITY$4, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "authority" element
     */
    public boolean isSetAuthority()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(AUTHORITY$4) != 0;
        }
    }
    
    /**
     * Sets the "authority" element
     */
    public void setAuthority(org.hl7.fhir.ResourceReference authority)
    {
        generatedSetterHelperImpl(authority, AUTHORITY$4, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "authority" element
     */
    public org.hl7.fhir.ResourceReference addNewAuthority()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.ResourceReference target = null;
            target = (org.hl7.fhir.ResourceReference)get_store().add_element_user(AUTHORITY$4);
            return target;
        }
    }
    
    /**
     * Unsets the "authority" element
     */
    public void unsetAuthority()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(AUTHORITY$4, 0);
        }
    }
    
    /**
     * Gets the "series" element
     */
    public org.hl7.fhir.String getSeries()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.String target = null;
            target = (org.hl7.fhir.String)get_store().find_element_user(SERIES$6, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "series" element
     */
    public boolean isSetSeries()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(SERIES$6) != 0;
        }
    }
    
    /**
     * Sets the "series" element
     */
    public void setSeries(org.hl7.fhir.String series)
    {
        generatedSetterHelperImpl(series, SERIES$6, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "series" element
     */
    public org.hl7.fhir.String addNewSeries()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.String target = null;
            target = (org.hl7.fhir.String)get_store().add_element_user(SERIES$6);
            return target;
        }
    }
    
    /**
     * Unsets the "series" element
     */
    public void unsetSeries()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(SERIES$6, 0);
        }
    }
}
