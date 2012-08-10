/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.aksw.org.annotator;

import com.hp.hpl.jena.rdf.model.Resource;
import java.util.List;

/**
 *
 * @author ngonga
 */
public interface Annotator {
    public List<Resource> getKeywords(String text);
    public List<Resource> getNamedEntities(String text);
}
