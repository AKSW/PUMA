/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.aksw.puma.input;

import com.hp.hpl.jena.rdf.model.Model;

/**
 *
 * @author ngonga
 */
public interface InputModule {
    //returns a model to the input file according to the SWRC ontology v0.7
    // http://ontoware.org/swrc/ 
    public Model readFile(String file); 
}
