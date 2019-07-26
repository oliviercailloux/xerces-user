package io.github.oliviercailloux;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.w3c.dom.bootstrap.DOMImplementationRegistry;
import org.w3c.dom.ls.DOMImplementationLS;
import org.w3c.dom.ls.LSSerializer;

public class XercesUser {
	@SuppressWarnings("unused")
	private static final Logger LOGGER = LoggerFactory.getLogger(XercesUser.class);

	public static void main(String[] args) throws Exception {
		DOMImplementationRegistry registry = DOMImplementationRegistry.newInstance();
		DOMImplementationLS impl = (DOMImplementationLS) registry.getDOMImplementation("LS");
		LSSerializer ser = impl.createLSSerializer();
		LOGGER.info("Serializer type: {}.", ser.getClass());
	}
}
