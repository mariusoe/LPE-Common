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
package org.aim.artifacts.records;

import org.aim.api.measurement.AbstractRecord;
import org.aim.api.measurement.RecordValue;

/**
 * Records for monitoring waiting times, like monitor waits.
 * 
 * @author Henning Schulz
 * 
 */
public class WaitingTimeRecord extends AbstractRecord {

	/**
	 * 
	 */
	private static final long serialVersionUID = 8172433493460433334L;

	public static final String PAR_WAITING_TIME = "waitingTime";

	public static final String PAR_LOCATION = "monitorClass";

	public static final String PAR_MONITOR_HASH_CODE = "monitorHashCode";

	/**
	 * Default constructor required for programmatic instantiation.
	 */
	public WaitingTimeRecord() {
		super();
	}

	/**
	 * Constructor.
	 * 
	 * @param timestamp
	 *            timestamp of record
	 * @param location
	 *            location of the monitor
	 * @param waitingTime
	 *            timespan the thread had to wait
	 */
	public WaitingTimeRecord(long timestamp, String location, long waitingTime) {
		super(timestamp);
		this.location = location;
		this.waitingTime = waitingTime;
	}

	@RecordValue(name = PAR_LOCATION)
	String location;

	@RecordValue(name = PAR_WAITING_TIME)
	long waitingTime;

	/**
	 * @return the monitorClass
	 */
	public String getLocation() {
		return location;
	}

	/**
	 * @param location
	 *            the monitorClass to set
	 */
	public void setLocation(String location) {
		this.location = location;
	}

	/**
	 * @return the waitingTime
	 */
	public long getWaitingTime() {
		return waitingTime;
	}

	/**
	 * @param waitingTime
	 *            the waitingTime to set
	 */
	public void setWaitingTime(long waitingTime) {
		this.waitingTime = waitingTime;
	}

}
