package com.edangie.utils;


import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;

/**
 *
 * @author jahd
 */
public abstract class DocumentListenerAdapter implements DocumentListener {

    @Override
    public void insertUpdate(DocumentEvent e) {
        hacer();
    }

    @Override
    public void removeUpdate(DocumentEvent e) {
        hacer();
    }

    @Override
    public void changedUpdate(DocumentEvent e) {
        hacer();
    }

    public abstract void hacer();
}
