/*
 * An XML document type.
 * Localname: script
 * Namespace: http://www.w3.org/1999/xhtml
 * Java type: org.w3.x1999.xhtml.ScriptDocument
 *
 * Automatically generated - do not modify.
 */
package org.w3.x1999.xhtml.impl;
/**
 * A document containing one script(@http://www.w3.org/1999/xhtml) element.
 *
 * This is a complex type.
 */
public class ScriptDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.w3.x1999.xhtml.ScriptDocument
{
    private static final long serialVersionUID = 1L;
    
    public ScriptDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName SCRIPT$0 = 
        new javax.xml.namespace.QName("http://www.w3.org/1999/xhtml", "script");
    
    
    /**
     * Gets the "script" element
     */
    public org.w3.x1999.xhtml.ScriptDocument.Script getScript()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.w3.x1999.xhtml.ScriptDocument.Script target = null;
            target = (org.w3.x1999.xhtml.ScriptDocument.Script)get_store().find_element_user(SCRIPT$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "script" element
     */
    public void setScript(org.w3.x1999.xhtml.ScriptDocument.Script script)
    {
        generatedSetterHelperImpl(script, SCRIPT$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "script" element
     */
    public org.w3.x1999.xhtml.ScriptDocument.Script addNewScript()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.w3.x1999.xhtml.ScriptDocument.Script target = null;
            target = (org.w3.x1999.xhtml.ScriptDocument.Script)get_store().add_element_user(SCRIPT$0);
            return target;
        }
    }
    /**
     * An XML script(@http://www.w3.org/1999/xhtml).
     *
     * This is a complex type.
     */
    public static class ScriptImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.w3.x1999.xhtml.ScriptDocument.Script
    {
        private static final long serialVersionUID = 1L;
        
        public ScriptImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName ID$0 = 
            new javax.xml.namespace.QName("", "id");
        private static final javax.xml.namespace.QName CHARSET$2 = 
            new javax.xml.namespace.QName("", "charset");
        private static final javax.xml.namespace.QName TYPE$4 = 
            new javax.xml.namespace.QName("", "type");
        private static final javax.xml.namespace.QName SRC$6 = 
            new javax.xml.namespace.QName("", "src");
        private static final javax.xml.namespace.QName DEFER$8 = 
            new javax.xml.namespace.QName("", "defer");
        private static final javax.xml.namespace.QName SPACE$10 = 
            new javax.xml.namespace.QName("http://www.w3.org/XML/1998/namespace", "space");
        
        
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
         * Gets the "charset" attribute
         */
        public java.lang.String getCharset()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(CHARSET$2);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "charset" attribute
         */
        public org.w3.x1999.xhtml.Charset xgetCharset()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.w3.x1999.xhtml.Charset target = null;
                target = (org.w3.x1999.xhtml.Charset)get_store().find_attribute_user(CHARSET$2);
                return target;
            }
        }
        
