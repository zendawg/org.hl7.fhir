/*
 * An XML document type.
 * Localname: CarePlan
 * Namespace: http://hl7.org/fhir
 * Java type: org.hl7.fhir.CarePlanDocument
 *
 * Automatically generated - do not modify.
 */
package org.hl7.fhir.impl;
/**
 * A document containing one CarePlan(@http://hl7.org/fhir) element.
 *
 * This is a complex type.
 */
public class CarePlanDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.hl7.fhir.CarePlanDocument
{
    private static final long serialVersionUID = 1L;
    
    public CarePlanDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName CAREPLAN$0 = 
        new javax.xml.namespace.QName("http://hl7.org/fhir", "CarePlan");
    
    
    /**
     * Gets the "CarePlan" element
     */
    public org.hl7.fhir.CarePlan getCarePlan()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.CarePlan target = null;
            target = (org.hl7.fhir.CarePlan)get_store().find_element_user(CAREPLAN$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "CarePlan" element
     */
    public void setCarePlan(org.hl7.fhir.CarePlan carePlan)
    {
        generatedSetterHelperImpl(carePlan, CAREPLAN$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "CarePlan" element
     */
    public org.hl7.fhir.CarePlan addNewCarePlan()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.CarePlan target = null;
            target = (org.hl7.fhir.CarePlan)get_store().add_element_user(CAREPLAN$0);
            return target;
        }
    }
}
