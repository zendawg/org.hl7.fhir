/*
 * XML Type:  Identifier
 * Namespace: http://hl7.org/fhir
 * Java type: org.hl7.fhir.Identifier
 *
 * Automatically generated - do not modify.
 */
package org.hl7.fhir.impl;
/**
 * An XML Identifier(@http://hl7.org/fhir).
 *
 * This is a complex type.
 */
public class IdentifierImpl extends org.hl7.fhir.impl.ElementImpl implements org.hl7.fhir.Identifier
{
    private static final long serialVersionUID = 1L;
    
    public IdentifierImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName USE$0 = 
        new javax.xml.namespace.QName("http://hl7.org/fhir", "use");
    private static final javax.xml.namespace.QName LABEL$2 = 
        new javax.xml.namespace.QName("http://hl7.org/fhir", "label");
    private static final javax.xml.namespace.QName SYSTEM$4 = 
        new javax.xml.namespace.QName("http://hl7.org/fhir", "system");
    private static final javax.xml.namespace.QName VALUE$6 = 
        new javax.xml.namespace.QName("http://hl7.org/fhir", "value");
    private static final javax.xml.namespace.QName PERIOD$8 = 
        new javax.xml.namespace.QName("http://hl7.org/fhir", "period");
    private static final javax.xml.namespace.QName ASSIGNER$10 = 
        new javax.xml.namespace.QName("http://hl7.org/fhir", "assigner");
    
    
    /**
     * Gets the "use" element
     */
    public org.hl7.fhir.IdentifierUse getUse()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.IdentifierUse target = null;
            target = (org.hl7.fhir.IdentifierUse)get_store().find_element_user(USE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "use" element
     */
    public boolean isSetUse()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(USE$0) != 0;
        }
    }
    
    /**
     * Sets the "use" element
     */
    public void setUse(org.hl7.fhir.IdentifierUse use)
    {
        generatedSetterHelperImpl(use, USE$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "use" element
     */
    public org.hl7.fhir.IdentifierUse addNewUse()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.IdentifierUse target = null;
            target = (org.hl7.fhir.IdentifierUse)get_store().add_element_user(USE$0);
            return target;
        }
    }
    
    /**
     * Unsets the "use" element
     */
    public void unsetUse()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(USE$0, 0);
        }
    }
    
    /**
     * Gets the "label" element
     */
    public org.hl7.fhir.String getLabel()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.String target = null;
            target = (org.hl7.fhir.String)get_store().find_element_user(LABEL$2, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "label" element
     */
    public boolean isSetLabel()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(LABEL$2) != 0;
        }
    }
    
    /**
     * Sets the "label" element
     */
    public void setLabel(org.hl7.fhir.String label)
    {
        generatedSetterHelperImpl(label, LABEL$2, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "label" element
     */
    public org.hl7.fhir.String addNewLabel()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.String target = null;
            target = (org.hl7.fhir.String)get_store().add_element_user(LABEL$2);
            return target;
        }
    }
    
    /**
     * Unsets the "label" element
     */
    public void unsetLabel()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(LABEL$2, 0);
        }
    }
    
    /**
     * Gets the "system" element
     */
    public org.hl7.fhir.Uri getSystem()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.Uri target = null;
            target = (org.hl7.fhir.Uri)get_store().find_element_user(SYSTEM$4, 0);
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
            return get_store().count_elements(SYSTEM$4) != 0;
        }
    }
    
    /**
     * Sets the "system" element
     */
    public void setSystem(org.hl7.fhir.Uri system)
    {
        generatedSetterHelperImpl(system, SYSTEM$4, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
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
            target = (org.hl7.fhir.Uri)get_store().add_element_user(SYSTEM$4);
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
            get_store().remove_element(SYSTEM$4, 0);
        }
    }
    
    /**
     * Gets the "value" element
     */
    public org.hl7.fhir.String getValue()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.String target = null;
            target = (org.hl7.fhir.String)get_store().find_element_user(VALUE$6, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "value" element
     */
    public boolean isSetValue()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(VALUE$6) != 0;
        }
    }
    
    /**
     * Sets the "value" element
     */
    public void setValue(org.hl7.fhir.String value)
    {
        generatedSetterHelperImpl(value, VALUE$6, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "value" element
     */
    public org.hl7.fhir.String addNewValue()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.String target = null;
            target = (org.hl7.fhir.String)get_store().add_element_user(VALUE$6);
            return target;
        }
    }
    
    /**
     * Unsets the "value" element
     */
    public void unsetValue()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(VALUE$6, 0);
        }
    }
    
    /**
     * Gets the "period" element
     */
    public org.hl7.fhir.Period getPeriod()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.Period target = null;
            target = (org.hl7.fhir.Period)get_store().find_element_user(PERIOD$8, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "period" element
     */
    public boolean isSetPeriod()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(PERIOD$8) != 0;
        }
    }
    
    /**
     * Sets the "period" element
     */
    public void setPeriod(org.hl7.fhir.Period period)
    {
        generatedSetterHelperImpl(period, PERIOD$8, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "period" element
     */
    public org.hl7.fhir.Period addNewPeriod()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.Period target = null;
            target = (org.hl7.fhir.Period)get_store().add_element_user(PERIOD$8);
            return target;
        }
    }
    
    /**
     * Unsets the "period" element
     */
    public void unsetPeriod()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(PERIOD$8, 0);
        }
    }
    
    /**
     * Gets the "assigner" element
     */
    public org.hl7.fhir.ResourceReference getAssigner()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.ResourceReference target = null;
            target = (org.hl7.fhir.ResourceReference)get_store().find_element_user(ASSIGNER$10, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "assigner" element
     */
    public boolean isSetAssigner()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(ASSIGNER$10) != 0;
        }
    }
    
    /**
     * Sets the "assigner" element
     */
    public void setAssigner(org.hl7.fhir.ResourceReference assigner)
    {
        generatedSetterHelperImpl(assigner, ASSIGNER$10, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "assigner" element
     */
    public org.hl7.fhir.ResourceReference addNewAssigner()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.ResourceReference target = null;
            target = (org.hl7.fhir.ResourceReference)get_store().add_element_user(ASSIGNER$10);
            return target;
        }
    }
    
    /**
     * Unsets the "assigner" element
     */
    public void unsetAssigner()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(ASSIGNER$10, 0);
        }
    }
}
