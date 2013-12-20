/*
 * XML Type:  Profile.ExtensionDefn
 * Namespace: http://hl7.org/fhir
 * Java type: org.hl7.fhir.ProfileExtensionDefn
 *
 * Automatically generated - do not modify.
 */
package org.hl7.fhir.impl;
/**
 * An XML Profile.ExtensionDefn(@http://hl7.org/fhir).
 *
 * This is a complex type.
 */
public class ProfileExtensionDefnImpl extends org.hl7.fhir.impl.BackboneElementImpl implements org.hl7.fhir.ProfileExtensionDefn
{
    private static final long serialVersionUID = 1L;
    
    public ProfileExtensionDefnImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName CODE$0 = 
        new javax.xml.namespace.QName("http://hl7.org/fhir", "code");
    private static final javax.xml.namespace.QName DISPLAY$2 = 
        new javax.xml.namespace.QName("http://hl7.org/fhir", "display");
    private static final javax.xml.namespace.QName CONTEXTTYPE$4 = 
        new javax.xml.namespace.QName("http://hl7.org/fhir", "contextType");
    private static final javax.xml.namespace.QName CONTEXT$6 = 
        new javax.xml.namespace.QName("http://hl7.org/fhir", "context");
    private static final javax.xml.namespace.QName DEFINITION$8 = 
        new javax.xml.namespace.QName("http://hl7.org/fhir", "definition");
    
    
    /**
     * Gets the "code" element
     */
    public org.hl7.fhir.Code getCode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.Code target = null;
            target = (org.hl7.fhir.Code)get_store().find_element_user(CODE$0, 0);
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
    public void setCode(org.hl7.fhir.Code code)
    {
        generatedSetterHelperImpl(code, CODE$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
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
            target = (org.hl7.fhir.Code)get_store().add_element_user(CODE$0);
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
            target = (org.hl7.fhir.String)get_store().find_element_user(DISPLAY$2, 0);
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
            return get_store().count_elements(DISPLAY$2) != 0;
        }
    }
    
    /**
     * Sets the "display" element
     */
    public void setDisplay(org.hl7.fhir.String display)
    {
        generatedSetterHelperImpl(display, DISPLAY$2, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
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
            target = (org.hl7.fhir.String)get_store().add_element_user(DISPLAY$2);
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
            get_store().remove_element(DISPLAY$2, 0);
        }
    }
    
    /**
     * Gets the "contextType" element
     */
    public org.hl7.fhir.ExtensionContext getContextType()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.ExtensionContext target = null;
            target = (org.hl7.fhir.ExtensionContext)get_store().find_element_user(CONTEXTTYPE$4, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "contextType" element
     */
    public void setContextType(org.hl7.fhir.ExtensionContext contextType)
    {
        generatedSetterHelperImpl(contextType, CONTEXTTYPE$4, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "contextType" element
     */
    public org.hl7.fhir.ExtensionContext addNewContextType()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.ExtensionContext target = null;
            target = (org.hl7.fhir.ExtensionContext)get_store().add_element_user(CONTEXTTYPE$4);
            return target;
        }
    }
    
    /**
     * Gets array of all "context" elements
     */
    public org.hl7.fhir.String[] getContextArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(CONTEXT$6, targetList);
            org.hl7.fhir.String[] result = new org.hl7.fhir.String[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "context" element
     */
    public org.hl7.fhir.String getContextArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.String target = null;
            target = (org.hl7.fhir.String)get_store().find_element_user(CONTEXT$6, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "context" element
     */
    public int sizeOfContextArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(CONTEXT$6);
        }
    }
    
    /**
     * Sets array of all "context" element  WARNING: This method is not atomicaly synchronized.
     */
    public void setContextArray(org.hl7.fhir.String[] contextArray)
    {
        check_orphaned();
        arraySetterHelper(contextArray, CONTEXT$6);
    }
    
    /**
     * Sets ith "context" element
     */
    public void setContextArray(int i, org.hl7.fhir.String context)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.String target = null;
            target = (org.hl7.fhir.String)get_store().find_element_user(CONTEXT$6, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(context);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "context" element
     */
    public org.hl7.fhir.String insertNewContext(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.String target = null;
            target = (org.hl7.fhir.String)get_store().insert_element_user(CONTEXT$6, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "context" element
     */
    public org.hl7.fhir.String addNewContext()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.String target = null;
            target = (org.hl7.fhir.String)get_store().add_element_user(CONTEXT$6);
            return target;
        }
    }
    
    /**
     * Removes the ith "context" element
     */
    public void removeContext(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(CONTEXT$6, i);
        }
    }
    
    /**
     * Gets the "definition" element
     */
    public org.hl7.fhir.ProfileDefinition getDefinition()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.ProfileDefinition target = null;
            target = (org.hl7.fhir.ProfileDefinition)get_store().find_element_user(DEFINITION$8, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "definition" element
     */
    public void setDefinition(org.hl7.fhir.ProfileDefinition definition)
    {
        generatedSetterHelperImpl(definition, DEFINITION$8, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "definition" element
     */
    public org.hl7.fhir.ProfileDefinition addNewDefinition()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.ProfileDefinition target = null;
            target = (org.hl7.fhir.ProfileDefinition)get_store().add_element_user(DEFINITION$8);
            return target;
        }
    }
}
