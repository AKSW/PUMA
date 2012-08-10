/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.aksw.puma.integration.impl;

import com.hp.hpl.jena.rdf.model.Model;
import de.uni_leipzig.simba.data.Mapping;
import org.aksw.puma.integration.IntegrationModule;

/**
 *
 * @author ngonga
 */
public class LimesIntegrationModule implements IntegrationModule {

    @Override
    public Mapping getLinks(Model source, Model target) {
        throw new UnsupportedOperationException("Not supported yet.");
    }
    
}
