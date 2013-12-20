/*
 * XML Type:  a.content
 * Namespace: http://www.w3.org/1999/xhtml
 * Java type: org.w3.x1999.xhtml.AContent
 *
 * Automatically generated - do not modify.
 */
package org.w3.x1999.xhtml.impl;
/**
 * An XML a.content(@http://www.w3.org/1999/xhtml).
 *
 * This is a complex type.
 */
public class AContentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.w3.x1999.xhtml.AContent
{
    private static final long serialVersionUID = 1L;
    
    public AContentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName BR$0 = 
        new javax.xml.namespace.QName("http://www.w3.org/1999/xhtml", "br");
    private static final javax.xml.namespace.QName SPAN$2 = 
        new javax.xml.namespace.QName("http://www.w3.org/1999/xhtml", "span");
    private static final javax.xml.namespace.QName BDO$4 = 
        new javax.xml.namespace.QName("http://www.w3.org/1999/xhtml", "bdo");
    private static final javax.xml.namespace.QName MAP$6 = 
        new javax.xml.namespace.QName("http://www.w3.org/1999/xhtml", "map");
    private static final javax.xml.namespace.QName OBJECT$8 = 
        new javax.xml.namespace.QName("http://www.w3.org/1999/xhtml", "object");
    private static final javax.xml.namespace.QName IMG$10 = 
        new javax.xml.namespace.QName("http://www.w3.org/1999/xhtml", "img");
    private static final javax.xml.namespace.QName TT$12 = 
        new javax.xml.namespace.QName("http://www.w3.org/1999/xhtml", "tt");
    private static final javax.xml.namespace.QName I$14 = 
        new javax.xml.namespace.QName("http://www.w3.org/1999/xhtml", "i");
    private static final javax.xml.namespace.QName B$16 = 
        new javax.xml.namespace.QName("http://www.w3.org/1999/xhtml", "b");
    private static final javax.xml.namespace.QName BIG$18 = 
        new javax.xml.namespace.QName("http://www.w3.org/1999/xhtml", "big");
    private static final javax.xml.namespace.QName SMALL$20 = 
        new javax.xml.namespace.QName("http://www.w3.org/1999/xhtml", "small");
    private static final javax.xml.namespace.QName EM$22 = 
        new javax.xml.namespace.QName("http://www.w3.org/1999/xhtml", "em");
    private static final javax.xml.namespace.QName STRONG$24 = 
        new javax.xml.namespace.QName("http://www.w3.org/1999/xhtml", "strong");
    private static final javax.xml.namespace.QName DFN$26 = 
        new javax.xml.namespace.QName("http://www.w3.org/1999/xhtml", "dfn");
    private static final javax.xml.namespace.QName CODE$28 = 
        new javax.xml.namespace.QName("http://www.w3.org/1999/xhtml", "code");
    private static final javax.xml.namespace.QName Q$30 = 
        new javax.xml.namespace.QName("http://www.w3.org/1999/xhtml", "q");
    private static final javax.xml.namespace.QName SAMP$32 = 
        new javax.xml.namespace.QName("http://www.w3.org/1999/xhtml", "samp");
    private static final javax.xml.namespace.QName KBD$34 = 
        new javax.xml.namespace.QName("http://www.w3.org/1999/xhtml", "kbd");
    private static final javax.xml.namespace.QName VAR$36 = 
        new javax.xml.namespace.QName("http://www.w3.org/1999/xhtml", "var");
    private static final javax.xml.namespace.QName CITE$38 = 
        new javax.xml.namespace.QName("http://www.w3.org/1999/xhtml", "cite");
    private static final javax.xml.namespace.QName ABBR$40 = 
        new javax.xml.namespace.QName("http://www.w3.org/1999/xhtml", "abbr");
    private static final javax.xml.namespace.QName ACRONYM$42 = 
        new javax.xml.namespace.QName("http://www.w3.org/1999/xhtml", "acronym");
    private static final javax.xml.namespace.QName SUB$44 = 
        new javax.xml.namespace.QName("http://www.w3.org/1999/xhtml", "sub");
    private static final javax.xml.namespace.QName SUP$46 = 
        new javax.xml.namespace.QName("http://www.w3.org/1999/xhtml", "sup");
    private static final javax.xml.namespace.QName INPUT$48 = 
        new javax.xml.namespace.QName("http://www.w3.org/1999/xhtml", "input");
    private static final javax.xml.namespace.QName SELECT$50 = 
        new javax.xml.namespace.QName("http://www.w3.org/1999/xhtml", "select");
    private static final javax.xml.namespace.QName TEXTAREA$52 = 
        new javax.xml.namespace.QName("http://www.w3.org/1999/xhtml", "textarea");
    private static final javax.xml.namespace.QName LABEL$54 = 
        new javax.xml.namespace.QName("http://www.w3.org/1999/xhtml", "label");
    private static final javax.xml.namespace.QName BUTTON$56 = 
        new javax.xml.namespace.QName("http://www.w3.org/1999/xhtml", "button");
    private static final javax.xml.namespace.QName INS$58 = 
        new javax.xml.namespace.QName("http://www.w3.org/1999/xhtml", "ins");
    private static final javax.xml.namespace.QName DEL$60 = 
        new javax.xml.namespace.QName("http://www.w3.org/1999/xhtml", "del");
    private static final javax.xml.namespace.QName SCRIPT$62 = 
        new javax.xml.namespace.QName("http://www.w3.org/1999/xhtml", "script");
    
    
    /**
     * Gets array of all "br" elements
     */
    public org.w3.x1999.xhtml.BrDocument.Br[] getBrArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(BR$0, targetList);
            org.w3.x1999.xhtml.BrDocument.Br[] result = new org.w3.x1999.xhtml.BrDocument.Br[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "br" element
     */
    public org.w3.x1999.xhtml.BrDocument.Br getBrArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.w3.x1999.xhtml.BrDocument.Br target = null;
            target = (org.w3.x1999.xhtml.BrDocument.Br)get_store().find_element_user(BR$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "br" element
     */
    public int sizeOfBrArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(BR$0);
        }
    }
    
    /**
     * Sets array of all "br" element  WARNING: This method is not atomicaly synchronized.
     */
    public void setBrArray(org.w3.x1999.xhtml.BrDocument.Br[] brArray)
    {
        check_orphaned();
        arraySetterHelper(brArray, BR$0);
    }
    
    /**
     * Sets ith "br" element
     */
    public void setBrArray(int i, org.w3.x1999.xhtml.BrDocument.Br br)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.w3.x1999.xhtml.BrDocument.Br target = null;
            target = (org.w3.x1999.xhtml.BrDocument.Br)get_store().find_element_user(BR$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(br);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "br" element
     */
    public org.w3.x1999.xhtml.BrDocument.Br insertNewBr(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.w3.x1999.xhtml.BrDocument.Br target = null;
            target = (org.w3.x1999.xhtml.BrDocument.Br)get_store().insert_element_user(BR$0, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "br" element
     */
    public org.w3.x1999.xhtml.BrDocument.Br addNewBr()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.w3.x1999.xhtml.BrDocument.Br target = null;
            target = (org.w3.x1999.xhtml.BrDocument.Br)get_store().add_element_user(BR$0);
            return target;
        }
    }
    
    /**
     * Removes the ith "br" element
     */
    public void removeBr(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(BR$0, i);
        }
    }
    
    /**
     * Gets array of all "span" elements
     */
    public org.w3.x1999.xhtml.SpanDocument.Span[] getSpanArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(SPAN$2, targetList);
            org.w3.x1999.xhtml.SpanDocument.Span[] result = new org.w3.x1999.xhtml.SpanDocument.Span[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "span" element
     */
    public org.w3.x1999.xhtml.SpanDocument.Span getSpanArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.w3.x1999.xhtml.SpanDocument.Span target = null;
            target = (org.w3.x1999.xhtml.SpanDocument.Span)get_store().find_element_user(SPAN$2, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "span" element
     */
    public int sizeOfSpanArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(SPAN$2);
        }
    }
    
    /**
     * Sets array of all "span" element  WARNING: This method is not atomicaly synchronized.
     */
    public void setSpanArray(org.w3.x1999.xhtml.SpanDocument.Span[] spanArray)
    {
        check_orphaned();
        arraySetterHelper(spanArray, SPAN$2);
    }
    
