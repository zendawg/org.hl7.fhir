/*
 * XML Type:  Provenance.Entity
 * Namespace: http://hl7.org/fhir
 * Java type: org.hl7.fhir.ProvenanceEntity
 *
 * Automatically generated - do not modify.
 */
package org.hl7.fhir.impl;
/**
 * An XML Provenance.Entity(@http://hl7.org/fhir).
 *
 * This is a complex type.
 */
public class ProvenanceEntityImpl extends org.hl7.fhir.impl.BackboneElementImpl implements org.hl7.fhir.ProvenanceEntity
{
    private static final long serialVersionUID = 1L;
    
    public ProvenanceEntityImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName ROLE$0 = 
        new javax.xml.namespace.QName("http://hl7.org/fhir", "role");
    private static final javax.xml.namespace.QName TYPE$2 = 
        new javax.xml.namespace.QName("http://hl7.org/fhir", "type");
    private static final javax.xml.namespace.QName REFERENCE$4 = 
        new javax.xml.namespace.QName("http://hl7.org/fhir", "reference");
    private static final javax.xml.namespace.QName DISPLAY$6 = 
        new javax.xml.namespace.QName("http://hl7.org/fhir", "display");
    private static final javax.xml.namespace.QName AGENT$8 = 
        new javax.xml.namespace.QName("http://hl7.org/fhir", "agent");
    
    
    /**
     * Gets the "role" element
     */
    public org.hl7.fhir.ProvenanceEntityRole getRole()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.ProvenanceEntityRole target = null;
            target = (org.hl7.fhir.ProvenanceEntityRole)get_store().find_element_user(ROLE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "role" element
     */
    public void setRole(org.hl7.fhir.ProvenanceEntityRole role)
    {
        generatedSetterHelperImpl(role, ROLE$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "role" element
     */
    public org.hl7.fhir.ProvenanceEntityRole addNewRole()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.ProvenanceEntityRole target = null;
            target = (org.hl7.fhir.ProvenanceEntityRole)get_store().add_element_user(ROLE$0);
            return target;
        }
    }
    
    /**
     * Gets the "type" element
     */
    public org.hl7.fhir.Coding getType()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.Coding target = null;
            target = (org.hl7.fhir.Coding)get_store().find_element_user(TYPE$2, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "type" element
     */
    public void setType(org.hl7.fhir.Coding type)
    {
        generatedSetterHelperImpl(type, TYPE$2, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "type" element
     */
    public org.hl7.fhir.Coding addNewType()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.Coding target = null;
            target = (org.hl7.fhir.Coding)get_store().add_element_user(TYPE$2);
            return target;
        }
    }
    
    /**
     * Gets the "reference" element
     */
    public org.hl7.fhir.Uri getReference()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.Uri target = null;
            target = (org.hl7.fhir.Uri)get_store().find_element_user(REFERENCE$4, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "reference" element
     */
    public void setReference(org.hl7.fhir.Uri reference)
    {
        generatedSetterHelperImpl(reference, REFERENCE$4, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "reference" element
     */
    public org.hl7.fhir.Uri addNewReference()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.Uri target = null;
            target = (org.hl7.fhir.Uri)get_store().add_element_user(REFERENCE$4);
            return target;
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
     * Gets the "agent" element
     */
    public org.hl7.fhir.ProvenanceAgent getAgent()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.ProvenanceAgent target = null;
            target = (org.hl7.fhir.ProvenanceAgent)get_store().find_element_user(AGENT$8, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "agent" element
     */
    public boolean isSetAgent()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(AGENT$8) != 0;
        }
    }
    
    /**
     * Sets the "agent" element
     */
    public void setAgent(org.hl7.fhir.ProvenanceAgent agent)
    {
        generatedSetterHelperImpl(agent, AGENT$8, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "agent" element
     */
    public org.hl7.fhir.ProvenanceAgent addNewAgent()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.ProvenanceAgent target = null;
            target = (org.hl7.fhir.ProvenanceAgent)get_store().add_element_user(AGENT$8);
            return target;
        }
    }
    
    /**
     * Unsets the "agent" element
     */
    public void unsetAgent()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(AGENT$8, 0);
        }
    }
}
