package org.rapidoid.goodies;

/*
 * #%L
 * rapidoid-web
 * %%
 * Copyright (C) 2014 - 2016 Nikolche Mihajlovski and contributors
 * %%
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * 
 *      http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 * #L%
 */

import org.rapidoid.annotation.Authors;
import org.rapidoid.annotation.Since;
import org.rapidoid.commons.TimeSeries;
import org.rapidoid.gui.GUI;
import org.rapidoid.html.Tag;
import org.rapidoid.insight.Metrics;
import org.rapidoid.u.U;

import java.util.List;
import java.util.Map;
import java.util.concurrent.Callable;

@Authors("Nikolche Mihajlovski")
@Since("5.1.0")
public class GraphsHandler extends GUI implements Callable<Object> {

	@Override
	public Object call() throws Exception {
		List<Tag> rows = U.list();
		Map<String, TimeSeries> metrics = Metrics.all();

		synchronized (metrics) {
			for (List<Map.Entry<String, TimeSeries>> group : U.groupsOf(2, metrics.entrySet())) {
				Tag row = row();

				for (Map.Entry<String, TimeSeries> e : group) {
					String uri = e.getKey();
					TimeSeries ts = e.getValue();
					row = row.append(col6(dygraph(uri, ts)));
				}

				rows.add(row);
			}
		}

		return multi(rows.toArray());
	}

}