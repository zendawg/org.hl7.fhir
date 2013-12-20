/*
 * An XML document type.
 * Localname: param
 * Namespace: http://www.w3.org/1999/xhtml
 * Java type: org.w3.x1999.xhtml.ParamDocument
 *
 * Automatically generated - do not modify.
 */
package org.w3.x1999.xhtml.impl;
/**
 * A document containing one param(@http://www.w3.org/1999/xhtml) element.
 *
 * This is a complex type.
 */
public class ParamDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.w3.x1999.xhtml.ParamDocument
{
    private static final long serialVersionUID = 1L;
    
    public ParamDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName PARAM$0 = 
        new javax.xml.namespace.QName("http://www.w3.org/1999/xhtml", "param");
    
    
    /**
     * Gets the "param" element
     */
    public org.w3.x1999.xhtml.ParamDocument.Param getParam()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.w3.x1999.xhtml.ParamDocument.Param target = null;
            target = (org.w3.x1999.xhtml.ParamDocument.Param)get_store().find_element_user(PARAM$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "param" element
     */
    public void setParam(org.w3.x1999.xhtml.ParamDocument.Param param)
    {
        generatedSetterHelperImpl(param, PARAM$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "param" element
     */
    public org.w3.x1999.xhtml.ParamDocument.Param addNewParam()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.w3.x1999.xhtml.ParamDocument.Param target = null;
            target = (org.w3.x1999.xhtml.ParamDocument.Param)get_store().add_element_user(PARAM$0);
            return target;
        }
    }
    /**
     * An XML param(@http://www.w3.org/1999/xhtml).
     *
     * This is a complex type.
     */
    public static class ParamImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.w3.x1999.xhtml.ParamDocument.Param
    {
        private static final long serialVersionUID = 1L;
        
        public ParamImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName ID$0 = 
            new javax.xml.namespace.QName("", "id");
        private static final javax.xml.namespace.QName NAME$2 = 
            new javax.xml.namespace.QName("", "name");
        private static final javax.xml.namespace.QName VALUE$4 = 
            new javax.xml.namespace.QName("", "value");
        private static final javax.xml.namespace.QName VALUETYPE$6 = 
            new javax.xml.namespace.QName("", "valuetype");
        private static final javax.xml.namespace.QName TYPE$8 = 
            new javax.xml.namespace.QName("", "type");
        
        
        /**
         * Gets the "id" attribute
         */
        public java.lang.String getId()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(ID$0);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "id" attribute
         */
        public org.apache.xmlbeans.XmlID xgetId()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlID target = null;
                target = (org.apache.xmlbeans.XmlID)get_store().find_attribute_user(ID$0);
                return target;
            }
        }
        
