/*
 * XML Type:  Encounter.Accomodation
 * Namespace: http://hl7.org/fhir
 * Java type: org.hl7.fhir.EncounterAccomodation
 *
 * Automatically generated - do not modify.
 */
package org.hl7.fhir.impl;
/**
 * An XML Encounter.Accomodation(@http://hl7.org/fhir).
 *
 * This is a complex type.
 */
public class EncounterAccomodationImpl extends org.hl7.fhir.impl.BackboneElementImpl implements org.hl7.fhir.EncounterAccomodation
{
    private static final long serialVersionUID = 1L;
    
    public EncounterAccomodationImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName BED$0 = 
        new javax.xml.namespace.QName("http://hl7.org/fhir", "bed");
    private static final javax.xml.namespace.QName PERIOD$2 = 
        new javax.xml.namespace.QName("http://hl7.org/fhir", "period");
    
    
    /**
     * Gets the "bed" element
     */
    public org.hl7.fhir.ResourceReference getBed()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.ResourceReference target = null;
            target = (org.hl7.fhir.ResourceReference)get_store().find_element_user(BED$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "bed" element
     */
    public boolean isSetBed()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(BED$0) != 0;
        }
    }
    
    /**
     * Sets the "bed" element
     */
    public void setBed(org.hl7.fhir.ResourceReference bed)
    {
        generatedSetterHelperImpl(bed, BED$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "bed" element
     */
    public org.hl7.fhir.ResourceReference addNewBed()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.ResourceReference target = null;
            target = (org.hl7.fhir.ResourceReference)get_store().add_element_user(BED$0);
            return target;
        }
    }
    
    /**
     * Unsets the "bed" element
     */
    public void unsetBed()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(BED$0, 0);
        }
    }
    
    /**
     * Gets the "period" element
     */
    public org.hl7.fhir.Period getPeriod()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.Period target = null;
            target = (org.hl7.fhir.Period)get_store().find_element_user(PERIOD$2, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "period" element
     */
    public boolean isSetPeriod()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(PERIOD$2) != 0;
        }
    }
    
    /**
     * Sets the "period" element
     */
    public void setPeriod(org.hl7.fhir.Period period)
    {
        generatedSetterHelperImpl(period, PERIOD$2, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "period" element
     */
    public org.hl7.fhir.Period addNewPeriod()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.Period target = null;
            target = (org.hl7.fhir.Period)get_store().add_element_user(PERIOD$2);
            return target;
        }
    }
    
    /**
     * Unsets the "period" element
     */
    public void unsetPeriod()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(PERIOD$2, 0);
        }
    }
}
