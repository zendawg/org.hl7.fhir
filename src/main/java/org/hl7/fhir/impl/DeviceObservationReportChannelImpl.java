/*
 * XML Type:  DeviceObservationReport.Channel
 * Namespace: http://hl7.org/fhir
 * Java type: org.hl7.fhir.DeviceObservationReportChannel
 *
 * Automatically generated - do not modify.
 */
package org.hl7.fhir.impl;
/**
 * An XML DeviceObservationReport.Channel(@http://hl7.org/fhir).
 *
 * This is a complex type.
 */
public class DeviceObservationReportChannelImpl extends org.hl7.fhir.impl.BackboneElementImpl implements org.hl7.fhir.DeviceObservationReportChannel
{
    private static final long serialVersionUID = 1L;
    
    public DeviceObservationReportChannelImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName CODE$0 = 
        new javax.xml.namespace.QName("http://hl7.org/fhir", "code");
    private static final javax.xml.namespace.QName METRIC$2 = 
        new javax.xml.namespace.QName("http://hl7.org/fhir", "metric");
    
    
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
     * Gets array of all "metric" elements
     */
    public org.hl7.fhir.DeviceObservationReportMetric[] getMetricArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(METRIC$2, targetList);
            org.hl7.fhir.DeviceObservationReportMetric[] result = new org.hl7.fhir.DeviceObservationReportMetric[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "metric" element
     */
    public org.hl7.fhir.DeviceObservationReportMetric getMetricArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.DeviceObservationReportMetric target = null;
            target = (org.hl7.fhir.DeviceObservationReportMetric)get_store().find_element_user(METRIC$2, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "metric" element
     */
    public int sizeOfMetricArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(METRIC$2);
        }
    }
    
    /**
     * Sets array of all "metric" element  WARNING: This method is not atomicaly synchronized.
     */
    public void setMetricArray(org.hl7.fhir.DeviceObservationReportMetric[] metricArray)
    {
        check_orphaned();
        arraySetterHelper(metricArray, METRIC$2);
    }
    
    /**
     * Sets ith "metric" element
     */
    public void setMetricArray(int i, org.hl7.fhir.DeviceObservationReportMetric metric)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.DeviceObservationReportMetric target = null;
            target = (org.hl7.fhir.DeviceObservationReportMetric)get_store().find_element_user(METRIC$2, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(metric);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "metric" element
     */
    public org.hl7.fhir.DeviceObservationReportMetric insertNewMetric(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.DeviceObservationReportMetric target = null;
            target = (org.hl7.fhir.DeviceObservationReportMetric)get_store().insert_element_user(METRIC$2, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "metric" element
     */
    public org.hl7.fhir.DeviceObservationReportMetric addNewMetric()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.DeviceObservationReportMetric target = null;
            target = (org.hl7.fhir.DeviceObservationReportMetric)get_store().add_element_user(METRIC$2);
            return target;
        }
    }
    
    /**
     * Removes the ith "metric" element
     */
    public void removeMetric(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(METRIC$2, i);
        }
    }
}
