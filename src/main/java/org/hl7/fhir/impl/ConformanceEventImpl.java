/*
 * XML Type:  Conformance.Event
 * Namespace: http://hl7.org/fhir
 * Java type: org.hl7.fhir.ConformanceEvent
 *
 * Automatically generated - do not modify.
 */
package org.hl7.fhir.impl;
/**
 * An XML Conformance.Event(@http://hl7.org/fhir).
 *
 * This is a complex type.
 */
public class ConformanceEventImpl extends org.hl7.fhir.impl.BackboneElementImpl implements org.hl7.fhir.ConformanceEvent
{
    private static final long serialVersionUID = 1L;
    
    public ConformanceEventImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName CODE$0 = 
        new javax.xml.namespace.QName("http://hl7.org/fhir", "code");
    private static final javax.xml.namespace.QName CATEGORY$2 = 
        new javax.xml.namespace.QName("http://hl7.org/fhir", "category");
    private static final javax.xml.namespace.QName MODE$4 = 
        new javax.xml.namespace.QName("http://hl7.org/fhir", "mode");
    private static final javax.xml.namespace.QName PROTOCOL$6 = 
        new javax.xml.namespace.QName("http://hl7.org/fhir", "protocol");
    private static final javax.xml.namespace.QName FOCUS$8 = 
        new javax.xml.namespace.QName("http://hl7.org/fhir", "focus");
    private static final javax.xml.namespace.QName REQUEST$10 = 
        new javax.xml.namespace.QName("http://hl7.org/fhir", "request");
    private static final javax.xml.namespace.QName RESPONSE$12 = 
        new javax.xml.namespace.QName("http://hl7.org/fhir", "response");
    private static final javax.xml.namespace.QName DOCUMENTATION$14 = 
        new javax.xml.namespace.QName("http://hl7.org/fhir", "documentation");
    
    
    /**
     * Gets the "code" element
     */
    public org.hl7.fhir.Coding getCode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.Coding target = null;
            target = (org.hl7.fhir.Coding)get_store().find_element_user(CODE$0, 0);
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
    public void setCode(org.hl7.fhir.Coding code)
    {
        generatedSetterHelperImpl(code, CODE$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "code" element
     */
    public org.hl7.fhir.Coding addNewCode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.Coding target = null;
            target = (org.hl7.fhir.Coding)get_store().add_element_user(CODE$0);
            return target;
        }
    }
    
