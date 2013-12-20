/*
 * XML Type:  ImagingStudy
 * Namespace: http://hl7.org/fhir
 * Java type: org.hl7.fhir.ImagingStudy
 *
 * Automatically generated - do not modify.
 */
package org.hl7.fhir.impl;
/**
 * An XML ImagingStudy(@http://hl7.org/fhir).
 *
 * This is a complex type.
 */
public class ImagingStudyImpl extends org.hl7.fhir.impl.ResourceImpl implements org.hl7.fhir.ImagingStudy
{
    private static final long serialVersionUID = 1L;
    
    public ImagingStudyImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName DATETIME$0 = 
        new javax.xml.namespace.QName("http://hl7.org/fhir", "dateTime");
    private static final javax.xml.namespace.QName SUBJECT$2 = 
        new javax.xml.namespace.QName("http://hl7.org/fhir", "subject");
    private static final javax.xml.namespace.QName UID$4 = 
        new javax.xml.namespace.QName("http://hl7.org/fhir", "uid");
    private static final javax.xml.namespace.QName ACCESSIONNO$6 = 
        new javax.xml.namespace.QName("http://hl7.org/fhir", "accessionNo");
    private static final javax.xml.namespace.QName IDENTIFIER$8 = 
        new javax.xml.namespace.QName("http://hl7.org/fhir", "identifier");
    private static final javax.xml.namespace.QName ORDER$10 = 
        new javax.xml.namespace.QName("http://hl7.org/fhir", "order");
    private static final javax.xml.namespace.QName MODALITY$12 = 
        new javax.xml.namespace.QName("http://hl7.org/fhir", "modality");
    private static final javax.xml.namespace.QName REFERRER$14 = 
        new javax.xml.namespace.QName("http://hl7.org/fhir", "referrer");
    private static final javax.xml.namespace.QName AVAILABILITY$16 = 
        new javax.xml.namespace.QName("http://hl7.org/fhir", "availability");
    private static final javax.xml.namespace.QName URL$18 = 
        new javax.xml.namespace.QName("http://hl7.org/fhir", "url");
    private static final javax.xml.namespace.QName NUMBEROFSERIES$20 = 
        new javax.xml.namespace.QName("http://hl7.org/fhir", "numberOfSeries");
    private static final javax.xml.namespace.QName NUMBEROFINSTANCES$22 = 
        new javax.xml.namespace.QName("http://hl7.org/fhir", "numberOfInstances");
    private static final javax.xml.namespace.QName CLINICALINFORMATION$24 = 
        new javax.xml.namespace.QName("http://hl7.org/fhir", "clinicalInformation");
    private static final javax.xml.namespace.QName PROCEDURE$26 = 
        new javax.xml.namespace.QName("http://hl7.org/fhir", "procedure");
    private static final javax.xml.namespace.QName INTERPRETER$28 = 
        new javax.xml.namespace.QName("http://hl7.org/fhir", "interpreter");
    private static final javax.xml.namespace.QName DESCRIPTION$30 = 
        new javax.xml.namespace.QName("http://hl7.org/fhir", "description");
    private static final javax.xml.namespace.QName SERIES$32 = 
        new javax.xml.namespace.QName("http://hl7.org/fhir", "series");
    
    
    /**
     * Gets the "dateTime" element
     */
    public org.hl7.fhir.DateTime getDateTime()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.DateTime target = null;
            target = (org.hl7.fhir.DateTime)get_store().find_element_user(DATETIME$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "dateTime" element
     */
    public boolean isSetDateTime()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(DATETIME$0) != 0;
        }
    }
    
    /**
     * Sets the "dateTime" element
     */
    public void setDateTime(org.hl7.fhir.DateTime dateTime)
    {
        generatedSetterHelperImpl(dateTime, DATETIME$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "dateTime" element
     */
    public org.hl7.fhir.DateTime addNewDateTime()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.DateTime target = null;
            target = (org.hl7.fhir.DateTime)get_store().add_element_user(DATETIME$0);
            return target;
        }
    }
    
    /**
     * Unsets the "dateTime" element
     */
    public void unsetDateTime()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(DATETIME$0, 0);
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
            target = (org.hl7.fhir.ResourceReference)get_store().find_element_user(SUBJECT$2, 0);
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
        generatedSetterHelperImpl(subject, SUBJECT$2, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
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
            target = (org.hl7.fhir.ResourceReference)get_store().add_element_user(SUBJECT$2);
            return target;
        }
    }
    
    /**
     * Gets the "uid" element
     */
    public org.hl7.fhir.Oid getUid()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.Oid target = null;
            target = (org.hl7.fhir.Oid)get_store().find_element_user(UID$4, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "uid" element
     */
    public void setUid(org.hl7.fhir.Oid uid)
    {
        generatedSetterHelperImpl(uid, UID$4, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "uid" element
     */
    public org.hl7.fhir.Oid addNewUid()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.Oid target = null;
            target = (org.hl7.fhir.Oid)get_store().add_element_user(UID$4);
            return target;
        }
    }
    
    /**
     * Gets the "accessionNo" element
     */
    public org.hl7.fhir.Identifier getAccessionNo()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.Identifier target = null;
            target = (org.hl7.fhir.Identifier)get_store().find_element_user(ACCESSIONNO$6, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "accessionNo" element
     */
    public boolean isSetAccessionNo()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(ACCESSIONNO$6) != 0;
        }
    }
    
    /**
     * Sets the "accessionNo" element
     */
    public void setAccessionNo(org.hl7.fhir.Identifier accessionNo)
    {
        generatedSetterHelperImpl(accessionNo, ACCESSIONNO$6, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "accessionNo" element
     */
    public org.hl7.fhir.Identifier addNewAccessionNo()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.Identifier target = null;
            target = (org.hl7.fhir.Identifier)get_store().add_element_user(ACCESSIONNO$6);
            return target;
        }
    }
    
    /**
     * Unsets the "accessionNo" element
     */
    public void unsetAccessionNo()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(ACCESSIONNO$6, 0);
        }
    }
    
    /**
     * Gets array of all "identifier" elements
     */
    public org.hl7.fhir.Identifier[] getIdentifierArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(IDENTIFIER$8, targetList);
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
            target = (org.hl7.fhir.Identifier)get_store().find_element_user(IDENTIFIER$8, i);
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
            return get_store().count_elements(IDENTIFIER$8);
        }
    }
    
    /**
     * Sets array of all "identifier" element  WARNING: This method is not atomicaly synchronized.
     */
    public void setIdentifierArray(org.hl7.fhir.Identifier[] identifierArray)
    {
        check_orphaned();
        arraySetterHelper(identifierArray, IDENTIFIER$8);
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
            target = (org.hl7.fhir.Identifier)get_store().find_element_user(IDENTIFIER$8, i);
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
            target = (org.hl7.fhir.Identifier)get_store().insert_element_user(IDENTIFIER$8, i);
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
            target = (org.hl7.fhir.Identifier)get_store().add_element_user(IDENTIFIER$8);
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
            get_store().remove_element(IDENTIFIER$8, i);
        }
    }
    
    /**
     * Gets array of all "order" elements
     */
    public org.hl7.fhir.ResourceReference[] getOrderArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(ORDER$10, targetList);
            org.hl7.fhir.ResourceReference[] result = new org.hl7.fhir.ResourceReference[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "order" element
     */
    public org.hl7.fhir.ResourceReference getOrderArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.ResourceReference target = null;
            target = (org.hl7.fhir.ResourceReference)get_store().find_element_user(ORDER$10, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "order" element
     */
    public int sizeOfOrderArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(ORDER$10);
        }
    }
    
    /**
     * Sets array of all "order" element  WARNING: This method is not atomicaly synchronized.
     */
    public void setOrderArray(org.hl7.fhir.ResourceReference[] orderArray)
    {
        check_orphaned();
        arraySetterHelper(orderArray, ORDER$10);
    }
    
    /**
     * Sets ith "order" element
     */
    public void setOrderArray(int i, org.hl7.fhir.ResourceReference order)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.ResourceReference target = null;
            target = (org.hl7.fhir.ResourceReference)get_store().find_element_user(ORDER$10, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(order);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "order" element
     */
    public org.hl7.fhir.ResourceReference insertNewOrder(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.ResourceReference target = null;
            target = (org.hl7.fhir.ResourceReference)get_store().insert_element_user(ORDER$10, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "order" element
     */
    public org.hl7.fhir.ResourceReference addNewOrder()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.ResourceReference target = null;
            target = (org.hl7.fhir.ResourceReference)get_store().add_element_user(ORDER$10);
            return target;
        }
    }
    
    /**
     * Removes the ith "order" element
     */
    public void removeOrder(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(ORDER$10, i);
        }
    }
    
    /**
     * Gets array of all "modality" elements
     */
    public org.hl7.fhir.ImagingModality[] getModalityArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(MODALITY$12, targetList);
            org.hl7.fhir.ImagingModality[] result = new org.hl7.fhir.ImagingModality[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "modality" element
     */
    public org.hl7.fhir.ImagingModality getModalityArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.ImagingModality target = null;
            target = (org.hl7.fhir.ImagingModality)get_store().find_element_user(MODALITY$12, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "modality" element
     */
    public int sizeOfModalityArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(MODALITY$12);
        }
    }
    
    /**
     * Sets array of all "modality" element  WARNING: This method is not atomicaly synchronized.
     */
    public void setModalityArray(org.hl7.fhir.ImagingModality[] modalityArray)
    {
        check_orphaned();
        arraySetterHelper(modalityArray, MODALITY$12);
    }
    
    /**
     * Sets ith "modality" element
     */
    public void setModalityArray(int i, org.hl7.fhir.ImagingModality modality)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.ImagingModality target = null;
            target = (org.hl7.fhir.ImagingModality)get_store().find_element_user(MODALITY$12, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(modality);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "modality" element
     */
    public org.hl7.fhir.ImagingModality insertNewModality(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.ImagingModality target = null;
            target = (org.hl7.fhir.ImagingModality)get_store().insert_element_user(MODALITY$12, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "modality" element
     */
    public org.hl7.fhir.ImagingModality addNewModality()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.ImagingModality target = null;
            target = (org.hl7.fhir.ImagingModality)get_store().add_element_user(MODALITY$12);
            return target;
        }
    }
    
    /**
     * Removes the ith "modality" element
     */
    public void removeModality(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(MODALITY$12, i);
        }
    }
    
    /**
     * Gets the "referrer" element
     */
    public org.hl7.fhir.ResourceReference getReferrer()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.ResourceReference target = null;
            target = (org.hl7.fhir.ResourceReference)get_store().find_element_user(REFERRER$14, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "referrer" element
     */
    public boolean isSetReferrer()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(REFERRER$14) != 0;
        }
    }
    
    /**
     * Sets the "referrer" element
     */
    public void setReferrer(org.hl7.fhir.ResourceReference referrer)
    {
        generatedSetterHelperImpl(referrer, REFERRER$14, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "referrer" element
     */
    public org.hl7.fhir.ResourceReference addNewReferrer()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.ResourceReference target = null;
            target = (org.hl7.fhir.ResourceReference)get_store().add_element_user(REFERRER$14);
            return target;
        }
    }
    
    /**
     * Unsets the "referrer" element
     */
    public void unsetReferrer()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(REFERRER$14, 0);
        }
    }
    
    /**
     * Gets the "availability" element
     */
    public org.hl7.fhir.InstanceAvailability getAvailability()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.InstanceAvailability target = null;
            target = (org.hl7.fhir.InstanceAvailability)get_store().find_element_user(AVAILABILITY$16, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "availability" element
     */
    public boolean isSetAvailability()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(AVAILABILITY$16) != 0;
        }
    }
    
    /**
     * Sets the "availability" element
     */
    public void setAvailability(org.hl7.fhir.InstanceAvailability availability)
    {
        generatedSetterHelperImpl(availability, AVAILABILITY$16, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "availability" element
     */
    public org.hl7.fhir.InstanceAvailability addNewAvailability()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.InstanceAvailability target = null;
            target = (org.hl7.fhir.InstanceAvailability)get_store().add_element_user(AVAILABILITY$16);
            return target;
        }
    }
    
    /**
     * Unsets the "availability" element
     */
    public void unsetAvailability()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(AVAILABILITY$16, 0);
        }
    }
    
    /**
     * Gets the "url" element
     */
    public org.hl7.fhir.Uri getUrl()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.Uri target = null;
            target = (org.hl7.fhir.Uri)get_store().find_element_user(URL$18, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "url" element
     */
    public boolean isSetUrl()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(URL$18) != 0;
        }
    }
    
    /**
     * Sets the "url" element
     */
    public void setUrl(org.hl7.fhir.Uri url)
    {
        generatedSetterHelperImpl(url, URL$18, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "url" element
     */
    public org.hl7.fhir.Uri addNewUrl()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.Uri target = null;
            target = (org.hl7.fhir.Uri)get_store().add_element_user(URL$18);
            return target;
        }
    }
    
    /**
     * Unsets the "url" element
     */
    public void unsetUrl()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(URL$18, 0);
        }
    }
    
    /**
     * Gets the "numberOfSeries" element
     */
    public org.hl7.fhir.Integer getNumberOfSeries()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.Integer target = null;
            target = (org.hl7.fhir.Integer)get_store().find_element_user(NUMBEROFSERIES$20, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "numberOfSeries" element
     */
    public void setNumberOfSeries(org.hl7.fhir.Integer numberOfSeries)
    {
        generatedSetterHelperImpl(numberOfSeries, NUMBEROFSERIES$20, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "numberOfSeries" element
     */
    public org.hl7.fhir.Integer addNewNumberOfSeries()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.Integer target = null;
            target = (org.hl7.fhir.Integer)get_store().add_element_user(NUMBEROFSERIES$20);
            return target;
        }
    }
    
    /**
     * Gets the "numberOfInstances" element
     */
    public org.hl7.fhir.Integer getNumberOfInstances()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.Integer target = null;
            target = (org.hl7.fhir.Integer)get_store().find_element_user(NUMBEROFINSTANCES$22, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "numberOfInstances" element
     */
    public void setNumberOfInstances(org.hl7.fhir.Integer numberOfInstances)
    {
        generatedSetterHelperImpl(numberOfInstances, NUMBEROFINSTANCES$22, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "numberOfInstances" element
     */
    public org.hl7.fhir.Integer addNewNumberOfInstances()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.Integer target = null;
            target = (org.hl7.fhir.Integer)get_store().add_element_user(NUMBEROFINSTANCES$22);
            return target;
        }
    }
    
    /**
     * Gets the "clinicalInformation" element
     */
    public org.hl7.fhir.String getClinicalInformation()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.String target = null;
            target = (org.hl7.fhir.String)get_store().find_element_user(CLINICALINFORMATION$24, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "clinicalInformation" element
     */
    public boolean isSetClinicalInformation()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(CLINICALINFORMATION$24) != 0;
        }
    }
    
    /**
     * Sets the "clinicalInformation" element
     */
    public void setClinicalInformation(org.hl7.fhir.String clinicalInformation)
    {
        generatedSetterHelperImpl(clinicalInformation, CLINICALINFORMATION$24, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "clinicalInformation" element
     */
    public org.hl7.fhir.String addNewClinicalInformation()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.String target = null;
            target = (org.hl7.fhir.String)get_store().add_element_user(CLINICALINFORMATION$24);
            return target;
        }
    }
    
    /**
     * Unsets the "clinicalInformation" element
     */
    public void unsetClinicalInformation()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(CLINICALINFORMATION$24, 0);
        }
    }
    
    /**
     * Gets array of all "procedure" elements
     */
    public org.hl7.fhir.Coding[] getProcedureArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(PROCEDURE$26, targetList);
            org.hl7.fhir.Coding[] result = new org.hl7.fhir.Coding[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "procedure" element
     */
    public org.hl7.fhir.Coding getProcedureArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.Coding target = null;
            target = (org.hl7.fhir.Coding)get_store().find_element_user(PROCEDURE$26, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "procedure" element
     */
    public int sizeOfProcedureArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(PROCEDURE$26);
        }
    }
    
    /**
     * Sets array of all "procedure" element  WARNING: This method is not atomicaly synchronized.
     */
    public void setProcedureArray(org.hl7.fhir.Coding[] procedureArray)
    {
        check_orphaned();
        arraySetterHelper(procedureArray, PROCEDURE$26);
    }
    
    /**
     * Sets ith "procedure" element
     */
    public void setProcedureArray(int i, org.hl7.fhir.Coding procedure)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.Coding target = null;
            target = (org.hl7.fhir.Coding)get_store().find_element_user(PROCEDURE$26, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(procedure);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "procedure" element
     */
    public org.hl7.fhir.Coding insertNewProcedure(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.Coding target = null;
            target = (org.hl7.fhir.Coding)get_store().insert_element_user(PROCEDURE$26, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "procedure" element
     */
    public org.hl7.fhir.Coding addNewProcedure()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.Coding target = null;
            target = (org.hl7.fhir.Coding)get_store().add_element_user(PROCEDURE$26);
            return target;
        }
    }
    
    /**
     * Removes the ith "procedure" element
     */
    public void removeProcedure(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(PROCEDURE$26, i);
        }
    }
    
    /**
     * Gets the "interpreter" element
     */
    public org.hl7.fhir.ResourceReference getInterpreter()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.ResourceReference target = null;
            target = (org.hl7.fhir.ResourceReference)get_store().find_element_user(INTERPRETER$28, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "interpreter" element
     */
    public boolean isSetInterpreter()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(INTERPRETER$28) != 0;
        }
    }
    
    /**
     * Sets the "interpreter" element
     */
    public void setInterpreter(org.hl7.fhir.ResourceReference interpreter)
    {
        generatedSetterHelperImpl(interpreter, INTERPRETER$28, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "interpreter" element
     */
    public org.hl7.fhir.ResourceReference addNewInterpreter()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.ResourceReference target = null;
            target = (org.hl7.fhir.ResourceReference)get_store().add_element_user(INTERPRETER$28);
            return target;
        }
    }
    
    /**
     * Unsets the "interpreter" element
     */
    public void unsetInterpreter()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(INTERPRETER$28, 0);
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
            target = (org.hl7.fhir.String)get_store().find_element_user(DESCRIPTION$30, 0);
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
            return get_store().count_elements(DESCRIPTION$30) != 0;
        }
    }
    
    /**
     * Sets the "description" element
     */
    public void setDescription(org.hl7.fhir.String description)
    {
        generatedSetterHelperImpl(description, DESCRIPTION$30, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
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
            target = (org.hl7.fhir.String)get_store().add_element_user(DESCRIPTION$30);
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
            get_store().remove_element(DESCRIPTION$30, 0);
        }
    }
    
    /**
     * Gets array of all "series" elements
     */
    public org.hl7.fhir.ImagingStudySeries[] getSeriesArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(SERIES$32, targetList);
            org.hl7.fhir.ImagingStudySeries[] result = new org.hl7.fhir.ImagingStudySeries[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "series" element
     */
    public org.hl7.fhir.ImagingStudySeries getSeriesArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.ImagingStudySeries target = null;
            target = (org.hl7.fhir.ImagingStudySeries)get_store().find_element_user(SERIES$32, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "series" element
     */
    public int sizeOfSeriesArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(SERIES$32);
        }
    }
    
    /**
     * Sets array of all "series" element  WARNING: This method is not atomicaly synchronized.
     */
    public void setSeriesArray(org.hl7.fhir.ImagingStudySeries[] seriesArray)
    {
        check_orphaned();
        arraySetterHelper(seriesArray, SERIES$32);
    }
    
    /**
     * Sets ith "series" element
     */
    public void setSeriesArray(int i, org.hl7.fhir.ImagingStudySeries series)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.ImagingStudySeries target = null;
            target = (org.hl7.fhir.ImagingStudySeries)get_store().find_element_user(SERIES$32, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(series);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "series" element
     */
    public org.hl7.fhir.ImagingStudySeries insertNewSeries(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.ImagingStudySeries target = null;
            target = (org.hl7.fhir.ImagingStudySeries)get_store().insert_element_user(SERIES$32, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "series" element
     */
    public org.hl7.fhir.ImagingStudySeries addNewSeries()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.ImagingStudySeries target = null;
            target = (org.hl7.fhir.ImagingStudySeries)get_store().add_element_user(SERIES$32);
            return target;
        }
    }
    
    /**
     * Removes the ith "series" element
     */
    public void removeSeries(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(SERIES$32, i);
        }
    }
}
