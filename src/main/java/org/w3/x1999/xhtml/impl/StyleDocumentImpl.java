/*
 * An XML document type.
 * Localname: style
 * Namespace: http://www.w3.org/1999/xhtml
 * Java type: org.w3.x1999.xhtml.StyleDocument
 *
 * Automatically generated - do not modify.
 */
package org.w3.x1999.xhtml.impl;
/**
 * A document containing one style(@http://www.w3.org/1999/xhtml) element.
 *
 * This is a complex type.
 */
public class StyleDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.w3.x1999.xhtml.StyleDocument
{
    private static final long serialVersionUID = 1L;
    
    public StyleDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName STYLE$0 = 
        new javax.xml.namespace.QName("http://www.w3.org/1999/xhtml", "style");
    
    
    /**
     * Gets the "style" element
     */
    public org.w3.x1999.xhtml.StyleDocument.Style getStyle()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.w3.x1999.xhtml.StyleDocument.Style target = null;
            target = (org.w3.x1999.xhtml.StyleDocument.Style)get_store().find_element_user(STYLE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "style" element
     */
    public void setStyle(org.w3.x1999.xhtml.StyleDocument.Style style)
    {
        generatedSetterHelperImpl(style, STYLE$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "style" element
     */
    public org.w3.x1999.xhtml.StyleDocument.Style addNewStyle()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.w3.x1999.xhtml.StyleDocument.Style target = null;
            target = (org.w3.x1999.xhtml.StyleDocument.Style)get_store().add_element_user(STYLE$0);
            return target;
        }
    }
    /**
     * An XML style(@http://www.w3.org/1999/xhtml).
     *
     * This is a complex type.
     */
    public static class StyleImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.w3.x1999.xhtml.StyleDocument.Style
    {
        private static final long serialVersionUID = 1L;
        
        public StyleImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName LANG$0 = 
            new javax.xml.namespace.QName("", "lang");
        private static final javax.xml.namespace.QName LANG2$2 = 
            new javax.xml.namespace.QName("http://www.w3.org/XML/1998/namespace", "lang");
        private static final javax.xml.namespace.QName DIR$4 = 
            new javax.xml.namespace.QName("", "dir");
        private static final javax.xml.namespace.QName ID$6 = 
            new javax.xml.namespace.QName("", "id");
        private static final javax.xml.namespace.QName TYPE$8 = 
            new javax.xml.namespace.QName("", "type");
        private static final javax.xml.namespace.QName MEDIA$10 = 
            new javax.xml.namespace.QName("", "media");
        private static final javax.xml.namespace.QName TITLE$12 = 
            new javax.xml.namespace.QName("", "title");
        private static final javax.xml.namespace.QName SPACE$14 = 
            new javax.xml.namespace.QName("http://www.w3.org/XML/1998/namespace", "space");
        
        
        /**
         * Gets the "lang" attribute
         */
        public java.lang.String getLang()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(LANG$0);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "lang" attribute
         */
        public org.w3.x1999.xhtml.LanguageCode xgetLang()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.w3.x1999.xhtml.LanguageCode target = null;
                target = (org.w3.x1999.xhtml.LanguageCode)get_store().find_attribute_user(LANG$0);
                return target;
            }
        }
        