    /**
     * Sets ith "span" element
     */
    public void setSpanArray(int i, org.w3.x1999.xhtml.SpanDocument.Span span)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.w3.x1999.xhtml.SpanDocument.Span target = null;
            target = (org.w3.x1999.xhtml.SpanDocument.Span)get_store().find_element_user(SPAN$2, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(span);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "span" element
     */
    public org.w3.x1999.xhtml.SpanDocument.Span insertNewSpan(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.w3.x1999.xhtml.SpanDocument.Span target = null;
            target = (org.w3.x1999.xhtml.SpanDocument.Span)get_store().insert_element_user(SPAN$2, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "span" element
     */
    public org.w3.x1999.xhtml.SpanDocument.Span addNewSpan()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.w3.x1999.xhtml.SpanDocument.Span target = null;
            target = (org.w3.x1999.xhtml.SpanDocument.Span)get_store().add_element_user(SPAN$2);
            return target;
        }
    }
    
    /**
     * Removes the ith "span" element
     */
    public void removeSpan(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(SPAN$2, i);
        }
    }
    
    /**
     * Gets array of all "bdo" elements
     */
    public org.w3.x1999.xhtml.BdoDocument.Bdo[] getBdoArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(BDO$4, targetList);
            org.w3.x1999.xhtml.BdoDocument.Bdo[] result = new org.w3.x1999.xhtml.BdoDocument.Bdo[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "bdo" element
     */
    public org.w3.x1999.xhtml.BdoDocument.Bdo getBdoArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.w3.x1999.xhtml.BdoDocument.Bdo target = null;
            target = (org.w3.x1999.xhtml.BdoDocument.Bdo)get_store().find_element_user(BDO$4, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "bdo" element
     */
    public int sizeOfBdoArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(BDO$4);
        }
    }
    
    /**
     * Sets array of all "bdo" element  WARNING: This method is not atomicaly synchronized.
     */
    public void setBdoArray(org.w3.x1999.xhtml.BdoDocument.Bdo[] bdoArray)
    {
        check_orphaned();
        arraySetterHelper(bdoArray, BDO$4);
    }
    
    /**
     * Sets ith "bdo" element
     */
    public void setBdoArray(int i, org.w3.x1999.xhtml.BdoDocument.Bdo bdo)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.w3.x1999.xhtml.BdoDocument.Bdo target = null;
            target = (org.w3.x1999.xhtml.BdoDocument.Bdo)get_store().find_element_user(BDO$4, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(bdo);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "bdo" element
     */
    public org.w3.x1999.xhtml.BdoDocument.Bdo insertNewBdo(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.w3.x1999.xhtml.BdoDocument.Bdo target = null;
            target = (org.w3.x1999.xhtml.BdoDocument.Bdo)get_store().insert_element_user(BDO$4, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "bdo" element
     */
    public org.w3.x1999.xhtml.BdoDocument.Bdo addNewBdo()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.w3.x1999.xhtml.BdoDocument.Bdo target = null;
            target = (org.w3.x1999.xhtml.BdoDocument.Bdo)get_store().add_element_user(BDO$4);
            return target;
        }
    }
    
    /**
     * Removes the ith "bdo" element
     */
    public void removeBdo(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(BDO$4, i);
        }
    }
    
    /**
     * Gets array of all "map" elements
     */
    public org.w3.x1999.xhtml.MapDocument.Map[] getMapArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(MAP$6, targetList);
            org.w3.x1999.xhtml.MapDocument.Map[] result = new org.w3.x1999.xhtml.MapDocument.Map[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "map" element
     */
    public org.w3.x1999.xhtml.MapDocument.Map getMapArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.w3.x1999.xhtml.MapDocument.Map target = null;
            target = (org.w3.x1999.xhtml.MapDocument.Map)get_store().find_element_user(MAP$6, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "map" element
     */
    public int sizeOfMapArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(MAP$6);
        }
    }
    
    /**
     * Sets array of all "map" element  WARNING: This method is not atomicaly synchronized.
     */
    public void setMapArray(org.w3.x1999.xhtml.MapDocument.Map[] mapArray)
    {
        check_orphaned();
        arraySetterHelper(mapArray, MAP$6);
    }
    
    /**
     * Sets ith "map" element
     */
    public void setMapArray(int i, org.w3.x1999.xhtml.MapDocument.Map map)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.w3.x1999.xhtml.MapDocument.Map target = null;
            target = (org.w3.x1999.xhtml.MapDocument.Map)get_store().find_element_user(MAP$6, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(map);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "map" element
     */
    public org.w3.x1999.xhtml.MapDocument.Map insertNewMap(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.w3.x1999.xhtml.MapDocument.Map target = null;
            target = (org.w3.x1999.xhtml.MapDocument.Map)get_store().insert_element_user(MAP$6, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "map" element
     */
    public org.w3.x1999.xhtml.MapDocument.Map addNewMap()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.w3.x1999.xhtml.MapDocument.Map target = null;
            target = (org.w3.x1999.xhtml.MapDocument.Map)get_store().add_element_user(MAP$6);
            return target;
        }
    }
    
    /**
     * Removes the ith "map" element
     */
    public void removeMap(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(MAP$6, i);
        }
    }
    
    /**
     * Gets array of all "object" elements
     */
    public org.w3.x1999.xhtml.ObjectDocument.Object[] getObjectArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(OBJECT$8, targetList);
            org.w3.x1999.xhtml.ObjectDocument.Object[] result = new org.w3.x1999.xhtml.ObjectDocument.Object[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "object" element
     */
    public org.w3.x1999.xhtml.ObjectDocument.Object getObjectArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.w3.x1999.xhtml.ObjectDocument.Object target = null;
            target = (org.w3.x1999.xhtml.ObjectDocument.Object)get_store().find_element_user(OBJECT$8, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "object" element
     */
    public int sizeOfObjectArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(OBJECT$8);
        }
    }
    
    /**
     * Sets array of all "object" element  WARNING: This method is not atomicaly synchronized.
     */
    public void setObjectArray(org.w3.x1999.xhtml.ObjectDocument.Object[] objectArray)
    {
        check_orphaned();
        arraySetterHelper(objectArray, OBJECT$8);
    }
    
    /**
     * Sets ith "object" element
     */
    public void setObjectArray(int i, org.w3.x1999.xhtml.ObjectDocument.Object object)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.w3.x1999.xhtml.ObjectDocument.Object target = null;
            target = (org.w3.x1999.xhtml.ObjectDocument.Object)get_store().find_element_user(OBJECT$8, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(object);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "object" element
     */
    public org.w3.x1999.xhtml.ObjectDocument.Object insertNewObject(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.w3.x1999.xhtml.ObjectDocument.Object target = null;
            target = (org.w3.x1999.xhtml.ObjectDocument.Object)get_store().insert_element_user(OBJECT$8, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "object" element
     */
    public org.w3.x1999.xhtml.ObjectDocument.Object addNewObject()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.w3.x1999.xhtml.ObjectDocument.Object target = null;
            target = (org.w3.x1999.xhtml.ObjectDocument.Object)get_store().add_element_user(OBJECT$8);
            return target;
        }
    }
    
    /**
     * Removes the ith "object" element
     */
    public void removeObject(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(OBJECT$8, i);
        }
    }
    
    /**
     * Gets array of all "img" elements
     */
    public org.w3.x1999.xhtml.ImgDocument.Img[] getImgArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(IMG$10, targetList);
            org.w3.x1999.xhtml.ImgDocument.Img[] result = new org.w3.x1999.xhtml.ImgDocument.Img[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "img" element
     */
    public org.w3.x1999.xhtml.ImgDocument.Img getImgArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.w3.x1999.xhtml.ImgDocument.Img target = null;
            target = (org.w3.x1999.xhtml.ImgDocument.Img)get_store().find_element_user(IMG$10, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "img" element
     */
    public int sizeOfImgArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(IMG$10);
        }
    }
    
    /**
     * Sets array of all "img" element  WARNING: This method is not atomicaly synchronized.
     */
    public void setImgArray(org.w3.x1999.xhtml.ImgDocument.Img[] imgArray)
    {
        check_orphaned();
        arraySetterHelper(imgArray, IMG$10);
    }
    
