/*
 * An XML document type.
 * Localname: MedicationStatement
 * Namespace: http://hl7.org/fhir
 * Java type: org.hl7.fhir.MedicationStatementDocument
 *
 * Automatically generated - do not modify.
 */
package org.hl7.fhir.impl;
/**
 * A document containing one MedicationStatement(@http://hl7.org/fhir) element.
 *
 * This is a complex type.
 */
public class MedicationStatementDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.hl7.fhir.MedicationStatementDocument
{
    private static final long serialVersionUID = 1L;
    
    public MedicationStatementDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName MEDICATIONSTATEMENT$0 = 
        new javax.xml.namespace.QName("http://hl7.org/fhir", "MedicationStatement");
    
    
    /**
     * Gets the "MedicationStatement" element
     */
    public org.hl7.fhir.MedicationStatement getMedicationStatement()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.MedicationStatement target = null;
            target = (org.hl7.fhir.MedicationStatement)get_store().find_element_user(MEDICATIONSTATEMENT$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "MedicationStatement" element
     */
    public void setMedicationStatement(org.hl7.fhir.MedicationStatement medicationStatement)
    {
        generatedSetterHelperImpl(medicationStatement, MEDICATIONSTATEMENT$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "MedicationStatement" element
     */
    public org.hl7.fhir.MedicationStatement addNewMedicationStatement()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.MedicationStatement target = null;
            target = (org.hl7.fhir.MedicationStatement)get_store().add_element_user(MEDICATIONSTATEMENT$0);
            return target;
        }
    }
}