        /**
         * True if has "charset" attribute
         */
        public boolean isSetCharset()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().find_attribute_user(CHARSET$2) != null;
            }
        }
        
        /**
         * Sets the "charset" attribute
         */
        public void setCharset(java.lang.String charset)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(CHARSET$2);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(CHARSET$2);
                }
                target.setStringValue(charset);
            }
        }
        
        /**
         * Sets (as xml) the "charset" attribute
         */
        public void xsetCharset(org.w3.x1999.xhtml.Charset charset)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.w3.x1999.xhtml.Charset target = null;
                target = (org.w3.x1999.xhtml.Charset)get_store().find_attribute_user(CHARSET$2);
                if (target == null)
                {
                    target = (org.w3.x1999.xhtml.Charset)get_store().add_attribute_user(CHARSET$2);
                }
                target.set(charset);
            }
        }
        
        /**
         * Unsets the "charset" attribute
         */
        public void unsetCharset()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_attribute(CHARSET$2);
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
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(TYPE$4);
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
                target = (org.w3.x1999.xhtml.ContentType)get_store().find_attribute_user(TYPE$4);
                return target;
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
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(TYPE$4);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(TYPE$4);
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
                target = (org.w3.x1999.xhtml.ContentType)get_store().find_attribute_user(TYPE$4);
                if (target == null)
                {
                    target = (org.w3.x1999.xhtml.ContentType)get_store().add_attribute_user(TYPE$4);
                }
                target.set(type);
            }
        }
        
        /**
         * Gets the "src" attribute
         */
        public java.lang.String getSrc()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(SRC$6);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "src" attribute
         */
        public org.w3.x1999.xhtml.URI xgetSrc()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.w3.x1999.xhtml.URI target = null;
                target = (org.w3.x1999.xhtml.URI)get_store().find_attribute_user(SRC$6);
                return target;
            }
        }
        
        /**
         * True if has "src" attribute
         */
        public boolean isSetSrc()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().find_attribute_user(SRC$6) != null;
            }
        }
        
        /**
         * Sets the "src" attribute
         */
        public void setSrc(java.lang.String src)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(SRC$6);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(SRC$6);
                }
                target.setStringValue(src);
            }
        }
        
        /**
         * Sets (as xml) the "src" attribute
         */
        public void xsetSrc(org.w3.x1999.xhtml.URI src)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.w3.x1999.xhtml.URI target = null;
                target = (org.w3.x1999.xhtml.URI)get_store().find_attribute_user(SRC$6);
                if (target == null)
                {
                    target = (org.w3.x1999.xhtml.URI)get_store().add_attribute_user(SRC$6);
                }
                target.set(src);
            }
        }
        
        /**
         * Unsets the "src" attribute
         */
        public void unsetSrc()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_attribute(SRC$6);
            }
        }
        
        /**
         * Gets the "defer" attribute
         */
        public org.w3.x1999.xhtml.ScriptDocument.Script.Defer.Enum getDefer()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(DEFER$8);
                if (target == null)
                {
                    return null;
                }
                return (org.w3.x1999.xhtml.ScriptDocument.Script.Defer.Enum)target.getEnumValue();
            }
        }
        
        /**
         * Gets (as xml) the "defer" attribute
         */
        public org.w3.x1999.xhtml.ScriptDocument.Script.Defer xgetDefer()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.w3.x1999.xhtml.ScriptDocument.Script.Defer target = null;
                target = (org.w3.x1999.xhtml.ScriptDocument.Script.Defer)get_store().find_attribute_user(DEFER$8);
                return target;
            }
        }
        
        /**
         * True if has "defer" attribute
         */
        public boolean isSetDefer()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().find_attribute_user(DEFER$8) != null;
            }
        }
        
        /**
         * Sets the "defer" attribute
         */
        public void setDefer(org.w3.x1999.xhtml.ScriptDocument.Script.Defer.Enum defer)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(DEFER$8);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(DEFER$8);
                }
                target.setEnumValue(defer);
            }
        }
        
        /**
         * Sets (as xml) the "defer" attribute
         */
        public void xsetDefer(org.w3.x1999.xhtml.ScriptDocument.Script.Defer defer)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.w3.x1999.xhtml.ScriptDocument.Script.Defer target = null;
                target = (org.w3.x1999.xhtml.ScriptDocument.Script.Defer)get_store().find_attribute_user(DEFER$8);
                if (target == null)
                {
                    target = (org.w3.x1999.xhtml.ScriptDocument.Script.Defer)get_store().add_attribute_user(DEFER$8);
                }
                target.set(defer);
            }
        }
        
        /**
         * Unsets the "defer" attribute
         */
        public void unsetDefer()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_attribute(DEFER$8);
            }
        }
        
        /**
         * Gets the "space" attribute
         */
        public org.apache.xmlbeans.impl.xb.xmlschema.SpaceAttribute.Space.Enum getSpace()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(SPACE$10);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_default_attribute_value(SPACE$10);
                }
                if (target == null)
                {
                    return null;
                }
                return (org.apache.xmlbeans.impl.xb.xmlschema.SpaceAttribute.Space.Enum)target.getEnumValue();
            }
        }
        
        /**
         * Gets (as xml) the "space" attribute
         */
        public org.apache.xmlbeans.impl.xb.xmlschema.SpaceAttribute.Space xgetSpace()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.impl.xb.xmlschema.SpaceAttribute.Space target = null;
                target = (org.apache.xmlbeans.impl.xb.xmlschema.SpaceAttribute.Space)get_store().find_attribute_user(SPACE$10);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.impl.xb.xmlschema.SpaceAttribute.Space)get_default_attribute_value(SPACE$10);
                }
                return target;
            }
        }
        
        /**
         * True if has "space" attribute
         */
        public boolean isSetSpace()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().find_attribute_user(SPACE$10) != null;
            }
        }
        
        /**
         * Sets the "space" attribute
         */
        public void setSpace(org.apache.xmlbeans.impl.xb.xmlschema.SpaceAttribute.Space.Enum space)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(SPACE$10);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(SPACE$10);
                }
                target.setEnumValue(space);
            }
        }
        
        /**
         * Sets (as xml) the "space" attribute
         */
        public void xsetSpace(org.apache.xmlbeans.impl.xb.xmlschema.SpaceAttribute.Space space)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.impl.xb.xmlschema.SpaceAttribute.Space target = null;
                target = (org.apache.xmlbeans.impl.xb.xmlschema.SpaceAttribute.Space)get_store().find_attribute_user(SPACE$10);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.impl.xb.xmlschema.SpaceAttribute.Space)get_store().add_attribute_user(SPACE$10);
                }
                target.set(space);
            }
        }
        
        /**
         * Unsets the "space" attribute
         */
        public void unsetSpace()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_attribute(SPACE$10);
            }
        }
        /**
         * An XML defer(@).
         *
         * This is an atomic type that is a restriction of org.w3.x1999.xhtml.ScriptDocument$Script$Defer.
         */
        public static class DeferImpl extends org.apache.xmlbeans.impl.values.JavaStringEnumerationHolderEx implements org.w3.x1999.xhtml.ScriptDocument.Script.Defer
        {
            private static final long serialVersionUID = 1L;
            
            public DeferImpl(org.apache.xmlbeans.SchemaType sType)
            {
                super(sType, false);
            }
            
            protected DeferImpl(org.apache.xmlbeans.SchemaType sType, boolean b)
            {
                super(sType, b);
            }
        }
    }
}
