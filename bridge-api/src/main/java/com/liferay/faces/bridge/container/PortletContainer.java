/**
 * Copyright (c) 2000-2014 Liferay, Inc. All rights reserved.
 *
 * This library is free software; you can redistribute it and/or modify it under
 * the terms of the GNU Lesser General Public License as published by the Free
 * Software Foundation; either version 2.1 of the License, or (at your option)
 * any later version.
 *
 * This library is distributed in the hope that it will be useful, but WITHOUT
 * ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS
 * FOR A PARTICULAR PURPOSE. See the GNU Lesser General Public License for more
 * details.
 */
package com.liferay.faces.bridge.container;

import java.io.IOException;
import java.net.MalformedURLException;
import java.util.List;
import java.util.Map;

import javax.portlet.EventRequest;
import javax.portlet.EventResponse;
import javax.portlet.MimeResponse;
import javax.portlet.PortletURL;
import javax.portlet.ResourceURL;


/**
 * @author  Neil Griffin
 */
public interface PortletContainer {

	/**
	 * Creates a portlet action URL and copies query parameters that might be present in the specified URL.
	 *
	 * @param   fromURL  The URL to copy from.
	 *
	 * @return  The resulting portlet action URL.
	 *
	 * @throws  MalformedURLException
	 */
	public PortletURL createActionURL(String fromURL) throws MalformedURLException;

	/**
	 * Creates a portlet resource URL that is suitable for partial requests (Ajax).
	 *
	 * @param   fromURL  The URL to copy from.
	 *
	 * @return  The resulting partial action resource URL.
	 *
	 * @throws  MalformedURLException
	 */
	public ResourceURL createPartialActionURL(String fromURL) throws MalformedURLException;

	/**
	 * Creates a portlet redirect URL and copies query parameters that might be present in the specified URL.
	 *
	 * @param   fromURL  The URL to copy from.
	 *
	 * @return  The resulting portlet action URL.
	 *
	 * @throws  MalformedURLException
	 */
	public PortletURL createRedirectURL(String fromURL, Map<String, List<String>> parameters)
		throws MalformedURLException;

	/**
	 * Creates a portlet render URL and copies query parameters that might be present in the specified URL.
	 *
	 * @param   fromURL  The URL to copy from.
	 *
	 * @return  The resulting portlet action URL.
	 *
	 * @throws  MalformedURLException
	 */
	public PortletURL createRenderURL(String fromURL) throws MalformedURLException;

	/**
	 * Creates a portlet resource URL and copies the javax.faces.resource value and query parameters that might be
	 * present in the specified URL.
	 *
	 * @param   fromURL  The URL to copy from. Example expected value:
	 *                   /portlet-context-path/*\/javax.faces.resource/jsf.js?ln=javax.faces
	 *
	 * @return  The resulting portlet resource URL.
	 *
	 * @throws  MalformedURLException
	 */
	public ResourceURL createResourceURL(String fromURL) throws MalformedURLException;

	/**
	 * Maintains (copies) the render parameters found in the specified EventRequest to the specified EventResponse.
	 */
	public void maintainRenderParameters(EventRequest eventRequest, EventResponse eventResponse);

	/**
	 * @deprecated  <p>Replaced by calling the {@link javax.portlet.ActionResponse#sendRedirect(String)} method on the
	 *              object returned by {@link
	 *              com.liferay.faces.bridge.filter.BridgePortletResponseFactory#getActionResponse(javax.portlet.ActionResponse)
	 *              }</p>
	 *
	 *              <p>Delegates to the underlying ActionResponse to perform a redirect to the specified URL.</p>
	 */
	@Deprecated
	public void redirect(String url) throws IOException;

	/**
	 * Returns the value of the header with the specified name from the underlying HttpServletRequest.
	 */
	public String[] getHeader(String name);

	/**
	 * Returns the value of the specified header name from the HttpServletRequest that is wrapped by the current
	 * PortletRequest.
	 */
	public long getHttpServletRequestDateHeader(String name);

	/**
	 * Layer of abstraction over the {@link MimeResponse#setContentType(String)} method.
	 *
	 * @param  contentType  The contentType that is to be set on the specified MimeResponse.
	 */
	public void setMimeResponseContentType(MimeResponse mimeResponse, String contentType);

	/**
	 * Gets the query string part of the URL requested by the user-agent (browser) by getting the attribute named
	 * "javax.servlet.forward.query_string" from the request.
	 *
	 * @return  The query_string part of the URL requested by the user-agent (browser).
	 */
	public String getRequestQueryString();

	/**
	 * Returns the URL requested by the user-agent (browser).
	 */
	public String getRequestURL();
}
