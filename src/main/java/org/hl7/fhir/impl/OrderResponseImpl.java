/*
 * XML Type:  OrderResponse
 * Namespace: http://hl7.org/fhir
 * Java type: org.hl7.fhir.OrderResponse
 *
 * Automatically generated - do not modify.
 */
package org.hl7.fhir.impl;
/**
 * An XML OrderResponse(@http://hl7.org/fhir).
 *
 * This is a complex type.
 */
public class OrderResponseImpl extends org.hl7.fhir.impl.ResourceImpl implements org.hl7.fhir.OrderResponse
{
    private static final long serialVersionUID = 1L;
    
    public OrderResponseImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName IDENTIFIER$0 = 
        new javax.xml.namespace.QName("http://hl7.org/fhir", "identifier");
    private static final javax.xml.namespace.QName REQUEST$2 = 
        new javax.xml.namespace.QName("http://hl7.org/fhir", "request");
    private static final javax.xml.namespace.QName DATE$4 = 
        new javax.xml.namespace.QName("http://hl7.org/fhir", "date");
    private static final javax.xml.namespace.QName WHO$6 = 
        new javax.xml.namespace.QName("http://hl7.org/fhir", "who");
    private static final javax.xml.namespace.QName AUTHORITYCODEABLECONCEPT$8 = 
        new javax.xml.namespace.QName("http://hl7.org/fhir", "authorityCodeableConcept");
    private static final javax.xml.namespace.QName AUTHORITYRESOURCE$10 = 
        new javax.xml.namespace.QName("http://hl7.org/fhir", "authorityResource");
    private static final javax.xml.namespace.QName CODE$12 = 
        new javax.xml.namespace.QName("http://hl7.org/fhir", "code");
    private static final javax.xml.namespace.QName DESCRIPTION$14 = 
        new javax.xml.namespace.QName("http://hl7.org/fhir", "description");
    private static final javax.xml.namespace.QName FULFILLMENT$16 = 
        new javax.xml.namespace.QName("http://hl7.org/fhir", "fulfillment");
    
    
    /**
     * Gets array of all "identifier" elements
     */
    public org.hl7.fhir.Identifier[] getIdentifierArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(IDENTIFIER$0, targetList);
            org.hl7.fhir.Identifier[] result = new org.hl7.fhir.Identifier[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "identifier" element
     */
    public org.hl7.fhir.Identifier getIdentifierArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.Identifier target = null;
            target = (org.hl7.fhir.Identifier)get_store().find_element_user(IDENTIFIER$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "identifier" element
     */
    public int sizeOfIdentifierArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(IDENTIFIER$0);
        }
    }
    
    /**
     * Sets array of all "identifier" element  WARNING: This method is not atomicaly synchronized.
     */
    public void setIdentifierArray(org.hl7.fhir.Identifier[] identifierArray)
    {
        check_orphaned();
        arraySetterHelper(identifierArray, IDENTIFIER$0);
    }
    
    /**
     * Sets ith "identifier" element
     */
    public void setIdentifierArray(int i, org.hl7.fhir.Identifier identifier)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.Identifier target = null;
            target = (org.hl7.fhir.Identifier)get_store().find_element_user(IDENTIFIER$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(identifier);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "identifier" element
     */
    public org.hl7.fhir.Identifier insertNewIdentifier(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.Identifier target = null;
            target = (org.hl7.fhir.Identifier)get_store().insert_element_user(IDENTIFIER$0, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "identifier" element
     */
    public org.hl7.fhir.Identifier addNewIdentifier()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.Identifier target = null;
            target = (org.hl7.fhir.Identifier)get_store().add_element_user(IDENTIFIER$0);
            return target;
        }
    }
    
    /**
     * Removes the ith "identifier" element
     */
    public void removeIdentifier(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(IDENTIFIER$0, i);
        }
    }
    