        /**
         * True if has "lang" attribute
         */
        public boolean isSetLang()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().find_attribute_user(LANG$0) != null;
            }
        }
        
        /**
         * Sets the "lang" attribute
         */
        public void setLang(java.lang.String lang)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(LANG$0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(LANG$0);
                }
                target.setStringValue(lang);
            }
        }
        
        /**
         * Sets (as xml) the "lang" attribute
         */
        public void xsetLang(org.w3.x1999.xhtml.LanguageCode lang)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.w3.x1999.xhtml.LanguageCode target = null;
                target = (org.w3.x1999.xhtml.LanguageCode)get_store().find_attribute_user(LANG$0);
                if (target == null)
                {
                    target = (org.w3.x1999.xhtml.LanguageCode)get_store().add_attribute_user(LANG$0);
                }
                target.set(lang);
            }
        }
        
        /**
         * Unsets the "lang" attribute
         */
        public void unsetLang()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_attribute(LANG$0);
            }
        }
        
        /**
         * Gets the "lang" attribute
         */
        public java.lang.String getLang2()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(LANG2$2);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "lang" attribute
         */
        public org.apache.xmlbeans.XmlLanguage xgetLang2()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlLanguage target = null;
                target = (org.apache.xmlbeans.XmlLanguage)get_store().find_attribute_user(LANG2$2);
                return target;
            }
        }
        
        /**
         * True if has "lang" attribute
         */
        public boolean isSetLang2()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().find_attribute_user(LANG2$2) != null;
            }
        }
        
        /**
         * Sets the "lang" attribute
         */
        public void setLang2(java.lang.String lang2)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(LANG2$2);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(LANG2$2);
                }
                target.setStringValue(lang2);
            }
        }
        
        /**
         * Sets (as xml) the "lang" attribute
         */
        public void xsetLang2(org.apache.xmlbeans.XmlLanguage lang2)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlLanguage target = null;
                target = (org.apache.xmlbeans.XmlLanguage)get_store().find_attribute_user(LANG2$2);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlLanguage)get_store().add_attribute_user(LANG2$2);
                }
                target.set(lang2);
            }
        }
        
        /**
         * Unsets the "lang" attribute
         */
        public void unsetLang2()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_attribute(LANG2$2);
            }
        }
        
        /**
         * Gets the "dir" attribute
         */
        public org.w3.x1999.xhtml.StyleDocument.Style.Dir.Enum getDir()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(DIR$4);
                if (target == null)
                {
                    return null;
                }
                return (org.w3.x1999.xhtml.StyleDocument.Style.Dir.Enum)target.getEnumValue();
            }
        }
        
        /**
         * Gets (as xml) the "dir" attribute
         */
        public org.w3.x1999.xhtml.StyleDocument.Style.Dir xgetDir()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.w3.x1999.xhtml.StyleDocument.Style.Dir target = null;
                target = (org.w3.x1999.xhtml.StyleDocument.Style.Dir)get_store().find_attribute_user(DIR$4);
                return target;
            }
        }
        
        /**
         * True if has "dir" attribute
         */
        public boolean isSetDir()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().find_attribute_user(DIR$4) != null;
            }
        }
        
        /**
         * Sets the "dir" attribute
         */
        public void setDir(org.w3.x1999.xhtml.StyleDocument.Style.Dir.Enum dir)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(DIR$4);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(DIR$4);
                }
                target.setEnumValue(dir);
            }
        }
        
        /**
         * Sets (as xml) the "dir" attribute
         */
        public void xsetDir(org.w3.x1999.xhtml.StyleDocument.Style.Dir dir)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.w3.x1999.xhtml.StyleDocument.Style.Dir target = null;
                target = (org.w3.x1999.xhtml.StyleDocument.Style.Dir)get_store().find_attribute_user(DIR$4);
                if (target == null)
                {
                    target = (org.w3.x1999.xhtml.StyleDocument.Style.Dir)get_store().add_attribute_user(DIR$4);
                }
                target.set(dir);
            }
        }
        
        /**
         * Unsets the "dir" attribute
         */
        public void unsetDir()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_attribute(DIR$4);
            }
        }
        
        /**
         * Gets the "id" attribute
         */
        public java.lang.String getId()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(ID$6);
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
                target = (org.apache.xmlbeans.XmlID)get_store().find_attribute_user(ID$6);
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
                return get_store().find_attribute_user(ID$6) != null;
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
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(ID$6);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(ID$6);
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
                target = (org.apache.xmlbeans.XmlID)get_store().find_attribute_user(ID$6);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlID)get_store().add_attribute_user(ID$6);
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
                get_store().remove_attribute(ID$6);
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
         * Gets the "media" attribute
         */
        public java.lang.String getMedia()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(MEDIA$10);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "media" attribute
         */
        public org.w3.x1999.xhtml.MediaDesc xgetMedia()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.w3.x1999.xhtml.MediaDesc target = null;
                target = (org.w3.x1999.xhtml.MediaDesc)get_store().find_attribute_user(MEDIA$10);
                return target;
            }
        }
        
        /**
         * True if has "media" attribute
         */
        public boolean isSetMedia()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().find_attribute_user(MEDIA$10) != null;
            }
        }
        
        /**
         * Sets the "media" attribute
         */
        public void setMedia(java.lang.String media)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(MEDIA$10);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(MEDIA$10);
                }
                target.setStringValue(media);
            }
        }
        
        /**
         * Sets (as xml) the "media" attribute
         */
        public void xsetMedia(org.w3.x1999.xhtml.MediaDesc media)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.w3.x1999.xhtml.MediaDesc target = null;
                target = (org.w3.x1999.xhtml.MediaDesc)get_store().find_attribute_user(MEDIA$10);
                if (target == null)
                {
                    target = (org.w3.x1999.xhtml.MediaDesc)get_store().add_attribute_user(MEDIA$10);
                }
                target.set(media);
            }
        }
        
        /**
         * Unsets the "media" attribute
         */
        public void unsetMedia()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_attribute(MEDIA$10);
            }
        }
        
        /**
         * Gets the "title" attribute
         */
        public java.lang.String getTitle()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(TITLE$12);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "title" attribute
         */
        public org.w3.x1999.xhtml.Text xgetTitle()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.w3.x1999.xhtml.Text target = null;
                target = (org.w3.x1999.xhtml.Text)get_store().find_attribute_user(TITLE$12);
                return target;
            }
        }
        
        /**
         * True if has "title" attribute
         */
        public boolean isSetTitle()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().find_attribute_user(TITLE$12) != null;
            }
        }
        
        /**
         * Sets the "title" attribute
         */
        public void setTitle(java.lang.String title)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(TITLE$12);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(TITLE$12);
                }
                target.setStringValue(title);
            }
        }
        
        /**
         * Sets (as xml) the "title" attribute
         */
        public void xsetTitle(org.w3.x1999.xhtml.Text title)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.w3.x1999.xhtml.Text target = null;
                target = (org.w3.x1999.xhtml.Text)get_store().find_attribute_user(TITLE$12);
                if (target == null)
                {
                    target = (org.w3.x1999.xhtml.Text)get_store().add_attribute_user(TITLE$12);
                }
                target.set(title);
            }
        }
        
        /**
         * Unsets the "title" attribute
         */
        public void unsetTitle()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_attribute(TITLE$12);
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
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(SPACE$14);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_default_attribute_value(SPACE$14);
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
                target = (org.apache.xmlbeans.impl.xb.xmlschema.SpaceAttribute.Space)get_store().find_attribute_user(SPACE$14);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.impl.xb.xmlschema.SpaceAttribute.Space)get_default_attribute_value(SPACE$14);
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
                return get_store().find_attribute_user(SPACE$14) != null;
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
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(SPACE$14);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(SPACE$14);
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
                target = (org.apache.xmlbeans.impl.xb.xmlschema.SpaceAttribute.Space)get_store().find_attribute_user(SPACE$14);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.impl.xb.xmlschema.SpaceAttribute.Space)get_store().add_attribute_user(SPACE$14);
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
                get_store().remove_attribute(SPACE$14);
            }
        }
        /**
         * An XML dir(@).
         *
         * This is an atomic type that is a restriction of org.w3.x1999.xhtml.StyleDocument$Style$Dir.
         */
        public static class DirImpl extends org.apache.xmlbeans.impl.values.JavaStringEnumerationHolderEx implements org.w3.x1999.xhtml.StyleDocument.Style.Dir
        {
            private static final long serialVersionUID = 1L;
            
            public DirImpl(org.apache.xmlbeans.SchemaType sType)
            {
                super(sType, false);
            }
            
            protected DirImpl(org.apache.xmlbeans.SchemaType sType, boolean b)
            {
                super(sType, b);
            }
        }
    }
}
