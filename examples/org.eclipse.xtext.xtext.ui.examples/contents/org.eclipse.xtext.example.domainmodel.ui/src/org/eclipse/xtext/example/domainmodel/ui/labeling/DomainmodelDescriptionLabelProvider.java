/*
* generated by Xtext
*/
package org.eclipse.xtext.example.domainmodel.ui.labeling;

import org.eclipse.xtext.resource.IEObjectDescription;
import org.eclipse.xtext.ui.label.DefaultDescriptionLabelProvider;

/**
 * Provides labels for a IEObjectDescriptions and IResourceDescriptions.
 * 
 * See https://www.eclipse.org/Xtext/documentation/304_ide_concepts.html#label-provider
 */
public class DomainmodelDescriptionLabelProvider extends DefaultDescriptionLabelProvider {

	@Override
	public String image(IEObjectDescription description) {
		return description.getEClass().getName() + ".gif"; 
	}
}
