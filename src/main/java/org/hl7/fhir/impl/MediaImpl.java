/*
 * XML Type:  Media
 * Namespace: http://hl7.org/fhir
 * Java type: org.hl7.fhir.Media
 *
 * Automatically generated - do not modify.
 */
package org.hl7.fhir.impl;
/**
 * An XML Media(@http://hl7.org/fhir).
 *
 * This is a complex type.
 */
public class MediaImpl extends org.hl7.fhir.impl.ResourceImpl implements org.hl7.fhir.Media
{
    private static final long serialVersionUID = 1L;
    
    public MediaImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName TYPE$0 = 
        new javax.xml.namespace.QName("http://hl7.org/fhir", "type");
    private static final javax.xml.namespace.QName SUBTYPE$2 = 
        new javax.xml.namespace.QName("http://hl7.org/fhir", "subtype");
    private static final javax.xml.namespace.QName IDENTIFIER$4 = 
        new javax.xml.namespace.QName("http://hl7.org/fhir", "identifier");
    private static final javax.xml.namespace.QName DATETIME$6 = 
        new javax.xml.namespace.QName("http://hl7.org/fhir", "dateTime");
    private static final javax.xml.namespace.QName SUBJECT$8 = 
        new javax.xml.namespace.QName("http://hl7.org/fhir", "subject");
    private static final javax.xml.namespace.QName OPERATOR$10 = 
        new javax.xml.namespace.QName("http://hl7.org/fhir", "operator");
    private static final javax.xml.namespace.QName VIEW$12 = 
        new javax.xml.namespace.QName("http://hl7.org/fhir", "view");
    private static final javax.xml.namespace.QName DEVICENAME$14 = 
        new javax.xml.namespace.QName("http://hl7.org/fhir", "deviceName");
    private static final javax.xml.namespace.QName HEIGHT$16 = 
        new javax.xml.namespace.QName("http://hl7.org/fhir", "height");
    private static final javax.xml.namespace.QName WIDTH$18 = 
        new javax.xml.namespace.QName("http://hl7.org/fhir", "width");
    private static final javax.xml.namespace.QName FRAMES$20 = 
        new javax.xml.namespace.QName("http://hl7.org/fhir", "frames");
    private static final javax.xml.namespace.QName LENGTH$22 = 
        new javax.xml.namespace.QName("http://hl7.org/fhir", "length");
    private static final javax.xml.namespace.QName CONTENT$24 = 
        new javax.xml.namespace.QName("http://hl7.org/fhir", "content");
    
    
    /**
     * Gets the "type" element
     */
    public org.hl7.fhir.MediaType getType()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.MediaType target = null;
            target = (org.hl7.fhir.MediaType)get_store().find_element_user(TYPE$0, 0);
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
    public void setType(org.hl7.fhir.MediaType type)
    {
        generatedSetterHelperImpl(type, TYPE$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "type" element
     */
    public org.hl7.fhir.MediaType addNewType()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.MediaType target = null;
            target = (org.hl7.fhir.MediaType)get_store().add_element_user(TYPE$0);
            return target;
        }
    }
    
