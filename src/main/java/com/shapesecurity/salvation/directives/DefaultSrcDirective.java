package com.shapesecurity.salvation.directives;

import com.shapesecurity.salvation.directiveValues.SourceExpression;

import javax.annotation.Nonnull;
import java.util.Set;

public class DefaultSrcDirective extends FetchDirective {
	@Nonnull
	private static final String name = "default-src";

	public DefaultSrcDirective(@Nonnull Set<SourceExpression> sourceExpressions) {
		super(DefaultSrcDirective.name, sourceExpressions);
	}

	@Nonnull
	@Override
	public Directive<SourceExpression> construct(Set<SourceExpression> newValues) {
		return new DefaultSrcDirective(newValues);
	}
}
