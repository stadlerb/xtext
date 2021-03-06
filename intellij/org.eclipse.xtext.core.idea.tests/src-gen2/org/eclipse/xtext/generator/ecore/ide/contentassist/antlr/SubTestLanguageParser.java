/*
 * generated by Xtext
 */
package org.eclipse.xtext.generator.ecore.ide.contentassist.antlr;

import com.google.inject.Inject;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import org.antlr.runtime.RecognitionException;
import org.eclipse.xtext.AbstractElement;
import org.eclipse.xtext.generator.ecore.ide.contentassist.antlr.internal.InternalSubTestLanguageParser;
import org.eclipse.xtext.generator.ecore.services.SubTestLanguageGrammarAccess;
import org.eclipse.xtext.ide.editor.contentassist.antlr.AbstractContentAssistParser;
import org.eclipse.xtext.ide.editor.contentassist.antlr.FollowElement;
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.AbstractInternalContentAssistParser;

public class SubTestLanguageParser extends AbstractContentAssistParser {

	@Inject
	private SubTestLanguageGrammarAccess grammarAccess;

	private Map<AbstractElement, String> nameMappings;

	@Override
	protected InternalSubTestLanguageParser createParser() {
		InternalSubTestLanguageParser result = new InternalSubTestLanguageParser(null);
		result.setGrammarAccess(grammarAccess);
		return result;
	}

	@Override
	protected String getRuleName(AbstractElement element) {
		if (nameMappings == null) {
			nameMappings = new HashMap<AbstractElement, String>() {
				private static final long serialVersionUID = 1L;
				{
					put(grammarAccess.getSubMainAccess().getGroup(), "rule__SubMain__Group__0");
					put(grammarAccess.getAnotherSuperMainAccess().getGroup(), "rule__AnotherSuperMain__Group__0");
					put(grammarAccess.getSuperMainAccess().getGroup(), "rule__SuperMain__Group__0");
					put(grammarAccess.getSubMainAccess().getSuperMainsAssignment_1(), "rule__SubMain__SuperMainsAssignment_1");
					put(grammarAccess.getSubMainAccess().getAnotherAssignment_3(), "rule__SubMain__AnotherAssignment_3");
					put(grammarAccess.getAnotherSuperMainAccess().getNameAssignment_1(), "rule__AnotherSuperMain__NameAssignment_1");
					put(grammarAccess.getSuperMainAccess().getNameAssignment_1(), "rule__SuperMain__NameAssignment_1");
				}
			};
		}
		return nameMappings.get(element);
	}

	@Override
	protected Collection<FollowElement> getFollowElements(AbstractInternalContentAssistParser parser) {
		try {
			InternalSubTestLanguageParser typedParser = (InternalSubTestLanguageParser) parser;
			typedParser.entryRuleSubMain();
			return typedParser.getFollowElements();
		} catch(RecognitionException ex) {
			throw new RuntimeException(ex);
		}
	}

	@Override
	protected String[] getInitialHiddenTokens() {
		return new String[] { "RULE_WS", "RULE_ML_COMMENT", "RULE_SL_COMMENT" };
	}

	public SubTestLanguageGrammarAccess getGrammarAccess() {
		return this.grammarAccess;
	}

	public void setGrammarAccess(SubTestLanguageGrammarAccess grammarAccess) {
		this.grammarAccess = grammarAccess;
	}
}
