package org.vaadin.tunis.VaadinCommunityApp.ui;

import java.util.Iterator;

import meetup.Member;

import org.vaadin.tunis.VaadinCommunityApp.services.MemberService;

import com.vaadin.addon.touchkit.ui.NavigationView;
import com.vaadin.addon.touchkit.ui.VerticalComponentGroup;
import com.vaadin.data.Property;
import com.vaadin.data.util.BeanItem;
import com.vaadin.data.util.BeanItemContainer;
import com.vaadin.server.ExternalResource;
import com.vaadin.ui.Alignment;
import com.vaadin.ui.Embedded;
import com.vaadin.ui.GridLayout;
import com.vaadin.ui.Label;
import com.vaadin.ui.Table;
import com.vaadin.ui.Table.RowHeaderMode;
import com.vaadin.ui.VerticalLayout;

@SuppressWarnings("serial")
public class MembersView extends NavigationView {
	public MembersView() {
		setCaption("List of Members");
		final VerticalComponentGroup content = new VerticalComponentGroup();
		content.setSizeFull();

		MemberService.getMembersByGroupUrlName("Vaadin-Tunis");

		Table table = new Table();
//		table.add
		table.setVisibleColumns(new String[] { "photoUrl", "name" });
		table.setRowHeaderMode(RowHeaderMode.HIDDEN);

		content.addComponent(table);

		setContent(content);

	}
}
