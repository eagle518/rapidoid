package org.rapidoid.widget;

/*
 * #%L
 * rapidoid-widget
 * %%
 * Copyright (C) 2014 - 2015 Nikolche Mihajlovski
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

import java.io.File;
import java.io.OutputStream;
import java.nio.ByteBuffer;
import java.util.Map;

import org.rapidoid.annotation.Authors;
import org.rapidoid.annotation.Since;
import org.rapidoid.http.HttpExchange;
import org.rapidoid.http.HttpExchangeBody;
import org.rapidoid.http.HttpExchangeHeaders;
import org.rapidoid.http.HttpHeader;
import org.rapidoid.http.HttpNotFoundException;
import org.rapidoid.http.HttpSuccessException;
import org.rapidoid.mime.MediaType;

@Authors("Nikolche Mihajlovski")
@Since("2.3.0")
public class MockHttpExchange implements HttpExchange {

	@Override
	public HttpExchangeHeaders startResponse(int httpResponseCode) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public HttpExchangeHeaders response(int httpResponseCode) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public HttpExchangeHeaders response(int httpResponseCode, String response) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public HttpExchangeHeaders response(int httpResponseCode, String response, Throwable err) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public HttpExchangeHeaders errorResponse(Throwable err) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public HttpNotFoundException notFound() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public HttpSuccessException error() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public HttpExchangeHeaders plain() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public HttpExchangeHeaders html() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public HttpExchangeHeaders json() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public HttpExchangeHeaders binary() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public HttpExchangeHeaders download(String filename) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public HttpExchangeHeaders addHeader(byte[] name, byte[] value) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public HttpExchangeHeaders addHeader(HttpHeader name, String value) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public HttpExchangeHeaders setCookie(String name, String value, String... extras) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public HttpExchangeBody setContentType(MediaType contentType) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public HttpExchangeHeaders accessDeniedIf(boolean accessDeniedCondition) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public HttpExchangeHeaders authorize(Class<?> clazz) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int responseCode() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public String redirectUrl() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean serveStatic() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public HttpExchangeBody sendFile(File file) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public HttpExchangeBody sendFile(MediaType mediaType, byte[] bytes) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public HttpSuccessException redirect(String url) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public HttpSuccessException goBack(int steps) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public HttpExchangeBody addToPageStack() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public OutputStream outputStream() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public HttpExchangeBody write(String s) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public HttpExchangeBody writeln(String s) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public HttpExchangeBody write(byte[] bytes) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public HttpExchangeBody write(byte[] bytes, int offset, int length) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public HttpExchangeBody write(ByteBuffer buf) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public HttpExchangeBody write(File file) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public HttpExchangeBody writeJSON(Object value) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public HttpExchangeBody send() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public HttpExchangeBody async() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public HttpExchangeBody done() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String verb() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String uri() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String path() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String subpath() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String query() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String protocol() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String body() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String host() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Map<String, String> params() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String param(String name) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String param(String name, String defaultValue) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Map<String, String> headers() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String header(String name) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String header(String name, String defaultValue) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Map<String, String> cookies() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String cookie(String name) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String cookie(String name, String defaultValue) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Map<String, String> data() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String data(String name) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String data(String name, String defaultValue) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Map<String, byte[]> files() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public byte[] file(String name) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public byte[] file(String name, byte[] defaultValue) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Map<String, Object> session() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Map<String, Object> getSessionById(String sessionId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public <T> T session(String name) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public <T> T session(String name, T defaultValue) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void sessionSet(String name, Object value) {
		// TODO Auto-generated method stub

	}

	@Override
	public <T> T sessionGetOrCreate(String name, Class<T> valueClass, Object... constructorArgs) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String sessionId() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void closeSession() {
		// TODO Auto-generated method stub

	}

	@Override
	public void clearSession(String sessionId) {
		// TODO Auto-generated method stub

	}

	@Override
	public boolean hasSession() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean hasSession(String sessionId) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public String pathSegment(int segmentIndex) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean isGetReq() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean isPostReq() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public String constructUrl(String path) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public byte[] sessionSerialize() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void sessionDeserialize(byte[] bytes) {
		// TODO Auto-generated method stub

	}

	@Override
	public <T> T extra(Object key) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void extra(Object key, Object value) {
		// TODO Auto-generated method stub

	}

}