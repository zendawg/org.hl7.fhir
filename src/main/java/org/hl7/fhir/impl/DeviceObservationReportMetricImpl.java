/*
 * XML Type:  DeviceObservationReport.Metric
 * Namespace: http://hl7.org/fhir
 * Java type: org.hl7.fhir.DeviceObservationReportMetric
 *
 * Automatically generated - do not modify.
 */
package org.hl7.fhir.impl;
/**
 * An XML DeviceObservationReport.Metric(@http://hl7.org/fhir).
 *
 * This is a complex type.
 */
public class DeviceObservationReportMetricImpl extends org.hl7.fhir.impl.BackboneElementImpl implements org.hl7.fhir.DeviceObservationReportMetric
{
    private static final long serialVersionUID = 1L;
    
    public DeviceObservationReportMetricImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName OBSERVATION$0 = 
        new javax.xml.namespace.QName("http://hl7.org/fhir", "observation");
    
    
    /**
     * Gets the "observation" element
     */
    public org.hl7.fhir.ResourceReference getObservation()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.ResourceReference target = null;
            target = (org.hl7.fhir.ResourceReference)get_store().find_element_user(OBSERVATION$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "observation" element
     */
    public void setObservation(org.hl7.fhir.ResourceReference observation)
    {
        generatedSetterHelperImpl(observation, OBSERVATION$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "observation" element
     */
    public org.hl7.fhir.ResourceReference addNewObservation()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.ResourceReference target = null;
            target = (org.hl7.fhir.ResourceReference)get_store().add_element_user(OBSERVATION$0);
            return target;
        }
    }
}
