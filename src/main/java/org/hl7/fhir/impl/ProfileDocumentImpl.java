/*
 * An XML document type.
 * Localname: Profile
 * Namespace: http://hl7.org/fhir
 * Java type: org.hl7.fhir.ProfileDocument
 *
 * Automatically generated - do not modify.
 */
package org.hl7.fhir.impl;
/**
 * A document containing one Profile(@http://hl7.org/fhir) element.
 *
 * This is a complex type.
 */
public class ProfileDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.hl7.fhir.ProfileDocument
{
    private static final long serialVersionUID = 1L;
    
    public ProfileDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName PROFILE$0 = 
        new javax.xml.namespace.QName("http://hl7.org/fhir", "Profile");
    
    
    /**
     * Gets the "Profile" element
     */
    public org.hl7.fhir.Profile getProfile()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.Profile target = null;
            target = (org.hl7.fhir.Profile)get_store().find_element_user(PROFILE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "Profile" element
     */
    public void setProfile(org.hl7.fhir.Profile profile)
    {
        generatedSetterHelperImpl(profile, PROFILE$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "Profile" element
     */
    public org.hl7.fhir.Profile addNewProfile()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.Profile target = null;
            target = (org.hl7.fhir.Profile)get_store().add_element_user(PROFILE$0);
            return target;
        }
    }
}
