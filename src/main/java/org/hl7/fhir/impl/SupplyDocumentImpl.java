/*
 * An XML document type.
 * Localname: Supply
 * Namespace: http://hl7.org/fhir
 * Java type: org.hl7.fhir.SupplyDocument
 *
 * Automatically generated - do not modify.
 */
package org.hl7.fhir.impl;
/**
 * A document containing one Supply(@http://hl7.org/fhir) element.
 *
 * This is a complex type.
 */
public class SupplyDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.hl7.fhir.SupplyDocument
{
    private static final long serialVersionUID = 1L;
    
    public SupplyDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName SUPPLY$0 = 
        new javax.xml.namespace.QName("http://hl7.org/fhir", "Supply");
    
    
    /**
     * Gets the "Supply" element
     */
    public org.hl7.fhir.Supply getSupply()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.Supply target = null;
            target = (org.hl7.fhir.Supply)get_store().find_element_user(SUPPLY$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "Supply" element
     */
    public void setSupply(org.hl7.fhir.Supply supply)
    {
        generatedSetterHelperImpl(supply, SUPPLY$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "Supply" element
     */
    public org.hl7.fhir.Supply addNewSupply()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.Supply target = null;
            target = (org.hl7.fhir.Supply)get_store().add_element_user(SUPPLY$0);
            return target;
        }
    }
}
