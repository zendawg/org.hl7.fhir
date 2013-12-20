/*
 * An XML document type.
 * Localname: Group
 * Namespace: http://hl7.org/fhir
 * Java type: org.hl7.fhir.GroupDocument
 *
 * Automatically generated - do not modify.
 */
package org.hl7.fhir.impl;
/**
 * A document containing one Group(@http://hl7.org/fhir) element.
 *
 * This is a complex type.
 */
public class GroupDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.hl7.fhir.GroupDocument
{
    private static final long serialVersionUID = 1L;
    
    public GroupDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName GROUP$0 = 
        new javax.xml.namespace.QName("http://hl7.org/fhir", "Group");
    
    
    /**
     * Gets the "Group" element
     */
    public org.hl7.fhir.Group getGroup()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.Group target = null;
            target = (org.hl7.fhir.Group)get_store().find_element_user(GROUP$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "Group" element
     */
    public void setGroup(org.hl7.fhir.Group group)
    {
        generatedSetterHelperImpl(group, GROUP$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "Group" element
     */
    public org.hl7.fhir.Group addNewGroup()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.Group target = null;
            target = (org.hl7.fhir.Group)get_store().add_element_user(GROUP$0);
            return target;
        }
    }
}
