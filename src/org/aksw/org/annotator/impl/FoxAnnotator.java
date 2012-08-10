/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.aksw.org.annotator.impl;

import com.hp.hpl.jena.rdf.model.Resource;
import java.util.List;
import org.aksw.org.annotator.Annotator;

/**
 *
 * @author ngonga
 */
public class FoxAnnotator implements Annotator {

    public List<Resource> getKeywords(String text) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    public List<Resource> getNamedEntities(String text) {
        throw new UnsupportedOperationException("Not supported yet.");
    }
    
}