    /**
     * Sets ith "img" element
     */
    public void setImgArray(int i, org.w3.x1999.xhtml.ImgDocument.Img img)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.w3.x1999.xhtml.ImgDocument.Img target = null;
            target = (org.w3.x1999.xhtml.ImgDocument.Img)get_store().find_element_user(IMG$10, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(img);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "img" element
     */
    public org.w3.x1999.xhtml.ImgDocument.Img insertNewImg(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.w3.x1999.xhtml.ImgDocument.Img target = null;
            target = (org.w3.x1999.xhtml.ImgDocument.Img)get_store().insert_element_user(IMG$10, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "img" element
     */
    public org.w3.x1999.xhtml.ImgDocument.Img addNewImg()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.w3.x1999.xhtml.ImgDocument.Img target = null;
            target = (org.w3.x1999.xhtml.ImgDocument.Img)get_store().add_element_user(IMG$10);
            return target;
        }
    }
    
    /**
     * Removes the ith "img" element
     */
    public void removeImg(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(IMG$10, i);
        }
    }
    
    /**
     * Gets array of all "tt" elements
     */
    public org.w3.x1999.xhtml.TtDocument.Tt[] getTtArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(TT$12, targetList);
            org.w3.x1999.xhtml.TtDocument.Tt[] result = new org.w3.x1999.xhtml.TtDocument.Tt[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "tt" element
     */
    public org.w3.x1999.xhtml.TtDocument.Tt getTtArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.w3.x1999.xhtml.TtDocument.Tt target = null;
            target = (org.w3.x1999.xhtml.TtDocument.Tt)get_store().find_element_user(TT$12, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "tt" element
     */
    public int sizeOfTtArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(TT$12);
        }
    }
    
    /**
     * Sets array of all "tt" element  WARNING: This method is not atomicaly synchronized.
     */
    public void setTtArray(org.w3.x1999.xhtml.TtDocument.Tt[] ttArray)
    {
        check_orphaned();
        arraySetterHelper(ttArray, TT$12);
    }
    
    /**
     * Sets ith "tt" element
     */
    public void setTtArray(int i, org.w3.x1999.xhtml.TtDocument.Tt tt)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.w3.x1999.xhtml.TtDocument.Tt target = null;
            target = (org.w3.x1999.xhtml.TtDocument.Tt)get_store().find_element_user(TT$12, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(tt);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "tt" element
     */
    public org.w3.x1999.xhtml.TtDocument.Tt insertNewTt(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.w3.x1999.xhtml.TtDocument.Tt target = null;
            target = (org.w3.x1999.xhtml.TtDocument.Tt)get_store().insert_element_user(TT$12, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "tt" element
     */
    public org.w3.x1999.xhtml.TtDocument.Tt addNewTt()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.w3.x1999.xhtml.TtDocument.Tt target = null;
            target = (org.w3.x1999.xhtml.TtDocument.Tt)get_store().add_element_user(TT$12);
            return target;
        }
    }
    
    /**
     * Removes the ith "tt" element
     */
    public void removeTt(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(TT$12, i);
        }
    }
    
    /**
     * Gets array of all "i" elements
     */
    public org.w3.x1999.xhtml.IDocument.I[] getIArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(I$14, targetList);
            org.w3.x1999.xhtml.IDocument.I[] result = new org.w3.x1999.xhtml.IDocument.I[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "i" element
     */
    public org.w3.x1999.xhtml.IDocument.I getIArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.w3.x1999.xhtml.IDocument.I target = null;
            target = (org.w3.x1999.xhtml.IDocument.I)get_store().find_element_user(I$14, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "i" element
     */
    public int sizeOfIArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(I$14);
        }
    }
    
    /**
     * Sets array of all "i" element  WARNING: This method is not atomicaly synchronized.
     */
    public void setIArray(org.w3.x1999.xhtml.IDocument.I[] iValueArray)
    {
        check_orphaned();
        arraySetterHelper(iValueArray, I$14);
    }
    
    /**
     * Sets ith "i" element
     */
    public void setIArray(int i, org.w3.x1999.xhtml.IDocument.I iValue)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.w3.x1999.xhtml.IDocument.I target = null;
            target = (org.w3.x1999.xhtml.IDocument.I)get_store().find_element_user(I$14, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(iValue);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "i" element
     */
    public org.w3.x1999.xhtml.IDocument.I insertNewI(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.w3.x1999.xhtml.IDocument.I target = null;
            target = (org.w3.x1999.xhtml.IDocument.I)get_store().insert_element_user(I$14, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "i" element
     */
    public org.w3.x1999.xhtml.IDocument.I addNewI()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.w3.x1999.xhtml.IDocument.I target = null;
            target = (org.w3.x1999.xhtml.IDocument.I)get_store().add_element_user(I$14);
            return target;
        }
    }
    
    /**
     * Removes the ith "i" element
     */
    public void removeI(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(I$14, i);
        }
    }
    
    /**
     * Gets array of all "b" elements
     */
    public org.w3.x1999.xhtml.BDocument.B[] getBArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(B$16, targetList);
            org.w3.x1999.xhtml.BDocument.B[] result = new org.w3.x1999.xhtml.BDocument.B[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "b" element
     */
    public org.w3.x1999.xhtml.BDocument.B getBArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.w3.x1999.xhtml.BDocument.B target = null;
            target = (org.w3.x1999.xhtml.BDocument.B)get_store().find_element_user(B$16, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "b" element
     */
    public int sizeOfBArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(B$16);
        }
    }
    
    /**
     * Sets array of all "b" element  WARNING: This method is not atomicaly synchronized.
     */
    public void setBArray(org.w3.x1999.xhtml.BDocument.B[] bArray)
    {
        check_orphaned();
        arraySetterHelper(bArray, B$16);
    }
    
    /**
     * Sets ith "b" element
     */
    public void setBArray(int i, org.w3.x1999.xhtml.BDocument.B b)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.w3.x1999.xhtml.BDocument.B target = null;
            target = (org.w3.x1999.xhtml.BDocument.B)get_store().find_element_user(B$16, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(b);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "b" element
     */
    public org.w3.x1999.xhtml.BDocument.B insertNewB(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.w3.x1999.xhtml.BDocument.B target = null;
            target = (org.w3.x1999.xhtml.BDocument.B)get_store().insert_element_user(B$16, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "b" element
     */
    public org.w3.x1999.xhtml.BDocument.B addNewB()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.w3.x1999.xhtml.BDocument.B target = null;
            target = (org.w3.x1999.xhtml.BDocument.B)get_store().add_element_user(B$16);
            return target;
        }
    }
    
    /**
     * Removes the ith "b" element
     */
    public void removeB(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(B$16, i);
        }
    }
    
    /**
     * Gets array of all "big" elements
     */
    public org.w3.x1999.xhtml.BigDocument.Big[] getBigArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(BIG$18, targetList);
            org.w3.x1999.xhtml.BigDocument.Big[] result = new org.w3.x1999.xhtml.BigDocument.Big[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "big" element
     */
    public org.w3.x1999.xhtml.BigDocument.Big getBigArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.w3.x1999.xhtml.BigDocument.Big target = null;
            target = (org.w3.x1999.xhtml.BigDocument.Big)get_store().find_element_user(BIG$18, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "big" element
     */
    public int sizeOfBigArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(BIG$18);
        }
    }
    
    /**
     * Sets array of all "big" element  WARNING: This method is not atomicaly synchronized.
     */
    public void setBigArray(org.w3.x1999.xhtml.BigDocument.Big[] bigArray)
    {
        check_orphaned();
        arraySetterHelper(bigArray, BIG$18);
    }
    
    /**
     * Sets ith "big" element
     */
    public void setBigArray(int i, org.w3.x1999.xhtml.BigDocument.Big big)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.w3.x1999.xhtml.BigDocument.Big target = null;
            target = (org.w3.x1999.xhtml.BigDocument.Big)get_store().find_element_user(BIG$18, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(big);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "big" element
     */
    public org.w3.x1999.xhtml.BigDocument.Big insertNewBig(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.w3.x1999.xhtml.BigDocument.Big target = null;
            target = (org.w3.x1999.xhtml.BigDocument.Big)get_store().insert_element_user(BIG$18, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "big" element
     */
    public org.w3.x1999.xhtml.BigDocument.Big addNewBig()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.w3.x1999.xhtml.BigDocument.Big target = null;
            target = (org.w3.x1999.xhtml.BigDocument.Big)get_store().add_element_user(BIG$18);
            return target;
        }
    }
    
    /**
     * Removes the ith "big" element
     */
    public void removeBig(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(BIG$18, i);
        }
    }
    
