package com.example.demorest.Controllers;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.*;
import java.net.URLConnection;

import javax.xml.bind.JAXB;
import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.stream.XMLInputFactory;
import javax.xml.stream.XMLStreamReader;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.stax.StAXSource;

//import javax.xml.bind.JAXBContext;
//import javax.xml.bind.JAXBException;
//import javax.xml.bind.Unmarshaller;

import java.net.*;

import org.json.JSONObject;
import org.json.XML;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demorest.Entity.ResponseMidUserDetails;

import jakarta.xml.soap.MessageFactory;
import jakarta.xml.soap.MimeHeaders;
import jakarta.xml.soap.SOAPMessage;

import com.example.demorest.Entity.InquireMidUserDetailsExport;


@RestController
@RequestMapping("/demorest")
public class HomeController {

	@GetMapping("/Welcome")
	public String greetUser() {
		return "Welcome User !!";
	}

//	@GetMapping("/MidUserDetails/{civilId}")
//	public String printData(@PathVariable String civilId){
	@GetMapping("/MidUserDetails")
	public ResponseMidUserDetails printData() {
//		MidUserDetails data = new MidUserDetails(civilId,"Male",55674445, "as@gmail.com","sam","A");
//		return data;
		String xml = "<soapenv:Envelope xmlns:soapenv=\"http://schemas.xmlsoap.org/soap/envelope/\" xmlns:inq=\"http://tempuri.org/InquireMidUserDetails/\">\r\n"
				+ "   <soapenv:Header/>\r\n" + "   <soapenv:Body>\r\n" + "      <inq:InquireMidUserDetailscall>\r\n"
				+ "         <!--Optional:-->\r\n"
				+ "         <InquireMidUserDetailsImport command=\"?\" clientId=\"?\" clientPassword=\"?\" nextLocation=\"?\" exitState=\"0\" dialect=\"?\">\r\n"
				+ "            <!--Optional:-->\r\n" + "            <RequestMidUserDetails>\r\n"
				+ "               <!--Optional:-->\r\n"
				+ "               <CivilIdNumber>285063000886</CivilIdNumber>\r\n"
				+ "            </RequestMidUserDetails>\r\n" + "         </InquireMidUserDetailsImport>\r\n"
				+ "      </inq:InquireMidUserDetailscall>\r\n" + "   </soapenv:Body>\r\n" + "</soapenv:Envelope>";

		return ConsumeSOAPService(xml);

	}

	public ResponseMidUserDetails ConsumeSOAPService(String xmlRequest) {
		String Result = null;
//        OutputStream outputStream =null;
//        InputStream inputStream =null;
		try {
			/* Creating Connection to SOAP url */
//            URL url = new URL("http://10.10.1.1:29081/SH003/INQUIRE_MID_USER_DETAILS?wsdl");
//            URLConnection conn = url.openConnection();
//            if(null !=conn ) {
//            conn.setDoOutput(true);
//            conn.setRequestProperty("Content-Type", "text/xml; charset=utf-8");
//            /*Send the soap request*/
//            outputStream = conn.getOutputStream();
//            outputStream.write(xmlRequest.getBytes());
//            outputStream.close();
//            /* Read the soap response */
//            inputStream = conn.getInputStream();
//            java.util.Scanner s = new java.util.Scanner(inputStream).useDelimiter("\\A");
//            Result =  s.hasNext() ? s.next() : "";
//            inputStream.close();
//        	
//            }

			//Result = getResponseFromFile();
			return getJavaObjectFromSoapXml();
			
		
		} catch (Exception e) {

			e.printStackTrace();
		}
		return null;
	}
	
	private String formatToJson(String Result) {
		JSONObject soapJsonObject = null;
		if (null != Result && !Result.isEmpty()) {
			soapJsonObject = XML.toJSONObject(Result);
			System.out.println(soapJsonObject);
			return showDetails(soapJsonObject);
		}
		return null;
	}
	private String showDetails(JSONObject data) {
		//civil id and return(Gender, MobileNumber, and EmailId) in json format as response (only if value of NationalityEn is "KUWAIT")
				//otherwise, if any other nationalities return (FullNameEn and BloodGroup).

		return data.toString();
	}
	private String getResponseFromFile() throws IOException {
		String Result = null;
		InputStream inputStream = new FileInputStream(
				new File("C:\\work\\MOI\\demo\\src\\main\\resources\\xml\\soapResponse.xml"));
		java.util.Scanner s = new java.util.Scanner(inputStream).useDelimiter("\\A");
		Result = s.hasNext() ? s.next() : "";
		inputStream.close();
		return Result;
	}
	public ResponseMidUserDetails getJavaObjectFromSoapXml() {
        try {

        	XMLInputFactory xif = XMLInputFactory.newFactory();
            XMLStreamReader xsr = xif.createXMLStreamReader(new FileReader("C:\\work\\MOI\\demo\\src\\main\\resources\\xml\\soapResponse.xml"));
            xsr.nextTag(); // Advance to Envelope tag

            xsr.nextTag();

            JAXBContext jc = JAXBContext.newInstance(ResponseMidUserDetails.class);
            Unmarshaller unmarshaller = jc.createUnmarshaller();
            JAXBElement<ResponseMidUserDetails> je = unmarshaller.unmarshal(xsr, ResponseMidUserDetails.class);
            ResponseMidUserDetails userdetails = je.getValue();
        	return userdetails;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }
	
}
