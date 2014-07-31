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
package org.aim.mainagent.service;

import org.aim.api.measurement.collector.AbstractDataSource;
import org.aim.api.measurement.collector.IDataCollector;
import org.aim.mainagent.sampling.Sampling;
import org.glassfish.grizzly.http.server.Request;
import org.glassfish.grizzly.http.server.Response;

/**
 * Disables data collection.
 * 
 * @author Alexander Wert
 * 
 */
public class DisableMeasurementServlet implements Service {
	@Override
	public void doService(Request req, Response resp) throws Exception {
		IDataCollector collector =	AbstractDataSource.getDefaultDataSource();

		collector.disable();
		Sampling.getInstance().stop();

	}
}
