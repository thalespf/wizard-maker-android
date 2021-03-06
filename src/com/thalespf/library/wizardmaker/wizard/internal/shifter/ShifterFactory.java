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
package com.thalespf.library.wizardmaker.wizard.internal.shifter;

import com.thalespf.library.wizardmaker.wizard.IWizard;
import com.thalespf.library.wizardmaker.wizard.internal.WizardContainer.WizardContainerController;

/**
 * @author Thales Ferreira / l.thales.x@gmail.com
 *
 */
public class ShifterFactory {

	/**
	 * @param shifterViewLocation
	 * @param controller 
	 * @return
	 */
	public static AbstractShifter createShifter(int shifterViewLocation, WizardContainerController controller) {
		if(shifterViewLocation == IWizard.VALUE__SHIFTER_VIEW_LOCATION_ABOVE) {
			return new ShifterTop(controller);
		} else if(shifterViewLocation == IWizard.VALUE__SHIFTER_VIEW_LOCATION_BELOW) {
			return new ShifterBottom(controller);
		}
		return null;
	}

}
