/*
 * An XML document type.
 * Localname: Order
 * Namespace: http://hl7.org/fhir
 * Java type: org.hl7.fhir.OrderDocument
 *
 * Automatically generated - do not modify.
 */
package org.hl7.fhir.impl;
/**
 * A document containing one Order(@http://hl7.org/fhir) element.
 *
 * This is a complex type.
 */
public class OrderDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.hl7.fhir.OrderDocument
{
    private static final long serialVersionUID = 1L;
    
    public OrderDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName ORDER$0 = 
        new javax.xml.namespace.QName("http://hl7.org/fhir", "Order");
    
    
    /**
     * Gets the "Order" element
     */
    public org.hl7.fhir.Order getOrder()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.Order target = null;
            target = (org.hl7.fhir.Order)get_store().find_element_user(ORDER$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "Order" element
     */
    public void setOrder(org.hl7.fhir.Order order)
    {
        generatedSetterHelperImpl(order, ORDER$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "Order" element
     */
    public org.hl7.fhir.Order addNewOrder()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.Order target = null;
            target = (org.hl7.fhir.Order)get_store().add_element_user(ORDER$0);
            return target;
        }
    }
}
