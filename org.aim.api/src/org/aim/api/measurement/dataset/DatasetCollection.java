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
package org.aim.api.measurement.dataset;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.aim.api.measurement.AbstractRecord;

/**
 * Collection for wrapped datasets.
 * 
 * @author Alexander Wert
 * 
 */
public class DatasetCollection {
	private final List<Dataset> dataSets;

	/**
	 * Public default constructor.
	 */
	protected DatasetCollection(final List<Dataset> dataSets) {
		this.dataSets = dataSets;
	}

	/**
	 * 
	 * @return the list of datasets.
	 */
	public List<Dataset> getDataSets() {
		return dataSets;
	}

	/**
	 * Provides a sublist of all dataSets which match the passed dataSet type.
	 * 
	 * @param <T>
	 *            desired dataSets type
	 * @param type
	 *            class of the desired dataSets type
	 * @return a list of datasets matching the passed type
	 * 
	 */
	public <T extends AbstractRecord> List<Dataset> getDataSets(Class<T> type) {
		List<Dataset> result = new ArrayList<Dataset>();
		for (Dataset ds : dataSets) {
			if (ds.getRecordType().equals(type)) {
				result.add(ds);
			}
		}
		return result;
	}

	/**
	 * Returns the first dasaset found for the given record type.
	 * 
	 * @param <T>
	 *            desired dataSets type
	 * @param type
	 *            class of the desired dataSets type
	 * @return first dataset for the given type, or null if no dataset exists
	 *         for that type
	 * 
	 */
	public <T extends AbstractRecord> Dataset getDataSet(Class<T> type) {
		for (Dataset ds : dataSets) {
			if (ds.getRecordType().equals(type)) {
				return ds;
			}
		}
		return null;
	}

	/**
	 * 
	 * @return set of classes representing the different dataSet types contained
	 *         in this measurement data collection
	 */
	public Set<Class<? extends AbstractRecord>> getDifferentRecordTypes() {
		Set<Class<? extends AbstractRecord>> recordClasses = new HashSet<Class<? extends AbstractRecord>>();
		for (Dataset ds : dataSets) {
			recordClasses.add(ds.getRecordType());
		}
		return recordClasses;
	}

	/**
	 * 
	 * @return number of actual records (AbstractRecords)
	 */
	public int size() {
		int size = 0;
		for (Dataset dataset : dataSets) {
			size += dataset.size();
		}
		return size;
	}

	/**
	 * 
	 * @return all record found in this collection
	 */
	public List<AbstractRecord> getRecords() {
		List<AbstractRecord> records = new ArrayList<>();
		for (Dataset dataset : dataSets) {
			records.addAll(dataset.getRecords());
		}
		return records;
	}

	/**
	 * 
	 * @return all rows found in all the datasets of this collection
	 */
	public List<DatasetRow> getRows() {
		List<DatasetRow> rows = new ArrayList<>();
		for (Dataset dataset : dataSets) {
			rows.addAll(dataset.getRows());
		}
		return rows;
	}
}
