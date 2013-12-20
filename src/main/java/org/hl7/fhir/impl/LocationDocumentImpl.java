/*
 * An XML document type.
 * Localname: Location
 * Namespace: http://hl7.org/fhir
 * Java type: org.hl7.fhir.LocationDocument
 *
 * Automatically generated - do not modify.
 */
package org.hl7.fhir.impl;
/**
 * A document containing one Location(@http://hl7.org/fhir) element.
 *
 * This is a complex type.
 */
public class LocationDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.hl7.fhir.LocationDocument
{
    private static final long serialVersionUID = 1L;
    
    public LocationDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName LOCATION$0 = 
        new javax.xml.namespace.QName("http://hl7.org/fhir", "Location");
    
    
    /**
     * Gets the "Location" element
     */
    public org.hl7.fhir.Location getLocation()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.Location target = null;
            target = (org.hl7.fhir.Location)get_store().find_element_user(LOCATION$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "Location" element
     */
    public void setLocation(org.hl7.fhir.Location location)
    {
        generatedSetterHelperImpl(location, LOCATION$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "Location" element
     */
    public org.hl7.fhir.Location addNewLocation()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.Location target = null;
            target = (org.hl7.fhir.Location)get_store().add_element_user(LOCATION$0);
            return target;
        }
    }
}