    /**
     * Gets the "request" element
     */
    public org.hl7.fhir.ResourceReference getRequest()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.ResourceReference target = null;
            target = (org.hl7.fhir.ResourceReference)get_store().find_element_user(REQUEST$2, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "request" element
     */
    public void setRequest(org.hl7.fhir.ResourceReference request)
    {
        generatedSetterHelperImpl(request, REQUEST$2, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "request" element
     */
    public org.hl7.fhir.ResourceReference addNewRequest()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.ResourceReference target = null;
            target = (org.hl7.fhir.ResourceReference)get_store().add_element_user(REQUEST$2);
            return target;
        }
    }
    
    /**
     * Gets the "date" element
     */
    public org.hl7.fhir.DateTime getDate()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.DateTime target = null;
            target = (org.hl7.fhir.DateTime)get_store().find_element_user(DATE$4, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "date" element
     */
    public boolean isSetDate()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(DATE$4) != 0;
        }
    }
    
    /**
     * Sets the "date" element
     */
    public void setDate(org.hl7.fhir.DateTime date)
    {
        generatedSetterHelperImpl(date, DATE$4, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "date" element
     */
    public org.hl7.fhir.DateTime addNewDate()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.DateTime target = null;
            target = (org.hl7.fhir.DateTime)get_store().add_element_user(DATE$4);
            return target;
        }
    }
    
