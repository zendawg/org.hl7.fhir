/*
 * XML Type:  Profile.Mapping1
 * Namespace: http://hl7.org/fhir
 * Java type: org.hl7.fhir.ProfileMapping1
 *
 * Automatically generated - do not modify.
 */
package org.hl7.fhir.impl;
/**
 * An XML Profile.Mapping1(@http://hl7.org/fhir).
 *
 * This is a complex type.
 */
public class ProfileMapping1Impl extends org.hl7.fhir.impl.BackboneElementImpl implements org.hl7.fhir.ProfileMapping1
{
    private static final long serialVersionUID = 1L;
    
    public ProfileMapping1Impl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName IDENTITY$0 = 
        new javax.xml.namespace.QName("http://hl7.org/fhir", "identity");
    private static final javax.xml.namespace.QName MAP$2 = 
        new javax.xml.namespace.QName("http://hl7.org/fhir", "map");
    
    
    /**
     * Gets the "identity" element
     */
    public org.hl7.fhir.Id getIdentity()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.Id target = null;
            target = (org.hl7.fhir.Id)get_store().find_element_user(IDENTITY$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "identity" element
     */
    public void setIdentity(org.hl7.fhir.Id identity)
    {
        generatedSetterHelperImpl(identity, IDENTITY$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "identity" element
     */
    public org.hl7.fhir.Id addNewIdentity()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.Id target = null;
            target = (org.hl7.fhir.Id)get_store().add_element_user(IDENTITY$0);
            return target;
        }
    }
    
    /**
     * Gets the "map" element
     */
    public org.hl7.fhir.String getMap()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.String target = null;
            target = (org.hl7.fhir.String)get_store().find_element_user(MAP$2, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "map" element
     */
    public void setMap(org.hl7.fhir.String map)
    {
        generatedSetterHelperImpl(map, MAP$2, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "map" element
     */
    public org.hl7.fhir.String addNewMap()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.String target = null;
            target = (org.hl7.fhir.String)get_store().add_element_user(MAP$2);
            return target;
        }
    }
}
