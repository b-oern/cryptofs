/*******************************************************************************
 * Copyright (c) 2016 Sebastian Stenzel and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the accompanying LICENSE.txt.
 *
 * Contributors:
 *     Sebastian Stenzel - initial API and implementation
 *******************************************************************************/
package org.cryptomator.cryptofs;

import java.nio.file.Path;
import java.nio.file.attribute.BasicFileAttributeView;
import java.nio.file.attribute.BasicFileAttributes;

class CryptoBasicFileAttributeView extends AbstractCryptoFileAttributeView<BasicFileAttributes, BasicFileAttributeView> implements BasicFileAttributeView {

	public CryptoBasicFileAttributeView(Path ciphertextPath, CryptoFileAttributeProvider fileAttributeProvider) throws UnsupportedFileAttributeViewException {
		super(ciphertextPath, fileAttributeProvider, BasicFileAttributes.class, BasicFileAttributeView.class);
	}

	@Override
	public String name() {
		return "basic";
	}

}
