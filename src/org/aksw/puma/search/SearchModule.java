/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.aksw.puma.search;

import com.hp.hpl.jena.rdf.model.Model;
import java.util.Map;

/**
 *
 * @author ngonga
 */
public interface SearchModule {
    public Model search(String searchString, Map options);
}
