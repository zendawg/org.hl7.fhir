/*
 * XML Type:  Order
 * Namespace: http://hl7.org/fhir
 * Java type: org.hl7.fhir.Order
 *
 * Automatically generated - do not modify.
 */
package org.hl7.fhir.impl;
/**
 * An XML Order(@http://hl7.org/fhir).
 *
 * This is a complex type.
 */
public class OrderImpl extends org.hl7.fhir.impl.ResourceImpl implements org.hl7.fhir.Order
{
    private static final long serialVersionUID = 1L;
    
    public OrderImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName DATE$0 = 
        new javax.xml.namespace.QName("http://hl7.org/fhir", "date");
    private static final javax.xml.namespace.QName SUBJECT$2 = 
        new javax.xml.namespace.QName("http://hl7.org/fhir", "subject");
    private static final javax.xml.namespace.QName SOURCE$4 = 
        new javax.xml.namespace.QName("http://hl7.org/fhir", "source");
    private static final javax.xml.namespace.QName TARGET$6 = 
        new javax.xml.namespace.QName("http://hl7.org/fhir", "target");
    private static final javax.xml.namespace.QName REASON$8 = 
        new javax.xml.namespace.QName("http://hl7.org/fhir", "reason");
    private static final javax.xml.namespace.QName AUTHORITY$10 = 
        new javax.xml.namespace.QName("http://hl7.org/fhir", "authority");
    private static final javax.xml.namespace.QName WHEN$12 = 
        new javax.xml.namespace.QName("http://hl7.org/fhir", "when");
    private static final javax.xml.namespace.QName DETAIL$14 = 
        new javax.xml.namespace.QName("http://hl7.org/fhir", "detail");
    
    
    /**
     * Gets the "date" element
     */
    public org.hl7.fhir.DateTime getDate()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.DateTime target = null;
            target = (org.hl7.fhir.DateTime)get_store().find_element_user(DATE$0, 0);
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
            return get_store().count_elements(DATE$0) != 0;
        }
    }
    
    /**
     * Sets the "date" element
     */
    public void setDate(org.hl7.fhir.DateTime date)
    {
        generatedSetterHelperImpl(date, DATE$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
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
            target = (org.hl7.fhir.DateTime)get_store().add_element_user(DATE$0);
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
            get_store().remove_element(DATE$0, 0);
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
     * True if has "subject" element
     */
    public boolean isSetSubject()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(SUBJECT$2) != 0;
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
     * Unsets the "subject" element
     */
    public void unsetSubject()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(SUBJECT$2, 0);
        }
    }
    
    /**
     * Gets the "source" element
     */
    public org.hl7.fhir.ResourceReference getSource()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.ResourceReference target = null;
            target = (org.hl7.fhir.ResourceReference)get_store().find_element_user(SOURCE$4, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "source" element
     */
    public boolean isSetSource()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(SOURCE$4) != 0;
        }
    }
    
    /**
     * Sets the "source" element
     */
    public void setSource(org.hl7.fhir.ResourceReference source)
    {
        generatedSetterHelperImpl(source, SOURCE$4, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "source" element
     */
    public org.hl7.fhir.ResourceReference addNewSource()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.ResourceReference target = null;
            target = (org.hl7.fhir.ResourceReference)get_store().add_element_user(SOURCE$4);
            return target;
        }
    }
    
    /**
     * Unsets the "source" element
     */
    public void unsetSource()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(SOURCE$4, 0);
        }
    }
    
    /**
     * Gets the "target" element
     */
    public org.hl7.fhir.ResourceReference getTarget()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.ResourceReference target = null;
            target = (org.hl7.fhir.ResourceReference)get_store().find_element_user(TARGET$6, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "target" element
     */
    public boolean isSetTarget()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(TARGET$6) != 0;
        }
    }
    
    /**
     * Sets the "target" element
     */
    public void setTarget(org.hl7.fhir.ResourceReference targetValue)
    {
        generatedSetterHelperImpl(targetValue, TARGET$6, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "target" element
     */
    public org.hl7.fhir.ResourceReference addNewTarget()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.ResourceReference target = null;
            target = (org.hl7.fhir.ResourceReference)get_store().add_element_user(TARGET$6);
            return target;
        }
    }
    
    /**
     * Unsets the "target" element
     */
    public void unsetTarget()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(TARGET$6, 0);
        }
    }
    
    /**
     * Gets the "reason" element
     */
    public org.hl7.fhir.String getReason()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.String target = null;
            target = (org.hl7.fhir.String)get_store().find_element_user(REASON$8, 0);
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
            return get_store().count_elements(REASON$8) != 0;
        }
    }
    
    /**
     * Sets the "reason" element
     */
    public void setReason(org.hl7.fhir.String reason)
    {
        generatedSetterHelperImpl(reason, REASON$8, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "reason" element
     */
    public org.hl7.fhir.String addNewReason()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.String target = null;
            target = (org.hl7.fhir.String)get_store().add_element_user(REASON$8);
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
            get_store().remove_element(REASON$8, 0);
        }
    }
    
    /**
     * Gets the "authority" element
     */
    public org.hl7.fhir.ResourceReference getAuthority()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.ResourceReference target = null;
            target = (org.hl7.fhir.ResourceReference)get_store().find_element_user(AUTHORITY$10, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "authority" element
     */
    public boolean isSetAuthority()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(AUTHORITY$10) != 0;
        }
    }
    
    /**
     * Sets the "authority" element
     */
    public void setAuthority(org.hl7.fhir.ResourceReference authority)
    {
        generatedSetterHelperImpl(authority, AUTHORITY$10, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "authority" element
     */
    public org.hl7.fhir.ResourceReference addNewAuthority()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.ResourceReference target = null;
            target = (org.hl7.fhir.ResourceReference)get_store().add_element_user(AUTHORITY$10);
            return target;
        }
    }
    
    /**
     * Unsets the "authority" element
     */
    public void unsetAuthority()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(AUTHORITY$10, 0);
        }
    }
    
    /**
     * Gets the "when" element
     */
    public org.hl7.fhir.OrderWhen getWhen()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.OrderWhen target = null;
            target = (org.hl7.fhir.OrderWhen)get_store().find_element_user(WHEN$12, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "when" element
     */
    public boolean isSetWhen()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(WHEN$12) != 0;
        }
    }
    
    /**
     * Sets the "when" element
     */
    public void setWhen(org.hl7.fhir.OrderWhen when)
    {
        generatedSetterHelperImpl(when, WHEN$12, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "when" element
     */
    public org.hl7.fhir.OrderWhen addNewWhen()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.OrderWhen target = null;
            target = (org.hl7.fhir.OrderWhen)get_store().add_element_user(WHEN$12);
            return target;
        }
    }
    
    /**
     * Unsets the "when" element
     */
    public void unsetWhen()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(WHEN$12, 0);
        }
    }
    
    /**
     * Gets array of all "detail" elements
     */
    public org.hl7.fhir.ResourceReference[] getDetailArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(DETAIL$14, targetList);
            org.hl7.fhir.ResourceReference[] result = new org.hl7.fhir.ResourceReference[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "detail" element
     */
    public org.hl7.fhir.ResourceReference getDetailArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.ResourceReference target = null;
            target = (org.hl7.fhir.ResourceReference)get_store().find_element_user(DETAIL$14, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "detail" element
     */
    public int sizeOfDetailArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(DETAIL$14);
        }
    }
    
    /**
     * Sets array of all "detail" element  WARNING: This method is not atomicaly synchronized.
     */
    public void setDetailArray(org.hl7.fhir.ResourceReference[] detailArray)
    {
        check_orphaned();
        arraySetterHelper(detailArray, DETAIL$14);
    }
    
    /**
     * Sets ith "detail" element
     */
    public void setDetailArray(int i, org.hl7.fhir.ResourceReference detail)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.ResourceReference target = null;
            target = (org.hl7.fhir.ResourceReference)get_store().find_element_user(DETAIL$14, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(detail);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "detail" element
     */
    public org.hl7.fhir.ResourceReference insertNewDetail(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.ResourceReference target = null;
            target = (org.hl7.fhir.ResourceReference)get_store().insert_element_user(DETAIL$14, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "detail" element
     */
    public org.hl7.fhir.ResourceReference addNewDetail()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.ResourceReference target = null;
            target = (org.hl7.fhir.ResourceReference)get_store().add_element_user(DETAIL$14);
            return target;
        }
    }
    
    /**
     * Removes the ith "detail" element
     */
    public void removeDetail(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(DETAIL$14, i);
        }
    }
}