    /**
     * Gets array of all "small" elements
     */
    public org.w3.x1999.xhtml.SmallDocument.Small[] getSmallArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(SMALL$20, targetList);
            org.w3.x1999.xhtml.SmallDocument.Small[] result = new org.w3.x1999.xhtml.SmallDocument.Small[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "small" element
     */
    public org.w3.x1999.xhtml.SmallDocument.Small getSmallArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.w3.x1999.xhtml.SmallDocument.Small target = null;
            target = (org.w3.x1999.xhtml.SmallDocument.Small)get_store().find_element_user(SMALL$20, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "small" element
     */
    public int sizeOfSmallArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(SMALL$20);
        }
    }
    
    /**
     * Sets array of all "small" element  WARNING: This method is not atomicaly synchronized.
     */
    public void setSmallArray(org.w3.x1999.xhtml.SmallDocument.Small[] smallArray)
    {
        check_orphaned();
        arraySetterHelper(smallArray, SMALL$20);
    }
    
    /**
     * Sets ith "small" element
     */
    public void setSmallArray(int i, org.w3.x1999.xhtml.SmallDocument.Small small)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.w3.x1999.xhtml.SmallDocument.Small target = null;
            target = (org.w3.x1999.xhtml.SmallDocument.Small)get_store().find_element_user(SMALL$20, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(small);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "small" element
     */
    public org.w3.x1999.xhtml.SmallDocument.Small insertNewSmall(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.w3.x1999.xhtml.SmallDocument.Small target = null;
            target = (org.w3.x1999.xhtml.SmallDocument.Small)get_store().insert_element_user(SMALL$20, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "small" element
     */
    public org.w3.x1999.xhtml.SmallDocument.Small addNewSmall()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.w3.x1999.xhtml.SmallDocument.Small target = null;
            target = (org.w3.x1999.xhtml.SmallDocument.Small)get_store().add_element_user(SMALL$20);
            return target;
        }
    }
    
    /**
     * Removes the ith "small" element
     */
    public void removeSmall(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(SMALL$20, i);
        }
    }
    
    /**
     * Gets array of all "em" elements
     */
    public org.w3.x1999.xhtml.EmDocument.Em[] getEmArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(EM$22, targetList);
            org.w3.x1999.xhtml.EmDocument.Em[] result = new org.w3.x1999.xhtml.EmDocument.Em[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "em" element
     */
    public org.w3.x1999.xhtml.EmDocument.Em getEmArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.w3.x1999.xhtml.EmDocument.Em target = null;
            target = (org.w3.x1999.xhtml.EmDocument.Em)get_store().find_element_user(EM$22, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "em" element
     */
    public int sizeOfEmArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(EM$22);
        }
    }
    
    /**
     * Sets array of all "em" element  WARNING: This method is not atomicaly synchronized.
     */
    public void setEmArray(org.w3.x1999.xhtml.EmDocument.Em[] emArray)
    {
        check_orphaned();
        arraySetterHelper(emArray, EM$22);
    }
    
    /**
     * Sets ith "em" element
     */
    public void setEmArray(int i, org.w3.x1999.xhtml.EmDocument.Em em)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.w3.x1999.xhtml.EmDocument.Em target = null;
            target = (org.w3.x1999.xhtml.EmDocument.Em)get_store().find_element_user(EM$22, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(em);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "em" element
     */
    public org.w3.x1999.xhtml.EmDocument.Em insertNewEm(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.w3.x1999.xhtml.EmDocument.Em target = null;
            target = (org.w3.x1999.xhtml.EmDocument.Em)get_store().insert_element_user(EM$22, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "em" element
     */
    public org.w3.x1999.xhtml.EmDocument.Em addNewEm()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.w3.x1999.xhtml.EmDocument.Em target = null;
            target = (org.w3.x1999.xhtml.EmDocument.Em)get_store().add_element_user(EM$22);
            return target;
        }
    }
    
    /**
     * Removes the ith "em" element
     */
    public void removeEm(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(EM$22, i);
        }
    }
    
    /**
     * Gets array of all "strong" elements
     */
    public org.w3.x1999.xhtml.StrongDocument.Strong[] getStrongArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(STRONG$24, targetList);
            org.w3.x1999.xhtml.StrongDocument.Strong[] result = new org.w3.x1999.xhtml.StrongDocument.Strong[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "strong" element
     */
    public org.w3.x1999.xhtml.StrongDocument.Strong getStrongArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.w3.x1999.xhtml.StrongDocument.Strong target = null;
            target = (org.w3.x1999.xhtml.StrongDocument.Strong)get_store().find_element_user(STRONG$24, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "strong" element
     */
    public int sizeOfStrongArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(STRONG$24);
        }
    }
    
    /**
     * Sets array of all "strong" element  WARNING: This method is not atomicaly synchronized.
     */
    public void setStrongArray(org.w3.x1999.xhtml.StrongDocument.Strong[] strongArray)
    {
        check_orphaned();
        arraySetterHelper(strongArray, STRONG$24);
    }
    
    /**
     * Sets ith "strong" element
     */
    public void setStrongArray(int i, org.w3.x1999.xhtml.StrongDocument.Strong strong)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.w3.x1999.xhtml.StrongDocument.Strong target = null;
            target = (org.w3.x1999.xhtml.StrongDocument.Strong)get_store().find_element_user(STRONG$24, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(strong);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "strong" element
     */
    public org.w3.x1999.xhtml.StrongDocument.Strong insertNewStrong(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.w3.x1999.xhtml.StrongDocument.Strong target = null;
            target = (org.w3.x1999.xhtml.StrongDocument.Strong)get_store().insert_element_user(STRONG$24, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "strong" element
     */
    public org.w3.x1999.xhtml.StrongDocument.Strong addNewStrong()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.w3.x1999.xhtml.StrongDocument.Strong target = null;
            target = (org.w3.x1999.xhtml.StrongDocument.Strong)get_store().add_element_user(STRONG$24);
            return target;
        }
    }
    
    /**
     * Removes the ith "strong" element
     */
    public void removeStrong(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(STRONG$24, i);
        }
    }
    
    /**
     * Gets array of all "dfn" elements
     */
    public org.w3.x1999.xhtml.DfnDocument.Dfn[] getDfnArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(DFN$26, targetList);
            org.w3.x1999.xhtml.DfnDocument.Dfn[] result = new org.w3.x1999.xhtml.DfnDocument.Dfn[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "dfn" element
     */
    public org.w3.x1999.xhtml.DfnDocument.Dfn getDfnArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.w3.x1999.xhtml.DfnDocument.Dfn target = null;
            target = (org.w3.x1999.xhtml.DfnDocument.Dfn)get_store().find_element_user(DFN$26, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "dfn" element
     */
    public int sizeOfDfnArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(DFN$26);
        }
    }
    
    /**
     * Sets array of all "dfn" element  WARNING: This method is not atomicaly synchronized.
     */
    public void setDfnArray(org.w3.x1999.xhtml.DfnDocument.Dfn[] dfnArray)
    {
        check_orphaned();
        arraySetterHelper(dfnArray, DFN$26);
    }
    
    /**
     * Sets ith "dfn" element
     */
    public void setDfnArray(int i, org.w3.x1999.xhtml.DfnDocument.Dfn dfn)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.w3.x1999.xhtml.DfnDocument.Dfn target = null;
            target = (org.w3.x1999.xhtml.DfnDocument.Dfn)get_store().find_element_user(DFN$26, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(dfn);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "dfn" element
     */
    public org.w3.x1999.xhtml.DfnDocument.Dfn insertNewDfn(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.w3.x1999.xhtml.DfnDocument.Dfn target = null;
            target = (org.w3.x1999.xhtml.DfnDocument.Dfn)get_store().insert_element_user(DFN$26, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "dfn" element
     */
    public org.w3.x1999.xhtml.DfnDocument.Dfn addNewDfn()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.w3.x1999.xhtml.DfnDocument.Dfn target = null;
            target = (org.w3.x1999.xhtml.DfnDocument.Dfn)get_store().add_element_user(DFN$26);
            return target;
        }
    }
    
    /**
     * Removes the ith "dfn" element
     */
    public void removeDfn(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(DFN$26, i);
        }
    }
    
