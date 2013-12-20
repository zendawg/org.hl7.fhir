/*
 * XML Type:  Coding
 * Namespace: http://hl7.org/fhir
 * Java type: org.hl7.fhir.Coding
 *
 * Automatically generated - do not modify.
 */
package org.hl7.fhir.impl;
/**
 * An XML Coding(@http://hl7.org/fhir).
 *
 * This is a complex type.
 */
public class CodingImpl extends org.hl7.fhir.impl.ElementImpl implements org.hl7.fhir.Coding
{
    private static final long serialVersionUID = 1L;
    
    public CodingImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName SYSTEM$0 = 
        new javax.xml.namespace.QName("http://hl7.org/fhir", "system");
    private static final javax.xml.namespace.QName VERSION$2 = 
        new javax.xml.namespace.QName("http://hl7.org/fhir", "version");
    private static final javax.xml.namespace.QName CODE$4 = 
        new javax.xml.namespace.QName("http://hl7.org/fhir", "code");
    private static final javax.xml.namespace.QName DISPLAY$6 = 
        new javax.xml.namespace.QName("http://hl7.org/fhir", "display");
    private static final javax.xml.namespace.QName PRIMARY$8 = 
        new javax.xml.namespace.QName("http://hl7.org/fhir", "primary");
    private static final javax.xml.namespace.QName VALUESET$10 = 
        new javax.xml.namespace.QName("http://hl7.org/fhir", "valueSet");
    
    
    /**
     * Gets the "system" element
     */
    public org.hl7.fhir.Uri getSystem()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.Uri target = null;
            target = (org.hl7.fhir.Uri)get_store().find_element_user(SYSTEM$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "system" element
     */
    public boolean isSetSystem()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(SYSTEM$0) != 0;
        }
    }
    
    /**
     * Sets the "system" element
     */
    public void setSystem(org.hl7.fhir.Uri system)
    {
        generatedSetterHelperImpl(system, SYSTEM$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "system" element
     */
    public org.hl7.fhir.Uri addNewSystem()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.Uri target = null;
            target = (org.hl7.fhir.Uri)get_store().add_element_user(SYSTEM$0);
            return target;
        }
    }
    
    /**
     * Unsets the "system" element
     */
    public void unsetSystem()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(SYSTEM$0, 0);
        }
    }
    
    /**
     * Gets the "version" element
     */
    public org.hl7.fhir.String getVersion()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.String target = null;
            target = (org.hl7.fhir.String)get_store().find_element_user(VERSION$2, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "version" element
     */
    public boolean isSetVersion()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(VERSION$2) != 0;
        }
    }
    
    /**
     * Sets the "version" element
     */
    public void setVersion(org.hl7.fhir.String version)
    {
        generatedSetterHelperImpl(version, VERSION$2, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "version" element
     */
    public org.hl7.fhir.String addNewVersion()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.String target = null;
            target = (org.hl7.fhir.String)get_store().add_element_user(VERSION$2);
            return target;
        }
    }
    
    /**
     * Unsets the "version" element
     */
    public void unsetVersion()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(VERSION$2, 0);
        }
    }
    
    /**
     * Gets the "code" element
     */
    public org.hl7.fhir.Code getCode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.Code target = null;
            target = (org.hl7.fhir.Code)get_store().find_element_user(CODE$4, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "code" element
     */
    public boolean isSetCode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(CODE$4) != 0;
        }
    }
    
    /**
     * Sets the "code" element
     */
    public void setCode(org.hl7.fhir.Code code)
    {
        generatedSetterHelperImpl(code, CODE$4, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "code" element
     */
    public org.hl7.fhir.Code addNewCode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.Code target = null;
            target = (org.hl7.fhir.Code)get_store().add_element_user(CODE$4);
            return target;
        }
    }
    
    /**
     * Unsets the "code" element
     */
    public void unsetCode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(CODE$4, 0);
        }
    }
    
    /**
     * Gets the "display" element
     */
    public org.hl7.fhir.String getDisplay()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.String target = null;
            target = (org.hl7.fhir.String)get_store().find_element_user(DISPLAY$6, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "display" element
     */
    public boolean isSetDisplay()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(DISPLAY$6) != 0;
        }
    }
    
    /**
     * Sets the "display" element
     */
    public void setDisplay(org.hl7.fhir.String display)
    {
        generatedSetterHelperImpl(display, DISPLAY$6, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "display" element
     */
    public org.hl7.fhir.String addNewDisplay()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.String target = null;
            target = (org.hl7.fhir.String)get_store().add_element_user(DISPLAY$6);
            return target;
        }
    }
    
    /**
     * Unsets the "display" element
     */
    public void unsetDisplay()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(DISPLAY$6, 0);
        }
    }
    
    /**
     * Gets the "primary" element
     */
    public org.hl7.fhir.Boolean getPrimary()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.Boolean target = null;
            target = (org.hl7.fhir.Boolean)get_store().find_element_user(PRIMARY$8, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "primary" element
     */
    public boolean isSetPrimary()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(PRIMARY$8) != 0;
        }
    }
    
    /**
     * Sets the "primary" element
     */
    public void setPrimary(org.hl7.fhir.Boolean primary)
    {
        generatedSetterHelperImpl(primary, PRIMARY$8, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "primary" element
     */
    public org.hl7.fhir.Boolean addNewPrimary()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.Boolean target = null;
            target = (org.hl7.fhir.Boolean)get_store().add_element_user(PRIMARY$8);
            return target;
        }
    }
    
    /**
     * Unsets the "primary" element
     */
    public void unsetPrimary()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(PRIMARY$8, 0);
        }
    }
    
    /**
     * Gets the "valueSet" element
     */
    public org.hl7.fhir.ResourceReference getValueSet()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.ResourceReference target = null;
            target = (org.hl7.fhir.ResourceReference)get_store().find_element_user(VALUESET$10, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "valueSet" element
     */
    public boolean isSetValueSet()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(VALUESET$10) != 0;
        }
    }
    
    /**
     * Sets the "valueSet" element
     */
    public void setValueSet(org.hl7.fhir.ResourceReference valueSet)
    {
        generatedSetterHelperImpl(valueSet, VALUESET$10, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "valueSet" element
     */
    public org.hl7.fhir.ResourceReference addNewValueSet()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.ResourceReference target = null;
            target = (org.hl7.fhir.ResourceReference)get_store().add_element_user(VALUESET$10);
            return target;
        }
    }
    
    /**
     * Unsets the "valueSet" element
     */
    public void unsetValueSet()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(VALUESET$10, 0);
        }
    }
}
