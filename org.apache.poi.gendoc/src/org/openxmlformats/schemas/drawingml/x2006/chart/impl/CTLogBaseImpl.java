/*
 * XML Type:  CT_LogBase
 * Namespace: http://schemas.openxmlformats.org/drawingml/2006/chart
 * Java type: org.openxmlformats.schemas.drawingml.x2006.chart.CTLogBase
 *
 * Automatically generated - do not modify.
 */
package org.openxmlformats.schemas.drawingml.x2006.chart.impl;
/**
 * An XML CT_LogBase(@http://schemas.openxmlformats.org/drawingml/2006/chart).
 *
 * This is a complex type.
 */
public class CTLogBaseImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.openxmlformats.schemas.drawingml.x2006.chart.CTLogBase
{
    
    public CTLogBaseImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName VAL$0 = 
        new javax.xml.namespace.QName("", "val");
    
    
    /**
     * Gets the "val" attribute
     */
    public double getVal()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(VAL$0);
            if (target == null)
            {
                return 0.0;
            }
            return target.getDoubleValue();
        }
    }
    
    /**
     * Gets (as xml) the "val" attribute
     */
    public org.openxmlformats.schemas.drawingml.x2006.chart.STLogBase xgetVal()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.chart.STLogBase target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.chart.STLogBase)get_store().find_attribute_user(VAL$0);
            return target;
        }
    }
    
    /**
     * Sets the "val" attribute
     */
    public void setVal(double val)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(VAL$0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(VAL$0);
            }
            target.setDoubleValue(val);
        }
    }
    
    /**
     * Sets (as xml) the "val" attribute
     */
    public void xsetVal(org.openxmlformats.schemas.drawingml.x2006.chart.STLogBase val)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.chart.STLogBase target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.chart.STLogBase)get_store().find_attribute_user(VAL$0);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.drawingml.x2006.chart.STLogBase)get_store().add_attribute_user(VAL$0);
            }
            target.set(val);
        }
    }
}