package com.fix4mat2pojo.utility;

import java.util.MissingResourceException;
import java.util.ResourceBundle;

public class LocalProperties {
	private static final String BUNDLE_NAME = "local"; //$NON-NLS-1$

	private static final ResourceBundle RESOURCE_BUNDLE = ResourceBundle
			.getBundle(BUNDLE_NAME);

	private LocalProperties() {
	}

	public static String getString(String key) throws MissingResourceException {
		return RESOURCE_BUNDLE.getString(key);
	}
}
