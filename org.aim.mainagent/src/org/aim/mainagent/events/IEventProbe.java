/**
 * Copyright 2014 SAP AG
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
package org.aim.mainagent.events;

/**
 * Common interface for event probes.
 * 
 * @author Alexander Wert
 * 
 */
public interface IEventProbe {

	/**
	 * Code to execute at the occurrence of first event of the event pair.
	 */
	void beforePart();

	/**
	 * Code to execute at the occurrence of second event of the event pair.
	 */
	void afterPart();

}
