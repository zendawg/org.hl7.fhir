/*
 * An XML document type.
 * Localname: DeviceObservationReport
 * Namespace: http://hl7.org/fhir
 * Java type: org.hl7.fhir.DeviceObservationReportDocument
 *
 * Automatically generated - do not modify.
 */
package org.hl7.fhir.impl;
/**
 * A document containing one DeviceObservationReport(@http://hl7.org/fhir) element.
 *
 * This is a complex type.
 */
public class DeviceObservationReportDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.hl7.fhir.DeviceObservationReportDocument
{
    private static final long serialVersionUID = 1L;
    
    public DeviceObservationReportDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName DEVICEOBSERVATIONREPORT$0 = 
        new javax.xml.namespace.QName("http://hl7.org/fhir", "DeviceObservationReport");
    
    
    /**
     * Gets the "DeviceObservationReport" element
     */
    public org.hl7.fhir.DeviceObservationReport getDeviceObservationReport()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.DeviceObservationReport target = null;
            target = (org.hl7.fhir.DeviceObservationReport)get_store().find_element_user(DEVICEOBSERVATIONREPORT$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "DeviceObservationReport" element
     */
    public void setDeviceObservationReport(org.hl7.fhir.DeviceObservationReport deviceObservationReport)
    {
        generatedSetterHelperImpl(deviceObservationReport, DEVICEOBSERVATIONREPORT$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "DeviceObservationReport" element
     */
    public org.hl7.fhir.DeviceObservationReport addNewDeviceObservationReport()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.DeviceObservationReport target = null;
            target = (org.hl7.fhir.DeviceObservationReport)get_store().add_element_user(DEVICEOBSERVATIONREPORT$0);
            return target;
        }
    }
}
