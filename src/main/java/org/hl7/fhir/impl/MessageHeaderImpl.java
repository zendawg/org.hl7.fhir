/*
 * XML Type:  MessageHeader
 * Namespace: http://hl7.org/fhir
 * Java type: org.hl7.fhir.MessageHeader
 *
 * Automatically generated - do not modify.
 */
package org.hl7.fhir.impl;
/**
 * An XML MessageHeader(@http://hl7.org/fhir).
 *
 * This is a complex type.
 */
public class MessageHeaderImpl extends org.hl7.fhir.impl.ResourceImpl implements org.hl7.fhir.MessageHeader
{
    private static final long serialVersionUID = 1L;
    
    public MessageHeaderImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName IDENTIFIER$0 = 
        new javax.xml.namespace.QName("http://hl7.org/fhir", "identifier");
    private static final javax.xml.namespace.QName TIMESTAMP$2 = 
        new javax.xml.namespace.QName("http://hl7.org/fhir", "timestamp");
    private static final javax.xml.namespace.QName EVENT$4 = 
        new javax.xml.namespace.QName("http://hl7.org/fhir", "event");
    private static final javax.xml.namespace.QName RESPONSE$6 = 
        new javax.xml.namespace.QName("http://hl7.org/fhir", "response");
    private static final javax.xml.namespace.QName SOURCE$8 = 
        new javax.xml.namespace.QName("http://hl7.org/fhir", "source");
    private static final javax.xml.namespace.QName DESTINATION$10 = 
        new javax.xml.namespace.QName("http://hl7.org/fhir", "destination");
    private static final javax.xml.namespace.QName ENTERER$12 = 
        new javax.xml.namespace.QName("http://hl7.org/fhir", "enterer");
    private static final javax.xml.namespace.QName AUTHOR$14 = 
        new javax.xml.namespace.QName("http://hl7.org/fhir", "author");
    private static final javax.xml.namespace.QName RECEIVER$16 = 
        new javax.xml.namespace.QName("http://hl7.org/fhir", "receiver");
    private static final javax.xml.namespace.QName RESPONSIBLE$18 = 
        new javax.xml.namespace.QName("http://hl7.org/fhir", "responsible");
    private static final javax.xml.namespace.QName REASON$20 = 
        new javax.xml.namespace.QName("http://hl7.org/fhir", "reason");
    private static final javax.xml.namespace.QName DATA$22 = 
        new javax.xml.namespace.QName("http://hl7.org/fhir", "data");
    
    
    /**
     * Gets the "identifier" element
     */
    public org.hl7.fhir.Id getIdentifier()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.Id target = null;
            target = (org.hl7.fhir.Id)get_store().find_element_user(IDENTIFIER$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "identifier" element
     */
    public void setIdentifier(org.hl7.fhir.Id identifier)
    {
        generatedSetterHelperImpl(identifier, IDENTIFIER$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "identifier" element
     */
    public org.hl7.fhir.Id addNewIdentifier()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.Id target = null;
            target = (org.hl7.fhir.Id)get_store().add_element_user(IDENTIFIER$0);
            return target;
        }
    }
    
    /**
     * Gets the "timestamp" element
     */
    public org.hl7.fhir.Instant getTimestamp()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.Instant target = null;
            target = (org.hl7.fhir.Instant)get_store().find_element_user(TIMESTAMP$2, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "timestamp" element
     */
    public void setTimestamp(org.hl7.fhir.Instant timestamp)
    {
        generatedSetterHelperImpl(timestamp, TIMESTAMP$2, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "timestamp" element
     */
    public org.hl7.fhir.Instant addNewTimestamp()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.Instant target = null;
            target = (org.hl7.fhir.Instant)get_store().add_element_user(TIMESTAMP$2);
            return target;
        }
    }
    
    /**
     * Gets the "event" element
     */
    public org.hl7.fhir.Coding getEvent()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.Coding target = null;
            target = (org.hl7.fhir.Coding)get_store().find_element_user(EVENT$4, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "event" element
     */
    public void setEvent(org.hl7.fhir.Coding event)
    {
        generatedSetterHelperImpl(event, EVENT$4, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "event" element
     */
    public org.hl7.fhir.Coding addNewEvent()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.Coding target = null;
            target = (org.hl7.fhir.Coding)get_store().add_element_user(EVENT$4);
            return target;
        }
    }
    
    /**
     * Gets the "response" element
     */
    public org.hl7.fhir.MessageHeaderResponse getResponse()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.MessageHeaderResponse target = null;
            target = (org.hl7.fhir.MessageHeaderResponse)get_store().find_element_user(RESPONSE$6, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "response" element
     */
    public boolean isSetResponse()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(RESPONSE$6) != 0;
        }
    }
    
    /**
     * Sets the "response" element
     */
    public void setResponse(org.hl7.fhir.MessageHeaderResponse response)
    {
        generatedSetterHelperImpl(response, RESPONSE$6, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "response" element
     */
    public org.hl7.fhir.MessageHeaderResponse addNewResponse()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.MessageHeaderResponse target = null;
            target = (org.hl7.fhir.MessageHeaderResponse)get_store().add_element_user(RESPONSE$6);
            return target;
        }
    }
    
    /**
     * Unsets the "response" element
     */
    public void unsetResponse()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(RESPONSE$6, 0);
        }
    }
    
