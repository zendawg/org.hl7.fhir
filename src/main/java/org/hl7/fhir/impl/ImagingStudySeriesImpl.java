/*
 * XML Type:  ImagingStudy.Series
 * Namespace: http://hl7.org/fhir
 * Java type: org.hl7.fhir.ImagingStudySeries
 *
 * Automatically generated - do not modify.
 */
package org.hl7.fhir.impl;
/**
 * An XML ImagingStudy.Series(@http://hl7.org/fhir).
 *
 * This is a complex type.
 */
public class ImagingStudySeriesImpl extends org.hl7.fhir.impl.BackboneElementImpl implements org.hl7.fhir.ImagingStudySeries
{
    private static final long serialVersionUID = 1L;
    
    public ImagingStudySeriesImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName NUMBER$0 = 
        new javax.xml.namespace.QName("http://hl7.org/fhir", "number");
    private static final javax.xml.namespace.QName MODALITY$2 = 
        new javax.xml.namespace.QName("http://hl7.org/fhir", "modality");
    private static final javax.xml.namespace.QName UID$4 = 
        new javax.xml.namespace.QName("http://hl7.org/fhir", "uid");
    private static final javax.xml.namespace.QName DESCRIPTION$6 = 
        new javax.xml.namespace.QName("http://hl7.org/fhir", "description");
    private static final javax.xml.namespace.QName NUMBEROFINSTANCES$8 = 
        new javax.xml.namespace.QName("http://hl7.org/fhir", "numberOfInstances");
    private static final javax.xml.namespace.QName AVAILABILITY$10 = 
        new javax.xml.namespace.QName("http://hl7.org/fhir", "availability");
    private static final javax.xml.namespace.QName URL$12 = 
        new javax.xml.namespace.QName("http://hl7.org/fhir", "url");
    private static final javax.xml.namespace.QName BODYSITE$14 = 
        new javax.xml.namespace.QName("http://hl7.org/fhir", "bodySite");
    private static final javax.xml.namespace.QName DATETIME$16 = 
        new javax.xml.namespace.QName("http://hl7.org/fhir", "dateTime");
    private static final javax.xml.namespace.QName INSTANCE$18 = 
        new javax.xml.namespace.QName("http://hl7.org/fhir", "instance");
    
    
    /**
     * Gets the "number" element
     */
    public org.hl7.fhir.Integer getNumber()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.Integer target = null;
            target = (org.hl7.fhir.Integer)get_store().find_element_user(NUMBER$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "number" element
     */
    public boolean isSetNumber()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(NUMBER$0) != 0;
        }
    }
    
    /**
     * Sets the "number" element
     */
    public void setNumber(org.hl7.fhir.Integer number)
    {
        generatedSetterHelperImpl(number, NUMBER$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "number" element
     */
    public org.hl7.fhir.Integer addNewNumber()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.Integer target = null;
            target = (org.hl7.fhir.Integer)get_store().add_element_user(NUMBER$0);
            return target;
        }
    }
    
    /**
     * Unsets the "number" element
     */
    public void unsetNumber()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(NUMBER$0, 0);
        }
    }
    
    /**
     * Gets the "modality" element
     */
    public org.hl7.fhir.Modality getModality()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.Modality target = null;
            target = (org.hl7.fhir.Modality)get_store().find_element_user(MODALITY$2, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "modality" element
     */
    public void setModality(org.hl7.fhir.Modality modality)
    {
        generatedSetterHelperImpl(modality, MODALITY$2, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "modality" element
     */
    public org.hl7.fhir.Modality addNewModality()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.Modality target = null;
            target = (org.hl7.fhir.Modality)get_store().add_element_user(MODALITY$2);
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
     * Gets the "description" element
     */
    public org.hl7.fhir.String getDescription()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.String target = null;
            target = (org.hl7.fhir.String)get_store().find_element_user(DESCRIPTION$6, 0);
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
            return get_store().count_elements(DESCRIPTION$6) != 0;
        }
    }
    
    /**
     * Sets the "description" element
     */
    public void setDescription(org.hl7.fhir.String description)
    {
        generatedSetterHelperImpl(description, DESCRIPTION$6, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
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
            target = (org.hl7.fhir.String)get_store().add_element_user(DESCRIPTION$6);
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
            get_store().remove_element(DESCRIPTION$6, 0);
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
            target = (org.hl7.fhir.Integer)get_store().find_element_user(NUMBEROFINSTANCES$8, 0);
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
        generatedSetterHelperImpl(numberOfInstances, NUMBEROFINSTANCES$8, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
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
            target = (org.hl7.fhir.Integer)get_store().add_element_user(NUMBEROFINSTANCES$8);
            return target;
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
            target = (org.hl7.fhir.InstanceAvailability)get_store().find_element_user(AVAILABILITY$10, 0);
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
            return get_store().count_elements(AVAILABILITY$10) != 0;
        }
    }
    
    /**
     * Sets the "availability" element
     */
    public void setAvailability(org.hl7.fhir.InstanceAvailability availability)
    {
        generatedSetterHelperImpl(availability, AVAILABILITY$10, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
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
            target = (org.hl7.fhir.InstanceAvailability)get_store().add_element_user(AVAILABILITY$10);
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
            get_store().remove_element(AVAILABILITY$10, 0);
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
            target = (org.hl7.fhir.Uri)get_store().find_element_user(URL$12, 0);
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
            return get_store().count_elements(URL$12) != 0;
        }
    }
    
    /**
     * Sets the "url" element
     */
    public void setUrl(org.hl7.fhir.Uri url)
    {
        generatedSetterHelperImpl(url, URL$12, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
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
            target = (org.hl7.fhir.Uri)get_store().add_element_user(URL$12);
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
            get_store().remove_element(URL$12, 0);
        }
    }
    
    /**
     * Gets the "bodySite" element
     */
    public org.hl7.fhir.Coding getBodySite()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.Coding target = null;
            target = (org.hl7.fhir.Coding)get_store().find_element_user(BODYSITE$14, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "bodySite" element
     */
    public boolean isSetBodySite()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(BODYSITE$14) != 0;
        }
    }
    
    /**
     * Sets the "bodySite" element
     */
    public void setBodySite(org.hl7.fhir.Coding bodySite)
    {
        generatedSetterHelperImpl(bodySite, BODYSITE$14, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "bodySite" element
     */
    public org.hl7.fhir.Coding addNewBodySite()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.Coding target = null;
            target = (org.hl7.fhir.Coding)get_store().add_element_user(BODYSITE$14);
            return target;
        }
    }
    
    /**
     * Unsets the "bodySite" element
     */
    public void unsetBodySite()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(BODYSITE$14, 0);
        }
    }
    
    /**
     * Gets the "dateTime" element
     */
    public org.hl7.fhir.DateTime getDateTime()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.DateTime target = null;
            target = (org.hl7.fhir.DateTime)get_store().find_element_user(DATETIME$16, 0);
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
            return get_store().count_elements(DATETIME$16) != 0;
        }
    }
    
    /**
     * Sets the "dateTime" element
     */
    public void setDateTime(org.hl7.fhir.DateTime dateTime)
    {
        generatedSetterHelperImpl(dateTime, DATETIME$16, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
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
            target = (org.hl7.fhir.DateTime)get_store().add_element_user(DATETIME$16);
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
            get_store().remove_element(DATETIME$16, 0);
        }
    }
    
    /**
     * Gets array of all "instance" elements
     */
    public org.hl7.fhir.ImagingStudyInstance[] getInstanceArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(INSTANCE$18, targetList);
            org.hl7.fhir.ImagingStudyInstance[] result = new org.hl7.fhir.ImagingStudyInstance[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "instance" element
     */
    public org.hl7.fhir.ImagingStudyInstance getInstanceArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.ImagingStudyInstance target = null;
            target = (org.hl7.fhir.ImagingStudyInstance)get_store().find_element_user(INSTANCE$18, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "instance" element
     */
    public int sizeOfInstanceArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(INSTANCE$18);
        }
    }
    
    /**
     * Sets array of all "instance" element  WARNING: This method is not atomicaly synchronized.
     */
    public void setInstanceArray(org.hl7.fhir.ImagingStudyInstance[] instanceArray)
    {
        check_orphaned();
        arraySetterHelper(instanceArray, INSTANCE$18);
    }
    
    /**
     * Sets ith "instance" element
     */
    public void setInstanceArray(int i, org.hl7.fhir.ImagingStudyInstance instance)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.ImagingStudyInstance target = null;
            target = (org.hl7.fhir.ImagingStudyInstance)get_store().find_element_user(INSTANCE$18, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(instance);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "instance" element
     */
    public org.hl7.fhir.ImagingStudyInstance insertNewInstance(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.ImagingStudyInstance target = null;
            target = (org.hl7.fhir.ImagingStudyInstance)get_store().insert_element_user(INSTANCE$18, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "instance" element
     */
    public org.hl7.fhir.ImagingStudyInstance addNewInstance()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.ImagingStudyInstance target = null;
            target = (org.hl7.fhir.ImagingStudyInstance)get_store().add_element_user(INSTANCE$18);
            return target;
        }
    }
    
    /**
     * Removes the ith "instance" element
     */
    public void removeInstance(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(INSTANCE$18, i);
        }
    }
}