    /**
     * Gets array of all "code" elements
     */
    public org.w3.x1999.xhtml.CodeDocument.Code[] getCodeArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(CODE$28, targetList);
            org.w3.x1999.xhtml.CodeDocument.Code[] result = new org.w3.x1999.xhtml.CodeDocument.Code[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "code" element
     */
    public org.w3.x1999.xhtml.CodeDocument.Code getCodeArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.w3.x1999.xhtml.CodeDocument.Code target = null;
            target = (org.w3.x1999.xhtml.CodeDocument.Code)get_store().find_element_user(CODE$28, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "code" element
     */
    public int sizeOfCodeArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(CODE$28);
        }
    }
    
    /**
     * Sets array of all "code" element  WARNING: This method is not atomicaly synchronized.
     */
    public void setCodeArray(org.w3.x1999.xhtml.CodeDocument.Code[] codeArray)
    {
        check_orphaned();
        arraySetterHelper(codeArray, CODE$28);
    }
    
    /**
     * Sets ith "code" element
     */
    public void setCodeArray(int i, org.w3.x1999.xhtml.CodeDocument.Code code)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.w3.x1999.xhtml.CodeDocument.Code target = null;
            target = (org.w3.x1999.xhtml.CodeDocument.Code)get_store().find_element_user(CODE$28, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(code);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "code" element
     */
    public org.w3.x1999.xhtml.CodeDocument.Code insertNewCode(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.w3.x1999.xhtml.CodeDocument.Code target = null;
            target = (org.w3.x1999.xhtml.CodeDocument.Code)get_store().insert_element_user(CODE$28, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "code" element
     */
    public org.w3.x1999.xhtml.CodeDocument.Code addNewCode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.w3.x1999.xhtml.CodeDocument.Code target = null;
            target = (org.w3.x1999.xhtml.CodeDocument.Code)get_store().add_element_user(CODE$28);
            return target;
        }
    }
    
    /**
     * Removes the ith "code" element
     */
    public void removeCode(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(CODE$28, i);
        }
    }
    
    /**
     * Gets array of all "q" elements
     */
    public org.w3.x1999.xhtml.QDocument.Q[] getQArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(Q$30, targetList);
            org.w3.x1999.xhtml.QDocument.Q[] result = new org.w3.x1999.xhtml.QDocument.Q[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "q" element
     */
    public org.w3.x1999.xhtml.QDocument.Q getQArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.w3.x1999.xhtml.QDocument.Q target = null;
            target = (org.w3.x1999.xhtml.QDocument.Q)get_store().find_element_user(Q$30, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "q" element
     */
    public int sizeOfQArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(Q$30);
        }
    }
    
    /**
     * Sets array of all "q" element  WARNING: This method is not atomicaly synchronized.
     */
    public void setQArray(org.w3.x1999.xhtml.QDocument.Q[] qArray)
    {
        check_orphaned();
        arraySetterHelper(qArray, Q$30);
    }
    
    /**
     * Sets ith "q" element
     */
    public void setQArray(int i, org.w3.x1999.xhtml.QDocument.Q q)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.w3.x1999.xhtml.QDocument.Q target = null;
            target = (org.w3.x1999.xhtml.QDocument.Q)get_store().find_element_user(Q$30, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(q);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "q" element
     */
    public org.w3.x1999.xhtml.QDocument.Q insertNewQ(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.w3.x1999.xhtml.QDocument.Q target = null;
            target = (org.w3.x1999.xhtml.QDocument.Q)get_store().insert_element_user(Q$30, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "q" element
     */
    public org.w3.x1999.xhtml.QDocument.Q addNewQ()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.w3.x1999.xhtml.QDocument.Q target = null;
            target = (org.w3.x1999.xhtml.QDocument.Q)get_store().add_element_user(Q$30);
            return target;
        }
    }
    
    /**
     * Removes the ith "q" element
     */
    public void removeQ(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(Q$30, i);
        }
    }
    
    /**
     * Gets array of all "samp" elements
     */
    public org.w3.x1999.xhtml.SampDocument.Samp[] getSampArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(SAMP$32, targetList);
            org.w3.x1999.xhtml.SampDocument.Samp[] result = new org.w3.x1999.xhtml.SampDocument.Samp[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "samp" element
     */
    public org.w3.x1999.xhtml.SampDocument.Samp getSampArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.w3.x1999.xhtml.SampDocument.Samp target = null;
            target = (org.w3.x1999.xhtml.SampDocument.Samp)get_store().find_element_user(SAMP$32, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "samp" element
     */
    public int sizeOfSampArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(SAMP$32);
        }
    }
    
    /**
     * Sets array of all "samp" element  WARNING: This method is not atomicaly synchronized.
     */
    public void setSampArray(org.w3.x1999.xhtml.SampDocument.Samp[] sampArray)
    {
        check_orphaned();
        arraySetterHelper(sampArray, SAMP$32);
    }
    
    /**
     * Sets ith "samp" element
     */
    public void setSampArray(int i, org.w3.x1999.xhtml.SampDocument.Samp samp)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.w3.x1999.xhtml.SampDocument.Samp target = null;
            target = (org.w3.x1999.xhtml.SampDocument.Samp)get_store().find_element_user(SAMP$32, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(samp);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "samp" element
     */
    public org.w3.x1999.xhtml.SampDocument.Samp insertNewSamp(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.w3.x1999.xhtml.SampDocument.Samp target = null;
            target = (org.w3.x1999.xhtml.SampDocument.Samp)get_store().insert_element_user(SAMP$32, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "samp" element
     */
    public org.w3.x1999.xhtml.SampDocument.Samp addNewSamp()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.w3.x1999.xhtml.SampDocument.Samp target = null;
            target = (org.w3.x1999.xhtml.SampDocument.Samp)get_store().add_element_user(SAMP$32);
            return target;
        }
    }
    
    /**
     * Removes the ith "samp" element
     */
    public void removeSamp(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(SAMP$32, i);
        }
    }
    
    /**
     * Gets array of all "kbd" elements
     */
    public org.w3.x1999.xhtml.KbdDocument.Kbd[] getKbdArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(KBD$34, targetList);
            org.w3.x1999.xhtml.KbdDocument.Kbd[] result = new org.w3.x1999.xhtml.KbdDocument.Kbd[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "kbd" element
     */
    public org.w3.x1999.xhtml.KbdDocument.Kbd getKbdArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.w3.x1999.xhtml.KbdDocument.Kbd target = null;
            target = (org.w3.x1999.xhtml.KbdDocument.Kbd)get_store().find_element_user(KBD$34, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "kbd" element
     */
    public int sizeOfKbdArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(KBD$34);
        }
    }
    
    /**
     * Sets array of all "kbd" element  WARNING: This method is not atomicaly synchronized.
     */
    public void setKbdArray(org.w3.x1999.xhtml.KbdDocument.Kbd[] kbdArray)
    {
        check_orphaned();
        arraySetterHelper(kbdArray, KBD$34);
    }
    
    /**
     * Sets ith "kbd" element
     */
    public void setKbdArray(int i, org.w3.x1999.xhtml.KbdDocument.Kbd kbd)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.w3.x1999.xhtml.KbdDocument.Kbd target = null;
            target = (org.w3.x1999.xhtml.KbdDocument.Kbd)get_store().find_element_user(KBD$34, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(kbd);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "kbd" element
     */
    public org.w3.x1999.xhtml.KbdDocument.Kbd insertNewKbd(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.w3.x1999.xhtml.KbdDocument.Kbd target = null;
            target = (org.w3.x1999.xhtml.KbdDocument.Kbd)get_store().insert_element_user(KBD$34, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "kbd" element
     */
    public org.w3.x1999.xhtml.KbdDocument.Kbd addNewKbd()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.w3.x1999.xhtml.KbdDocument.Kbd target = null;
            target = (org.w3.x1999.xhtml.KbdDocument.Kbd)get_store().add_element_user(KBD$34);
            return target;
        }
    }
    
    /**
     * Removes the ith "kbd" element
     */
    public void removeKbd(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(KBD$34, i);
        }
    }
    
    /**
     * Gets array of all "var" elements
     */
    public org.w3.x1999.xhtml.VarDocument.Var[] getVarArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(VAR$36, targetList);
            org.w3.x1999.xhtml.VarDocument.Var[] result = new org.w3.x1999.xhtml.VarDocument.Var[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "var" element
     */
    public org.w3.x1999.xhtml.VarDocument.Var getVarArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.w3.x1999.xhtml.VarDocument.Var target = null;
            target = (org.w3.x1999.xhtml.VarDocument.Var)get_store().find_element_user(VAR$36, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "var" element
     */
    public int sizeOfVarArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(VAR$36);
        }
    }
    