    /**
     * Unsets the "date" element
     */
    public void unsetDate()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(DATE$4, 0);
        }
    }
    
    /**
     * Gets the "who" element
     */
    public org.hl7.fhir.ResourceReference getWho()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.ResourceReference target = null;
            target = (org.hl7.fhir.ResourceReference)get_store().find_element_user(WHO$6, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "who" element
     */
    public boolean isSetWho()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(WHO$6) != 0;
        }
    }
    
    /**
     * Sets the "who" element
     */
    public void setWho(org.hl7.fhir.ResourceReference who)
    {
        generatedSetterHelperImpl(who, WHO$6, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "who" element
     */
    public org.hl7.fhir.ResourceReference addNewWho()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.ResourceReference target = null;
            target = (org.hl7.fhir.ResourceReference)get_store().add_element_user(WHO$6);
            return target;
        }
    }
    
    /**
     * Unsets the "who" element
     */
    public void unsetWho()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(WHO$6, 0);
        }
    }
    
    /**
     * Gets the "authorityCodeableConcept" element
     */
    public org.hl7.fhir.CodeableConcept getAuthorityCodeableConcept()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.CodeableConcept target = null;
            target = (org.hl7.fhir.CodeableConcept)get_store().find_element_user(AUTHORITYCODEABLECONCEPT$8, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "authorityCodeableConcept" element
     */
    public boolean isSetAuthorityCodeableConcept()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(AUTHORITYCODEABLECONCEPT$8) != 0;
        }
    }
    
    /**
     * Sets the "authorityCodeableConcept" element
     */
    public void setAuthorityCodeableConcept(org.hl7.fhir.CodeableConcept authorityCodeableConcept)
    {
        generatedSetterHelperImpl(authorityCodeableConcept, AUTHORITYCODEABLECONCEPT$8, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "authorityCodeableConcept" element
     */
    public org.hl7.fhir.CodeableConcept addNewAuthorityCodeableConcept()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.CodeableConcept target = null;
            target = (org.hl7.fhir.CodeableConcept)get_store().add_element_user(AUTHORITYCODEABLECONCEPT$8);
            return target;
        }
    }
    
    /**
     * Unsets the "authorityCodeableConcept" element
     */
    public void unsetAuthorityCodeableConcept()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(AUTHORITYCODEABLECONCEPT$8, 0);
        }
    }
    
    /**
     * Gets the "authorityResource" element
     */
    public org.hl7.fhir.ResourceReference getAuthorityResource()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.ResourceReference target = null;
            target = (org.hl7.fhir.ResourceReference)get_store().find_element_user(AUTHORITYRESOURCE$10, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "authorityResource" element
     */
    public boolean isSetAuthorityResource()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(AUTHORITYRESOURCE$10) != 0;
        }
    }
    
    /**
     * Sets the "authorityResource" element
     */
    public void setAuthorityResource(org.hl7.fhir.ResourceReference authorityResource)
    {
        generatedSetterHelperImpl(authorityResource, AUTHORITYRESOURCE$10, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "authorityResource" element
     */
    public org.hl7.fhir.ResourceReference addNewAuthorityResource()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.ResourceReference target = null;
            target = (org.hl7.fhir.ResourceReference)get_store().add_element_user(AUTHORITYRESOURCE$10);
            return target;
        }
    }
    
    /**
     * Unsets the "authorityResource" element
     */
    public void unsetAuthorityResource()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(AUTHORITYRESOURCE$10, 0);
        }
    }
    
    /**
     * Gets the "code" element
     */
    public org.hl7.fhir.OrderOutcomeStatus getCode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.OrderOutcomeStatus target = null;
            target = (org.hl7.fhir.OrderOutcomeStatus)get_store().find_element_user(CODE$12, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "code" element
     */
    public void setCode(org.hl7.fhir.OrderOutcomeStatus code)
    {
        generatedSetterHelperImpl(code, CODE$12, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "code" element
     */
    public org.hl7.fhir.OrderOutcomeStatus addNewCode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.OrderOutcomeStatus target = null;
            target = (org.hl7.fhir.OrderOutcomeStatus)get_store().add_element_user(CODE$12);
            return target;
        }
    }
    
    /**
     * Gets the "description" element
     */
    public org.hl7.fhir.String getDescription()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.String target = null;
            target = (org.hl7.fhir.String)get_store().find_element_user(DESCRIPTION$14, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "description" element
     */
    public boolean isSetDescription()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(DESCRIPTION$14) != 0;
        }
    }
    
    /**
     * Sets the "description" element
     */
    public void setDescription(org.hl7.fhir.String description)
    {
        generatedSetterHelperImpl(description, DESCRIPTION$14, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "description" element
     */
    public org.hl7.fhir.String addNewDescription()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.String target = null;
            target = (org.hl7.fhir.String)get_store().add_element_user(DESCRIPTION$14);
            return target;
        }
    }
    
    /**
     * Unsets the "description" element
     */
    public void unsetDescription()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(DESCRIPTION$14, 0);
        }
    }
    
    /**
     * Gets array of all "fulfillment" elements
     */
    public org.hl7.fhir.ResourceReference[] getFulfillmentArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(FULFILLMENT$16, targetList);
            org.hl7.fhir.ResourceReference[] result = new org.hl7.fhir.ResourceReference[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "fulfillment" element
     */
    public org.hl7.fhir.ResourceReference getFulfillmentArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.ResourceReference target = null;
            target = (org.hl7.fhir.ResourceReference)get_store().find_element_user(FULFILLMENT$16, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "fulfillment" element
     */
    public int sizeOfFulfillmentArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(FULFILLMENT$16);
        }
    }
    
    /**
     * Sets array of all "fulfillment" element  WARNING: This method is not atomicaly synchronized.
     */
    public void setFulfillmentArray(org.hl7.fhir.ResourceReference[] fulfillmentArray)
    {
        check_orphaned();
        arraySetterHelper(fulfillmentArray, FULFILLMENT$16);
    }
    
    /**
     * Sets ith "fulfillment" element
     */
    public void setFulfillmentArray(int i, org.hl7.fhir.ResourceReference fulfillment)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.ResourceReference target = null;
            target = (org.hl7.fhir.ResourceReference)get_store().find_element_user(FULFILLMENT$16, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(fulfillment);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "fulfillment" element
     */
    public org.hl7.fhir.ResourceReference insertNewFulfillment(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.ResourceReference target = null;
            target = (org.hl7.fhir.ResourceReference)get_store().insert_element_user(FULFILLMENT$16, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "fulfillment" element
     */
    public org.hl7.fhir.ResourceReference addNewFulfillment()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.ResourceReference target = null;
            target = (org.hl7.fhir.ResourceReference)get_store().add_element_user(FULFILLMENT$16);
            return target;
        }
    }
    
    /**
     * Removes the ith "fulfillment" element
     */
    public void removeFulfillment(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(FULFILLMENT$16, i);
        }
    }
}
