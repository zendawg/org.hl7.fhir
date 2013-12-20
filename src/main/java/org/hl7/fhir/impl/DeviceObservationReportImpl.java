/*
 * XML Type:  DeviceObservationReport
 * Namespace: http://hl7.org/fhir
 * Java type: org.hl7.fhir.DeviceObservationReport
 *
 * Automatically generated - do not modify.
 */
package org.hl7.fhir.impl;
/**
 * An XML DeviceObservationReport(@http://hl7.org/fhir).
 *
 * This is a complex type.
 */
public class DeviceObservationReportImpl extends org.hl7.fhir.impl.ResourceImpl implements org.hl7.fhir.DeviceObservationReport
{
    private static final long serialVersionUID = 1L;
    
    public DeviceObservationReportImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName INSTANT$0 = 
        new javax.xml.namespace.QName("http://hl7.org/fhir", "instant");
    private static final javax.xml.namespace.QName IDENTIFIER$2 = 
        new javax.xml.namespace.QName("http://hl7.org/fhir", "identifier");
    private static final javax.xml.namespace.QName SOURCE$4 = 
        new javax.xml.namespace.QName("http://hl7.org/fhir", "source");
    private static final javax.xml.namespace.QName SUBJECT$6 = 
        new javax.xml.namespace.QName("http://hl7.org/fhir", "subject");
    private static final javax.xml.namespace.QName VIRTUALDEVICE$8 = 
        new javax.xml.namespace.QName("http://hl7.org/fhir", "virtualDevice");
    
    
    /**
     * Gets the "instant" element
     */
    public org.hl7.fhir.Instant getInstant()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.Instant target = null;
            target = (org.hl7.fhir.Instant)get_store().find_element_user(INSTANT$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "instant" element
     */
    public void setInstant(org.hl7.fhir.Instant instant)
    {
        generatedSetterHelperImpl(instant, INSTANT$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "instant" element
     */
    public org.hl7.fhir.Instant addNewInstant()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.Instant target = null;
            target = (org.hl7.fhir.Instant)get_store().add_element_user(INSTANT$0);
            return target;
        }
    }
    
    /**
     * Gets the "identifier" element
     */
    public org.hl7.fhir.Identifier getIdentifier()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.Identifier target = null;
            target = (org.hl7.fhir.Identifier)get_store().find_element_user(IDENTIFIER$2, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "identifier" element
     */
    public boolean isSetIdentifier()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(IDENTIFIER$2) != 0;
        }
    }
    
    /**
     * Sets the "identifier" element
     */
    public void setIdentifier(org.hl7.fhir.Identifier identifier)
    {
        generatedSetterHelperImpl(identifier, IDENTIFIER$2, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "identifier" element
     */
    public org.hl7.fhir.Identifier addNewIdentifier()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.Identifier target = null;
            target = (org.hl7.fhir.Identifier)get_store().add_element_user(IDENTIFIER$2);
            return target;
        }
    }
    
    /**
     * Unsets the "identifier" element
     */
    public void unsetIdentifier()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(IDENTIFIER$2, 0);
        }
    }
    
    /**
     * Gets the "source" element
     */
    public org.hl7.fhir.ResourceReference getSource()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.ResourceReference target = null;
            target = (org.hl7.fhir.ResourceReference)get_store().find_element_user(SOURCE$4, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "source" element
     */
    public void setSource(org.hl7.fhir.ResourceReference source)
    {
        generatedSetterHelperImpl(source, SOURCE$4, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "source" element
     */
    public org.hl7.fhir.ResourceReference addNewSource()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.ResourceReference target = null;
            target = (org.hl7.fhir.ResourceReference)get_store().add_element_user(SOURCE$4);
            return target;
        }
    }
    
    /**
     * Gets the "subject" element
     */
    public org.hl7.fhir.ResourceReference getSubject()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.ResourceReference target = null;
            target = (org.hl7.fhir.ResourceReference)get_store().find_element_user(SUBJECT$6, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "subject" element
     */
    public boolean isSetSubject()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(SUBJECT$6) != 0;
        }
    }
    
    /**
     * Sets the "subject" element
     */
    public void setSubject(org.hl7.fhir.ResourceReference subject)
    {
        generatedSetterHelperImpl(subject, SUBJECT$6, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "subject" element
     */
    public org.hl7.fhir.ResourceReference addNewSubject()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.ResourceReference target = null;
            target = (org.hl7.fhir.ResourceReference)get_store().add_element_user(SUBJECT$6);
            return target;
        }
    }
    
    /**
     * Unsets the "subject" element
     */
    public void unsetSubject()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(SUBJECT$6, 0);
        }
    }
    
    /**
     * Gets array of all "virtualDevice" elements
     */
    public org.hl7.fhir.DeviceObservationReportVirtualDevice[] getVirtualDeviceArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(VIRTUALDEVICE$8, targetList);
            org.hl7.fhir.DeviceObservationReportVirtualDevice[] result = new org.hl7.fhir.DeviceObservationReportVirtualDevice[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "virtualDevice" element
     */
    public org.hl7.fhir.DeviceObservationReportVirtualDevice getVirtualDeviceArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.DeviceObservationReportVirtualDevice target = null;
            target = (org.hl7.fhir.DeviceObservationReportVirtualDevice)get_store().find_element_user(VIRTUALDEVICE$8, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "virtualDevice" element
     */
    public int sizeOfVirtualDeviceArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(VIRTUALDEVICE$8);
        }
    }
    
    /**
     * Sets array of all "virtualDevice" element  WARNING: This method is not atomicaly synchronized.
     */
    public void setVirtualDeviceArray(org.hl7.fhir.DeviceObservationReportVirtualDevice[] virtualDeviceArray)
    {
        check_orphaned();
        arraySetterHelper(virtualDeviceArray, VIRTUALDEVICE$8);
    }
    
    /**
     * Sets ith "virtualDevice" element
     */
    public void setVirtualDeviceArray(int i, org.hl7.fhir.DeviceObservationReportVirtualDevice virtualDevice)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.DeviceObservationReportVirtualDevice target = null;
            target = (org.hl7.fhir.DeviceObservationReportVirtualDevice)get_store().find_element_user(VIRTUALDEVICE$8, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(virtualDevice);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "virtualDevice" element
     */
    public org.hl7.fhir.DeviceObservationReportVirtualDevice insertNewVirtualDevice(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.DeviceObservationReportVirtualDevice target = null;
            target = (org.hl7.fhir.DeviceObservationReportVirtualDevice)get_store().insert_element_user(VIRTUALDEVICE$8, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "virtualDevice" element
     */
    public org.hl7.fhir.DeviceObservationReportVirtualDevice addNewVirtualDevice()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.DeviceObservationReportVirtualDevice target = null;
            target = (org.hl7.fhir.DeviceObservationReportVirtualDevice)get_store().add_element_user(VIRTUALDEVICE$8);
            return target;
        }
    }
    
    /**
     * Removes the ith "virtualDevice" element
     */
    public void removeVirtualDevice(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(VIRTUALDEVICE$8, i);
        }
    }
}
