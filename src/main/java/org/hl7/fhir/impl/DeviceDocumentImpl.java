/*
 * An XML document type.
 * Localname: Device
 * Namespace: http://hl7.org/fhir
 * Java type: org.hl7.fhir.DeviceDocument
 *
 * Automatically generated - do not modify.
 */
package org.hl7.fhir.impl;
/**
 * A document containing one Device(@http://hl7.org/fhir) element.
 *
 * This is a complex type.
 */
public class DeviceDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.hl7.fhir.DeviceDocument
{
    private static final long serialVersionUID = 1L;
    
    public DeviceDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName DEVICE$0 = 
        new javax.xml.namespace.QName("http://hl7.org/fhir", "Device");
    
    
    /**
     * Gets the "Device" element
     */
    public org.hl7.fhir.Device getDevice()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.Device target = null;
            target = (org.hl7.fhir.Device)get_store().find_element_user(DEVICE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "Device" element
     */
    public void setDevice(org.hl7.fhir.Device device)
    {
        generatedSetterHelperImpl(device, DEVICE$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "Device" element
     */
    public org.hl7.fhir.Device addNewDevice()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.Device target = null;
            target = (org.hl7.fhir.Device)get_store().add_element_user(DEVICE$0);
            return target;
        }
    }
}