        /**
         * True if has "id" attribute
         */
        public boolean isSetId()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().find_attribute_user(ID$0) != null;
            }
        }
        
        /**
         * Sets the "id" attribute
         */
        public void setId(java.lang.String id)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(ID$0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(ID$0);
                }
                target.setStringValue(id);
            }
        }
        
        /**
         * Sets (as xml) the "id" attribute
         */
        public void xsetId(org.apache.xmlbeans.XmlID id)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlID target = null;
                target = (org.apache.xmlbeans.XmlID)get_store().find_attribute_user(ID$0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlID)get_store().add_attribute_user(ID$0);
                }
                target.set(id);
            }
        }
        
        /**
         * Unsets the "id" attribute
         */
        public void unsetId()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_attribute(ID$0);
            }
        }
        
        /**
         * Gets the "name" attribute
         */
        public org.apache.xmlbeans.XmlAnySimpleType getName()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlAnySimpleType target = null;
                target = (org.apache.xmlbeans.XmlAnySimpleType)get_store().find_attribute_user(NAME$2);
                if (target == null)
                {
                    return null;
                }
                return target;
            }
        }
        
        /**
         * True if has "name" attribute
         */
        public boolean isSetName()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().find_attribute_user(NAME$2) != null;
            }
        }
        
        /**
         * Sets the "name" attribute
         */
        public void setName(org.apache.xmlbeans.XmlAnySimpleType name)
        {
            generatedSetterHelperImpl(name, NAME$2, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
        }
        
        /**
         * Appends and returns a new empty "name" attribute
         */
        public org.apache.xmlbeans.XmlAnySimpleType addNewName()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlAnySimpleType target = null;
                target = (org.apache.xmlbeans.XmlAnySimpleType)get_store().add_attribute_user(NAME$2);
                return target;
            }
        }
        
        /**
         * Unsets the "name" attribute
         */
        public void unsetName()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_attribute(NAME$2);
            }
        }
        
        /**
         * Gets the "value" attribute
         */
        public org.apache.xmlbeans.XmlAnySimpleType getValue()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlAnySimpleType target = null;
                target = (org.apache.xmlbeans.XmlAnySimpleType)get_store().find_attribute_user(VALUE$4);
                if (target == null)
                {
                    return null;
                }
                return target;
            }
        }
        
        /**
         * True if has "value" attribute
         */
        public boolean isSetValue()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().find_attribute_user(VALUE$4) != null;
            }
        }
        
        /**
         * Sets the "value" attribute
         */
        public void setValue(org.apache.xmlbeans.XmlAnySimpleType value)
        {
            generatedSetterHelperImpl(value, VALUE$4, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
        }
        
        /**
         * Appends and returns a new empty "value" attribute
         */
        public org.apache.xmlbeans.XmlAnySimpleType addNewValue()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlAnySimpleType target = null;
                target = (org.apache.xmlbeans.XmlAnySimpleType)get_store().add_attribute_user(VALUE$4);
                return target;
            }
        }
        
        /**
         * Unsets the "value" attribute
         */
        public void unsetValue()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_attribute(VALUE$4);
            }
        }
        
        /**
         * Gets the "valuetype" attribute
         */
        public org.w3.x1999.xhtml.ParamDocument.Param.Valuetype.Enum getValuetype()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(VALUETYPE$6);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_default_attribute_value(VALUETYPE$6);
                }
                if (target == null)
                {
                    return null;
                }
                return (org.w3.x1999.xhtml.ParamDocument.Param.Valuetype.Enum)target.getEnumValue();
            }
        }
        
        /**
         * Gets (as xml) the "valuetype" attribute
         */
        public org.w3.x1999.xhtml.ParamDocument.Param.Valuetype xgetValuetype()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.w3.x1999.xhtml.ParamDocument.Param.Valuetype target = null;
                target = (org.w3.x1999.xhtml.ParamDocument.Param.Valuetype)get_store().find_attribute_user(VALUETYPE$6);
                if (target == null)
                {
                    target = (org.w3.x1999.xhtml.ParamDocument.Param.Valuetype)get_default_attribute_value(VALUETYPE$6);
                }
                return target;
            }
        }
        
        /**
         * True if has "valuetype" attribute
         */
        public boolean isSetValuetype()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().find_attribute_user(VALUETYPE$6) != null;
            }
        }
        
        /**
         * Sets the "valuetype" attribute
         */
        public void setValuetype(org.w3.x1999.xhtml.ParamDocument.Param.Valuetype.Enum valuetype)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(VALUETYPE$6);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(VALUETYPE$6);
                }
                target.setEnumValue(valuetype);
            }
        }
        
        /**
         * Sets (as xml) the "valuetype" attribute
         */
        public void xsetValuetype(org.w3.x1999.xhtml.ParamDocument.Param.Valuetype valuetype)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.w3.x1999.xhtml.ParamDocument.Param.Valuetype target = null;
                target = (org.w3.x1999.xhtml.ParamDocument.Param.Valuetype)get_store().find_attribute_user(VALUETYPE$6);
                if (target == null)
                {
                    target = (org.w3.x1999.xhtml.ParamDocument.Param.Valuetype)get_store().add_attribute_user(VALUETYPE$6);
                }
                target.set(valuetype);
            }
        }
        
        /**
         * Unsets the "valuetype" attribute
         */
        public void unsetValuetype()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_attribute(VALUETYPE$6);
            }
        }
        
        /**
         * Gets the "type" attribute
         */
        public java.lang.String getType()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(TYPE$8);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "type" attribute
         */
        public org.w3.x1999.xhtml.ContentType xgetType()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.w3.x1999.xhtml.ContentType target = null;
                target = (org.w3.x1999.xhtml.ContentType)get_store().find_attribute_user(TYPE$8);
                return target;
            }
        }
        
        /**
         * True if has "type" attribute
         */
        public boolean isSetType()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().find_attribute_user(TYPE$8) != null;
            }
        }
        
        /**
         * Sets the "type" attribute
         */
        public void setType(java.lang.String type)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(TYPE$8);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(TYPE$8);
                }
                target.setStringValue(type);
            }
        }
        
        /**
         * Sets (as xml) the "type" attribute
         */
        public void xsetType(org.w3.x1999.xhtml.ContentType type)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.w3.x1999.xhtml.ContentType target = null;
                target = (org.w3.x1999.xhtml.ContentType)get_store().find_attribute_user(TYPE$8);
                if (target == null)
                {
                    target = (org.w3.x1999.xhtml.ContentType)get_store().add_attribute_user(TYPE$8);
                }
                target.set(type);
            }
        }
        
        /**
         * Unsets the "type" attribute
         */
        public void unsetType()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_attribute(TYPE$8);
            }
        }
        /**
         * An XML valuetype(@).
         *
         * This is an atomic type that is a restriction of org.w3.x1999.xhtml.ParamDocument$Param$Valuetype.
         */
        public static class ValuetypeImpl extends org.apache.xmlbeans.impl.values.JavaStringEnumerationHolderEx implements org.w3.x1999.xhtml.ParamDocument.Param.Valuetype
        {
            private static final long serialVersionUID = 1L;
            
            public ValuetypeImpl(org.apache.xmlbeans.SchemaType sType)
            {
                super(sType, false);
            }
            
            protected ValuetypeImpl(org.apache.xmlbeans.SchemaType sType, boolean b)
            {
                super(sType, b);
            }
        }
    }
}
