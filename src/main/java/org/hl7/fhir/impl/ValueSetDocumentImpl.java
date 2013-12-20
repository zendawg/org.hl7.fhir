/*
 * An XML document type.
 * Localname: ValueSet
 * Namespace: http://hl7.org/fhir
 * Java type: org.hl7.fhir.ValueSetDocument
 *
 * Automatically generated - do not modify.
 */
package org.hl7.fhir.impl;
/**
 * A document containing one ValueSet(@http://hl7.org/fhir) element.
 *
 * This is a complex type.
 */
public class ValueSetDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.hl7.fhir.ValueSetDocument
{
    private static final long serialVersionUID = 1L;
    
    public ValueSetDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName VALUESET$0 = 
        new javax.xml.namespace.QName("http://hl7.org/fhir", "ValueSet");
    
    
    /**
     * Gets the "ValueSet" element
     */
    public org.hl7.fhir.ValueSet getValueSet()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.ValueSet target = null;
            target = (org.hl7.fhir.ValueSet)get_store().find_element_user(VALUESET$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "ValueSet" element
     */
    public void setValueSet(org.hl7.fhir.ValueSet valueSet)
    {
        generatedSetterHelperImpl(valueSet, VALUESET$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "ValueSet" element
     */
    public org.hl7.fhir.ValueSet addNewValueSet()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.ValueSet target = null;
            target = (org.hl7.fhir.ValueSet)get_store().add_element_user(VALUESET$0);
            return target;
        }
    }
}