    /**
     * Sets array of all "var" element  WARNING: This method is not atomicaly synchronized.
     */
    public void setVarArray(org.w3.x1999.xhtml.VarDocument.Var[] varArray)
    {
        check_orphaned();
        arraySetterHelper(varArray, VAR$36);
    }
    
    /**
     * Sets ith "var" element
     */
    public void setVarArray(int i, org.w3.x1999.xhtml.VarDocument.Var var)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.w3.x1999.xhtml.VarDocument.Var target = null;
            target = (org.w3.x1999.xhtml.VarDocument.Var)get_store().find_element_user(VAR$36, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(var);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "var" element
     */
    public org.w3.x1999.xhtml.VarDocument.Var insertNewVar(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.w3.x1999.xhtml.VarDocument.Var target = null;
            target = (org.w3.x1999.xhtml.VarDocument.Var)get_store().insert_element_user(VAR$36, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "var" element
     */
    public org.w3.x1999.xhtml.VarDocument.Var addNewVar()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.w3.x1999.xhtml.VarDocument.Var target = null;
            target = (org.w3.x1999.xhtml.VarDocument.Var)get_store().add_element_user(VAR$36);
            return target;
        }
    }
    
    /**
     * Removes the ith "var" element
     */
    public void removeVar(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(VAR$36, i);
        }
    }
    
    /**
     * Gets array of all "cite" elements
     */
    public org.w3.x1999.xhtml.CiteDocument.Cite[] getCiteArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(CITE$38, targetList);
            org.w3.x1999.xhtml.CiteDocument.Cite[] result = new org.w3.x1999.xhtml.CiteDocument.Cite[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "cite" element
     */
    public org.w3.x1999.xhtml.CiteDocument.Cite getCiteArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.w3.x1999.xhtml.CiteDocument.Cite target = null;
            target = (org.w3.x1999.xhtml.CiteDocument.Cite)get_store().find_element_user(CITE$38, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "cite" element
     */
    public int sizeOfCiteArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(CITE$38);
        }
    }
    
    /**
     * Sets array of all "cite" element  WARNING: This method is not atomicaly synchronized.
     */
    public void setCiteArray(org.w3.x1999.xhtml.CiteDocument.Cite[] citeArray)
    {
        check_orphaned();
        arraySetterHelper(citeArray, CITE$38);
    }
    
    /**
     * Sets ith "cite" element
     */
    public void setCiteArray(int i, org.w3.x1999.xhtml.CiteDocument.Cite cite)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.w3.x1999.xhtml.CiteDocument.Cite target = null;
            target = (org.w3.x1999.xhtml.CiteDocument.Cite)get_store().find_element_user(CITE$38, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(cite);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "cite" element
     */
    public org.w3.x1999.xhtml.CiteDocument.Cite insertNewCite(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.w3.x1999.xhtml.CiteDocument.Cite target = null;
            target = (org.w3.x1999.xhtml.CiteDocument.Cite)get_store().insert_element_user(CITE$38, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "cite" element
     */
    public org.w3.x1999.xhtml.CiteDocument.Cite addNewCite()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.w3.x1999.xhtml.CiteDocument.Cite target = null;
            target = (org.w3.x1999.xhtml.CiteDocument.Cite)get_store().add_element_user(CITE$38);
            return target;
        }
    }
    
    /**
     * Removes the ith "cite" element
     */
    public void removeCite(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(CITE$38, i);
        }
    }
    
    /**
     * Gets array of all "abbr" elements
     */
    public org.w3.x1999.xhtml.AbbrDocument.Abbr[] getAbbrArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(ABBR$40, targetList);
            org.w3.x1999.xhtml.AbbrDocument.Abbr[] result = new org.w3.x1999.xhtml.AbbrDocument.Abbr[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "abbr" element
     */
    public org.w3.x1999.xhtml.AbbrDocument.Abbr getAbbrArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.w3.x1999.xhtml.AbbrDocument.Abbr target = null;
            target = (org.w3.x1999.xhtml.AbbrDocument.Abbr)get_store().find_element_user(ABBR$40, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "abbr" element
     */
    public int sizeOfAbbrArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(ABBR$40);
        }
    }
    
    /**
     * Sets array of all "abbr" element  WARNING: This method is not atomicaly synchronized.
     */
    public void setAbbrArray(org.w3.x1999.xhtml.AbbrDocument.Abbr[] abbrArray)
    {
        check_orphaned();
        arraySetterHelper(abbrArray, ABBR$40);
    }
    
    /**
     * Sets ith "abbr" element
     */
    public void setAbbrArray(int i, org.w3.x1999.xhtml.AbbrDocument.Abbr abbr)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.w3.x1999.xhtml.AbbrDocument.Abbr target = null;
            target = (org.w3.x1999.xhtml.AbbrDocument.Abbr)get_store().find_element_user(ABBR$40, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(abbr);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "abbr" element
     */
    public org.w3.x1999.xhtml.AbbrDocument.Abbr insertNewAbbr(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.w3.x1999.xhtml.AbbrDocument.Abbr target = null;
            target = (org.w3.x1999.xhtml.AbbrDocument.Abbr)get_store().insert_element_user(ABBR$40, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "abbr" element
     */
    public org.w3.x1999.xhtml.AbbrDocument.Abbr addNewAbbr()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.w3.x1999.xhtml.AbbrDocument.Abbr target = null;
            target = (org.w3.x1999.xhtml.AbbrDocument.Abbr)get_store().add_element_user(ABBR$40);
            return target;
        }
    }
    
    /**
     * Removes the ith "abbr" element
     */
    public void removeAbbr(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(ABBR$40, i);
        }
    }
    
    /**
     * Gets array of all "acronym" elements
     */
    public org.w3.x1999.xhtml.AcronymDocument.Acronym[] getAcronymArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(ACRONYM$42, targetList);
            org.w3.x1999.xhtml.AcronymDocument.Acronym[] result = new org.w3.x1999.xhtml.AcronymDocument.Acronym[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "acronym" element
     */
    public org.w3.x1999.xhtml.AcronymDocument.Acronym getAcronymArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.w3.x1999.xhtml.AcronymDocument.Acronym target = null;
            target = (org.w3.x1999.xhtml.AcronymDocument.Acronym)get_store().find_element_user(ACRONYM$42, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "acronym" element
     */
    public int sizeOfAcronymArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(ACRONYM$42);
        }
    }
    
    /**
     * Sets array of all "acronym" element  WARNING: This method is not atomicaly synchronized.
     */
    public void setAcronymArray(org.w3.x1999.xhtml.AcronymDocument.Acronym[] acronymArray)
    {
        check_orphaned();
        arraySetterHelper(acronymArray, ACRONYM$42);
    }
    
    /**
     * Sets ith "acronym" element
     */
    public void setAcronymArray(int i, org.w3.x1999.xhtml.AcronymDocument.Acronym acronym)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.w3.x1999.xhtml.AcronymDocument.Acronym target = null;
            target = (org.w3.x1999.xhtml.AcronymDocument.Acronym)get_store().find_element_user(ACRONYM$42, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(acronym);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "acronym" element
     */
    public org.w3.x1999.xhtml.AcronymDocument.Acronym insertNewAcronym(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.w3.x1999.xhtml.AcronymDocument.Acronym target = null;
            target = (org.w3.x1999.xhtml.AcronymDocument.Acronym)get_store().insert_element_user(ACRONYM$42, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "acronym" element
     */
    public org.w3.x1999.xhtml.AcronymDocument.Acronym addNewAcronym()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.w3.x1999.xhtml.AcronymDocument.Acronym target = null;
            target = (org.w3.x1999.xhtml.AcronymDocument.Acronym)get_store().add_element_user(ACRONYM$42);
            return target;
        }
    }
    
    /**
     * Removes the ith "acronym" element
     */
    public void removeAcronym(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(ACRONYM$42, i);
        }
    }
    
    /**
     * Gets array of all "sub" elements
     */
    public org.w3.x1999.xhtml.SubDocument.Sub[] getSubArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(SUB$44, targetList);
            org.w3.x1999.xhtml.SubDocument.Sub[] result = new org.w3.x1999.xhtml.SubDocument.Sub[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "sub" element
     */
    public org.w3.x1999.xhtml.SubDocument.Sub getSubArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.w3.x1999.xhtml.SubDocument.Sub target = null;
            target = (org.w3.x1999.xhtml.SubDocument.Sub)get_store().find_element_user(SUB$44, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "sub" element
     */
    public int sizeOfSubArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(SUB$44);
        }
    }
    