    /**
     * Gets the "source" element
     */
    public org.hl7.fhir.MessageHeaderSource getSource()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.MessageHeaderSource target = null;
            target = (org.hl7.fhir.MessageHeaderSource)get_store().find_element_user(SOURCE$8, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "source" element
     */
    public void setSource(org.hl7.fhir.MessageHeaderSource source)
    {
        generatedSetterHelperImpl(source, SOURCE$8, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "source" element
     */
    public org.hl7.fhir.MessageHeaderSource addNewSource()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.MessageHeaderSource target = null;
            target = (org.hl7.fhir.MessageHeaderSource)get_store().add_element_user(SOURCE$8);
            return target;
        }
    }
    
    /**
     * Gets array of all "destination" elements
     */
    public org.hl7.fhir.MessageHeaderDestination[] getDestinationArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(DESTINATION$10, targetList);
            org.hl7.fhir.MessageHeaderDestination[] result = new org.hl7.fhir.MessageHeaderDestination[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "destination" element
     */
    public org.hl7.fhir.MessageHeaderDestination getDestinationArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.MessageHeaderDestination target = null;
            target = (org.hl7.fhir.MessageHeaderDestination)get_store().find_element_user(DESTINATION$10, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "destination" element
     */
    public int sizeOfDestinationArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(DESTINATION$10);
        }
    }
    
    /**
     * Sets array of all "destination" element  WARNING: This method is not atomicaly synchronized.
     */
    public void setDestinationArray(org.hl7.fhir.MessageHeaderDestination[] destinationArray)
    {
        check_orphaned();
        arraySetterHelper(destinationArray, DESTINATION$10);
    }
    
    /**
     * Sets ith "destination" element
     */
    public void setDestinationArray(int i, org.hl7.fhir.MessageHeaderDestination destination)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.MessageHeaderDestination target = null;
            target = (org.hl7.fhir.MessageHeaderDestination)get_store().find_element_user(DESTINATION$10, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(destination);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "destination" element
     */
    public org.hl7.fhir.MessageHeaderDestination insertNewDestination(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.MessageHeaderDestination target = null;
            target = (org.hl7.fhir.MessageHeaderDestination)get_store().insert_element_user(DESTINATION$10, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "destination" element
     */
    public org.hl7.fhir.MessageHeaderDestination addNewDestination()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.MessageHeaderDestination target = null;
            target = (org.hl7.fhir.MessageHeaderDestination)get_store().add_element_user(DESTINATION$10);
            return target;
        }
    }
    
    /**
     * Removes the ith "destination" element
     */
    public void removeDestination(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(DESTINATION$10, i);
        }
    }
    
    /**
     * Gets the "enterer" element
     */
    public org.hl7.fhir.ResourceReference getEnterer()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.ResourceReference target = null;
            target = (org.hl7.fhir.ResourceReference)get_store().find_element_user(ENTERER$12, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "enterer" element
     */
    public boolean isSetEnterer()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(ENTERER$12) != 0;
        }
    }
    
    /**
     * Sets the "enterer" element
     */
    public void setEnterer(org.hl7.fhir.ResourceReference enterer)
    {
        generatedSetterHelperImpl(enterer, ENTERER$12, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "enterer" element
     */
    public org.hl7.fhir.ResourceReference addNewEnterer()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.ResourceReference target = null;
            target = (org.hl7.fhir.ResourceReference)get_store().add_element_user(ENTERER$12);
            return target;
        }
    }
    
