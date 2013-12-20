/*
 * An XML document type.
 * Localname: map
 * Namespace: http://www.w3.org/1999/xhtml
 * Java type: org.w3.x1999.xhtml.MapDocument
 *
 * Automatically generated - do not modify.
 */
package org.w3.x1999.xhtml.impl;
/**
 * A document containing one map(@http://www.w3.org/1999/xhtml) element.
 *
 * This is a complex type.
 */
public class MapDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.w3.x1999.xhtml.MapDocument
{
    private static final long serialVersionUID = 1L;
    
    public MapDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName MAP$0 = 
        new javax.xml.namespace.QName("http://www.w3.org/1999/xhtml", "map");
    
    
    /**
     * Gets the "map" element
     */
    public org.w3.x1999.xhtml.MapDocument.Map getMap()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.w3.x1999.xhtml.MapDocument.Map target = null;
            target = (org.w3.x1999.xhtml.MapDocument.Map)get_store().find_element_user(MAP$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "map" element
     */
    public void setMap(org.w3.x1999.xhtml.MapDocument.Map map)
    {
        generatedSetterHelperImpl(map, MAP$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "map" element
     */
    public org.w3.x1999.xhtml.MapDocument.Map addNewMap()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.w3.x1999.xhtml.MapDocument.Map target = null;
            target = (org.w3.x1999.xhtml.MapDocument.Map)get_store().add_element_user(MAP$0);
            return target;
        }
    }
    /**
     * An XML map(@http://www.w3.org/1999/xhtml).
     *
     * This is a complex type.
     */
    public static class MapImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.w3.x1999.xhtml.MapDocument.Map
    {
        private static final long serialVersionUID = 1L;
        
        public MapImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName P$0 = 
            new javax.xml.namespace.QName("http://www.w3.org/1999/xhtml", "p");
        private static final javax.xml.namespace.QName H1$2 = 
            new javax.xml.namespace.QName("http://www.w3.org/1999/xhtml", "h1");
        private static final javax.xml.namespace.QName H2$4 = 
            new javax.xml.namespace.QName("http://www.w3.org/1999/xhtml", "h2");
        private static final javax.xml.namespace.QName H3$6 = 
            new javax.xml.namespace.QName("http://www.w3.org/1999/xhtml", "h3");
        private static final javax.xml.namespace.QName H4$8 = 
            new javax.xml.namespace.QName("http://www.w3.org/1999/xhtml", "h4");
        private static final javax.xml.namespace.QName H5$10 = 
            new javax.xml.namespace.QName("http://www.w3.org/1999/xhtml", "h5");
        private static final javax.xml.namespace.QName H6$12 = 
            new javax.xml.namespace.QName("http://www.w3.org/1999/xhtml", "h6");
        private static final javax.xml.namespace.QName DIV$14 = 
            new javax.xml.namespace.QName("http://www.w3.org/1999/xhtml", "div");
        private static final javax.xml.namespace.QName UL$16 = 
            new javax.xml.namespace.QName("http://www.w3.org/1999/xhtml", "ul");
        private static final javax.xml.namespace.QName OL$18 = 
            new javax.xml.namespace.QName("http://www.w3.org/1999/xhtml", "ol");
        private static final javax.xml.namespace.QName DL$20 = 
            new javax.xml.namespace.QName("http://www.w3.org/1999/xhtml", "dl");
        private static final javax.xml.namespace.QName PRE$22 = 
            new javax.xml.namespace.QName("http://www.w3.org/1999/xhtml", "pre");
        private static final javax.xml.namespace.QName HR$24 = 
            new javax.xml.namespace.QName("http://www.w3.org/1999/xhtml", "hr");
        private static final javax.xml.namespace.QName BLOCKQUOTE$26 = 
            new javax.xml.namespace.QName("http://www.w3.org/1999/xhtml", "blockquote");
        private static final javax.xml.namespace.QName ADDRESS$28 = 
            new javax.xml.namespace.QName("http://www.w3.org/1999/xhtml", "address");
        private static final javax.xml.namespace.QName FIELDSET$30 = 
            new javax.xml.namespace.QName("http://www.w3.org/1999/xhtml", "fieldset");
        private static final javax.xml.namespace.QName TABLE$32 = 
            new javax.xml.namespace.QName("http://www.w3.org/1999/xhtml", "table");
        private static final javax.xml.namespace.QName FORM$34 = 
            new javax.xml.namespace.QName("http://www.w3.org/1999/xhtml", "form");
        private static final javax.xml.namespace.QName NOSCRIPT$36 = 
            new javax.xml.namespace.QName("http://www.w3.org/1999/xhtml", "noscript");
        private static final javax.xml.namespace.QName INS$38 = 
            new javax.xml.namespace.QName("http://www.w3.org/1999/xhtml", "ins");
        private static final javax.xml.namespace.QName DEL$40 = 
            new javax.xml.namespace.QName("http://www.w3.org/1999/xhtml", "del");
        private static final javax.xml.namespace.QName SCRIPT$42 = 
            new javax.xml.namespace.QName("http://www.w3.org/1999/xhtml", "script");
        private static final javax.xml.namespace.QName AREA$44 = 
            new javax.xml.namespace.QName("http://www.w3.org/1999/xhtml", "area");
        private static final javax.xml.namespace.QName LANG$46 = 
            new javax.xml.namespace.QName("", "lang");
        private static final javax.xml.namespace.QName LANG2$48 = 
            new javax.xml.namespace.QName("http://www.w3.org/XML/1998/namespace", "lang");
        private static final javax.xml.namespace.QName DIR$50 = 
            new javax.xml.namespace.QName("", "dir");
        private static final javax.xml.namespace.QName ONCLICK$52 = 
            new javax.xml.namespace.QName("", "onclick");
        private static final javax.xml.namespace.QName ONDBLCLICK$54 = 
            new javax.xml.namespace.QName("", "ondblclick");
        private static final javax.xml.namespace.QName ONMOUSEDOWN$56 = 
            new javax.xml.namespace.QName("", "onmousedown");
        private static final javax.xml.namespace.QName ONMOUSEUP$58 = 
            new javax.xml.namespace.QName("", "onmouseup");
        private static final javax.xml.namespace.QName ONMOUSEOVER$60 = 
            new javax.xml.namespace.QName("", "onmouseover");
        private static final javax.xml.namespace.QName ONMOUSEMOVE$62 = 
            new javax.xml.namespace.QName("", "onmousemove");
        private static final javax.xml.namespace.QName ONMOUSEOUT$64 = 
            new javax.xml.namespace.QName("", "onmouseout");
        private static final javax.xml.namespace.QName ONKEYPRESS$66 = 
            new javax.xml.namespace.QName("", "onkeypress");
        private static final javax.xml.namespace.QName ONKEYDOWN$68 = 
            new javax.xml.namespace.QName("", "onkeydown");
        private static final javax.xml.namespace.QName ONKEYUP$70 = 
            new javax.xml.namespace.QName("", "onkeyup");
        private static final javax.xml.namespace.QName ID$72 = 
            new javax.xml.namespace.QName("", "id");
        private static final javax.xml.namespace.QName CLASS1$74 = 
            new javax.xml.namespace.QName("", "class");
        private static final javax.xml.namespace.QName STYLE$76 = 
            new javax.xml.namespace.QName("", "style");
        private static final javax.xml.namespace.QName TITLE$78 = 
            new javax.xml.namespace.QName("", "title");
        private static final javax.xml.namespace.QName NAME$80 = 
            new javax.xml.namespace.QName("", "name");
        
        
        /**
         * Gets array of all "p" elements
         */
        public org.w3.x1999.xhtml.PDocument.P[] getPArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                java.util.List targetList = new java.util.ArrayList();
                get_store().find_all_element_users(P$0, targetList);
                org.w3.x1999.xhtml.PDocument.P[] result = new org.w3.x1999.xhtml.PDocument.P[targetList.size()];
                targetList.toArray(result);
                return result;
            }
        }
        
        /**
         * Gets ith "p" element
         */
        public org.w3.x1999.xhtml.PDocument.P getPArray(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.w3.x1999.xhtml.PDocument.P target = null;
                target = (org.w3.x1999.xhtml.PDocument.P)get_store().find_element_user(P$0, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                return target;
            }
        }
        
