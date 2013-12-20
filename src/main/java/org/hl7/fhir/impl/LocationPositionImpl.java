/*
 * XML Type:  Location.Position
 * Namespace: http://hl7.org/fhir
 * Java type: org.hl7.fhir.LocationPosition
 *
 * Automatically generated - do not modify.
 */
package org.hl7.fhir.impl;
/**
 * An XML Location.Position(@http://hl7.org/fhir).
 *
 * This is a complex type.
 */
public class LocationPositionImpl extends org.hl7.fhir.impl.BackboneElementImpl implements org.hl7.fhir.LocationPosition
{
    private static final long serialVersionUID = 1L;
    
    public LocationPositionImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName LONGITUDE$0 = 
        new javax.xml.namespace.QName("http://hl7.org/fhir", "longitude");
    private static final javax.xml.namespace.QName LATITUDE$2 = 
        new javax.xml.namespace.QName("http://hl7.org/fhir", "latitude");
    private static final javax.xml.namespace.QName ALTITUDE$4 = 
        new javax.xml.namespace.QName("http://hl7.org/fhir", "altitude");
    
    
    /**
     * Gets the "longitude" element
     */
    public org.hl7.fhir.Decimal getLongitude()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.Decimal target = null;
            target = (org.hl7.fhir.Decimal)get_store().find_element_user(LONGITUDE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "longitude" element
     */
    public void setLongitude(org.hl7.fhir.Decimal longitude)
    {
        generatedSetterHelperImpl(longitude, LONGITUDE$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "longitude" element
     */
    public org.hl7.fhir.Decimal addNewLongitude()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.Decimal target = null;
            target = (org.hl7.fhir.Decimal)get_store().add_element_user(LONGITUDE$0);
            return target;
        }
    }
    
    /**
     * Gets the "latitude" element
     */
    public org.hl7.fhir.Decimal getLatitude()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.Decimal target = null;
            target = (org.hl7.fhir.Decimal)get_store().find_element_user(LATITUDE$2, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "latitude" element
     */
    public void setLatitude(org.hl7.fhir.Decimal latitude)
    {
        generatedSetterHelperImpl(latitude, LATITUDE$2, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "latitude" element
     */
    public org.hl7.fhir.Decimal addNewLatitude()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.Decimal target = null;
            target = (org.hl7.fhir.Decimal)get_store().add_element_user(LATITUDE$2);
            return target;
        }
    }
    
    /**
     * Gets the "altitude" element
     */
    public org.hl7.fhir.Decimal getAltitude()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.Decimal target = null;
            target = (org.hl7.fhir.Decimal)get_store().find_element_user(ALTITUDE$4, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "altitude" element
     */
    public boolean isSetAltitude()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(ALTITUDE$4) != 0;
        }
    }
    
    /**
     * Sets the "altitude" element
     */
    public void setAltitude(org.hl7.fhir.Decimal altitude)
    {
        generatedSetterHelperImpl(altitude, ALTITUDE$4, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "altitude" element
     */
    public org.hl7.fhir.Decimal addNewAltitude()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.Decimal target = null;
            target = (org.hl7.fhir.Decimal)get_store().add_element_user(ALTITUDE$4);
            return target;
        }
    }
    
    /**
     * Unsets the "altitude" element
     */
    public void unsetAltitude()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(ALTITUDE$4, 0);
        }
    }
}
