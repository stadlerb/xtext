/*******************************************************************************
 * Copyright (c) 2016 itemis AG (http://www.itemis.eu) and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *******************************************************************************/
package org.eclipse.xtend.core.tests.compiler

import org.eclipse.xtend.core.xtend.XtendFile
import org.junit.Test

/**
 * @author Christian Schneider
 * @see <a href=https://bugs.eclipse.org/bugs/show_bug.cgi?id=486838>https://bugs.eclipse.org/bugs/show_bug.cgi?id=486838</a>
 */
class CompilerBug486838Test extends AbstractXtendCompilerTest {

	@Test
	def void testBug486838() {
		'''
			package bug486838
			
			class Foo {
				/**
				 * field
				 */
				unknownType field
			}
		'''.assertCompilesTo('''
			package bug486838;
			
			@SuppressWarnings("all")
			public class Foo {
			  /**
			   * field
			   */
			  private /* unknownType */Object field;
			}
		''')
	}
	
	override XtendFile file(String string, boolean validate) throws Exception {
		// suppress the validation here by ignoring 'validate'
		return file(string, false, true);
	}
}