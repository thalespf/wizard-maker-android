/*
 * Copyright 2013 Thales Ferreira
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.thalespf.library.wizardmaker.wizard.internal.ui;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.thalespf.library.wizardmaker.wizard.IWizardPage;

/**
 * @author Thales Ferreira / l.thales.x@gmail.com
 *
 */
public class LayoutPageFragment extends AbstractPageFragment {

	protected int layoutPage;
	
	/**
	 * @param layoutPage
	 * @param page 
	 */
	public LayoutPageFragment(IWizardPage page, int layoutPage) {
		super(page);
		this.layoutPage = layoutPage;
	}

	/** (non-Javadoc)
	 * @see com.thalespf.library.wizardmaker.wizard.internal.ui.AbstractPageFragment#onCreateView(android.view.LayoutInflater, android.view.ViewGroup, android.os.Bundle)
	 */
	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container,
			Bundle savedInstanceState) {
		View rootView = inflater.inflate(layoutPage, container, false);
		//offer page to cooperate with the view
		page.onCreateView(inflater, rootView);
		return rootView;
	}

}
