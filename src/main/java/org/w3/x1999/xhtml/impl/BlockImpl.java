/*
 * XML Type:  Block
 * Namespace: http://www.w3.org/1999/xhtml
 * Java type: org.w3.x1999.xhtml.Block
 *
 * Automatically generated - do not modify.
 */
package org.w3.x1999.xhtml.impl;
/**
 * An XML Block(@http://www.w3.org/1999/xhtml).
 *
 * This is a complex type.
 */
public class BlockImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.w3.x1999.xhtml.Block
{
    private static final long serialVersionUID = 1L;
    
    public BlockImpl(org.apache.xmlbeans.SchemaType sType)
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
}
