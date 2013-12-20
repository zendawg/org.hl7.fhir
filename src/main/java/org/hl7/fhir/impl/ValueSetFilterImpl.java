/*
 * XML Type:  ValueSet.Filter
 * Namespace: http://hl7.org/fhir
 * Java type: org.hl7.fhir.ValueSetFilter
 *
 * Automatically generated - do not modify.
 */
package org.hl7.fhir.impl;
/**
 * An XML ValueSet.Filter(@http://hl7.org/fhir).
 *
 * This is a complex type.
 */
public class ValueSetFilterImpl extends org.hl7.fhir.impl.BackboneElementImpl implements org.hl7.fhir.ValueSetFilter
{
    private static final long serialVersionUID = 1L;
    
    public ValueSetFilterImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName PROPERTY$0 = 
        new javax.xml.namespace.QName("http://hl7.org/fhir", "property");
    private static final javax.xml.namespace.QName OP$2 = 
        new javax.xml.namespace.QName("http://hl7.org/fhir", "op");
    private static final javax.xml.namespace.QName VALUE$4 = 
        new javax.xml.namespace.QName("http://hl7.org/fhir", "value");
    
    
    /**
     * Gets the "property" element
     */
    public org.hl7.fhir.Code getProperty()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.Code target = null;
            target = (org.hl7.fhir.Code)get_store().find_element_user(PROPERTY$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "property" element
     */
    public void setProperty(org.hl7.fhir.Code property)
    {
        generatedSetterHelperImpl(property, PROPERTY$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "property" element
     */
    public org.hl7.fhir.Code addNewProperty()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.Code target = null;
            target = (org.hl7.fhir.Code)get_store().add_element_user(PROPERTY$0);
            return target;
        }
    }
    
    /**
     * Gets the "op" element
     */
    public org.hl7.fhir.FilterOperator getOp()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.FilterOperator target = null;
            target = (org.hl7.fhir.FilterOperator)get_store().find_element_user(OP$2, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "op" element
     */
    public void setOp(org.hl7.fhir.FilterOperator op)
    {
        generatedSetterHelperImpl(op, OP$2, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "op" element
     */
    public org.hl7.fhir.FilterOperator addNewOp()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.FilterOperator target = null;
            target = (org.hl7.fhir.FilterOperator)get_store().add_element_user(OP$2);
            return target;
        }
    }
    
    /**
     * Gets the "value" element
     */
    public org.hl7.fhir.Code getValue()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.Code target = null;
            target = (org.hl7.fhir.Code)get_store().find_element_user(VALUE$4, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "value" element
     */
    public void setValue(org.hl7.fhir.Code value)
    {
        generatedSetterHelperImpl(value, VALUE$4, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "value" element
     */
    public org.hl7.fhir.Code addNewValue()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.Code target = null;
            target = (org.hl7.fhir.Code)get_store().add_element_user(VALUE$4);
            return target;
        }
    }
}
