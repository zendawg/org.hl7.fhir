/*
 * XML Type:  Immunization.VaccinationProtocol
 * Namespace: http://hl7.org/fhir
 * Java type: org.hl7.fhir.ImmunizationVaccinationProtocol
 *
 * Automatically generated - do not modify.
 */
package org.hl7.fhir.impl;
/**
 * An XML Immunization.VaccinationProtocol(@http://hl7.org/fhir).
 *
 * This is a complex type.
 */
public class ImmunizationVaccinationProtocolImpl extends org.hl7.fhir.impl.BackboneElementImpl implements org.hl7.fhir.ImmunizationVaccinationProtocol
{
    private static final long serialVersionUID = 1L;
    
    public ImmunizationVaccinationProtocolImpl(org.apache.xmlbeans.SchemaType sType)
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
    private static final javax.xml.namespace.QName SERIESDOSES$8 = 
        new javax.xml.namespace.QName("http://hl7.org/fhir", "seriesDoses");
    private static final javax.xml.namespace.QName DOSETARGET$10 = 
        new javax.xml.namespace.QName("http://hl7.org/fhir", "doseTarget");
    private static final javax.xml.namespace.QName DOSESTATUS$12 = 
        new javax.xml.namespace.QName("http://hl7.org/fhir", "doseStatus");
    private static final javax.xml.namespace.QName DOSESTATUSREASON$14 = 
        new javax.xml.namespace.QName("http://hl7.org/fhir", "doseStatusReason");
    
    
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
    
    /**
     * Gets the "seriesDoses" element
     */
    public org.hl7.fhir.Integer getSeriesDoses()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.Integer target = null;
            target = (org.hl7.fhir.Integer)get_store().find_element_user(SERIESDOSES$8, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "seriesDoses" element
     */
    public boolean isSetSeriesDoses()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(SERIESDOSES$8) != 0;
        }
    }
    
    /**
     * Sets the "seriesDoses" element
     */
    public void setSeriesDoses(org.hl7.fhir.Integer seriesDoses)
    {
        generatedSetterHelperImpl(seriesDoses, SERIESDOSES$8, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "seriesDoses" element
     */
    public org.hl7.fhir.Integer addNewSeriesDoses()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.Integer target = null;
            target = (org.hl7.fhir.Integer)get_store().add_element_user(SERIESDOSES$8);
            return target;
        }
    }
    
    /**
     * Unsets the "seriesDoses" element
     */
    public void unsetSeriesDoses()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(SERIESDOSES$8, 0);
        }
    }
    
    /**
     * Gets the "doseTarget" element
     */
    public org.hl7.fhir.CodeableConcept getDoseTarget()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.CodeableConcept target = null;
            target = (org.hl7.fhir.CodeableConcept)get_store().find_element_user(DOSETARGET$10, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "doseTarget" element
     */
    public void setDoseTarget(org.hl7.fhir.CodeableConcept doseTarget)
    {
        generatedSetterHelperImpl(doseTarget, DOSETARGET$10, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "doseTarget" element
     */
    public org.hl7.fhir.CodeableConcept addNewDoseTarget()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.CodeableConcept target = null;
            target = (org.hl7.fhir.CodeableConcept)get_store().add_element_user(DOSETARGET$10);
            return target;
        }
    }
    
    /**
     * Gets the "doseStatus" element
     */
    public org.hl7.fhir.CodeableConcept getDoseStatus()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.CodeableConcept target = null;
            target = (org.hl7.fhir.CodeableConcept)get_store().find_element_user(DOSESTATUS$12, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "doseStatus" element
     */
    public void setDoseStatus(org.hl7.fhir.CodeableConcept doseStatus)
    {
        generatedSetterHelperImpl(doseStatus, DOSESTATUS$12, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "doseStatus" element
     */
    public org.hl7.fhir.CodeableConcept addNewDoseStatus()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.CodeableConcept target = null;
            target = (org.hl7.fhir.CodeableConcept)get_store().add_element_user(DOSESTATUS$12);
            return target;
        }
    }
    
    /**
     * Gets the "doseStatusReason" element
     */
    public org.hl7.fhir.CodeableConcept getDoseStatusReason()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.CodeableConcept target = null;
            target = (org.hl7.fhir.CodeableConcept)get_store().find_element_user(DOSESTATUSREASON$14, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "doseStatusReason" element
     */
    public boolean isSetDoseStatusReason()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(DOSESTATUSREASON$14) != 0;
        }
    }
    
    /**
     * Sets the "doseStatusReason" element
     */
    public void setDoseStatusReason(org.hl7.fhir.CodeableConcept doseStatusReason)
    {
        generatedSetterHelperImpl(doseStatusReason, DOSESTATUSREASON$14, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "doseStatusReason" element
     */
    public org.hl7.fhir.CodeableConcept addNewDoseStatusReason()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.CodeableConcept target = null;
            target = (org.hl7.fhir.CodeableConcept)get_store().add_element_user(DOSESTATUSREASON$14);
            return target;
        }
    }
    
    /**
     * Unsets the "doseStatusReason" element
     */
    public void unsetDoseStatusReason()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(DOSESTATUSREASON$14, 0);
        }
    }
}
