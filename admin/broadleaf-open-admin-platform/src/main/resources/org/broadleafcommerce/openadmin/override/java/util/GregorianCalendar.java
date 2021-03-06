/*
 * Copyright 2008-2012 the original author or authors.
 *
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
 */

package java.util;

/**
 * A simple, GWT compatible version of GregorianCalendar
 * 
 * @author jfischer
 *
 */
public class GregorianCalendar extends Calendar {

	private static final long serialVersionUID = 1L;

	public GregorianCalendar() {
		super();
	}

	public GregorianCalendar(int year, int month, int dayOfMonth, int hourOfDay, int minute, int second) {
		super();
		set(year, month, dayOfMonth, hourOfDay, minute, second);
	}

	public GregorianCalendar(int year, int month, int dayOfMonth, int hourOfDay, int minute) {
		super();
		set(year, month, dayOfMonth, hourOfDay, minute);
	}

	public GregorianCalendar(int year, int month, int dayOfMonth) {
		super();
		set(year, month, dayOfMonth);
	}

/*	public GregorianCalendar(Locale aLocale) {
		throw new RuntimeException("Not Supported");
	}

	public GregorianCalendar(TimeZone zone, Locale aLocale) {
		throw new RuntimeException("Not Supported");
	}

	public GregorianCalendar(TimeZone zone) {
		throw new RuntimeException("Not Supported");
	}*/
	
}
