/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.aksw.puma.importer;

import com.hp.hpl.jena.rdf.model.Model;

/**
 *
 * @author ngonga
 */
public interface Importer {
    public Model load(String file);
}