    /**
     * Sets array of all "sub" element  WARNING: This method is not atomicaly synchronized.
     */
    public void setSubArray(org.w3.x1999.xhtml.SubDocument.Sub[] subArray)
    {
        check_orphaned();
        arraySetterHelper(subArray, SUB$44);
    }
    
    /**
     * Sets ith "sub" element
     */
    public void setSubArray(int i, org.w3.x1999.xhtml.SubDocument.Sub sub)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.w3.x1999.xhtml.SubDocument.Sub target = null;
            target = (org.w3.x1999.xhtml.SubDocument.Sub)get_store().find_element_user(SUB$44, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(sub);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "sub" element
     */
    public org.w3.x1999.xhtml.SubDocument.Sub insertNewSub(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.w3.x1999.xhtml.SubDocument.Sub target = null;
            target = (org.w3.x1999.xhtml.SubDocument.Sub)get_store().insert_element_user(SUB$44, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "sub" element
     */
    public org.w3.x1999.xhtml.SubDocument.Sub addNewSub()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.w3.x1999.xhtml.SubDocument.Sub target = null;
            target = (org.w3.x1999.xhtml.SubDocument.Sub)get_store().add_element_user(SUB$44);
            return target;
        }
    }
    
    /**
     * Removes the ith "sub" element
     */
    public void removeSub(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(SUB$44, i);
        }
    }
    
    /**
     * Gets array of all "sup" elements
     */
    public org.w3.x1999.xhtml.SupDocument.Sup[] getSupArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(SUP$46, targetList);
            org.w3.x1999.xhtml.SupDocument.Sup[] result = new org.w3.x1999.xhtml.SupDocument.Sup[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "sup" element
     */
    public org.w3.x1999.xhtml.SupDocument.Sup getSupArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.w3.x1999.xhtml.SupDocument.Sup target = null;
            target = (org.w3.x1999.xhtml.SupDocument.Sup)get_store().find_element_user(SUP$46, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "sup" element
     */
    public int sizeOfSupArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(SUP$46);
        }
    }
    
    /**
     * Sets array of all "sup" element  WARNING: This method is not atomicaly synchronized.
     */
    public void setSupArray(org.w3.x1999.xhtml.SupDocument.Sup[] supArray)
    {
        check_orphaned();
        arraySetterHelper(supArray, SUP$46);
    }
    
    /**
     * Sets ith "sup" element
     */
    public void setSupArray(int i, org.w3.x1999.xhtml.SupDocument.Sup sup)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.w3.x1999.xhtml.SupDocument.Sup target = null;
            target = (org.w3.x1999.xhtml.SupDocument.Sup)get_store().find_element_user(SUP$46, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(sup);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "sup" element
     */
    public org.w3.x1999.xhtml.SupDocument.Sup insertNewSup(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.w3.x1999.xhtml.SupDocument.Sup target = null;
            target = (org.w3.x1999.xhtml.SupDocument.Sup)get_store().insert_element_user(SUP$46, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "sup" element
     */
    public org.w3.x1999.xhtml.SupDocument.Sup addNewSup()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.w3.x1999.xhtml.SupDocument.Sup target = null;
            target = (org.w3.x1999.xhtml.SupDocument.Sup)get_store().add_element_user(SUP$46);
            return target;
        }
    }
    
    /**
     * Removes the ith "sup" element
     */
    public void removeSup(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(SUP$46, i);
        }
    }
    
    /**
     * Gets array of all "input" elements
     */
    public org.w3.x1999.xhtml.InputDocument.Input[] getInputArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(INPUT$48, targetList);
            org.w3.x1999.xhtml.InputDocument.Input[] result = new org.w3.x1999.xhtml.InputDocument.Input[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "input" element
     */
    public org.w3.x1999.xhtml.InputDocument.Input getInputArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.w3.x1999.xhtml.InputDocument.Input target = null;
            target = (org.w3.x1999.xhtml.InputDocument.Input)get_store().find_element_user(INPUT$48, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "input" element
     */
    public int sizeOfInputArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(INPUT$48);
        }
    }
    
    /**
     * Sets array of all "input" element  WARNING: This method is not atomicaly synchronized.
     */
    public void setInputArray(org.w3.x1999.xhtml.InputDocument.Input[] inputArray)
    {
        check_orphaned();
        arraySetterHelper(inputArray, INPUT$48);
    }
    
    /**
     * Sets ith "input" element
     */
    public void setInputArray(int i, org.w3.x1999.xhtml.InputDocument.Input input)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.w3.x1999.xhtml.InputDocument.Input target = null;
            target = (org.w3.x1999.xhtml.InputDocument.Input)get_store().find_element_user(INPUT$48, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(input);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "input" element
     */
    public org.w3.x1999.xhtml.InputDocument.Input insertNewInput(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.w3.x1999.xhtml.InputDocument.Input target = null;
            target = (org.w3.x1999.xhtml.InputDocument.Input)get_store().insert_element_user(INPUT$48, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "input" element
     */
    public org.w3.x1999.xhtml.InputDocument.Input addNewInput()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.w3.x1999.xhtml.InputDocument.Input target = null;
            target = (org.w3.x1999.xhtml.InputDocument.Input)get_store().add_element_user(INPUT$48);
            return target;
        }
    }
    
    /**
     * Removes the ith "input" element
     */
    public void removeInput(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(INPUT$48, i);
        }
    }
    
    /**
     * Gets array of all "select" elements
     */
    public org.w3.x1999.xhtml.SelectDocument.Select[] getSelectArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(SELECT$50, targetList);
            org.w3.x1999.xhtml.SelectDocument.Select[] result = new org.w3.x1999.xhtml.SelectDocument.Select[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "select" element
     */
    public org.w3.x1999.xhtml.SelectDocument.Select getSelectArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.w3.x1999.xhtml.SelectDocument.Select target = null;
            target = (org.w3.x1999.xhtml.SelectDocument.Select)get_store().find_element_user(SELECT$50, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "select" element
     */
    public int sizeOfSelectArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(SELECT$50);
        }
    }
    
    /**
     * Sets array of all "select" element  WARNING: This method is not atomicaly synchronized.
     */
    public void setSelectArray(org.w3.x1999.xhtml.SelectDocument.Select[] selectArray)
    {
        check_orphaned();
        arraySetterHelper(selectArray, SELECT$50);
    }
    
    /**
     * Sets ith "select" element
     */
    public void setSelectArray(int i, org.w3.x1999.xhtml.SelectDocument.Select select)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.w3.x1999.xhtml.SelectDocument.Select target = null;
            target = (org.w3.x1999.xhtml.SelectDocument.Select)get_store().find_element_user(SELECT$50, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(select);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "select" element
     */
    public org.w3.x1999.xhtml.SelectDocument.Select insertNewSelect(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.w3.x1999.xhtml.SelectDocument.Select target = null;
            target = (org.w3.x1999.xhtml.SelectDocument.Select)get_store().insert_element_user(SELECT$50, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "select" element
     */
    public org.w3.x1999.xhtml.SelectDocument.Select addNewSelect()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.w3.x1999.xhtml.SelectDocument.Select target = null;
            target = (org.w3.x1999.xhtml.SelectDocument.Select)get_store().add_element_user(SELECT$50);
            return target;
        }
    }
    
    /**
     * Removes the ith "select" element
     */
    public void removeSelect(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(SELECT$50, i);
        }
    }
    
    /**
     * Gets array of all "textarea" elements
     */
    public org.w3.x1999.xhtml.TextareaDocument.Textarea[] getTextareaArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(TEXTAREA$52, targetList);
            org.w3.x1999.xhtml.TextareaDocument.Textarea[] result = new org.w3.x1999.xhtml.TextareaDocument.Textarea[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "textarea" element
     */
    public org.w3.x1999.xhtml.TextareaDocument.Textarea getTextareaArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.w3.x1999.xhtml.TextareaDocument.Textarea target = null;
            target = (org.w3.x1999.xhtml.TextareaDocument.Textarea)get_store().find_element_user(TEXTAREA$52, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "textarea" element
     */
    public int sizeOfTextareaArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(TEXTAREA$52);
        }
    }
    
