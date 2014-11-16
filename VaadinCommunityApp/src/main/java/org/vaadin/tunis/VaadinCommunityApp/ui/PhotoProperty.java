package org.vaadin.tunis.VaadinCommunityApp.ui;

import com.vaadin.data.Property;
import com.vaadin.ui.Embedded;

public class PhotoProperty implements Property {
	Embedded data = null;
	boolean readOnly = false;

	@Override
	public Object getValue() {
		return data;
	}

	@Override
	public void setValue(Object newValue) throws ReadOnlyException {
		if(!readOnly)
		{
			data = (Embedded) newValue;
		}
		else {
			throw new ReadOnlyException();
		}

	}

	@Override
	public Class getType() {
		return Embedded.class;
	}

	@Override
	public boolean isReadOnly() {
		return readOnly;
	}

	@Override
	public void setReadOnly(boolean newStatus) {
		readOnly = newStatus;

	}

}
