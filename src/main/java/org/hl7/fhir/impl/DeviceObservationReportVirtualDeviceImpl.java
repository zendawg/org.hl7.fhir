/*
 * XML Type:  DeviceObservationReport.VirtualDevice
 * Namespace: http://hl7.org/fhir
 * Java type: org.hl7.fhir.DeviceObservationReportVirtualDevice
 *
 * Automatically generated - do not modify.
 */
package org.hl7.fhir.impl;
/**
 * An XML DeviceObservationReport.VirtualDevice(@http://hl7.org/fhir).
 *
 * This is a complex type.
 */
public class DeviceObservationReportVirtualDeviceImpl extends org.hl7.fhir.impl.BackboneElementImpl implements org.hl7.fhir.DeviceObservationReportVirtualDevice
{
    private static final long serialVersionUID = 1L;
    
    public DeviceObservationReportVirtualDeviceImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName CODE$0 = 
        new javax.xml.namespace.QName("http://hl7.org/fhir", "code");
    private static final javax.xml.namespace.QName CHANNEL$2 = 
        new javax.xml.namespace.QName("http://hl7.org/fhir", "channel");
    
    
    /**
     * Gets the "code" element
     */
    public org.hl7.fhir.CodeableConcept getCode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.CodeableConcept target = null;
            target = (org.hl7.fhir.CodeableConcept)get_store().find_element_user(CODE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "code" element
     */
    public boolean isSetCode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(CODE$0) != 0;
        }
    }
    
    /**
     * Sets the "code" element
     */
    public void setCode(org.hl7.fhir.CodeableConcept code)
    {
        generatedSetterHelperImpl(code, CODE$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "code" element
     */
    public org.hl7.fhir.CodeableConcept addNewCode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.CodeableConcept target = null;
            target = (org.hl7.fhir.CodeableConcept)get_store().add_element_user(CODE$0);
            return target;
        }
    }
    
    /**
     * Unsets the "code" element
     */
    public void unsetCode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(CODE$0, 0);
        }
    }
    
    /**
     * Gets array of all "channel" elements
     */
    public org.hl7.fhir.DeviceObservationReportChannel[] getChannelArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(CHANNEL$2, targetList);
            org.hl7.fhir.DeviceObservationReportChannel[] result = new org.hl7.fhir.DeviceObservationReportChannel[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "channel" element
     */
    public org.hl7.fhir.DeviceObservationReportChannel getChannelArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.DeviceObservationReportChannel target = null;
            target = (org.hl7.fhir.DeviceObservationReportChannel)get_store().find_element_user(CHANNEL$2, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "channel" element
     */
    public int sizeOfChannelArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(CHANNEL$2);
        }
    }
    
    /**
     * Sets array of all "channel" element  WARNING: This method is not atomicaly synchronized.
     */
    public void setChannelArray(org.hl7.fhir.DeviceObservationReportChannel[] channelArray)
    {
        check_orphaned();
        arraySetterHelper(channelArray, CHANNEL$2);
    }
    
    /**
     * Sets ith "channel" element
     */
    public void setChannelArray(int i, org.hl7.fhir.DeviceObservationReportChannel channel)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.DeviceObservationReportChannel target = null;
            target = (org.hl7.fhir.DeviceObservationReportChannel)get_store().find_element_user(CHANNEL$2, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(channel);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "channel" element
     */
    public org.hl7.fhir.DeviceObservationReportChannel insertNewChannel(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.DeviceObservationReportChannel target = null;
            target = (org.hl7.fhir.DeviceObservationReportChannel)get_store().insert_element_user(CHANNEL$2, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "channel" element
     */
    public org.hl7.fhir.DeviceObservationReportChannel addNewChannel()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.DeviceObservationReportChannel target = null;
            target = (org.hl7.fhir.DeviceObservationReportChannel)get_store().add_element_user(CHANNEL$2);
            return target;
        }
    }
    
    /**
     * Removes the ith "channel" element
     */
    public void removeChannel(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(CHANNEL$2, i);
        }
    }
}
