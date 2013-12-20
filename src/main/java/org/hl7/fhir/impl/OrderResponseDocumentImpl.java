/*
 * An XML document type.
 * Localname: OrderResponse
 * Namespace: http://hl7.org/fhir
 * Java type: org.hl7.fhir.OrderResponseDocument
 *
 * Automatically generated - do not modify.
 */
package org.hl7.fhir.impl;
/**
 * A document containing one OrderResponse(@http://hl7.org/fhir) element.
 *
 * This is a complex type.
 */
public class OrderResponseDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.hl7.fhir.OrderResponseDocument
{
    private static final long serialVersionUID = 1L;
    
    public OrderResponseDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName ORDERRESPONSE$0 = 
        new javax.xml.namespace.QName("http://hl7.org/fhir", "OrderResponse");
    
    
    /**
     * Gets the "OrderResponse" element
     */
    public org.hl7.fhir.OrderResponse getOrderResponse()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.OrderResponse target = null;
            target = (org.hl7.fhir.OrderResponse)get_store().find_element_user(ORDERRESPONSE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "OrderResponse" element
     */
    public void setOrderResponse(org.hl7.fhir.OrderResponse orderResponse)
    {
        generatedSetterHelperImpl(orderResponse, ORDERRESPONSE$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "OrderResponse" element
     */
    public org.hl7.fhir.OrderResponse addNewOrderResponse()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.OrderResponse target = null;
            target = (org.hl7.fhir.OrderResponse)get_store().add_element_user(ORDERRESPONSE$0);
            return target;
        }
    }
}
