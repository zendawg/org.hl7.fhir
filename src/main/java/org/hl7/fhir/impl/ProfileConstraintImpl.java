/*
 * XML Type:  Profile.Constraint
 * Namespace: http://hl7.org/fhir
 * Java type: org.hl7.fhir.ProfileConstraint
 *
 * Automatically generated - do not modify.
 */
package org.hl7.fhir.impl;
/**
 * An XML Profile.Constraint(@http://hl7.org/fhir).
 *
 * This is a complex type.
 */
public class ProfileConstraintImpl extends org.hl7.fhir.impl.BackboneElementImpl implements org.hl7.fhir.ProfileConstraint
{
    private static final long serialVersionUID = 1L;
    
    public ProfileConstraintImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName KEY$0 = 
        new javax.xml.namespace.QName("http://hl7.org/fhir", "key");
    private static final javax.xml.namespace.QName NAME$2 = 
        new javax.xml.namespace.QName("http://hl7.org/fhir", "name");
    private static final javax.xml.namespace.QName SEVERITY$4 = 
        new javax.xml.namespace.QName("http://hl7.org/fhir", "severity");
    private static final javax.xml.namespace.QName HUMAN$6 = 
        new javax.xml.namespace.QName("http://hl7.org/fhir", "human");
    private static final javax.xml.namespace.QName XPATH$8 = 
        new javax.xml.namespace.QName("http://hl7.org/fhir", "xpath");
    
    
    /**
     * Gets the "key" element
     */
    public org.hl7.fhir.Id getKey()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.Id target = null;
            target = (org.hl7.fhir.Id)get_store().find_element_user(KEY$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "key" element
     */
    public void setKey(org.hl7.fhir.Id key)
    {
        generatedSetterHelperImpl(key, KEY$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "key" element
     */
    public org.hl7.fhir.Id addNewKey()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.Id target = null;
            target = (org.hl7.fhir.Id)get_store().add_element_user(KEY$0);
            return target;
        }
    }
    
    /**
     * Gets the "name" element
     */
    public org.hl7.fhir.String getName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.String target = null;
            target = (org.hl7.fhir.String)get_store().find_element_user(NAME$2, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "name" element
     */
    public boolean isSetName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(NAME$2) != 0;
        }
    }
    
    /**
     * Sets the "name" element
     */
    public void setName(org.hl7.fhir.String name)
    {
        generatedSetterHelperImpl(name, NAME$2, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "name" element
     */
    public org.hl7.fhir.String addNewName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.String target = null;
            target = (org.hl7.fhir.String)get_store().add_element_user(NAME$2);
            return target;
        }
    }
    
    /**
     * Unsets the "name" element
     */
    public void unsetName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(NAME$2, 0);
        }
    }
    
    /**
     * Gets the "severity" element
     */
    public org.hl7.fhir.ConstraintSeverity getSeverity()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.ConstraintSeverity target = null;
            target = (org.hl7.fhir.ConstraintSeverity)get_store().find_element_user(SEVERITY$4, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "severity" element
     */
    public void setSeverity(org.hl7.fhir.ConstraintSeverity severity)
    {
        generatedSetterHelperImpl(severity, SEVERITY$4, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "severity" element
     */
    public org.hl7.fhir.ConstraintSeverity addNewSeverity()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.ConstraintSeverity target = null;
            target = (org.hl7.fhir.ConstraintSeverity)get_store().add_element_user(SEVERITY$4);
            return target;
        }
    }
    
    /**
     * Gets the "human" element
     */
    public org.hl7.fhir.String getHuman()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.String target = null;
            target = (org.hl7.fhir.String)get_store().find_element_user(HUMAN$6, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "human" element
     */
    public void setHuman(org.hl7.fhir.String human)
    {
        generatedSetterHelperImpl(human, HUMAN$6, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "human" element
     */
    public org.hl7.fhir.String addNewHuman()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.String target = null;
            target = (org.hl7.fhir.String)get_store().add_element_user(HUMAN$6);
            return target;
        }
    }
    
    /**
     * Gets the "xpath" element
     */
    public org.hl7.fhir.String getXpath()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.String target = null;
            target = (org.hl7.fhir.String)get_store().find_element_user(XPATH$8, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "xpath" element
     */
    public void setXpath(org.hl7.fhir.String xpath)
    {
        generatedSetterHelperImpl(xpath, XPATH$8, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "xpath" element
     */
    public org.hl7.fhir.String addNewXpath()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.String target = null;
            target = (org.hl7.fhir.String)get_store().add_element_user(XPATH$8);
            return target;
        }
    }
}
