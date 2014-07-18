package cn.guoyukun.soapui;

import org.apache.xmlbeans.XmlException;

import com.eviware.soapui.model.iface.MessageExchange;
import com.eviware.soapui.model.propertyexpansion.PropertyExpansionContext;
import com.eviware.soapui.support.XmlHolder;

public class SoapuiUtil {

	public static void put(PropertyExpansionContext context, String key, Object value){
		context.setProperty(key, value);
	}
	
	public static Object get(PropertyExpansionContext context, String key){
		return context.getProperty(key);
	}
	
	public static XmlHolder responseXmlHolder(MessageExchange messageExchange) throws XmlException{
		String responseContent = messageExchange.getResponseContentAsXml();
		return new XmlHolder(responseContent);
	}
	
	public static XmlHolder requestXmlHolder(MessageExchange messageExchange) throws XmlException{
		String requestContent = messageExchange.getRequestContentAsXml();
		return new XmlHolder(requestContent);
	}
	
}
