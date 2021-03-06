/*******************************************************************************
 * Copyright (c) 2011 itemis AG (http://www.itemis.eu) and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *******************************************************************************/
package org.eclipse.xtext.ui.refactoring.ui;

import org.eclipse.core.commands.IHandler2;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.jface.text.ITextSelection;
import org.eclipse.xtext.resource.XtextResource;
import org.eclipse.xtext.ui.editor.XtextEditor;

import com.google.inject.ImplementedBy;

/**
 * @author Jan Koehnlein - Initial contribution and API
 * 
 * @noimplement This interface is not intended to be implemented by clients. 
 * @deprecated use {@link DefaultRenameElementHandler} and {@link IRenameContextFactory} instead.
 */
@Deprecated
@ImplementedBy(DefaultRenameElementHandler.class)
public interface IRenameElementHandler extends IHandler2 {

	IRenameElementContext createRenameElementContext(EObject targetElement, final XtextEditor editor,
			final ITextSelection selection, XtextResource resource);

}