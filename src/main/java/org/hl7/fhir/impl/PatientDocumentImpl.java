/*
 * An XML document type.
 * Localname: Patient
 * Namespace: http://hl7.org/fhir
 * Java type: org.hl7.fhir.PatientDocument
 *
 * Automatically generated - do not modify.
 */
package org.hl7.fhir.impl;
/**
 * A document containing one Patient(@http://hl7.org/fhir) element.
 *
 * This is a complex type.
 */
public class PatientDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.hl7.fhir.PatientDocument
{
    private static final long serialVersionUID = 1L;
    
    public PatientDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName PATIENT$0 = 
        new javax.xml.namespace.QName("http://hl7.org/fhir", "Patient");
    
    
    /**
     * Gets the "Patient" element
     */
    public org.hl7.fhir.Patient getPatient()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.Patient target = null;
            target = (org.hl7.fhir.Patient)get_store().find_element_user(PATIENT$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "Patient" element
     */
    public void setPatient(org.hl7.fhir.Patient patient)
    {
        generatedSetterHelperImpl(patient, PATIENT$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "Patient" element
     */
    public org.hl7.fhir.Patient addNewPatient()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.Patient target = null;
            target = (org.hl7.fhir.Patient)get_store().add_element_user(PATIENT$0);
            return target;
        }
    }
}
