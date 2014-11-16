package org.vaadin.tunis.VaadinCommunityApp.ui;

import java.util.Collection;

import meetup.Member;

import com.vaadin.data.util.BeanItemContainer;

public class MemberBeanItem extends BeanItemContainer<Member> {

	public MemberBeanItem(Class<? super Member> type)
			throws IllegalArgumentException {
		super(type);
	}

	@Override
	public void addAll(Collection<? extends Member> collection) {
		super.addAll(collection);
	}

}
