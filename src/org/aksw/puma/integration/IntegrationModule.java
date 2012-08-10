/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.aksw.puma.integration;

import com.hp.hpl.jena.rdf.model.Model;
import de.uni_leipzig.simba.data.Mapping;

/**
 *
 * @author ngonga
 */
public interface IntegrationModule {
    public Mapping getLinks(Model source, Model target); 
}
