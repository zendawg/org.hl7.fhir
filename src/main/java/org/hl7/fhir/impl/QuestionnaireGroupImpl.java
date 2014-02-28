/*
 * XML Type:  Questionnaire.Group
 * Namespace: http://hl7.org/fhir
 * Java type: org.hl7.fhir.QuestionnaireGroup
 *
 * Automatically generated - do not modify.
 */
package org.hl7.fhir.impl;
/**
 * An XML Questionnaire.Group(@http://hl7.org/fhir).
 *
 * This is a complex type.
 */
public class QuestionnaireGroupImpl extends org.hl7.fhir.impl.BackboneElementImpl implements org.hl7.fhir.QuestionnaireGroup
{
    private static final long serialVersionUID = 1L;
    
    public QuestionnaireGroupImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName NAME$0 = 
        new javax.xml.namespace.QName("http://hl7.org/fhir", "name");
    private static final javax.xml.namespace.QName HEADER$2 = 
        new javax.xml.namespace.QName("http://hl7.org/fhir", "header");
    private static final javax.xml.namespace.QName TEXT$4 = 
        new javax.xml.namespace.QName("http://hl7.org/fhir", "text");
    private static final javax.xml.namespace.QName SUBJECT$6 = 
        new javax.xml.namespace.QName("http://hl7.org/fhir", "subject");
    private static final javax.xml.namespace.QName GROUP$8 = 
        new javax.xml.namespace.QName("http://hl7.org/fhir", "group");
    private static final javax.xml.namespace.QName QUESTION$10 = 
        new javax.xml.namespace.QName("http://hl7.org/fhir", "question");
    
    
    /**
     * Gets the "name" element
     */
    public org.hl7.fhir.CodeableConcept getName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.CodeableConcept target = null;
            target = (org.hl7.fhir.CodeableConcept)get_store().find_element_user(NAME$0, 0);
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
            return get_store().count_elements(NAME$0) != 0;
        }
    }
    
    /**
     * Sets the "name" element
     */
    public void setName(org.hl7.fhir.CodeableConcept name)
    {
        generatedSetterHelperImpl(name, NAME$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "name" element
     */
    public org.hl7.fhir.CodeableConcept addNewName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.CodeableConcept target = null;
            target = (org.hl7.fhir.CodeableConcept)get_store().add_element_user(NAME$0);
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
            get_store().remove_element(NAME$0, 0);
        }
    }
    
    /**
     * Gets the "header" element
     */
    public org.hl7.fhir.String getHeader()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.String target = null;
            target = (org.hl7.fhir.String)get_store().find_element_user(HEADER$2, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "header" element
     */
    public boolean isSetHeader()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(HEADER$2) != 0;
        }
    }
    
    /**
     * Sets the "header" element
     */
    public void setHeader(org.hl7.fhir.String header)
    {
        generatedSetterHelperImpl(header, HEADER$2, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "header" element
     */
    public org.hl7.fhir.String addNewHeader()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.String target = null;
            target = (org.hl7.fhir.String)get_store().add_element_user(HEADER$2);
            return target;
        }
    }
    
    /**
     * Unsets the "header" element
     */
    public void unsetHeader()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(HEADER$2, 0);
        }
    }
    
    /**
     * Gets the "text" element
     */
    public org.hl7.fhir.String getText()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.String target = null;
            target = (org.hl7.fhir.String)get_store().find_element_user(TEXT$4, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "text" element
     */
    public boolean isSetText()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(TEXT$4) != 0;
        }
    }
    
    /**
     * Sets the "text" element
     */
    public void setText(org.hl7.fhir.String text)
    {
        generatedSetterHelperImpl(text, TEXT$4, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "text" element
     */
    public org.hl7.fhir.String addNewText()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.String target = null;
            target = (org.hl7.fhir.String)get_store().add_element_user(TEXT$4);
            return target;
        }
    }
    
    /**
     * Unsets the "text" element
     */
    public void unsetText()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(TEXT$4, 0);
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
            target = (org.hl7.fhir.ResourceReference)get_store().find_element_user(SUBJECT$6, 0);
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
            return get_store().count_elements(SUBJECT$6) != 0;
        }
    }
    
    /**
     * Sets the "subject" element
     */
    public void setSubject(org.hl7.fhir.ResourceReference subject)
    {
        generatedSetterHelperImpl(subject, SUBJECT$6, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
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
            target = (org.hl7.fhir.ResourceReference)get_store().add_element_user(SUBJECT$6);
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
            get_store().remove_element(SUBJECT$6, 0);
        }
    }
    
    /**
     * Gets array of all "group" elements
     */
    public org.hl7.fhir.QuestionnaireGroup[] getGroupArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(GROUP$8, targetList);
            org.hl7.fhir.QuestionnaireGroup[] result = new org.hl7.fhir.QuestionnaireGroup[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "group" element
     */
    public org.hl7.fhir.QuestionnaireGroup getGroupArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.QuestionnaireGroup target = null;
            target = (org.hl7.fhir.QuestionnaireGroup)get_store().find_element_user(GROUP$8, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "group" element
     */
    public int sizeOfGroupArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(GROUP$8);
        }
    }
    
    /**
     * Sets array of all "group" element  WARNING: This method is not atomicaly synchronized.
     */
    public void setGroupArray(org.hl7.fhir.QuestionnaireGroup[] groupArray)
    {
        check_orphaned();
        arraySetterHelper(groupArray, GROUP$8);
    }
    
    /**
     * Sets ith "group" element
     */
    public void setGroupArray(int i, org.hl7.fhir.QuestionnaireGroup group)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.QuestionnaireGroup target = null;
            target = (org.hl7.fhir.QuestionnaireGroup)get_store().find_element_user(GROUP$8, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(group);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "group" element
     */
    public org.hl7.fhir.QuestionnaireGroup insertNewGroup(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.QuestionnaireGroup target = null;
            target = (org.hl7.fhir.QuestionnaireGroup)get_store().insert_element_user(GROUP$8, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "group" element
     */
    public org.hl7.fhir.QuestionnaireGroup addNewGroup()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.QuestionnaireGroup target = null;
            target = (org.hl7.fhir.QuestionnaireGroup)get_store().add_element_user(GROUP$8);
            return target;
        }
    }
    
    /**
     * Removes the ith "group" element
     */
    public void removeGroup(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(GROUP$8, i);
        }
    }
    
    /**
     * Gets array of all "question" elements
     */
    public org.hl7.fhir.QuestionnaireQuestion[] getQuestionArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(QUESTION$10, targetList);
            org.hl7.fhir.QuestionnaireQuestion[] result = new org.hl7.fhir.QuestionnaireQuestion[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "question" element
     */
    public org.hl7.fhir.QuestionnaireQuestion getQuestionArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.QuestionnaireQuestion target = null;
            target = (org.hl7.fhir.QuestionnaireQuestion)get_store().find_element_user(QUESTION$10, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "question" element
     */
    public int sizeOfQuestionArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(QUESTION$10);
        }
    }
    
    /**
     * Sets array of all "question" element  WARNING: This method is not atomicaly synchronized.
     */
    public void setQuestionArray(org.hl7.fhir.QuestionnaireQuestion[] questionArray)
    {
        check_orphaned();
        arraySetterHelper(questionArray, QUESTION$10);
    }
    
    /**
     * Sets ith "question" element
     */
    public void setQuestionArray(int i, org.hl7.fhir.QuestionnaireQuestion question)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.QuestionnaireQuestion target = null;
            target = (org.hl7.fhir.QuestionnaireQuestion)get_store().find_element_user(QUESTION$10, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(question);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "question" element
     */
    public org.hl7.fhir.QuestionnaireQuestion insertNewQuestion(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.QuestionnaireQuestion target = null;
            target = (org.hl7.fhir.QuestionnaireQuestion)get_store().insert_element_user(QUESTION$10, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "question" element
     */
    public org.hl7.fhir.QuestionnaireQuestion addNewQuestion()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.QuestionnaireQuestion target = null;
            target = (org.hl7.fhir.QuestionnaireQuestion)get_store().add_element_user(QUESTION$10);
            return target;
        }
    }
    
    /**
     * Removes the ith "question" element
     */
    public void removeQuestion(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(QUESTION$10, i);
        }
    }
}