    /**
     * Gets the "category" element
     */
    public org.hl7.fhir.MessageSignificanceCategory getCategory()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.MessageSignificanceCategory target = null;
            target = (org.hl7.fhir.MessageSignificanceCategory)get_store().find_element_user(CATEGORY$2, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "category" element
     */
    public boolean isSetCategory()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(CATEGORY$2) != 0;
        }
    }
    
    /**
     * Sets the "category" element
     */
    public void setCategory(org.hl7.fhir.MessageSignificanceCategory category)
    {
        generatedSetterHelperImpl(category, CATEGORY$2, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "category" element
     */
    public org.hl7.fhir.MessageSignificanceCategory addNewCategory()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.MessageSignificanceCategory target = null;
            target = (org.hl7.fhir.MessageSignificanceCategory)get_store().add_element_user(CATEGORY$2);
            return target;
        }
    }
    
    /**
     * Unsets the "category" element
     */
    public void unsetCategory()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(CATEGORY$2, 0);
        }
    }
    
    /**
     * Gets the "mode" element
     */
    public org.hl7.fhir.ConformanceEventMode getMode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.ConformanceEventMode target = null;
            target = (org.hl7.fhir.ConformanceEventMode)get_store().find_element_user(MODE$4, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "mode" element
     */
    public void setMode(org.hl7.fhir.ConformanceEventMode mode)
    {
        generatedSetterHelperImpl(mode, MODE$4, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "mode" element
     */
    public org.hl7.fhir.ConformanceEventMode addNewMode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.ConformanceEventMode target = null;
            target = (org.hl7.fhir.ConformanceEventMode)get_store().add_element_user(MODE$4);
            return target;
        }
    }
    
    /**
     * Gets array of all "protocol" elements
     */
    public org.hl7.fhir.Coding[] getProtocolArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(PROTOCOL$6, targetList);
            org.hl7.fhir.Coding[] result = new org.hl7.fhir.Coding[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "protocol" element
     */
    public org.hl7.fhir.Coding getProtocolArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.Coding target = null;
            target = (org.hl7.fhir.Coding)get_store().find_element_user(PROTOCOL$6, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "protocol" element
     */
    public int sizeOfProtocolArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(PROTOCOL$6);
        }
    }
    
    /**
     * Sets array of all "protocol" element  WARNING: This method is not atomicaly synchronized.
     */
    public void setProtocolArray(org.hl7.fhir.Coding[] protocolArray)
    {
        check_orphaned();
        arraySetterHelper(protocolArray, PROTOCOL$6);
    }
    
    /**
     * Sets ith "protocol" element
     */
    public void setProtocolArray(int i, org.hl7.fhir.Coding protocol)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.Coding target = null;
            target = (org.hl7.fhir.Coding)get_store().find_element_user(PROTOCOL$6, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(protocol);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "protocol" element
     */
    public org.hl7.fhir.Coding insertNewProtocol(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.Coding target = null;
            target = (org.hl7.fhir.Coding)get_store().insert_element_user(PROTOCOL$6, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "protocol" element
     */
    public org.hl7.fhir.Coding addNewProtocol()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.Coding target = null;
            target = (org.hl7.fhir.Coding)get_store().add_element_user(PROTOCOL$6);
            return target;
        }
    }
    
    /**
     * Removes the ith "protocol" element
     */
    public void removeProtocol(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(PROTOCOL$6, i);
        }
    }
    
    /**
     * Gets the "focus" element
     */
    public org.hl7.fhir.Code getFocus()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.Code target = null;
            target = (org.hl7.fhir.Code)get_store().find_element_user(FOCUS$8, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "focus" element
     */
    public void setFocus(org.hl7.fhir.Code focus)
    {
        generatedSetterHelperImpl(focus, FOCUS$8, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "focus" element
     */
    public org.hl7.fhir.Code addNewFocus()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.Code target = null;
            target = (org.hl7.fhir.Code)get_store().add_element_user(FOCUS$8);
            return target;
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
            target = (org.hl7.fhir.ResourceReference)get_store().find_element_user(REQUEST$10, 0);
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
        generatedSetterHelperImpl(request, REQUEST$10, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
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
            target = (org.hl7.fhir.ResourceReference)get_store().add_element_user(REQUEST$10);
            return target;
        }
    }
    
    /**
     * Gets the "response" element
     */
    public org.hl7.fhir.ResourceReference getResponse()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.ResourceReference target = null;
            target = (org.hl7.fhir.ResourceReference)get_store().find_element_user(RESPONSE$12, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "response" element
     */
    public void setResponse(org.hl7.fhir.ResourceReference response)
    {
        generatedSetterHelperImpl(response, RESPONSE$12, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "response" element
     */
    public org.hl7.fhir.ResourceReference addNewResponse()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.ResourceReference target = null;
            target = (org.hl7.fhir.ResourceReference)get_store().add_element_user(RESPONSE$12);
            return target;
        }
    }
    
    /**
     * Gets the "documentation" element
     */
    public org.hl7.fhir.String getDocumentation()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.String target = null;
            target = (org.hl7.fhir.String)get_store().find_element_user(DOCUMENTATION$14, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "documentation" element
     */
    public boolean isSetDocumentation()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(DOCUMENTATION$14) != 0;
        }
    }
    
    /**
     * Sets the "documentation" element
     */
    public void setDocumentation(org.hl7.fhir.String documentation)
    {
        generatedSetterHelperImpl(documentation, DOCUMENTATION$14, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "documentation" element
     */
    public org.hl7.fhir.String addNewDocumentation()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.String target = null;
            target = (org.hl7.fhir.String)get_store().add_element_user(DOCUMENTATION$14);
            return target;
        }
    }
    
    /**
     * Unsets the "documentation" element
     */
    public void unsetDocumentation()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(DOCUMENTATION$14, 0);
        }
    }
}