        /**
         * Returns number of "p" element
         */
        public int sizeOfPArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(P$0);
            }
        }
        
        /**
         * Sets array of all "p" element  WARNING: This method is not atomicaly synchronized.
         */
        public void setPArray(org.w3.x1999.xhtml.PDocument.P[] pArray)
        {
            check_orphaned();
            arraySetterHelper(pArray, P$0);
        }
        
        /**
         * Sets ith "p" element
         */
        public void setPArray(int i, org.w3.x1999.xhtml.PDocument.P p)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.w3.x1999.xhtml.PDocument.P target = null;
                target = (org.w3.x1999.xhtml.PDocument.P)get_store().find_element_user(P$0, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                target.set(p);
            }
        }
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "p" element
         */
        public org.w3.x1999.xhtml.PDocument.P insertNewP(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.w3.x1999.xhtml.PDocument.P target = null;
                target = (org.w3.x1999.xhtml.PDocument.P)get_store().insert_element_user(P$0, i);
                return target;
            }
        }
        
        /**
         * Appends and returns a new empty value (as xml) as the last "p" element
         */
        public org.w3.x1999.xhtml.PDocument.P addNewP()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.w3.x1999.xhtml.PDocument.P target = null;
                target = (org.w3.x1999.xhtml.PDocument.P)get_store().add_element_user(P$0);
                return target;
            }
        }
        
        /**
         * Removes the ith "p" element
         */
        public void removeP(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(P$0, i);
            }
        }
        
        /**
         * Gets array of all "h1" elements
         */
        public org.w3.x1999.xhtml.H1Document.H1[] getH1Array()
        {
            synchronized (monitor())
            {
                check_orphaned();
                java.util.List targetList = new java.util.ArrayList();
                get_store().find_all_element_users(H1$2, targetList);
                org.w3.x1999.xhtml.H1Document.H1[] result = new org.w3.x1999.xhtml.H1Document.H1[targetList.size()];
                targetList.toArray(result);
                return result;
            }
        }
        
        /**
         * Gets ith "h1" element
         */
        public org.w3.x1999.xhtml.H1Document.H1 getH1Array(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.w3.x1999.xhtml.H1Document.H1 target = null;
                target = (org.w3.x1999.xhtml.H1Document.H1)get_store().find_element_user(H1$2, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                return target;
            }
        }
        
        /**
         * Returns number of "h1" element
         */
        public int sizeOfH1Array()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(H1$2);
            }
        }
        
        /**
         * Sets array of all "h1" element  WARNING: This method is not atomicaly synchronized.
         */
        public void setH1Array(org.w3.x1999.xhtml.H1Document.H1[] h1Array)
        {
            check_orphaned();
            arraySetterHelper(h1Array, H1$2);
        }
        
        /**
         * Sets ith "h1" element
         */
        public void setH1Array(int i, org.w3.x1999.xhtml.H1Document.H1 h1)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.w3.x1999.xhtml.H1Document.H1 target = null;
                target = (org.w3.x1999.xhtml.H1Document.H1)get_store().find_element_user(H1$2, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                target.set(h1);
            }
        }
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "h1" element
         */
        public org.w3.x1999.xhtml.H1Document.H1 insertNewH1(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.w3.x1999.xhtml.H1Document.H1 target = null;
                target = (org.w3.x1999.xhtml.H1Document.H1)get_store().insert_element_user(H1$2, i);
                return target;
            }
        }
        
        /**
         * Appends and returns a new empty value (as xml) as the last "h1" element
         */
        public org.w3.x1999.xhtml.H1Document.H1 addNewH1()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.w3.x1999.xhtml.H1Document.H1 target = null;
                target = (org.w3.x1999.xhtml.H1Document.H1)get_store().add_element_user(H1$2);
                return target;
            }
        }
        
        /**
         * Removes the ith "h1" element
         */
        public void removeH1(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(H1$2, i);
            }
        }
        
        /**
         * Gets array of all "h2" elements
         */
        public org.w3.x1999.xhtml.H2Document.H2[] getH2Array()
        {
            synchronized (monitor())
            {
                check_orphaned();
                java.util.List targetList = new java.util.ArrayList();
                get_store().find_all_element_users(H2$4, targetList);
                org.w3.x1999.xhtml.H2Document.H2[] result = new org.w3.x1999.xhtml.H2Document.H2[targetList.size()];
                targetList.toArray(result);
                return result;
            }
        }
        
        /**
         * Gets ith "h2" element
         */
        public org.w3.x1999.xhtml.H2Document.H2 getH2Array(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.w3.x1999.xhtml.H2Document.H2 target = null;
                target = (org.w3.x1999.xhtml.H2Document.H2)get_store().find_element_user(H2$4, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                return target;
            }
        }
        
        /**
         * Returns number of "h2" element
         */
        public int sizeOfH2Array()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(H2$4);
            }
        }
        
        /**
         * Sets array of all "h2" element  WARNING: This method is not atomicaly synchronized.
         */
        public void setH2Array(org.w3.x1999.xhtml.H2Document.H2[] h2Array)
        {
            check_orphaned();
            arraySetterHelper(h2Array, H2$4);
        }
        
        /**
         * Sets ith "h2" element
         */
        public void setH2Array(int i, org.w3.x1999.xhtml.H2Document.H2 h2)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.w3.x1999.xhtml.H2Document.H2 target = null;
                target = (org.w3.x1999.xhtml.H2Document.H2)get_store().find_element_user(H2$4, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                target.set(h2);
            }
        }
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "h2" element
         */
        public org.w3.x1999.xhtml.H2Document.H2 insertNewH2(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.w3.x1999.xhtml.H2Document.H2 target = null;
                target = (org.w3.x1999.xhtml.H2Document.H2)get_store().insert_element_user(H2$4, i);
                return target;
            }
        }
        
        /**
         * Appends and returns a new empty value (as xml) as the last "h2" element
         */
        public org.w3.x1999.xhtml.H2Document.H2 addNewH2()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.w3.x1999.xhtml.H2Document.H2 target = null;
                target = (org.w3.x1999.xhtml.H2Document.H2)get_store().add_element_user(H2$4);
                return target;
            }
        }
        
        /**
         * Removes the ith "h2" element
         */
        public void removeH2(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(H2$4, i);
            }
        }
        
        /**
         * Gets array of all "h3" elements
         */
        public org.w3.x1999.xhtml.H3Document.H3[] getH3Array()
        {
            synchronized (monitor())
            {
                check_orphaned();
                java.util.List targetList = new java.util.ArrayList();
                get_store().find_all_element_users(H3$6, targetList);
                org.w3.x1999.xhtml.H3Document.H3[] result = new org.w3.x1999.xhtml.H3Document.H3[targetList.size()];
                targetList.toArray(result);
                return result;
            }
        }
        
        /**
         * Gets ith "h3" element
         */
        public org.w3.x1999.xhtml.H3Document.H3 getH3Array(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.w3.x1999.xhtml.H3Document.H3 target = null;
                target = (org.w3.x1999.xhtml.H3Document.H3)get_store().find_element_user(H3$6, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                return target;
            }
        }
        
        /**
         * Returns number of "h3" element
         */
        public int sizeOfH3Array()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(H3$6);
            }
        }
        
        /**
         * Sets array of all "h3" element  WARNING: This method is not atomicaly synchronized.
         */
        public void setH3Array(org.w3.x1999.xhtml.H3Document.H3[] h3Array)
        {
            check_orphaned();
            arraySetterHelper(h3Array, H3$6);
        }
        
        /**
         * Sets ith "h3" element
         */
        public void setH3Array(int i, org.w3.x1999.xhtml.H3Document.H3 h3)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.w3.x1999.xhtml.H3Document.H3 target = null;
                target = (org.w3.x1999.xhtml.H3Document.H3)get_store().find_element_user(H3$6, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                target.set(h3);
            }
        }
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "h3" element
         */
        public org.w3.x1999.xhtml.H3Document.H3 insertNewH3(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.w3.x1999.xhtml.H3Document.H3 target = null;
                target = (org.w3.x1999.xhtml.H3Document.H3)get_store().insert_element_user(H3$6, i);
                return target;
            }
        }
        
        /**
         * Appends and returns a new empty value (as xml) as the last "h3" element
         */
        public org.w3.x1999.xhtml.H3Document.H3 addNewH3()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.w3.x1999.xhtml.H3Document.H3 target = null;
                target = (org.w3.x1999.xhtml.H3Document.H3)get_store().add_element_user(H3$6);
                return target;
            }
        }
        
        /**
         * Removes the ith "h3" element
         */
        public void removeH3(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(H3$6, i);
            }
        }
        
        /**
         * Gets array of all "h4" elements
         */
        public org.w3.x1999.xhtml.H4Document.H4[] getH4Array()
        {
            synchronized (monitor())
            {
                check_orphaned();
                java.util.List targetList = new java.util.ArrayList();
                get_store().find_all_element_users(H4$8, targetList);
                org.w3.x1999.xhtml.H4Document.H4[] result = new org.w3.x1999.xhtml.H4Document.H4[targetList.size()];
                targetList.toArray(result);
                return result;
            }
        }
        
        /**
         * Gets ith "h4" element
         */
        public org.w3.x1999.xhtml.H4Document.H4 getH4Array(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.w3.x1999.xhtml.H4Document.H4 target = null;
                target = (org.w3.x1999.xhtml.H4Document.H4)get_store().find_element_user(H4$8, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                return target;
            }
        }
        
        /**
         * Returns number of "h4" element
         */
        public int sizeOfH4Array()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(H4$8);
            }
        }
        
        /**
         * Sets array of all "h4" element  WARNING: This method is not atomicaly synchronized.
         */
        public void setH4Array(org.w3.x1999.xhtml.H4Document.H4[] h4Array)
        {
            check_orphaned();
            arraySetterHelper(h4Array, H4$8);
        }
        
        /**
         * Sets ith "h4" element
         */
        public void setH4Array(int i, org.w3.x1999.xhtml.H4Document.H4 h4)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.w3.x1999.xhtml.H4Document.H4 target = null;
                target = (org.w3.x1999.xhtml.H4Document.H4)get_store().find_element_user(H4$8, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                target.set(h4);
            }
        }
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "h4" element
         */
        public org.w3.x1999.xhtml.H4Document.H4 insertNewH4(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.w3.x1999.xhtml.H4Document.H4 target = null;
                target = (org.w3.x1999.xhtml.H4Document.H4)get_store().insert_element_user(H4$8, i);
                return target;
            }
        }
        
        /**
         * Appends and returns a new empty value (as xml) as the last "h4" element
         */
        public org.w3.x1999.xhtml.H4Document.H4 addNewH4()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.w3.x1999.xhtml.H4Document.H4 target = null;
                target = (org.w3.x1999.xhtml.H4Document.H4)get_store().add_element_user(H4$8);
                return target;
            }
        }
        
        /**
         * Removes the ith "h4" element
         */
        public void removeH4(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(H4$8, i);
            }
        }
        
        /**
         * Gets array of all "h5" elements
         */
        public org.w3.x1999.xhtml.H5Document.H5[] getH5Array()
        {
            synchronized (monitor())
            {
                check_orphaned();
                java.util.List targetList = new java.util.ArrayList();
                get_store().find_all_element_users(H5$10, targetList);
                org.w3.x1999.xhtml.H5Document.H5[] result = new org.w3.x1999.xhtml.H5Document.H5[targetList.size()];
                targetList.toArray(result);
                return result;
            }
        }
        
        /**
         * Gets ith "h5" element
         */
        public org.w3.x1999.xhtml.H5Document.H5 getH5Array(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.w3.x1999.xhtml.H5Document.H5 target = null;
                target = (org.w3.x1999.xhtml.H5Document.H5)get_store().find_element_user(H5$10, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                return target;
            }
        }
        
        /**
         * Returns number of "h5" element
         */
        public int sizeOfH5Array()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(H5$10);
            }
        }
        
        /**
         * Sets array of all "h5" element  WARNING: This method is not atomicaly synchronized.
         */
        public void setH5Array(org.w3.x1999.xhtml.H5Document.H5[] h5Array)
        {
            check_orphaned();
            arraySetterHelper(h5Array, H5$10);
        }
        
        /**
         * Sets ith "h5" element
         */
        public void setH5Array(int i, org.w3.x1999.xhtml.H5Document.H5 h5)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.w3.x1999.xhtml.H5Document.H5 target = null;
                target = (org.w3.x1999.xhtml.H5Document.H5)get_store().find_element_user(H5$10, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                target.set(h5);
            }
        }
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "h5" element
         */
        public org.w3.x1999.xhtml.H5Document.H5 insertNewH5(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.w3.x1999.xhtml.H5Document.H5 target = null;
                target = (org.w3.x1999.xhtml.H5Document.H5)get_store().insert_element_user(H5$10, i);
                return target;
            }
        }
        
        /**
         * Appends and returns a new empty value (as xml) as the last "h5" element
         */
        public org.w3.x1999.xhtml.H5Document.H5 addNewH5()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.w3.x1999.xhtml.H5Document.H5 target = null;
                target = (org.w3.x1999.xhtml.H5Document.H5)get_store().add_element_user(H5$10);
                return target;
            }
        }
        
        /**
         * Removes the ith "h5" element
         */
        public void removeH5(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(H5$10, i);
            }
        }
        
        /**
         * Gets array of all "h6" elements
         */
        public org.w3.x1999.xhtml.H6Document.H6[] getH6Array()
        {
            synchronized (monitor())
            {
                check_orphaned();
                java.util.List targetList = new java.util.ArrayList();
                get_store().find_all_element_users(H6$12, targetList);
                org.w3.x1999.xhtml.H6Document.H6[] result = new org.w3.x1999.xhtml.H6Document.H6[targetList.size()];
                targetList.toArray(result);
                return result;
            }
        }
        
        /**
         * Gets ith "h6" element
         */
        public org.w3.x1999.xhtml.H6Document.H6 getH6Array(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.w3.x1999.xhtml.H6Document.H6 target = null;
                target = (org.w3.x1999.xhtml.H6Document.H6)get_store().find_element_user(H6$12, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                return target;
            }
        }
        
        /**
         * Returns number of "h6" element
         */
        public int sizeOfH6Array()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(H6$12);
            }
        }
        
        /**
         * Sets array of all "h6" element  WARNING: This method is not atomicaly synchronized.
         */
        public void setH6Array(org.w3.x1999.xhtml.H6Document.H6[] h6Array)
        {
            check_orphaned();
            arraySetterHelper(h6Array, H6$12);
        }
        
        /**
         * Sets ith "h6" element
         */
        public void setH6Array(int i, org.w3.x1999.xhtml.H6Document.H6 h6)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.w3.x1999.xhtml.H6Document.H6 target = null;
                target = (org.w3.x1999.xhtml.H6Document.H6)get_store().find_element_user(H6$12, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                target.set(h6);
            }
        }
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "h6" element
         */
        public org.w3.x1999.xhtml.H6Document.H6 insertNewH6(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.w3.x1999.xhtml.H6Document.H6 target = null;
                target = (org.w3.x1999.xhtml.H6Document.H6)get_store().insert_element_user(H6$12, i);
                return target;
            }
        }
        
        /**
         * Appends and returns a new empty value (as xml) as the last "h6" element
         */
        public org.w3.x1999.xhtml.H6Document.H6 addNewH6()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.w3.x1999.xhtml.H6Document.H6 target = null;
                target = (org.w3.x1999.xhtml.H6Document.H6)get_store().add_element_user(H6$12);
                return target;
            }
        }
        
        /**
         * Removes the ith "h6" element
         */
        public void removeH6(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(H6$12, i);
            }
        }
        
        /**
         * Gets array of all "div" elements
         */
        public org.w3.x1999.xhtml.DivDocument.Div[] getDivArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                java.util.List targetList = new java.util.ArrayList();
                get_store().find_all_element_users(DIV$14, targetList);
                org.w3.x1999.xhtml.DivDocument.Div[] result = new org.w3.x1999.xhtml.DivDocument.Div[targetList.size()];
                targetList.toArray(result);
                return result;
            }
        }
        
        /**
         * Gets ith "div" element
         */
        public org.w3.x1999.xhtml.DivDocument.Div getDivArray(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.w3.x1999.xhtml.DivDocument.Div target = null;
                target = (org.w3.x1999.xhtml.DivDocument.Div)get_store().find_element_user(DIV$14, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                return target;
            }
        }
        
        /**
         * Returns number of "div" element
         */
        public int sizeOfDivArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(DIV$14);
            }
        }
        
        /**
         * Sets array of all "div" element  WARNING: This method is not atomicaly synchronized.
         */
        public void setDivArray(org.w3.x1999.xhtml.DivDocument.Div[] divArray)
        {
            check_orphaned();
            arraySetterHelper(divArray, DIV$14);
        }
        
        /**
         * Sets ith "div" element
         */
        public void setDivArray(int i, org.w3.x1999.xhtml.DivDocument.Div div)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.w3.x1999.xhtml.DivDocument.Div target = null;
                target = (org.w3.x1999.xhtml.DivDocument.Div)get_store().find_element_user(DIV$14, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                target.set(div);
            }
        }
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "div" element
         */
        public org.w3.x1999.xhtml.DivDocument.Div insertNewDiv(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.w3.x1999.xhtml.DivDocument.Div target = null;
                target = (org.w3.x1999.xhtml.DivDocument.Div)get_store().insert_element_user(DIV$14, i);
                return target;
            }
        }
        
        /**
         * Appends and returns a new empty value (as xml) as the last "div" element
         */
        public org.w3.x1999.xhtml.DivDocument.Div addNewDiv()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.w3.x1999.xhtml.DivDocument.Div target = null;
                target = (org.w3.x1999.xhtml.DivDocument.Div)get_store().add_element_user(DIV$14);
                return target;
            }
        }
        
        /**
         * Removes the ith "div" element
         */
        public void removeDiv(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(DIV$14, i);
            }
        }
        
        /**
         * Gets array of all "ul" elements
         */
        public org.w3.x1999.xhtml.UlDocument.Ul[] getUlArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                java.util.List targetList = new java.util.ArrayList();
                get_store().find_all_element_users(UL$16, targetList);
                org.w3.x1999.xhtml.UlDocument.Ul[] result = new org.w3.x1999.xhtml.UlDocument.Ul[targetList.size()];
                targetList.toArray(result);
                return result;
            }
        }
        
        /**
         * Gets ith "ul" element
         */
        public org.w3.x1999.xhtml.UlDocument.Ul getUlArray(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.w3.x1999.xhtml.UlDocument.Ul target = null;
                target = (org.w3.x1999.xhtml.UlDocument.Ul)get_store().find_element_user(UL$16, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                return target;
            }
        }
        
        /**
         * Returns number of "ul" element
         */
        public int sizeOfUlArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(UL$16);
            }
        }
        
        /**
         * Sets array of all "ul" element  WARNING: This method is not atomicaly synchronized.
         */
        public void setUlArray(org.w3.x1999.xhtml.UlDocument.Ul[] ulArray)
        {
            check_orphaned();
            arraySetterHelper(ulArray, UL$16);
        }
        
        /**
         * Sets ith "ul" element
         */
        public void setUlArray(int i, org.w3.x1999.xhtml.UlDocument.Ul ul)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.w3.x1999.xhtml.UlDocument.Ul target = null;
                target = (org.w3.x1999.xhtml.UlDocument.Ul)get_store().find_element_user(UL$16, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                target.set(ul);
            }
        }
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "ul" element
         */
        public org.w3.x1999.xhtml.UlDocument.Ul insertNewUl(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.w3.x1999.xhtml.UlDocument.Ul target = null;
                target = (org.w3.x1999.xhtml.UlDocument.Ul)get_store().insert_element_user(UL$16, i);
                return target;
            }
        }
        
        /**
         * Appends and returns a new empty value (as xml) as the last "ul" element
         */
        public org.w3.x1999.xhtml.UlDocument.Ul addNewUl()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.w3.x1999.xhtml.UlDocument.Ul target = null;
                target = (org.w3.x1999.xhtml.UlDocument.Ul)get_store().add_element_user(UL$16);
                return target;
            }
        }
        
        /**
         * Removes the ith "ul" element
         */
        public void removeUl(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(UL$16, i);
            }
        }
        
        /**
         * Gets array of all "ol" elements
         */
        public org.w3.x1999.xhtml.OlDocument.Ol[] getOlArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                java.util.List targetList = new java.util.ArrayList();
                get_store().find_all_element_users(OL$18, targetList);
                org.w3.x1999.xhtml.OlDocument.Ol[] result = new org.w3.x1999.xhtml.OlDocument.Ol[targetList.size()];
                targetList.toArray(result);
                return result;
            }
        }
        
        /**
         * Gets ith "ol" element
         */
        public org.w3.x1999.xhtml.OlDocument.Ol getOlArray(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.w3.x1999.xhtml.OlDocument.Ol target = null;
                target = (org.w3.x1999.xhtml.OlDocument.Ol)get_store().find_element_user(OL$18, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                return target;
            }
        }
        
        /**
         * Returns number of "ol" element
         */
        public int sizeOfOlArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(OL$18);
            }
        }
        
        /**
         * Sets array of all "ol" element  WARNING: This method is not atomicaly synchronized.
         */
        public void setOlArray(org.w3.x1999.xhtml.OlDocument.Ol[] olArray)
        {
            check_orphaned();
            arraySetterHelper(olArray, OL$18);
        }
        
        /**
         * Sets ith "ol" element
         */
        public void setOlArray(int i, org.w3.x1999.xhtml.OlDocument.Ol ol)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.w3.x1999.xhtml.OlDocument.Ol target = null;
                target = (org.w3.x1999.xhtml.OlDocument.Ol)get_store().find_element_user(OL$18, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                target.set(ol);
            }
        }
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "ol" element
         */
        public org.w3.x1999.xhtml.OlDocument.Ol insertNewOl(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.w3.x1999.xhtml.OlDocument.Ol target = null;
                target = (org.w3.x1999.xhtml.OlDocument.Ol)get_store().insert_element_user(OL$18, i);
                return target;
            }
        }
        
        /**
         * Appends and returns a new empty value (as xml) as the last "ol" element
         */
        public org.w3.x1999.xhtml.OlDocument.Ol addNewOl()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.w3.x1999.xhtml.OlDocument.Ol target = null;
                target = (org.w3.x1999.xhtml.OlDocument.Ol)get_store().add_element_user(OL$18);
                return target;
            }
        }
        
        /**
         * Removes the ith "ol" element
         */
        public void removeOl(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(OL$18, i);
            }
        }
        
        /**
         * Gets array of all "dl" elements
         */
        public org.w3.x1999.xhtml.DlDocument.Dl[] getDlArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                java.util.List targetList = new java.util.ArrayList();
                get_store().find_all_element_users(DL$20, targetList);
                org.w3.x1999.xhtml.DlDocument.Dl[] result = new org.w3.x1999.xhtml.DlDocument.Dl[targetList.size()];
                targetList.toArray(result);
                return result;
            }
        }
        
        /**
         * Gets ith "dl" element
         */
        public org.w3.x1999.xhtml.DlDocument.Dl getDlArray(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.w3.x1999.xhtml.DlDocument.Dl target = null;
                target = (org.w3.x1999.xhtml.DlDocument.Dl)get_store().find_element_user(DL$20, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                return target;
            }
        }
        
        /**
         * Returns number of "dl" element
         */
        public int sizeOfDlArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(DL$20);
            }
        }
        
        /**
         * Sets array of all "dl" element  WARNING: This method is not atomicaly synchronized.
         */
        public void setDlArray(org.w3.x1999.xhtml.DlDocument.Dl[] dlArray)
        {
            check_orphaned();
            arraySetterHelper(dlArray, DL$20);
        }
        
        /**
         * Sets ith "dl" element
         */
        public void setDlArray(int i, org.w3.x1999.xhtml.DlDocument.Dl dl)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.w3.x1999.xhtml.DlDocument.Dl target = null;
                target = (org.w3.x1999.xhtml.DlDocument.Dl)get_store().find_element_user(DL$20, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                target.set(dl);
            }
        }
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "dl" element
         */
        public org.w3.x1999.xhtml.DlDocument.Dl insertNewDl(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.w3.x1999.xhtml.DlDocument.Dl target = null;
                target = (org.w3.x1999.xhtml.DlDocument.Dl)get_store().insert_element_user(DL$20, i);
                return target;
            }
        }
        
        /**
         * Appends and returns a new empty value (as xml) as the last "dl" element
         */
        public org.w3.x1999.xhtml.DlDocument.Dl addNewDl()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.w3.x1999.xhtml.DlDocument.Dl target = null;
                target = (org.w3.x1999.xhtml.DlDocument.Dl)get_store().add_element_user(DL$20);
                return target;
            }
        }
        
        /**
         * Removes the ith "dl" element
         */
        public void removeDl(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(DL$20, i);
            }
        }
        
        /**
         * Gets array of all "pre" elements
         */
        public org.w3.x1999.xhtml.PreDocument.Pre[] getPreArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                java.util.List targetList = new java.util.ArrayList();
                get_store().find_all_element_users(PRE$22, targetList);
                org.w3.x1999.xhtml.PreDocument.Pre[] result = new org.w3.x1999.xhtml.PreDocument.Pre[targetList.size()];
                targetList.toArray(result);
                return result;
            }
        }
        
        /**
         * Gets ith "pre" element
         */
        public org.w3.x1999.xhtml.PreDocument.Pre getPreArray(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.w3.x1999.xhtml.PreDocument.Pre target = null;
                target = (org.w3.x1999.xhtml.PreDocument.Pre)get_store().find_element_user(PRE$22, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                return target;
            }
        }
        
        /**
         * Returns number of "pre" element
         */
        public int sizeOfPreArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(PRE$22);
            }
        }
        
        /**
         * Sets array of all "pre" element  WARNING: This method is not atomicaly synchronized.
         */
        public void setPreArray(org.w3.x1999.xhtml.PreDocument.Pre[] preArray)
        {
            check_orphaned();
            arraySetterHelper(preArray, PRE$22);
        }
        
        /**
         * Sets ith "pre" element
         */
        public void setPreArray(int i, org.w3.x1999.xhtml.PreDocument.Pre pre)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.w3.x1999.xhtml.PreDocument.Pre target = null;
                target = (org.w3.x1999.xhtml.PreDocument.Pre)get_store().find_element_user(PRE$22, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                target.set(pre);
            }
        }
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "pre" element
         */
        public org.w3.x1999.xhtml.PreDocument.Pre insertNewPre(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.w3.x1999.xhtml.PreDocument.Pre target = null;
                target = (org.w3.x1999.xhtml.PreDocument.Pre)get_store().insert_element_user(PRE$22, i);
                return target;
            }
        }
        
        /**
         * Appends and returns a new empty value (as xml) as the last "pre" element
         */
        public org.w3.x1999.xhtml.PreDocument.Pre addNewPre()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.w3.x1999.xhtml.PreDocument.Pre target = null;
                target = (org.w3.x1999.xhtml.PreDocument.Pre)get_store().add_element_user(PRE$22);
                return target;
            }
        }
        
        /**
         * Removes the ith "pre" element
         */
        public void removePre(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(PRE$22, i);
            }
        }
        
        /**
         * Gets array of all "hr" elements
         */
        public org.w3.x1999.xhtml.HrDocument.Hr[] getHrArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                java.util.List targetList = new java.util.ArrayList();
                get_store().find_all_element_users(HR$24, targetList);
                org.w3.x1999.xhtml.HrDocument.Hr[] result = new org.w3.x1999.xhtml.HrDocument.Hr[targetList.size()];
                targetList.toArray(result);
                return result;
            }
        }
        
        /**
         * Gets ith "hr" element
         */
        public org.w3.x1999.xhtml.HrDocument.Hr getHrArray(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.w3.x1999.xhtml.HrDocument.Hr target = null;
                target = (org.w3.x1999.xhtml.HrDocument.Hr)get_store().find_element_user(HR$24, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                return target;
            }
        }
        
        /**
         * Returns number of "hr" element
         */
        public int sizeOfHrArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(HR$24);
            }
        }
        
        /**
         * Sets array of all "hr" element  WARNING: This method is not atomicaly synchronized.
         */
        public void setHrArray(org.w3.x1999.xhtml.HrDocument.Hr[] hrArray)
        {
            check_orphaned();
            arraySetterHelper(hrArray, HR$24);
        }
        
        /**
         * Sets ith "hr" element
         */
        public void setHrArray(int i, org.w3.x1999.xhtml.HrDocument.Hr hr)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.w3.x1999.xhtml.HrDocument.Hr target = null;
                target = (org.w3.x1999.xhtml.HrDocument.Hr)get_store().find_element_user(HR$24, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                target.set(hr);
            }
        }
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "hr" element
         */
        public org.w3.x1999.xhtml.HrDocument.Hr insertNewHr(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.w3.x1999.xhtml.HrDocument.Hr target = null;
                target = (org.w3.x1999.xhtml.HrDocument.Hr)get_store().insert_element_user(HR$24, i);
                return target;
            }
        }
        
        /**
         * Appends and returns a new empty value (as xml) as the last "hr" element
         */
        public org.w3.x1999.xhtml.HrDocument.Hr addNewHr()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.w3.x1999.xhtml.HrDocument.Hr target = null;
                target = (org.w3.x1999.xhtml.HrDocument.Hr)get_store().add_element_user(HR$24);
                return target;
            }
        }
        
        /**
         * Removes the ith "hr" element
         */
        public void removeHr(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(HR$24, i);
            }
        }
        
        /**
         * Gets array of all "blockquote" elements
         */
        public org.w3.x1999.xhtml.BlockquoteDocument.Blockquote[] getBlockquoteArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                java.util.List targetList = new java.util.ArrayList();
                get_store().find_all_element_users(BLOCKQUOTE$26, targetList);
                org.w3.x1999.xhtml.BlockquoteDocument.Blockquote[] result = new org.w3.x1999.xhtml.BlockquoteDocument.Blockquote[targetList.size()];
                targetList.toArray(result);
                return result;
            }
        }
        
        /**
         * Gets ith "blockquote" element
         */
        public org.w3.x1999.xhtml.BlockquoteDocument.Blockquote getBlockquoteArray(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.w3.x1999.xhtml.BlockquoteDocument.Blockquote target = null;
                target = (org.w3.x1999.xhtml.BlockquoteDocument.Blockquote)get_store().find_element_user(BLOCKQUOTE$26, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                return target;
            }
        }
        
        /**
         * Returns number of "blockquote" element
         */
        public int sizeOfBlockquoteArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(BLOCKQUOTE$26);
            }
        }
        
        /**
         * Sets array of all "blockquote" element  WARNING: This method is not atomicaly synchronized.
         */
        public void setBlockquoteArray(org.w3.x1999.xhtml.BlockquoteDocument.Blockquote[] blockquoteArray)
        {
            check_orphaned();
            arraySetterHelper(blockquoteArray, BLOCKQUOTE$26);
        }
        
        /**
         * Sets ith "blockquote" element
         */
        public void setBlockquoteArray(int i, org.w3.x1999.xhtml.BlockquoteDocument.Blockquote blockquote)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.w3.x1999.xhtml.BlockquoteDocument.Blockquote target = null;
                target = (org.w3.x1999.xhtml.BlockquoteDocument.Blockquote)get_store().find_element_user(BLOCKQUOTE$26, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                target.set(blockquote);
            }
        }
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "blockquote" element
         */
        public org.w3.x1999.xhtml.BlockquoteDocument.Blockquote insertNewBlockquote(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.w3.x1999.xhtml.BlockquoteDocument.Blockquote target = null;
                target = (org.w3.x1999.xhtml.BlockquoteDocument.Blockquote)get_store().insert_element_user(BLOCKQUOTE$26, i);
                return target;
            }
        }
        
        /**
         * Appends and returns a new empty value (as xml) as the last "blockquote" element
         */
        public org.w3.x1999.xhtml.BlockquoteDocument.Blockquote addNewBlockquote()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.w3.x1999.xhtml.BlockquoteDocument.Blockquote target = null;
                target = (org.w3.x1999.xhtml.BlockquoteDocument.Blockquote)get_store().add_element_user(BLOCKQUOTE$26);
                return target;
            }
        }
        
        /**
         * Removes the ith "blockquote" element
         */
        public void removeBlockquote(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(BLOCKQUOTE$26, i);
            }
        }
        
        /**
         * Gets array of all "address" elements
         */
        public org.w3.x1999.xhtml.AddressDocument.Address[] getAddressArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                java.util.List targetList = new java.util.ArrayList();
                get_store().find_all_element_users(ADDRESS$28, targetList);
                org.w3.x1999.xhtml.AddressDocument.Address[] result = new org.w3.x1999.xhtml.AddressDocument.Address[targetList.size()];
                targetList.toArray(result);
                return result;
            }
        }
        
        /**
         * Gets ith "address" element
         */
        public org.w3.x1999.xhtml.AddressDocument.Address getAddressArray(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.w3.x1999.xhtml.AddressDocument.Address target = null;
                target = (org.w3.x1999.xhtml.AddressDocument.Address)get_store().find_element_user(ADDRESS$28, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                return target;
            }
        }
        
        /**
         * Returns number of "address" element
         */
        public int sizeOfAddressArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(ADDRESS$28);
            }
        }
        
        /**
         * Sets array of all "address" element  WARNING: This method is not atomicaly synchronized.
         */
        public void setAddressArray(org.w3.x1999.xhtml.AddressDocument.Address[] addressArray)
        {
            check_orphaned();
            arraySetterHelper(addressArray, ADDRESS$28);
        }
        
        /**
         * Sets ith "address" element
         */
        public void setAddressArray(int i, org.w3.x1999.xhtml.AddressDocument.Address address)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.w3.x1999.xhtml.AddressDocument.Address target = null;
                target = (org.w3.x1999.xhtml.AddressDocument.Address)get_store().find_element_user(ADDRESS$28, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                target.set(address);
            }
        }
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "address" element
         */
        public org.w3.x1999.xhtml.AddressDocument.Address insertNewAddress(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.w3.x1999.xhtml.AddressDocument.Address target = null;
                target = (org.w3.x1999.xhtml.AddressDocument.Address)get_store().insert_element_user(ADDRESS$28, i);
                return target;
            }
        }
        
        /**
         * Appends and returns a new empty value (as xml) as the last "address" element
         */
        public org.w3.x1999.xhtml.AddressDocument.Address addNewAddress()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.w3.x1999.xhtml.AddressDocument.Address target = null;
                target = (org.w3.x1999.xhtml.AddressDocument.Address)get_store().add_element_user(ADDRESS$28);
                return target;
            }
        }
        
        /**
         * Removes the ith "address" element
         */
        public void removeAddress(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(ADDRESS$28, i);
            }
        }
        
        /**
         * Gets array of all "fieldset" elements
         */
        public org.w3.x1999.xhtml.FieldsetDocument.Fieldset[] getFieldsetArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                java.util.List targetList = new java.util.ArrayList();
                get_store().find_all_element_users(FIELDSET$30, targetList);
                org.w3.x1999.xhtml.FieldsetDocument.Fieldset[] result = new org.w3.x1999.xhtml.FieldsetDocument.Fieldset[targetList.size()];
                targetList.toArray(result);
                return result;
            }
        }
        
        /**
         * Gets ith "fieldset" element
         */
        public org.w3.x1999.xhtml.FieldsetDocument.Fieldset getFieldsetArray(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.w3.x1999.xhtml.FieldsetDocument.Fieldset target = null;
                target = (org.w3.x1999.xhtml.FieldsetDocument.Fieldset)get_store().find_element_user(FIELDSET$30, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                return target;
            }
        }
        
        /**
         * Returns number of "fieldset" element
         */
        public int sizeOfFieldsetArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(FIELDSET$30);
            }
        }
        
        /**
         * Sets array of all "fieldset" element  WARNING: This method is not atomicaly synchronized.
         */
        public void setFieldsetArray(org.w3.x1999.xhtml.FieldsetDocument.Fieldset[] fieldsetArray)
        {
            check_orphaned();
            arraySetterHelper(fieldsetArray, FIELDSET$30);
        }
        
        /**
         * Sets ith "fieldset" element
         */
        public void setFieldsetArray(int i, org.w3.x1999.xhtml.FieldsetDocument.Fieldset fieldset)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.w3.x1999.xhtml.FieldsetDocument.Fieldset target = null;
                target = (org.w3.x1999.xhtml.FieldsetDocument.Fieldset)get_store().find_element_user(FIELDSET$30, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                target.set(fieldset);
            }
        }
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "fieldset" element
         */
        public org.w3.x1999.xhtml.FieldsetDocument.Fieldset insertNewFieldset(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.w3.x1999.xhtml.FieldsetDocument.Fieldset target = null;
                target = (org.w3.x1999.xhtml.FieldsetDocument.Fieldset)get_store().insert_element_user(FIELDSET$30, i);
                return target;
            }
        }
        
        /**
         * Appends and returns a new empty value (as xml) as the last "fieldset" element
         */
        public org.w3.x1999.xhtml.FieldsetDocument.Fieldset addNewFieldset()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.w3.x1999.xhtml.FieldsetDocument.Fieldset target = null;
                target = (org.w3.x1999.xhtml.FieldsetDocument.Fieldset)get_store().add_element_user(FIELDSET$30);
                return target;
            }
        }
        
        /**
         * Removes the ith "fieldset" element
         */
        public void removeFieldset(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(FIELDSET$30, i);
            }
        }
        
        /**
         * Gets array of all "table" elements
         */
        public org.w3.x1999.xhtml.TableDocument.Table[] getTableArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                java.util.List targetList = new java.util.ArrayList();
                get_store().find_all_element_users(TABLE$32, targetList);
                org.w3.x1999.xhtml.TableDocument.Table[] result = new org.w3.x1999.xhtml.TableDocument.Table[targetList.size()];
                targetList.toArray(result);
                return result;
            }
        }
        
        /**
         * Gets ith "table" element
         */
        public org.w3.x1999.xhtml.TableDocument.Table getTableArray(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.w3.x1999.xhtml.TableDocument.Table target = null;
                target = (org.w3.x1999.xhtml.TableDocument.Table)get_store().find_element_user(TABLE$32, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                return target;
            }
        }
        
        /**
         * Returns number of "table" element
         */
        public int sizeOfTableArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(TABLE$32);
            }
        }
        
        /**
         * Sets array of all "table" element  WARNING: This method is not atomicaly synchronized.
         */
        public void setTableArray(org.w3.x1999.xhtml.TableDocument.Table[] tableArray)
        {
            check_orphaned();
            arraySetterHelper(tableArray, TABLE$32);
        }
        
        /**
         * Sets ith "table" element
         */
        public void setTableArray(int i, org.w3.x1999.xhtml.TableDocument.Table table)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.w3.x1999.xhtml.TableDocument.Table target = null;
                target = (org.w3.x1999.xhtml.TableDocument.Table)get_store().find_element_user(TABLE$32, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                target.set(table);
            }
        }
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "table" element
         */
        public org.w3.x1999.xhtml.TableDocument.Table insertNewTable(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.w3.x1999.xhtml.TableDocument.Table target = null;
                target = (org.w3.x1999.xhtml.TableDocument.Table)get_store().insert_element_user(TABLE$32, i);
                return target;
            }
        }
        
        /**
         * Appends and returns a new empty value (as xml) as the last "table" element
         */
        public org.w3.x1999.xhtml.TableDocument.Table addNewTable()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.w3.x1999.xhtml.TableDocument.Table target = null;
                target = (org.w3.x1999.xhtml.TableDocument.Table)get_store().add_element_user(TABLE$32);
                return target;
            }
        }
        
        /**
         * Removes the ith "table" element
         */
        public void removeTable(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(TABLE$32, i);
            }
        }
        
        /**
         * Gets array of all "form" elements
         */
        public org.w3.x1999.xhtml.FormDocument.Form[] getFormArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                java.util.List targetList = new java.util.ArrayList();
                get_store().find_all_element_users(FORM$34, targetList);
                org.w3.x1999.xhtml.FormDocument.Form[] result = new org.w3.x1999.xhtml.FormDocument.Form[targetList.size()];
                targetList.toArray(result);
                return result;
            }
        }
        
        /**
         * Gets ith "form" element
         */
        public org.w3.x1999.xhtml.FormDocument.Form getFormArray(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.w3.x1999.xhtml.FormDocument.Form target = null;
                target = (org.w3.x1999.xhtml.FormDocument.Form)get_store().find_element_user(FORM$34, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                return target;
            }
        }
        
        /**
         * Returns number of "form" element
         */
        public int sizeOfFormArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(FORM$34);
            }
        }
        
        /**
         * Sets array of all "form" element  WARNING: This method is not atomicaly synchronized.
         */
        public void setFormArray(org.w3.x1999.xhtml.FormDocument.Form[] formArray)
        {
            check_orphaned();
            arraySetterHelper(formArray, FORM$34);
        }
        
        /**
         * Sets ith "form" element
         */
        public void setFormArray(int i, org.w3.x1999.xhtml.FormDocument.Form form)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.w3.x1999.xhtml.FormDocument.Form target = null;
                target = (org.w3.x1999.xhtml.FormDocument.Form)get_store().find_element_user(FORM$34, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                target.set(form);
            }
        }
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "form" element
         */
        public org.w3.x1999.xhtml.FormDocument.Form insertNewForm(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.w3.x1999.xhtml.FormDocument.Form target = null;
                target = (org.w3.x1999.xhtml.FormDocument.Form)get_store().insert_element_user(FORM$34, i);
                return target;
            }
        }
        
        /**
         * Appends and returns a new empty value (as xml) as the last "form" element
         */
        public org.w3.x1999.xhtml.FormDocument.Form addNewForm()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.w3.x1999.xhtml.FormDocument.Form target = null;
                target = (org.w3.x1999.xhtml.FormDocument.Form)get_store().add_element_user(FORM$34);
                return target;
            }
        }
        
        /**
         * Removes the ith "form" element
         */
        public void removeForm(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(FORM$34, i);
            }
        }
        
        /**
         * Gets array of all "noscript" elements
         */
        public org.w3.x1999.xhtml.NoscriptDocument.Noscript[] getNoscriptArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                java.util.List targetList = new java.util.ArrayList();
                get_store().find_all_element_users(NOSCRIPT$36, targetList);
                org.w3.x1999.xhtml.NoscriptDocument.Noscript[] result = new org.w3.x1999.xhtml.NoscriptDocument.Noscript[targetList.size()];
                targetList.toArray(result);
                return result;
            }
        }
        
        /**
         * Gets ith "noscript" element
         */
        public org.w3.x1999.xhtml.NoscriptDocument.Noscript getNoscriptArray(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.w3.x1999.xhtml.NoscriptDocument.Noscript target = null;
                target = (org.w3.x1999.xhtml.NoscriptDocument.Noscript)get_store().find_element_user(NOSCRIPT$36, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                return target;
            }
        }
        
        /**
         * Returns number of "noscript" element
         */
        public int sizeOfNoscriptArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(NOSCRIPT$36);
            }
        }
        
        /**
         * Sets array of all "noscript" element  WARNING: This method is not atomicaly synchronized.
         */
        public void setNoscriptArray(org.w3.x1999.xhtml.NoscriptDocument.Noscript[] noscriptArray)
        {
            check_orphaned();
            arraySetterHelper(noscriptArray, NOSCRIPT$36);
        }
        
        /**
         * Sets ith "noscript" element
         */
        public void setNoscriptArray(int i, org.w3.x1999.xhtml.NoscriptDocument.Noscript noscript)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.w3.x1999.xhtml.NoscriptDocument.Noscript target = null;
                target = (org.w3.x1999.xhtml.NoscriptDocument.Noscript)get_store().find_element_user(NOSCRIPT$36, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                target.set(noscript);
            }
        }
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "noscript" element
         */
        public org.w3.x1999.xhtml.NoscriptDocument.Noscript insertNewNoscript(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.w3.x1999.xhtml.NoscriptDocument.Noscript target = null;
                target = (org.w3.x1999.xhtml.NoscriptDocument.Noscript)get_store().insert_element_user(NOSCRIPT$36, i);
                return target;
            }
        }
        
        /**
         * Appends and returns a new empty value (as xml) as the last "noscript" element
         */
        public org.w3.x1999.xhtml.NoscriptDocument.Noscript addNewNoscript()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.w3.x1999.xhtml.NoscriptDocument.Noscript target = null;
                target = (org.w3.x1999.xhtml.NoscriptDocument.Noscript)get_store().add_element_user(NOSCRIPT$36);
                return target;
            }
        }
        
        /**
         * Removes the ith "noscript" element
         */
        public void removeNoscript(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(NOSCRIPT$36, i);
            }
        }
        
        /**
         * Gets array of all "ins" elements
         */
        public org.w3.x1999.xhtml.InsDocument.Ins[] getInsArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                java.util.List targetList = new java.util.ArrayList();
                get_store().find_all_element_users(INS$38, targetList);
                org.w3.x1999.xhtml.InsDocument.Ins[] result = new org.w3.x1999.xhtml.InsDocument.Ins[targetList.size()];
                targetList.toArray(result);
                return result;
            }
        }
        
        /**
         * Gets ith "ins" element
         */
        public org.w3.x1999.xhtml.InsDocument.Ins getInsArray(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.w3.x1999.xhtml.InsDocument.Ins target = null;
                target = (org.w3.x1999.xhtml.InsDocument.Ins)get_store().find_element_user(INS$38, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                return target;
            }
        }
        
        /**
         * Returns number of "ins" element
         */
        public int sizeOfInsArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(INS$38);
            }
        }
        
        /**
         * Sets array of all "ins" element  WARNING: This method is not atomicaly synchronized.
         */
        public void setInsArray(org.w3.x1999.xhtml.InsDocument.Ins[] insArray)
        {
            check_orphaned();
            arraySetterHelper(insArray, INS$38);
        }
        
        /**
         * Sets ith "ins" element
         */
        public void setInsArray(int i, org.w3.x1999.xhtml.InsDocument.Ins ins)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.w3.x1999.xhtml.InsDocument.Ins target = null;
                target = (org.w3.x1999.xhtml.InsDocument.Ins)get_store().find_element_user(INS$38, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                target.set(ins);
            }
        }
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "ins" element
         */
        public org.w3.x1999.xhtml.InsDocument.Ins insertNewIns(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.w3.x1999.xhtml.InsDocument.Ins target = null;
                target = (org.w3.x1999.xhtml.InsDocument.Ins)get_store().insert_element_user(INS$38, i);
                return target;
            }
        }
        
        /**
         * Appends and returns a new empty value (as xml) as the last "ins" element
         */
        public org.w3.x1999.xhtml.InsDocument.Ins addNewIns()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.w3.x1999.xhtml.InsDocument.Ins target = null;
                target = (org.w3.x1999.xhtml.InsDocument.Ins)get_store().add_element_user(INS$38);
                return target;
            }
        }
        
        /**
         * Removes the ith "ins" element
         */
        public void removeIns(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(INS$38, i);
            }
        }
        
        /**
         * Gets array of all "del" elements
         */
        public org.w3.x1999.xhtml.DelDocument.Del[] getDelArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                java.util.List targetList = new java.util.ArrayList();
                get_store().find_all_element_users(DEL$40, targetList);
                org.w3.x1999.xhtml.DelDocument.Del[] result = new org.w3.x1999.xhtml.DelDocument.Del[targetList.size()];
                targetList.toArray(result);
                return result;
            }
        }
        
        /**
         * Gets ith "del" element
         */
        public org.w3.x1999.xhtml.DelDocument.Del getDelArray(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.w3.x1999.xhtml.DelDocument.Del target = null;
                target = (org.w3.x1999.xhtml.DelDocument.Del)get_store().find_element_user(DEL$40, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                return target;
            }
        }
        
        /**
         * Returns number of "del" element
         */
        public int sizeOfDelArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(DEL$40);
            }
        }
        
        /**
         * Sets array of all "del" element  WARNING: This method is not atomicaly synchronized.
         */
        public void setDelArray(org.w3.x1999.xhtml.DelDocument.Del[] delArray)
        {
            check_orphaned();
            arraySetterHelper(delArray, DEL$40);
        }
        
        /**
         * Sets ith "del" element
         */
        public void setDelArray(int i, org.w3.x1999.xhtml.DelDocument.Del del)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.w3.x1999.xhtml.DelDocument.Del target = null;
                target = (org.w3.x1999.xhtml.DelDocument.Del)get_store().find_element_user(DEL$40, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                target.set(del);
            }
        }
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "del" element
         */
        public org.w3.x1999.xhtml.DelDocument.Del insertNewDel(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.w3.x1999.xhtml.DelDocument.Del target = null;
                target = (org.w3.x1999.xhtml.DelDocument.Del)get_store().insert_element_user(DEL$40, i);
                return target;
            }
        }
        
        /**
         * Appends and returns a new empty value (as xml) as the last "del" element
         */
        public org.w3.x1999.xhtml.DelDocument.Del addNewDel()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.w3.x1999.xhtml.DelDocument.Del target = null;
                target = (org.w3.x1999.xhtml.DelDocument.Del)get_store().add_element_user(DEL$40);
                return target;
            }
        }
        
        /**
         * Removes the ith "del" element
         */
        public void removeDel(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(DEL$40, i);
            }
        }
        
        /**
         * Gets array of all "script" elements
         */
        public org.w3.x1999.xhtml.ScriptDocument.Script[] getScriptArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                java.util.List targetList = new java.util.ArrayList();
                get_store().find_all_element_users(SCRIPT$42, targetList);
                org.w3.x1999.xhtml.ScriptDocument.Script[] result = new org.w3.x1999.xhtml.ScriptDocument.Script[targetList.size()];
                targetList.toArray(result);
                return result;
            }
        }
        
        /**
         * Gets ith "script" element
         */
        public org.w3.x1999.xhtml.ScriptDocument.Script getScriptArray(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.w3.x1999.xhtml.ScriptDocument.Script target = null;
                target = (org.w3.x1999.xhtml.ScriptDocument.Script)get_store().find_element_user(SCRIPT$42, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                return target;
            }
        }
        
        /**
         * Returns number of "script" element
         */
        public int sizeOfScriptArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(SCRIPT$42);
            }
        }
        
        /**
         * Sets array of all "script" element  WARNING: This method is not atomicaly synchronized.
         */
        public void setScriptArray(org.w3.x1999.xhtml.ScriptDocument.Script[] scriptArray)
        {
            check_orphaned();
            arraySetterHelper(scriptArray, SCRIPT$42);
        }
        
        /**
         * Sets ith "script" element
         */
        public void setScriptArray(int i, org.w3.x1999.xhtml.ScriptDocument.Script script)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.w3.x1999.xhtml.ScriptDocument.Script target = null;
                target = (org.w3.x1999.xhtml.ScriptDocument.Script)get_store().find_element_user(SCRIPT$42, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                target.set(script);
            }
        }
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "script" element
         */
        public org.w3.x1999.xhtml.ScriptDocument.Script insertNewScript(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.w3.x1999.xhtml.ScriptDocument.Script target = null;
                target = (org.w3.x1999.xhtml.ScriptDocument.Script)get_store().insert_element_user(SCRIPT$42, i);
                return target;
            }
        }
        
        /**
         * Appends and returns a new empty value (as xml) as the last "script" element
         */
        public org.w3.x1999.xhtml.ScriptDocument.Script addNewScript()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.w3.x1999.xhtml.ScriptDocument.Script target = null;
                target = (org.w3.x1999.xhtml.ScriptDocument.Script)get_store().add_element_user(SCRIPT$42);
                return target;
            }
        }
        
        /**
         * Removes the ith "script" element
         */
        public void removeScript(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(SCRIPT$42, i);
            }
        }
        
        /**
         * Gets array of all "area" elements
         */
        public org.w3.x1999.xhtml.AreaDocument.Area[] getAreaArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                java.util.List targetList = new java.util.ArrayList();
                get_store().find_all_element_users(AREA$44, targetList);
                org.w3.x1999.xhtml.AreaDocument.Area[] result = new org.w3.x1999.xhtml.AreaDocument.Area[targetList.size()];
                targetList.toArray(result);
                return result;
            }
        }
        
        /**
         * Gets ith "area" element
         */
        public org.w3.x1999.xhtml.AreaDocument.Area getAreaArray(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.w3.x1999.xhtml.AreaDocument.Area target = null;
                target = (org.w3.x1999.xhtml.AreaDocument.Area)get_store().find_element_user(AREA$44, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                return target;
            }
        }
        
        /**
         * Returns number of "area" element
         */
        public int sizeOfAreaArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(AREA$44);
            }
        }
        
        /**
         * Sets array of all "area" element  WARNING: This method is not atomicaly synchronized.
         */
        public void setAreaArray(org.w3.x1999.xhtml.AreaDocument.Area[] areaArray)
        {
            check_orphaned();
            arraySetterHelper(areaArray, AREA$44);
        }
        
        /**
         * Sets ith "area" element
         */
        public void setAreaArray(int i, org.w3.x1999.xhtml.AreaDocument.Area area)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.w3.x1999.xhtml.AreaDocument.Area target = null;
                target = (org.w3.x1999.xhtml.AreaDocument.Area)get_store().find_element_user(AREA$44, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                target.set(area);
            }
        }
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "area" element
         */
        public org.w3.x1999.xhtml.AreaDocument.Area insertNewArea(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.w3.x1999.xhtml.AreaDocument.Area target = null;
                target = (org.w3.x1999.xhtml.AreaDocument.Area)get_store().insert_element_user(AREA$44, i);
                return target;
            }
        }
        
        /**
         * Appends and returns a new empty value (as xml) as the last "area" element
         */
        public org.w3.x1999.xhtml.AreaDocument.Area addNewArea()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.w3.x1999.xhtml.AreaDocument.Area target = null;
                target = (org.w3.x1999.xhtml.AreaDocument.Area)get_store().add_element_user(AREA$44);
                return target;
            }
        }
        
        /**
         * Removes the ith "area" element
         */
        public void removeArea(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(AREA$44, i);
            }
        }
        
        /**
         * Gets the "lang" attribute
         */
        public java.lang.String getLang()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(LANG$46);
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
                target = (org.w3.x1999.xhtml.LanguageCode)get_store().find_attribute_user(LANG$46);
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
                return get_store().find_attribute_user(LANG$46) != null;
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
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(LANG$46);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(LANG$46);
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
                target = (org.w3.x1999.xhtml.LanguageCode)get_store().find_attribute_user(LANG$46);
                if (target == null)
                {
                    target = (org.w3.x1999.xhtml.LanguageCode)get_store().add_attribute_user(LANG$46);
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
                get_store().remove_attribute(LANG$46);
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
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(LANG2$48);
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
                target = (org.apache.xmlbeans.XmlLanguage)get_store().find_attribute_user(LANG2$48);
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
                return get_store().find_attribute_user(LANG2$48) != null;
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
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(LANG2$48);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(LANG2$48);
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
                target = (org.apache.xmlbeans.XmlLanguage)get_store().find_attribute_user(LANG2$48);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlLanguage)get_store().add_attribute_user(LANG2$48);
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
                get_store().remove_attribute(LANG2$48);
            }
        }
        
        /**
         * Gets the "dir" attribute
         */
        public org.w3.x1999.xhtml.MapDocument.Map.Dir.Enum getDir()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(DIR$50);
                if (target == null)
                {
                    return null;
                }
                return (org.w3.x1999.xhtml.MapDocument.Map.Dir.Enum)target.getEnumValue();
            }
        }
        
        /**
         * Gets (as xml) the "dir" attribute
         */
        public org.w3.x1999.xhtml.MapDocument.Map.Dir xgetDir()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.w3.x1999.xhtml.MapDocument.Map.Dir target = null;
                target = (org.w3.x1999.xhtml.MapDocument.Map.Dir)get_store().find_attribute_user(DIR$50);
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
                return get_store().find_attribute_user(DIR$50) != null;
            }
        }
        
        /**
         * Sets the "dir" attribute
         */
        public void setDir(org.w3.x1999.xhtml.MapDocument.Map.Dir.Enum dir)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(DIR$50);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(DIR$50);
                }
                target.setEnumValue(dir);
            }
        }
        
        /**
         * Sets (as xml) the "dir" attribute
         */
        public void xsetDir(org.w3.x1999.xhtml.MapDocument.Map.Dir dir)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.w3.x1999.xhtml.MapDocument.Map.Dir target = null;
                target = (org.w3.x1999.xhtml.MapDocument.Map.Dir)get_store().find_attribute_user(DIR$50);
                if (target == null)
                {
                    target = (org.w3.x1999.xhtml.MapDocument.Map.Dir)get_store().add_attribute_user(DIR$50);
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
                get_store().remove_attribute(DIR$50);
            }
        }
        
        /**
         * Gets the "onclick" attribute
         */
        public java.lang.String getOnclick()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(ONCLICK$52);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "onclick" attribute
         */
        public org.w3.x1999.xhtml.Script xgetOnclick()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.w3.x1999.xhtml.Script target = null;
                target = (org.w3.x1999.xhtml.Script)get_store().find_attribute_user(ONCLICK$52);
                return target;
            }
        }
        
        /**
         * True if has "onclick" attribute
         */
        public boolean isSetOnclick()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().find_attribute_user(ONCLICK$52) != null;
            }
        }
        
        /**
         * Sets the "onclick" attribute
         */
        public void setOnclick(java.lang.String onclick)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(ONCLICK$52);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(ONCLICK$52);
                }
                target.setStringValue(onclick);
            }
        }
        
        /**
         * Sets (as xml) the "onclick" attribute
         */
        public void xsetOnclick(org.w3.x1999.xhtml.Script onclick)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.w3.x1999.xhtml.Script target = null;
                target = (org.w3.x1999.xhtml.Script)get_store().find_attribute_user(ONCLICK$52);
                if (target == null)
                {
                    target = (org.w3.x1999.xhtml.Script)get_store().add_attribute_user(ONCLICK$52);
                }
                target.set(onclick);
            }
        }
        
        /**
         * Unsets the "onclick" attribute
         */
        public void unsetOnclick()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_attribute(ONCLICK$52);
            }
        }
        
        /**
         * Gets the "ondblclick" attribute
         */
        public java.lang.String getOndblclick()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(ONDBLCLICK$54);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "ondblclick" attribute
         */
        public org.w3.x1999.xhtml.Script xgetOndblclick()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.w3.x1999.xhtml.Script target = null;
                target = (org.w3.x1999.xhtml.Script)get_store().find_attribute_user(ONDBLCLICK$54);
                return target;
            }
        }
        
        /**
         * True if has "ondblclick" attribute
         */
        public boolean isSetOndblclick()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().find_attribute_user(ONDBLCLICK$54) != null;
            }
        }
        
        /**
         * Sets the "ondblclick" attribute
         */
        public void setOndblclick(java.lang.String ondblclick)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(ONDBLCLICK$54);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(ONDBLCLICK$54);
                }
                target.setStringValue(ondblclick);
            }
        }
        
        /**
         * Sets (as xml) the "ondblclick" attribute
         */
        public void xsetOndblclick(org.w3.x1999.xhtml.Script ondblclick)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.w3.x1999.xhtml.Script target = null;
                target = (org.w3.x1999.xhtml.Script)get_store().find_attribute_user(ONDBLCLICK$54);
                if (target == null)
                {
                    target = (org.w3.x1999.xhtml.Script)get_store().add_attribute_user(ONDBLCLICK$54);
                }
                target.set(ondblclick);
            }
        }
        
        /**
         * Unsets the "ondblclick" attribute
         */
        public void unsetOndblclick()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_attribute(ONDBLCLICK$54);
            }
        }
        
        /**
         * Gets the "onmousedown" attribute
         */
        public java.lang.String getOnmousedown()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(ONMOUSEDOWN$56);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "onmousedown" attribute
         */
        public org.w3.x1999.xhtml.Script xgetOnmousedown()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.w3.x1999.xhtml.Script target = null;
                target = (org.w3.x1999.xhtml.Script)get_store().find_attribute_user(ONMOUSEDOWN$56);
                return target;
            }
        }
        
        /**
         * True if has "onmousedown" attribute
         */
        public boolean isSetOnmousedown()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().find_attribute_user(ONMOUSEDOWN$56) != null;
            }
        }
        
        /**
         * Sets the "onmousedown" attribute
         */
        public void setOnmousedown(java.lang.String onmousedown)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(ONMOUSEDOWN$56);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(ONMOUSEDOWN$56);
                }
                target.setStringValue(onmousedown);
            }
        }
        
        /**
         * Sets (as xml) the "onmousedown" attribute
         */
        public void xsetOnmousedown(org.w3.x1999.xhtml.Script onmousedown)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.w3.x1999.xhtml.Script target = null;
                target = (org.w3.x1999.xhtml.Script)get_store().find_attribute_user(ONMOUSEDOWN$56);
                if (target == null)
                {
                    target = (org.w3.x1999.xhtml.Script)get_store().add_attribute_user(ONMOUSEDOWN$56);
                }
                target.set(onmousedown);
            }
        }
        
        /**
         * Unsets the "onmousedown" attribute
         */
        public void unsetOnmousedown()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_attribute(ONMOUSEDOWN$56);
            }
        }
        
        /**
         * Gets the "onmouseup" attribute
         */
        public java.lang.String getOnmouseup()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(ONMOUSEUP$58);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "onmouseup" attribute
         */
        public org.w3.x1999.xhtml.Script xgetOnmouseup()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.w3.x1999.xhtml.Script target = null;
                target = (org.w3.x1999.xhtml.Script)get_store().find_attribute_user(ONMOUSEUP$58);
                return target;
            }
        }
        
        /**
         * True if has "onmouseup" attribute
         */
        public boolean isSetOnmouseup()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().find_attribute_user(ONMOUSEUP$58) != null;
            }
        }
        
        /**
         * Sets the "onmouseup" attribute
         */
        public void setOnmouseup(java.lang.String onmouseup)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(ONMOUSEUP$58);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(ONMOUSEUP$58);
                }
                target.setStringValue(onmouseup);
            }
        }
        
        /**
         * Sets (as xml) the "onmouseup" attribute
         */
        public void xsetOnmouseup(org.w3.x1999.xhtml.Script onmouseup)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.w3.x1999.xhtml.Script target = null;
                target = (org.w3.x1999.xhtml.Script)get_store().find_attribute_user(ONMOUSEUP$58);
                if (target == null)
                {
                    target = (org.w3.x1999.xhtml.Script)get_store().add_attribute_user(ONMOUSEUP$58);
                }
                target.set(onmouseup);
            }
        }
        
        /**
         * Unsets the "onmouseup" attribute
         */
        public void unsetOnmouseup()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_attribute(ONMOUSEUP$58);
            }
        }
        
        /**
         * Gets the "onmouseover" attribute
         */
        public java.lang.String getOnmouseover()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(ONMOUSEOVER$60);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "onmouseover" attribute
         */
        public org.w3.x1999.xhtml.Script xgetOnmouseover()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.w3.x1999.xhtml.Script target = null;
                target = (org.w3.x1999.xhtml.Script)get_store().find_attribute_user(ONMOUSEOVER$60);
                return target;
            }
        }
        
        /**
         * True if has "onmouseover" attribute
         */
        public boolean isSetOnmouseover()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().find_attribute_user(ONMOUSEOVER$60) != null;
            }
        }
        
        /**
         * Sets the "onmouseover" attribute
         */
        public void setOnmouseover(java.lang.String onmouseover)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(ONMOUSEOVER$60);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(ONMOUSEOVER$60);
                }
                target.setStringValue(onmouseover);
            }
        }
        
        /**
         * Sets (as xml) the "onmouseover" attribute
         */
        public void xsetOnmouseover(org.w3.x1999.xhtml.Script onmouseover)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.w3.x1999.xhtml.Script target = null;
                target = (org.w3.x1999.xhtml.Script)get_store().find_attribute_user(ONMOUSEOVER$60);
                if (target == null)
                {
                    target = (org.w3.x1999.xhtml.Script)get_store().add_attribute_user(ONMOUSEOVER$60);
                }
                target.set(onmouseover);
            }
        }
        
        /**
         * Unsets the "onmouseover" attribute
         */
        public void unsetOnmouseover()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_attribute(ONMOUSEOVER$60);
            }
        }
        
        /**
         * Gets the "onmousemove" attribute
         */
        public java.lang.String getOnmousemove()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(ONMOUSEMOVE$62);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "onmousemove" attribute
         */
        public org.w3.x1999.xhtml.Script xgetOnmousemove()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.w3.x1999.xhtml.Script target = null;
                target = (org.w3.x1999.xhtml.Script)get_store().find_attribute_user(ONMOUSEMOVE$62);
                return target;
            }
        }
        
        /**
         * True if has "onmousemove" attribute
         */
        public boolean isSetOnmousemove()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().find_attribute_user(ONMOUSEMOVE$62) != null;
            }
        }
        
        /**
         * Sets the "onmousemove" attribute
         */
        public void setOnmousemove(java.lang.String onmousemove)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(ONMOUSEMOVE$62);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(ONMOUSEMOVE$62);
                }
                target.setStringValue(onmousemove);
            }
        }
        
        /**
         * Sets (as xml) the "onmousemove" attribute
         */
        public void xsetOnmousemove(org.w3.x1999.xhtml.Script onmousemove)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.w3.x1999.xhtml.Script target = null;
                target = (org.w3.x1999.xhtml.Script)get_store().find_attribute_user(ONMOUSEMOVE$62);
                if (target == null)
                {
                    target = (org.w3.x1999.xhtml.Script)get_store().add_attribute_user(ONMOUSEMOVE$62);
                }
                target.set(onmousemove);
            }
        }
        
        /**
         * Unsets the "onmousemove" attribute
         */
        public void unsetOnmousemove()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_attribute(ONMOUSEMOVE$62);
            }
        }
        
        /**
         * Gets the "onmouseout" attribute
         */
        public java.lang.String getOnmouseout()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(ONMOUSEOUT$64);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "onmouseout" attribute
         */
        public org.w3.x1999.xhtml.Script xgetOnmouseout()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.w3.x1999.xhtml.Script target = null;
                target = (org.w3.x1999.xhtml.Script)get_store().find_attribute_user(ONMOUSEOUT$64);
                return target;
            }
        }
        
        /**
         * True if has "onmouseout" attribute
         */
        public boolean isSetOnmouseout()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().find_attribute_user(ONMOUSEOUT$64) != null;
            }
        }
        
        /**
         * Sets the "onmouseout" attribute
         */
        public void setOnmouseout(java.lang.String onmouseout)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(ONMOUSEOUT$64);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(ONMOUSEOUT$64);
                }
                target.setStringValue(onmouseout);
            }
        }
        
        /**
         * Sets (as xml) the "onmouseout" attribute
         */
        public void xsetOnmouseout(org.w3.x1999.xhtml.Script onmouseout)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.w3.x1999.xhtml.Script target = null;
                target = (org.w3.x1999.xhtml.Script)get_store().find_attribute_user(ONMOUSEOUT$64);
                if (target == null)
                {
                    target = (org.w3.x1999.xhtml.Script)get_store().add_attribute_user(ONMOUSEOUT$64);
                }
                target.set(onmouseout);
            }
        }
        
        /**
         * Unsets the "onmouseout" attribute
         */
        public void unsetOnmouseout()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_attribute(ONMOUSEOUT$64);
            }
        }
        
        /**
         * Gets the "onkeypress" attribute
         */
        public java.lang.String getOnkeypress()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(ONKEYPRESS$66);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "onkeypress" attribute
         */
        public org.w3.x1999.xhtml.Script xgetOnkeypress()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.w3.x1999.xhtml.Script target = null;
                target = (org.w3.x1999.xhtml.Script)get_store().find_attribute_user(ONKEYPRESS$66);
                return target;
            }
        }
        
        /**
         * True if has "onkeypress" attribute
         */
        public boolean isSetOnkeypress()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().find_attribute_user(ONKEYPRESS$66) != null;
            }
        }
        
        /**
         * Sets the "onkeypress" attribute
         */
        public void setOnkeypress(java.lang.String onkeypress)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(ONKEYPRESS$66);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(ONKEYPRESS$66);
                }
                target.setStringValue(onkeypress);
            }
        }
        
        /**
         * Sets (as xml) the "onkeypress" attribute
         */
        public void xsetOnkeypress(org.w3.x1999.xhtml.Script onkeypress)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.w3.x1999.xhtml.Script target = null;
                target = (org.w3.x1999.xhtml.Script)get_store().find_attribute_user(ONKEYPRESS$66);
                if (target == null)
                {
                    target = (org.w3.x1999.xhtml.Script)get_store().add_attribute_user(ONKEYPRESS$66);
                }
                target.set(onkeypress);
            }
        }
        
        /**
         * Unsets the "onkeypress" attribute
         */
        public void unsetOnkeypress()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_attribute(ONKEYPRESS$66);
            }
        }
        
        /**
         * Gets the "onkeydown" attribute
         */
        public java.lang.String getOnkeydown()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(ONKEYDOWN$68);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "onkeydown" attribute
         */
        public org.w3.x1999.xhtml.Script xgetOnkeydown()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.w3.x1999.xhtml.Script target = null;
                target = (org.w3.x1999.xhtml.Script)get_store().find_attribute_user(ONKEYDOWN$68);
                return target;
            }
        }
        
        /**
         * True if has "onkeydown" attribute
         */
        public boolean isSetOnkeydown()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().find_attribute_user(ONKEYDOWN$68) != null;
            }
        }
        
        /**
         * Sets the "onkeydown" attribute
         */
        public void setOnkeydown(java.lang.String onkeydown)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(ONKEYDOWN$68);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(ONKEYDOWN$68);
                }
                target.setStringValue(onkeydown);
            }
        }
        
        /**
         * Sets (as xml) the "onkeydown" attribute
         */
        public void xsetOnkeydown(org.w3.x1999.xhtml.Script onkeydown)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.w3.x1999.xhtml.Script target = null;
                target = (org.w3.x1999.xhtml.Script)get_store().find_attribute_user(ONKEYDOWN$68);
                if (target == null)
                {
                    target = (org.w3.x1999.xhtml.Script)get_store().add_attribute_user(ONKEYDOWN$68);
                }
                target.set(onkeydown);
            }
        }
        
        /**
         * Unsets the "onkeydown" attribute
         */
        public void unsetOnkeydown()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_attribute(ONKEYDOWN$68);
            }
        }
        
        /**
         * Gets the "onkeyup" attribute
         */
        public java.lang.String getOnkeyup()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(ONKEYUP$70);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "onkeyup" attribute
         */
        public org.w3.x1999.xhtml.Script xgetOnkeyup()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.w3.x1999.xhtml.Script target = null;
                target = (org.w3.x1999.xhtml.Script)get_store().find_attribute_user(ONKEYUP$70);
                return target;
            }
        }
        
        /**
         * True if has "onkeyup" attribute
         */
        public boolean isSetOnkeyup()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().find_attribute_user(ONKEYUP$70) != null;
            }
        }
        
        /**
         * Sets the "onkeyup" attribute
         */
        public void setOnkeyup(java.lang.String onkeyup)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(ONKEYUP$70);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(ONKEYUP$70);
                }
                target.setStringValue(onkeyup);
            }
        }
        
        /**
         * Sets (as xml) the "onkeyup" attribute
         */
        public void xsetOnkeyup(org.w3.x1999.xhtml.Script onkeyup)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.w3.x1999.xhtml.Script target = null;
                target = (org.w3.x1999.xhtml.Script)get_store().find_attribute_user(ONKEYUP$70);
                if (target == null)
                {
                    target = (org.w3.x1999.xhtml.Script)get_store().add_attribute_user(ONKEYUP$70);
                }
                target.set(onkeyup);
            }
        }
        
        /**
         * Unsets the "onkeyup" attribute
         */
        public void unsetOnkeyup()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_attribute(ONKEYUP$70);
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
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(ID$72);
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
                target = (org.apache.xmlbeans.XmlID)get_store().find_attribute_user(ID$72);
                return target;
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
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(ID$72);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(ID$72);
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
                target = (org.apache.xmlbeans.XmlID)get_store().find_attribute_user(ID$72);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlID)get_store().add_attribute_user(ID$72);
                }
                target.set(id);
            }
        }
        
        /**
         * Gets the "class" attribute
         */
        public org.apache.xmlbeans.XmlAnySimpleType getClass1()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlAnySimpleType target = null;
                target = (org.apache.xmlbeans.XmlAnySimpleType)get_store().find_attribute_user(CLASS1$74);
                if (target == null)
                {
                    return null;
                }
                return target;
            }
        }
        
        /**
         * True if has "class" attribute
         */
        public boolean isSetClass1()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().find_attribute_user(CLASS1$74) != null;
            }
        }
        
        /**
         * Sets the "class" attribute
         */
        public void setClass1(org.apache.xmlbeans.XmlAnySimpleType class1)
        {
            generatedSetterHelperImpl(class1, CLASS1$74, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
        }
        
        /**
         * Appends and returns a new empty "class" attribute
         */
        public org.apache.xmlbeans.XmlAnySimpleType addNewClass1()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlAnySimpleType target = null;
                target = (org.apache.xmlbeans.XmlAnySimpleType)get_store().add_attribute_user(CLASS1$74);
                return target;
            }
        }
        
        /**
         * Unsets the "class" attribute
         */
        public void unsetClass1()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_attribute(CLASS1$74);
            }
        }
        
        /**
         * Gets the "style" attribute
         */
        public java.lang.String getStyle()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(STYLE$76);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "style" attribute
         */
        public org.w3.x1999.xhtml.StyleSheet xgetStyle()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.w3.x1999.xhtml.StyleSheet target = null;
                target = (org.w3.x1999.xhtml.StyleSheet)get_store().find_attribute_user(STYLE$76);
                return target;
            }
        }
        
        /**
         * True if has "style" attribute
         */
        public boolean isSetStyle()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().find_attribute_user(STYLE$76) != null;
            }
        }
        
        /**
         * Sets the "style" attribute
         */
        public void setStyle(java.lang.String style)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(STYLE$76);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(STYLE$76);
                }
                target.setStringValue(style);
            }
        }
        
        /**
         * Sets (as xml) the "style" attribute
         */
        public void xsetStyle(org.w3.x1999.xhtml.StyleSheet style)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.w3.x1999.xhtml.StyleSheet target = null;
                target = (org.w3.x1999.xhtml.StyleSheet)get_store().find_attribute_user(STYLE$76);
                if (target == null)
                {
                    target = (org.w3.x1999.xhtml.StyleSheet)get_store().add_attribute_user(STYLE$76);
                }
                target.set(style);
            }
        }
        
        /**
         * Unsets the "style" attribute
         */
        public void unsetStyle()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_attribute(STYLE$76);
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
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(TITLE$78);
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
                target = (org.w3.x1999.xhtml.Text)get_store().find_attribute_user(TITLE$78);
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
                return get_store().find_attribute_user(TITLE$78) != null;
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
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(TITLE$78);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(TITLE$78);
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
                target = (org.w3.x1999.xhtml.Text)get_store().find_attribute_user(TITLE$78);
                if (target == null)
                {
                    target = (org.w3.x1999.xhtml.Text)get_store().add_attribute_user(TITLE$78);
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
                get_store().remove_attribute(TITLE$78);
            }
        }
        
        /**
         * Gets the "name" attribute
         */
        public java.lang.String getName()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(NAME$80);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "name" attribute
         */
        public org.apache.xmlbeans.XmlNMTOKEN xgetName()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlNMTOKEN target = null;
                target = (org.apache.xmlbeans.XmlNMTOKEN)get_store().find_attribute_user(NAME$80);
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
                return get_store().find_attribute_user(NAME$80) != null;
            }
        }
        
        /**
         * Sets the "name" attribute
         */
        public void setName(java.lang.String name)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(NAME$80);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(NAME$80);
                }
                target.setStringValue(name);
            }
        }
        
        /**
         * Sets (as xml) the "name" attribute
         */
        public void xsetName(org.apache.xmlbeans.XmlNMTOKEN name)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlNMTOKEN target = null;
                target = (org.apache.xmlbeans.XmlNMTOKEN)get_store().find_attribute_user(NAME$80);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlNMTOKEN)get_store().add_attribute_user(NAME$80);
                }
                target.set(name);
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
                get_store().remove_attribute(NAME$80);
            }
        }
        /**
         * An XML dir(@).
         *
         * This is an atomic type that is a restriction of org.w3.x1999.xhtml.MapDocument$Map$Dir.
         */
        public static class DirImpl extends org.apache.xmlbeans.impl.values.JavaStringEnumerationHolderEx implements org.w3.x1999.xhtml.MapDocument.Map.Dir
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