    /**
     * Gets the "subtype" element
     */
    public org.hl7.fhir.CodeableConcept getSubtype()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.CodeableConcept target = null;
            target = (org.hl7.fhir.CodeableConcept)get_store().find_element_user(SUBTYPE$2, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "subtype" element
     */
    public boolean isSetSubtype()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(SUBTYPE$2) != 0;
        }
    }
    
    /**
     * Sets the "subtype" element
     */
    public void setSubtype(org.hl7.fhir.CodeableConcept subtype)
    {
        generatedSetterHelperImpl(subtype, SUBTYPE$2, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "subtype" element
     */
    public org.hl7.fhir.CodeableConcept addNewSubtype()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.CodeableConcept target = null;
            target = (org.hl7.fhir.CodeableConcept)get_store().add_element_user(SUBTYPE$2);
            return target;
        }
    }
    
    /**
     * Unsets the "subtype" element
     */
    public void unsetSubtype()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(SUBTYPE$2, 0);
        }
    }
    
    /**
     * Gets array of all "identifier" elements
     */
    public org.hl7.fhir.Identifier[] getIdentifierArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(IDENTIFIER$4, targetList);
            org.hl7.fhir.Identifier[] result = new org.hl7.fhir.Identifier[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "identifier" element
     */
    public org.hl7.fhir.Identifier getIdentifierArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.Identifier target = null;
            target = (org.hl7.fhir.Identifier)get_store().find_element_user(IDENTIFIER$4, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "identifier" element
     */
    public int sizeOfIdentifierArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(IDENTIFIER$4);
        }
    }
    
    /**
     * Sets array of all "identifier" element  WARNING: This method is not atomicaly synchronized.
     */
    public void setIdentifierArray(org.hl7.fhir.Identifier[] identifierArray)
    {
        check_orphaned();
        arraySetterHelper(identifierArray, IDENTIFIER$4);
    }
    
    /**
     * Sets ith "identifier" element
     */
    public void setIdentifierArray(int i, org.hl7.fhir.Identifier identifier)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.Identifier target = null;
            target = (org.hl7.fhir.Identifier)get_store().find_element_user(IDENTIFIER$4, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(identifier);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "identifier" element
     */
    public org.hl7.fhir.Identifier insertNewIdentifier(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.Identifier target = null;
            target = (org.hl7.fhir.Identifier)get_store().insert_element_user(IDENTIFIER$4, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "identifier" element
     */
    public org.hl7.fhir.Identifier addNewIdentifier()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.Identifier target = null;
            target = (org.hl7.fhir.Identifier)get_store().add_element_user(IDENTIFIER$4);
            return target;
        }
    }
    
    /**
     * Removes the ith "identifier" element
     */
    public void removeIdentifier(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(IDENTIFIER$4, i);
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
            target = (org.hl7.fhir.DateTime)get_store().find_element_user(DATETIME$6, 0);
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
            return get_store().count_elements(DATETIME$6) != 0;
        }
    }
    
    /**
     * Sets the "dateTime" element
     */
    public void setDateTime(org.hl7.fhir.DateTime dateTime)
    {
        generatedSetterHelperImpl(dateTime, DATETIME$6, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
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
            target = (org.hl7.fhir.DateTime)get_store().add_element_user(DATETIME$6);
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
            get_store().remove_element(DATETIME$6, 0);
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
            target = (org.hl7.fhir.ResourceReference)get_store().find_element_user(SUBJECT$8, 0);
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
            return get_store().count_elements(SUBJECT$8) != 0;
        }
    }
    
    /**
     * Sets the "subject" element
     */
    public void setSubject(org.hl7.fhir.ResourceReference subject)
    {
        generatedSetterHelperImpl(subject, SUBJECT$8, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
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
            target = (org.hl7.fhir.ResourceReference)get_store().add_element_user(SUBJECT$8);
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
            get_store().remove_element(SUBJECT$8, 0);
        }
    }
    
    /**
     * Gets the "operator" element
     */
    public org.hl7.fhir.ResourceReference getOperator()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.ResourceReference target = null;
            target = (org.hl7.fhir.ResourceReference)get_store().find_element_user(OPERATOR$10, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "operator" element
     */
    public boolean isSetOperator()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(OPERATOR$10) != 0;
        }
    }
    
    /**
     * Sets the "operator" element
     */
    public void setOperator(org.hl7.fhir.ResourceReference operator)
    {
        generatedSetterHelperImpl(operator, OPERATOR$10, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "operator" element
     */
    public org.hl7.fhir.ResourceReference addNewOperator()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.ResourceReference target = null;
            target = (org.hl7.fhir.ResourceReference)get_store().add_element_user(OPERATOR$10);
            return target;
        }
    }
    
    /**
     * Unsets the "operator" element
     */
    public void unsetOperator()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(OPERATOR$10, 0);
        }
    }
    
    /**
     * Gets the "view" element
     */
    public org.hl7.fhir.CodeableConcept getView()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.CodeableConcept target = null;
            target = (org.hl7.fhir.CodeableConcept)get_store().find_element_user(VIEW$12, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "view" element
     */
    public boolean isSetView()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(VIEW$12) != 0;
        }
    }
    
    /**
     * Sets the "view" element
     */
    public void setView(org.hl7.fhir.CodeableConcept view)
    {
        generatedSetterHelperImpl(view, VIEW$12, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "view" element
     */
    public org.hl7.fhir.CodeableConcept addNewView()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.CodeableConcept target = null;
            target = (org.hl7.fhir.CodeableConcept)get_store().add_element_user(VIEW$12);
            return target;
        }
    }
    
    /**
     * Unsets the "view" element
     */
    public void unsetView()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(VIEW$12, 0);
        }
    }
    
    /**
     * Gets the "deviceName" element
     */
    public org.hl7.fhir.String getDeviceName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.String target = null;
            target = (org.hl7.fhir.String)get_store().find_element_user(DEVICENAME$14, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "deviceName" element
     */
    public boolean isSetDeviceName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(DEVICENAME$14) != 0;
        }
    }
    
    /**
     * Sets the "deviceName" element
     */
    public void setDeviceName(org.hl7.fhir.String deviceName)
    {
        generatedSetterHelperImpl(deviceName, DEVICENAME$14, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "deviceName" element
     */
    public org.hl7.fhir.String addNewDeviceName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.String target = null;
            target = (org.hl7.fhir.String)get_store().add_element_user(DEVICENAME$14);
            return target;
        }
    }
    
    /**
     * Unsets the "deviceName" element
     */
    public void unsetDeviceName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(DEVICENAME$14, 0);
        }
    }
    
    /**
     * Gets the "height" element
     */
    public org.hl7.fhir.Integer getHeight()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.Integer target = null;
            target = (org.hl7.fhir.Integer)get_store().find_element_user(HEIGHT$16, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "height" element
     */
    public boolean isSetHeight()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(HEIGHT$16) != 0;
        }
    }
    
    /**
     * Sets the "height" element
     */
    public void setHeight(org.hl7.fhir.Integer height)
    {
        generatedSetterHelperImpl(height, HEIGHT$16, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "height" element
     */
    public org.hl7.fhir.Integer addNewHeight()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.Integer target = null;
            target = (org.hl7.fhir.Integer)get_store().add_element_user(HEIGHT$16);
            return target;
        }
    }
    
    /**
     * Unsets the "height" element
     */
    public void unsetHeight()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(HEIGHT$16, 0);
        }
    }
    
    /**
     * Gets the "width" element
     */
    public org.hl7.fhir.Integer getWidth()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.Integer target = null;
            target = (org.hl7.fhir.Integer)get_store().find_element_user(WIDTH$18, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "width" element
     */
    public boolean isSetWidth()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(WIDTH$18) != 0;
        }
    }
    
    /**
     * Sets the "width" element
     */
    public void setWidth(org.hl7.fhir.Integer width)
    {
        generatedSetterHelperImpl(width, WIDTH$18, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "width" element
     */
    public org.hl7.fhir.Integer addNewWidth()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.Integer target = null;
            target = (org.hl7.fhir.Integer)get_store().add_element_user(WIDTH$18);
            return target;
        }
    }
    
    /**
     * Unsets the "width" element
     */
    public void unsetWidth()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(WIDTH$18, 0);
        }
    }
    
    /**
     * Gets the "frames" element
     */
    public org.hl7.fhir.Integer getFrames()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.Integer target = null;
            target = (org.hl7.fhir.Integer)get_store().find_element_user(FRAMES$20, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "frames" element
     */
    public boolean isSetFrames()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(FRAMES$20) != 0;
        }
    }
    
    /**
     * Sets the "frames" element
     */
    public void setFrames(org.hl7.fhir.Integer frames)
    {
        generatedSetterHelperImpl(frames, FRAMES$20, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "frames" element
     */
    public org.hl7.fhir.Integer addNewFrames()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.Integer target = null;
            target = (org.hl7.fhir.Integer)get_store().add_element_user(FRAMES$20);
            return target;
        }
    }
    
    /**
     * Unsets the "frames" element
     */
    public void unsetFrames()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(FRAMES$20, 0);
        }
    }
    
    /**
     * Gets the "length" element
     */
    public org.hl7.fhir.Integer getLength()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.Integer target = null;
            target = (org.hl7.fhir.Integer)get_store().find_element_user(LENGTH$22, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "length" element
     */
    public boolean isSetLength()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(LENGTH$22) != 0;
        }
    }
    
    /**
     * Sets the "length" element
     */
    public void setLength(org.hl7.fhir.Integer length)
    {
        generatedSetterHelperImpl(length, LENGTH$22, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "length" element
     */
    public org.hl7.fhir.Integer addNewLength()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.Integer target = null;
            target = (org.hl7.fhir.Integer)get_store().add_element_user(LENGTH$22);
            return target;
        }
    }
    
    /**
     * Unsets the "length" element
     */
    public void unsetLength()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(LENGTH$22, 0);
        }
    }
    
    /**
     * Gets the "content" element
     */
    public org.hl7.fhir.Attachment getContent()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.Attachment target = null;
            target = (org.hl7.fhir.Attachment)get_store().find_element_user(CONTENT$24, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "content" element
     */
    public void setContent(org.hl7.fhir.Attachment content)
    {
        generatedSetterHelperImpl(content, CONTENT$24, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "content" element
     */
    public org.hl7.fhir.Attachment addNewContent()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.Attachment target = null;
            target = (org.hl7.fhir.Attachment)get_store().add_element_user(CONTENT$24);
            return target;
        }
    }
}
