package com.gitplex.web.component.depotselector;

import java.util.List;

import org.apache.wicket.markup.head.CssHeaderItem;
import org.apache.wicket.markup.head.HeaderItem;
import org.apache.wicket.markup.head.JavaScriptHeaderItem;
import org.apache.wicket.request.resource.CssResourceReference;

import com.gitplex.web.page.base.BaseDependentResourceReference;
import com.gitplex.commons.wicket.assets.hotkeys.HotkeysResourceReference;
import com.gitplex.commons.wicket.assets.scrollintoview.ScrollIntoViewResourceReference;

public class DepotSelectorResourceReference extends BaseDependentResourceReference {

	private static final long serialVersionUID = 1L;

	public DepotSelectorResourceReference() {
		super(DepotSelectorResourceReference.class, "depot-selector.js");
	}

	@Override
	public List<HeaderItem> getDependencies() {
		List<HeaderItem> dependencies = super.getDependencies();
		dependencies.add(JavaScriptHeaderItem.forReference(new HotkeysResourceReference()));
		dependencies.add(JavaScriptHeaderItem.forReference(new ScrollIntoViewResourceReference()));
		dependencies.add(CssHeaderItem.forReference(new CssResourceReference(DepotSelectorResourceReference.class, "depot-selector.css")));
		return dependencies;
	}

}