/*
 * XML Type:  Immunization
 * Namespace: http://hl7.org/fhir
 * Java type: org.hl7.fhir.Immunization
 *
 * Automatically generated - do not modify.
 */
package org.hl7.fhir.impl;
/**
 * An XML Immunization(@http://hl7.org/fhir).
 *
 * This is a complex type.
 */
public class ImmunizationImpl extends org.hl7.fhir.impl.ResourceImpl implements org.hl7.fhir.Immunization
{
    private static final long serialVersionUID = 1L;
    
    public ImmunizationImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName IDENTIFIER$0 = 
        new javax.xml.namespace.QName("http://hl7.org/fhir", "identifier");
    private static final javax.xml.namespace.QName DATE$2 = 
        new javax.xml.namespace.QName("http://hl7.org/fhir", "date");
    private static final javax.xml.namespace.QName VACCINETYPE$4 = 
        new javax.xml.namespace.QName("http://hl7.org/fhir", "vaccineType");
    private static final javax.xml.namespace.QName SUBJECT$6 = 
        new javax.xml.namespace.QName("http://hl7.org/fhir", "subject");
    private static final javax.xml.namespace.QName REFUSEDINDICATOR$8 = 
        new javax.xml.namespace.QName("http://hl7.org/fhir", "refusedIndicator");
    private static final javax.xml.namespace.QName REPORTED$10 = 
        new javax.xml.namespace.QName("http://hl7.org/fhir", "reported");
    private static final javax.xml.namespace.QName PERFORMER$12 = 
        new javax.xml.namespace.QName("http://hl7.org/fhir", "performer");
    private static final javax.xml.namespace.QName REQUESTER$14 = 
        new javax.xml.namespace.QName("http://hl7.org/fhir", "requester");
    private static final javax.xml.namespace.QName MANUFACTURER$16 = 
        new javax.xml.namespace.QName("http://hl7.org/fhir", "manufacturer");
    private static final javax.xml.namespace.QName LOCATION$18 = 
        new javax.xml.namespace.QName("http://hl7.org/fhir", "location");
    private static final javax.xml.namespace.QName LOTNUMBER$20 = 
        new javax.xml.namespace.QName("http://hl7.org/fhir", "lotNumber");
    private static final javax.xml.namespace.QName EXPIRATIONDATE$22 = 
        new javax.xml.namespace.QName("http://hl7.org/fhir", "expirationDate");
    private static final javax.xml.namespace.QName SITE$24 = 
        new javax.xml.namespace.QName("http://hl7.org/fhir", "site");
    private static final javax.xml.namespace.QName ROUTE$26 = 
        new javax.xml.namespace.QName("http://hl7.org/fhir", "route");
    private static final javax.xml.namespace.QName DOSEQUANTITY$28 = 
        new javax.xml.namespace.QName("http://hl7.org/fhir", "doseQuantity");
    private static final javax.xml.namespace.QName EXPLANATION$30 = 
        new javax.xml.namespace.QName("http://hl7.org/fhir", "explanation");
    private static final javax.xml.namespace.QName REACTION$32 = 
        new javax.xml.namespace.QName("http://hl7.org/fhir", "reaction");
    private static final javax.xml.namespace.QName VACCINATIONPROTOCOL$34 = 
        new javax.xml.namespace.QName("http://hl7.org/fhir", "vaccinationProtocol");
    
    
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
     * Gets the "date" element
     */
    public org.hl7.fhir.DateTime getDate()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.DateTime target = null;
            target = (org.hl7.fhir.DateTime)get_store().find_element_user(DATE$2, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "date" element
     */
    public void setDate(org.hl7.fhir.DateTime date)
    {
        generatedSetterHelperImpl(date, DATE$2, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
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
            target = (org.hl7.fhir.DateTime)get_store().add_element_user(DATE$2);
            return target;
        }
    }
    
    /**
     * Gets the "vaccineType" element
     */
    public org.hl7.fhir.CodeableConcept getVaccineType()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.CodeableConcept target = null;
            target = (org.hl7.fhir.CodeableConcept)get_store().find_element_user(VACCINETYPE$4, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "vaccineType" element
     */
    public void setVaccineType(org.hl7.fhir.CodeableConcept vaccineType)
    {
        generatedSetterHelperImpl(vaccineType, VACCINETYPE$4, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "vaccineType" element
     */
    public org.hl7.fhir.CodeableConcept addNewVaccineType()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.CodeableConcept target = null;
            target = (org.hl7.fhir.CodeableConcept)get_store().add_element_user(VACCINETYPE$4);
            return target;
        }
    }
    
    /**
     * Gets the "subject" element
     */
    public org.hl7.fhir.ResourceReference getSubject()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.ResourceReference target = null;
            target = (org.hl7.fhir.ResourceReference)get_store().find_element_user(SUBJECT$6, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "subject" element
     */
    public void setSubject(org.hl7.fhir.ResourceReference subject)
    {
        generatedSetterHelperImpl(subject, SUBJECT$6, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "subject" element
     */
    public org.hl7.fhir.ResourceReference addNewSubject()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.ResourceReference target = null;
            target = (org.hl7.fhir.ResourceReference)get_store().add_element_user(SUBJECT$6);
            return target;
        }
    }
    
    /**
     * Gets the "refusedIndicator" element
     */
    public org.hl7.fhir.Boolean getRefusedIndicator()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.Boolean target = null;
            target = (org.hl7.fhir.Boolean)get_store().find_element_user(REFUSEDINDICATOR$8, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "refusedIndicator" element
     */
    public void setRefusedIndicator(org.hl7.fhir.Boolean refusedIndicator)
    {
        generatedSetterHelperImpl(refusedIndicator, REFUSEDINDICATOR$8, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "refusedIndicator" element
     */
    public org.hl7.fhir.Boolean addNewRefusedIndicator()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.Boolean target = null;
            target = (org.hl7.fhir.Boolean)get_store().add_element_user(REFUSEDINDICATOR$8);
            return target;
        }
    }
    
    /**
     * Gets the "reported" element
     */
    public org.hl7.fhir.Boolean getReported()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.Boolean target = null;
            target = (org.hl7.fhir.Boolean)get_store().find_element_user(REPORTED$10, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "reported" element
     */
    public void setReported(org.hl7.fhir.Boolean reported)
    {
        generatedSetterHelperImpl(reported, REPORTED$10, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "reported" element
     */
    public org.hl7.fhir.Boolean addNewReported()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.Boolean target = null;
            target = (org.hl7.fhir.Boolean)get_store().add_element_user(REPORTED$10);
            return target;
        }
    }
    
    /**
     * Gets the "performer" element
     */
    public org.hl7.fhir.ResourceReference getPerformer()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.ResourceReference target = null;
            target = (org.hl7.fhir.ResourceReference)get_store().find_element_user(PERFORMER$12, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "performer" element
     */
    public boolean isSetPerformer()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(PERFORMER$12) != 0;
        }
    }
    
    /**
     * Sets the "performer" element
     */
    public void setPerformer(org.hl7.fhir.ResourceReference performer)
    {
        generatedSetterHelperImpl(performer, PERFORMER$12, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "performer" element
     */
    public org.hl7.fhir.ResourceReference addNewPerformer()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.ResourceReference target = null;
            target = (org.hl7.fhir.ResourceReference)get_store().add_element_user(PERFORMER$12);
            return target;
        }
    }
    
    /**
     * Unsets the "performer" element
     */
    public void unsetPerformer()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(PERFORMER$12, 0);
        }
    }
    
    /**
     * Gets the "requester" element
     */
    public org.hl7.fhir.ResourceReference getRequester()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.ResourceReference target = null;
            target = (org.hl7.fhir.ResourceReference)get_store().find_element_user(REQUESTER$14, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "requester" element
     */
    public boolean isSetRequester()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(REQUESTER$14) != 0;
        }
    }
    
    /**
     * Sets the "requester" element
     */
    public void setRequester(org.hl7.fhir.ResourceReference requester)
    {
        generatedSetterHelperImpl(requester, REQUESTER$14, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "requester" element
     */
    public org.hl7.fhir.ResourceReference addNewRequester()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.ResourceReference target = null;
            target = (org.hl7.fhir.ResourceReference)get_store().add_element_user(REQUESTER$14);
            return target;
        }
    }
    
    /**
     * Unsets the "requester" element
     */
    public void unsetRequester()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(REQUESTER$14, 0);
        }
    }
    
    /**
     * Gets the "manufacturer" element
     */
    public org.hl7.fhir.ResourceReference getManufacturer()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.ResourceReference target = null;
            target = (org.hl7.fhir.ResourceReference)get_store().find_element_user(MANUFACTURER$16, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "manufacturer" element
     */
    public boolean isSetManufacturer()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(MANUFACTURER$16) != 0;
        }
    }
    
    /**
     * Sets the "manufacturer" element
     */
    public void setManufacturer(org.hl7.fhir.ResourceReference manufacturer)
    {
        generatedSetterHelperImpl(manufacturer, MANUFACTURER$16, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "manufacturer" element
     */
    public org.hl7.fhir.ResourceReference addNewManufacturer()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.ResourceReference target = null;
            target = (org.hl7.fhir.ResourceReference)get_store().add_element_user(MANUFACTURER$16);
            return target;
        }
    }
    
    /**
     * Unsets the "manufacturer" element
     */
    public void unsetManufacturer()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(MANUFACTURER$16, 0);
        }
    }
    
    /**
     * Gets the "location" element
     */
    public org.hl7.fhir.ResourceReference getLocation()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.ResourceReference target = null;
            target = (org.hl7.fhir.ResourceReference)get_store().find_element_user(LOCATION$18, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "location" element
     */
    public boolean isSetLocation()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(LOCATION$18) != 0;
        }
    }
    
    /**
     * Sets the "location" element
     */
    public void setLocation(org.hl7.fhir.ResourceReference location)
    {
        generatedSetterHelperImpl(location, LOCATION$18, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "location" element
     */
    public org.hl7.fhir.ResourceReference addNewLocation()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.ResourceReference target = null;
            target = (org.hl7.fhir.ResourceReference)get_store().add_element_user(LOCATION$18);
            return target;
        }
    }
    
    /**
     * Unsets the "location" element
     */
    public void unsetLocation()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(LOCATION$18, 0);
        }
    }
    
    /**
     * Gets the "lotNumber" element
     */
    public org.hl7.fhir.String getLotNumber()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.String target = null;
            target = (org.hl7.fhir.String)get_store().find_element_user(LOTNUMBER$20, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "lotNumber" element
     */
    public boolean isSetLotNumber()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(LOTNUMBER$20) != 0;
        }
    }
    
    /**
     * Sets the "lotNumber" element
     */
    public void setLotNumber(org.hl7.fhir.String lotNumber)
    {
        generatedSetterHelperImpl(lotNumber, LOTNUMBER$20, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "lotNumber" element
     */
    public org.hl7.fhir.String addNewLotNumber()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.String target = null;
            target = (org.hl7.fhir.String)get_store().add_element_user(LOTNUMBER$20);
            return target;
        }
    }
    
    /**
     * Unsets the "lotNumber" element
     */
    public void unsetLotNumber()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(LOTNUMBER$20, 0);
        }
    }
    
    /**
     * Gets the "expirationDate" element
     */
    public org.hl7.fhir.Date getExpirationDate()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.Date target = null;
            target = (org.hl7.fhir.Date)get_store().find_element_user(EXPIRATIONDATE$22, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "expirationDate" element
     */
    public boolean isSetExpirationDate()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(EXPIRATIONDATE$22) != 0;
        }
    }
    
    /**
     * Sets the "expirationDate" element
     */
    public void setExpirationDate(org.hl7.fhir.Date expirationDate)
    {
        generatedSetterHelperImpl(expirationDate, EXPIRATIONDATE$22, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "expirationDate" element
     */
    public org.hl7.fhir.Date addNewExpirationDate()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.Date target = null;
            target = (org.hl7.fhir.Date)get_store().add_element_user(EXPIRATIONDATE$22);
            return target;
        }
    }
    
    /**
     * Unsets the "expirationDate" element
     */
    public void unsetExpirationDate()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(EXPIRATIONDATE$22, 0);
        }
    }
    
    /**
     * Gets the "site" element
     */
    public org.hl7.fhir.CodeableConcept getSite()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.CodeableConcept target = null;
            target = (org.hl7.fhir.CodeableConcept)get_store().find_element_user(SITE$24, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "site" element
     */
    public boolean isSetSite()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(SITE$24) != 0;
        }
    }
    
    /**
     * Sets the "site" element
     */
    public void setSite(org.hl7.fhir.CodeableConcept site)
    {
        generatedSetterHelperImpl(site, SITE$24, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "site" element
     */
    public org.hl7.fhir.CodeableConcept addNewSite()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.CodeableConcept target = null;
            target = (org.hl7.fhir.CodeableConcept)get_store().add_element_user(SITE$24);
            return target;
        }
    }
    
    /**
     * Unsets the "site" element
     */
    public void unsetSite()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(SITE$24, 0);
        }
    }
    
    /**
     * Gets the "route" element
     */
    public org.hl7.fhir.CodeableConcept getRoute()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.CodeableConcept target = null;
            target = (org.hl7.fhir.CodeableConcept)get_store().find_element_user(ROUTE$26, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "route" element
     */
    public boolean isSetRoute()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(ROUTE$26) != 0;
        }
    }
    
    /**
     * Sets the "route" element
     */
    public void setRoute(org.hl7.fhir.CodeableConcept route)
    {
        generatedSetterHelperImpl(route, ROUTE$26, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "route" element
     */
    public org.hl7.fhir.CodeableConcept addNewRoute()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.CodeableConcept target = null;
            target = (org.hl7.fhir.CodeableConcept)get_store().add_element_user(ROUTE$26);
            return target;
        }
    }
    
    /**
     * Unsets the "route" element
     */
    public void unsetRoute()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(ROUTE$26, 0);
        }
    }
    
    /**
     * Gets the "doseQuantity" element
     */
    public org.hl7.fhir.Quantity getDoseQuantity()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.Quantity target = null;
            target = (org.hl7.fhir.Quantity)get_store().find_element_user(DOSEQUANTITY$28, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "doseQuantity" element
     */
    public boolean isSetDoseQuantity()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(DOSEQUANTITY$28) != 0;
        }
    }
    
    /**
     * Sets the "doseQuantity" element
     */
    public void setDoseQuantity(org.hl7.fhir.Quantity doseQuantity)
    {
        generatedSetterHelperImpl(doseQuantity, DOSEQUANTITY$28, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "doseQuantity" element
     */
    public org.hl7.fhir.Quantity addNewDoseQuantity()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.Quantity target = null;
            target = (org.hl7.fhir.Quantity)get_store().add_element_user(DOSEQUANTITY$28);
            return target;
        }
    }
    
    /**
     * Unsets the "doseQuantity" element
     */
    public void unsetDoseQuantity()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(DOSEQUANTITY$28, 0);
        }
    }
    
    /**
     * Gets the "explanation" element
     */
    public org.hl7.fhir.ImmunizationExplanation getExplanation()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.ImmunizationExplanation target = null;
            target = (org.hl7.fhir.ImmunizationExplanation)get_store().find_element_user(EXPLANATION$30, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "explanation" element
     */
    public boolean isSetExplanation()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(EXPLANATION$30) != 0;
        }
    }
    
    /**
     * Sets the "explanation" element
     */
    public void setExplanation(org.hl7.fhir.ImmunizationExplanation explanation)
    {
        generatedSetterHelperImpl(explanation, EXPLANATION$30, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "explanation" element
     */
    public org.hl7.fhir.ImmunizationExplanation addNewExplanation()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.ImmunizationExplanation target = null;
            target = (org.hl7.fhir.ImmunizationExplanation)get_store().add_element_user(EXPLANATION$30);
            return target;
        }
    }
    
    /**
     * Unsets the "explanation" element
     */
    public void unsetExplanation()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(EXPLANATION$30, 0);
        }
    }
    
    /**
     * Gets array of all "reaction" elements
     */
    public org.hl7.fhir.ImmunizationReaction[] getReactionArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(REACTION$32, targetList);
            org.hl7.fhir.ImmunizationReaction[] result = new org.hl7.fhir.ImmunizationReaction[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "reaction" element
     */
    public org.hl7.fhir.ImmunizationReaction getReactionArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.ImmunizationReaction target = null;
            target = (org.hl7.fhir.ImmunizationReaction)get_store().find_element_user(REACTION$32, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "reaction" element
     */
    public int sizeOfReactionArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(REACTION$32);
        }
    }
    
    /**
     * Sets array of all "reaction" element  WARNING: This method is not atomicaly synchronized.
     */
    public void setReactionArray(org.hl7.fhir.ImmunizationReaction[] reactionArray)
    {
        check_orphaned();
        arraySetterHelper(reactionArray, REACTION$32);
    }
    
    /**
     * Sets ith "reaction" element
     */
    public void setReactionArray(int i, org.hl7.fhir.ImmunizationReaction reaction)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.ImmunizationReaction target = null;
            target = (org.hl7.fhir.ImmunizationReaction)get_store().find_element_user(REACTION$32, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(reaction);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "reaction" element
     */
    public org.hl7.fhir.ImmunizationReaction insertNewReaction(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.ImmunizationReaction target = null;
            target = (org.hl7.fhir.ImmunizationReaction)get_store().insert_element_user(REACTION$32, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "reaction" element
     */
    public org.hl7.fhir.ImmunizationReaction addNewReaction()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.ImmunizationReaction target = null;
            target = (org.hl7.fhir.ImmunizationReaction)get_store().add_element_user(REACTION$32);
            return target;
        }
    }
    
    /**
     * Removes the ith "reaction" element
     */
    public void removeReaction(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(REACTION$32, i);
        }
    }
    
    /**
     * Gets array of all "vaccinationProtocol" elements
     */
    public org.hl7.fhir.ImmunizationVaccinationProtocol[] getVaccinationProtocolArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(VACCINATIONPROTOCOL$34, targetList);
            org.hl7.fhir.ImmunizationVaccinationProtocol[] result = new org.hl7.fhir.ImmunizationVaccinationProtocol[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "vaccinationProtocol" element
     */
    public org.hl7.fhir.ImmunizationVaccinationProtocol getVaccinationProtocolArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.ImmunizationVaccinationProtocol target = null;
            target = (org.hl7.fhir.ImmunizationVaccinationProtocol)get_store().find_element_user(VACCINATIONPROTOCOL$34, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "vaccinationProtocol" element
     */
    public int sizeOfVaccinationProtocolArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(VACCINATIONPROTOCOL$34);
        }
    }
    
    /**
     * Sets array of all "vaccinationProtocol" element  WARNING: This method is not atomicaly synchronized.
     */
    public void setVaccinationProtocolArray(org.hl7.fhir.ImmunizationVaccinationProtocol[] vaccinationProtocolArray)
    {
        check_orphaned();
        arraySetterHelper(vaccinationProtocolArray, VACCINATIONPROTOCOL$34);
    }
    
    /**
     * Sets ith "vaccinationProtocol" element
     */
    public void setVaccinationProtocolArray(int i, org.hl7.fhir.ImmunizationVaccinationProtocol vaccinationProtocol)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.ImmunizationVaccinationProtocol target = null;
            target = (org.hl7.fhir.ImmunizationVaccinationProtocol)get_store().find_element_user(VACCINATIONPROTOCOL$34, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(vaccinationProtocol);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "vaccinationProtocol" element
     */
    public org.hl7.fhir.ImmunizationVaccinationProtocol insertNewVaccinationProtocol(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.ImmunizationVaccinationProtocol target = null;
            target = (org.hl7.fhir.ImmunizationVaccinationProtocol)get_store().insert_element_user(VACCINATIONPROTOCOL$34, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "vaccinationProtocol" element
     */
    public org.hl7.fhir.ImmunizationVaccinationProtocol addNewVaccinationProtocol()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.ImmunizationVaccinationProtocol target = null;
            target = (org.hl7.fhir.ImmunizationVaccinationProtocol)get_store().add_element_user(VACCINATIONPROTOCOL$34);
            return target;
        }
    }
    
    /**
     * Removes the ith "vaccinationProtocol" element
     */
    public void removeVaccinationProtocol(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(VACCINATIONPROTOCOL$34, i);
        }
    }
}
