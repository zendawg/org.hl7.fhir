/*
 * XML Type:  Profile.Element
 * Namespace: http://hl7.org/fhir
 * Java type: org.hl7.fhir.ProfileElement
 *
 * Automatically generated - do not modify.
 */
package org.hl7.fhir.impl;
/**
 * An XML Profile.Element(@http://hl7.org/fhir).
 *
 * This is a complex type.
 */
public class ProfileElementImpl extends org.hl7.fhir.impl.BackboneElementImpl implements org.hl7.fhir.ProfileElement
{
    private static final long serialVersionUID = 1L;
    
    public ProfileElementImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName PATH$0 = 
        new javax.xml.namespace.QName("http://hl7.org/fhir", "path");
    private static final javax.xml.namespace.QName REPRESENTATION$2 = 
        new javax.xml.namespace.QName("http://hl7.org/fhir", "representation");
    private static final javax.xml.namespace.QName NAME$4 = 
        new javax.xml.namespace.QName("http://hl7.org/fhir", "name");
    private static final javax.xml.namespace.QName SLICING$6 = 
        new javax.xml.namespace.QName("http://hl7.org/fhir", "slicing");
    private static final javax.xml.namespace.QName DEFINITION$8 = 
        new javax.xml.namespace.QName("http://hl7.org/fhir", "definition");
    
    
    /**
     * Gets the "path" element
     */
    public org.hl7.fhir.String getPath()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.String target = null;
            target = (org.hl7.fhir.String)get_store().find_element_user(PATH$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "path" element
     */
    public void setPath(org.hl7.fhir.String path)
    {
        generatedSetterHelperImpl(path, PATH$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "path" element
     */
    public org.hl7.fhir.String addNewPath()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.String target = null;
            target = (org.hl7.fhir.String)get_store().add_element_user(PATH$0);
            return target;
        }
    }
    
    /**
     * Gets array of all "representation" elements
     */
    public org.hl7.fhir.PropertyRepresentation[] getRepresentationArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(REPRESENTATION$2, targetList);
            org.hl7.fhir.PropertyRepresentation[] result = new org.hl7.fhir.PropertyRepresentation[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "representation" element
     */
    public org.hl7.fhir.PropertyRepresentation getRepresentationArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.PropertyRepresentation target = null;
            target = (org.hl7.fhir.PropertyRepresentation)get_store().find_element_user(REPRESENTATION$2, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "representation" element
     */
    public int sizeOfRepresentationArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(REPRESENTATION$2);
        }
    }
    
    /**
     * Sets array of all "representation" element  WARNING: This method is not atomicaly synchronized.
     */
    public void setRepresentationArray(org.hl7.fhir.PropertyRepresentation[] representationArray)
    {
        check_orphaned();
        arraySetterHelper(representationArray, REPRESENTATION$2);
    }
    
    /**
     * Sets ith "representation" element
     */
    public void setRepresentationArray(int i, org.hl7.fhir.PropertyRepresentation representation)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.PropertyRepresentation target = null;
            target = (org.hl7.fhir.PropertyRepresentation)get_store().find_element_user(REPRESENTATION$2, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(representation);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "representation" element
     */
    public org.hl7.fhir.PropertyRepresentation insertNewRepresentation(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.PropertyRepresentation target = null;
            target = (org.hl7.fhir.PropertyRepresentation)get_store().insert_element_user(REPRESENTATION$2, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "representation" element
     */
    public org.hl7.fhir.PropertyRepresentation addNewRepresentation()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.PropertyRepresentation target = null;
            target = (org.hl7.fhir.PropertyRepresentation)get_store().add_element_user(REPRESENTATION$2);
            return target;
        }
    }
    
    /**
     * Removes the ith "representation" element
     */
    public void removeRepresentation(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(REPRESENTATION$2, i);
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
            target = (org.hl7.fhir.String)get_store().find_element_user(NAME$4, 0);
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
            return get_store().count_elements(NAME$4) != 0;
        }
    }
    
    /**
     * Sets the "name" element
     */
    public void setName(org.hl7.fhir.String name)
    {
        generatedSetterHelperImpl(name, NAME$4, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
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
            target = (org.hl7.fhir.String)get_store().add_element_user(NAME$4);
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
            get_store().remove_element(NAME$4, 0);
        }
    }
    
    /**
     * Gets the "slicing" element
     */
    public org.hl7.fhir.ProfileSlicing getSlicing()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.ProfileSlicing target = null;
            target = (org.hl7.fhir.ProfileSlicing)get_store().find_element_user(SLICING$6, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "slicing" element
     */
    public boolean isSetSlicing()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(SLICING$6) != 0;
        }
    }
    
    /**
     * Sets the "slicing" element
     */
    public void setSlicing(org.hl7.fhir.ProfileSlicing slicing)
    {
        generatedSetterHelperImpl(slicing, SLICING$6, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "slicing" element
     */
    public org.hl7.fhir.ProfileSlicing addNewSlicing()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.ProfileSlicing target = null;
            target = (org.hl7.fhir.ProfileSlicing)get_store().add_element_user(SLICING$6);
            return target;
        }
    }
    
    /**
     * Unsets the "slicing" element
     */
    public void unsetSlicing()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(SLICING$6, 0);
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
     * True if has "definition" element
     */
    public boolean isSetDefinition()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(DEFINITION$8) != 0;
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
    
    /**
     * Unsets the "definition" element
     */
    public void unsetDefinition()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(DEFINITION$8, 0);
        }
    }
}
