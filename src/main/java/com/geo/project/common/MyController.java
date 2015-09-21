package com.geo.project.common;

import java.net.URI;

import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.web.util.UriTemplate;

public class MyController {
	
	protected HttpEntity<String> entityWithLocation(StringBuffer url,	Object resourceId) {
		// Configure and return an HttpEntity object - it will be used to build
		// the HttpServletResponse
		HttpHeaders headers = new HttpHeaders();
		headers.setLocation(getLocationForChildResource(url, resourceId));
		return new HttpEntity<String>(headers);
	}

	/**
	 * determines URL of child resource based on the full URL of the given
	 * request, appending the path info with the given childIdentifier using a
	 * UriTemplate.
	 */
	private URI getLocationForChildResource(StringBuffer url,
			Object childIdentifier) {
		UriTemplate template = new UriTemplate(url.append("/{childId}")
				.toString());
		return template.expand(childIdentifier);
	}
}