    /**
     * Sets array of all "textarea" element  WARNING: This method is not atomicaly synchronized.
     */
    public void setTextareaArray(org.w3.x1999.xhtml.TextareaDocument.Textarea[] textareaArray)
    {
        check_orphaned();
        arraySetterHelper(textareaArray, TEXTAREA$52);
    }
    
    /**
     * Sets ith "textarea" element
     */
    public void setTextareaArray(int i, org.w3.x1999.xhtml.TextareaDocument.Textarea textarea)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.w3.x1999.xhtml.TextareaDocument.Textarea target = null;
            target = (org.w3.x1999.xhtml.TextareaDocument.Textarea)get_store().find_element_user(TEXTAREA$52, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(textarea);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "textarea" element
     */
    public org.w3.x1999.xhtml.TextareaDocument.Textarea insertNewTextarea(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.w3.x1999.xhtml.TextareaDocument.Textarea target = null;
            target = (org.w3.x1999.xhtml.TextareaDocument.Textarea)get_store().insert_element_user(TEXTAREA$52, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "textarea" element
     */
    public org.w3.x1999.xhtml.TextareaDocument.Textarea addNewTextarea()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.w3.x1999.xhtml.TextareaDocument.Textarea target = null;
            target = (org.w3.x1999.xhtml.TextareaDocument.Textarea)get_store().add_element_user(TEXTAREA$52);
            return target;
        }
    }
    
    /**
     * Removes the ith "textarea" element
     */
    public void removeTextarea(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(TEXTAREA$52, i);
        }
    }
    
    /**
     * Gets array of all "label" elements
     */
    public org.w3.x1999.xhtml.LabelDocument.Label[] getLabelArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(LABEL$54, targetList);
            org.w3.x1999.xhtml.LabelDocument.Label[] result = new org.w3.x1999.xhtml.LabelDocument.Label[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "label" element
     */
    public org.w3.x1999.xhtml.LabelDocument.Label getLabelArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.w3.x1999.xhtml.LabelDocument.Label target = null;
            target = (org.w3.x1999.xhtml.LabelDocument.Label)get_store().find_element_user(LABEL$54, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "label" element
     */
    public int sizeOfLabelArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(LABEL$54);
        }
    }
    
    /**
     * Sets array of all "label" element  WARNING: This method is not atomicaly synchronized.
     */
    public void setLabelArray(org.w3.x1999.xhtml.LabelDocument.Label[] labelArray)
    {
        check_orphaned();
        arraySetterHelper(labelArray, LABEL$54);
    }
    
    /**
     * Sets ith "label" element
     */
    public void setLabelArray(int i, org.w3.x1999.xhtml.LabelDocument.Label label)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.w3.x1999.xhtml.LabelDocument.Label target = null;
            target = (org.w3.x1999.xhtml.LabelDocument.Label)get_store().find_element_user(LABEL$54, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(label);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "label" element
     */
    public org.w3.x1999.xhtml.LabelDocument.Label insertNewLabel(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.w3.x1999.xhtml.LabelDocument.Label target = null;
            target = (org.w3.x1999.xhtml.LabelDocument.Label)get_store().insert_element_user(LABEL$54, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "label" element
     */
    public org.w3.x1999.xhtml.LabelDocument.Label addNewLabel()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.w3.x1999.xhtml.LabelDocument.Label target = null;
            target = (org.w3.x1999.xhtml.LabelDocument.Label)get_store().add_element_user(LABEL$54);
            return target;
        }
    }
    
    /**
     * Removes the ith "label" element
     */
    public void removeLabel(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(LABEL$54, i);
        }
    }
    
    /**
     * Gets array of all "button" elements
     */
    public org.w3.x1999.xhtml.ButtonDocument.Button[] getButtonArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(BUTTON$56, targetList);
            org.w3.x1999.xhtml.ButtonDocument.Button[] result = new org.w3.x1999.xhtml.ButtonDocument.Button[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "button" element
     */
    public org.w3.x1999.xhtml.ButtonDocument.Button getButtonArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.w3.x1999.xhtml.ButtonDocument.Button target = null;
            target = (org.w3.x1999.xhtml.ButtonDocument.Button)get_store().find_element_user(BUTTON$56, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "button" element
     */
    public int sizeOfButtonArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(BUTTON$56);
        }
    }
    
    /**
     * Sets array of all "button" element  WARNING: This method is not atomicaly synchronized.
     */
    public void setButtonArray(org.w3.x1999.xhtml.ButtonDocument.Button[] buttonArray)
    {
        check_orphaned();
        arraySetterHelper(buttonArray, BUTTON$56);
    }
    
    /**
     * Sets ith "button" element
     */
    public void setButtonArray(int i, org.w3.x1999.xhtml.ButtonDocument.Button button)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.w3.x1999.xhtml.ButtonDocument.Button target = null;
            target = (org.w3.x1999.xhtml.ButtonDocument.Button)get_store().find_element_user(BUTTON$56, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(button);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "button" element
     */
    public org.w3.x1999.xhtml.ButtonDocument.Button insertNewButton(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.w3.x1999.xhtml.ButtonDocument.Button target = null;
            target = (org.w3.x1999.xhtml.ButtonDocument.Button)get_store().insert_element_user(BUTTON$56, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "button" element
     */
    public org.w3.x1999.xhtml.ButtonDocument.Button addNewButton()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.w3.x1999.xhtml.ButtonDocument.Button target = null;
            target = (org.w3.x1999.xhtml.ButtonDocument.Button)get_store().add_element_user(BUTTON$56);
            return target;
        }
    }
    
    /**
     * Removes the ith "button" element
     */
    public void removeButton(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(BUTTON$56, i);
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
            get_store().find_all_element_users(INS$58, targetList);
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
            target = (org.w3.x1999.xhtml.InsDocument.Ins)get_store().find_element_user(INS$58, i);
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
            return get_store().count_elements(INS$58);
        }
    }
    
    /**
     * Sets array of all "ins" element  WARNING: This method is not atomicaly synchronized.
     */
    public void setInsArray(org.w3.x1999.xhtml.InsDocument.Ins[] insArray)
    {
        check_orphaned();
        arraySetterHelper(insArray, INS$58);
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
            target = (org.w3.x1999.xhtml.InsDocument.Ins)get_store().find_element_user(INS$58, i);
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
            target = (org.w3.x1999.xhtml.InsDocument.Ins)get_store().insert_element_user(INS$58, i);
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
            target = (org.w3.x1999.xhtml.InsDocument.Ins)get_store().add_element_user(INS$58);
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
            get_store().remove_element(INS$58, i);
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
            get_store().find_all_element_users(DEL$60, targetList);
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
            target = (org.w3.x1999.xhtml.DelDocument.Del)get_store().find_element_user(DEL$60, i);
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
            return get_store().count_elements(DEL$60);
        }
    }
    
    /**
     * Sets array of all "del" element  WARNING: This method is not atomicaly synchronized.
     */
    public void setDelArray(org.w3.x1999.xhtml.DelDocument.Del[] delArray)
    {
        check_orphaned();
        arraySetterHelper(delArray, DEL$60);
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
            target = (org.w3.x1999.xhtml.DelDocument.Del)get_store().find_element_user(DEL$60, i);
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
            target = (org.w3.x1999.xhtml.DelDocument.Del)get_store().insert_element_user(DEL$60, i);
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
            target = (org.w3.x1999.xhtml.DelDocument.Del)get_store().add_element_user(DEL$60);
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
            get_store().remove_element(DEL$60, i);
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
            get_store().find_all_element_users(SCRIPT$62, targetList);
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
            target = (org.w3.x1999.xhtml.ScriptDocument.Script)get_store().find_element_user(SCRIPT$62, i);
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
            return get_store().count_elements(SCRIPT$62);
        }
    }
    
    /**
     * Sets array of all "script" element  WARNING: This method is not atomicaly synchronized.
     */
    public void setScriptArray(org.w3.x1999.xhtml.ScriptDocument.Script[] scriptArray)
    {
        check_orphaned();
        arraySetterHelper(scriptArray, SCRIPT$62);
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
            target = (org.w3.x1999.xhtml.ScriptDocument.Script)get_store().find_element_user(SCRIPT$62, i);
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
            target = (org.w3.x1999.xhtml.ScriptDocument.Script)get_store().insert_element_user(SCRIPT$62, i);
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
            target = (org.w3.x1999.xhtml.ScriptDocument.Script)get_store().add_element_user(SCRIPT$62);
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
            get_store().remove_element(SCRIPT$62, i);
        }
    }
}
