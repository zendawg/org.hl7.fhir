/*
 * XML Type:  Encounter.Location
 * Namespace: http://hl7.org/fhir
 * Java type: org.hl7.fhir.EncounterLocation
 *
 * Automatically generated - do not modify.
 */
package org.hl7.fhir.impl;
/**
 * An XML Encounter.Location(@http://hl7.org/fhir).
 *
 * This is a complex type.
 */
public class EncounterLocationImpl extends org.hl7.fhir.impl.BackboneElementImpl implements org.hl7.fhir.EncounterLocation
{
    private static final long serialVersionUID = 1L;
    
    public EncounterLocationImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName LOCATION$0 = 
        new javax.xml.namespace.QName("http://hl7.org/fhir", "location");
    private static final javax.xml.namespace.QName PERIOD$2 = 
        new javax.xml.namespace.QName("http://hl7.org/fhir", "period");
    
    
    /**
     * Gets the "location" element
     */
    public org.hl7.fhir.ResourceReference getLocation()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.ResourceReference target = null;
            target = (org.hl7.fhir.ResourceReference)get_store().find_element_user(LOCATION$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "location" element
     */
    public void setLocation(org.hl7.fhir.ResourceReference location)
    {
        generatedSetterHelperImpl(location, LOCATION$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "location" element
     */
    public org.hl7.fhir.ResourceReference addNewLocation()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.ResourceReference target = null;
            target = (org.hl7.fhir.ResourceReference)get_store().add_element_user(LOCATION$0);
            return target;
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
}
