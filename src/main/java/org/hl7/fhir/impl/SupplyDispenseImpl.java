/*
 * XML Type:  Supply.Dispense
 * Namespace: http://hl7.org/fhir
 * Java type: org.hl7.fhir.SupplyDispense
 *
 * Automatically generated - do not modify.
 */
package org.hl7.fhir.impl;
/**
 * An XML Supply.Dispense(@http://hl7.org/fhir).
 *
 * This is a complex type.
 */
public class SupplyDispenseImpl extends org.hl7.fhir.impl.BackboneElementImpl implements org.hl7.fhir.SupplyDispense
{
    private static final long serialVersionUID = 1L;
    
    public SupplyDispenseImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName IDENTIFIER$0 = 
        new javax.xml.namespace.QName("http://hl7.org/fhir", "identifier");
    private static final javax.xml.namespace.QName STATUS$2 = 
        new javax.xml.namespace.QName("http://hl7.org/fhir", "status");
    private static final javax.xml.namespace.QName TYPE$4 = 
        new javax.xml.namespace.QName("http://hl7.org/fhir", "type");
    private static final javax.xml.namespace.QName QUANTITY$6 = 
        new javax.xml.namespace.QName("http://hl7.org/fhir", "quantity");
    private static final javax.xml.namespace.QName SUPPLIEDITEM$8 = 
        new javax.xml.namespace.QName("http://hl7.org/fhir", "suppliedItem");
    private static final javax.xml.namespace.QName SUPPLIER$10 = 
        new javax.xml.namespace.QName("http://hl7.org/fhir", "supplier");
    private static final javax.xml.namespace.QName WHENPREPARED$12 = 
        new javax.xml.namespace.QName("http://hl7.org/fhir", "whenPrepared");
    private static final javax.xml.namespace.QName WHENHANDEDOVER$14 = 
        new javax.xml.namespace.QName("http://hl7.org/fhir", "whenHandedOver");
    private static final javax.xml.namespace.QName DESTINATION$16 = 
        new javax.xml.namespace.QName("http://hl7.org/fhir", "destination");
    private static final javax.xml.namespace.QName RECEIVER$18 = 
        new javax.xml.namespace.QName("http://hl7.org/fhir", "receiver");
    
    
    /**
     * Gets the "identifier" element
     */
    public org.hl7.fhir.Identifier getIdentifier()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.Identifier target = null;
            target = (org.hl7.fhir.Identifier)get_store().find_element_user(IDENTIFIER$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "identifier" element
     */
    public boolean isSetIdentifier()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(IDENTIFIER$0) != 0;
        }
    }
    
    /**
     * Sets the "identifier" element
     */
    public void setIdentifier(org.hl7.fhir.Identifier identifier)
    {
        generatedSetterHelperImpl(identifier, IDENTIFIER$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "identifier" element
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
     * Unsets the "identifier" element
     */
    public void unsetIdentifier()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(IDENTIFIER$0, 0);
        }
    }
    
    /**
     * Gets the "status" element
     */
    public org.hl7.fhir.SupplyDispenseStatus getStatus()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.SupplyDispenseStatus target = null;
            target = (org.hl7.fhir.SupplyDispenseStatus)get_store().find_element_user(STATUS$2, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "status" element
     */
    public boolean isSetStatus()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(STATUS$2) != 0;
        }
    }
    
    /**
     * Sets the "status" element
     */
    public void setStatus(org.hl7.fhir.SupplyDispenseStatus status)
    {
        generatedSetterHelperImpl(status, STATUS$2, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "status" element
     */
    public org.hl7.fhir.SupplyDispenseStatus addNewStatus()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.SupplyDispenseStatus target = null;
            target = (org.hl7.fhir.SupplyDispenseStatus)get_store().add_element_user(STATUS$2);
            return target;
        }
    }
    
    /**
     * Unsets the "status" element
     */
    public void unsetStatus()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(STATUS$2, 0);
        }
    }
    
    /**
     * Gets the "type" element
     */
    public org.hl7.fhir.CodeableConcept getType()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.CodeableConcept target = null;
            target = (org.hl7.fhir.CodeableConcept)get_store().find_element_user(TYPE$4, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "type" element
     */
    public boolean isSetType()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(TYPE$4) != 0;
        }
    }
    
    /**
     * Sets the "type" element
     */
    public void setType(org.hl7.fhir.CodeableConcept type)
    {
        generatedSetterHelperImpl(type, TYPE$4, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "type" element
     */
    public org.hl7.fhir.CodeableConcept addNewType()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.CodeableConcept target = null;
            target = (org.hl7.fhir.CodeableConcept)get_store().add_element_user(TYPE$4);
            return target;
        }
    }
    
    /**
     * Unsets the "type" element
     */
    public void unsetType()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(TYPE$4, 0);
        }
    }
    
    /**
     * Gets the "quantity" element
     */
    public org.hl7.fhir.Quantity getQuantity()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.Quantity target = null;
            target = (org.hl7.fhir.Quantity)get_store().find_element_user(QUANTITY$6, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "quantity" element
     */
    public boolean isSetQuantity()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(QUANTITY$6) != 0;
        }
    }
    
    /**
     * Sets the "quantity" element
     */
    public void setQuantity(org.hl7.fhir.Quantity quantity)
    {
        generatedSetterHelperImpl(quantity, QUANTITY$6, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "quantity" element
     */
    public org.hl7.fhir.Quantity addNewQuantity()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.Quantity target = null;
            target = (org.hl7.fhir.Quantity)get_store().add_element_user(QUANTITY$6);
            return target;
        }
    }
    
    /**
     * Unsets the "quantity" element
     */
    public void unsetQuantity()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(QUANTITY$6, 0);
        }
    }
    
    /**
     * Gets the "suppliedItem" element
     */
    public org.hl7.fhir.ResourceReference getSuppliedItem()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.ResourceReference target = null;
            target = (org.hl7.fhir.ResourceReference)get_store().find_element_user(SUPPLIEDITEM$8, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "suppliedItem" element
     */
    public boolean isSetSuppliedItem()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(SUPPLIEDITEM$8) != 0;
        }
    }
    
    /**
     * Sets the "suppliedItem" element
     */
    public void setSuppliedItem(org.hl7.fhir.ResourceReference suppliedItem)
    {
        generatedSetterHelperImpl(suppliedItem, SUPPLIEDITEM$8, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "suppliedItem" element
     */
    public org.hl7.fhir.ResourceReference addNewSuppliedItem()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.ResourceReference target = null;
            target = (org.hl7.fhir.ResourceReference)get_store().add_element_user(SUPPLIEDITEM$8);
            return target;
        }
    }
    
    /**
     * Unsets the "suppliedItem" element
     */
    public void unsetSuppliedItem()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(SUPPLIEDITEM$8, 0);
        }
    }
    
    /**
     * Gets the "supplier" element
     */
    public org.hl7.fhir.ResourceReference getSupplier()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.ResourceReference target = null;
            target = (org.hl7.fhir.ResourceReference)get_store().find_element_user(SUPPLIER$10, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "supplier" element
     */
    public boolean isSetSupplier()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(SUPPLIER$10) != 0;
        }
    }
    
    /**
     * Sets the "supplier" element
     */
    public void setSupplier(org.hl7.fhir.ResourceReference supplier)
    {
        generatedSetterHelperImpl(supplier, SUPPLIER$10, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "supplier" element
     */
    public org.hl7.fhir.ResourceReference addNewSupplier()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.ResourceReference target = null;
            target = (org.hl7.fhir.ResourceReference)get_store().add_element_user(SUPPLIER$10);
            return target;
        }
    }
    
    /**
     * Unsets the "supplier" element
     */
    public void unsetSupplier()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(SUPPLIER$10, 0);
        }
    }
    
    /**
     * Gets the "whenPrepared" element
     */
    public org.hl7.fhir.Period getWhenPrepared()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.Period target = null;
            target = (org.hl7.fhir.Period)get_store().find_element_user(WHENPREPARED$12, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "whenPrepared" element
     */
    public boolean isSetWhenPrepared()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(WHENPREPARED$12) != 0;
        }
    }
    
    /**
     * Sets the "whenPrepared" element
     */
    public void setWhenPrepared(org.hl7.fhir.Period whenPrepared)
    {
        generatedSetterHelperImpl(whenPrepared, WHENPREPARED$12, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "whenPrepared" element
     */
    public org.hl7.fhir.Period addNewWhenPrepared()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.Period target = null;
            target = (org.hl7.fhir.Period)get_store().add_element_user(WHENPREPARED$12);
            return target;
        }
    }
    
    /**
     * Unsets the "whenPrepared" element
     */
    public void unsetWhenPrepared()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(WHENPREPARED$12, 0);
        }
    }
    
    /**
     * Gets the "whenHandedOver" element
     */
    public org.hl7.fhir.Period getWhenHandedOver()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.Period target = null;
            target = (org.hl7.fhir.Period)get_store().find_element_user(WHENHANDEDOVER$14, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "whenHandedOver" element
     */
    public boolean isSetWhenHandedOver()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(WHENHANDEDOVER$14) != 0;
        }
    }
    
    /**
     * Sets the "whenHandedOver" element
     */
    public void setWhenHandedOver(org.hl7.fhir.Period whenHandedOver)
    {
        generatedSetterHelperImpl(whenHandedOver, WHENHANDEDOVER$14, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "whenHandedOver" element
     */
    public org.hl7.fhir.Period addNewWhenHandedOver()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.Period target = null;
            target = (org.hl7.fhir.Period)get_store().add_element_user(WHENHANDEDOVER$14);
            return target;
        }
    }
    
    /**
     * Unsets the "whenHandedOver" element
     */
    public void unsetWhenHandedOver()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(WHENHANDEDOVER$14, 0);
        }
    }
    
    /**
     * Gets the "destination" element
     */
    public org.hl7.fhir.ResourceReference getDestination()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.ResourceReference target = null;
            target = (org.hl7.fhir.ResourceReference)get_store().find_element_user(DESTINATION$16, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "destination" element
     */
    public boolean isSetDestination()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(DESTINATION$16) != 0;
        }
    }
    
    /**
     * Sets the "destination" element
     */
    public void setDestination(org.hl7.fhir.ResourceReference destination)
    {
        generatedSetterHelperImpl(destination, DESTINATION$16, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "destination" element
     */
    public org.hl7.fhir.ResourceReference addNewDestination()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.ResourceReference target = null;
            target = (org.hl7.fhir.ResourceReference)get_store().add_element_user(DESTINATION$16);
            return target;
        }
    }
    
    /**
     * Unsets the "destination" element
     */
    public void unsetDestination()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(DESTINATION$16, 0);
        }
    }
    
    /**
     * Gets array of all "receiver" elements
     */
    public org.hl7.fhir.ResourceReference[] getReceiverArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(RECEIVER$18, targetList);
            org.hl7.fhir.ResourceReference[] result = new org.hl7.fhir.ResourceReference[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "receiver" element
     */
    public org.hl7.fhir.ResourceReference getReceiverArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.ResourceReference target = null;
            target = (org.hl7.fhir.ResourceReference)get_store().find_element_user(RECEIVER$18, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "receiver" element
     */
    public int sizeOfReceiverArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(RECEIVER$18);
        }
    }
    
    /**
     * Sets array of all "receiver" element  WARNING: This method is not atomicaly synchronized.
     */
    public void setReceiverArray(org.hl7.fhir.ResourceReference[] receiverArray)
    {
        check_orphaned();
        arraySetterHelper(receiverArray, RECEIVER$18);
    }
    
    /**
     * Sets ith "receiver" element
     */
    public void setReceiverArray(int i, org.hl7.fhir.ResourceReference receiver)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.ResourceReference target = null;
            target = (org.hl7.fhir.ResourceReference)get_store().find_element_user(RECEIVER$18, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(receiver);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "receiver" element
     */
    public org.hl7.fhir.ResourceReference insertNewReceiver(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.ResourceReference target = null;
            target = (org.hl7.fhir.ResourceReference)get_store().insert_element_user(RECEIVER$18, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "receiver" element
     */
    public org.hl7.fhir.ResourceReference addNewReceiver()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.ResourceReference target = null;
            target = (org.hl7.fhir.ResourceReference)get_store().add_element_user(RECEIVER$18);
            return target;
        }
    }
    
    /**
     * Removes the ith "receiver" element
     */
    public void removeReceiver(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(RECEIVER$18, i);
        }
    }
}