    /**
     * Unsets the "enterer" element
     */
    public void unsetEnterer()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(ENTERER$12, 0);
        }
    }
    
    /**
     * Gets the "author" element
     */
    public org.hl7.fhir.ResourceReference getAuthor()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.ResourceReference target = null;
            target = (org.hl7.fhir.ResourceReference)get_store().find_element_user(AUTHOR$14, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "author" element
     */
    public boolean isSetAuthor()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(AUTHOR$14) != 0;
        }
    }
    
    /**
     * Sets the "author" element
     */
    public void setAuthor(org.hl7.fhir.ResourceReference author)
    {
        generatedSetterHelperImpl(author, AUTHOR$14, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "author" element
     */
    public org.hl7.fhir.ResourceReference addNewAuthor()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.ResourceReference target = null;
            target = (org.hl7.fhir.ResourceReference)get_store().add_element_user(AUTHOR$14);
            return target;
        }
    }
    
    /**
     * Unsets the "author" element
     */
    public void unsetAuthor()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(AUTHOR$14, 0);
        }
    }
    
    /**
     * Gets the "receiver" element
     */
    public org.hl7.fhir.ResourceReference getReceiver()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.ResourceReference target = null;
            target = (org.hl7.fhir.ResourceReference)get_store().find_element_user(RECEIVER$16, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "receiver" element
     */
    public boolean isSetReceiver()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(RECEIVER$16) != 0;
        }
    }
    
    /**
     * Sets the "receiver" element
     */
    public void setReceiver(org.hl7.fhir.ResourceReference receiver)
    {
        generatedSetterHelperImpl(receiver, RECEIVER$16, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "receiver" element
     */
    public org.hl7.fhir.ResourceReference addNewReceiver()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.ResourceReference target = null;
            target = (org.hl7.fhir.ResourceReference)get_store().add_element_user(RECEIVER$16);
            return target;
        }
    }
    
    /**
     * Unsets the "receiver" element
     */
    public void unsetReceiver()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(RECEIVER$16, 0);
        }
    }
    
    /**
     * Gets the "responsible" element
     */
    public org.hl7.fhir.ResourceReference getResponsible()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.ResourceReference target = null;
            target = (org.hl7.fhir.ResourceReference)get_store().find_element_user(RESPONSIBLE$18, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "responsible" element
     */
    public boolean isSetResponsible()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(RESPONSIBLE$18) != 0;
        }
    }
    
    /**
     * Sets the "responsible" element
     */
    public void setResponsible(org.hl7.fhir.ResourceReference responsible)
    {
        generatedSetterHelperImpl(responsible, RESPONSIBLE$18, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "responsible" element
     */
    public org.hl7.fhir.ResourceReference addNewResponsible()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.ResourceReference target = null;
            target = (org.hl7.fhir.ResourceReference)get_store().add_element_user(RESPONSIBLE$18);
            return target;
        }
    }
    
    /**
     * Unsets the "responsible" element
     */
    public void unsetResponsible()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(RESPONSIBLE$18, 0);
        }
    }
    
    /**
     * Gets the "reason" element
     */
    public org.hl7.fhir.CodeableConcept getReason()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.CodeableConcept target = null;
            target = (org.hl7.fhir.CodeableConcept)get_store().find_element_user(REASON$20, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "reason" element
     */
    public boolean isSetReason()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(REASON$20) != 0;
        }
    }
    
    /**
     * Sets the "reason" element
     */
    public void setReason(org.hl7.fhir.CodeableConcept reason)
    {
        generatedSetterHelperImpl(reason, REASON$20, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "reason" element
     */
    public org.hl7.fhir.CodeableConcept addNewReason()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.CodeableConcept target = null;
            target = (org.hl7.fhir.CodeableConcept)get_store().add_element_user(REASON$20);
            return target;
        }
    }
    
    /**
     * Unsets the "reason" element
     */
    public void unsetReason()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(REASON$20, 0);
        }
    }
    
    /**
     * Gets array of all "data" elements
     */
    public org.hl7.fhir.ResourceReference[] getDataArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(DATA$22, targetList);
            org.hl7.fhir.ResourceReference[] result = new org.hl7.fhir.ResourceReference[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "data" element
     */
    public org.hl7.fhir.ResourceReference getDataArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.ResourceReference target = null;
            target = (org.hl7.fhir.ResourceReference)get_store().find_element_user(DATA$22, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "data" element
     */
    public int sizeOfDataArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(DATA$22);
        }
    }
    
    /**
     * Sets array of all "data" element  WARNING: This method is not atomicaly synchronized.
     */
    public void setDataArray(org.hl7.fhir.ResourceReference[] dataArray)
    {
        check_orphaned();
        arraySetterHelper(dataArray, DATA$22);
    }
    
    /**
     * Sets ith "data" element
     */
    public void setDataArray(int i, org.hl7.fhir.ResourceReference data)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.ResourceReference target = null;
            target = (org.hl7.fhir.ResourceReference)get_store().find_element_user(DATA$22, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(data);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "data" element
     */
    public org.hl7.fhir.ResourceReference insertNewData(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.ResourceReference target = null;
            target = (org.hl7.fhir.ResourceReference)get_store().insert_element_user(DATA$22, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "data" element
     */
    public org.hl7.fhir.ResourceReference addNewData()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.ResourceReference target = null;
            target = (org.hl7.fhir.ResourceReference)get_store().add_element_user(DATA$22);
            return target;
        }
    }
    
    /**
     * Removes the ith "data" element
     */
    public void removeData(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(DATA$22, i);
        }
    }
}
